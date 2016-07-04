package org.mindmap.ui.diagram.conceptsDiagram.custom;


import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.emfstore.client.changetracking.ESCommandObserver;
import org.eclipse.emf.emfstore.client.changetracking.ESCommandStack;
import org.eclipse.emf.emfstore.internal.client.model.ESWorkspaceProviderImpl;
import org.eclipse.emf.emfstore.internal.client.model.changeTracking.commands.EMFStoreCommandNotifier;
import org.eclipse.emf.emfstore.internal.client.model.util.AbstractEMFStoreCommand;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.impl.TransactionalCommandStackImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;



public class EMFStoreTransactionalCommandStack extends TransactionalCommandStackImpl implements ESCommandStack {

	private Command currentCommand;
	private EMFStoreCommandNotifier notifier;

	/**
	 * Dafault Constructor.
	 */
	public EMFStoreTransactionalCommandStack() {
		notifier = new EMFStoreCommandNotifier();
	}

	@Override
	public void execute(final Command command) {
		// EMFStore  
		if (command instanceof AbstractEMFStoreCommand) {
			runEMFStoreCommand((AbstractEMFStoreCommand) command);
			return;
		}
		super.execute(command);
		
	}

	private void runEMFStoreCommand(final AbstractEMFStoreCommand cmd) {

		//envolver EMFStoreCommand en RecordingCommands
		EditingDomain ed = ESWorkspaceProviderImpl.getInstance().getEditingDomain();
		
		RecordingCommand recordingCommand = new RecordingCommand((TransactionalEditingDomain) ed){
			@Override
			protected void doExecute() {
				cmd.execute();
			}
		};
		super.execute(recordingCommand);

		// lanzar runtime exception si es necesario
		if (!cmd.shouldIgnoreExceptions() && cmd.getRuntimeException() != null) {
			throw cmd.getRuntimeException();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.transaction.impl.AbstractTransactionalCommandStack#basicExecute(org.eclipse.emf.common.command.Command)
	 */
	@Override
	protected void basicExecute(Command command) {
		
		// Notificar que command va a comenzar
		// Comprobamos si estamos ya dentro de un command, sino-> notificar
		if (currentCommand == null) {
			currentCommand = command;
			notifier.notifiyListenersAboutStart(command);
		}

		try {
			super.basicExecute(command);
		} catch (OperationCanceledException e) {
			notifier.notifiyListenersAboutCommandFailed(command, e);
			this.currentCommand = null;
			throw e;
		}

		
		//Notificar que command está hecho
		//Comprobar que estamos al final del command más externo 
		if (currentCommand == command) {
			//Comprobar de nuevo si se ha completado
			if (mostRecentCommand == command) {
				notifier.notifiyListenersAboutCommandCompleted(command);
			}
			currentCommand = null;
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.transaction.impl.TransactionalCommandStackImpl#handleRollback(org.eclipse.emf.common.command.Command,
	 *      org.eclipse.emf.transaction.RollbackException)
	 */
	@Override
	protected void handleRollback(Command command, RollbackException rbe) {
		super.handleRollback(command, rbe);
		notifier.notifiyListenersAboutCommandFailed(command, (rbe.getCause() != null) ? (Exception) rbe.getCause()
			: rbe);

		if (currentCommand == command) {
			currentCommand = null;
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.emfstore.client.model.changeTracking.commands.EMFStoreCommandStack#addCommandStackObserver(org.eclipse.emf.emfstore.client.model.changeTracking.commands.CommandObserver)
	 */
	public void addCommandStackObserver(ESCommandObserver observer) {
		notifier.addCommandStackObserver(observer);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.emfstore.client.model.changeTracking.commands.EMFStoreCommandStack#removeCommandStackObserver(org.eclipse.emf.emfstore.client.model.changeTracking.commands.CommandObserver)
	 */
	public void removeCommandStackObserver(ESCommandObserver observer) {
		notifier.removeCommandStackObserver(observer);
	}
}

