/*******************************************************************************
 * Copyright (c) 2011-2013 EclipseSource Muenchen GmbH and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Johannes Faltermeier - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.ecp.emfstore.internal.ui.decorator;

import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.core.ECPProvider;
import org.eclipse.emf.ecp.core.util.ECPUtil;
import org.eclipse.emf.ecp.emfstore.core.internal.EMFStoreProvider;
import org.eclipse.emf.ecp.spi.core.InternalProject;
import org.eclipse.emf.emfstore.client.ESLocalProject;
import org.eclipse.emf.emfstore.client.observer.ESShareObserver;
import org.eclipse.emf.emfstore.server.model.versionspec.ESPrimaryVersionSpec;
import org.eclipse.jface.viewers.ILabelDecorator;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

/**
 * @author jfaltermeier
 *
 */
public class ProjectEMFStoreBranchDecorator implements ILabelDecorator, ESShareObserver {

	@Override
	public void addListener(ILabelProviderListener listener) {
	}

	@Override
	public void dispose() {
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {

	}

	@Override
	public void shareDone(ESLocalProject localProject) {
		decorateText(localProject.getProjectName(), localProject);
	}

	@Override
	public Image decorateImage(Image image, Object element) {
		return image;
	}

	@Override
	public String decorateText(String text, Object element) {
		ESLocalProject localProject = null;
		if (element instanceof ESLocalProject) {
			localProject = (ESLocalProject) element;
		} else if (element instanceof ECPProject) {
			final ECPProvider ecpProvider = ECPUtil.getECPProviderRegistry().getProvider(EMFStoreProvider.NAME);
			final EMFStoreProvider provider = (EMFStoreProvider) ECPUtil.getResolvedElement(ecpProvider);
			final InternalProject project = (InternalProject) element;
			if (ecpProvider.equals(project.getProvider())) {
				localProject = provider.getProjectSpace(project);
			}
		} else {
			return text;
		}

		if (localProject == null) {
			return text;
		}

		if (localProject.isShared()) {
			ESPrimaryVersionSpec versSpec;
			try {
				versSpec = localProject.getBaseVersion();
				return text
					+ " [" + versSpec.getBranch() + Messages.ProjectEMFStoreBranchDecorator_Version + versSpec.getIdentifier() + "]"; //$NON-NLS-1$ //$NON-NLS-2$
			} catch (final NullPointerException e) {
				// possible npe because share is async. -> shareobserver
			}

		}
		return text;
	}

}
