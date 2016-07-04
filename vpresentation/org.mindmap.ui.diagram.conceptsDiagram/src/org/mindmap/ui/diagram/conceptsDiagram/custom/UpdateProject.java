package org.mindmap.ui.diagram.conceptsDiagram.custom;
import java.util.Collections;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecp.emfstore.core.internal.EMFStoreProvider;
import org.eclipse.emf.emfstore.client.ESLocalProject;
import org.eclipse.emf.emfstore.client.ESServer;
import org.eclipse.emf.emfstore.internal.client.model.impl.api.ESLocalProjectImpl;
import org.eclipse.emf.emfstore.internal.client.model.impl.api.ESUsersessionImpl;
import org.eclipse.emf.emfstore.internal.client.ui.controller.UIUpdateProjectController;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.mindmap.model.control.ProjectControl;

public class UpdateProject extends AbstractHandler{



	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ESLocalProject project = ProjectControl.actualproject;
		
		Shell shell = HandlerUtil.getActiveShell(event);
		
		//Usamos su controlador y controlamos la restricción temasNombreDuplicado con los flags
		ProjectControl.update=true;
		
		new UIUpdateProjectController(shell, project).execute();
		
		ProjectControl.update=false;
		ProjectControl.continuarupdate=false;
		return null;
	}

}
