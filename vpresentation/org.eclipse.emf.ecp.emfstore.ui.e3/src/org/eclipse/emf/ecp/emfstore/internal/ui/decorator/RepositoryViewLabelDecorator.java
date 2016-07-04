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

import org.eclipse.emf.ecp.core.ECPProvider;
import org.eclipse.emf.ecp.core.ECPRepository;
import org.eclipse.emf.ecp.core.util.ECPUtil;
import org.eclipse.emf.ecp.emfstore.core.internal.EMFStoreProvider;
import org.eclipse.emf.ecp.emfstore.internal.ui.e3.Activator;
import org.eclipse.emf.ecp.spi.core.InternalRepository;
import org.eclipse.emf.emfstore.client.ESServer;
import org.eclipse.emf.emfstore.client.ESUsersession;
import org.eclipse.emf.emfstore.client.observer.ESLoginObserver;
import org.eclipse.emf.emfstore.client.observer.ESLogoutObserver;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.LabelProviderChangedEvent;
import org.eclipse.swt.widgets.Display;

/**
 * Decorates the label of a {@link org.eclipse.emf.emfstore.internal.client.model.ServerInfo} object according to its
 * login state.
 *
 * @author Eugen Neufeld
 * @see ILightweightLabelDecorator
 */
public class RepositoryViewLabelDecorator extends LabelProvider implements ILightweightLabelDecorator, ESLoginObserver,
	ESLogoutObserver {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void decorate(Object element, IDecoration decoration) {
		if (element instanceof ECPRepository) {
			final InternalRepository repository = (InternalRepository) element;
			final ECPProvider provider = repository.getProvider();

			if (provider != null && EMFStoreProvider.NAME.equalsIgnoreCase(provider.getName())) {
				final ESServer server = EMFStoreProvider.INSTANCE.getServerInfo(repository);
				if (server.getLastUsersession() != null && server.getLastUsersession().isLoggedIn()) {
					decoration.addOverlay(Activator.getImageDescriptor("icons/bullet_green.png"), //$NON-NLS-1$
						IDecoration.BOTTOM_RIGHT);
				} else {
					decoration.addOverlay(Activator.getImageDescriptor("icons/bullet_delete.png"), //$NON-NLS-1$
						IDecoration.BOTTOM_RIGHT);
				}
			}
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.BaseLabelProvider#addListener(org.eclipse.jface.viewers.ILabelProviderListener)
	 */
	@Override
	public void addListener(ILabelProviderListener listener) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.BaseLabelProvider#dispose()
	 */
	@Override
	public void dispose() {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.BaseLabelProvider#removeListener(org.eclipse.jface.viewers.ILabelProviderListener)
	 */
	@Override
	public void removeListener(ILabelProviderListener listener) {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void loginCompleted(ESUsersession session) {
		update(session);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void logoutCompleted(ESUsersession session) {
		update(session);
	}

	private void update(final ESUsersession usersession) {

		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				// TODO cast
				fireLabelProviderChanged(new LabelProviderChangedEvent(RepositoryViewLabelDecorator.this,

					// EMFStoreProvider.INSTANCE.getRepository(((ESServerImpl) usersession.getServer())
					// .toInternalAPI())));
					((EMFStoreProvider) ECPUtil.getResolvedElement(ECPUtil.getECPProviderRegistry()
						.getProvider(EMFStoreProvider.NAME))).getRepository(usersession.getServer()
						)));
			}
		});
	}
}
