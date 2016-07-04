package org.mindmap.ui.diagram.conceptsDiagram.application;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.runtime.IExtension;
import org.eclipse.emf.ecp.internal.core.ECPProjectManagerImpl;
import org.eclipse.emf.emfstore.client.ESLocalProject;
import org.eclipse.emf.emfstore.client.ESWorkspace;
import org.eclipse.emf.emfstore.client.ESWorkspaceProvider;
import org.eclipse.emf.emfstore.server.exceptions.ESException;
import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.internal.WorkbenchPlugin;
import org.eclipse.ui.internal.registry.ActionSetRegistry;
import org.eclipse.ui.internal.registry.IActionSetDescriptor;
import org.mindmap.model.control.ProjectControl;

/**
 * @generated
 */
public class DiagramEditorWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

	/**
	 * @generated
	 */
	public DiagramEditorWorkbenchWindowAdvisor(
			IWorkbenchWindowConfigurer configurer) {
		super(configurer);
	}

	/**
	 * @generated
	 */
	public ActionBarAdvisor createActionBarAdvisor(
			IActionBarConfigurer configurer) {
		return new org.mindmap.ui.diagram.conceptsDiagram.application.DiagramEditorActionBarAdvisor(
				configurer);
	}

	/**
	 * @generated NOT
	 */
	public void preWindowOpen() {
		IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
		configurer.setInitialSize(new Point(1000, 700));
		configurer
				.setTitle(org.mindmap.ui.diagram.conceptsDiagram.part.Messages.DiagramEditorWorkbenchWindowAdvisor_Title);
		removeUnWantedActions();
	}

	@Override
	public boolean preWindowShellClose() {
		boolean result = true;
		// custom dialog code goes here.
		// And the variable result is updated by the choice of the dialog.
		IWorkbenchPage activePage = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();
	
		activePage.closeEditors(activePage.getEditorReferences(), true);
		if (PlatformUI.getWorkbench().getWorkbenchWindowCount() == 2) {
			ProjectControl.principalWindow.getShell().setVisible(true);
			ProjectControl.principalWindow.getActivePage().getActiveEditor()
					.setFocus();
			ProjectControl.importrunning=false;
			ProjectControl.continuarupdate=false;

			ESWorkspace workspace = ESWorkspaceProvider.INSTANCE.getWorkspace();
			final List<ESLocalProject> listan = workspace.getLocalProjects();
			int i = 0;
		
			while (i < listan.size()
					&& !listan
							.get(i)
							.getLocalProjectId()
							.getId()
							.equals(ProjectControl.importproject
									.getLocalProjectId().getId())) {
				i++;
			}
			if (i < listan.size()) {

				try {
					listan.get(i).delete(null);
					
					ECPProjectManagerImpl.INSTANCE.getElement(
							ProjectControl.importproject.getProjectName())
							.delete();
				} catch (IOException e) {
					// TODO Bloque catch generado automáticamente
					e.printStackTrace();
				}catch(ESException e)
				{
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	private static final String[] actionSetId = new String[] {
			"org.eclipse.ui.WorkingSetActionSet", //$NON-NLS-1$
			"org.eclipse.ui.edit.text.actionSet.navigation", //$NON-NLS-1$
			"org.eclipse.ui.edit.text.actionSet.convertLineDelimitersTo", //$NON-NLS-1$
			"org.eclipse.ui.actionSet.openFiles", //$NON-NLS-1$
			"org.eclipse.ui.edit.text.actionSet.annotationNavigation", //$NON-NLS-1$
			"org.eclipse.ui.NavigateActionSet", //$NON-NLS-1$
			"org.eclipse.search.searchActionSet" }; //$NON-NLS-1$

	private void removeUnWantedActions() {
		ActionSetRegistry asr = WorkbenchPlugin.getDefault()
				.getActionSetRegistry();
		IActionSetDescriptor[] actionSets = asr.getActionSets();

		IExtension ext = null;
		for (IActionSetDescriptor actionSet : actionSets) {
			for (String element : actionSetId) {

				if (element.equals(actionSet.getId())) {
					ext = actionSet.getConfigurationElement()
							.getDeclaringExtension();
					asr.removeExtension(ext, new Object[] { actionSet });
				}
			}
		}
	}
}
