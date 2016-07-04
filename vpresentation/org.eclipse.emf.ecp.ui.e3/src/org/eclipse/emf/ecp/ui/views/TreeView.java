/*******************************************************************************
 * Copyright (c) 2011 Eike Stepper (Berlin, Germany) and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Eike Stepper - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.ecp.ui.views;

import org.eclipse.emf.ecp.ui.actions.RefreshViewerAction;
import org.eclipse.emf.ecp.ui.e3.Messages;
import org.eclipse.emf.ecp.ui.platform.Activator;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelDecorator;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.eclipse.ui.part.ViewPart;

/**
 * @author Eike Stepper
 * @author Eugen Neufeld
 */
public abstract class TreeView extends ViewPart implements ISelectionProvider, ISetSelectionTarget
{
	/**
	 * ID for the separator in the context menu of the {@link TreeView} to add global contributions to (placed on top).
	 */
	public static final String GLOBAL_ADDITIONS = "global_additions"; //$NON-NLS-1$

	private final String id;

	private TreeViewer viewer;

	private Action refreshAction;

	/**
	 * Default constructor.
	 *
	 * @param id the ID of the Tree View, used to identify the {@link TreeView}
	 */
	public TreeView(String id)
	{
		this.id = id;
	}

	/**
	 * Retrieves the ID of this {@link TreeView}.
	 *
	 * @return the id as a {@link String}
	 */
	public final String getID()
	{
		return id;
	}

	/**
	 * Returns JFace {@link TreeViewer} used in this {@link TreeViewer}.
	 *
	 * @return a {@link TreeViewer}
	 */
	public final TreeViewer getViewer()
	{
		return viewer;
	}

	/**
	 * Return the refresh action, which triggers a reload on the TreeViewer.
	 *
	 * @return an {@link Action}
	 */
	public final Action getRefreshAction()
	{
		return refreshAction;
	}

	@Override
	public void init(IViewSite site) throws PartInitException
	{
		super.init(site);
		site.setSelectionProvider(this);
	}

	@Override
	public final void createPartControl(Composite parent)
	{
		try
		{
			viewer = createViewer(parent);
			if (viewer == null)
			{
				throw new IllegalStateException(Messages.TreeView_Exception_ViewerNotCreated);
			}

			refreshAction = new RefreshViewerAction(viewer);

			hookContextMenu();
			hookDoubleClickAction();
			contributeToActionBars();
		} catch (final RuntimeException ex)
		{
			Activator.log(ex);
			throw ex;
		} catch (final Error ex)
		{
			Activator.log(ex);
			throw ex;
		}
	}

	@Override
	public void setFocus()
	{
		if (viewer != null)
		{
			viewer.getControl().setFocus();
		}
	}

	/** {@inheritDoc} */
	@Override
	public IStructuredSelection getSelection()
	{
		if (viewer != null)
		{
			return (IStructuredSelection) viewer.getSelection();
		}

		return StructuredSelection.EMPTY;
	}

	/** {@inheritDoc} */
	@Override
	public void setSelection(ISelection selection)
	{
		if (viewer != null)
		{
			viewer.setSelection(selection);
		}
	}

	/** {@inheritDoc} */
	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener)
	{
		if (viewer != null)
		{
			viewer.addSelectionChangedListener(listener);
		}
	}

	/** {@inheritDoc} */
	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener)
	{
		if (viewer != null)
		{
			viewer.removeSelectionChangedListener(listener);
		}
	}

	/** {@inheritDoc} */
	@Override
	public void selectReveal(ISelection selection)
	{
		if (viewer != null)
		{
			viewer.setSelection(selection, true);
		}
	}

	/**
	 * Shows a message to the user.
	 *
	 * @param message the message as a String
	 */
	protected void showMessage(String message)
	{
		MessageDialog.openInformation(viewer.getControl().getShell(), getTitle(), message);
	}

	/**
	 * Creates a label decorator.
	 *
	 * @return the label decorator to be used by the TreeView
	 */
	protected ILabelDecorator createLabelDecorator()
	{
		return PlatformUI.getWorkbench().getDecoratorManager().getLabelDecorator();
	}

	/**
	 * Creates the {@link TreeViewer}. To be implemented by sub classes.
	 *
	 * @param parent the parent composite to place the TreeViewer on.
	 * @return the {@link TreeViewer}
	 */
	protected abstract TreeViewer createViewer(Composite parent);

	/**
	 * Fills the menue of the view. Can be overridden by sub classes.
	 *
	 * @param manager the {@link IMenuManager} to be filled.
	 */
	protected void fillLocalPullDown(IMenuManager manager)
	{
		manager.add(new Separator());
		manager.add(refreshAction);
	}

	/**
	 * Fills the toolbar of the view. Can be overridden by sub classes.
	 *
	 * @param manager the {@link IToolBarManager} to be filled.
	 */
	protected void fillLocalToolBar(IToolBarManager manager)
	{
		manager.add(refreshAction);
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));

	}

	/**
	 * Fills the contect menu of the view. Can be overriden by sub classes.
	 *
	 * @param manager the {@link IMenuManager} to be filled.
	 */
	protected void fillContextMenu(IMenuManager manager)
	{
		manager.add(new Separator(GLOBAL_ADDITIONS));
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
		manager.add(new Separator());
	}

	/**
	 * Called if a double click is triggered in the TreeViewer. Can be overridden by sub classes to add some behavior on
	 * double click.
	 *
	 * @param event the {@link DoubleClickEvent}
	 */
	protected void doubleClicked(DoubleClickEvent event)
	{
	}

	private void contributeToActionBars()
	{
		final IActionBars bars = getViewSite().getActionBars();
		// fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void hookDoubleClickAction()
	{
		viewer.addDoubleClickListener(new IDoubleClickListener()
		{
			@Override
			public void doubleClick(DoubleClickEvent event)
			{
				TreeView.this.doubleClicked(event);
			}
		});
	}

	private void hookContextMenu()
	{
		final MenuManager manager = new MenuManager("#PopupMenu"); //$NON-NLS-1$
		manager.setRemoveAllWhenShown(true);
		manager.addMenuListener(new IMenuListener()
		{
			@Override
			public void menuAboutToShow(IMenuManager manager)
			{
				TreeView.this.fillContextMenu(manager);
			}
		});

		final Control control = viewer.getControl();

		final Menu menu = manager.createContextMenu(control);
		control.setMenu(menu);
		getSite().registerContextMenu(getID(), manager, viewer);
	}
}
