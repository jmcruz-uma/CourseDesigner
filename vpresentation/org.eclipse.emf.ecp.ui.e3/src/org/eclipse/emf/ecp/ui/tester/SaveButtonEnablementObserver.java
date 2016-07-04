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

import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.core.util.observer.ECPObserver;

/**
 * Listener for changing the enablement of the save button.
 *
 * @author jfaltermeier
 *
 */
public interface SaveButtonEnablementObserver extends ECPObserver {

	/**
	 * Notify the listener to change the state of the save button.
	 *
	 * @param currentProject the project associated with the save button
	 * @param enableSaveButton whether to enable or disable the save button
	 */
	void notifyChangeButtonState(ECPProject currentProject, boolean enableSaveButton);
}
