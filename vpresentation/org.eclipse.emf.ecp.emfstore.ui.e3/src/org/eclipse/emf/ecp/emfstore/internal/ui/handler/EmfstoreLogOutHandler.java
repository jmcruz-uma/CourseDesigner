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
 ******************************************************************************/
package org.eclipse.emf.ecp.emfstore.internal.ui.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecp.spi.core.InternalRepository;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * This is the EMFStore LogOut Handler delegating to the EMFStore {@link EMFStoreLogOutHelper}.
 *
 * @author Eugen Neufeld
 *
 */
public class EmfstoreLogOutHandler extends AbstractHandler {

	/** {@inheritDoc} **/
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final InternalRepository ecpRepository = (InternalRepository) ((IStructuredSelection) HandlerUtil
			.getActiveMenuSelection(event)).getFirstElement();
		EMFStoreLogOutHelper.logout(ecpRepository, HandlerUtil.getActiveShell(event));
		return null;
	}

}
