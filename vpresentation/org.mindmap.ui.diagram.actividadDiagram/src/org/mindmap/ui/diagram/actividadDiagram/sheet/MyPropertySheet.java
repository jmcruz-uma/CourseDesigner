package org.mindmap.ui.diagram.actividadDiagram.sheet;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.views.properties.IPropertySheetEntry;
import org.eclipse.ui.views.properties.PropertySheet;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetEntry;
import org.eclipse.ui.views.properties.PropertySheetSorter;
//import org.eclipse.ui.views.properties.PropertySheetViewer;


public class MyPropertySheet extends PropertySheetPage{
	//private PropertySheetSorter sorter;

	/* (non-Javadoc)
     * Method declared on <code>IPage</code>.
     */
	
//	private PropertySheetViewer viewer;
 /*   public void createControl(Composite parent) {
    	//PropertySheetViewer psv=new PropertySheetViewer(parent);
    Control c = super.getControl();
    c.
    
    }*/
	
    
        // create a new viewer
  /*      viewer = new PropertySheetViewer(parent);
        viewer.setSorter(sorter);
        
        // set the model for the viewer
        if (rootEntry == null) {
            // create a new root
            PropertySheetEntry root = new PropertySheetEntry();
            if (provider != null) {
				// set the property source provider
                root.setPropertySourceProvider(provider);
			}
            rootEntry = root;
        }
        viewer.setRootEntry(rootEntry);
        viewer.addActivationListener(getCellEditorActivationListener());
        // add a listener to track when the entry selection changes
        viewer.addSelectionChangedListener(new ISelectionChangedListener() {
            public void selectionChanged(SelectionChangedEvent event) {
                handleEntrySelection(event.getSelection());
            }
        });
        initDragAndDrop();
        makeActions();

        // Create the popup menu for the page.
        MenuManager menuMgr = new MenuManager("#PopupMenu"); //$NON-NLS-1$
        menuMgr.add(copyAction);
        menuMgr.add(new Separator());
        menuMgr.add(defaultsAction);
        Menu menu = menuMgr.createContextMenu(viewer.getControl());
        viewer.getControl().setMenu(menu);

        // Set help on the viewer
        viewer.getControl().addHelpListener(new HelpListener() {
            /*
             * @see HelpListener#helpRequested(HelpEvent)
             */
     /*       public void helpRequested(HelpEvent e) {
                // Get the context for the selected item
                IStructuredSelection selection = (IStructuredSelection) viewer
                        .getSelection();
                if (!selection.isEmpty()) {
                    IPropertySheetEntry entry = (IPropertySheetEntry) selection
                            .getFirstElement();
                    Object helpContextId = entry.getHelpContextIds();
                    if (helpContextId != null) {
                    	IWorkbenchHelpSystem helpSystem = PlatformUI.getWorkbench().getHelpSystem();
                    	
                        // Since 2.0 the only valid type for helpContextIds
                        // is a String (a single id).
                        if (helpContextId instanceof String) {
                            helpSystem.displayHelp((String) helpContextId);
                            return;
                        }

                        // For backward compatibility we have to handle
                        // and array of contexts (Strings and/or IContexts)
                        // or a context computer.
                        Object context= getFirstContext(helpContextId, e);
                        if (context instanceof IContext) {
							helpSystem.displayHelp((IContext) context);
						} else if (context instanceof String) {
							helpSystem.displayHelp((String) context);
						}
                        return;
                    }
                }

                // No help for the selection so show page help
                PlatformUI.getWorkbench().getHelpSystem().displayHelp(HELP_CONTEXT_PROPERTY_SHEET_PAGE);
            }

			/**
			 * Returns the first help context.
			 * 
			 * @param helpContext the help context which is either an array of contexts (strings
			 *            and/or {@linkplain IContext}s) or an {@link IContextComputer}
			 * 
			 * @param e the help event
			 * @return the first context which is either a <code>String</code>, {@link IContext} or
			 *         <code>null</code> if none
			 * @deprecated As of 2.0, nested contexts are no longer supported by the help support
			 *             system
			 */
/*			private Object getFirstContext(Object helpContext, HelpEvent e) {
				Object[] contexts;
				if (helpContext instanceof IContextComputer) {
				    // get local contexts
					contexts= ((IContextComputer)helpContext)
				            .getLocalContexts(e);
				} else {
					contexts= (Object[])helpContext;
				}

				if (contexts.length > 0)
					return contexts[0];
				return null;
			}
        });
    }
*/
    /**
     * Sets the given entry as the model for the page.
     *
     * @param entry the root entry
     */
  /*  public void setRootEntry(IPropertySheetEntry entry) {
        rootEntry = entry;
        if (viewer != null) {
			// the following will trigger an update
            viewer.setRootEntry(rootEntry);
		}
    }*/
	/*@Override
	protected void setSorter(PropertySheetSorter sorter) {

	}*/
	
	@Override
	public void createControl(Composite parent) {
	    super.createControl(parent);
	    // Override for unsorted property sheet page
	    // See bug 1883 comment 43 and bug 109617
	    setSorter(new PropertySheetSorter() {
	        @Override
	        public void sort(IPropertySheetEntry[] entries) {
	        	if(entries!=null){
	        		System.out.println("Hola");
	        	}
	        }
	    });
	}

}
