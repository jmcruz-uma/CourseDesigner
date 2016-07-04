package org.mindmap.ui.diagram.custom.menu;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.emfstore.client.ESLocalProject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.handlers.HandlerUtil;
import org.mindmap.model.Curso;
import org.mindmap.model.PropiedadCurso;
import org.mindmap.model.control.ProjectControl;
import org.w3c.dom.views.AbstractView;

//Clase para abrir un cuadro de diálogo con las opciones de exportación
public class CreateFeaturesActionDelegate extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);

		ESLocalProject p = ProjectControl.actualproject;
		EList<EObject> elementos = p.getModelElements();
		Curso curso = (Curso) elementos.get(0);

		PropiedadCurso pc = curso.getPropiedades();
		FeaturesDialog2 dialog = new FeaturesDialog2(window.getShell(), pc);
		dialog.open();

		return null;
	}

}
