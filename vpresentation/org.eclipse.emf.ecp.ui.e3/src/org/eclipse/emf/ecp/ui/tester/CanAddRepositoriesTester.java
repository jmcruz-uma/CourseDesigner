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
 ******************************************************************************/
package org.eclipse.emf.ecp.ui.tester;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecp.core.ECPProvider;
import org.eclipse.emf.ecp.core.util.ECPUtil;

/**
 * Tests, whether repositories can be added. This is the case if there is at least one provider installed, which allows
 * to create repositories.
 *
 * @author Jonas
 *
 */
public class CanAddRepositoriesTester extends PropertyTester {

	/**
	 *
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.core.expressions.IPropertyTester#test(java.lang.Object, java.lang.String, java.lang.Object[],
	 *      java.lang.Object)
	 */
	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		for (final ECPProvider provider : ECPUtil.getECPProviderRegistry().getProviders())
		{
			if (provider.hasCreateRepositorySupport())
			{
				return expectedValue.equals(true);
			}
		}
		return expectedValue.equals(false);
	}

}
