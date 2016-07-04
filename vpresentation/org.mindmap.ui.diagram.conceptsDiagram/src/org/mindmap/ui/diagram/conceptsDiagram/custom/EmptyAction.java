package org.mindmap.ui.diagram.conceptsDiagram.custom;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

/**
 * Action that does not do anything. Used for "removing" key bindings.
 * 
 * @generated NOT
 */
public class EmptyAction
    implements IWorkbenchWindowActionDelegate
{


  public void selectionChanged(IAction action, ISelection selection)
  {
  }

  public void run(IAction action)
  {
    // Nothing to do
  }

  public void dispose()
  {
  }

  public void init(IWorkbenchWindow window)
  {
  }
}

