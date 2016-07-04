package org.mindmap.ui.diagram.conceptsDiagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.mindmap.model.ModelPackage;

/**
 * @generated
 */
public class MindmapElementTypes {

	/**
	 * @generated
	 */
	private MindmapElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			org.mindmap.ui.diagram.conceptsDiagram.part.ConceptsMindmapDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ConceptosDiagrama_1000 = getElementType("org.mindmap.ui.diagram.conceptsDiagram.ConceptosDiagrama_1000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Tema_2001 = getElementType("org.mindmap.ui.diagram.conceptsDiagram.Tema_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Concepto_3001 = getElementType("org.mindmap.ui.diagram.conceptsDiagram.Concepto_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Atributo_3002 = getElementType("org.mindmap.ui.diagram.conceptsDiagram.Atributo_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EnlaceEsUn_4001 = getElementType("org.mindmap.ui.diagram.conceptsDiagram.EnlaceEsUn_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EnlaceUsa_4002 = getElementType("org.mindmap.ui.diagram.conceptsDiagram.EnlaceUsa_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EnlaceUsaBloque_4003 = getElementType("org.mindmap.ui.diagram.conceptsDiagram.EnlaceUsaBloque_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(ConceptosDiagrama_1000,
					ModelPackage.eINSTANCE.getConceptosDiagrama());

			elements.put(Tema_2001, ModelPackage.eINSTANCE.getTema());

			elements.put(Concepto_3001, ModelPackage.eINSTANCE.getConcepto());

			elements.put(Atributo_3002, ModelPackage.eINSTANCE.getAtributo());

			elements.put(EnlaceEsUn_4001,
					ModelPackage.eINSTANCE.getEnlaceEsUn());

			elements.put(EnlaceUsa_4002, ModelPackage.eINSTANCE.getEnlaceUsa());

			elements.put(EnlaceUsaBloque_4003,
					ModelPackage.eINSTANCE.getEnlaceUsaBloque());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(ConceptosDiagrama_1000);
			KNOWN_ELEMENT_TYPES.add(Tema_2001);
			KNOWN_ELEMENT_TYPES.add(Concepto_3001);
			KNOWN_ELEMENT_TYPES.add(Atributo_3002);
			KNOWN_ELEMENT_TYPES.add(EnlaceEsUn_4001);
			KNOWN_ELEMENT_TYPES.add(EnlaceUsa_4002);
			KNOWN_ELEMENT_TYPES.add(EnlaceUsaBloque_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptosDiagramEditPart.VISUAL_ID:
			return ConceptosDiagrama_1000;
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.TemaEditPart.VISUAL_ID:
			return Tema_2001;
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptoEditPart.VISUAL_ID:
			return Concepto_3001;
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.AtributoEditPart.VISUAL_ID:
			return Atributo_3002;
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceEsUnEditPart.VISUAL_ID:
			return EnlaceEsUn_4001;
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaEditPart.VISUAL_ID:
			return EnlaceUsa_4002;
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaBloqueEditPart.VISUAL_ID:
			return EnlaceUsaBloque_4003;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
