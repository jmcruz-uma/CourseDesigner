package org.mindmap.ui.diagram.conceptsDiagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class EnlaceUsaBloqueItemSemanticEditPolicy
		extends
		org.mindmap.ui.diagram.conceptsDiagram.edit.policies.MindmapBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EnlaceUsaBloqueItemSemanticEditPolicy() {
		super(
				org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.EnlaceUsaBloque_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
