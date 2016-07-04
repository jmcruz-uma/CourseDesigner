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
package org.eclipse.emf.ecp.ui.platform;

import java.net.URL;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 */
public class Activator extends AbstractUIPlugin {

	/** The plug-in ID. */
	public static final String PLUGIN_ID = "org.eclipse.emf.ecp.ui.e3"; //$NON-NLS-1$

	// The shared instance
	private static Activator instance;

	/**
	 * The constructor.
	 */
	public Activator() {
	}

	// BEGIN SUPRESS CATCH EXCEPTION
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		instance = this;

	}

	@Override
	public void stop(BundleContext context) throws Exception {
		instance = null;
		super.stop(context);
	}

	// END SUPRESS CATCH EXCEPTION
	/**
	 * Returns the shared instance.
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return instance;
	}

	/**
	 * Logs messages.
	 *
	 * @param message the message
	 */
	public static void log(String message) {
		instance.getLog().log(new Status(IStatus.INFO, PLUGIN_ID, message));
	}

	/**
	 * Logs messages and {@link Throwable}.
	 *
	 * @param message the message
	 * @param t the throwable
	 */
	public static void log(String message, Throwable t) {
		if (t instanceof CoreException) {
			final CoreException coreException = (CoreException) t;
			instance.getLog().log(coreException.getStatus());
		} else {
			instance.getLog().log(new Status(IStatus.ERROR, PLUGIN_ID, message, t));
		}
	}

	/**
	 * Logs {@link IStatus}.
	 *
	 * @param status the {@link IStatus}
	 */
	public static void log(IStatus status) {
		instance.getLog().log(status);
	}

	/**
	 * Logs {@link Throwable}.
	 *
	 * @param t the {@link Throwable}
	 * @return the message of the created status
	 */
	public static String log(Throwable t) {
		final IStatus status = getStatus(t);
		log(status);
		return status.getMessage();
	}

	/**
	 * Gets a {@link IStatus} for a throwable.
	 *
	 * @param t the {@link Throwable}
	 * @return the created {@link IStatus}
	 */
	public static IStatus getStatus(Throwable t) {
		if (t instanceof CoreException) {
			final CoreException coreException = (CoreException) t;
			return coreException.getStatus();
		}

		String msg = t.getLocalizedMessage();
		if (msg == null || msg.length() == 0) {
			msg = t.getClass().getName();
		}

		return new Status(IStatus.ERROR, PLUGIN_ID, msg, t);
	}

	/**
	 * Returns an {@link ImageDescriptor} for a path.
	 *
	 * @param path the path to an image
	 * @return the {@link ImageDescriptor}
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		// return ResourceManager.getPluginImageDescriptor(PLUGIN_ID, path);
		ImageDescriptor id = getDefault().getImageRegistry().getDescriptor(path);
		if (id == null) {
			id = loadImageDescriptor(path);
		}
		return id;
	}

	/**
	 * Gets an {@link Image} for a path.
	 *
	 * @param path the path to an image
	 * @return the image
	 */
	public static Image getImage(String path) {
		Image image = getDefault().getImageRegistry().get(path);
		if (image == null) {
			image = loadImage(path);
		}
		return image;
	}

	private static Image loadImage(String path) {
		final ImageDescriptor id = loadImageDescriptor(path);
		if (id == null) {
			return null;
		}
		getDefault().getImageRegistry().put(path, id);
		return getDefault().getImageRegistry().get(path);
	}

	private static ImageDescriptor loadImageDescriptor(String path) {
		final URL url = FileLocator.find(Platform.getBundle(PLUGIN_ID), new Path(path), null);
		if (url == null) {
			return null;
		}
		final ImageDescriptor imageDescriptor = ImageDescriptor.createFromURL(url);
		getDefault().getImageRegistry().put(path, imageDescriptor);
		return imageDescriptor;
	}
}
