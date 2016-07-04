/*******************************************************************************
 * Copyright (c) 2011-2012 EclipseSource Muenchen GmbH and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Edgar Mueller - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.emf.ecp.emfstore.internal.ui.decorator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.common.spi.cachetree.AbstractCachedTree;
import org.eclipse.emf.ecp.common.spi.cachetree.CachedTreeNode;
import org.eclipse.emf.ecp.common.spi.cachetree.IExcludedObjectsCallback;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.spi.core.InternalProject;

/**
 * Cached tree implementation for dirty decorators of model elements managed by EMFStore.
 *
 * @author emueller
 *
 */
public final class EMFStoreDirtyDecoratorCachedTree extends AbstractCachedTree<Integer> {

	private static Map<ECPProject, EMFStoreDirtyDecoratorCachedTree> cashedTrees = new HashMap<ECPProject, EMFStoreDirtyDecoratorCachedTree>();

	/**
	 * Removes an ECPProject from the Cache.
	 *
	 * @param project the project
	 */
	public static void removeProject(ECPProject project) {
		cashedTrees.remove(project);
	}

	/**
	 * Static {@link EMFStoreDirtyDecoratorCachedTree} singleton.
	 *
	 * @param project the {@link ECPProject} to initialize this CashedTree on
	 * @return Static instance of the {@link EMFStoreDirtyDecoratorCachedTree}
	 */
	public static EMFStoreDirtyDecoratorCachedTree getInstance(final ECPProject project) {
		if (!cashedTrees.containsKey(project)) {
			cashedTrees.put(project, new EMFStoreDirtyDecoratorCachedTree(new IExcludedObjectsCallback() {

				@Override
				public boolean isExcluded(Object object) {
					return ((InternalProject) project).isModelRoot(object);
				}
			}));
		}
		return cashedTrees.get(project);
	}

	/**
	 * Private constructor.
	 */
	private EMFStoreDirtyDecoratorCachedTree(IExcludedObjectsCallback callback) {
		super(callback);
	}

	/**
	 * Cached tree node that stores the dirty state of a model element managed by EMFStore.
	 */
	public class CachedDirtyStateTreeNode extends CachedTreeNode<Integer> {

		/**
		 * Constructor.
		 *
		 * @param value
		 *            the initial value for this entry
		 */
		public CachedDirtyStateTreeNode(Integer value) {
			super(0);
			setChildValue(getDefaultValue());
		}

		/**
		 * {@inheritDoc}
		 */
		@Override
		public void update() {
			setChildValue(getDefaultValue());
			for (final Integer value : values()) {
				if (value > getChildValue()) {
					setChildValue(value);
					break;
				}
			}
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.emf.ecp.ui.common.CachedTreeNode#getDisplayValue()
		 */
		@Override
		public Integer getDisplayValue() {
			return getChildValue() > 0 || getOwnValue() > 0 ? 1 : 0;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer getDefaultValue() {
		return 0;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CachedTreeNode<Integer> createdCachedTreeNode(Integer t) {
		return new CachedDirtyStateTreeNode(t);
	}

	/**
	 * Call to indicate that an {@link EObject} was added.
	 *
	 * @param eObject the new {@link EObject}
	 * @return the {@link Set} of {@link EObject} affected by this change
	 */
	public Set<EObject> addOperation(EObject eObject) {
		int value = 0;
		final CachedTreeNode<Integer> node = getNodes().get(eObject);
		if (node != null) {
			value = node.getOwnValue();
		}
		return update(eObject, ++value);
	}

	/**
	 * Call to indicate that an {@link EObject} was removed.
	 *
	 * @param eObject the removed {@link EObject}
	 * @return the {@link Set} of {@link EObject} affected by this change
	 */
	public Set<EObject> removeOperation(EObject eObject) {
		int value = 0;
		final CachedTreeNode<Integer> node = getNodes().get(eObject);
		if (node != null) {
			value = node.getOwnValue();
		}

		return update(eObject, Math.max(0, --value));
	}

	/**
	 * Sets the operation count for the given object.
	 *
	 * @param eObject the eobject
	 * @param count the new count
	 * @return the set of affected elements
	 */
	public Set<EObject> setOperationCount(EObject eObject, int count) {
		return update(eObject, count);
	}

	/**
	 * Gets the own cached value of the given object.
	 *
	 * @param eObject the e object
	 * @return the own cached value
	 */
	public int getOwnValue(EObject eObject) {
		int value = 0;
		final CachedTreeNode<Integer> node = getNodes().get(eObject);
		if (node != null) {
			value = node.getOwnValue();
		}
		return value;
	}
}
