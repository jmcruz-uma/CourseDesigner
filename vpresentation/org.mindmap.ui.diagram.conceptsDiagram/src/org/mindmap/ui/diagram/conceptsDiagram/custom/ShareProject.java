package org.mindmap.ui.diagram.conceptsDiagram.custom;

import java.util.Collections;
import java.util.concurrent.Callable;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecp.emfstore.core.internal.EMFStoreProvider;
import org.eclipse.emf.ecp.internal.wizards.ShareWizard;
import org.eclipse.emf.ecp.spi.core.InternalRepository;
import org.eclipse.emf.emfstore.client.ESLocalProject;
import org.eclipse.emf.emfstore.client.util.RunESCommand;
import org.eclipse.emf.emfstore.internal.client.model.Configuration;
import org.eclipse.emf.emfstore.internal.client.model.ServerInfo;
import org.eclipse.emf.emfstore.internal.client.model.impl.api.ESLocalProjectImpl;
import org.eclipse.emf.emfstore.internal.client.model.impl.api.ESServerImpl;
import org.eclipse.emf.emfstore.internal.client.ui.controller.UIShareProjectController;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.ProgressMonitorPart;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.mindmap.model.control.ProjectControl;

public class ShareProject extends AbstractHandler {
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		Shell shell = HandlerUtil.getActiveShell(event);
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		final ESLocalProject project = ProjectControl.actualproject;

		ProgressMonitorPart monitor = new ProgressMonitorPart(
				window.getShell(), new GridLayout());

		final ShareWizard rw = new ShareWizard();

		final WizardDialog wd = new WizardDialog(shell, rw);
		final int result = wd.open();

		if (result == Window.OK) {
			final InternalRepository repository = (InternalRepository) rw
					.getSelectedRepository();
			if (project.getUsersession() == null) {
				final ESServerImpl server = (ESServerImpl) EMFStoreProvider.INSTANCE
						.getServerInfo(repository);
				final ServerInfo serverInfo = server.toInternalAPI();
				RunESCommand.run(new Callable<Void>() {
					@Override
					public Void call() throws Exception {
						((ESLocalProjectImpl) project)
								.toInternalAPI()
								.setUsersession(serverInfo.getLastUsersession());
						return null;
					}
				});
			}

			new UIShareProjectController(shell, project).execute();

			repository.notifyObjectsChanged(Collections
					.singleton((Object) repository));

		}

		return null;
	}
}
