package org.mindmap.ui.diagram.conceptsDiagram.custom;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.emfstore.client.ESLocalProject;
import org.eclipse.emf.emfstore.client.ESWorkspace;
import org.eclipse.emf.emfstore.client.ESWorkspaceProvider;
import org.eclipse.emf.emfstore.internal.client.model.Configuration;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ListDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.mindmap.model.Curso;
import org.mindmap.model.CursoDiagrama;
import org.mindmap.model.ModelPackage;
import org.mindmap.model.Tema;
import org.mindmap.model.control.ProjectControl;
//import org.mindmap.model.control.ProjectControl;
import org.mindmap.model.impl.ModelPackageImpl;

public class AbrirProyecto extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);

		ESWorkspace workspace = ESWorkspaceProvider.INSTANCE.getWorkspace();
		List<ESLocalProject> lista = workspace.getLocalProjects();

		Configuration.getClientBehavior().setAutoSave(true);
		// Al abrir la vista ModelRepositoriesView se pone en false

		Shell shell = window.getShell();

		// Dialog que muestra los nombres proyectos locales disponibles
		Object[] res = abrirProyectoDialog(lista, shell);

		if (res != null) {
			String st = res[0].toString();

			// Buscamos el proyecto y cargamos los editores
			int i = ProjectControl.buscarProyectoLocal(lista, st);
			if (i != -1) {// Encontrado-Existe
				// Borramos los literales del otro proyecto
				ModelPackageImpl mp = (ModelPackageImpl) ModelPackageImpl
						.init();
				mp.removeAllBloques();
				ProjectControl.limpiarCarpetaScorm();
				ESLocalProject proyecto = lista.get(i);

				EList<EObject> m = proyecto.getModelElements();

				Curso curso = (Curso) m.get(0);

				// Concepts Diagram

				CursoDiagrama conceptsdiagram = curso.getDiagramas().get(0);
				URI conceptsuri = EcoreUtil.getURI(conceptsdiagram);
				conceptsuri.appendFragment(conceptsdiagram.eResource()
						.getURIFragment(conceptsdiagram));
				URIEditorInput conceptsinput = new URIEditorInput(conceptsuri,
						"Conceptos " + st);

				// Cargo Bloques/literales
				EList<Tema> listaTemas = conceptsdiagram.getTemas();

				for (int j = 0; j < listaTemas.size(); j++) {
					if (listaTemas.get(j).getNombre() != null) {
						mp.addBloque(listaTemas.get(j).getNombre(), listaTemas
								.get(j).getNombre());
					}
				}
				// Actividad Diagram
				CursoDiagrama actdiagram = curso.getDiagramas().get(1);
				URI acturi = EcoreUtil.getURI(actdiagram);
				acturi.appendFragment(actdiagram.eResource().getURIFragment(
						actdiagram));
				URIEditorInput actinput = new URIEditorInput(acturi,
						"Actividades " + st);

				try {
					ProjectControl.actualproject = proyecto;
					PlatformUI.getWorkbench().getActiveWorkbenchWindow()
							.getActivePage().closeAllEditors(true);

					PlatformUI.getWorkbench().getActiveWorkbenchWindow()
							.getActivePage()
							.showView("org.eclipse.ui.views.PropertySheet");
					PlatformUI
							.getWorkbench()
							.getActiveWorkbenchWindow()
							.getActivePage()
							.openEditor(
									conceptsinput,
									org.mindmap.ui.diagram.conceptsDiagram.part.MindmapDiagramEditor.ID,
									true);
					PlatformUI
							.getWorkbench()
							.getActiveWorkbenchWindow()
							.getActivePage()
							.openEditor(
									actinput,
									org.mindmap.ui.diagram.actividadDiagram.part.ActMindmapDiagramEditor.ID,
									false);
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

		}

		return null;
	}

	private Object[] abrirProyectoDialog(List<ESLocalProject> lista, Shell shell) {
		ListDialog ld = new ListDialog(shell);
		ld.setAddCancelButton(true);
		ld.setContentProvider(new ArrayContentProvider());

		ld.setLabelProvider(new LabelProvider());

		String[] nombresProyectos = new String[lista.size()];

		int c = 0;
		while (c < lista.size()) {
			nombresProyectos[c] = lista.get(c).getProjectName();
			c++;
		}
		ld.setMessage("Seleccione un proyecto");

		ld.setInput(nombresProyectos);

		ld.setTitle("Abrir Proyecto");
		ld.open();

		return ld.getResult();

	}
}
