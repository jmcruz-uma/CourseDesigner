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
import org.eclipse.gmf.runtime.notation.Diagram;
import org.mindmap.model.Actividad;
import org.mindmap.model.ActividadEnlace;
import org.mindmap.model.ActividadUnionBifurcacion;
import org.mindmap.model.CursoDiagrama;
import org.mindmap.model.EnlaceEsUn;
import org.mindmap.model.EnlaceUsa;
import org.mindmap.model.EnlaceUsaBloque;
import org.mindmap.model.ModelPackage;
import org.mindmap.model.Tema;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Curso Diagrama</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mindmap.model.impl.CursoDiagramaImpl#getGmfdiagram <em>Gmfdiagram</em>}</li>
 *   <li>{@link org.mindmap.model.impl.CursoDiagramaImpl#getActividades <em>Actividades</em>}</li>
 *   <li>{@link org.mindmap.model.impl.CursoDiagramaImpl#getTemas <em>Temas</em>}</li>
 *   <li>{@link org.mindmap.model.impl.CursoDiagramaImpl#getEnlacesActividad <em>Enlaces Actividad</em>}</li>
 *   <li>{@link org.mindmap.model.impl.CursoDiagramaImpl#getEnlacesUsaBloque <em>Enlaces Usa Bloque</em>}</li>
 *   <li>{@link org.mindmap.model.impl.CursoDiagramaImpl#getEnlaceUsa <em>Enlace Usa</em>}</li>
 *   <li>{@link org.mindmap.model.impl.CursoDiagramaImpl#getEnlacesEsUn <em>Enlaces Es Un</em>}</li>
 *   <li>{@link org.mindmap.model.impl.CursoDiagramaImpl#getUnionesbifurcaciones <em>Unionesbifurcaciones</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CursoDiagramaImpl extends MinimalEObjectImpl.Container
		implements CursoDiagrama {
	/**
	 * The cached value of the '{@link #getGmfdiagram() <em>Gmfdiagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmfdiagram()
	 * @generated
	 * @ordered
	 */
	protected Diagram gmfdiagram;

	/**
	 * The cached value of the '{@link #getActividades() <em>Actividades</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActividades()
	 * @generated
	 * @ordered
	 */
	protected EList<Actividad> actividades;

	/**
	 * The cached value of the '{@link #getTemas() <em>Temas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemas()
	 * @generated
	 * @ordered
	 */
	protected EList<Tema> temas;

	/**
	 * The cached value of the '{@link #getEnlacesActividad() <em>Enlaces Actividad</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnlacesActividad()
	 * @generated
	 * @ordered
	 */
	protected EList<ActividadEnlace> enlacesActividad;

	/**
	 * The cached value of the '{@link #getEnlacesUsaBloque() <em>Enlaces Usa Bloque</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnlacesUsaBloque()
	 * @generated
	 * @ordered
	 */
	protected EList<EnlaceUsaBloque> enlacesUsaBloque;

	/**
	 * The cached value of the '{@link #getEnlaceUsa() <em>Enlace Usa</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnlaceUsa()
	 * @generated
	 * @ordered
	 */
	protected EList<EnlaceUsa> enlaceUsa;

	/**
	 * The cached value of the '{@link #getEnlacesEsUn() <em>Enlaces Es Un</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnlacesEsUn()
	 * @generated
	 * @ordered
	 */
	protected EList<EnlaceEsUn> enlacesEsUn;

	/**
	 * The cached value of the '{@link #getUnionesbifurcaciones() <em>Unionesbifurcaciones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnionesbifurcaciones()
	 * @generated
	 * @ordered
	 */
	protected EList<ActividadUnionBifurcacion> unionesbifurcaciones;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CursoDiagramaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CURSO_DIAGRAMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram getGmfdiagram() {
		if (gmfdiagram != null && gmfdiagram.eIsProxy()) {
			InternalEObject oldGmfdiagram = (InternalEObject) gmfdiagram;
			gmfdiagram = (Diagram) eResolveProxy(oldGmfdiagram);
			if (gmfdiagram != oldGmfdiagram) {
				InternalEObject newGmfdiagram = (InternalEObject) gmfdiagram;
				NotificationChain msgs = oldGmfdiagram.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ModelPackage.CURSO_DIAGRAMA__GMFDIAGRAM,
						null, null);
				if (newGmfdiagram.eInternalContainer() == null) {
					msgs = newGmfdiagram.eInverseAdd(this,
							EOPPOSITE_FEATURE_BASE
									- ModelPackage.CURSO_DIAGRAMA__GMFDIAGRAM,
							null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModelPackage.CURSO_DIAGRAMA__GMFDIAGRAM,
							oldGmfdiagram, gmfdiagram));
			}
		}
		return gmfdiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram basicGetGmfdiagram() {
		return gmfdiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGmfdiagram(Diagram newGmfdiagram,
			NotificationChain msgs) {
		Diagram oldGmfdiagram = gmfdiagram;
		gmfdiagram = newGmfdiagram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, ModelPackage.CURSO_DIAGRAMA__GMFDIAGRAM,
					oldGmfdiagram, newGmfdiagram);
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
	public void setGmfdiagram(Diagram newGmfdiagram) {
		if (newGmfdiagram != gmfdiagram) {
			NotificationChain msgs = null;
			if (gmfdiagram != null)
				msgs = ((InternalEObject) gmfdiagram).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ModelPackage.CURSO_DIAGRAMA__GMFDIAGRAM,
						null, msgs);
			if (newGmfdiagram != null)
				msgs = ((InternalEObject) newGmfdiagram).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- ModelPackage.CURSO_DIAGRAMA__GMFDIAGRAM,
						null, msgs);
			msgs = basicSetGmfdiagram(newGmfdiagram, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.CURSO_DIAGRAMA__GMFDIAGRAM, newGmfdiagram,
					newGmfdiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actividad> getActividades() {
		if (actividades == null) {
			actividades = new EObjectContainmentEList.Resolving<Actividad>(
					Actividad.class, this,
					ModelPackage.CURSO_DIAGRAMA__ACTIVIDADES);
		}
		return actividades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tema> getTemas() {
		if (temas == null) {
			temas = new EObjectContainmentEList.Resolving<Tema>(Tema.class,
					this, ModelPackage.CURSO_DIAGRAMA__TEMAS);
		}
		return temas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActividadEnlace> getEnlacesActividad() {
		if (enlacesActividad == null) {
			enlacesActividad = new EObjectContainmentEList.Resolving<ActividadEnlace>(
					ActividadEnlace.class, this,
					ModelPackage.CURSO_DIAGRAMA__ENLACES_ACTIVIDAD);
		}
		return enlacesActividad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnlaceUsaBloque> getEnlacesUsaBloque() {
		if (enlacesUsaBloque == null) {
			enlacesUsaBloque = new EObjectContainmentEList.Resolving<EnlaceUsaBloque>(
					EnlaceUsaBloque.class, this,
					ModelPackage.CURSO_DIAGRAMA__ENLACES_USA_BLOQUE);
		}
		return enlacesUsaBloque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnlaceUsa> getEnlaceUsa() {
		if (enlaceUsa == null) {
			enlaceUsa = new EObjectContainmentEList.Resolving<EnlaceUsa>(
					EnlaceUsa.class, this,
					ModelPackage.CURSO_DIAGRAMA__ENLACE_USA);
		}
		return enlaceUsa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnlaceEsUn> getEnlacesEsUn() {
		if (enlacesEsUn == null) {
			enlacesEsUn = new EObjectContainmentEList.Resolving<EnlaceEsUn>(
					EnlaceEsUn.class, this,
					ModelPackage.CURSO_DIAGRAMA__ENLACES_ES_UN);
		}
		return enlacesEsUn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActividadUnionBifurcacion> getUnionesbifurcaciones() {
		if (unionesbifurcaciones == null) {
			unionesbifurcaciones = new EObjectContainmentEList.Resolving<ActividadUnionBifurcacion>(
					ActividadUnionBifurcacion.class, this,
					ModelPackage.CURSO_DIAGRAMA__UNIONESBIFURCACIONES);
		}
		return unionesbifurcaciones;
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
		case ModelPackage.CURSO_DIAGRAMA__GMFDIAGRAM:
			return basicSetGmfdiagram(null, msgs);
		case ModelPackage.CURSO_DIAGRAMA__ACTIVIDADES:
			return ((InternalEList<?>) getActividades()).basicRemove(otherEnd,
					msgs);
		case ModelPackage.CURSO_DIAGRAMA__TEMAS:
			return ((InternalEList<?>) getTemas()).basicRemove(otherEnd, msgs);
		case ModelPackage.CURSO_DIAGRAMA__ENLACES_ACTIVIDAD:
			return ((InternalEList<?>) getEnlacesActividad()).basicRemove(
					otherEnd, msgs);
		case ModelPackage.CURSO_DIAGRAMA__ENLACES_USA_BLOQUE:
			return ((InternalEList<?>) getEnlacesUsaBloque()).basicRemove(
					otherEnd, msgs);
		case ModelPackage.CURSO_DIAGRAMA__ENLACE_USA:
			return ((InternalEList<?>) getEnlaceUsa()).basicRemove(otherEnd,
					msgs);
		case ModelPackage.CURSO_DIAGRAMA__ENLACES_ES_UN:
			return ((InternalEList<?>) getEnlacesEsUn()).basicRemove(otherEnd,
					msgs);
		case ModelPackage.CURSO_DIAGRAMA__UNIONESBIFURCACIONES:
			return ((InternalEList<?>) getUnionesbifurcaciones()).basicRemove(
					otherEnd, msgs);
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
		case ModelPackage.CURSO_DIAGRAMA__GMFDIAGRAM:
			if (resolve)
				return getGmfdiagram();
			return basicGetGmfdiagram();
		case ModelPackage.CURSO_DIAGRAMA__ACTIVIDADES:
			return getActividades();
		case ModelPackage.CURSO_DIAGRAMA__TEMAS:
			return getTemas();
		case ModelPackage.CURSO_DIAGRAMA__ENLACES_ACTIVIDAD:
			return getEnlacesActividad();
		case ModelPackage.CURSO_DIAGRAMA__ENLACES_USA_BLOQUE:
			return getEnlacesUsaBloque();
		case ModelPackage.CURSO_DIAGRAMA__ENLACE_USA:
			return getEnlaceUsa();
		case ModelPackage.CURSO_DIAGRAMA__ENLACES_ES_UN:
			return getEnlacesEsUn();
		case ModelPackage.CURSO_DIAGRAMA__UNIONESBIFURCACIONES:
			return getUnionesbifurcaciones();
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
		case ModelPackage.CURSO_DIAGRAMA__GMFDIAGRAM:
			setGmfdiagram((Diagram) newValue);
			return;
		case ModelPackage.CURSO_DIAGRAMA__ACTIVIDADES:
			getActividades().clear();
			getActividades().addAll((Collection<? extends Actividad>) newValue);
			return;
		case ModelPackage.CURSO_DIAGRAMA__TEMAS:
			getTemas().clear();
			getTemas().addAll((Collection<? extends Tema>) newValue);
			return;
		case ModelPackage.CURSO_DIAGRAMA__ENLACES_ACTIVIDAD:
			getEnlacesActividad().clear();
			getEnlacesActividad().addAll(
					(Collection<? extends ActividadEnlace>) newValue);
			return;
		case ModelPackage.CURSO_DIAGRAMA__ENLACES_USA_BLOQUE:
			getEnlacesUsaBloque().clear();
			getEnlacesUsaBloque().addAll(
					(Collection<? extends EnlaceUsaBloque>) newValue);
			return;
		case ModelPackage.CURSO_DIAGRAMA__ENLACE_USA:
			getEnlaceUsa().clear();
			getEnlaceUsa().addAll((Collection<? extends EnlaceUsa>) newValue);
			return;
		case ModelPackage.CURSO_DIAGRAMA__ENLACES_ES_UN:
			getEnlacesEsUn().clear();
			getEnlacesEsUn()
					.addAll((Collection<? extends EnlaceEsUn>) newValue);
			return;
		case ModelPackage.CURSO_DIAGRAMA__UNIONESBIFURCACIONES:
			getUnionesbifurcaciones().clear();
			getUnionesbifurcaciones().addAll(
					(Collection<? extends ActividadUnionBifurcacion>) newValue);
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
		case ModelPackage.CURSO_DIAGRAMA__GMFDIAGRAM:
			setGmfdiagram((Diagram) null);
			return;
		case ModelPackage.CURSO_DIAGRAMA__ACTIVIDADES:
			getActividades().clear();
			return;
		case ModelPackage.CURSO_DIAGRAMA__TEMAS:
			getTemas().clear();
			return;
		case ModelPackage.CURSO_DIAGRAMA__ENLACES_ACTIVIDAD:
			getEnlacesActividad().clear();
			return;
		case ModelPackage.CURSO_DIAGRAMA__ENLACES_USA_BLOQUE:
			getEnlacesUsaBloque().clear();
			return;
		case ModelPackage.CURSO_DIAGRAMA__ENLACE_USA:
			getEnlaceUsa().clear();
			return;
		case ModelPackage.CURSO_DIAGRAMA__ENLACES_ES_UN:
			getEnlacesEsUn().clear();
			return;
		case ModelPackage.CURSO_DIAGRAMA__UNIONESBIFURCACIONES:
			getUnionesbifurcaciones().clear();
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
		case ModelPackage.CURSO_DIAGRAMA__GMFDIAGRAM:
			return gmfdiagram != null;
		case ModelPackage.CURSO_DIAGRAMA__ACTIVIDADES:
			return actividades != null && !actividades.isEmpty();
		case ModelPackage.CURSO_DIAGRAMA__TEMAS:
			return temas != null && !temas.isEmpty();
		case ModelPackage.CURSO_DIAGRAMA__ENLACES_ACTIVIDAD:
			return enlacesActividad != null && !enlacesActividad.isEmpty();
		case ModelPackage.CURSO_DIAGRAMA__ENLACES_USA_BLOQUE:
			return enlacesUsaBloque != null && !enlacesUsaBloque.isEmpty();
		case ModelPackage.CURSO_DIAGRAMA__ENLACE_USA:
			return enlaceUsa != null && !enlaceUsa.isEmpty();
		case ModelPackage.CURSO_DIAGRAMA__ENLACES_ES_UN:
			return enlacesEsUn != null && !enlacesEsUn.isEmpty();
		case ModelPackage.CURSO_DIAGRAMA__UNIONESBIFURCACIONES:
			return unionesbifurcaciones != null
					&& !unionesbifurcaciones.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CursoDiagramaImpl
