package org.mindmap.ui.diagram.conceptsDiagram.providers;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.IClientSelector;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Monitor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.mindmap.model.ConceptosDiagrama;
import org.mindmap.model.Tema;
import org.mindmap.model.control.ProjectControl;
import org.mindmap.model.impl.ModelPackageImpl;

/**
 * @generated
 */
public class MindmapValidationProvider {

	/**
	 * @generated
	 */
	private static boolean constraintsActive = false;

	/**
	 * @generated
	 */
	public static boolean shouldConstraintsBePrivate() {
		return false;
	}

	static boolean res = false;

	/**
	 * @generated
	 */
	public static void runWithConstraints(
			TransactionalEditingDomain editingDomain, Runnable operation) {
		final Runnable op = operation;
		Runnable task = new Runnable() {
			public void run() {
				try {
					constraintsActive = true;
					op.run();
				} finally {
					constraintsActive = false;
				}
			}
		};
		if (editingDomain != null) {
			try {
				editingDomain.runExclusive(task);
			} catch (Exception e) {
				org.mindmap.ui.diagram.conceptsDiagram.part.ConceptsMindmapDiagramEditorPlugin
						.getInstance().logError("Validation failed", e); //$NON-NLS-1$
			}
		} else {
			task.run();
		}
	}

	/**
	 * @generated
	 */
	static boolean isInDefaultEditorContext(Object object) {
		if (shouldConstraintsBePrivate() && !constraintsActive) {
			return false;
		}
		if (object instanceof View) {
			return constraintsActive
					&& org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptosDiagramEditPart.MODEL_ID
							.equals(org.mindmap.ui.diagram.conceptsDiagram.part.MindmapVisualIDRegistry
									.getModelID((View) object));
		}
		return true;
	}

	/**
	 * @generated
	 */
	public static class DefaultCtx implements IClientSelector {

		/**
		 * @generated
		 */
		public boolean selects(Object object) {
			return isInDefaultEditorContext(object);
		}
	}

	/**
	 * @generated
	 */
	public static class Adapter1 extends AbstractModelConstraint {

		/**
		 * @generated NOT
		 */
		public IStatus validate(IValidationContext ctx) {
			Tema context = (Tema) ctx.getTarget();
			// Ensure that you remove @generated tag or use @generated NOT
			//
			// To construct approprate return value, use
			// ctx.createSuccessStatus()
			// or ctx.createFailureStatus(...)

			ConceptosDiagrama m = (ConceptosDiagrama) context.eContainer();
			int i = 0;
			int number = 0;
			while (i < m.getTemas().size() && number < 2) {

				if (m.getTemas().get(i).getNombre() != null
						&& m.getTemas().get(i).getNombre()
								.equals(context.getNombre())) {
					number++;
				}
				i++;

			}
			if (number >= 2)// repetido
			{
				//Si estamos actualizando cambiaremos un nombre a null para que se cumpla la 
				//restriccion y no haga rollback
				if (ProjectControl.update || ProjectControl.importrunning) {
					
					context.setNombre(null);
					return ctx.createSuccessStatus();
					
				}

				else {
					//En el resto de casos hará rollback y avisará al usuario
					return ctx.createFailureStatus("Nombre Tema repetido");
				}
			} else {
				return ctx.createSuccessStatus();
			}

			
		}

		/**
		 * @generated
		 */
		static String formatElement(EObject object) {
			return EMFCoreUtil.getQualifiedName(object, true);
		}

	}
}
