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
 ******************************************************************************/
package org.eclipse.emf.ecp.ui.tester;

import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.core.util.ECPUtil;
import org.eclipse.ui.AbstractSourceProvider;
import org.eclipse.ui.ISources;

/**
 * @author jfaltermeier
 *
 */
public class ECPSavePropertySource extends AbstractSourceProvider {

	/**
	 * Name of the property defining the save state of the currently selected project space.
	 */
	public static final String CURRENT_SAVE_STATE_PROPERTY = "org.eclipse.emf.ecp.ui.e3.workbench.menu.currentProjectHasUnsavedChanges"; //$NON-NLS-1$

	private final SaveButtonEnablementObserver saveButtonEnablementObserver;

	private boolean isSaveButtonEnabled;

	private static ECPProject project;

	/**
	 * Default Constructor.
	 */
	public ECPSavePropertySource() {
		saveButtonEnablementObserver = new SaveButtonEnablementObserver() {

			@Override
			public void notifyChangeButtonState(ECPProject currentProject, boolean enableSaveButton) {
				project = currentProject;
				fireSourceChanged(ISources.WORKBENCH, CURRENT_SAVE_STATE_PROPERTY, enableSaveButton);
			}
		};
		ECPUtil.getECPObserverBus().register(saveButtonEnablementObserver);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.ISourceProvider#dispose()
	 */
	@Override
	public void dispose() {
		if (saveButtonEnablementObserver != null) {
			ECPUtil.getECPObserverBus().unregister(saveButtonEnablementObserver);
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.ISourceProvider#getCurrentState()
	 */
	@Override
	public Map<String, Object> getCurrentState() {
		final Map<String, Object> map = new LinkedHashMap<String, Object>();
		map.put(CURRENT_SAVE_STATE_PROPERTY, isSaveButtonEnabled);
		return map;
	}

	/**
	 * Returns the project to be saved.
	 *
	 * @return the project which enabled the save button
	 */
	public static ECPProject getProjectToSave() {
		return project;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.ISourceProvider#getProvidedSourceNames()
	 */
	@Override
	public String[] getProvidedSourceNames() {
		return new String[] { CURRENT_SAVE_STATE_PROPERTY };
	}

}
