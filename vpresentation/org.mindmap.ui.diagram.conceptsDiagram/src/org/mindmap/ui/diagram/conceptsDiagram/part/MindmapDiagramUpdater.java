package org.mindmap.ui.diagram.conceptsDiagram.part;

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
import org.mindmap.model.Atributo;
import org.mindmap.model.Concepto;
import org.mindmap.model.ConceptosDiagrama;
import org.mindmap.model.CursoDiagrama;
import org.mindmap.model.EnlaceEsUn;
import org.mindmap.model.EnlaceUsa;
import org.mindmap.model.EnlaceUsaBloque;
import org.mindmap.model.ModelPackage;
import org.mindmap.model.Tema;

/**
 * @generated
 */
public class MindmapDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapNodeDescriptor> getSemanticChildren(
			View view) {
		switch (org.mindmap.ui.diagram.conceptsDiagram.part.MindmapVisualIDRegistry
				.getVisualID(view)) {
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptosDiagramEditPart.VISUAL_ID:
			return getConceptosDiagrama_1000SemanticChildren(view);
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.TemaBloqueCompartmentEditPart.VISUAL_ID:
			return getTemaBloqueCompartment_7001SemanticChildren(view);
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptoAtributoCompartmentEditPart.VISUAL_ID:
			return getConceptoAtributoCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapNodeDescriptor> getConceptosDiagrama_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ConceptosDiagrama modelElement = (ConceptosDiagrama) view.getElement();
		LinkedList<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapNodeDescriptor> result = new LinkedList<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTemas().iterator(); it.hasNext();) {
			Tema childElement = (Tema) it.next();
			int visualID = org.mindmap.ui.diagram.conceptsDiagram.part.MindmapVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.mindmap.ui.diagram.conceptsDiagram.edit.parts.TemaEditPart.VISUAL_ID) {
				result.add(new org.mindmap.ui.diagram.conceptsDiagram.part.MindmapNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapNodeDescriptor> getTemaBloqueCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Tema modelElement = (Tema) containerView.getElement();
		LinkedList<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapNodeDescriptor> result = new LinkedList<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConceptos().iterator(); it
				.hasNext();) {
			Concepto childElement = (Concepto) it.next();
			int visualID = org.mindmap.ui.diagram.conceptsDiagram.part.MindmapVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptoEditPart.VISUAL_ID) {
				result.add(new org.mindmap.ui.diagram.conceptsDiagram.part.MindmapNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapNodeDescriptor> getConceptoAtributoCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Concepto modelElement = (Concepto) containerView.getElement();
		LinkedList<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapNodeDescriptor> result = new LinkedList<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAtributos().iterator(); it
				.hasNext();) {
			Atributo childElement = (Atributo) it.next();
			int visualID = org.mindmap.ui.diagram.conceptsDiagram.part.MindmapVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == org.mindmap.ui.diagram.conceptsDiagram.edit.parts.AtributoEditPart.VISUAL_ID) {
				result.add(new org.mindmap.ui.diagram.conceptsDiagram.part.MindmapNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> getContainedLinks(
			View view) {
		switch (org.mindmap.ui.diagram.conceptsDiagram.part.MindmapVisualIDRegistry
				.getVisualID(view)) {
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptosDiagramEditPart.VISUAL_ID:
			return getConceptosDiagrama_1000ContainedLinks(view);
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.TemaEditPart.VISUAL_ID:
			return getTema_2001ContainedLinks(view);
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptoEditPart.VISUAL_ID:
			return getConcepto_3001ContainedLinks(view);
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.AtributoEditPart.VISUAL_ID:
			return getAtributo_3002ContainedLinks(view);
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceEsUnEditPart.VISUAL_ID:
			return getEnlaceEsUn_4001ContainedLinks(view);
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaEditPart.VISUAL_ID:
			return getEnlaceUsa_4002ContainedLinks(view);
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaBloqueEditPart.VISUAL_ID:
			return getEnlaceUsaBloque_4003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> getIncomingLinks(
			View view) {
		switch (org.mindmap.ui.diagram.conceptsDiagram.part.MindmapVisualIDRegistry
				.getVisualID(view)) {
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.TemaEditPart.VISUAL_ID:
			return getTema_2001IncomingLinks(view);
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptoEditPart.VISUAL_ID:
			return getConcepto_3001IncomingLinks(view);
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.AtributoEditPart.VISUAL_ID:
			return getAtributo_3002IncomingLinks(view);
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceEsUnEditPart.VISUAL_ID:
			return getEnlaceEsUn_4001IncomingLinks(view);
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaEditPart.VISUAL_ID:
			return getEnlaceUsa_4002IncomingLinks(view);
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaBloqueEditPart.VISUAL_ID:
			return getEnlaceUsaBloque_4003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (org.mindmap.ui.diagram.conceptsDiagram.part.MindmapVisualIDRegistry
				.getVisualID(view)) {
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.TemaEditPart.VISUAL_ID:
			return getTema_2001OutgoingLinks(view);
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptoEditPart.VISUAL_ID:
			return getConcepto_3001OutgoingLinks(view);
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.AtributoEditPart.VISUAL_ID:
			return getAtributo_3002OutgoingLinks(view);
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceEsUnEditPart.VISUAL_ID:
			return getEnlaceEsUn_4001OutgoingLinks(view);
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaEditPart.VISUAL_ID:
			return getEnlaceUsa_4002OutgoingLinks(view);
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaBloqueEditPart.VISUAL_ID:
			return getEnlaceUsaBloque_4003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> getConceptosDiagrama_1000ContainedLinks(
			View view) {
		ConceptosDiagrama modelElement = (ConceptosDiagrama) view.getElement();
		LinkedList<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> result = new LinkedList<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EnlaceEsUn_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_EnlaceUsa_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_EnlaceUsaBloque_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> getTema_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> getConcepto_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> getAtributo_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> getEnlaceEsUn_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> getEnlaceUsa_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> getEnlaceUsaBloque_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> getTema_2001IncomingLinks(
			View view) {
		Tema modelElement = (Tema) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> result = new LinkedList<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnlaceUsaBloque_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> getConcepto_3001IncomingLinks(
			View view) {
		Concepto modelElement = (Concepto) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> result = new LinkedList<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EnlaceEsUn_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EnlaceUsa_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> getAtributo_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> getEnlaceEsUn_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> getEnlaceUsa_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> getEnlaceUsaBloque_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> getTema_2001OutgoingLinks(
			View view) {
		Tema modelElement = (Tema) view.getElement();
		LinkedList<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> result = new LinkedList<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnlaceUsaBloque_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> getConcepto_3001OutgoingLinks(
			View view) {
		Concepto modelElement = (Concepto) view.getElement();
		LinkedList<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> result = new LinkedList<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EnlaceEsUn_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EnlaceUsa_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> getAtributo_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> getEnlaceEsUn_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> getEnlaceUsa_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> getEnlaceUsaBloque_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> getContainedTypeModelFacetLinks_EnlaceEsUn_4001(
			CursoDiagrama container) {
		LinkedList<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> result = new LinkedList<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor>();
		for (Iterator<?> links = container.getEnlacesEsUn().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EnlaceEsUn) {
				continue;
			}
			EnlaceEsUn link = (EnlaceEsUn) linkObject;
			if (org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceEsUnEditPart.VISUAL_ID != org.mindmap.ui.diagram.conceptsDiagram.part.MindmapVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Concepto dst = link.getDestino();
			Concepto src = link.getOrigen();
			result.add(new org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor(
					src,
					dst,
					link,
					org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.EnlaceEsUn_4001,
					org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceEsUnEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> getContainedTypeModelFacetLinks_EnlaceUsa_4002(
			CursoDiagrama container) {
		LinkedList<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> result = new LinkedList<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor>();
		for (Iterator<?> links = container.getEnlaceUsa().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EnlaceUsa) {
				continue;
			}
			EnlaceUsa link = (EnlaceUsa) linkObject;
			if (org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaEditPart.VISUAL_ID != org.mindmap.ui.diagram.conceptsDiagram.part.MindmapVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Concepto dst = link.getDestino();
			Concepto src = link.getOrigen();
			result.add(new org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor(
					src,
					dst,
					link,
					org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.EnlaceUsa_4002,
					org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> getContainedTypeModelFacetLinks_EnlaceUsaBloque_4003(
			CursoDiagrama container) {
		LinkedList<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> result = new LinkedList<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor>();
		for (Iterator<?> links = container.getEnlacesUsaBloque().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EnlaceUsaBloque) {
				continue;
			}
			EnlaceUsaBloque link = (EnlaceUsaBloque) linkObject;
			if (org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaBloqueEditPart.VISUAL_ID != org.mindmap.ui.diagram.conceptsDiagram.part.MindmapVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Tema dst = link.getDestino();
			Tema src = link.getOrigen();
			result.add(new org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor(
					src,
					dst,
					link,
					org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.EnlaceUsaBloque_4003,
					org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaBloqueEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> getIncomingTypeModelFacetLinks_EnlaceEsUn_4001(
			Concepto target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> result = new LinkedList<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ModelPackage.eINSTANCE
					.getEnlaceEsUn_Destino()
					|| false == setting.getEObject() instanceof EnlaceEsUn) {
				continue;
			}
			EnlaceEsUn link = (EnlaceEsUn) setting.getEObject();
			if (org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceEsUnEditPart.VISUAL_ID != org.mindmap.ui.diagram.conceptsDiagram.part.MindmapVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Concepto src = link.getOrigen();
			result.add(new org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor(
					src,
					target,
					link,
					org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.EnlaceEsUn_4001,
					org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceEsUnEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> getIncomingTypeModelFacetLinks_EnlaceUsa_4002(
			Concepto target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> result = new LinkedList<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ModelPackage.eINSTANCE
					.getEnlaceUsa_Destino()
					|| false == setting.getEObject() instanceof EnlaceUsa) {
				continue;
			}
			EnlaceUsa link = (EnlaceUsa) setting.getEObject();
			if (org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaEditPart.VISUAL_ID != org.mindmap.ui.diagram.conceptsDiagram.part.MindmapVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Concepto src = link.getOrigen();
			result.add(new org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor(
					src,
					target,
					link,
					org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.EnlaceUsa_4002,
					org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> getIncomingTypeModelFacetLinks_EnlaceUsaBloque_4003(
			Tema target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> result = new LinkedList<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ModelPackage.eINSTANCE
					.getEnlaceUsaBloque_Destino()
					|| false == setting.getEObject() instanceof EnlaceUsaBloque) {
				continue;
			}
			EnlaceUsaBloque link = (EnlaceUsaBloque) setting.getEObject();
			if (org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaBloqueEditPart.VISUAL_ID != org.mindmap.ui.diagram.conceptsDiagram.part.MindmapVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Tema src = link.getOrigen();
			result.add(new org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor(
					src,
					target,
					link,
					org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.EnlaceUsaBloque_4003,
					org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaBloqueEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> getOutgoingTypeModelFacetLinks_EnlaceEsUn_4001(
			Concepto source) {
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
		LinkedList<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> result = new LinkedList<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor>();
		for (Iterator<?> links = container.getEnlacesEsUn().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EnlaceEsUn) {
				continue;
			}
			EnlaceEsUn link = (EnlaceEsUn) linkObject;
			if (org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceEsUnEditPart.VISUAL_ID != org.mindmap.ui.diagram.conceptsDiagram.part.MindmapVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Concepto dst = link.getDestino();
			Concepto src = link.getOrigen();
			if (src != source) {
				continue;
			}
			result.add(new org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor(
					src,
					dst,
					link,
					org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.EnlaceEsUn_4001,
					org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceEsUnEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> getOutgoingTypeModelFacetLinks_EnlaceUsa_4002(
			Concepto source) {
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
		LinkedList<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> result = new LinkedList<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor>();
		for (Iterator<?> links = container.getEnlaceUsa().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EnlaceUsa) {
				continue;
			}
			EnlaceUsa link = (EnlaceUsa) linkObject;
			if (org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaEditPart.VISUAL_ID != org.mindmap.ui.diagram.conceptsDiagram.part.MindmapVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Concepto dst = link.getDestino();
			Concepto src = link.getOrigen();
			if (src != source) {
				continue;
			}
			result.add(new org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor(
					src,
					dst,
					link,
					org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.EnlaceUsa_4002,
					org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> getOutgoingTypeModelFacetLinks_EnlaceUsaBloque_4003(
			Tema source) {
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
		LinkedList<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> result = new LinkedList<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor>();
		for (Iterator<?> links = container.getEnlacesUsaBloque().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EnlaceUsaBloque) {
				continue;
			}
			EnlaceUsaBloque link = (EnlaceUsaBloque) linkObject;
			if (org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaBloqueEditPart.VISUAL_ID != org.mindmap.ui.diagram.conceptsDiagram.part.MindmapVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Tema dst = link.getDestino();
			Tema src = link.getOrigen();
			if (src != source) {
				continue;
			}
			result.add(new org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor(
					src,
					dst,
					link,
					org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.EnlaceUsaBloque_4003,
					org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaBloqueEditPart.VISUAL_ID));
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
		public List<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapNodeDescriptor> getSemanticChildren(
				View view) {
			return MindmapDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> getContainedLinks(
				View view) {
			return MindmapDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> getIncomingLinks(
				View view) {
			return MindmapDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<org.mindmap.ui.diagram.conceptsDiagram.part.MindmapLinkDescriptor> getOutgoingLinks(
				View view) {
			return MindmapDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
