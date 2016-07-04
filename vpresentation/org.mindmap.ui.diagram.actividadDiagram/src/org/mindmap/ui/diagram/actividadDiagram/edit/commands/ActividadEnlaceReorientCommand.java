package org.mindmap.ui.diagram.actividadDiagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.mindmap.model.ActividadEnlace;
import org.mindmap.model.ActividadNodo;
import org.mindmap.model.CursoDiagrama;

/**
 * @generated
 */
public class ActividadEnlaceReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public ActividadEnlaceReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof ActividadEnlace) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof ActividadNodo && newEnd instanceof ActividadNodo)) {
			return false;
		}
		ActividadNodo target = getLink().getDestino();
		if (!(getLink().eContainer() instanceof CursoDiagrama)) {
			return false;
		}
		CursoDiagrama container = (CursoDiagrama) getLink().eContainer();
		return org.mindmap.ui.diagram.actividadDiagram.edit.policies.MindmapBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistActividadEnlace_4001(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ActividadNodo && newEnd instanceof ActividadNodo)) {
			return false;
		}
		ActividadNodo source = getLink().getOrigen();
		if (!(getLink().eContainer() instanceof CursoDiagrama)) {
			return false;
		}
		CursoDiagrama container = (CursoDiagrama) getLink().eContainer();
		return org.mindmap.ui.diagram.actividadDiagram.edit.policies.MindmapBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistActividadEnlace_4001(container,
						getLink(), source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setOrigen(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setDestino(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected ActividadEnlace getLink() {
		return (ActividadEnlace) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected ActividadNodo getOldSource() {
		return (ActividadNodo) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ActividadNodo getNewSource() {
		return (ActividadNodo) newEnd;
	}

	/**
	 * @generated
	 */
	protected ActividadNodo getOldTarget() {
		return (ActividadNodo) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ActividadNodo getNewTarget() {
		return (ActividadNodo) newEnd;
	}
}
