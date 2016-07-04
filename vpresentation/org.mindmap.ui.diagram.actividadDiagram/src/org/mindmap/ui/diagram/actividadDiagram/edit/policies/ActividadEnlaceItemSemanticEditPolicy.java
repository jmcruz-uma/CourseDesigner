package org.mindmap.ui.diagram.actividadDiagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class ActividadEnlaceItemSemanticEditPolicy
		extends
		org.mindmap.ui.diagram.actividadDiagram.edit.policies.MindmapBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ActividadEnlaceItemSemanticEditPolicy() {
		super(
				org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.ActividadEnlace_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
