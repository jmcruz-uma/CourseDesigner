package org.mindmap.ui.diagram.conceptsDiagram.custom;


import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.emfstore.client.provider.ESEditingDomainProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl.FactoryImpl;

public class TransactionalEditingDomainProvider implements ESEditingDomainProvider {

	private static final String TRANSACTIONAL_EDITINGDOMAIN_ID = "org.eclipse.emf.emfstore.EditingDomain";

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.emfstore.client.model.util.EditingDomainProvider#getEditingDomain(org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	public EditingDomain getEditingDomain(ResourceSet resourceSet) {
		TransactionalEditingDomain domain = new TransactionalEditingDomainImpl(new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE), new EMFStoreTransactionalCommandStack(), resourceSet);
		((FactoryImpl) TransactionalEditingDomain.Factory.INSTANCE).mapResourceSet(domain);
		domain.setID(TRANSACTIONAL_EDITINGDOMAIN_ID);
		TransactionalEditingDomain.Registry.INSTANCE.add(TRANSACTIONAL_EDITINGDOMAIN_ID, domain);
		return domain;
	}

}