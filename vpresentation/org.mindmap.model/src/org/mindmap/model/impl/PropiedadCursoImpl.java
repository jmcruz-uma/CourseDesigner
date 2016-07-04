/**
 */
package org.mindmap.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.mindmap.model.ModelPackage;
import org.mindmap.model.PropiedadCurso;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propiedad Curso</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mindmap.model.impl.PropiedadCursoImpl#getBibliografia <em>Bibliografia</em>}</li>
 *   <li>{@link org.mindmap.model.impl.PropiedadCursoImpl#getRequisitosPrevios <em>Requisitos Previos</em>}</li>
 *   <li>{@link org.mindmap.model.impl.PropiedadCursoImpl#getCompetencias <em>Competencias</em>}</li>
 *   <li>{@link org.mindmap.model.impl.PropiedadCursoImpl#getSistemaEvaluacion <em>Sistema Evaluacion</em>}</li>
 *   <li>{@link org.mindmap.model.impl.PropiedadCursoImpl#getAsignatura <em>Asignatura</em>}</li>
 *   <li>{@link org.mindmap.model.impl.PropiedadCursoImpl#getArea <em>Area</em>}</li>
 *   <li>{@link org.mindmap.model.impl.PropiedadCursoImpl#getOferta <em>Oferta</em>}</li>
 *   <li>{@link org.mindmap.model.impl.PropiedadCursoImpl#getSemestre <em>Semestre</em>}</li>
 *   <li>{@link org.mindmap.model.impl.PropiedadCursoImpl#getCreditos <em>Creditos</em>}</li>
 *   <li>{@link org.mindmap.model.impl.PropiedadCursoImpl#getHoras_grp_gra <em>Horas grp gra</em>}</li>
 *   <li>{@link org.mindmap.model.impl.PropiedadCursoImpl#getHoras_grp_red <em>Horas grp red</em>}</li>
 *   <li>{@link org.mindmap.model.impl.PropiedadCursoImpl#getCoordinador <em>Coordinador</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropiedadCursoImpl extends MinimalEObjectImpl.Container implements
		PropiedadCurso {
	/**
	 * The default value of the '{@link #getBibliografia() <em>Bibliografia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBibliografia()
	 * @generated
	 * @ordered
	 */
	protected static final String BIBLIOGRAFIA_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getBibliografia() <em>Bibliografia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBibliografia()
	 * @generated
	 * @ordered
	 */
	protected String bibliografia = BIBLIOGRAFIA_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequisitosPrevios() <em>Requisitos Previos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequisitosPrevios()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUISITOS_PREVIOS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getRequisitosPrevios() <em>Requisitos Previos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequisitosPrevios()
	 * @generated
	 * @ordered
	 */
	protected String requisitosPrevios = REQUISITOS_PREVIOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompetencias() <em>Competencias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompetencias()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPETENCIAS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getCompetencias() <em>Competencias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompetencias()
	 * @generated
	 * @ordered
	 */
	protected String competencias = COMPETENCIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSistemaEvaluacion() <em>Sistema Evaluacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSistemaEvaluacion()
	 * @generated
	 * @ordered
	 */
	protected static final String SISTEMA_EVALUACION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSistemaEvaluacion() <em>Sistema Evaluacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSistemaEvaluacion()
	 * @generated
	 * @ordered
	 */
	protected String sistemaEvaluacion = SISTEMA_EVALUACION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAsignatura() <em>Asignatura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsignatura()
	 * @generated
	 * @ordered
	 */
	protected static final String ASIGNATURA_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getAsignatura() <em>Asignatura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsignatura()
	 * @generated
	 * @ordered
	 */
	protected String asignatura = ASIGNATURA_EDEFAULT;

	/**
	 * The default value of the '{@link #getArea() <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected static final String AREA_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getArea() <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected String area = AREA_EDEFAULT;

	/**
	 * The default value of the '{@link #getOferta() <em>Oferta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOferta()
	 * @generated
	 * @ordered
	 */
	protected static final String OFERTA_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getOferta() <em>Oferta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOferta()
	 * @generated
	 * @ordered
	 */
	protected String oferta = OFERTA_EDEFAULT;

	/**
	 * The default value of the '{@link #getSemestre() <em>Semestre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemestre()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMESTRE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSemestre() <em>Semestre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemestre()
	 * @generated
	 * @ordered
	 */
	protected String semestre = SEMESTRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreditos() <em>Creditos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditos()
	 * @generated
	 * @ordered
	 */
	protected static final String CREDITOS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getCreditos() <em>Creditos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditos()
	 * @generated
	 * @ordered
	 */
	protected String creditos = CREDITOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHoras_grp_gra() <em>Horas grp gra</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoras_grp_gra()
	 * @generated
	 * @ordered
	 */
	protected static final String HORAS_GRP_GRA_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getHoras_grp_gra() <em>Horas grp gra</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoras_grp_gra()
	 * @generated
	 * @ordered
	 */
	protected String horas_grp_gra = HORAS_GRP_GRA_EDEFAULT;

	/**
	 * The default value of the '{@link #getHoras_grp_red() <em>Horas grp red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoras_grp_red()
	 * @generated
	 * @ordered
	 */
	protected static final String HORAS_GRP_RED_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getHoras_grp_red() <em>Horas grp red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoras_grp_red()
	 * @generated
	 * @ordered
	 */
	protected String horas_grp_red = HORAS_GRP_RED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoordinador() <em>Coordinador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinador()
	 * @generated
	 * @ordered
	 */
	protected static final String COORDINADOR_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getCoordinador() <em>Coordinador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinador()
	 * @generated
	 * @ordered
	 */
	protected String coordinador = COORDINADOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropiedadCursoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PROPIEDAD_CURSO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBibliografia() {
		return bibliografia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBibliografia(String newBibliografia) {
		String oldBibliografia = bibliografia;
		bibliografia = newBibliografia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.PROPIEDAD_CURSO__BIBLIOGRAFIA,
					oldBibliografia, bibliografia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequisitosPrevios() {
		return requisitosPrevios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequisitosPrevios(String newRequisitosPrevios) {
		String oldRequisitosPrevios = requisitosPrevios;
		requisitosPrevios = newRequisitosPrevios;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.PROPIEDAD_CURSO__REQUISITOS_PREVIOS,
					oldRequisitosPrevios, requisitosPrevios));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompetencias() {
		return competencias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompetencias(String newCompetencias) {
		String oldCompetencias = competencias;
		competencias = newCompetencias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.PROPIEDAD_CURSO__COMPETENCIAS,
					oldCompetencias, competencias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSistemaEvaluacion() {
		return sistemaEvaluacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSistemaEvaluacion(String newSistemaEvaluacion) {
		String oldSistemaEvaluacion = sistemaEvaluacion;
		sistemaEvaluacion = newSistemaEvaluacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.PROPIEDAD_CURSO__SISTEMA_EVALUACION,
					oldSistemaEvaluacion, sistemaEvaluacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAsignatura() {
		return asignatura;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsignatura(String newAsignatura) {
		String oldAsignatura = asignatura;
		asignatura = newAsignatura;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.PROPIEDAD_CURSO__ASIGNATURA, oldAsignatura,
					asignatura));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArea() {
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArea(String newArea) {
		String oldArea = area;
		area = newArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.PROPIEDAD_CURSO__AREA, oldArea, area));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOferta() {
		return oferta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOferta(String newOferta) {
		String oldOferta = oferta;
		oferta = newOferta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.PROPIEDAD_CURSO__OFERTA, oldOferta, oferta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSemestre() {
		return semestre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemestre(String newSemestre) {
		String oldSemestre = semestre;
		semestre = newSemestre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.PROPIEDAD_CURSO__SEMESTRE, oldSemestre,
					semestre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreditos() {
		return creditos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreditos(String newCreditos) {
		String oldCreditos = creditos;
		creditos = newCreditos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.PROPIEDAD_CURSO__CREDITOS, oldCreditos,
					creditos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHoras_grp_gra() {
		return horas_grp_gra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoras_grp_gra(String newHoras_grp_gra) {
		String oldHoras_grp_gra = horas_grp_gra;
		horas_grp_gra = newHoras_grp_gra;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.PROPIEDAD_CURSO__HORAS_GRP_GRA,
					oldHoras_grp_gra, horas_grp_gra));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHoras_grp_red() {
		return horas_grp_red;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoras_grp_red(String newHoras_grp_red) {
		String oldHoras_grp_red = horas_grp_red;
		horas_grp_red = newHoras_grp_red;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.PROPIEDAD_CURSO__HORAS_GRP_RED,
					oldHoras_grp_red, horas_grp_red));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCoordinador() {
		return coordinador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinador(String newCoordinador) {
		String oldCoordinador = coordinador;
		coordinador = newCoordinador;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.PROPIEDAD_CURSO__COORDINADOR, oldCoordinador,
					coordinador));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.PROPIEDAD_CURSO__BIBLIOGRAFIA:
			return getBibliografia();
		case ModelPackage.PROPIEDAD_CURSO__REQUISITOS_PREVIOS:
			return getRequisitosPrevios();
		case ModelPackage.PROPIEDAD_CURSO__COMPETENCIAS:
			return getCompetencias();
		case ModelPackage.PROPIEDAD_CURSO__SISTEMA_EVALUACION:
			return getSistemaEvaluacion();
		case ModelPackage.PROPIEDAD_CURSO__ASIGNATURA:
			return getAsignatura();
		case ModelPackage.PROPIEDAD_CURSO__AREA:
			return getArea();
		case ModelPackage.PROPIEDAD_CURSO__OFERTA:
			return getOferta();
		case ModelPackage.PROPIEDAD_CURSO__SEMESTRE:
			return getSemestre();
		case ModelPackage.PROPIEDAD_CURSO__CREDITOS:
			return getCreditos();
		case ModelPackage.PROPIEDAD_CURSO__HORAS_GRP_GRA:
			return getHoras_grp_gra();
		case ModelPackage.PROPIEDAD_CURSO__HORAS_GRP_RED:
			return getHoras_grp_red();
		case ModelPackage.PROPIEDAD_CURSO__COORDINADOR:
			return getCoordinador();
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
		case ModelPackage.PROPIEDAD_CURSO__BIBLIOGRAFIA:
			setBibliografia((String) newValue);
			return;
		case ModelPackage.PROPIEDAD_CURSO__REQUISITOS_PREVIOS:
			setRequisitosPrevios((String) newValue);
			return;
		case ModelPackage.PROPIEDAD_CURSO__COMPETENCIAS:
			setCompetencias((String) newValue);
			return;
		case ModelPackage.PROPIEDAD_CURSO__SISTEMA_EVALUACION:
			setSistemaEvaluacion((String) newValue);
			return;
		case ModelPackage.PROPIEDAD_CURSO__ASIGNATURA:
			setAsignatura((String) newValue);
			return;
		case ModelPackage.PROPIEDAD_CURSO__AREA:
			setArea((String) newValue);
			return;
		case ModelPackage.PROPIEDAD_CURSO__OFERTA:
			setOferta((String) newValue);
			return;
		case ModelPackage.PROPIEDAD_CURSO__SEMESTRE:
			setSemestre((String) newValue);
			return;
		case ModelPackage.PROPIEDAD_CURSO__CREDITOS:
			setCreditos((String) newValue);
			return;
		case ModelPackage.PROPIEDAD_CURSO__HORAS_GRP_GRA:
			setHoras_grp_gra((String) newValue);
			return;
		case ModelPackage.PROPIEDAD_CURSO__HORAS_GRP_RED:
			setHoras_grp_red((String) newValue);
			return;
		case ModelPackage.PROPIEDAD_CURSO__COORDINADOR:
			setCoordinador((String) newValue);
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
		case ModelPackage.PROPIEDAD_CURSO__BIBLIOGRAFIA:
			setBibliografia(BIBLIOGRAFIA_EDEFAULT);
			return;
		case ModelPackage.PROPIEDAD_CURSO__REQUISITOS_PREVIOS:
			setRequisitosPrevios(REQUISITOS_PREVIOS_EDEFAULT);
			return;
		case ModelPackage.PROPIEDAD_CURSO__COMPETENCIAS:
			setCompetencias(COMPETENCIAS_EDEFAULT);
			return;
		case ModelPackage.PROPIEDAD_CURSO__SISTEMA_EVALUACION:
			setSistemaEvaluacion(SISTEMA_EVALUACION_EDEFAULT);
			return;
		case ModelPackage.PROPIEDAD_CURSO__ASIGNATURA:
			setAsignatura(ASIGNATURA_EDEFAULT);
			return;
		case ModelPackage.PROPIEDAD_CURSO__AREA:
			setArea(AREA_EDEFAULT);
			return;
		case ModelPackage.PROPIEDAD_CURSO__OFERTA:
			setOferta(OFERTA_EDEFAULT);
			return;
		case ModelPackage.PROPIEDAD_CURSO__SEMESTRE:
			setSemestre(SEMESTRE_EDEFAULT);
			return;
		case ModelPackage.PROPIEDAD_CURSO__CREDITOS:
			setCreditos(CREDITOS_EDEFAULT);
			return;
		case ModelPackage.PROPIEDAD_CURSO__HORAS_GRP_GRA:
			setHoras_grp_gra(HORAS_GRP_GRA_EDEFAULT);
			return;
		case ModelPackage.PROPIEDAD_CURSO__HORAS_GRP_RED:
			setHoras_grp_red(HORAS_GRP_RED_EDEFAULT);
			return;
		case ModelPackage.PROPIEDAD_CURSO__COORDINADOR:
			setCoordinador(COORDINADOR_EDEFAULT);
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
		case ModelPackage.PROPIEDAD_CURSO__BIBLIOGRAFIA:
			return BIBLIOGRAFIA_EDEFAULT == null ? bibliografia != null
					: !BIBLIOGRAFIA_EDEFAULT.equals(bibliografia);
		case ModelPackage.PROPIEDAD_CURSO__REQUISITOS_PREVIOS:
			return REQUISITOS_PREVIOS_EDEFAULT == null ? requisitosPrevios != null
					: !REQUISITOS_PREVIOS_EDEFAULT.equals(requisitosPrevios);
		case ModelPackage.PROPIEDAD_CURSO__COMPETENCIAS:
			return COMPETENCIAS_EDEFAULT == null ? competencias != null
					: !COMPETENCIAS_EDEFAULT.equals(competencias);
		case ModelPackage.PROPIEDAD_CURSO__SISTEMA_EVALUACION:
			return SISTEMA_EVALUACION_EDEFAULT == null ? sistemaEvaluacion != null
					: !SISTEMA_EVALUACION_EDEFAULT.equals(sistemaEvaluacion);
		case ModelPackage.PROPIEDAD_CURSO__ASIGNATURA:
			return ASIGNATURA_EDEFAULT == null ? asignatura != null
					: !ASIGNATURA_EDEFAULT.equals(asignatura);
		case ModelPackage.PROPIEDAD_CURSO__AREA:
			return AREA_EDEFAULT == null ? area != null : !AREA_EDEFAULT
					.equals(area);
		case ModelPackage.PROPIEDAD_CURSO__OFERTA:
			return OFERTA_EDEFAULT == null ? oferta != null : !OFERTA_EDEFAULT
					.equals(oferta);
		case ModelPackage.PROPIEDAD_CURSO__SEMESTRE:
			return SEMESTRE_EDEFAULT == null ? semestre != null
					: !SEMESTRE_EDEFAULT.equals(semestre);
		case ModelPackage.PROPIEDAD_CURSO__CREDITOS:
			return CREDITOS_EDEFAULT == null ? creditos != null
					: !CREDITOS_EDEFAULT.equals(creditos);
		case ModelPackage.PROPIEDAD_CURSO__HORAS_GRP_GRA:
			return HORAS_GRP_GRA_EDEFAULT == null ? horas_grp_gra != null
					: !HORAS_GRP_GRA_EDEFAULT.equals(horas_grp_gra);
		case ModelPackage.PROPIEDAD_CURSO__HORAS_GRP_RED:
			return HORAS_GRP_RED_EDEFAULT == null ? horas_grp_red != null
					: !HORAS_GRP_RED_EDEFAULT.equals(horas_grp_red);
		case ModelPackage.PROPIEDAD_CURSO__COORDINADOR:
			return COORDINADOR_EDEFAULT == null ? coordinador != null
					: !COORDINADOR_EDEFAULT.equals(coordinador);
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
		result.append(" (bibliografia: ");
		result.append(bibliografia);
		result.append(", requisitosPrevios: ");
		result.append(requisitosPrevios);
		result.append(", competencias: ");
		result.append(competencias);
		result.append(", sistemaEvaluacion: ");
		result.append(sistemaEvaluacion);
		result.append(", asignatura: ");
		result.append(asignatura);
		result.append(", area: ");
		result.append(area);
		result.append(", oferta: ");
		result.append(oferta);
		result.append(", semestre: ");
		result.append(semestre);
		result.append(", creditos: ");
		result.append(creditos);
		result.append(", horas_grp_gra: ");
		result.append(horas_grp_gra);
		result.append(", horas_grp_red: ");
		result.append(horas_grp_red);
		result.append(", coordinador: ");
		result.append(coordinador);
		result.append(')');
		return result.toString();
	}

} //PropiedadCursoImpl
