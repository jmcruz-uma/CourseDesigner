package org.mindmap.ui.diagram.conceptsDiagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class TemaBloqueCompartmentItemSemanticEditPolicy
		extends
		org.mindmap.ui.diagram.conceptsDiagram.edit.policies.MindmapBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TemaBloqueCompartmentItemSemanticEditPolicy() {
		super(
				org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.Tema_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.Concepto_3001 == req
				.getElementType()) {
			return getGEFWrapper(new org.mindmap.ui.diagram.conceptsDiagram.edit.commands.ConceptoCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
