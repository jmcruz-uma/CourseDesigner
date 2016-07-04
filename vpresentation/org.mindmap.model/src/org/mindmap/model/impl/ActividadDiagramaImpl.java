/**
 */
package org.mindmap.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.mindmap.model.ActividadDiagrama;
import org.mindmap.model.ActividadNodoFinal;
import org.mindmap.model.ActividadNodoInicial;
import org.mindmap.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actividad Diagrama</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mindmap.model.impl.ActividadDiagramaImpl#getElementoNodoFinal <em>Elemento Nodo Final</em>}</li>
 *   <li>{@link org.mindmap.model.impl.ActividadDiagramaImpl#getElementoNodoInicial <em>Elemento Nodo Inicial</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActividadDiagramaImpl extends CursoDiagramaImpl implements
		ActividadDiagrama {
	/**
	 * The cached value of the '{@link #getElementoNodoFinal() <em>Elemento Nodo Final</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementoNodoFinal()
	 * @generated
	 * @ordered
	 */
	protected ActividadNodoFinal elementoNodoFinal;

	/**
	 * The cached value of the '{@link #getElementoNodoInicial() <em>Elemento Nodo Inicial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementoNodoInicial()
	 * @generated
	 * @ordered
	 */
	protected ActividadNodoInicial elementoNodoInicial;

	private EList<EObject> el;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActividadDiagramaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ACTIVIDAD_DIAGRAMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActividadNodoFinal getElementoNodoFinal() {
		if (elementoNodoFinal != null && elementoNodoFinal.eIsProxy()) {
			InternalEObject oldElementoNodoFinal = (InternalEObject) elementoNodoFinal;
			elementoNodoFinal = (ActividadNodoFinal) eResolveProxy(oldElementoNodoFinal);
			if (elementoNodoFinal != oldElementoNodoFinal) {
				InternalEObject newElementoNodoFinal = (InternalEObject) elementoNodoFinal;
				NotificationChain msgs = oldElementoNodoFinal
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- ModelPackage.ACTIVIDAD_DIAGRAMA__ELEMENTO_NODO_FINAL,
								null, null);
				if (newElementoNodoFinal.eInternalContainer() == null) {
					msgs = newElementoNodoFinal
							.eInverseAdd(
									this,
									EOPPOSITE_FEATURE_BASE
											- ModelPackage.ACTIVIDAD_DIAGRAMA__ELEMENTO_NODO_FINAL,
									null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							ModelPackage.ACTIVIDAD_DIAGRAMA__ELEMENTO_NODO_FINAL,
							oldElementoNodoFinal, elementoNodoFinal));
			}
		}
		return elementoNodoFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActividadNodoFinal basicGetElementoNodoFinal() {
		return elementoNodoFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementoNodoFinal(
			ActividadNodoFinal newElementoNodoFinal, NotificationChain msgs) {
		ActividadNodoFinal oldElementoNodoFinal = elementoNodoFinal;
		elementoNodoFinal = newElementoNodoFinal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					ModelPackage.ACTIVIDAD_DIAGRAMA__ELEMENTO_NODO_FINAL,
					oldElementoNodoFinal, newElementoNodoFinal);
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
	public void setElementoNodoFinal(ActividadNodoFinal newElementoNodoFinal) {
		if (newElementoNodoFinal != elementoNodoFinal) {
			NotificationChain msgs = null;
			if (elementoNodoFinal != null)
				msgs = ((InternalEObject) elementoNodoFinal)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- ModelPackage.ACTIVIDAD_DIAGRAMA__ELEMENTO_NODO_FINAL,
								null, msgs);
			if (newElementoNodoFinal != null)
				msgs = ((InternalEObject) newElementoNodoFinal)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- ModelPackage.ACTIVIDAD_DIAGRAMA__ELEMENTO_NODO_FINAL,
								null, msgs);
			msgs = basicSetElementoNodoFinal(newElementoNodoFinal, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.ACTIVIDAD_DIAGRAMA__ELEMENTO_NODO_FINAL,
					newElementoNodoFinal, newElementoNodoFinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActividadNodoInicial getElementoNodoInicial() {
		if (elementoNodoInicial != null && elementoNodoInicial.eIsProxy()) {
			InternalEObject oldElementoNodoInicial = (InternalEObject) elementoNodoInicial;
			elementoNodoInicial = (ActividadNodoInicial) eResolveProxy(oldElementoNodoInicial);
			if (elementoNodoInicial != oldElementoNodoInicial) {
				InternalEObject newElementoNodoInicial = (InternalEObject) elementoNodoInicial;
				NotificationChain msgs = oldElementoNodoInicial
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- ModelPackage.ACTIVIDAD_DIAGRAMA__ELEMENTO_NODO_INICIAL,
								null, null);
				if (newElementoNodoInicial.eInternalContainer() == null) {
					msgs = newElementoNodoInicial
							.eInverseAdd(
									this,
									EOPPOSITE_FEATURE_BASE
											- ModelPackage.ACTIVIDAD_DIAGRAMA__ELEMENTO_NODO_INICIAL,
									null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							ModelPackage.ACTIVIDAD_DIAGRAMA__ELEMENTO_NODO_INICIAL,
							oldElementoNodoInicial, elementoNodoInicial));
			}
		}
		return elementoNodoInicial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActividadNodoInicial basicGetElementoNodoInicial() {
		return elementoNodoInicial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementoNodoInicial(
			ActividadNodoInicial newElementoNodoInicial, NotificationChain msgs) {
		ActividadNodoInicial oldElementoNodoInicial = elementoNodoInicial;
		elementoNodoInicial = newElementoNodoInicial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					ModelPackage.ACTIVIDAD_DIAGRAMA__ELEMENTO_NODO_INICIAL,
					oldElementoNodoInicial, newElementoNodoInicial);
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
	public void setElementoNodoInicial(
			ActividadNodoInicial newElementoNodoInicial) {
		if (newElementoNodoInicial != elementoNodoInicial) {
			NotificationChain msgs = null;
			if (elementoNodoInicial != null)
				msgs = ((InternalEObject) elementoNodoInicial)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- ModelPackage.ACTIVIDAD_DIAGRAMA__ELEMENTO_NODO_INICIAL,
								null, msgs);
			if (newElementoNodoInicial != null)
				msgs = ((InternalEObject) newElementoNodoInicial)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- ModelPackage.ACTIVIDAD_DIAGRAMA__ELEMENTO_NODO_INICIAL,
								null, msgs);
			msgs = basicSetElementoNodoInicial(newElementoNodoInicial, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.ACTIVIDAD_DIAGRAMA__ELEMENTO_NODO_INICIAL,
					newElementoNodoInicial, newElementoNodoInicial));
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
		case ModelPackage.ACTIVIDAD_DIAGRAMA__ELEMENTO_NODO_FINAL:
			return basicSetElementoNodoFinal(null, msgs);
		case ModelPackage.ACTIVIDAD_DIAGRAMA__ELEMENTO_NODO_INICIAL:
			return basicSetElementoNodoInicial(null, msgs);
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
		case ModelPackage.ACTIVIDAD_DIAGRAMA__ELEMENTO_NODO_FINAL:
			if (resolve)
				return getElementoNodoFinal();
			return basicGetElementoNodoFinal();
		case ModelPackage.ACTIVIDAD_DIAGRAMA__ELEMENTO_NODO_INICIAL:
			if (resolve)
				return getElementoNodoInicial();
			return basicGetElementoNodoInicial();
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
		case ModelPackage.ACTIVIDAD_DIAGRAMA__ELEMENTO_NODO_FINAL:
			setElementoNodoFinal((ActividadNodoFinal) newValue);
			return;
		case ModelPackage.ACTIVIDAD_DIAGRAMA__ELEMENTO_NODO_INICIAL:
			setElementoNodoInicial((ActividadNodoInicial) newValue);
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
		case ModelPackage.ACTIVIDAD_DIAGRAMA__ELEMENTO_NODO_FINAL:
			setElementoNodoFinal((ActividadNodoFinal) null);
			return;
		case ModelPackage.ACTIVIDAD_DIAGRAMA__ELEMENTO_NODO_INICIAL:
			setElementoNodoInicial((ActividadNodoInicial) null);
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
		case ModelPackage.ACTIVIDAD_DIAGRAMA__ELEMENTO_NODO_FINAL:
			return elementoNodoFinal != null;
		case ModelPackage.ACTIVIDAD_DIAGRAMA__ELEMENTO_NODO_INICIAL:
			return elementoNodoInicial != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Actividad";
	}

} //ActividadDiagramaImpl
