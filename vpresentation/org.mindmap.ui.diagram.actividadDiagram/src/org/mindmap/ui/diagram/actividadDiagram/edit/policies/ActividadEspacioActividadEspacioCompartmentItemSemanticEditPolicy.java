package org.mindmap.ui.diagram.actividadDiagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ActividadEspacioActividadEspacioCompartmentItemSemanticEditPolicy
		extends
		org.mindmap.ui.diagram.actividadDiagram.edit.policies.MindmapBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ActividadEspacioActividadEspacioCompartmentItemSemanticEditPolicy() {
		super(
				org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.ActividadEspacio_3001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.Tarea_3002 == req
				.getElementType()) {
			return getGEFWrapper(new org.mindmap.ui.diagram.actividadDiagram.edit.commands.TareaCreateCommand(
					req));
		}
		if (org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.Leccion_3003 == req
				.getElementType()) {
			return getGEFWrapper(new org.mindmap.ui.diagram.actividadDiagram.edit.commands.LeccionCreateCommand(
					req));
		}
		if (org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.Prueba_3004 == req
				.getElementType()) {
			return getGEFWrapper(new org.mindmap.ui.diagram.actividadDiagram.edit.commands.PruebaCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
