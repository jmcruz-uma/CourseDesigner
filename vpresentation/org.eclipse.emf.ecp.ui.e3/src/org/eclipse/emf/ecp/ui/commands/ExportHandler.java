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
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecp.internal.ui.util.ECPExportHandlerHelper;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Export model element handler.
 *
 * @author Eugen Neufeld
 *
 */
public class ExportHandler extends AbstractHandler {

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		final List<EObject> exportModelElements = getSelfContainedModelElementTree(event);

		ECPExportHandlerHelper.export(HandlerUtil.getActiveShell(event), exportModelElements);

		return null;
	}

	private List<EObject> getSelfContainedModelElementTree(ExecutionEvent event) {
		final List<EObject> result = new ArrayList<EObject>();

		final ISelection selection = HandlerUtil.getActiveMenuSelection(event);
		IStructuredSelection strucSel = null;
		EObject copyModelElement = null;

		if (selection != null && selection instanceof IStructuredSelection) {
			strucSel = (IStructuredSelection) selection;
			final Object firstElement = strucSel.getFirstElement();
			if (firstElement instanceof EObject) {
				// TODO: ChainSaw - check whether specific clone functionality of ModelUtil is needed here
				copyModelElement = EcoreUtil.copy((EObject) firstElement);
				// copyModelElement = ModelUtil.clone((EObject) firstElement);

				// only export the rootnode makes xml with references, otherwise (see (commented) line two) the children
				// will be "real" nested as containments of the node (is not necessary)
				result.add(copyModelElement);
				// result.addAll(copyModelElement.getAllContainedModelElements());

			} else {
				// do nothing System.out.println("NOT A MODELELEMENT");
			}
		}

		return result;
	}
}
