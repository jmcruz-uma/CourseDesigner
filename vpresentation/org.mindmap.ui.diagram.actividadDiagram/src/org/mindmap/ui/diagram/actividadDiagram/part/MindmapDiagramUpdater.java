package org.mindmap.ui.diagram.actividadDiagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.mindmap.model.Actividad;
import org.mindmap.model.ActividadDiagrama;
import org.mindmap.model.ActividadEnlace;
import org.mindmap.model.ActividadEspacio;
import org.mindmap.model.ActividadNodo;
import org.mindmap.model.ActividadNodoFinal;
import org.mindmap.model.ActividadNodoInicial;
import org.mindmap.model.ActividadUnionBifurcacion;
import org.mindmap.model.CursoDiagrama;
import org.mindmap.model.Leccion;
import org.mindmap.model.ModelPackage;
import org.mindmap.model.Prueba;
import org.mindmap.model.Tarea;

/**
 * @generated
 */
public class MindmapDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapNodeDescriptor> getSemanticChildren(
			View view) {
		switch (org.mindmap.ui.diagram.actividadDiagram.part.MindmapVisualIDRegistry
				.getVisualID(view)) {
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadDiagramaEditPart.VISUAL_ID:
			return getActividadDiagrama_1000SemanticChildren(view);
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadActividadCompartmentEditPart.VISUAL_ID:
			return getActividadActividadCompartment_7001SemanticChildren(view);
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEspacioActividadEspacioCompartmentEditPart.VISUAL_ID:
			return getActividadEspacioActividadEspacioCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapNodeDescriptor> getActividadDiagrama_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ActividadDiagrama modelElement = (ActividadDiagrama) view.getElement();
		LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapNodeDescriptor> result = new LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapNodeDescriptor>();
		for (Iterator<?> it = modelElement.getUnionesbifurcaciones().iterator(); it
				.hasNext();) {
			ActividadUnionBifurcacion childElement = (ActividadUnionBifurcacion) it
					.next();
			int visualID = org.mindmap.ui.diagram.actividadDiagram.part.MindmapVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadUnionBifurcacionEditPart.VISUAL_ID) {
				result.add(new org.mindmap.ui.diagram.actividadDiagram.part.MindmapNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		{
			ActividadNodoInicial childElement = modelElement
					.getElementoNodoInicial();
			int visualID = org.mindmap.ui.diagram.actividadDiagram.part.MindmapVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadNodoInicialEditPart.VISUAL_ID) {
				result.add(new org.mindmap.ui.diagram.actividadDiagram.part.MindmapNodeDescriptor(
						childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getActividades().iterator(); it
				.hasNext();) {
			Actividad childElement = (Actividad) it.next();
			int visualID = org.mindmap.ui.diagram.actividadDiagram.part.MindmapVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEditPart.VISUAL_ID) {
				result.add(new org.mindmap.ui.diagram.actividadDiagram.part.MindmapNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		{
			ActividadNodoFinal childElement = modelElement
					.getElementoNodoFinal();
			int visualID = org.mindmap.ui.diagram.actividadDiagram.part.MindmapVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadNodoFinalEditPart.VISUAL_ID) {
				result.add(new org.mindmap.ui.diagram.actividadDiagram.part.MindmapNodeDescriptor(
						childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapNodeDescriptor> getActividadActividadCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Actividad modelElement = (Actividad) containerView.getElement();
		LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapNodeDescriptor> result = new LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEspacios().iterator(); it
				.hasNext();) {
			ActividadEspacio childElement = (ActividadEspacio) it.next();
			int visualID = org.mindmap.ui.diagram.actividadDiagram.part.MindmapVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEspacioEditPart.VISUAL_ID) {
				result.add(new org.mindmap.ui.diagram.actividadDiagram.part.MindmapNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapNodeDescriptor> getActividadEspacioActividadEspacioCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ActividadEspacio modelElement = (ActividadEspacio) containerView
				.getElement();
		LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapNodeDescriptor> result = new LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTareas().iterator(); it.hasNext();) {
			Tarea childElement = (Tarea) it.next();
			int visualID = org.mindmap.ui.diagram.actividadDiagram.part.MindmapVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.mindmap.ui.diagram.actividadDiagram.edit.parts.TareaEditPart.VISUAL_ID) {
				result.add(new org.mindmap.ui.diagram.actividadDiagram.part.MindmapNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getLecciones().iterator(); it
				.hasNext();) {
			Leccion childElement = (Leccion) it.next();
			int visualID = org.mindmap.ui.diagram.actividadDiagram.part.MindmapVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.mindmap.ui.diagram.actividadDiagram.edit.parts.LeccionEditPart.VISUAL_ID) {
				result.add(new org.mindmap.ui.diagram.actividadDiagram.part.MindmapNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getPruebas().iterator(); it
				.hasNext();) {
			Prueba childElement = (Prueba) it.next();
			int visualID = org.mindmap.ui.diagram.actividadDiagram.part.MindmapVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.mindmap.ui.diagram.actividadDiagram.edit.parts.PruebaEditPart.VISUAL_ID) {
				result.add(new org.mindmap.ui.diagram.actividadDiagram.part.MindmapNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getContainedLinks(
			View view) {
		switch (org.mindmap.ui.diagram.actividadDiagram.part.MindmapVisualIDRegistry
				.getVisualID(view)) {
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadDiagramaEditPart.VISUAL_ID:
			return getActividadDiagrama_1000ContainedLinks(view);
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadUnionBifurcacionEditPart.VISUAL_ID:
			return getActividadUnionBifurcacion_2001ContainedLinks(view);
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadNodoInicialEditPart.VISUAL_ID:
			return getActividadNodoInicial_2002ContainedLinks(view);
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEditPart.VISUAL_ID:
			return getActividad_2003ContainedLinks(view);
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadNodoFinalEditPart.VISUAL_ID:
			return getActividadNodoFinal_2004ContainedLinks(view);
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEspacioEditPart.VISUAL_ID:
			return getActividadEspacio_3001ContainedLinks(view);
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.TareaEditPart.VISUAL_ID:
			return getTarea_3002ContainedLinks(view);
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.LeccionEditPart.VISUAL_ID:
			return getLeccion_3003ContainedLinks(view);
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.PruebaEditPart.VISUAL_ID:
			return getPrueba_3004ContainedLinks(view);
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEnlaceEditPart.VISUAL_ID:
			return getActividadEnlace_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getIncomingLinks(
			View view) {
		switch (org.mindmap.ui.diagram.actividadDiagram.part.MindmapVisualIDRegistry
				.getVisualID(view)) {
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadUnionBifurcacionEditPart.VISUAL_ID:
			return getActividadUnionBifurcacion_2001IncomingLinks(view);
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadNodoInicialEditPart.VISUAL_ID:
			return getActividadNodoInicial_2002IncomingLinks(view);
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEditPart.VISUAL_ID:
			return getActividad_2003IncomingLinks(view);
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadNodoFinalEditPart.VISUAL_ID:
			return getActividadNodoFinal_2004IncomingLinks(view);
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEspacioEditPart.VISUAL_ID:
			return getActividadEspacio_3001IncomingLinks(view);
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.TareaEditPart.VISUAL_ID:
			return getTarea_3002IncomingLinks(view);
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.LeccionEditPart.VISUAL_ID:
			return getLeccion_3003IncomingLinks(view);
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.PruebaEditPart.VISUAL_ID:
			return getPrueba_3004IncomingLinks(view);
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEnlaceEditPart.VISUAL_ID:
			return getActividadEnlace_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (org.mindmap.ui.diagram.actividadDiagram.part.MindmapVisualIDRegistry
				.getVisualID(view)) {
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadUnionBifurcacionEditPart.VISUAL_ID:
			return getActividadUnionBifurcacion_2001OutgoingLinks(view);
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadNodoInicialEditPart.VISUAL_ID:
			return getActividadNodoInicial_2002OutgoingLinks(view);
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEditPart.VISUAL_ID:
			return getActividad_2003OutgoingLinks(view);
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadNodoFinalEditPart.VISUAL_ID:
			return getActividadNodoFinal_2004OutgoingLinks(view);
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEspacioEditPart.VISUAL_ID:
			return getActividadEspacio_3001OutgoingLinks(view);
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.TareaEditPart.VISUAL_ID:
			return getTarea_3002OutgoingLinks(view);
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.LeccionEditPart.VISUAL_ID:
			return getLeccion_3003OutgoingLinks(view);
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.PruebaEditPart.VISUAL_ID:
			return getPrueba_3004OutgoingLinks(view);
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEnlaceEditPart.VISUAL_ID:
			return getActividadEnlace_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getActividadDiagrama_1000ContainedLinks(
			View view) {
		ActividadDiagrama modelElement = (ActividadDiagrama) view.getElement();
		LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> result = new LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ActividadEnlace_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getActividadUnionBifurcacion_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getActividadNodoInicial_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getActividad_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getActividadNodoFinal_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getActividadEspacio_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getTarea_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getLeccion_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getPrueba_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getActividadEnlace_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getActividadUnionBifurcacion_2001IncomingLinks(
			View view) {
		ActividadUnionBifurcacion modelElement = (ActividadUnionBifurcacion) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> result = new LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActividadEnlace_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getActividadNodoInicial_2002IncomingLinks(
			View view) {
		ActividadNodoInicial modelElement = (ActividadNodoInicial) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> result = new LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActividadEnlace_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getActividad_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getActividadNodoFinal_2004IncomingLinks(
			View view) {
		ActividadNodoFinal modelElement = (ActividadNodoFinal) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> result = new LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActividadEnlace_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getActividadEspacio_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getTarea_3002IncomingLinks(
			View view) {
		Tarea modelElement = (Tarea) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> result = new LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActividadEnlace_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getLeccion_3003IncomingLinks(
			View view) {
		Leccion modelElement = (Leccion) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> result = new LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActividadEnlace_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getPrueba_3004IncomingLinks(
			View view) {
		Prueba modelElement = (Prueba) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> result = new LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ActividadEnlace_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getActividadEnlace_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getActividadUnionBifurcacion_2001OutgoingLinks(
			View view) {
		ActividadUnionBifurcacion modelElement = (ActividadUnionBifurcacion) view
				.getElement();
		LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> result = new LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActividadEnlace_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getActividadNodoInicial_2002OutgoingLinks(
			View view) {
		ActividadNodoInicial modelElement = (ActividadNodoInicial) view
				.getElement();
		LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> result = new LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActividadEnlace_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getActividad_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getActividadNodoFinal_2004OutgoingLinks(
			View view) {
		ActividadNodoFinal modelElement = (ActividadNodoFinal) view
				.getElement();
		LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> result = new LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActividadEnlace_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getActividadEspacio_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getTarea_3002OutgoingLinks(
			View view) {
		Tarea modelElement = (Tarea) view.getElement();
		LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> result = new LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActividadEnlace_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getLeccion_3003OutgoingLinks(
			View view) {
		Leccion modelElement = (Leccion) view.getElement();
		LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> result = new LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActividadEnlace_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getPrueba_3004OutgoingLinks(
			View view) {
		Prueba modelElement = (Prueba) view.getElement();
		LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> result = new LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ActividadEnlace_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getActividadEnlace_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getContainedTypeModelFacetLinks_ActividadEnlace_4001(
			CursoDiagrama container) {
		LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> result = new LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor>();
		for (Iterator<?> links = container.getEnlacesActividad().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ActividadEnlace) {
				continue;
			}
			ActividadEnlace link = (ActividadEnlace) linkObject;
			if (org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEnlaceEditPart.VISUAL_ID != org.mindmap.ui.diagram.actividadDiagram.part.MindmapVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActividadNodo dst = link.getDestino();
			ActividadNodo src = link.getOrigen();
			result.add(new org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor(
					src,
					dst,
					link,
					org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.ActividadEnlace_4001,
					org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEnlaceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getIncomingTypeModelFacetLinks_ActividadEnlace_4001(
			ActividadNodo target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> result = new LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ModelPackage.eINSTANCE
					.getActividadEnlace_Destino()
					|| false == setting.getEObject() instanceof ActividadEnlace) {
				continue;
			}
			ActividadEnlace link = (ActividadEnlace) setting.getEObject();
			if (org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEnlaceEditPart.VISUAL_ID != org.mindmap.ui.diagram.actividadDiagram.part.MindmapVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActividadNodo src = link.getOrigen();
			result.add(new org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor(
					src,
					target,
					link,
					org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.ActividadEnlace_4001,
					org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEnlaceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getOutgoingTypeModelFacetLinks_ActividadEnlace_4001(
			ActividadNodo source) {
		CursoDiagrama container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof CursoDiagrama) {
				container = (CursoDiagrama) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> result = new LinkedList<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor>();
		for (Iterator<?> links = container.getEnlacesActividad().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ActividadEnlace) {
				continue;
			}
			ActividadEnlace link = (ActividadEnlace) linkObject;
			if (org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEnlaceEditPart.VISUAL_ID != org.mindmap.ui.diagram.actividadDiagram.part.MindmapVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActividadNodo dst = link.getDestino();
			ActividadNodo src = link.getOrigen();
			if (src != source) {
				continue;
			}
			result.add(new org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor(
					src,
					dst,
					link,
					org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.ActividadEnlace_4001,
					org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEnlaceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapNodeDescriptor> getSemanticChildren(
				View view) {
			return MindmapDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getContainedLinks(
				View view) {
			return MindmapDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getIncomingLinks(
				View view) {
			return MindmapDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<org.mindmap.ui.diagram.actividadDiagram.part.MindmapLinkDescriptor> getOutgoingLinks(
				View view) {
			return MindmapDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
