package org.mindmap.ui.diagram.conceptsDiagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		org.mindmap.ui.diagram.conceptsDiagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		org.mindmap.ui.diagram.conceptsDiagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		org.mindmap.ui.diagram.conceptsDiagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		org.mindmap.ui.diagram.conceptsDiagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		org.mindmap.ui.diagram.conceptsDiagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return org.mindmap.ui.diagram.conceptsDiagram.part.ConceptsMindmapDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
