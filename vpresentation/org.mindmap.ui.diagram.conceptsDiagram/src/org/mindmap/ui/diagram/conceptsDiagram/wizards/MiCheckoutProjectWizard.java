package org.mindmap.ui.diagram.conceptsDiagram.wizards;

import java.util.List;

import org.eclipse.emf.ecp.core.ECPRepository;
import org.eclipse.emf.ecp.core.util.ECPCheckoutSource;
import org.eclipse.emf.ecp.core.util.ECPUtil;
import org.eclipse.emf.ecp.internal.ui.Activator;
import org.eclipse.emf.ecp.internal.ui.Messages;
import org.eclipse.emf.ecp.spi.common.ui.ECPWizard;
import org.eclipse.emf.emfstore.client.ESLocalProject;
import org.eclipse.emf.emfstore.client.ESWorkspaceProvider;
import org.eclipse.emf.emfstore.internal.client.model.impl.api.ESWorkspaceImpl;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Composite;
import org.mindmap.model.control.ProjectControl;
import org.mindmap.ui.diagram.conceptsDiagram.wizards.MiCheckoutProjectComposite.MiCheckoutProjectChangeListener;

public class MiCheckoutProjectWizard extends
		ECPWizard<MiCheckoutProjectComposite> {

	@Override
	public boolean performFinish() {
		return true;
	}

	@Override
	public void addPages() {
		final WizardPage wp = new WizardPage("Checkout") //$NON-NLS-1$
		{

			@Override
			public void createControl(Composite parent) {
				final Composite composite = getCompositeProvider().createUI(
						parent);

				getCompositeProvider().setListener(
						new MiCheckoutProjectChangeListener() {
							@Override
							public void projectNameChanged(String projectName) {
								validateName(projectName);
							}
						});

				// validate initial project name
				validateName(getCompositeProvider().getProjectName());
				setControl(composite);
			}

			private void validateName(String projectName) {
				
				ESWorkspaceImpl workspace = (ESWorkspaceImpl) ESWorkspaceProvider.INSTANCE
						.getWorkspace();
				List<ESLocalProject> list = workspace.getLocalProjects();
				
				int i = ProjectControl.buscarProyectoLocal(list, projectName);
				if (i != -1) {
					setPageComplete(false);
					setErrorMessage("Un proyecto con el nombre " + projectName
							+ " ya existe en el espacio de trabajo.");
				} else {
					setErrorMessage(null);
					setPageComplete(true);
				}
			}
		};
		addPage(wp);

		wp.setTitle(Messages.CheckoutProjectWizard_PageTitle_CheckoutProject);
		wp.setImageDescriptor(Activator
				.getImageDescriptor("icons/checkout_project_wiz.png")); //$NON-NLS-1$

		final ECPCheckoutSource checkoutSource = getCompositeProvider()
				.getCheckoutSource();

		final ECPRepository repository = checkoutSource.getRepository();
		if (checkoutSource == repository) {
			wp.setMessage(Messages.CheckoutProjectWizard_PageMessage_CheckoutRepositrory
					+ repository.getLabel() + "."); //$NON-NLS-1$
		} else {
			wp.setMessage(Messages.CheckoutProjectWizard_PageMessage_CheckoutProject +' '
					+ getCompositeProvider().getUiProvider().getText(
							checkoutSource)
					+ Messages.CheckoutProjectWizard_PageMessage_CheckoutFrom+' '
					+ repository.getLabel() + "."); //$NON-NLS-1$
		}
		setWindowTitle(Messages.CheckoutProjectWizard_Title_Checkout);
	}
}
