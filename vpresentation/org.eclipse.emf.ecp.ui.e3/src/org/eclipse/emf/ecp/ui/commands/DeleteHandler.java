/*******************************************************************************
 * Copyright (c) 2011-2013 EclipseSource Muenchen GmbH and others.
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
package org.eclipse.emf.ecp.ui.commands;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecp.core.util.ECPContainer;
import org.eclipse.emf.ecp.spi.ui.util.ECPHandlerHelper;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * This Handler uses the {@link ECPHandlerHelper#deleteHandlerHelper(List, org.eclipse.swt.widgets.Shell)} method
 * to delete {@link ECPContainer}.
 *
 * @author Eugen Neufeld
 */
public class DeleteHandler extends AbstractHandler {

	/** {@inheritDoc} */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final ISelection selection = HandlerUtil.getActiveMenuSelection(event);
		final IStructuredSelection ssel = (IStructuredSelection) selection;

		final List<ECPContainer> deletables = new ArrayList<ECPContainer>();
		for (final Iterator<?> it = ssel.iterator(); it.hasNext();) {
			final Object element = it.next();
			if (element instanceof ECPContainer) {
				deletables.add((ECPContainer) element);
			}
		}
		ECPHandlerHelper.deleteHandlerHelper(deletables, HandlerUtil.getActiveShell(event));
		return null;
	}
}
