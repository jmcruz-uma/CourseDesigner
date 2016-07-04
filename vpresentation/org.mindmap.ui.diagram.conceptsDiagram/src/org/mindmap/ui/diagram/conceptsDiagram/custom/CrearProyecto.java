package org.mindmap.ui.diagram.conceptsDiagram.custom;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.core.util.ECPUtil;
//import org.eclipse.emf.ecp.core.ECPProject;
//import org.eclipse.emf.ecp.core.util.ECPUtil;
import org.eclipse.emf.emfstore.client.ESLocalProject;
import org.eclipse.emf.emfstore.client.ESWorkspaceProvider;
import org.eclipse.emf.emfstore.internal.client.model.Configuration;
import org.eclipse.emf.emfstore.internal.client.model.ProjectSpace;
import org.eclipse.emf.emfstore.internal.client.model.Workspace;
import org.eclipse.emf.emfstore.internal.client.model.filetransfer.FileInformation;
import org.eclipse.emf.emfstore.internal.client.model.impl.api.ESWorkspaceImpl;
import org.eclipse.emf.emfstore.internal.client.model.util.EMFStoreCommand;
import org.eclipse.emf.emfstore.internal.common.model.Project;
import org.eclipse.emf.emfstore.internal.server.exceptions.FileTransferException;
import org.eclipse.emf.emfstore.internal.server.model.FileIdentifier;
import org.eclipse.emf.emfstore.server.model.ESGlobalProjectId;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.mindmap.model.ActividadDiagrama;
import org.mindmap.model.ConceptosDiagrama;
import org.mindmap.model.Curso;
import org.mindmap.model.ModelFactory;
import org.mindmap.model.PropiedadCurso;
import org.mindmap.model.control.ProjectControl;
import org.mindmap.model.impl.ModelPackageImpl;

public class CrearProyecto extends AbstractHandler {
	private static void showError(Shell shell, String title, String message) {
		MessageDialog.openError(shell, title, message);
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		Configuration.getClientBehavior().setAutoSave(true);// Al abrir la vista
															// ModelRepositoriesView
															// se pone en false

		Collection<ECPProject> lp = ECPUtil.getECPProjectManager()
				.getProjects();

		ESWorkspaceImpl workspace = (ESWorkspaceImpl) ESWorkspaceProvider.INSTANCE
				.getWorkspace();
		final List<ESLocalProject> listan = workspace.getLocalProjects();

		InputDialog id = new InputDialog(null, "Crea un curso", "Nombre",
				"", new IInputValidator() {
					public String isValid(String newText) {
						int i = 0;
						while (i < listan.size()
								&& !listan.get(i).getProjectName()
										.equals(newText)) {
							i++;
						}
						if (i < listan.size()) {
							return "Proyecto ya creado. Inserte otro nombre";
						} else if (newText.equals("")
								|| (newText).trim().length() == 0) {
							return "Inserte un nombre válido";
						} else {
							return null;
						}

					}
				});
		int result = id.open();
		if (result == InputDialog.OK) {// Nombre correcto-> creamos el curso

			ProjectControl.limpiarCarpetaScorm();
			String name = id.getValue();
			ESLocalProject newProject = workspace.createLocalProject(name);

			// Limpiamos los bloques-literales
			ModelPackageImpl m = (ModelPackageImpl) ModelPackageImpl.init();
			m.removeAllBloques();

			// Creamos nuestro Curso
			final EList<EObject> lista = newProject.getModelElements();

			final Curso curso = ModelFactory.eINSTANCE.createCurso();
			new EMFStoreCommand() {
				protected void doRun() {
					lista.add(curso);
				}
			}.run(true);

			final ConceptosDiagrama temaDiagram = ModelFactory.eINSTANCE
					.createConceptosDiagrama();
			final ActividadDiagrama actDiagram = ModelFactory.eINSTANCE
					.createActividadDiagrama();
			final PropiedadCurso cursoPropiedades = ModelFactory.eINSTANCE
					.createPropiedadCurso();

			new EMFStoreCommand() {
				protected void doRun() {
					curso.getDiagramas().add(temaDiagram);
					curso.getDiagramas().add(actDiagram);
					curso.setPropiedades(cursoPropiedades);
				}
			}.run(true);

			URI uritema = EcoreUtil.getURI(temaDiagram);
			uritema.appendFragment(temaDiagram.eResource().getURIFragment(
					temaDiagram));
			URIEditorInput inputtema = new URIEditorInput(uritema, "Conceptos "
					+ name);

			URI uriact = EcoreUtil.getURI(actDiagram);
			uriact.appendFragment(actDiagram.eResource().getURIFragment(
					actDiagram));
			URIEditorInput inputact = new URIEditorInput(uriact, "Actividades "
					+ name);
			// Abrimos los editores
			try {
				ProjectControl.actualproject = newProject;

				PlatformUI.getWorkbench().getActiveWorkbenchWindow()
						.getActivePage().closeAllEditors(false);

				PlatformUI.getWorkbench().getActiveWorkbenchWindow()
						.getActivePage()
						.showView("org.eclipse.ui.views.PropertySheet");
				PlatformUI
						.getWorkbench()
						.getActiveWorkbenchWindow()
						.getActivePage()
						.openEditor(
								inputtema,
								org.mindmap.ui.diagram.conceptsDiagram.part.MindmapDiagramEditor.ID,
								true);
				IEditorPart conEditor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();

				PlatformUI
						.getWorkbench()
						.getActiveWorkbenchWindow()
						.getActivePage()
						.openEditor(
								inputact,
								org.mindmap.ui.diagram.actividadDiagram.part.ActMindmapDiagramEditor.ID,
								false);

				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().activate(conEditor);
			} catch (PartInitException e) {
				ErrorDialog.openError(PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getShell(), "Error",
						e.getMessage(), e.getStatus());
			} catch (Exception e) {
				ErrorDialog.openError(PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getShell(), "Error",
						e.getMessage(), null);
			}

		}

		return null;
	}

}
