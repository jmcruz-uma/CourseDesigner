package org.mindmap.ui.diagram.conceptsDiagram.custom;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecp.core.exceptions.ECPProjectWithNameExistsException;
import org.eclipse.emf.ecp.core.util.ECPCheckoutSource;
import org.eclipse.emf.ecp.internal.core.ECPProjectManagerImpl;
import org.eclipse.emf.ecp.spi.core.InternalProject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.emfstore.client.ESLocalProject;
import org.eclipse.emf.emfstore.client.ESWorkspace;
import org.eclipse.emf.emfstore.client.ESWorkspaceProvider;
import org.eclipse.emf.emfstore.internal.client.model.ESWorkspaceProviderImpl;
import org.eclipse.emf.emfstore.internal.client.model.ProjectSpace;
import org.eclipse.emf.emfstore.internal.client.model.Workspace;
import org.eclipse.emf.emfstore.internal.client.model.impl.api.ESWorkspaceImpl;
import org.eclipse.emf.emfstore.internal.client.model.util.EMFStoreCommand;
import org.eclipse.emf.emfstore.server.exceptions.ESException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.mindmap.model.Curso;
import org.mindmap.model.CursoDiagrama;
import org.mindmap.model.control.ProjectControl;
import org.mindmap.model.impl.ModelPackageImpl;
import org.mindmap.ui.diagram.conceptsDiagram.custom.windows.ImportPerspective;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;
/**import custom.ProjectControl;**/
//org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;

public class Importar extends AbstractHandler {

	private String tempProject = " ";

