package org.mindmap.ui.diagram.actividadDiagram.sheet;

import org.eclipse.core.commands.operations.IOperationHistory;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.ui.properties.UndoablePropertySheetEntry;
import org.eclipse.gmf.runtime.emf.ui.properties.sections.UndoableModelPropertySheetEntry;
import org.eclipse.ui.views.properties.IPropertySheetEntry;
import org.eclipse.ui.views.properties.PropertySheetEntry;

public class MyPropertySheetEntry extends UndoableModelPropertySheetEntry{

	public MyPropertySheetEntry(IOperationHistory operationHistory) {
		super(operationHistory);
		// TODO Apéndice de constructor generado automáticamente
		//getPropertySource(object)
	}
	
	
    /*
     * (non-Javadoc) Method declared on IPropertySheetEntry.
     */
  /*  public IPropertySheetEntry[] getChildEntries() {
        if (super.childEntries == null)
            createChildEntries();
        return childEntries;
    }*/


}
