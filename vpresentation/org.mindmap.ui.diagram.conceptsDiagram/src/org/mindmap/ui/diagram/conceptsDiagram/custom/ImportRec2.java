package org.mindmap.ui.diagram.conceptsDiagram.custom;

import java.awt.Color;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.emfstore.internal.client.model.util.EMFStoreCommand;
import org.eclipse.emf.emfstore.internal.client.model.util.WorkspaceUtil;
import org.eclipse.emf.emfstore.internal.client.ui.common.Messages;
import org.eclipse.emf.emfstore.server.exceptions.ESException;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredCreateConnectionViewAndElementCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest.ConnectionViewAndElementDescriptor;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest.ViewAndElementDescriptor;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.Bendpoints;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.EdgeImpl;
import org.eclipse.gmf.runtime.notation.impl.ShapeImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.text.AbstractInformationControlManager.Anchor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.progress.IProgressService;
import org.mindmap.model.Actividad;
import org.mindmap.model.ActividadEspacio;
import org.mindmap.model.Atributo;
import org.mindmap.model.Concepto;
import org.mindmap.model.CursoElement;
//import org.mindmap.model.Examen;
import org.mindmap.model.Leccion;
import org.mindmap.model.ModelFactory;
import org.mindmap.model.ModelPackage;
import org.mindmap.model.Tarea;
import org.mindmap.model.Tema;
import org.mindmap.model.control.ProjectControl;
import org.mindmap.model.impl.ActividadEspacioImpl;
import org.mindmap.model.impl.ActividadImpl;
import org.mindmap.model.impl.ActividadNodoFinalImpl;
import org.mindmap.model.impl.ActividadNodoInicialImpl;
import org.mindmap.model.impl.ActividadUnionBifurcacionImpl;
import org.mindmap.model.impl.AtributoImpl;
import org.mindmap.model.impl.ConceptoImpl;
//import org.mindmap.model.impl.ExamenImpl;
import org.mindmap.model.impl.LeccionImpl;
import org.mindmap.model.impl.TareaImpl;
import org.mindmap.model.impl.TemaImpl;
import org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadActividadCompartmentEditPart;
//import org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadDiagramEditPart;
import org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadDiagramaEditPart;
import org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEditPart;
import org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEspacioActividadEspacioCompartmentEditPart;
import org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEspacioEditPart;
import org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptoAtributoCompartmentEditPart;
import org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptoEditPart;
//import org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptsDiagramEditPart;
import org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptosDiagramEditPart;
import org.mindmap.ui.diagram.conceptsDiagram.edit.parts.TemaBloqueCompartmentEditPart;
import org.mindmap.ui.diagram.conceptsDiagram.edit.parts.TemaEditPart;

public class ImportRec2 extends AbstractHandler {

	private boolean fork = true;
	private IEditorPart activeEditor = null;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow wactual = HandlerUtil.getActiveWorkbenchWindow(event);
		final Shell shell = HandlerUtil.getActiveShell(event);

		IWorkbenchWindow preWindow = ProjectControl.principalWindow;
		final IEditorPart preEditorAct;
		final IEditorPart preEditorCon;
		IEditorReference[] edr = preWindow.getActivePage()
				.getEditorReferences();

		//Identificamos cada diagrama
			if (edr[0]
					.getId()
					.equals(org.mindmap.ui.diagram.actividadDiagram.part.ActMindmapDiagramEditor.ID)) {
				IEditorReference preEditorRefAct = edr[0];
				preEditorAct = preEditorRefAct.getEditor(false);

				IEditorReference preEditorRefCon = edr[1];
				preEditorCon = preEditorRefCon.getEditor(false);
			} else {
				IEditorReference preEditorRefCon = edr[0];
				preEditorCon = preEditorRefCon.getEditor(false);

				IEditorReference preEditorRefAct = edr[1];
				preEditorAct = preEditorRefAct.getEditor(false);
			}

			ISelection selection = HandlerUtil.getCurrentSelection(event);

