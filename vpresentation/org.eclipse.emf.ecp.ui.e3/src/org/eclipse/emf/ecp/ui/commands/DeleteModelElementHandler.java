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
import org.eclipse.emf.ecp.core.util.ECPUtil;
import org.eclipse.emf.ecp.spi.core.InternalProject;
import org.eclipse.emf.ecp.spi.ui.util.ECPHandlerHelper;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * This Handler uses the
 * {@link ECPHandlerHelper#deleteModelElement(org.eclipse.emf.ecp.core.ECPProject, java.util.Collection)} method
 * to delete the selected {@link org.eclipse.emf.ecore.EObject EObjects}.
 *
 * @author Eugen Neufeld
 */
public class DeleteModelElementHandler extends AbstractHandler {

	/** {@inheritDoc} */
	@Override
	@SuppressWarnings("unchecked")
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getActiveMenuSelection(event);

		final InternalProject project = (InternalProject) ECPUtil.getECPProjectManager().getProject(
			selection.getFirstElement());

		ECPHandlerHelper.deleteModelElement(project, selection.toList());
		return null;
	}

}
