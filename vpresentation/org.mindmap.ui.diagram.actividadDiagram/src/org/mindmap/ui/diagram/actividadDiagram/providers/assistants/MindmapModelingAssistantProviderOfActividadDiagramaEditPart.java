package org.mindmap.ui.diagram.actividadDiagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MindmapModelingAssistantProviderOfActividadDiagramaEditPart
		extends
		org.mindmap.ui.diagram.actividadDiagram.providers.MindmapModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.ActividadUnionBifurcacion_2001);
		types.add(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.ActividadNodoInicial_2002);
		types.add(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.Actividad_2003);
		types.add(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.ActividadNodoFinal_2004);
		return types;
	}

}
