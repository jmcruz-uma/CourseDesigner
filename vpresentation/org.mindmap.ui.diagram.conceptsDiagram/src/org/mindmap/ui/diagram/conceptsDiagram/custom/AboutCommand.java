package org.mindmap.ui.diagram.conceptsDiagram.custom;

import org.mindmap.ui.diagram.conceptsDiagram.part.Messages;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

public class AboutCommand extends AbstractHandler{

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell shell=HandlerUtil.getActiveShellChecked(event);
		MessageDialog.openInformation(shell,
		          Messages.DiagramEditorActionBarAdvisor_AboutDialogTitle,
		          Messages.DiagramEditorActionBarAdvisor_AboutDialogMessage);
		return null;
	}

}
