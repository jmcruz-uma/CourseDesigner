package org.mindmap.ui.diagram.actividadDiagram.preferences;

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
		org.mindmap.ui.diagram.actividadDiagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		org.mindmap.ui.diagram.actividadDiagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		org.mindmap.ui.diagram.actividadDiagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		org.mindmap.ui.diagram.actividadDiagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		org.mindmap.ui.diagram.actividadDiagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return org.mindmap.ui.diagram.actividadDiagram.part.ActDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
