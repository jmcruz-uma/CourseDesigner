package org.mindmap.ui.diagram.actividadDiagram.part;

import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.properties.UndoablePropertySheetEntry;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.actions.ActionIds;
import org.eclipse.gmf.runtime.diagram.ui.properties.views.PropertiesBrowserPage;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDiagramDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocumentProvider;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.emf.ui.properties.sections.UndoableModelPropertySheetEntry;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.views.properties.IPropertySheetEntry;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetSorter;
import org.mindmap.ui.diagram.actividadDiagram.sheet.MindmapPropertySection;
import org.mindmap.ui.diagram.actividadDiagram.sheet.MyPropertySheet;
import org.mindmap.ui.diagram.actividadDiagram.sheet.MyPropertySheetEntry;

/**
 * @generated
 */
public class ActMindmapDiagramEditor extends DiagramDocumentEditor {

	/**
	 * @generated
	 */
	public static final String ID = "org.mindmap.ui.diagram.actividadDiagram.part.ActMindmapDiagramEditorID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final String CONTEXT_ID = "org.mindmap.ui.diagram.actividadDiagram.ui.diagramContext"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public ActMindmapDiagramEditor() {
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
		new org.mindmap.ui.diagram.actividadDiagram.part.MindmapPaletteFactory()
				.fillPalette(root);
		return root;
	}

	/**
	 * @generated
	 */
	protected PreferencesHint getPreferencesHint() {
		return org.mindmap.ui.diagram.actividadDiagram.part.ActDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
	}

	/**
	 * @generated
	 */
	public String getContributorId() {
		return org.mindmap.ui.diagram.actividadDiagram.part.ActDiagramEditorPlugin.ID;
	}

	/**
	 * @generated
	 */
	protected IDocumentProvider getDocumentProvider(IEditorInput input) {
		if (input instanceof URIEditorInput) {
			return org.mindmap.ui.diagram.actividadDiagram.part.ActDiagramEditorPlugin
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
			setDocumentProvider(org.mindmap.ui.diagram.actividadDiagram.part.ActDiagramEditorPlugin
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
		org.mindmap.ui.diagram.actividadDiagram.part.DiagramEditorContextMenuProvider provider = new org.mindmap.ui.diagram.actividadDiagram.part.DiagramEditorContextMenuProvider(
				this, getDiagramGraphicalViewer());
		getDiagramGraphicalViewer().setContextMenu(provider);
		getSite().registerContextMenu(ActionIds.DIAGRAM_EDITOR_CONTEXT_MENU,
				provider, getDiagramGraphicalViewer());
	}

	@Override
	public Object getAdapter(Class type) {
		if (type == IPropertySheetPage.class) {
			return new PropertiesBrowserPage(this) ;
	//		MyPropertySheet page = new MyPropertySheet();
	       // UndoableModelPropertySheetEntry root = new UndoableModelPropertySheetEntry(
	     //           OperationHistoryFactory.getOperationHistory());
	  //          MyPropertySheetEntry root= new MyPropertySheetEntry(OperationHistoryFactory.getOperationHistory());
	//         root.setPropertySourceProvider(new MindmapPropertySection());//getPropertySourceProvider());
	//		 page.setRootEntry(root);
	//		 return page;
			/*
			 * The PropertySheetPage is extended so that a PropertySheetSorter
			 * that does nothing (compares everything as equal) is being set.
			 * This way the properties will be displayed in the order they are
			 * returned by the property sources instead of being sorted
			 * alphabetically.
			 */
	/*		final PropertySheetPage page = new PropertySheetPage() {
				@Override
				public final void createControl(final Composite parent) {
					setSorter(new PropertySheetSorter() {
						@Override
						public int compare(final IPropertySheetEntry entryA,
								final IPropertySheetEntry entryB) {
							return 0;
						}
					});
					super.createControl(parent);
				}
			};
			// set the PropertySheetPage to use our command stack
			//UndoableModelPropertySheetEntry root = new UndoableModelPropertySheetEntry(
			//	                OperationHistoryFactory.getOperationHistory());
			page.setRootEntry(//root);
			new UndoablePropertySheetEntry(getCommandStack()));
			return page;*/
		}
		return super.getAdapter(type);
	}
}
