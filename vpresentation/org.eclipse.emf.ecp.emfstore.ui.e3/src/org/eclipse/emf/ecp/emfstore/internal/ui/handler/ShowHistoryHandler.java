/*******************************************************************************
 * Copyright (c) 2011-2012 EclipseSource Muenchen GmbH and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Johannes Faltermeier - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.emf.ecp.emfstore.internal.ui.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * This is the EMFStore ShowHistory Handler delegating to the {@link ShowHistoryViewHelper}.
 *
 * @author Tobias Verhoeven
 *
 */
public class ShowHistoryHandler extends AbstractHandler {

	/** {@inheritDoc} **/
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final Object object = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).getFirstElement();

		ShowHistoryViewHelper.showHistoryView(object, HandlerUtil.getActiveShell(event));

		return null;
	}
}