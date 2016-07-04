package org.mindmap.ui.diagram.conceptsDiagram.wizards;

import org.eclipse.emf.ecp.core.util.ECPCheckoutSource;
import org.eclipse.emf.ecp.core.util.ECPProperties;
import org.eclipse.emf.ecp.core.util.ECPUtil;
import org.eclipse.emf.ecp.internal.ui.Messages;
import org.eclipse.emf.ecp.spi.ui.UIProvider;
import org.eclipse.emf.ecp.spi.ui.UIProviderRegistry;
import org.eclipse.emf.ecp.ui.common.CheckoutProjectComposite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;


public class MiCheckoutProjectCompositeImpl implements MiCheckoutProjectComposite {

	private MiCheckoutProjectChangeListener listener;

	private String projectName;

	private final ECPProperties projectProperties = ECPUtil.createProperties();

	private final ECPCheckoutSource checkoutSource;

	private final UIProvider uiProvider;

	/**
	 * Constructor for creating a checkout composite.
	 *
	 * @param checkoutSource the object to checkout
	 */
	public MiCheckoutProjectCompositeImpl(ECPCheckoutSource checkoutSource) {
		this.checkoutSource = checkoutSource;
		projectName = this.checkoutSource.getDefaultCheckoutName();
		if (projectName == null) {
			projectName = ""; //$NON-NLS-1$
		}
		uiProvider = UIProviderRegistry.INSTANCE.getUIProvider(checkoutSource);
	}

	/** {@inheritDoc} **/
	@Override
	public Composite createUI(Composite parent) {
		final Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		composite.setLayout(new GridLayout(2, false));

		final Label lblNewLabel = new Label(composite, SWT.NONE);
		lblNewLabel.setText(Messages.CheckoutProjectComposite_ProjectName);

		final Text projectNameText = new Text(composite, SWT.BORDER);
		projectNameText.setText(projectName);
		projectNameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		projectNameText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				projectName = projectNameText.getText();
				if (listener != null) {
					listener.projectNameChanged(projectName);
				}
			}
		});
		final StackLayout providerStackLayout = new StackLayout();
		final Composite providerStack = new Composite(composite, SWT.NONE);
		providerStack.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		providerStack.setLayout(providerStackLayout);
		final Control checkoutUI = uiProvider.createCheckoutUI(providerStack, checkoutSource, projectProperties);
		if (checkoutUI != null) {
			providerStackLayout.topControl = checkoutUI;
			providerStack.layout();
		}

		return composite;
	}

	/** {@inheritDoc} **/
	@Override
	public String getProjectName() {
		return projectName;
	}

	/** {@inheritDoc} **/
	@Override
	public ECPProperties getProjectProperties() {
		return projectProperties;
	}

	/** {@inheritDoc} **/
	@Override
	public ECPCheckoutSource getCheckoutSource() {
		return checkoutSource;
	}

	/** {@inheritDoc} **/
	@Override
	public UIProvider getUiProvider() {
		return uiProvider;
	}

	/** {@inheritDoc} **/
	@Override
	public void setListener(MiCheckoutProjectChangeListener listener) {
		this.listener = listener;
	}

	/** {@inheritDoc} **/
	@Override
	public void dispose() {
	}
}

