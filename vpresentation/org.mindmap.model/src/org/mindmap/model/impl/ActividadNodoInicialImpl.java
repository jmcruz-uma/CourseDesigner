/**
 */
package org.mindmap.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.mindmap.model.ActividadNodoInicial;
import org.mindmap.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actividad Nodo Inicial</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ActividadNodoInicialImpl extends ActividadNodoImpl implements
		ActividadNodoInicial {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActividadNodoInicialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ACTIVIDAD_NODO_INICIAL;
	}

	@Override
	public boolean importar(EObject element) {
		return false;
	}
} //ActividadNodoInicialImpl