			if (selection instanceof IStructuredSelection) {
				IStructuredSelection ss = (IStructuredSelection) selection;
				final Iterator iter = ss.iterator();
				
				//La importación se pide desde la ventana con el diagrama de actividades
				if (ProjectControl.importActivitiesWindow != null
						&& ProjectControl.importActivitiesWindow
								.equals(wactual)) {

					final IWorkbench workbench = PlatformUI.getWorkbench();
					activeEditor = PlatformUI.getWorkbench()
							.getActiveWorkbenchWindow().getActivePage()
							.getActiveEditor();

					final IProgressService progressService = workbench
							.getProgressService();

					try {

						progressService.run(fork, false,
								new IRunnableWithProgress() {

									public void run(
											final IProgressMonitor monitor) {
										try {
											doRunActivities(iter, preEditorAct);
										} catch (final ESException e) {
											MessageDialog.openError(shell,
													"Error", e.getMessage());
										}
									}
								});

					} catch (final InvocationTargetException e) {
						WorkspaceUtil.logException(
								Messages.MonitoredEMFStoreAction
										+ e.getMessage(), e);
					} catch (final InterruptedException e) {
						WorkspaceUtil.logException(
								Messages.MonitoredEMFStoreAction
										+ e.getMessage(), e);
					}
					ProjectControl.importActivitiesWindow.getShell().close();
					ProjectControl.importActivitiesWindow.close();

					ProjectControl.importActivitiesWindow = null;
				} else {// Se ha llamado desde la ventana de concepts

					final IWorkbench workbench = PlatformUI.getWorkbench();
					final IProgressService progressService = workbench
							.getProgressService();

					try {

						progressService.run(fork, false,
								new IRunnableWithProgress() {

									public void run(
											final IProgressMonitor monitor) {
										try {
											doRunConcepts(iter, preEditorCon);
										} catch (final ESException e) {

											MessageDialog.openError(shell,
													"Error", e.getMessage());
										}
									}
								});

					} catch (final InvocationTargetException e) {
						WorkspaceUtil.logException(
								Messages.MonitoredEMFStoreAction
										+ e.getMessage(), e);
					} catch (final InterruptedException e) {
						WorkspaceUtil.logException(
								Messages.MonitoredEMFStoreAction
										+ e.getMessage(), e);
					}
					ProjectControl.importConceptsWindow.getShell().close();
					ProjectControl.importConceptsWindow.close();
					ProjectControl.importConceptsWindow = null;

				}
			}
	
