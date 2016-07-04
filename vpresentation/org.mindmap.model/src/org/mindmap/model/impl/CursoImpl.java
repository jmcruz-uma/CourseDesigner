/**
 */
package org.mindmap.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mindmap.model.Curso;
import org.mindmap.model.CursoDiagrama;
import org.mindmap.model.ModelPackage;
import org.mindmap.model.PropiedadCurso;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Curso</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mindmap.model.impl.CursoImpl#getDiagramas <em>Diagramas</em>}</li>
 *   <li>{@link org.mindmap.model.impl.CursoImpl#getPropiedades <em>Propiedades</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CursoImpl extends MinimalEObjectImpl.Container implements Curso {
	/**
	 * The cached value of the '{@link #getDiagramas() <em>Diagramas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramas()
	 * @generated
	 * @ordered
	 */
	protected EList<CursoDiagrama> diagramas;

	/**
	 * The cached value of the '{@link #getPropiedades() <em>Propiedades</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropiedades()
	 * @generated
	 * @ordered
	 */
	protected PropiedadCurso propiedades;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CursoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CURSO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CursoDiagrama> getDiagramas() {
		if (diagramas == null) {
			diagramas = new EObjectContainmentEList.Resolving<CursoDiagrama>(
					CursoDiagrama.class, this, ModelPackage.CURSO__DIAGRAMAS);
		}
		return diagramas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropiedadCurso getPropiedades() {
		if (propiedades != null && propiedades.eIsProxy()) {
			InternalEObject oldPropiedades = (InternalEObject) propiedades;
			propiedades = (PropiedadCurso) eResolveProxy(oldPropiedades);
			if (propiedades != oldPropiedades) {
				InternalEObject newPropiedades = (InternalEObject) propiedades;
				NotificationChain msgs = oldPropiedades.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ModelPackage.CURSO__PROPIEDADES, null, null);
				if (newPropiedades.eInternalContainer() == null) {
					msgs = newPropiedades.eInverseAdd(this,
							EOPPOSITE_FEATURE_BASE
									- ModelPackage.CURSO__PROPIEDADES, null,
							msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModelPackage.CURSO__PROPIEDADES, oldPropiedades,
							propiedades));
			}
		}
		return propiedades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropiedadCurso basicGetPropiedades() {
		return propiedades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropiedades(PropiedadCurso newPropiedades,
			NotificationChain msgs) {
		PropiedadCurso oldPropiedades = propiedades;
		propiedades = newPropiedades;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, ModelPackage.CURSO__PROPIEDADES,
					oldPropiedades, newPropiedades);
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
	public void setPropiedades(PropiedadCurso newPropiedades) {
		if (newPropiedades != propiedades) {
			NotificationChain msgs = null;
			if (propiedades != null)
				msgs = ((InternalEObject) propiedades).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ModelPackage.CURSO__PROPIEDADES, null, msgs);
			if (newPropiedades != null)
				msgs = ((InternalEObject) newPropiedades).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- ModelPackage.CURSO__PROPIEDADES, null, msgs);
			msgs = basicSetPropiedades(newPropiedades, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.CURSO__PROPIEDADES, newPropiedades,
					newPropiedades));
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
		case ModelPackage.CURSO__DIAGRAMAS:
			return ((InternalEList<?>) getDiagramas()).basicRemove(otherEnd,
					msgs);
		case ModelPackage.CURSO__PROPIEDADES:
			return basicSetPropiedades(null, msgs);
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
		case ModelPackage.CURSO__DIAGRAMAS:
			return getDiagramas();
		case ModelPackage.CURSO__PROPIEDADES:
			if (resolve)
				return getPropiedades();
			return basicGetPropiedades();
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
		case ModelPackage.CURSO__DIAGRAMAS:
			getDiagramas().clear();
			getDiagramas().addAll(
					(Collection<? extends CursoDiagrama>) newValue);
			return;
		case ModelPackage.CURSO__PROPIEDADES:
			setPropiedades((PropiedadCurso) newValue);
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
		case ModelPackage.CURSO__DIAGRAMAS:
			getDiagramas().clear();
			return;
		case ModelPackage.CURSO__PROPIEDADES:
			setPropiedades((PropiedadCurso) null);
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
		case ModelPackage.CURSO__DIAGRAMAS:
			return diagramas != null && !diagramas.isEmpty();
		case ModelPackage.CURSO__PROPIEDADES:
			return propiedades != null;
		}
		return super.eIsSet(featureID);
	}

} //CursoImpl
