package org.mindmap.ui.diagram.conceptsDiagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MindmapModelingAssistantProviderOfConceptosDiagramEditPart
		extends
		org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.Tema_2001);
		return types;
	}

}