	// Ambos editores deben estar abiertos para importar los elementos
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if (PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getActivePage().getEditorReferences().length < 2) {
			MessageDialog
					.openError(
							PlatformUI.getWorkbench()
									.getActiveWorkbenchWindow().getShell(),
							"Error",
							"Para realizar una importación los editores de ambos diagramas deben permanecer abiertos");
		} else {
			ESWorkspace workspace = ESWorkspaceProvider.INSTANCE.getWorkspace();
			List<ESLocalProject> prelista = workspace.getLocalProjects();

			// por si hubo algun error borramos todos los proyectos con nombre
			// " "
			buscarimportproyecto(prelista);

			final ISelection selection = HandlerUtil
					.getActiveMenuSelection(event);
			final IStructuredSelection ssel = (IStructuredSelection) selection;

			final List<ECPCheckoutSource> checkouts = new ArrayList<ECPCheckoutSource>();
			for (final Iterator<?> it = ssel.iterator(); it.hasNext();) {
				final Object element = it.next();
				if (element instanceof ECPCheckoutSource) {
					final ECPCheckoutSource checkoutSource = (ECPCheckoutSource) element;
					checkouts.add(checkoutSource);
				}
			}

			try {
				checkouts.get(0).checkout(tempProject, null);
			} catch (ECPProjectWithNameExistsException e1) {
				// TODO Bloque catch generado automáticamente
				e1.printStackTrace();
			}

			List<ESLocalProject> lista = workspace.getLocalProjects();

			//Buscamos el proyecto descargado del que importaremos los elementos
			int i = ProjectControl.buscarProyectoLocal(lista, tempProject);

			if (i != -1) {
				ESLocalProject proyecto = lista.get(i);
				ProjectControl.importproject = proyecto;
				ProjectControl.importrunning=true;
				ProjectControl.continuarupdate=false;
				EList<EObject> m = proyecto.getModelElements();
				
				// Concepts Diagram
				Curso curso = (Curso) m.get(0);
				EList<CursoDiagrama> diagramas = curso.getDiagramas();

				CursoDiagrama conceptsdiagram = diagramas.get(0);
				URI conceptsuri = EcoreUtil.getURI(conceptsdiagram);
				conceptsuri.appendFragment(conceptsdiagram.eResource()
						.getURIFragment(conceptsdiagram));
				URIEditorInput conceptsinput = new URIEditorInput(conceptsuri,
						"Conceptos "
								+ checkouts.get(0).getDefaultCheckoutName());

				//Actividades Diagram
				CursoDiagrama actdiagram = diagramas.get(1);
				URI acturi = EcoreUtil.getURI(actdiagram);
				acturi.appendFragment(actdiagram.eResource().getURIFragment(
						actdiagram));
				URIEditorInput actinput = new URIEditorInput(acturi,
						"Actividades "
								+ checkouts.get(0).getDefaultCheckoutName());

				try {

					//Guardamos la ventana principal y la escondemos. 
					//Abrimos las ventanas con los diagramas para importar con su perspectiva
					IWorkbenchWindow principalWindow = PlatformUI
							.getWorkbench().getActiveWorkbenchWindow();
					principalWindow.getShell().setVisible(false);
					ProjectControl.principalWindow = principalWindow;

					ProjectControl.importConceptsWindow = PlatformUI
							.getWorkbench().openWorkbenchWindow(
									ImportPerspective.PERSPECTIVE_ID, null);
					ProjectControl.importActivitiesWindow = PlatformUI
							.getWorkbench().openWorkbenchWindow(
									ImportPerspective.PERSPECTIVE_ID, null);

					try {

						ProjectControl.importConceptsWindow.getActivePage()
								.showView("org.eclipse.ui.views.PropertySheet");
						ProjectControl.importConceptsWindow
								.getActivePage()
								.openEditor(
										conceptsinput,
										org.mindmap.ui.diagram.conceptsDiagram.part.ConceptsMindmapEditorReadOnly.ID,
										true);

						ProjectControl.importActivitiesWindow.getActivePage()
								.showView("org.eclipse.ui.views.PropertySheet");
						ProjectControl.importActivitiesWindow
								.getActivePage()
								.openEditor(
										actinput,
										org.mindmap.ui.diagram.actividadDiagram.part.ActMindmapEditorReadOnly.ID,
										false);

					} catch (PartInitException e1) {
						// TODO Bloque catch generado automáticamente
						e1.printStackTrace();
					}

					// Aunque pongamos los editores solo lectura la hoja de
					// propiedades es modificable
					// Hay que modificar desde el editing domain los recursos
					// que
					// queramos poner solo lectura

					EditingDomain editingDomain = ESWorkspaceProviderImpl
							.getInstance().getEditingDomain();
					Map map = new HashMap();

					Resource conceptsResource = conceptsdiagram.eResource();
					map.put(conceptsResource, true);

					Resource actResource = actdiagram.eResource();
					map.put(actResource, true);

					((AdapterFactoryEditingDomain) editingDomain)
							.setResourceToReadOnlyMap(map);

				} catch (PartInitException e) {
					// TODO Bloque catch generado automáticamente
					e.printStackTrace();
				} catch (WorkbenchException e) {
					// TODO Bloque catch generado automáticamente
					e.printStackTrace();
				}

			}
		}
		return null;
	}

	private void buscarimportproyecto(List<ESLocalProject> lista) {
		final List<ESLocalProject> aux = new LinkedList<ESLocalProject>();

		int i = 0;
		while (i < lista.size()) {
			if (lista.get(i).getProjectName().equals(tempProject)) {
				aux.add(lista.get(i));
			}

			i++;
		}
		
		// En aux estaran todos los proyectos con nombre tempProject= " " que es
		// único para proyectos importados

		new EMFStoreCommand() {
			protected void doRun() {
				for (int c = aux.size() - 1; c >= 0; c--) {
					ESLocalProject p = aux.get(c);
					try {
						InternalProject e = ECPProjectManagerImpl.INSTANCE
								.getElement(tempProject);
						if (e.canDelete()) {
							e.delete();
						} else {
							p.delete(null);
						}
					} catch (IOException e) {
						// TODO Bloque catch generado automáticamente
						e.printStackTrace();
					} catch (ESException e) {
						e.printStackTrace();
					}
				}
			}
		}.run(true);

	}

}
