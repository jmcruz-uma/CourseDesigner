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
package org.eclipse.emf.ecp.emfstore.internal.ui.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecp.spi.core.InternalProject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * A CreateBranch Handler. This allows to create a new branch delegating to {@link CreateBranchHelper}.
 *
 * @author Eugen Neufeld
 *
 */
public class CreateBranchHandler extends AbstractHandler {

	/** {@inheritDoc} */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final InternalProject project = (InternalProject) ((IStructuredSelection) HandlerUtil
			.getActiveMenuSelection(event))
			.getFirstElement();
		CreateBranchHelper.createBranch(project, HandlerUtil.getActiveShell(event));
		return null;
	}

}
