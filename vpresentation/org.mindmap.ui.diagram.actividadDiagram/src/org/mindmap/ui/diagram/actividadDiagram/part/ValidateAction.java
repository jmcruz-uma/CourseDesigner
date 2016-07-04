package org.mindmap.ui.diagram.actividadDiagram.part;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.model.IConstraintStatus;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.diagram.ui.OffscreenEditPartFactory;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.mindmap.model.impl.ModelPackageImpl;
import org.mindmap.ui.diagram.custom.application.MyValidationView;

/**
 * @generated
 */
public class ValidateAction extends Action {

	/**
	 * @generated
	 */
	private IWorkbenchPage page;

	/**
	 * @generated
	 */
	public ValidateAction(IWorkbenchPage page) {
		setText(org.mindmap.ui.diagram.actividadDiagram.part.Messages.ValidateActionMessage);
		this.page = page;
	}

	/**
	 * @generated
	 */
	public void run() {
		IWorkbenchPart workbenchPart = page.getActivePart();
		if (workbenchPart instanceof IDiagramWorkbenchPart) {
			final IDiagramWorkbenchPart part = (IDiagramWorkbenchPart) workbenchPart;
			try {
				new IRunnableWithProgress() {

					public void run(IProgressMonitor monitor)
							throws InterruptedException,
							InvocationTargetException {
						runValidation(part.getDiagramEditPart(),
								part.getDiagram());
					}
				}.run(new NullProgressMonitor());
			} catch (Exception e) {
				org.mindmap.ui.diagram.actividadDiagram.part.ActDiagramEditorPlugin
						.getInstance().logError("Validation action failed", e); //$NON-NLS-1$
			}
		}
	}

