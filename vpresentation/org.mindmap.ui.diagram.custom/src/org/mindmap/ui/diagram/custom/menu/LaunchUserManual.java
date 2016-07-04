package org.mindmap.ui.diagram.custom.menu;


import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Class for showing the user manual in an external application.
 */
public class LaunchUserManual
    extends AbstractHandler
{

	private static final String FILE_NAME = "GuíaRápida.pdf";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		 try
		    {
		      Runtime.getRuntime().exec("cmd /c start " + FILE_NAME);
		    }
		    catch (IOException e)
		    {
		      Status status = new Status(IStatus.ERROR, "My Plug-in ID",
		          "Error al leer el fichero.");

		      ErrorDialog.openError(window.getShell(), "Error",
		          "No se puede abrir el manual de usuario", status);
		    }
		  
		return null;
	}
  
  
}

