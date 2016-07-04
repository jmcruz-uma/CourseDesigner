/**
 */
package org.mindmap.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.emfstore.internal.client.model.util.EMFStoreCommand;
import org.mindmap.model.ActividadEnlace;
import org.mindmap.model.ActividadNodo;
import org.mindmap.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actividad Enlace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mindmap.model.impl.ActividadEnlaceImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link org.mindmap.model.impl.ActividadEnlaceImpl#getOrigen <em>Origen</em>}</li>
 *   <li>{@link org.mindmap.model.impl.ActividadEnlaceImpl#getDestino <em>Destino</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActividadEnlaceImpl extends CursoElementImpl implements
		ActividadEnlace {
	/**
	 * The default value of the '{@link #getEtiqueta() <em>Etiqueta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtiqueta()
	 * @generated
	 * @ordered
	 */
	protected static final String ETIQUETA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEtiqueta() <em>Etiqueta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtiqueta()
	 * @generated
	 * @ordered
	 */
	protected String etiqueta = ETIQUETA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrigen() <em>Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigen()
	 * @generated
	 * @ordered
	 */
	protected ActividadNodo origen;

	/**
	 * The cached value of the '{@link #getDestino() <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestino()
	 * @generated
	 * @ordered
	 */
	protected ActividadNodo destino;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActividadEnlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ACTIVIDAD_ENLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtiqueta() {
		return etiqueta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtiqueta(String newEtiqueta) {
		String oldEtiqueta = etiqueta;
		etiqueta = newEtiqueta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.ACTIVIDAD_ENLACE__ETIQUETA, oldEtiqueta,
					etiqueta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActividadNodo getOrigen() {
		if (origen != null && origen.eIsProxy()) {
			InternalEObject oldOrigen = (InternalEObject) origen;
			origen = (ActividadNodo) eResolveProxy(oldOrigen);
			if (origen != oldOrigen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModelPackage.ACTIVIDAD_ENLACE__ORIGEN, oldOrigen,
							origen));
			}
		}
		return origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActividadNodo basicGetOrigen() {
		return origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigen(ActividadNodo newOrigen) {
		ActividadNodo oldOrigen = origen;
		origen = newOrigen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.ACTIVIDAD_ENLACE__ORIGEN, oldOrigen, origen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActividadNodo getDestino() {
		if (destino != null && destino.eIsProxy()) {
			InternalEObject oldDestino = (InternalEObject) destino;
			destino = (ActividadNodo) eResolveProxy(oldDestino);
			if (destino != oldDestino) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModelPackage.ACTIVIDAD_ENLACE__DESTINO, oldDestino,
							destino));
			}
		}
		return destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActividadNodo basicGetDestino() {
		return destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestino(ActividadNodo newDestino) {
		ActividadNodo oldDestino = destino;
		destino = newDestino;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.ACTIVIDAD_ENLACE__DESTINO, oldDestino, destino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.ACTIVIDAD_ENLACE__ETIQUETA:
			return getEtiqueta();
		case ModelPackage.ACTIVIDAD_ENLACE__ORIGEN:
			if (resolve)
				return getOrigen();
			return basicGetOrigen();
		case ModelPackage.ACTIVIDAD_ENLACE__DESTINO:
			if (resolve)
				return getDestino();
			return basicGetDestino();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModelPackage.ACTIVIDAD_ENLACE__ETIQUETA:
			setEtiqueta((String) newValue);
			return;
		case ModelPackage.ACTIVIDAD_ENLACE__ORIGEN:
			setOrigen((ActividadNodo) newValue);
			return;
		case ModelPackage.ACTIVIDAD_ENLACE__DESTINO:
			setDestino((ActividadNodo) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ModelPackage.ACTIVIDAD_ENLACE__ETIQUETA:
			setEtiqueta(ETIQUETA_EDEFAULT);
			return;
		case ModelPackage.ACTIVIDAD_ENLACE__ORIGEN:
			setOrigen((ActividadNodo) null);
			return;
		case ModelPackage.ACTIVIDAD_ENLACE__DESTINO:
			setDestino((ActividadNodo) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ModelPackage.ACTIVIDAD_ENLACE__ETIQUETA:
			return ETIQUETA_EDEFAULT == null ? etiqueta != null
					: !ETIQUETA_EDEFAULT.equals(etiqueta);
		case ModelPackage.ACTIVIDAD_ENLACE__ORIGEN:
			return origen != null;
		case ModelPackage.ACTIVIDAD_ENLACE__DESTINO:
			return destino != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (etiqueta: ");
		result.append(etiqueta);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean importar(EObject element) {
		final ActividadEnlaceImpl importado = (ActividadEnlaceImpl) element;
		final ActividadEnlace nuevo = (ActividadEnlace) this;

		new EMFStoreCommand() {
			protected void doRun() {
				nuevo.setEtiqueta(importado.getEtiqueta());

			}
		}.run(true);

		return false;
	}
} //ActividadEnlaceImpl
