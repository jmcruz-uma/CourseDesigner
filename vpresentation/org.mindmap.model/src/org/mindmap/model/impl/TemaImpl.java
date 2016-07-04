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
import org.mindmap.model.Concepto;
import org.mindmap.model.ModelPackage;
import org.mindmap.model.Tema;
import org.mindmap.model.control.ProjectControl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Tema</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.mindmap.model.impl.TemaImpl#getNombre <em>Nombre</em>}</li>
 * <li>{@link org.mindmap.model.impl.TemaImpl#getAnotaciones <em>Anotaciones
 * </em>}</li>
 * <li>{@link org.mindmap.model.impl.TemaImpl#getConceptos <em>Conceptos</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TemaImpl extends CursoElementImpl implements Tema {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnotaciones() <em>Anotaciones</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAnotaciones()
	 * @generated
	 * @ordered
	 */
	protected static final String ANOTACIONES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnotaciones() <em>Anotaciones</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAnotaciones()
	 * @generated
	 * @ordered
	 */
	protected String anotaciones = ANOTACIONES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConceptos() <em>Conceptos</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getConceptos()
	 * @generated
	 * @ordered
	 */
	protected EList<Concepto> conceptos;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.TEMA;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.TEMA__NOMBRE, oldNombre, nombre));

		//if (eContainer()!=null&&newNombre != null) {
		if(eContainer()!=null&&newNombre!=null)
		{
			ModelPackageImpl mindmapPackage = (ModelPackageImpl) ModelPackageImpl
					.init();
			
			if (oldNombre == null || oldNombre.isEmpty()) {
				mindmapPackage.addBloque(newNombre, newNombre);
			} else {
				/*boolean añadido = mindmapPackage
						.addBloque(newNombre, newNombre);
				if (añadido) {
					mindmapPackage.removeBloque(oldNombre, oldNombre);
				}*/
				 mindmapPackage.changeBloqueName(oldNombre, newNombre);
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getAnotaciones() {
		return anotaciones;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAnotaciones(String newAnotaciones) {
		String oldAnotaciones = anotaciones;
		anotaciones = newAnotaciones;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.TEMA__ANOTACIONES, oldAnotaciones, anotaciones));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Concepto> getConceptos() {
		if (conceptos == null) {
			conceptos = new EObjectContainmentEList.Resolving<Concepto>(
					Concepto.class, this, ModelPackage.TEMA__CONCEPTOS);
		}
		return conceptos;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.TEMA__CONCEPTOS:
			return ((InternalEList<?>) getConceptos()).basicRemove(otherEnd,
					msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.TEMA__NOMBRE:
			return getNombre();
		case ModelPackage.TEMA__ANOTACIONES:
			return getAnotaciones();
		case ModelPackage.TEMA__CONCEPTOS:
			return getConceptos();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModelPackage.TEMA__NOMBRE:
			setNombre((String) newValue);
			return;
		case ModelPackage.TEMA__ANOTACIONES:
			setAnotaciones((String) newValue);
			return;
		case ModelPackage.TEMA__CONCEPTOS:
			getConceptos().clear();
			getConceptos().addAll((Collection<? extends Concepto>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ModelPackage.TEMA__NOMBRE:
			setNombre(NOMBRE_EDEFAULT);
			return;
		case ModelPackage.TEMA__ANOTACIONES:
			setAnotaciones(ANOTACIONES_EDEFAULT);
			return;
		case ModelPackage.TEMA__CONCEPTOS:
			getConceptos().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ModelPackage.TEMA__NOMBRE:
			return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT
					.equals(nombre);
		case ModelPackage.TEMA__ANOTACIONES:
			return ANOTACIONES_EDEFAULT == null ? anotaciones != null
					: !ANOTACIONES_EDEFAULT.equals(anotaciones);
		case ModelPackage.TEMA__CONCEPTOS:
			return conceptos != null && !conceptos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
		final TemaImpl importado = (TemaImpl) element;
		final Tema nuevo = (Tema) this;

		new EMFStoreCommand() {
			protected void doRun() {
				nuevo.setNombre(importado.getNombre());
				nuevo.setAnotaciones(importado.getAnotaciones());
			}
		}.run(true);

		return !(importado.getConceptos().isEmpty());
	}
} // TemaImpl
