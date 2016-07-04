package org.mindmap.ui.diagram.actividadDiagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = org.mindmap.ui.diagram.actividadDiagram.part.ActDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			org.mindmap.ui.diagram.actividadDiagram.part.ActDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
