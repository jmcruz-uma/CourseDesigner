package org.mindmap.ui.diagram.actividadDiagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MindmapModelingAssistantProviderOfActividadNodoFinalEditPart
		extends
		org.mindmap.ui.diagram.actividadDiagram.providers.MindmapModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadNodoFinalEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadNodoFinalEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.ActividadEnlace_4001);
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
				(org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadNodoFinalEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadNodoFinalEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadUnionBifurcacionEditPart) {
			types.add(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.ActividadEnlace_4001);
		}
		if (targetEditPart instanceof org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadNodoInicialEditPart) {
			types.add(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.ActividadEnlace_4001);
		}
		if (targetEditPart instanceof org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadNodoFinalEditPart) {
			types.add(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.ActividadEnlace_4001);
		}
		if (targetEditPart instanceof org.mindmap.ui.diagram.actividadDiagram.edit.parts.TareaEditPart) {
			types.add(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.ActividadEnlace_4001);
		}
		if (targetEditPart instanceof org.mindmap.ui.diagram.actividadDiagram.edit.parts.LeccionEditPart) {
			types.add(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.ActividadEnlace_4001);
		}
		if (targetEditPart instanceof org.mindmap.ui.diagram.actividadDiagram.edit.parts.PruebaEditPart) {
			types.add(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.ActividadEnlace_4001);
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
				(org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadNodoFinalEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadNodoFinalEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.ActividadEnlace_4001) {
			types.add(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.ActividadUnionBifurcacion_2001);
			types.add(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.ActividadNodoInicial_2002);
			types.add(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.ActividadNodoFinal_2004);
			types.add(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.Tarea_3002);
			types.add(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.Leccion_3003);
			types.add(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.Prueba_3004);
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
		return doGetRelTypesOnTarget((org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadNodoFinalEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadNodoFinalEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.ActividadEnlace_4001);
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
				(org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadNodoFinalEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadNodoFinalEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.ActividadEnlace_4001) {
			types.add(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.ActividadUnionBifurcacion_2001);
			types.add(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.ActividadNodoInicial_2002);
			types.add(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.ActividadNodoFinal_2004);
			types.add(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.Tarea_3002);
			types.add(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.Leccion_3003);
			types.add(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.Prueba_3004);
		}
		return types;
	}

}
