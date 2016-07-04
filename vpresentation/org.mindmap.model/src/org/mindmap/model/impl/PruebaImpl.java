/**
 */
package org.mindmap.model.impl;

import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.emfstore.internal.client.model.util.EMFStoreCommand;
import org.mindmap.model.ModelPackage;
import org.mindmap.model.Prueba;
import org.mindmap.model.util.ModelValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prueba</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mindmap.model.impl.PruebaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link org.mindmap.model.impl.PruebaImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link org.mindmap.model.impl.PruebaImpl#getPorcentajeNota <em>Porcentaje Nota</em>}</li>
 *   <li>{@link org.mindmap.model.impl.PruebaImpl#getDuracion <em>Duracion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PruebaImpl extends ActividadNodoImpl implements Prueba {
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
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected String tipo = TIPO_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PruebaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PRUEBA;
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
					ModelPackage.PRUEBA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(String newTipo) {
		String oldTipo = tipo;
		tipo = newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.PRUEBA__TIPO, oldTipo, tipo));
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
					ModelPackage.PRUEBA__PORCENTAJE_NOTA, oldPorcentajeNota,
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
					ModelPackage.PRUEBA__DURACION, oldDuracion, duracion));
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
		return ModelValidator.validate(ModelPackage.Literals.PRUEBA, this,
				diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL",
				ModelPackage.Literals.PRUEBA.getEOperations().get(0),
				ENLACES_COMPLETOS_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				Diagnostic.ERROR, ModelValidator.DIAGNOSTIC_SOURCE,
				ModelValidator.PRUEBA__ENLACES_COMPLETOS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.PRUEBA__NOMBRE:
			return getNombre();
		case ModelPackage.PRUEBA__TIPO:
			return getTipo();
		case ModelPackage.PRUEBA__PORCENTAJE_NOTA:
			return getPorcentajeNota();
		case ModelPackage.PRUEBA__DURACION:
			return getDuracion();
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
		case ModelPackage.PRUEBA__NOMBRE:
			setNombre((String) newValue);
			return;
		case ModelPackage.PRUEBA__TIPO:
			setTipo((String) newValue);
			return;
		case ModelPackage.PRUEBA__PORCENTAJE_NOTA:
			setPorcentajeNota((Float) newValue);
			return;
		case ModelPackage.PRUEBA__DURACION:
			setDuracion((Float) newValue);
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
		case ModelPackage.PRUEBA__NOMBRE:
			setNombre(NOMBRE_EDEFAULT);
			return;
		case ModelPackage.PRUEBA__TIPO:
			setTipo(TIPO_EDEFAULT);
			return;
		case ModelPackage.PRUEBA__PORCENTAJE_NOTA:
			setPorcentajeNota(PORCENTAJE_NOTA_EDEFAULT);
			return;
		case ModelPackage.PRUEBA__DURACION:
			setDuracion(DURACION_EDEFAULT);
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
		case ModelPackage.PRUEBA__NOMBRE:
			return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT
					.equals(nombre);
		case ModelPackage.PRUEBA__TIPO:
			return TIPO_EDEFAULT == null ? tipo != null : !TIPO_EDEFAULT
					.equals(tipo);
		case ModelPackage.PRUEBA__PORCENTAJE_NOTA:
			return porcentajeNota != PORCENTAJE_NOTA_EDEFAULT;
		case ModelPackage.PRUEBA__DURACION:
			return duracion != DURACION_EDEFAULT;
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
		result.append(", tipo: ");
		result.append(tipo);
		result.append(", porcentajeNota: ");
		result.append(porcentajeNota);
		result.append(", duracion: ");
		result.append(duracion);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean importar(EObject element) {
		final PruebaImpl importado = (PruebaImpl) element;
		final Prueba nuevo = (Prueba) this;

		new EMFStoreCommand() {
			protected void doRun() {
				nuevo.setNombre(importado.getNombre());
				nuevo.setTipo(importado.getTipo());
				nuevo.setPorcentajeNota(importado.getPorcentajeNota());
				nuevo.setDuracion(importado.getDuracion());
			}
		}.run(true);

		return false;
	}

} //PruebaImpl
