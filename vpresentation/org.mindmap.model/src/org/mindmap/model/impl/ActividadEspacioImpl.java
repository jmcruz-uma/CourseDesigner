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
import org.mindmap.model.ActividadEspacio;
import org.mindmap.model.Leccion;
import org.mindmap.model.ModelPackage;
import org.mindmap.model.Prueba;
import org.mindmap.model.Tarea;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actividad Espacio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mindmap.model.impl.ActividadEspacioImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link org.mindmap.model.impl.ActividadEspacioImpl#getTareas <em>Tareas</em>}</li>
 *   <li>{@link org.mindmap.model.impl.ActividadEspacioImpl#getLecciones <em>Lecciones</em>}</li>
 *   <li>{@link org.mindmap.model.impl.ActividadEspacioImpl#getPruebas <em>Pruebas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActividadEspacioImpl extends CursoElementImpl implements
		ActividadEspacio {
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
	 * The cached value of the '{@link #getTareas() <em>Tareas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTareas()
	 * @generated
	 * @ordered
	 */
	protected EList<Tarea> tareas;

	/**
	 * The cached value of the '{@link #getLecciones() <em>Lecciones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLecciones()
	 * @generated
	 * @ordered
	 */
	protected EList<Leccion> lecciones;

	/**
	 * The cached value of the '{@link #getPruebas() <em>Pruebas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPruebas()
	 * @generated
	 * @ordered
	 */
	protected EList<Prueba> pruebas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActividadEspacioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ACTIVIDAD_ESPACIO;
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
					ModelPackage.ACTIVIDAD_ESPACIO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tarea> getTareas() {
		if (tareas == null) {
			tareas = new EObjectContainmentEList.Resolving<Tarea>(Tarea.class,
					this, ModelPackage.ACTIVIDAD_ESPACIO__TAREAS);
		}
		return tareas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Leccion> getLecciones() {
		if (lecciones == null) {
			lecciones = new EObjectContainmentEList.Resolving<Leccion>(
					Leccion.class, this,
					ModelPackage.ACTIVIDAD_ESPACIO__LECCIONES);
		}
		return lecciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Prueba> getPruebas() {
		if (pruebas == null) {
			pruebas = new EObjectContainmentEList.Resolving<Prueba>(
					Prueba.class, this, ModelPackage.ACTIVIDAD_ESPACIO__PRUEBAS);
		}
		return pruebas;
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
		case ModelPackage.ACTIVIDAD_ESPACIO__TAREAS:
			return ((InternalEList<?>) getTareas()).basicRemove(otherEnd, msgs);
		case ModelPackage.ACTIVIDAD_ESPACIO__LECCIONES:
			return ((InternalEList<?>) getLecciones()).basicRemove(otherEnd,
					msgs);
		case ModelPackage.ACTIVIDAD_ESPACIO__PRUEBAS:
			return ((InternalEList<?>) getPruebas())
					.basicRemove(otherEnd, msgs);
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
		case ModelPackage.ACTIVIDAD_ESPACIO__NOMBRE:
			return getNombre();
		case ModelPackage.ACTIVIDAD_ESPACIO__TAREAS:
			return getTareas();
		case ModelPackage.ACTIVIDAD_ESPACIO__LECCIONES:
			return getLecciones();
		case ModelPackage.ACTIVIDAD_ESPACIO__PRUEBAS:
			return getPruebas();
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
		case ModelPackage.ACTIVIDAD_ESPACIO__NOMBRE:
			setNombre((String) newValue);
			return;
		case ModelPackage.ACTIVIDAD_ESPACIO__TAREAS:
			getTareas().clear();
			getTareas().addAll((Collection<? extends Tarea>) newValue);
			return;
		case ModelPackage.ACTIVIDAD_ESPACIO__LECCIONES:
			getLecciones().clear();
			getLecciones().addAll((Collection<? extends Leccion>) newValue);
			return;
		case ModelPackage.ACTIVIDAD_ESPACIO__PRUEBAS:
			getPruebas().clear();
			getPruebas().addAll((Collection<? extends Prueba>) newValue);
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
		case ModelPackage.ACTIVIDAD_ESPACIO__NOMBRE:
			setNombre(NOMBRE_EDEFAULT);
			return;
		case ModelPackage.ACTIVIDAD_ESPACIO__TAREAS:
			getTareas().clear();
			return;
		case ModelPackage.ACTIVIDAD_ESPACIO__LECCIONES:
			getLecciones().clear();
			return;
		case ModelPackage.ACTIVIDAD_ESPACIO__PRUEBAS:
			getPruebas().clear();
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
		case ModelPackage.ACTIVIDAD_ESPACIO__NOMBRE:
			return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT
					.equals(nombre);
		case ModelPackage.ACTIVIDAD_ESPACIO__TAREAS:
			return tareas != null && !tareas.isEmpty();
		case ModelPackage.ACTIVIDAD_ESPACIO__LECCIONES:
			return lecciones != null && !lecciones.isEmpty();
		case ModelPackage.ACTIVIDAD_ESPACIO__PRUEBAS:
			return pruebas != null && !pruebas.isEmpty();
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
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean importar(EObject element) {
		final ActividadEspacioImpl importado = (ActividadEspacioImpl) element;
		final ActividadEspacio nuevo = (ActividadEspacio) this;

		new EMFStoreCommand() {
			protected void doRun() {
				nuevo.setNombre(importado.getNombre());

			}
		}.run(true);

		return !(importado.getPruebas().isEmpty()
				&& importado.getLecciones().isEmpty() && importado.getTareas()
				.isEmpty());

	}
} //ActividadEspacioImpl
