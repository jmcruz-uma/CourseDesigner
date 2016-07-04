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
package org.eclipse.emf.ecp.emfstore.internal.ui.decorator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.spi.core.InternalProject;
import org.eclipse.emf.emfstore.internal.client.model.ProjectSpace;
import org.eclipse.emf.emfstore.internal.client.observers.OperationObserver;
import org.eclipse.emf.emfstore.internal.common.model.ModelElementId;
import org.eclipse.emf.emfstore.internal.common.model.Project;
import org.eclipse.emf.emfstore.internal.server.model.versioning.operations.AbstractOperation;
import org.eclipse.emf.emfstore.internal.server.model.versioning.operations.CreateDeleteOperation;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IDecoratorManager;
import org.eclipse.ui.PlatformUI;

/**
 * Project change observer that marks elements as dirty.
 *
 * @author Tobias Verhoeven
 */
public class EMFStoreDirtyObserver implements OperationObserver {

	private static final String DIRTYDECORATORID = "org.eclipse.emf.ecp.emfstore.ui.decorators.EMFStoreDirtyDecorator"; //$NON-NLS-1$
	private ProjectSpace projectSpace;
	private InternalProject internalProject;
	private final Map<ModelElementId, Integer> modelElementIdToOperationCount = new HashMap<ModelElementId, Integer>();
	private Set<EObject> lastAffected;
	private int operations;

	/**
	 * Default constructor.
	 *
	 * @param projectSpace the ProjectSpace of the decorator
	 * @param project the ecpproject of the decorator
	 */
	public EMFStoreDirtyObserver(ProjectSpace projectSpace, InternalProject project) {
		this.projectSpace = projectSpace;
		internalProject = project;

		if (!projectSpace.isShared()) {
			return;
		}
		initCachedTree(projectSpace);
	}

	private void initCachedTree(ProjectSpace ps) {
		for (final AbstractOperation operation : ps.getOperations()) {
			operations++;
			for (final ModelElementId modelElementId : operation.getAllInvolvedModelElements()) {
				final EObject element = ps.getProject().getModelElement(modelElementId);
				if (element != null) {
					EMFStoreDirtyDecoratorCachedTree.getInstance(internalProject).addOperation(element);
				}
			}
			removeDeletedElementsFromCachedTree(ps, operation);
		}
	}

	/** {@inheritDoc} */
	@Override
	public void operationExecuted(AbstractOperation operation) {
		operations++;
		if (!projectSpace.isShared()) {
			return;
		}

		lastAffected = new HashSet<EObject>();
		for (final ModelElementId modelElementId : operation.getAllInvolvedModelElements()) {
			final Project project = projectSpace.getProject();

			final EObject element = project.getModelElement(modelElementId);

			if (element != null) {
				lastAffected.add(element);
				lastAffected
					.addAll(EMFStoreDirtyDecoratorCachedTree.getInstance(internalProject).addOperation(element));
			}
			removeDeletedElementsFromCachedTree(projectSpace, operation);
		}
		updateDecoration();
	}

	/** {@inheritDoc} */
	@Override
	public void operationUndone(AbstractOperation operation) {
		operations--;
		if (!projectSpace.isShared()) {
			return;
		}
		lastAffected = new HashSet<EObject>();

		for (final ModelElementId modelElementId : operation.getAllInvolvedModelElements()) {
			final Project project = projectSpace.getProject();
			final EObject element = project.get(modelElementId);

			if (element != null) {
				lastAffected.add(element);
				lastAffected.addAll(EMFStoreDirtyDecoratorCachedTree.getInstance(internalProject).removeOperation(
					element));
			}
		}
		initializeRestoredDeletedElement(operation);
		updateDecoration();
	}

	private void updateDecoration() {
		// TODO remove dependency to workbench
		final IDecoratorManager decoratorManager = PlatformUI.getWorkbench().getDecoratorManager();
		if (decoratorManager != null) {
			Display.getDefault().syncExec(new Runnable() {

				@Override
				public void run() {
					decoratorManager.update(DIRTYDECORATORID);
				}
			});

		}
	}

	/**
	 * @param projectSpace
	 * @param operation
	 */
	private void removeDeletedElementsFromCachedTree(ProjectSpace projectSpace, AbstractOperation operation) {
		if (operation instanceof CreateDeleteOperation) {
			final CreateDeleteOperation cdo = (CreateDeleteOperation) operation;

			if (cdo.isDelete()) {

				modelElementIdToOperationCount.put(cdo.getModelElementId(), EMFStoreDirtyDecoratorCachedTree
					.getInstance(internalProject).getOwnValue(projectSpace.getProject().get(cdo.getModelElementId())));

				EMFStoreDirtyDecoratorCachedTree.getInstance(internalProject).remove(
					projectSpace.getProject().get(cdo.getModelElementId()));
				// TODO: consider containments
			}
		}
	}

	/**
	 * @param operation
	 */
	private void initializeRestoredDeletedElement(AbstractOperation operation) {
		if (operation instanceof CreateDeleteOperation) {
			final CreateDeleteOperation cdo = (CreateDeleteOperation) operation;

			if (cdo.isDelete()) {
				lastAffected.addAll(EMFStoreDirtyDecoratorCachedTree.getInstance(internalProject).setOperationCount(
					projectSpace.getProject().get(cdo.getModelElementId()),
					modelElementIdToOperationCount.get(cdo.getModelElementId().toAPI())));

				modelElementIdToOperationCount.remove(projectSpace.getProject().get(cdo.getModelElementId()));
				// TODO: consider containments
			}
		}
	}

	/**
	 * The Collection of {@link EObject} that were affected during last operation.
	 *
	 * @return a {@link Set} of {@link EObject} affected or null if none
	 */
	public Set<EObject> getLastAffected() {
		return lastAffected;
	}

	/**
	 * Clears the cache of deleted elements and resets the operation count to 0.
	 */
	public void clearObserverCache() {
		modelElementIdToOperationCount.clear();
		operations = 0;
	}

	/**
	 * Returns weather the observed projectSpac is dirty.
	 *
	 * @return true, if is dirty.
	 */
	public boolean isDirty() {
		return operations > 0;
	}
}