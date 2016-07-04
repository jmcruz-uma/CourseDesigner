/**
 */
package org.mindmap.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.emfstore.internal.client.model.util.EMFStoreCommand;
import org.mindmap.model.Actividad;
import org.mindmap.model.ActividadEspacio;
import org.mindmap.model.Bloque;
import org.mindmap.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actividad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mindmap.model.impl.ActividadImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link org.mindmap.model.impl.ActividadImpl#getBloque <em>Bloque</em>}</li>
 *   <li>{@link org.mindmap.model.impl.ActividadImpl#getEspacios <em>Espacios</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActividadImpl extends CursoElementImpl implements Actividad {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBloque() <em>Bloque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBloque()
	 * @generated
	 * @ordered
	 */
	protected static final Bloque BLOQUE_EDEFAULT = Bloque.EMPTY;

	/**
	 * The cached value of the '{@link #getBloque() <em>Bloque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBloque()
	 * @generated
	 * @ordered
	 */
	protected Bloque bloque = BLOQUE_EDEFAULT;

	/**
	 * This is true if the Bloque attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bloqueESet;

	/**
	 * The cached value of the '{@link #getEspacios() <em>Espacios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEspacios()
	 * @generated
	 * @ordered
	 */
	protected EList<ActividadEspacio> espacios;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActividadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ACTIVIDAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.ACTIVIDAD__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bloque getBloque() {
		return bloque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBloque(Bloque newBloque) {
		Bloque oldBloque = bloque;
		bloque = newBloque == null ? BLOQUE_EDEFAULT : newBloque;
		boolean oldBloqueESet = bloqueESet;
		bloqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.ACTIVIDAD__BLOQUE, oldBloque, bloque,
					!oldBloqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBloque() {
		Bloque oldBloque = bloque;
		boolean oldBloqueESet = bloqueESet;
		bloque = BLOQUE_EDEFAULT;
		bloqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					ModelPackage.ACTIVIDAD__BLOQUE, oldBloque, BLOQUE_EDEFAULT,
					oldBloqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBloque() {
		return bloqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActividadEspacio> getEspacios() {
		if (espacios == null) {
			espacios = new EObjectContainmentEList.Resolving<ActividadEspacio>(
					ActividadEspacio.class, this,
					ModelPackage.ACTIVIDAD__ESPACIOS);
		}
		return espacios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.ACTIVIDAD__ESPACIOS:
			return ((InternalEList<?>) getEspacios()).basicRemove(otherEnd,
					msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.ACTIVIDAD__NOMBRE:
			return getNombre();
		case ModelPackage.ACTIVIDAD__BLOQUE:
			return getBloque();
		case ModelPackage.ACTIVIDAD__ESPACIOS:
			return getEspacios();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModelPackage.ACTIVIDAD__NOMBRE:
			setNombre((String) newValue);
			return;
		case ModelPackage.ACTIVIDAD__BLOQUE:
			setBloque((Bloque) newValue);
			return;
		case ModelPackage.ACTIVIDAD__ESPACIOS:
			getEspacios().clear();
			getEspacios().addAll(
					(Collection<? extends ActividadEspacio>) newValue);
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
		case ModelPackage.ACTIVIDAD__NOMBRE:
			setNombre(NOMBRE_EDEFAULT);
			return;
		case ModelPackage.ACTIVIDAD__BLOQUE:
			unsetBloque();
			return;
		case ModelPackage.ACTIVIDAD__ESPACIOS:
			getEspacios().clear();
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
		case ModelPackage.ACTIVIDAD__NOMBRE:
			return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT
					.equals(nombre);
		case ModelPackage.ACTIVIDAD__BLOQUE:
			return isSetBloque();
		case ModelPackage.ACTIVIDAD__ESPACIOS:
			return espacios != null && !espacios.isEmpty();
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", bloque: ");
		if (bloqueESet)
			result.append(bloque);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean importar(EObject element) {
		final ActividadImpl importado = (ActividadImpl) element;
		final Actividad nuevo = (Actividad) this;

		new EMFStoreCommand() {
			protected void doRun() {
				nuevo.setNombre(importado.getNombre());
				nuevo.setBloque(importado.getBloque());
			}
		}.run(true);

		return !importado.getEspacios().isEmpty();

	}
} //ActividadImpl
