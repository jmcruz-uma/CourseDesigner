package org.mindmap.ui.diagram.custom.menu;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;



public class ExportarDialog extends Dialog{
	public final String TITLE="Exportar";

	public ExportarDialog(Shell parent, int style) {
		super(parent, style);
	}
	
	 /**
	   * Constructor.
	   * 
	   * @param parent A shell which will be the parent of the new instance
	   */
	  public ExportarDialog(Shell parent)
	  {
	    this(parent, 0);
	  }

	  /**
	   * Opens the dialog.
	   * 
	   * @param propertiesFile The file with the information to fill the dialog text fields.
	   * @return The project name.
	   */
	  static int option=0;
	  public int open()
	  {
		 
		  Shell parent = getParent();
			final Shell sShell = new Shell(parent, SWT.TITLE| SWT.APPLICATION_MODAL );
			sShell.setText(TITLE);

			final Display display = parent.getDisplay();
			
			GridLayout gd=new GridLayout();
			gd.numColumns=1;
			
			sShell.setLayout(new GridLayout());

		
			Group group = new Group(sShell, SWT.NONE);

			group.setLayout(new GridLayout());
			group.setText("Opciones");
			final Button b1=new Button(group, SWT.RADIO);
			b1.setText("Exportar a Scorm1.2/IMS");
		    final Button b2=new Button(group, SWT.RADIO);
		    b2.setText("Exportar a HTML");
			
		
		    Composite c=new Composite(sShell,SWT.NONE);
		    c.setLayout(new GridLayout(2,true));
		    Button ok=new Button(c,SWT.PUSH);
		    ok.setText("Aceptar");
		    ok.addSelectionListener(new SelectionAdapter() {

				@Override
				public void widgetSelected(SelectionEvent e) {
					if(b1.getSelection()){
						option=1;
					}else if(b2.getSelection()){
						option=2;
					}
				  
			        sShell.close();
				      
				}});
		    Button cancel=new Button(c,SWT.PUSH);
		    cancel.setText("Cancelar");
		  cancel.addSelectionListener(new SelectionAdapter() {

				@Override
				public void widgetSelected(SelectionEvent e) {
					
					option=0;
				  
				        sShell.close();
				      
				}});
		  
		
		    sShell.pack();
		    FeaturesDialog2.center(sShell); /***???????***/
		    sShell.open();
		    while (!sShell.isDisposed()) {
		      if (!display.readAndDispatch()) {
		        display.sleep();
		      }
		    }
		    return option;
	  }
}

