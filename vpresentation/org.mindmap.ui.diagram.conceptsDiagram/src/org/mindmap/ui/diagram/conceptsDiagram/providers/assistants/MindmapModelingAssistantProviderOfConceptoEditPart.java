package org.mindmap.ui.diagram.conceptsDiagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MindmapModelingAssistantProviderOfConceptoEditPart
		extends
		org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.Atributo_3002);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptoEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptoEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.EnlaceEsUn_4001);
		types.add(org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.EnlaceUsa_4002);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptoEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptoEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptoEditPart) {
			types.add(org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.EnlaceEsUn_4001);
		}
		if (targetEditPart instanceof org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptoEditPart) {
			types.add(org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.EnlaceUsa_4002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget(
				(org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptoEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptoEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.EnlaceEsUn_4001) {
			types.add(org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.Concepto_3001);
		} else if (relationshipType == org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.EnlaceUsa_4002) {
			types.add(org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.Concepto_3001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptoEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptoEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.EnlaceEsUn_4001);
		types.add(org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.EnlaceUsa_4002);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource(
				(org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptoEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptoEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.EnlaceEsUn_4001) {
			types.add(org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.Concepto_3001);
		} else if (relationshipType == org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.EnlaceUsa_4002) {
			types.add(org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.Concepto_3001);
		}
		return types;
	}

}
