package org.mindmap.ui.diagram.actividadDiagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class MindmapEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (org.mindmap.ui.diagram.actividadDiagram.part.MindmapVisualIDRegistry
					.getVisualID(view)) {

			case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadDiagramaEditPart.VISUAL_ID:
				return new org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadDiagramaEditPart(
						view);

			case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadUnionBifurcacionEditPart.VISUAL_ID:
				return new org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadUnionBifurcacionEditPart(
						view);

			case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadNodoInicialEditPart.VISUAL_ID:
				return new org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadNodoInicialEditPart(
						view);

			case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEditPart.VISUAL_ID:
				return new org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEditPart(
						view);

			case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadNombreEditPart.VISUAL_ID:
				return new org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadNombreEditPart(
						view);

			case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadNodoFinalEditPart.VISUAL_ID:
				return new org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadNodoFinalEditPart(
						view);

			case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEspacioEditPart.VISUAL_ID:
				return new org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEspacioEditPart(
						view);

			case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEspacioNombreEditPart.VISUAL_ID:
				return new org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEspacioNombreEditPart(
						view);

			case org.mindmap.ui.diagram.actividadDiagram.edit.parts.TareaEditPart.VISUAL_ID:
				return new org.mindmap.ui.diagram.actividadDiagram.edit.parts.TareaEditPart(
						view);

			case org.mindmap.ui.diagram.actividadDiagram.edit.parts.TareaNombreEditPart.VISUAL_ID:
				return new org.mindmap.ui.diagram.actividadDiagram.edit.parts.TareaNombreEditPart(
						view);

			case org.mindmap.ui.diagram.actividadDiagram.edit.parts.LeccionEditPart.VISUAL_ID:
				return new org.mindmap.ui.diagram.actividadDiagram.edit.parts.LeccionEditPart(
						view);

			case org.mindmap.ui.diagram.actividadDiagram.edit.parts.LeccionNombreEditPart.VISUAL_ID:
				return new org.mindmap.ui.diagram.actividadDiagram.edit.parts.LeccionNombreEditPart(
						view);

			case org.mindmap.ui.diagram.actividadDiagram.edit.parts.PruebaEditPart.VISUAL_ID:
				return new org.mindmap.ui.diagram.actividadDiagram.edit.parts.PruebaEditPart(
						view);

			case org.mindmap.ui.diagram.actividadDiagram.edit.parts.PruebaNombreEditPart.VISUAL_ID:
				return new org.mindmap.ui.diagram.actividadDiagram.edit.parts.PruebaNombreEditPart(
						view);

			case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadActividadCompartmentEditPart.VISUAL_ID:
				return new org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadActividadCompartmentEditPart(
						view);

			case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEspacioActividadEspacioCompartmentEditPart.VISUAL_ID:
				return new org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEspacioActividadEspacioCompartmentEditPart(
						view);

			case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEnlaceEditPart.VISUAL_ID:
				return new org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEnlaceEditPart(
						view);

			case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEnlaceEtiquetaEditPart.VISUAL_ID:
				return new org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEnlaceEtiquetaEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
