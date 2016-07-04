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
import org.mindmap.model.Atributo;
import org.mindmap.model.Concepto;
import org.mindmap.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concepto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mindmap.model.impl.ConceptoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link org.mindmap.model.impl.ConceptoImpl#getAnotaciones <em>Anotaciones</em>}</li>
 *   <li>{@link org.mindmap.model.impl.ConceptoImpl#getAtributos <em>Atributos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConceptoImpl extends CursoElementImpl implements Concepto {
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
	 * The default value of the '{@link #getAnotaciones() <em>Anotaciones</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnotaciones()
	 * @generated
	 * @ordered
	 */
	protected static final String ANOTACIONES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnotaciones() <em>Anotaciones</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnotaciones()
	 * @generated
	 * @ordered
	 */
	protected String anotaciones = ANOTACIONES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAtributos() <em>Atributos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributos()
	 * @generated
	 * @ordered
	 */
	protected EList<Atributo> atributos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CONCEPTO;
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
					ModelPackage.CONCEPTO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnotaciones() {
		return anotaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnotaciones(String newAnotaciones) {
		String oldAnotaciones = anotaciones;
		anotaciones = newAnotaciones;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.CONCEPTO__ANOTACIONES, oldAnotaciones,
					anotaciones));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Atributo> getAtributos() {
		if (atributos == null) {
			atributos = new EObjectContainmentEList.Resolving<Atributo>(
					Atributo.class, this, ModelPackage.CONCEPTO__ATRIBUTOS);
		}
		return atributos;
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
		case ModelPackage.CONCEPTO__ATRIBUTOS:
			return ((InternalEList<?>) getAtributos()).basicRemove(otherEnd,
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
		case ModelPackage.CONCEPTO__NOMBRE:
			return getNombre();
		case ModelPackage.CONCEPTO__ANOTACIONES:
			return getAnotaciones();
		case ModelPackage.CONCEPTO__ATRIBUTOS:
			return getAtributos();
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
		case ModelPackage.CONCEPTO__NOMBRE:
			setNombre((String) newValue);
			return;
		case ModelPackage.CONCEPTO__ANOTACIONES:
			setAnotaciones((String) newValue);
			return;
		case ModelPackage.CONCEPTO__ATRIBUTOS:
			getAtributos().clear();
			getAtributos().addAll((Collection<? extends Atributo>) newValue);
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
		case ModelPackage.CONCEPTO__NOMBRE:
			setNombre(NOMBRE_EDEFAULT);
			return;
		case ModelPackage.CONCEPTO__ANOTACIONES:
			setAnotaciones(ANOTACIONES_EDEFAULT);
			return;
		case ModelPackage.CONCEPTO__ATRIBUTOS:
			getAtributos().clear();
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
		case ModelPackage.CONCEPTO__NOMBRE:
			return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT
					.equals(nombre);
		case ModelPackage.CONCEPTO__ANOTACIONES:
			return ANOTACIONES_EDEFAULT == null ? anotaciones != null
					: !ANOTACIONES_EDEFAULT.equals(anotaciones);
		case ModelPackage.CONCEPTO__ATRIBUTOS:
			return atributos != null && !atributos.isEmpty();
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
		result.append(", anotaciones: ");
		result.append(anotaciones);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean importar(EObject element) {
		final ConceptoImpl importado = (ConceptoImpl) element;
		final Concepto nuevo = (Concepto) this;

		new EMFStoreCommand() {
			protected void doRun() {
				nuevo.setNombre(importado.getNombre());
				nuevo.setAnotaciones(importado.getAnotaciones());
			}
		}.run(true);

		return !(importado.getAtributos().isEmpty());
	}
} //ConceptoImpl