	/**
	 * @generated
	 */
	public static void runValidation(View view) {
		try {
			if (org.mindmap.ui.diagram.actividadDiagram.part.MindmapDiagramEditorUtil
					.openDiagram(view.eResource())) {
				IEditorPart editorPart = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getActivePage()
						.getActiveEditor();
				if (editorPart instanceof IDiagramWorkbenchPart) {
					runValidation(
							((IDiagramWorkbenchPart) editorPart)
									.getDiagramEditPart(),
							view);
				} else {
					runNonUIValidation(view);
				}
			}
		} catch (Exception e) {
			org.mindmap.ui.diagram.actividadDiagram.part.ActDiagramEditorPlugin
					.getInstance().logError("Validation action failed", e); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	public static void runNonUIValidation(View view) {
		DiagramEditPart diagramEditPart = OffscreenEditPartFactory
				.getInstance().createDiagramEditPart(view.getDiagram());
		runValidation(diagramEditPart, view);
	}

	/**
	 * @generated
	 */
	public static void runValidation(DiagramEditPart diagramEditPart, View view) {
		final DiagramEditPart fpart = diagramEditPart;
		final View fview = view;
		TransactionalEditingDomain txDomain = TransactionUtil
				.getEditingDomain(view);
		org.mindmap.ui.diagram.actividadDiagram.providers.MindmapValidationProvider
				.runWithConstraints(txDomain, new Runnable() {

					public void run() {
						validate(fpart, fview);
					}
				});
	}

	/**
	 * @generated NOT
	 */
	private static Diagnostic runEMFValidator(View target) {
		if (target.isSetElement() && target.getElement() != null) {
			return new Diagnostician() {

				public String getObjectLabel(EObject eObject) {
					//return EMFCoreUtil.getQualifiedName(eObject, true);
					//Los bloques no están registrados en messages.properties por lo que la primera vez que entra
					//saldrá de la validación porque no los encuentra, el resto de veces no dará problemas
					//aún así los borramos y los metemos.
					ModelPackageImpl mp = (ModelPackageImpl) ModelPackageImpl
							.init();
					EEnum bloq = mp.getBloque();
					EList<EEnumLiteral> lit = bloq.getELiterals();
					EcoreUtil.Copier c=new EcoreUtil.Copier();
					Collection<EEnumLiteral> litcopy = c.copyAll(lit);
					mp.removeAllBloques();
	
					String fullname = EMFCoreUtil.getQualifiedName(eObject,
							true);

					for(EEnumLiteral literal:litcopy)
					{
						mp.addBloque(literal.getName(), literal.getLiteral());
					}
					
					String formatname = fullname.substring(
							fullname.lastIndexOf('<') + 1,
							fullname.lastIndexOf('>'));
					return formatname;
				}
			}.validate(target.getElement());
		}
		return Diagnostic.OK_INSTANCE;
	}

	/**
	 * @generated NOT
	 */
	private static void validate(DiagramEditPart diagramEditPart, View view) {
		View target = view;
		org.mindmap.ui.diagram.actividadDiagram.part.ValidationMarker
				.removeAllMarkers(diagramEditPart.getViewer());
		Diagnostic diagnostic = runEMFValidator(view);

		// Abrimos la vista mostrando los errores
		List<Diagnostic> ch = diagnostic.getChildren();
		Object[] ar = ch.toArray();
		try {
			MyValidationView k = (MyValidationView) PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getActivePage()
					.showView(MyValidationView.ID);
			List<String> lista = parseDiagnostic(diagnostic.getChildren());
			k.setActividadError(lista);
		} catch (PartInitException e) {

			MessageDialog
					.openError(PlatformUI.getWorkbench()
							.getActiveWorkbenchWindow().getShell(), "Error",
							"No se pudo abrir la vista con los resultados de la validación");
		}

		createMarkers(target, diagnostic, diagramEditPart);
		IBatchValidator validator = (IBatchValidator) ModelValidationService
				.getInstance().newValidator(EvaluationMode.BATCH);
		validator.setIncludeLiveConstraints(true);
		if (view.isSetElement() && view.getElement() != null) {
			IStatus status = validator.validate(view.getElement());
			createMarkers(target, status, diagramEditPart);
		}
		org.mindmap.ui.diagram.actividadDiagram.providers.MindmapValidationDecoratorProvider
				.refreshDecorators(view);
		for (Iterator it = view.eAllContents(); it.hasNext();) {
			EObject next = (EObject) it.next();
			if (next instanceof View) {
				org.mindmap.ui.diagram.actividadDiagram.providers.MindmapValidationDecoratorProvider
						.refreshDecorators((View) next);
			}
		}
	}

	//Los elementos se muestran con sus contenedores-> filtramos y solo cogemos nuestro nodo
	private static List<String> parseDiagnostic(List<Diagnostic> list) {
		List<String> newds = new LinkedList<String>();
		for (int i = 0; i < list.size(); i++) { 
			Diagnostic d = list.get(i);
			String ds = d.toString();
			int fin = list.size();
			int inicio = 0;
			if (ds.contains("data")) {
				fin = ds.indexOf("data");
			}
			inicio = ds.indexOf("'");
			newds.add(ds.substring(inicio, fin));
			
		}
		return newds;
	}

	/**
	 * @generated
	 */
	private static void createMarkers(View target, IStatus validationStatus,
			DiagramEditPart diagramEditPart) {
		if (validationStatus.isOK()) {
			return;
		}
		final IStatus rootStatus = validationStatus;
		List allStatuses = new ArrayList();
		org.mindmap.ui.diagram.actividadDiagram.part.MindmapDiagramEditorUtil.LazyElement2ViewMap element2ViewMap = new org.mindmap.ui.diagram.actividadDiagram.part.MindmapDiagramEditorUtil.LazyElement2ViewMap(
				diagramEditPart.getDiagramView(), collectTargetElements(
						rootStatus, new HashSet<EObject>(), allStatuses));
		for (Iterator it = allStatuses.iterator(); it.hasNext();) {
			IConstraintStatus nextStatus = (IConstraintStatus) it.next();
			View view = org.mindmap.ui.diagram.actividadDiagram.part.MindmapDiagramEditorUtil
					.findView(diagramEditPart, nextStatus.getTarget(),
							element2ViewMap);
			addMarker(diagramEditPart.getViewer(), target, view.eResource()
					.getURIFragment(view), EMFCoreUtil.getQualifiedName(
					nextStatus.getTarget(), true), nextStatus.getMessage(),
					nextStatus.getSeverity());
		}
	}

	/**
	 * @generated
	 */
	private static void createMarkers(View target,
			Diagnostic emfValidationStatus, DiagramEditPart diagramEditPart) {
		if (emfValidationStatus.getSeverity() == Diagnostic.OK) {
			return;
		}
		final Diagnostic rootStatus = emfValidationStatus;
		List allDiagnostics = new ArrayList();
		org.mindmap.ui.diagram.actividadDiagram.part.MindmapDiagramEditorUtil.LazyElement2ViewMap element2ViewMap = new org.mindmap.ui.diagram.actividadDiagram.part.MindmapDiagramEditorUtil.LazyElement2ViewMap(
				diagramEditPart.getDiagramView(), collectTargetElements(
						rootStatus, new HashSet<EObject>(), allDiagnostics));
		for (Iterator it = emfValidationStatus.getChildren().iterator(); it
				.hasNext();) {
			Diagnostic nextDiagnostic = (Diagnostic) it.next();
			List data = nextDiagnostic.getData();
			if (data != null && !data.isEmpty()
					&& data.get(0) instanceof EObject) {
				EObject element = (EObject) data.get(0);
				View view = org.mindmap.ui.diagram.actividadDiagram.part.MindmapDiagramEditorUtil
						.findView(diagramEditPart, element, element2ViewMap);
				addMarker(
						diagramEditPart.getViewer(),
						target,
						view.eResource().getURIFragment(view),
						EMFCoreUtil.getQualifiedName(element, true),
						nextDiagnostic.getMessage(),
						diagnosticToStatusSeverity(nextDiagnostic.getSeverity()));
			}
		}
	}

	/**
	 * @generated
	 */
	private static void addMarker(EditPartViewer viewer, View target,
			String elementId, String location, String message,
			int statusSeverity) {
		if (target == null) {
			return;
		}
		new org.mindmap.ui.diagram.actividadDiagram.part.ValidationMarker(
				location, message, statusSeverity).add(viewer, elementId);
	}

	/**
	 * @generated
	 */
	private static int diagnosticToStatusSeverity(int diagnosticSeverity) {
		if (diagnosticSeverity == Diagnostic.OK) {
			return IStatus.OK;
		} else if (diagnosticSeverity == Diagnostic.INFO) {
			return IStatus.INFO;
		} else if (diagnosticSeverity == Diagnostic.WARNING) {
			return IStatus.WARNING;
		} else if (diagnosticSeverity == Diagnostic.ERROR
				|| diagnosticSeverity == Diagnostic.CANCEL) {
			return IStatus.ERROR;
		}
		return IStatus.INFO;
	}

	/**
	 * @generated
	 */
	private static Set<EObject> collectTargetElements(IStatus status,
			Set<EObject> targetElementCollector, List allConstraintStatuses) {
		if (status instanceof IConstraintStatus) {
			targetElementCollector
					.add(((IConstraintStatus) status).getTarget());
			allConstraintStatuses.add(status);
		}
		if (status.isMultiStatus()) {
			IStatus[] children = status.getChildren();
			for (int i = 0; i < children.length; i++) {
				collectTargetElements(children[i], targetElementCollector,
						allConstraintStatuses);
			}
		}
		return targetElementCollector;
	}

	/**
	 * @generated
	 */
	private static Set<EObject> collectTargetElements(Diagnostic diagnostic,
			Set<EObject> targetElementCollector, List allDiagnostics) {
		List data = diagnostic.getData();
		EObject target = null;
		if (data != null && !data.isEmpty() && data.get(0) instanceof EObject) {
			target = (EObject) data.get(0);
			targetElementCollector.add(target);
			allDiagnostics.add(diagnostic);
		}
		if (diagnostic.getChildren() != null
				&& !diagnostic.getChildren().isEmpty()) {
			for (Iterator it = diagnostic.getChildren().iterator(); it
					.hasNext();) {
				collectTargetElements((Diagnostic) it.next(),
						targetElementCollector, allDiagnostics);
			}
		}
		return targetElementCollector;
	}

	//Validación para exportar
	public static Diagnostic validateExport(View target) {
		if 
		(target.getElement() != null) {
			return new Diagnostician() {

				public String getObjectLabel(EObject eObject) {
					//return EMFCoreUtil.getQualifiedName(eObject, true);
					//Los bloques no están registrados en messages.properties por lo que la primera vez que entra
					//saldrá de la validación porque no los encuentra, el resto de veces no dará problemas
					//aún así los borramos y los metemos.
					ModelPackageImpl mp = (ModelPackageImpl) ModelPackageImpl
							.init();
					EEnum bloq = mp.getBloque();
					EList<EEnumLiteral> lit = bloq.getELiterals();
					EcoreUtil.Copier c=new EcoreUtil.Copier();
					Collection<EEnumLiteral> litcopy = c.copyAll(lit);
					mp.removeAllBloques();
	
					String fullname = EMFCoreUtil.getQualifiedName(eObject,
							true);

					for(EEnumLiteral literal:litcopy)
					{
						mp.addBloque(literal.getName(), literal.getLiteral());
					}
					
					String formatname = fullname.substring(
							fullname.lastIndexOf('<') + 1,
							fullname.lastIndexOf('>'));
					return formatname;
			
				}
			}.validate(target.getElement());
		}
		return Diagnostic.OK_INSTANCE;
	}
}
