/**
 */
package org.mindmap.model.impl;

import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.emfstore.internal.client.model.util.EMFStoreCommand;
import org.mindmap.model.ArchivoAdjunto;
import org.mindmap.model.Leccion;
import org.mindmap.model.ModelPackage;
import org.mindmap.model.util.ModelValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Leccion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mindmap.model.impl.LeccionImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link org.mindmap.model.impl.LeccionImpl#getProfesor <em>Profesor</em>}</li>
 *   <li>{@link org.mindmap.model.impl.LeccionImpl#getPorcentajeNota <em>Porcentaje Nota</em>}</li>
 *   <li>{@link org.mindmap.model.impl.LeccionImpl#getDuracion <em>Duracion</em>}</li>
 *   <li>{@link org.mindmap.model.impl.LeccionImpl#getContenidos <em>Contenidos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LeccionImpl extends ActividadNodoImpl implements Leccion {
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
	 * The default value of the '{@link #getProfesor() <em>Profesor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfesor()
	 * @generated
	 * @ordered
	 */
	protected static final String PROFESOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProfesor() <em>Profesor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfesor()
	 * @generated
	 * @ordered
	 */
	protected String profesor = PROFESOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPorcentajeNota() <em>Porcentaje Nota</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorcentajeNota()
	 * @generated
	 * @ordered
	 */
	protected static final float PORCENTAJE_NOTA_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPorcentajeNota() <em>Porcentaje Nota</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorcentajeNota()
	 * @generated
	 * @ordered
	 */
	protected float porcentajeNota = PORCENTAJE_NOTA_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuracion() <em>Duracion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuracion()
	 * @generated
	 * @ordered
	 */
	protected static final float DURACION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDuracion() <em>Duracion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuracion()
	 * @generated
	 * @ordered
	 */
	protected float duracion = DURACION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContenidos() <em>Contenidos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenidos()
	 * @generated
	 * @ordered
	 */
	protected ArchivoAdjunto contenidos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeccionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.LECCION;
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
					ModelPackage.LECCION__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProfesor() {
		return profesor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfesor(String newProfesor) {
		String oldProfesor = profesor;
		profesor = newProfesor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.LECCION__PROFESOR, oldProfesor, profesor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPorcentajeNota() {
		return porcentajeNota;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorcentajeNota(float newPorcentajeNota) {
		float oldPorcentajeNota = porcentajeNota;
		porcentajeNota = newPorcentajeNota;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.LECCION__PORCENTAJE_NOTA, oldPorcentajeNota,
					porcentajeNota));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDuracion() {
		return duracion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuracion(float newDuracion) {
		float oldDuracion = duracion;
		duracion = newDuracion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.LECCION__DURACION, oldDuracion, duracion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchivoAdjunto getContenidos() {
		if (contenidos != null && contenidos.eIsProxy()) {
			InternalEObject oldContenidos = (InternalEObject) contenidos;
			contenidos = (ArchivoAdjunto) eResolveProxy(oldContenidos);
			if (contenidos != oldContenidos) {
				InternalEObject newContenidos = (InternalEObject) contenidos;
				NotificationChain msgs = oldContenidos.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ModelPackage.LECCION__CONTENIDOS, null, null);
				if (newContenidos.eInternalContainer() == null) {
					msgs = newContenidos.eInverseAdd(this,
							EOPPOSITE_FEATURE_BASE
									- ModelPackage.LECCION__CONTENIDOS, null,
							msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModelPackage.LECCION__CONTENIDOS, oldContenidos,
							contenidos));
			}
		}
		return contenidos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchivoAdjunto basicGetContenidos() {
		return contenidos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContenidos(ArchivoAdjunto newContenidos,
			NotificationChain msgs) {
		ArchivoAdjunto oldContenidos = contenidos;
		contenidos = newContenidos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, ModelPackage.LECCION__CONTENIDOS,
					oldContenidos, newContenidos);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContenidos(ArchivoAdjunto newContenidos) {
		if (newContenidos != contenidos) {
			NotificationChain msgs = null;
			if (contenidos != null)
				msgs = ((InternalEObject) contenidos).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ModelPackage.LECCION__CONTENIDOS, null, msgs);
			if (newContenidos != null)
				msgs = ((InternalEObject) newContenidos).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- ModelPackage.LECCION__CONTENIDOS, null, msgs);
			msgs = basicSetContenidos(newContenidos, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.LECCION__CONTENIDOS, newContenidos,
					newContenidos));
	}

	/**
	 * The cached validation expression for the '{@link #EnlacesCompletos(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Enlaces Completos</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EnlacesCompletos(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String ENLACES_COMPLETOS_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "ActividadEnlace.allInstances()->exists(v1,v2|v1.origen=self and v2.destino=self)";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean EnlacesCompletos(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ModelValidator.validate(ModelPackage.Literals.LECCION, this,
				diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL",
				ModelPackage.Literals.LECCION.getEOperations().get(0),
				ENLACES_COMPLETOS_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				Diagnostic.ERROR, ModelValidator.DIAGNOSTIC_SOURCE,
				ModelValidator.LECCION__ENLACES_COMPLETOS);
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
		case ModelPackage.LECCION__CONTENIDOS:
			return basicSetContenidos(null, msgs);
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
		case ModelPackage.LECCION__NOMBRE:
			return getNombre();
		case ModelPackage.LECCION__PROFESOR:
			return getProfesor();
		case ModelPackage.LECCION__PORCENTAJE_NOTA:
			return getPorcentajeNota();
		case ModelPackage.LECCION__DURACION:
			return getDuracion();
		case ModelPackage.LECCION__CONTENIDOS:
			if (resolve)
				return getContenidos();
			return basicGetContenidos();
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
		case ModelPackage.LECCION__NOMBRE:
			setNombre((String) newValue);
			return;
		case ModelPackage.LECCION__PROFESOR:
			setProfesor((String) newValue);
			return;
		case ModelPackage.LECCION__PORCENTAJE_NOTA:
			setPorcentajeNota((Float) newValue);
			return;
		case ModelPackage.LECCION__DURACION:
			setDuracion((Float) newValue);
			return;
		case ModelPackage.LECCION__CONTENIDOS:
			setContenidos((ArchivoAdjunto) newValue);
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
		case ModelPackage.LECCION__NOMBRE:
			setNombre(NOMBRE_EDEFAULT);
			return;
		case ModelPackage.LECCION__PROFESOR:
			setProfesor(PROFESOR_EDEFAULT);
			return;
		case ModelPackage.LECCION__PORCENTAJE_NOTA:
			setPorcentajeNota(PORCENTAJE_NOTA_EDEFAULT);
			return;
		case ModelPackage.LECCION__DURACION:
			setDuracion(DURACION_EDEFAULT);
			return;
		case ModelPackage.LECCION__CONTENIDOS:
			setContenidos((ArchivoAdjunto) null);
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
		case ModelPackage.LECCION__NOMBRE:
			return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT
					.equals(nombre);
		case ModelPackage.LECCION__PROFESOR:
			return PROFESOR_EDEFAULT == null ? profesor != null
					: !PROFESOR_EDEFAULT.equals(profesor);
		case ModelPackage.LECCION__PORCENTAJE_NOTA:
			return porcentajeNota != PORCENTAJE_NOTA_EDEFAULT;
		case ModelPackage.LECCION__DURACION:
			return duracion != DURACION_EDEFAULT;
		case ModelPackage.LECCION__CONTENIDOS:
			return contenidos != null;
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
		result.append(", profesor: ");
		result.append(profesor);
		result.append(", porcentajeNota: ");
		result.append(porcentajeNota);
		result.append(", duracion: ");
		result.append(duracion);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean importar(EObject element) {
		
		final LeccionImpl importado = (LeccionImpl) element;
		final Leccion nuevo = (Leccion) this;

		new EMFStoreCommand() {
			protected void doRun() {
				nuevo.setNombre(importado.getNombre());
				nuevo.setContenidos(importado.getContenidos());
				nuevo.setProfesor(importado.getProfesor());
				nuevo.setPorcentajeNota(importado.getPorcentajeNota());
				nuevo.setDuracion(importado.getDuracion());
			}
		}.run(true);

		return false;
	}
} //LeccionImpl
