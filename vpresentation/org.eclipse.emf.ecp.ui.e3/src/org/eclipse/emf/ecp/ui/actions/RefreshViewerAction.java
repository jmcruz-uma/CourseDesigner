/********************************************************************************
 * Copyright (c) 2011 Eike Stepper (Berlin, Germany) and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Eike Stepper - initial API and implementation
 ********************************************************************************/
package org.eclipse.emf.ecp.ui.actions;

import org.eclipse.emf.ecp.internal.ui.model.TreeContentProvider;
import org.eclipse.emf.ecp.ui.e3.Messages;
import org.eclipse.emf.ecp.ui.platform.Activator;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.Viewer;

/**
 * @author Eike Stepper
 */
public class RefreshViewerAction extends Action
{
	private final Viewer viewer;

	public RefreshViewerAction(Viewer viewer)
	{
		super(Messages.RefreshViewerAction_Title, Activator.getImageDescriptor("icons/refresh.gif")); //$NON-NLS-1$
		setToolTipText(Messages.RefreshViewerAction_Tooltip);
		this.viewer = viewer;
	}

	@Override
	public void run()
	{
		try
		{
			if (viewer instanceof StructuredViewer)
			{
				final StructuredViewer structuredViewer = (StructuredViewer) viewer;
				final IContentProvider contentProvider = structuredViewer.getContentProvider();
				if (contentProvider instanceof TreeContentProvider)
				{
					final TreeContentProvider<?> treeContentProvider = (TreeContentProvider<?>) contentProvider;
					treeContentProvider.refreshViewer();
					return;
				}
			}

			viewer.refresh();
		} catch (final Exception ex)
		{
			Activator.log(ex);
		}
	}
}
