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

package org.eclipse.emf.ecp.ui.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.spi.ui.util.ECPHandlerHelper;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * This Handler uses the {@link ECPHandlerHelper#changeCloseState(ECPProject[], String)} method
 * to close selected projects.
 *
 * @author Eugen Neufeld
 */
public class CloseableHandler extends AbstractHandler {

	/** {@inheritDoc} */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final ISelection selection = HandlerUtil.getActiveMenuSelection(event);
		final IStructuredSelection ssel = (IStructuredSelection) selection;
		final String currentType = event.getParameter("org.eclipse.emf.ecp.project.type"); //$NON-NLS-1$
		final Object[] selectionArray = ssel.toArray();
		final ECPProject[] closeable = new ECPProject[selectionArray.length];

		for (int i = 0; i < selectionArray.length; i++) {
			closeable[i] = (ECPProject) selectionArray[i];
		}

		ECPHandlerHelper.changeCloseState(closeable, currentType);

		return null;
	}

}
