/**
 */
package org.mindmap.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.emfstore.internal.client.model.util.EMFStoreCommand;
import org.mindmap.model.EnlaceUsaBloque;
import org.mindmap.model.ModelPackage;
import org.mindmap.model.Tema;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enlace Usa Bloque</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mindmap.model.impl.EnlaceUsaBloqueImpl#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link org.mindmap.model.impl.EnlaceUsaBloqueImpl#getOrigen <em>Origen</em>}</li>
 *   <li>{@link org.mindmap.model.impl.EnlaceUsaBloqueImpl#getDestino <em>Destino</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnlaceUsaBloqueImpl extends CursoElementImpl implements
		EnlaceUsaBloque {
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
	protected Tema origen;

	/**
	 * The cached value of the '{@link #getDestino() <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestino()
	 * @generated
	 * @ordered
	 */
	protected Tema destino;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnlaceUsaBloqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ENLACE_USA_BLOQUE;
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
					ModelPackage.ENLACE_USA_BLOQUE__ETIQUETA, oldEtiqueta,
					etiqueta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tema getOrigen() {
		if (origen != null && origen.eIsProxy()) {
			InternalEObject oldOrigen = (InternalEObject) origen;
			origen = (Tema) eResolveProxy(oldOrigen);
			if (origen != oldOrigen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModelPackage.ENLACE_USA_BLOQUE__ORIGEN, oldOrigen,
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
	public Tema basicGetOrigen() {
		return origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigen(Tema newOrigen) {
		Tema oldOrigen = origen;
		origen = newOrigen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.ENLACE_USA_BLOQUE__ORIGEN, oldOrigen, origen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tema getDestino() {
		if (destino != null && destino.eIsProxy()) {
			InternalEObject oldDestino = (InternalEObject) destino;
			destino = (Tema) eResolveProxy(oldDestino);
			if (destino != oldDestino) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModelPackage.ENLACE_USA_BLOQUE__DESTINO,
							oldDestino, destino));
			}
		}
		return destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tema basicGetDestino() {
		return destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestino(Tema newDestino) {
		Tema oldDestino = destino;
		destino = newDestino;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.ENLACE_USA_BLOQUE__DESTINO, oldDestino,
					destino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.ENLACE_USA_BLOQUE__ETIQUETA:
			return getEtiqueta();
		case ModelPackage.ENLACE_USA_BLOQUE__ORIGEN:
			if (resolve)
				return getOrigen();
			return basicGetOrigen();
		case ModelPackage.ENLACE_USA_BLOQUE__DESTINO:
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
		case ModelPackage.ENLACE_USA_BLOQUE__ETIQUETA:
			setEtiqueta((String) newValue);
			return;
		case ModelPackage.ENLACE_USA_BLOQUE__ORIGEN:
			setOrigen((Tema) newValue);
			return;
		case ModelPackage.ENLACE_USA_BLOQUE__DESTINO:
			setDestino((Tema) newValue);
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
		case ModelPackage.ENLACE_USA_BLOQUE__ETIQUETA:
			setEtiqueta(ETIQUETA_EDEFAULT);
			return;
		case ModelPackage.ENLACE_USA_BLOQUE__ORIGEN:
			setOrigen((Tema) null);
			return;
		case ModelPackage.ENLACE_USA_BLOQUE__DESTINO:
			setDestino((Tema) null);
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
		case ModelPackage.ENLACE_USA_BLOQUE__ETIQUETA:
			return ETIQUETA_EDEFAULT == null ? etiqueta != null
					: !ETIQUETA_EDEFAULT.equals(etiqueta);
		case ModelPackage.ENLACE_USA_BLOQUE__ORIGEN:
			return origen != null;
		case ModelPackage.ENLACE_USA_BLOQUE__DESTINO:
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
		final EnlaceUsaBloqueImpl importado = (EnlaceUsaBloqueImpl) element;
		final EnlaceUsaBloque nuevo = (EnlaceUsaBloque) this;

		new EMFStoreCommand() {
			protected void doRun() {
				nuevo.setEtiqueta(importado.getEtiqueta());

			}
		}.run(true);

		return false;
	}
} //EnlaceUsaBloqueImpl
