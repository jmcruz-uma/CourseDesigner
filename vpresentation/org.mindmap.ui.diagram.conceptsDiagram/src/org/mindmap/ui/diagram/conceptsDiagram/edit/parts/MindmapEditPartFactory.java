package org.mindmap.ui.diagram.conceptsDiagram.edit.parts;

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
			switch (org.mindmap.ui.diagram.conceptsDiagram.part.MindmapVisualIDRegistry
					.getVisualID(view)) {

			case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptosDiagramEditPart.VISUAL_ID:
				return new org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptosDiagramEditPart(
						view);

			case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.TemaEditPart.VISUAL_ID:
				return new org.mindmap.ui.diagram.conceptsDiagram.edit.parts.TemaEditPart(
						view);

			case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.TemaNombreEditPart.VISUAL_ID:
				return new org.mindmap.ui.diagram.conceptsDiagram.edit.parts.TemaNombreEditPart(
						view);

			case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptoEditPart.VISUAL_ID:
				return new org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptoEditPart(
						view);

			case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptoNombreEditPart.VISUAL_ID:
				return new org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptoNombreEditPart(
						view);

			case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.AtributoEditPart.VISUAL_ID:
				return new org.mindmap.ui.diagram.conceptsDiagram.edit.parts.AtributoEditPart(
						view);

			case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.TemaBloqueCompartmentEditPart.VISUAL_ID:
				return new org.mindmap.ui.diagram.conceptsDiagram.edit.parts.TemaBloqueCompartmentEditPart(
						view);

			case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptoAtributoCompartmentEditPart.VISUAL_ID:
				return new org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptoAtributoCompartmentEditPart(
						view);

			case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceEsUnEditPart.VISUAL_ID:
				return new org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceEsUnEditPart(
						view);

			case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceEsUnEtiquetaEditPart.VISUAL_ID:
				return new org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceEsUnEtiquetaEditPart(
						view);

			case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaEditPart.VISUAL_ID:
				return new org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaEditPart(
						view);

			case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaEtiquetaEditPart.VISUAL_ID:
				return new org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaEtiquetaEditPart(
						view);

			case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaBloqueEditPart.VISUAL_ID:
				return new org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaBloqueEditPart(
						view);

			case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaBloqueEtiquetaEditPart.VISUAL_ID:
				return new org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaBloqueEtiquetaEditPart(
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