		return null;
	}

	private void doRunActivities(Iterator iter, IEditorPart preEditorAct)
			throws ESException {
		//Map que contiene como claves los enlaces relacionados con los nodos importados
		//como valores tiene first:source element, last:target element
		Map<EdgeImpl, LinkedList> m = new HashMap<EdgeImpl, LinkedList>();

		DiagramDocumentEditor prediagram = (DiagramDocumentEditor) preEditorAct;
		DiagramEditPart actedp = prediagram.getDiagramEditPart();
		while (iter.hasNext()) {

			Object item = iter.next();

			// no entrar si no es topnode- tampoco va a entrar si es Edge porque
			// su parent es Root..
			if (item instanceof IGraphicalEditPart
					&& (((IGraphicalEditPart) item).getParent() instanceof ActividadDiagramaEditPart)) {
				AgregarNodoActividades(item, (EditPart) actedp,
						(EditPart) actedp, m);
			}
		}
		// añadir los edges

		Set<EdgeImpl> keyset = m.keySet();
		for (EdgeImpl k : keyset) {
			if ((m.get(k)).size() > 1) {//El enlace tiene target y source por lo
										// que se puede importar

				AñadirEdgeActividades(k, m.get(k), (EditPart) actedp);
			}
		}

	}

	private void doRunConcepts(Iterator iter, IEditorPart preEditorCon)
			throws ESException {
		//Map que contiene como claves los enlaces relacionados con los nodos importados
		//como valores tiene first:source element, last:target element
		Map<EdgeImpl, LinkedList> mC = new HashMap<EdgeImpl, LinkedList>();

		DiagramDocumentEditor prediagram = (DiagramDocumentEditor) preEditorCon;
		DiagramEditPart actedp = prediagram.getDiagramEditPart();

		while (iter.hasNext()) {

			// no entrar si no es topnode- tampoco va a entrar si es Edge porque
			// su parent es Root..
			Object item = iter.next();
			if (item instanceof IGraphicalEditPart
					&& (((IGraphicalEditPart) item).getParent() instanceof ConceptosDiagramEditPart)) {
				AgregarNodoConcepts(item, (EditPart) actedp, (EditPart) actedp,
						mC);
			}
		}

		// añadir los edges
		Set<EdgeImpl> keyset = mC.keySet();
		for (EdgeImpl k : keyset) {
			if ((mC.get(k)).size() > 1) {//El enlace tiene target y source por lo
											// que se puede importar

				AñadirEdgeConcepts(k, mC.get(k), (EditPart) actedp);
			}
		}

	}

	private void AgregarNodoActividades(Object item, EditPart padre,
			EditPart canvas, Map<EdgeImpl, LinkedList> m) {
		if (item instanceof IGraphicalEditPart) {
			IGraphicalEditPart gpart = (IGraphicalEditPart) item;
			View view = (View) gpart.getModel();
			EObject element = view.getElement();

			
			int vid = org.mindmap.ui.diagram.actividadDiagram.part.MindmapVisualIDRegistry
					.getVisualID(view);
			IElementType type = org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes
					.getElementType(vid);

			//Creamos el elemento nuevo
			CreateElementRequest cer = new CreateElementRequest(type);
			ViewAndElementDescriptor viewDescriptor = null;
			CreateViewAndElementRequest req = null;

			viewDescriptor = new ViewAndElementDescriptor(
					new CreateElementRequestAdapter(cer), Node.class,
					((IHintedType) type).getSemanticHint(),
					((GraphicalEditPart) canvas).getDiagramPreferencesHint());
			req = new CreateViewAndElementRequest(viewDescriptor);
			Rectangle rec = gpart.getFigure().getBounds();
			req.setLocation(rec.getLocation());
			req.setSize(rec.getSize());

			final CompoundCommand cmd = new CompoundCommand("Create "
					+ type.toString());

			cmd.add(padre.getCommand(req));

			((GraphicalEditPart) padre).getDiagramEditDomain()
					.getDiagramCommandStack().execute(cmd);

			IAdaptable adapter = viewDescriptor.getElementAdapter();

			Object ac = adapter.getAdapter(element.getClass());

			// ac es un elemento de nuestro modelo-> todos tienen el metodo importar
			boolean tienehijos = ((CursoElement) ac).importar(element);
			Object s = ((GraphicalEditPart) canvas).findEditPart(canvas,
					(EObject) ac);
			EditPart ed = (EditPart) s;
			if (tienehijos) {
				List children = gpart.getChildren();

				EditPart e = (EditPart) ed.getChildren().get(1);// cogemos el
																// compartimento
				if (children.size() > 1) {
					Object compartimento = children.get(1);
					EditPart c = (EditPart) compartimento;
					List hijos = c.getChildren();
					if (hijos != null) {
						for (int jk = 0; jk < hijos.size(); jk++) {
							//Llamamos recursivamente al método con: elemento a importar->hijo,
							//su padre, el canvas y el map con los enlaces
							AgregarNodoActividades(hijos.get(jk), e, canvas, m);
						}
					}
				}
			}

			Object notation0 = ed.getModel();

			//Lo coloreamos
			if (notation0 instanceof ShapeImpl) {
				
				final ShapeImpl notation = (ShapeImpl) notation0;
				new EMFStoreCommand() {
					protected void doRun() {
						RGB rgb = new RGB(255, 255, 153);
						notation.setFillColor(FigureUtilities.RGBToInteger(rgb));
					}
				}.run(true);
			}
			
			//Agregamos los enlaces de los que el elemento es source
			EList<EdgeImpl> se = view.getSourceEdges();
			for (int i = 0; i < se.size(); i++) {
				EdgeImpl key = se.get(i);
				if (!m.containsKey(key)) {
					LinkedList<Object> extremos = new LinkedList<Object>();
					extremos.addFirst(ac);
					m.put(key, extremos);
				} else {// Si ya esta creado es porque tiene un
						// target->agregar como first igual y sustituir
					LinkedList<Object> ob = (LinkedList<Object>) m.get(key);
					ob.addFirst(ac);
				}

			}
			// Ahora los targets
			EList<EdgeImpl> te = view.getTargetEdges();
			for (int i = 0; i < te.size(); i++) {
				EdgeImpl key = te.get(i);
				if (!m.containsKey(key)) {
					LinkedList<Object> extremos2 = new LinkedList<Object>();
					extremos2.addLast(ac);
					m.put(key, extremos2);
				} else {// Si ya esta creado es porque tiene un
						// source->agregar como last igual y sustituir
					LinkedList<Object> ob = (LinkedList<Object>) m.get(key);
					ob.addLast(ac);
				}

			}

		}

	}

	//Creamos los Edges y los añadimos con un command
	private void AñadirEdgeActividades(Edge item, LinkedList extremos,
			EditPart canvas) {
		IEditorPart actEditor = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		DiagramDocumentEditor prediagram = (DiagramDocumentEditor) actEditor;
		DiagramEditPart actedp = prediagram.getDiagramEditPart();
		EditPart actp = actedp.getParent();

		View view = (View) item;

		int vid = org.mindmap.ui.diagram.actividadDiagram.part.MindmapVisualIDRegistry
				.getVisualID(view);
		IElementType connectionType = org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes
				.getElementType(vid);

		CreateRelationshipRequest relationShipReq = new CreateRelationshipRequest(
				connectionType);
		ConnectionViewAndElementDescriptor desc = new ConnectionViewAndElementDescriptor(
				new CreateElementRequestAdapter(relationShipReq),
				connectionType instanceof IHintedType ? ((IHintedType) connectionType)
						.getSemanticHint() : "",
				((IGraphicalEditPart) canvas).getDiagramPreferencesHint());// getDefaultPreferencesHint());
		CreateConnectionViewAndElementRequest req = new CreateConnectionViewAndElementRequest(
				desc);
		req.setType(RequestConstants.REQ_CONNECTION_START);

		EObject sourceElement = (EObject) extremos.getFirst();
		EObject targetElement = (EObject) extremos.getLast();

		EditPart sourceEditPart = ((IGraphicalEditPart) canvas).findEditPart(
				canvas, sourceElement);
		EditPart targetEditPart = ((IGraphicalEditPart) canvas).findEditPart(
				canvas, targetElement);

		req.setSourceEditPart(sourceEditPart);
		Command sourceCmd = sourceEditPart.getCommand(req);
		if (!(sourceCmd == null || !sourceCmd.canExecute())) {

			if (targetEditPart != null) {
				req.setType(RequestConstants.REQ_CONNECTION_END);
				req.setTargetEditPart(targetEditPart);
				req.setLocation(new Point(0, 0));
				sourceEditPart.getCommand(req);
				Command targetCmd = targetEditPart.getCommand(req);

				((GraphicalEditPart) canvas).getDiagramEditDomain()
						.getDiagramCommandStack().execute(targetCmd);
			}
		}

		IAdaptable adapter = desc.getElementAdapter();

		EObject element = view.getElement();
		Object ac = adapter.getAdapter(element.getClass());
		((CursoElement) ac).importar(element);
	}

	//Creamos los Edges y los añadimos con un command
	private void AñadirEdgeConcepts(EdgeImpl item, LinkedList extremos,
			EditPart canvas) {
		IEditorPart actEditor = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		DiagramDocumentEditor prediagram = (DiagramDocumentEditor) actEditor;
		DiagramEditPart actedp = prediagram.getDiagramEditPart();
		EditPart actp = actedp.getParent();

		View view = (View) item;
		Bendpoints bp = item.getBendpoints();
		int vid = org.mindmap.ui.diagram.conceptsDiagram.part.MindmapVisualIDRegistry
				.getVisualID(view);
		IElementType connectionType = org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes
				.getElementType(vid);

		CreateRelationshipRequest relationShipReq = new CreateRelationshipRequest(
				connectionType);
		ConnectionViewAndElementDescriptor desc = new ConnectionViewAndElementDescriptor(
				new CreateElementRequestAdapter(relationShipReq),
				connectionType instanceof IHintedType ? ((IHintedType) connectionType)
						.getSemanticHint() : "",
				((IGraphicalEditPart) canvas).getDiagramPreferencesHint());
		CreateConnectionViewAndElementRequest req = new CreateConnectionViewAndElementRequest(
				desc);
		req.setType(RequestConstants.REQ_CONNECTION_START);

		EObject sourceElement = (EObject) extremos.getFirst();
		EObject targetElement = (EObject) extremos.getLast();

		EditPart sourceEditPart = ((IGraphicalEditPart) canvas).findEditPart(
				canvas, sourceElement);
		EditPart targetEditPart = ((IGraphicalEditPart) canvas).findEditPart(
				canvas, targetElement);

		req.setSourceEditPart(sourceEditPart);
		Command sourceCmd = sourceEditPart.getCommand(req);
		if (!(sourceCmd == null || !sourceCmd.canExecute())) {

			if (targetEditPart != null) {
				req.setType(RequestConstants.REQ_CONNECTION_END);
				req.setTargetEditPart(targetEditPart);
				req.setLocation(new Point(0, 0));
				sourceEditPart.getCommand(req);
				Command targetCmd = targetEditPart.getCommand(req);

				((GraphicalEditPart) canvas).getDiagramEditDomain()
						.getDiagramCommandStack().execute(targetCmd);
			}
		}

		IAdaptable adapter = desc.getElementAdapter();

		EObject element = view.getElement();
		Object ac = adapter.getAdapter(element.getClass());
		((CursoElement) ac).importar(element);

	}

	private void AgregarNodoConcepts(Object item, EditPart padre,
			EditPart canvas, Map<EdgeImpl, LinkedList> m) {
		if (item instanceof IGraphicalEditPart) {
			IGraphicalEditPart gpart = (IGraphicalEditPart) item;
			View view = (View) gpart.getModel();
			EObject element = view.getElement();

			int vid = org.mindmap.ui.diagram.conceptsDiagram.part.MindmapVisualIDRegistry
					.getVisualID(view);
			IElementType type = org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes
					.getElementType(vid);

			//Creamos el elemento a importar
			CreateElementRequest cer = new CreateElementRequest(type);
			ViewAndElementDescriptor viewDescriptor = null;
			CreateViewAndElementRequest req = null;
			viewDescriptor = new ViewAndElementDescriptor(
					new CreateElementRequestAdapter(cer), Node.class,
					((IHintedType) type).getSemanticHint(),
					((GraphicalEditPart) canvas).getDiagramPreferencesHint());
			req = new CreateViewAndElementRequest(viewDescriptor);

			Rectangle rec = gpart.getFigure().getBounds();
			req.setLocation(rec.getLocation());
			req.setSize(rec.getSize());

			final CompoundCommand cmd = new CompoundCommand("Create "
					+ type.toString());

			cmd.add(padre.getCommand(req));

			((GraphicalEditPart) padre).getDiagramEditDomain()
					.getDiagramCommandStack().execute(cmd);

			IAdaptable adapter = viewDescriptor.getElementAdapter();

			Object ac = adapter.getAdapter(element.getClass());

			// ac es un elemento de nuestro modelo-> todos tienen el método importar
			boolean tienehijos = ((CursoElement) ac).importar(element);
			Object s = ((GraphicalEditPart) canvas).findEditPart(canvas,
					(EObject) ac);
			EditPart ed = (EditPart) s;
			Object notation0 = ed.getModel();
			if (notation0 instanceof ShapeImpl) {

				final ShapeImpl notation = (ShapeImpl) notation0;
				new EMFStoreCommand() {
					protected void doRun() {
						RGB rgb = new RGB(255, 255, 153);
						notation.setFillColor(FigureUtilities.RGBToInteger(rgb));
					}
				}.run(true);
			}
			if (tienehijos) {
				List children = gpart.getChildren();

				EditPart e = (EditPart) ed.getChildren().get(1);// cogemos el
																// compartimento
				if (children.size() > 1) {
					Object compartimento = children.get(1);
					EditPart c = (EditPart) compartimento;
					List hijos = c.getChildren();
					if (hijos != null) {
						for (int jk = 0; jk < hijos.size(); jk++) {
							//Llamamos recursivamente al método con: elemento a importar->hijo,
							//su padre, el canvas y el map con los enlaces
							AgregarNodoConcepts(hijos.get(jk), e, canvas, m);
						}
					}
				}
			}

		//	Object notation0 = ed.getModel();

			//Lo coloreamos
		/*	if (notation0 instanceof ShapeImpl) {

				final ShapeImpl notation = (ShapeImpl) notation0;
				new EMFStoreCommand() {
					protected void doRun() {
						RGB rgb = new RGB(255, 255, 153);
						notation.setFillColor(FigureUtilities.RGBToInteger(rgb));
					}
				}.run(true);
			}
			*/
			//Añadimos los enlaces de los que el elemento es source
			EList<EdgeImpl> se = view.getSourceEdges();
			for (int i = 0; i < se.size(); i++) {
				EdgeImpl key = se.get(i);
				if (!m.containsKey(key)) {
					LinkedList<Object> extremos = new LinkedList<Object>();
					extremos.addFirst(ac);
					m.put(key, extremos);
				} else {// Si ya esta creado es porque tiene un
						// target->agregar como first igual y sustituir
					LinkedList<Object> ob = (LinkedList<Object>) m.get(key);
					ob.addFirst(ac);
				}

			}
			// Ahora de los que es target
			EList<EdgeImpl> te = view.getTargetEdges();
			// edges.addAll(se);
			for (int i = 0; i < te.size(); i++) {
				EdgeImpl key = te.get(i);
				if (!m.containsKey(key)) {
					LinkedList<Object> extremos2 = new LinkedList<Object>();
					extremos2.addLast(ac);
					m.put(key, extremos2);
				} else {// Si ya esta creado es porque tiene un
						// source->agregar como last igual y sustituir
					LinkedList<Object> ob = (LinkedList<Object>) m.get(key);
					ob.addLast(ac);
				}

			}

		}
	}
}