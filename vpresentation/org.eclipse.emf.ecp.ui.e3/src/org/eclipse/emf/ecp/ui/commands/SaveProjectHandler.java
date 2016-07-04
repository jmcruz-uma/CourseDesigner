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
import org.eclipse.emf.ecp.core.util.ECPUtil;
import org.eclipse.emf.ecp.spi.ui.util.ECPHandlerHelper;
import org.eclipse.emf.ecp.ui.tester.ECPSavePropertySource;
import org.eclipse.emf.ecp.ui.tester.SaveButtonEnablementObserver;

/**
 * This Handler uses the {@link ECPHandlerHelper#saveProject(ECPProject)} method
 * to save changes of a dirty project.
 *
 * @author Eugen Neufeld
 * @author Johannes Faltermeier
 */
public class SaveProjectHandler extends AbstractHandler {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final ECPProject project = ECPSavePropertySource.getProjectToSave();
		if (project != null) {
			ECPHandlerHelper.saveProject(project);
			ECPUtil.getECPObserverBus().notify(SaveButtonEnablementObserver.class)
				.notifyChangeButtonState(null, false);
		}
		return null;
	}

}
