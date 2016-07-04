package org.mindmap.ui.diagram.conceptsDiagram.custom;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecp.internal.core.ECPRepositoryManagerImpl;
import org.eclipse.emf.emfstore.client.ESLocalProject;
import org.eclipse.emf.emfstore.internal.client.ui.controller.UICommitProjectController;
import org.eclipse.jface.wizard.ProgressMonitorPart;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.mindmap.model.control.ProjectControl;

public class CommitProject extends AbstractHandler{

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
	
		Shell shell = HandlerUtil.getActiveShell(event);

		ProgressMonitorPart monitor = new ProgressMonitorPart(shell,
		          new GridLayout());	

		ECPRepositoryManagerImpl e = ECPRepositoryManagerImpl.INSTANCE;
		
		//Por si hay que actualizar el curso antes del commit
		ProjectControl.update=true;

		
		ESLocalProject localproject = ProjectControl.actualproject;
		new UICommitProjectController(shell, localproject).execute();
		
		ProjectControl.update=false;
		ProjectControl.continuarupdate=false;
		
		return null;
	}
	
}
