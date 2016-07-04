package org.mindmap.ui.diagram.conceptsDiagram.part;

import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.actions.ActionIds;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDiagramDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocumentProvider;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.ui.IEditorInput;

/**
 * @generated
 */
public class MindmapDiagramEditor extends DiagramDocumentEditor {

	/**
	 * @generated
	 */
	public static final String ID = "org.mindmap.ui.diagram.conceptsDiagram.part.MindmapDiagramEditorID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final String CONTEXT_ID = "org.mindmap.ui.diagram.conceptsDiagram.ui.diagramContext"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public MindmapDiagramEditor() {
		super(true);
	}

	/**
	 * @generated
	 */
	protected String getContextID() {
		return CONTEXT_ID;
	}

	/**
	 * @generated
	 */
	protected PaletteRoot createPaletteRoot(PaletteRoot existingPaletteRoot) {
		PaletteRoot root = super.createPaletteRoot(existingPaletteRoot);
		new org.mindmap.ui.diagram.conceptsDiagram.part.MindmapPaletteFactory()
				.fillPalette(root);
		return root;
	}

	/**
	 * @generated
	 */
	protected PreferencesHint getPreferencesHint() {
		return org.mindmap.ui.diagram.conceptsDiagram.part.ConceptsMindmapDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
	}

	/**
	 * @generated
	 */
	public String getContributorId() {
		return org.mindmap.ui.diagram.conceptsDiagram.part.ConceptsMindmapDiagramEditorPlugin.ID;
	}

	/**
	 * @generated
	 */
	protected IDocumentProvider getDocumentProvider(IEditorInput input) {
		if (input instanceof URIEditorInput) {
			return org.mindmap.ui.diagram.conceptsDiagram.part.ConceptsMindmapDiagramEditorPlugin
					.getInstance().getDocumentProvider();
		}
		return super.getDocumentProvider(input);
	}

	/**
	 * @generated
	 */
	public TransactionalEditingDomain getEditingDomain() {
		IDocument document = getEditorInput() != null ? getDocumentProvider()
				.getDocument(getEditorInput()) : null;
		if (document instanceof IDiagramDocument) {
			return ((IDiagramDocument) document).getEditingDomain();
		}
		return super.getEditingDomain();
	}

	/**
	 * @generated
	 */
	protected void setDocumentProvider(IEditorInput input) {
		if (input instanceof URIEditorInput) {
			setDocumentProvider(org.mindmap.ui.diagram.conceptsDiagram.part.ConceptsMindmapDiagramEditorPlugin
					.getInstance().getDocumentProvider());
		} else {
			super.setDocumentProvider(input);
		}
	}

	/**
	 * @generated
	 */
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
		org.mindmap.ui.diagram.conceptsDiagram.part.DiagramEditorContextMenuProvider provider = new org.mindmap.ui.diagram.conceptsDiagram.part.DiagramEditorContextMenuProvider(
				this, getDiagramGraphicalViewer());
		getDiagramGraphicalViewer().setContextMenu(provider);
		getSite().registerContextMenu(ActionIds.DIAGRAM_EDITOR_CONTEXT_MENU,
				provider, getDiagramGraphicalViewer());
	}



	 /*@Override
		protected void editorContextMenuAboutToShow(IMenuManager menu)
		{   	
			super.editorContextMenuAboutToShow(menu);
			
			//Look for show ins menu
			IContributionItem[] items = menu.getItems();
			for (int i = 0; i < items.length; i++)
			{
				if (items[i] instanceof IMenuManager)
				{
					IMenuManager submenu = (IMenuManager)items[i];
					IContributionItem testShowIn = submenu.find(ContributionItemFactory.VIEWS_SHOW_IN.getId());
					//If menu is found then remove this submenu from the context menu
					if (testShowIn != null)
						menu.remove(submenu);
				}
			}
		}*/
}
