package org.mindmap.ui.diagram.conceptsDiagram.custom;

import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.emfstore.client.ESLocalProject;
import org.eclipse.emf.emfstore.client.observer.ESUpdateObserver;
import org.eclipse.emf.emfstore.internal.server.model.impl.api.ESChangePackageImpl;
import org.eclipse.emf.emfstore.server.model.ESChangePackage;

public class MyUpdateObserver implements ESUpdateObserver{

	@Override
	public boolean inspectChanges(ESLocalProject project,
			List<ESChangePackage> changePackages, IProgressMonitor monitor) {
		// TODO Apéndice de método generado automáticamente
		//System.out.println("aqui1");
ESChangePackageImpl cp = (ESChangePackageImpl) changePackages.get(0);
//cp.toInternalAPI().getOperations().get(arg0)//get el que tiene el ArchivoAdjunto.
		return false;
	}

	@Override
	public void updateCompleted(ESLocalProject project, IProgressMonitor monitor) {
		// TODO Apéndice de método generado automáticamente
		//System.out.println("aqui");
		
	}


}
