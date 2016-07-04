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

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.spi.ui.util.ECPHandlerHelper;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Then handler for opening a non editable properties dialog on an {@link ECPProject}.
 *
 * @author Eugen Neufeld
 *
 */
public class ProjectPropertiesHandler extends AbstractHandler {

	/** {@inheritDoc} **/
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final ISelection selection = HandlerUtil.getActiveMenuSelection(event);
		if (IStructuredSelection.class.isInstance(selection)) {
			final IStructuredSelection ssel = (IStructuredSelection) selection;
			if (ECPProject.class.isInstance(ssel.getFirstElement())) {
				ECPHandlerHelper.openProjectProperties((ECPProject) ssel.getFirstElement(), false,
					HandlerUtil.getActiveShell(event));
			}
		}
		return null;
	}

}
