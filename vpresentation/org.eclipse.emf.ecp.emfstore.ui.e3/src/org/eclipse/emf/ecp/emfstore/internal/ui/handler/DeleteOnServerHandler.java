/*******************************************************************************
 * Copyright (c) 2011-2012 EclipseSource Muenchen GmbH and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Eugen Neufeld - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.emf.ecp.emfstore.internal.ui.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecp.emfstore.core.internal.EMFStoreProjectWrapper;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * This is the EMFStore DeleteOnServer Handler delegating to the {@link DeleteOnServerHelper}.
 *
 * @author Eugen Neufeld
 *
 */
public class DeleteOnServerHandler extends AbstractHandler {

	/** {@inheritDoc} */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final ISelection sel = HandlerUtil.getActiveMenuSelection(event);
		if (sel instanceof IStructuredSelection) {
			final IStructuredSelection ssel = (IStructuredSelection) sel;
			final Object selection = ssel.getFirstElement();
			if (selection instanceof EMFStoreProjectWrapper) {
				final EMFStoreProjectWrapper projectWrapper = (EMFStoreProjectWrapper) selection;

				DeleteOnServerHelper.deleteOnServer(projectWrapper, HandlerUtil.getActiveShell(event));
			}
		}
		return null;
	}

}
