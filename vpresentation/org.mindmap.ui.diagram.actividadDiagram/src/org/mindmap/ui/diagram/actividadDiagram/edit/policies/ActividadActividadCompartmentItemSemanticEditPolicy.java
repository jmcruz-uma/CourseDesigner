package org.mindmap.ui.diagram.actividadDiagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ActividadActividadCompartmentItemSemanticEditPolicy
		extends
		org.mindmap.ui.diagram.actividadDiagram.edit.policies.MindmapBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ActividadActividadCompartmentItemSemanticEditPolicy() {
		super(
				org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.Actividad_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.ActividadEspacio_3001 == req
				.getElementType()) {
			return getGEFWrapper(new org.mindmap.ui.diagram.actividadDiagram.edit.commands.ActividadEspacioCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
