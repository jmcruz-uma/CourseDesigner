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
package org.eclipse.emf.ecp.emfstore.internal.ui.decorator;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.core.util.ECPUtil;
import org.eclipse.emf.ecp.core.util.observer.ECPProjectPreDeleteObserver;
import org.eclipse.emf.ecp.emfstore.core.internal.EMFStoreProvider;
import org.eclipse.emf.ecp.emfstore.internal.ui.e3.Activator;
import org.eclipse.emf.ecp.spi.core.InternalProject;
import org.eclipse.emf.emfstore.client.ESLocalProject;
import org.eclipse.emf.emfstore.client.observer.ESCommitObserver;
import org.eclipse.emf.emfstore.internal.client.model.ProjectSpace;
import org.eclipse.emf.emfstore.internal.client.model.impl.api.ESLocalProjectImpl;
import org.eclipse.emf.emfstore.server.model.ESChangePackage;
import org.eclipse.emf.emfstore.server.model.versionspec.ESPrimaryVersionSpec;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;

/**
 * @author Eugen Neufeld
 */
public class EMFStoreDirtyDecorator implements ILightweightLabelDecorator, ESCommitObserver,
	ECPProjectPreDeleteObserver {

	public final static String dirtyPath = "icons/dirty.png"; //$NON-NLS-1$
	private static Map<ECPProject, EMFStoreDirtyObserver> observers = new HashMap<ECPProject, EMFStoreDirtyObserver>();

	/**
	 * Instantiates a new EMFStoreDirtyDecorator.
	 */
	public EMFStoreDirtyDecorator() {
		super();
		ECPUtil.getECPObserverBus().register(this);
	}

	/** {@inheritDoc} */
	@Override
	public void decorate(Object element, IDecoration decoration) {
		if (element instanceof ECPProject) {
			final InternalProject project = (InternalProject) element;
			if (ECPUtil.getECPProjectManager().getProject(project.getName()) == null) {
				return;
			}
			final ProjectSpace projectSpace = ((ESLocalProjectImpl) EMFStoreProvider.INSTANCE.getProjectSpace(project))
				.toInternalAPI();

			if (!observers.containsKey(element)) {
				final EMFStoreDirtyObserver emfStoreDirtyObserver = new EMFStoreDirtyObserver(projectSpace, project);
				projectSpace.getOperationManager().addOperationObserver(emfStoreDirtyObserver);
				observers.put((ECPProject) element, emfStoreDirtyObserver);
			}
			if (project.isOpen() && projectSpace.isShared() && observers.get(element).isDirty()) {
				decoration.addOverlay(Activator.getImageDescriptor(dirtyPath), IDecoration.BOTTOM_LEFT);
			}
		}

		else if (element instanceof EObject) {
			InternalProject project = null;
			try {
				project = (InternalProject) ECPUtil.getECPProjectManager().getProject(element);
			} catch (final IllegalArgumentException iae) {
				// ignore
			}
			if (project != null && project.isOpen() && EMFStoreProvider.INSTANCE.getProjectSpace(project).isShared()
				&& EMFStoreDirtyDecoratorCachedTree.getInstance(project).getCachedValue(element) > 0) {
				decoration.addOverlay(Activator.getImageDescriptor(dirtyPath), IDecoration.BOTTOM_LEFT);
			} else {
				decoration.addOverlay(null);
			}
			return;
		}

	}

	/** {@inheritDoc} */
	@Override
	public void addListener(ILabelProviderListener listener) {
	}

	/** {@inheritDoc} */
	@Override
	public void dispose() {
	}

	/** {@inheritDoc} */
	@Override
	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	/** {@inheritDoc} */
	@Override
	public void removeListener(ILabelProviderListener listener) {
	}

	/** {@inheritDoc} */
	@Override
	public boolean inspectChanges(ESLocalProject localProject, ESChangePackage changePackage, IProgressMonitor monitor) {
		return true;
	}

	/** {@inheritDoc} */
	@Override
	public void commitCompleted(ESLocalProject localProject, ESPrimaryVersionSpec newRevision, IProgressMonitor monitor) {
		// TODO: cast, move to EMFStoreDirtyObserver?
		final ECPProject project = EMFStoreProvider.INSTANCE.getProject(localProject);
		EMFStoreDirtyDecoratorCachedTree.getInstance(project).clear();
		observers.get(project).clearObserverCache();
	}

	/** {@inheritDoc} */
	@Override
	public void projectDelete(ECPProject project) {
		EMFStoreDirtyDecoratorCachedTree.removeProject(project);
		observers.remove(project);
	}

}
