package org.mindmap.ui.diagram.conceptsDiagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;
import org.mindmap.model.ConceptosDiagrama;
import org.mindmap.model.ModelPackage;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class MindmapVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.mindmap.ui.diagram.conceptsDiagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptosDiagramEditPart.MODEL_ID
					.equals(view.getType())) {
				return org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptosDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.mindmap.ui.diagram.conceptsDiagram.part.MindmapVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				org.mindmap.ui.diagram.conceptsDiagram.part.ConceptsMindmapDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ModelPackage.eINSTANCE.getConceptosDiagrama().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((ConceptosDiagrama) domainElement)) {
			return org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptosDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = org.mindmap.ui.diagram.conceptsDiagram.part.MindmapVisualIDRegistry
				.getModelID(containerView);
		if (!org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptosDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptosDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = org.mindmap.ui.diagram.conceptsDiagram.part.MindmapVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptosDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptosDiagramEditPart.VISUAL_ID:
			if (ModelPackage.eINSTANCE.getTema().isSuperTypeOf(
					domainElement.eClass())) {
				return org.mindmap.ui.diagram.conceptsDiagram.edit.parts.TemaEditPart.VISUAL_ID;
			}
			break;
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.TemaBloqueCompartmentEditPart.VISUAL_ID:
			if (ModelPackage.eINSTANCE.getConcepto().isSuperTypeOf(
					domainElement.eClass())) {
				return org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptoEditPart.VISUAL_ID;
			}
			break;
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptoAtributoCompartmentEditPart.VISUAL_ID:
			if (ModelPackage.eINSTANCE.getAtributo().isSuperTypeOf(
					domainElement.eClass())) {
				return org.mindmap.ui.diagram.conceptsDiagram.edit.parts.AtributoEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.mindmap.ui.diagram.conceptsDiagram.part.MindmapVisualIDRegistry
				.getModelID(containerView);
		if (!org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptosDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptosDiagramEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = org.mindmap.ui.diagram.conceptsDiagram.part.MindmapVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptosDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptosDiagramEditPart.VISUAL_ID:
			if (org.mindmap.ui.diagram.conceptsDiagram.edit.parts.TemaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.TemaEditPart.VISUAL_ID:
			if (org.mindmap.ui.diagram.conceptsDiagram.edit.parts.TemaNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.mindmap.ui.diagram.conceptsDiagram.edit.parts.TemaBloqueCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptoEditPart.VISUAL_ID:
			if (org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptoNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptoAtributoCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.TemaBloqueCompartmentEditPart.VISUAL_ID:
			if (org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptoAtributoCompartmentEditPart.VISUAL_ID:
			if (org.mindmap.ui.diagram.conceptsDiagram.edit.parts.AtributoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceEsUnEditPart.VISUAL_ID:
			if (org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceEsUnEtiquetaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaEditPart.VISUAL_ID:
			if (org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaEtiquetaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaBloqueEditPart.VISUAL_ID:
			if (org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaBloqueEtiquetaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ModelPackage.eINSTANCE.getEnlaceEsUn().isSuperTypeOf(
				domainElement.eClass())) {
			return org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceEsUnEditPart.VISUAL_ID;
		}
		if (ModelPackage.eINSTANCE.getEnlaceUsa().isSuperTypeOf(
				domainElement.eClass())) {
			return org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaEditPart.VISUAL_ID;
		}
		if (ModelPackage.eINSTANCE.getEnlaceUsaBloque().isSuperTypeOf(
				domainElement.eClass())) {
			return org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaBloqueEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(ConceptosDiagrama element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.TemaBloqueCompartmentEditPart.VISUAL_ID:
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptoAtributoCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptosDiagramEditPart.VISUAL_ID:
			return false;
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.AtributoEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return org.mindmap.ui.diagram.conceptsDiagram.part.MindmapVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return org.mindmap.ui.diagram.conceptsDiagram.part.MindmapVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return org.mindmap.ui.diagram.conceptsDiagram.part.MindmapVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return org.mindmap.ui.diagram.conceptsDiagram.part.MindmapVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return org.mindmap.ui.diagram.conceptsDiagram.part.MindmapVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return org.mindmap.ui.diagram.conceptsDiagram.part.MindmapVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
