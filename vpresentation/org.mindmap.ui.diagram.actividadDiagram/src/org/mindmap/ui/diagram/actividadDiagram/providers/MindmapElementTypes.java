package org.mindmap.ui.diagram.actividadDiagram.providers;

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
			org.mindmap.ui.diagram.actividadDiagram.part.ActDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ActividadDiagrama_1000 = getElementType("org.mindmap.ui.diagram.actividadDiagram.ActividadDiagrama_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActividadUnionBifurcacion_2001 = getElementType("org.mindmap.ui.diagram.actividadDiagram.ActividadUnionBifurcacion_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActividadNodoInicial_2002 = getElementType("org.mindmap.ui.diagram.actividadDiagram.ActividadNodoInicial_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Actividad_2003 = getElementType("org.mindmap.ui.diagram.actividadDiagram.Actividad_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActividadNodoFinal_2004 = getElementType("org.mindmap.ui.diagram.actividadDiagram.ActividadNodoFinal_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActividadEspacio_3001 = getElementType("org.mindmap.ui.diagram.actividadDiagram.ActividadEspacio_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Tarea_3002 = getElementType("org.mindmap.ui.diagram.actividadDiagram.Tarea_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Leccion_3003 = getElementType("org.mindmap.ui.diagram.actividadDiagram.Leccion_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Prueba_3004 = getElementType("org.mindmap.ui.diagram.actividadDiagram.Prueba_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActividadEnlace_4001 = getElementType("org.mindmap.ui.diagram.actividadDiagram.ActividadEnlace_4001"); //$NON-NLS-1$

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

			elements.put(ActividadDiagrama_1000,
					ModelPackage.eINSTANCE.getActividadDiagrama());

			elements.put(ActividadUnionBifurcacion_2001,
					ModelPackage.eINSTANCE.getActividadUnionBifurcacion());

			elements.put(ActividadNodoInicial_2002,
					ModelPackage.eINSTANCE.getActividadNodoInicial());

			elements.put(Actividad_2003, ModelPackage.eINSTANCE.getActividad());

			elements.put(ActividadNodoFinal_2004,
					ModelPackage.eINSTANCE.getActividadNodoFinal());

			elements.put(ActividadEspacio_3001,
					ModelPackage.eINSTANCE.getActividadEspacio());

			elements.put(Tarea_3002, ModelPackage.eINSTANCE.getTarea());

			elements.put(Leccion_3003, ModelPackage.eINSTANCE.getLeccion());

			elements.put(Prueba_3004, ModelPackage.eINSTANCE.getPrueba());

			elements.put(ActividadEnlace_4001,
					ModelPackage.eINSTANCE.getActividadEnlace());
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
			KNOWN_ELEMENT_TYPES.add(ActividadDiagrama_1000);
			KNOWN_ELEMENT_TYPES.add(ActividadUnionBifurcacion_2001);
			KNOWN_ELEMENT_TYPES.add(ActividadNodoInicial_2002);
			KNOWN_ELEMENT_TYPES.add(Actividad_2003);
			KNOWN_ELEMENT_TYPES.add(ActividadNodoFinal_2004);
			KNOWN_ELEMENT_TYPES.add(ActividadEspacio_3001);
			KNOWN_ELEMENT_TYPES.add(Tarea_3002);
			KNOWN_ELEMENT_TYPES.add(Leccion_3003);
			KNOWN_ELEMENT_TYPES.add(Prueba_3004);
			KNOWN_ELEMENT_TYPES.add(ActividadEnlace_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadDiagramaEditPart.VISUAL_ID:
			return ActividadDiagrama_1000;
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadUnionBifurcacionEditPart.VISUAL_ID:
			return ActividadUnionBifurcacion_2001;
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadNodoInicialEditPart.VISUAL_ID:
			return ActividadNodoInicial_2002;
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEditPart.VISUAL_ID:
			return Actividad_2003;
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadNodoFinalEditPart.VISUAL_ID:
			return ActividadNodoFinal_2004;
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEspacioEditPart.VISUAL_ID:
			return ActividadEspacio_3001;
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.TareaEditPart.VISUAL_ID:
			return Tarea_3002;
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.LeccionEditPart.VISUAL_ID:
			return Leccion_3003;
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.PruebaEditPart.VISUAL_ID:
			return Prueba_3004;
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEnlaceEditPart.VISUAL_ID:
			return ActividadEnlace_4001;
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
			return org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
