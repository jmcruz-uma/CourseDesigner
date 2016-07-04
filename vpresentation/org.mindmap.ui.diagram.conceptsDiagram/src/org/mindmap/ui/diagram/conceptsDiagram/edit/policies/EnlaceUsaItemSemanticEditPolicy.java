package org.mindmap.ui.diagram.conceptsDiagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class EnlaceUsaItemSemanticEditPolicy
		extends
		org.mindmap.ui.diagram.conceptsDiagram.edit.policies.MindmapBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EnlaceUsaItemSemanticEditPolicy() {
		super(
				org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.EnlaceUsa_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
