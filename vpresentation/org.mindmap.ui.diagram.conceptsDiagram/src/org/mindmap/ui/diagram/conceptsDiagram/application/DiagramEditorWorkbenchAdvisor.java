package org.mindmap.ui.diagram.conceptsDiagram.application;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.IWorkbenchConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.eclipse.ui.part.IPage;

/**
 * @generated
 */
public class DiagramEditorWorkbenchAdvisor extends WorkbenchAdvisor {
	/**
	 * @generated
	 */
	public static final String PERSPECTIVE_ID = "org.mindmap.ui.diagram.conceptsDiagram.ConceptsPerspective"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public String getInitialWindowPerspectiveId() {
		return PERSPECTIVE_ID;
	}

	/**
	 * @generated
	 */
	public void initialize(IWorkbenchConfigurer configurer) {
		super.initialize(configurer);
		configurer.setSaveAndRestore(true);
	}

	/**
	 * @generated
	 */
	public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(
			IWorkbenchWindowConfigurer configurer) {
		return new org.mindmap.ui.diagram.conceptsDiagram.application.DiagramEditorWorkbenchWindowAdvisor(
				configurer);
	}

	@Override
	public boolean preShutdown() {

		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.closeAllEditors(false);
		IWorkbenchPage wp = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();

		wp.resetPerspective();
		return true;
	}
}
