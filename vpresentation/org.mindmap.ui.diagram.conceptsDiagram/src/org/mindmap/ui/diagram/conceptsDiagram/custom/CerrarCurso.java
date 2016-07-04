package org.mindmap.ui.diagram.conceptsDiagram.custom;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.PlatformUI;
import org.mindmap.model.control.ProjectControl;


public class CerrarCurso extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ProjectControl.actualproject = null;
		PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getActivePage().closeAllEditors(true);
		return null;
	}


}
