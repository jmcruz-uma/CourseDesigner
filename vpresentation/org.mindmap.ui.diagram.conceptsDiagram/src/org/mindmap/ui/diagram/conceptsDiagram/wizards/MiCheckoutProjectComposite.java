package org.mindmap.ui.diagram.conceptsDiagram.wizards;


import org.eclipse.emf.ecp.core.util.ECPCheckoutSource;
import org.eclipse.emf.ecp.core.util.ECPProperties;
import org.eclipse.emf.ecp.spi.common.ui.CompositeProvider;
import org.eclipse.emf.ecp.spi.ui.UIProvider;


public interface MiCheckoutProjectComposite extends CompositeProvider {

	/**
	 * Listener interface that will be notified if the projectName changes.
	 */
	public interface MiCheckoutProjectChangeListener {
		/**
		 * Callback method providing the new project name.
		 *
		 * @param projectName the new project name
		 */
		void projectNameChanged(String projectName);
	}

	/**
	 * @return the project name
	 */
	String getProjectName();

	/**
	 * @return the project properties
	 */
	ECPProperties getProjectProperties();

	/**
	 * @return the checkoutSource
	 */
	ECPCheckoutSource getCheckoutSource();

	/**
	 * @return the uiProvider
	 */
	UIProvider getUiProvider();

	/**
	 * @param miCheckoutProjectChangeListener
	 *            the listener to set
	 */
	void setListener(MiCheckoutProjectChangeListener miCheckoutProjectChangeListener);
}

