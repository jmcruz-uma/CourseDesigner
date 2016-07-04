package org.mindmap.ui.diagram.conceptsDiagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ConceptoAtributoCompartmentItemSemanticEditPolicy
		extends
		org.mindmap.ui.diagram.conceptsDiagram.edit.policies.MindmapBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConceptoAtributoCompartmentItemSemanticEditPolicy() {
		super(
				org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.Concepto_3001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.Atributo_3002 == req
				.getElementType()) {
			return getGEFWrapper(new org.mindmap.ui.diagram.conceptsDiagram.edit.commands.AtributoCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
