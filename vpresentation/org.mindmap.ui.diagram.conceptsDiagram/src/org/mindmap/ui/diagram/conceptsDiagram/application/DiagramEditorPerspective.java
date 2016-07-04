package org.mindmap.ui.diagram.conceptsDiagram.application;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.emf.ecp.ui.views.ModelRepositoriesView;
import org.eclipse.emf.emfstore.client.ESWorkspace;
import org.eclipse.emf.emfstore.client.ESWorkspaceProvider;
import org.eclipse.emf.emfstore.internal.client.model.ESWorkspaceProviderImpl;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.mindmap.ui.diagram.conceptsDiagram.custom.MyUpdateObserver;
import org.mindmap.ui.diagram.custom.application.MyValidationView;

/**
 * @generated
 */
public class DiagramEditorPerspective implements IPerspectiveFactory {
	/**
	 * @generated NOT
	 */
	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(true);
		layout.addPerspectiveShortcut(org.mindmap.ui.diagram.conceptsDiagram.application.DiagramEditorWorkbenchAdvisor.PERSPECTIVE_ID);
		IFolderLayout right = layout.createFolder(
				"right", IPageLayout.RIGHT, 0.6f, layout.getEditorArea()); //$NON-NLS-1$
		right.addView(IPageLayout.ID_OUTLINE);
		IFolderLayout bottomRight = layout.createFolder(
				"bottomRight", IPageLayout.BOTTOM, 0.6f, "right"); //$NON-NLS-1$	 //$NON-NLS-2$
		
		bottomRight.addView(ModelRepositoriesView.ID);

		bottomRight.addPlaceholder(IPageLayout.ID_PROP_SHEET);
		bottomRight
				.addPlaceholder(org.mindmap.ui.diagram.custom.application.MyValidationView.ID);


		layout.getViewLayout(IPageLayout.ID_PROP_SHEET).setCloseable(false);
		layout.getViewLayout(IPageLayout.ID_OUTLINE).setCloseable(false);
		layout.getViewLayout(ModelRepositoriesView.ID).setCloseable(false);
		layout.getViewLayout(MyValidationView.ID).setCloseable(false);
		ESWorkspaceProviderImpl workspace = ESWorkspaceProviderImpl.getInstance();//.INSTANCE.getWorkspace();
		MyUpdateObserver mu = new MyUpdateObserver();
		workspace.getObserverBus().register(mu);

	}
}
