package org.mindmap.ui.diagram.conceptsDiagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;

/**
 * @generated
 */
public class MindmapCreationWizard extends Wizard implements INewWizard {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected org.mindmap.ui.diagram.conceptsDiagram.part.MindmapCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected org.mindmap.ui.diagram.conceptsDiagram.part.MindmapCreationWizardPage domainModelFilePage;

	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(org.mindmap.ui.diagram.conceptsDiagram.part.Messages.MindmapCreationWizardTitle);
		setDefaultPageImageDescriptor(org.mindmap.ui.diagram.conceptsDiagram.part.ConceptsMindmapDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewModelWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated
	 */
	public void addPages() {
		diagramModelFilePage = new org.mindmap.ui.diagram.conceptsDiagram.part.MindmapCreationWizardPage(
				"DiagramModelFile", getSelection(), "concepts_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(org.mindmap.ui.diagram.conceptsDiagram.part.Messages.MindmapCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(org.mindmap.ui.diagram.conceptsDiagram.part.Messages.MindmapCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new org.mindmap.ui.diagram.conceptsDiagram.part.MindmapCreationWizardPage(
				"DomainModelFile", getSelection(), "concepts") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length()
							- ".concepts_diagram".length()); //$NON-NLS-1$
					setFileName(org.mindmap.ui.diagram.conceptsDiagram.part.MindmapDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(),
									fileName, "concepts")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(org.mindmap.ui.diagram.conceptsDiagram.part.Messages.MindmapCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(org.mindmap.ui.diagram.conceptsDiagram.part.Messages.MindmapCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new IRunnableWithProgress() {

			public void run(IProgressMonitor monitor)
					throws InvocationTargetException, InterruptedException {
				diagram = org.mindmap.ui.diagram.conceptsDiagram.part.MindmapDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(),
								domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						org.mindmap.ui.diagram.conceptsDiagram.part.MindmapDiagramEditorUtil
								.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog
								.openError(
										getContainer().getShell(),
										org.mindmap.ui.diagram.conceptsDiagram.part.Messages.MindmapCreationWizardOpenEditorError,
										null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog
						.openError(
								getContainer().getShell(),
								org.mindmap.ui.diagram.conceptsDiagram.part.Messages.MindmapCreationWizardCreationError,
								null, ((CoreException) e.getTargetException())
										.getStatus());
			} else {
				org.mindmap.ui.diagram.conceptsDiagram.part.ConceptsMindmapDiagramEditorPlugin
						.getInstance()
						.logError(
								"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
