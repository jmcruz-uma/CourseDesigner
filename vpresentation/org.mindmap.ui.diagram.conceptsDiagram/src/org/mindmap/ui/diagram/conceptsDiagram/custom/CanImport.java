package org.mindmap.ui.diagram.conceptsDiagram.custom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecp.emfstore.core.internal.EMFStoreProjectWrapper;
import org.mindmap.model.control.ProjectControl;

public class CanImport extends PropertyTester {

	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		Class c = receiver.getClass();
		// receiver es un array
		List l = (List) receiver;
		//No va entrar si no tiene 1 elemento
		// seleccionado de la View y SOLO 1
		if (l.get(0) instanceof EMFStoreProjectWrapper) {
			EMFStoreProjectWrapper r = (EMFStoreProjectWrapper) l.get(0);
			String globalidremote = r.getCheckoutData().getGlobalProjectId()
					.getId();

			// Hay un proyecto abierto para importar y no son el mismo hay que
			// comprobar globalid que no sea nulo(no shared)
			// proyecto(para ello usar update/Checkout...
			if (ProjectControl.actualproject != null
					&& (!ProjectControl.actualproject.isShared() || (ProjectControl.actualproject
							.isShared() && !ProjectControl.actualproject
							.getGlobalProjectId().getId()
							.equals(globalidremote)))) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}
}