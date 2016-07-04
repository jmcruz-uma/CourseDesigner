/**
 */
package org.mindmap.model.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EEnumLiteralImpl;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.mindmap.model.Actividad;
import org.mindmap.model.ActividadDiagrama;
import org.mindmap.model.ActividadEnlace;
import org.mindmap.model.ActividadEspacio;
import org.mindmap.model.ActividadNodo;
import org.mindmap.model.ActividadNodoFinal;
import org.mindmap.model.ActividadNodoInicial;
import org.mindmap.model.ActividadUnionBifurcacion;
import org.mindmap.model.ArchivoAdjunto;
import org.mindmap.model.Atributo;
import org.mindmap.model.Bloque;
import org.mindmap.model.Concepto;
import org.mindmap.model.ConceptosDiagrama;
import org.mindmap.model.Curso;
import org.mindmap.model.CursoDiagrama;
import org.mindmap.model.CursoElement;
import org.mindmap.model.EnlaceEsUn;
import org.mindmap.model.EnlaceUsa;
import org.mindmap.model.EnlaceUsaBloque;
import org.mindmap.model.Leccion;
import org.mindmap.model.MiRelativeBendpoints;
import org.mindmap.model.ModelFactory;
import org.mindmap.model.ModelPackage;
import org.mindmap.model.PropiedadCurso;
import org.mindmap.model.Prueba;
import org.mindmap.model.Tarea;
import org.mindmap.model.Tema;
import org.mindmap.model.util.ModelValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cursoElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cursoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propiedadCursoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cursoDiagramaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actividadDiagramaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptosDiagramaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atributoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enlaceUsaBloqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enlaceEsUnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enlaceUsaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actividadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actividadEspacioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tareaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leccionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pruebaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actividadNodoInicialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actividadNodoFinalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actividadEnlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actividadUnionBifurcacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actividadNodoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archivoAdjuntoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass miRelativeBendpointsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bloqueEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType miRelativeBendpointEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.mindmap.model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited)
			return (ModelPackage) EPackage.Registry.INSTANCE
					.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		org.eclipse.emf.emfstore.internal.common.model.ModelPackage.eINSTANCE
				.eClass();
		NotationPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theModelPackage,
				new EValidator.Descriptor() {
					public EValidator getEValidator() {
						return ModelValidator.INSTANCE;
					}
				});

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCursoElement() {
		return cursoElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurso() {
		return cursoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurso_Diagramas() {
		return (EReference) cursoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurso_Propiedades() {
		return (EReference) cursoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropiedadCurso() {
		return propiedadCursoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropiedadCurso_Bibliografia() {
		return (EAttribute) propiedadCursoEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropiedadCurso_RequisitosPrevios() {
		return (EAttribute) propiedadCursoEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropiedadCurso_Competencias() {
		return (EAttribute) propiedadCursoEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropiedadCurso_SistemaEvaluacion() {
		return (EAttribute) propiedadCursoEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropiedadCurso_Asignatura() {
		return (EAttribute) propiedadCursoEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropiedadCurso_Area() {
		return (EAttribute) propiedadCursoEClass.getEStructuralFeatures()
				.get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropiedadCurso_Oferta() {
		return (EAttribute) propiedadCursoEClass.getEStructuralFeatures()
				.get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropiedadCurso_Semestre() {
		return (EAttribute) propiedadCursoEClass.getEStructuralFeatures()
				.get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropiedadCurso_Creditos() {
		return (EAttribute) propiedadCursoEClass.getEStructuralFeatures()
				.get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropiedadCurso_Horas_grp_gra() {
		return (EAttribute) propiedadCursoEClass.getEStructuralFeatures()
				.get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropiedadCurso_Horas_grp_red() {
		return (EAttribute) propiedadCursoEClass.getEStructuralFeatures().get(
				10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropiedadCurso_Coordinador() {
		return (EAttribute) propiedadCursoEClass.getEStructuralFeatures().get(
				11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCursoDiagrama() {
		return cursoDiagramaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCursoDiagrama_Gmfdiagram() {
		return (EReference) cursoDiagramaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCursoDiagrama_Actividades() {
		return (EReference) cursoDiagramaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCursoDiagrama_Temas() {
		return (EReference) cursoDiagramaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCursoDiagrama_EnlacesActividad() {
		return (EReference) cursoDiagramaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCursoDiagrama_EnlacesUsaBloque() {
		return (EReference) cursoDiagramaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCursoDiagrama_EnlaceUsa() {
		return (EReference) cursoDiagramaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCursoDiagrama_EnlacesEsUn() {
		return (EReference) cursoDiagramaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCursoDiagrama_Unionesbifurcaciones() {
		return (EReference) cursoDiagramaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActividadDiagrama() {
		return actividadDiagramaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActividadDiagrama_ElementoNodoFinal() {
		return (EReference) actividadDiagramaEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActividadDiagrama_ElementoNodoInicial() {
		return (EReference) actividadDiagramaEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptosDiagrama() {
		return conceptosDiagramaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTema() {
		return temaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTema_Nombre() {
		return (EAttribute) temaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTema_Anotaciones() {
		return (EAttribute) temaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTema_Conceptos() {
		return (EReference) temaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcepto() {
		return conceptoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcepto_Nombre() {
		return (EAttribute) conceptoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcepto_Anotaciones() {
		return (EAttribute) conceptoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcepto_Atributos() {
		return (EReference) conceptoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtributo() {
		return atributoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtributo_Nombre() {
		return (EAttribute) atributoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnlaceUsaBloque() {
		return enlaceUsaBloqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnlaceUsaBloque_Etiqueta() {
		return (EAttribute) enlaceUsaBloqueEClass.getEStructuralFeatures().get(
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnlaceUsaBloque_Origen() {
		return (EReference) enlaceUsaBloqueEClass.getEStructuralFeatures().get(
				1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnlaceUsaBloque_Destino() {
		return (EReference) enlaceUsaBloqueEClass.getEStructuralFeatures().get(
				2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnlaceEsUn() {
		return enlaceEsUnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnlaceEsUn_Etiqueta() {
		return (EAttribute) enlaceEsUnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnlaceEsUn_Origen() {
		return (EReference) enlaceEsUnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnlaceEsUn_Destino() {
		return (EReference) enlaceEsUnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnlaceUsa() {
		return enlaceUsaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnlaceUsa_Etiqueta() {
		return (EAttribute) enlaceUsaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnlaceUsa_Origen() {
		return (EReference) enlaceUsaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnlaceUsa_Destino() {
		return (EReference) enlaceUsaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActividad() {
		return actividadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActividad_Nombre() {
		return (EAttribute) actividadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActividad_Bloque() {
		return (EAttribute) actividadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActividad_Espacios() {
		return (EReference) actividadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActividadEspacio() {
		return actividadEspacioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActividadEspacio_Nombre() {
		return (EAttribute) actividadEspacioEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActividadEspacio_Tareas() {
		return (EReference) actividadEspacioEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActividadEspacio_Lecciones() {
		return (EReference) actividadEspacioEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActividadEspacio_Pruebas() {
		return (EReference) actividadEspacioEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTarea() {
		return tareaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarea_Nombre() {
		return (EAttribute) tareaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarea_Tipo() {
		return (EAttribute) tareaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarea_PorcentajeNota() {
		return (EAttribute) tareaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarea_Duracion() {
		return (EAttribute) tareaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarea_Contenidos() {
		return (EReference) tareaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeccion() {
		return leccionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLeccion_Nombre() {
		return (EAttribute) leccionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLeccion_Profesor() {
		return (EAttribute) leccionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLeccion_PorcentajeNota() {
		return (EAttribute) leccionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLeccion_Duracion() {
		return (EAttribute) leccionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLeccion_Contenidos() {
		return (EReference) leccionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrueba() {
		return pruebaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrueba_Nombre() {
		return (EAttribute) pruebaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrueba_Tipo() {
		return (EAttribute) pruebaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrueba_PorcentajeNota() {
		return (EAttribute) pruebaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrueba_Duracion() {
		return (EAttribute) pruebaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActividadNodoInicial() {
		return actividadNodoInicialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActividadNodoFinal() {
		return actividadNodoFinalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActividadEnlace() {
		return actividadEnlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActividadEnlace_Etiqueta() {
		return (EAttribute) actividadEnlaceEClass.getEStructuralFeatures().get(
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActividadEnlace_Origen() {
		return (EReference) actividadEnlaceEClass.getEStructuralFeatures().get(
				1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActividadEnlace_Destino() {
		return (EReference) actividadEnlaceEClass.getEStructuralFeatures().get(
				2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActividadUnionBifurcacion() {
		return actividadUnionBifurcacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActividadNodo() {
		return actividadNodoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchivoAdjunto() {
		return archivoAdjuntoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchivoAdjunto_Nombre() {
		return (EAttribute) archivoAdjuntoEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchivoAdjunto_FileId() {
		return (EAttribute) archivoAdjuntoEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMiRelativeBendpoints() {
		return miRelativeBendpointsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBloque() {
		return bloqueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMiRelativeBendpoint() {
		return miRelativeBendpointEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		cursoElementEClass = createEClass(CURSO_ELEMENT);

		cursoEClass = createEClass(CURSO);
		createEReference(cursoEClass, CURSO__DIAGRAMAS);
		createEReference(cursoEClass, CURSO__PROPIEDADES);

		propiedadCursoEClass = createEClass(PROPIEDAD_CURSO);
		createEAttribute(propiedadCursoEClass, PROPIEDAD_CURSO__BIBLIOGRAFIA);
		createEAttribute(propiedadCursoEClass,
				PROPIEDAD_CURSO__REQUISITOS_PREVIOS);
		createEAttribute(propiedadCursoEClass, PROPIEDAD_CURSO__COMPETENCIAS);
		createEAttribute(propiedadCursoEClass,
				PROPIEDAD_CURSO__SISTEMA_EVALUACION);
		createEAttribute(propiedadCursoEClass, PROPIEDAD_CURSO__ASIGNATURA);
		createEAttribute(propiedadCursoEClass, PROPIEDAD_CURSO__AREA);
		createEAttribute(propiedadCursoEClass, PROPIEDAD_CURSO__OFERTA);
		createEAttribute(propiedadCursoEClass, PROPIEDAD_CURSO__SEMESTRE);
		createEAttribute(propiedadCursoEClass, PROPIEDAD_CURSO__CREDITOS);
		createEAttribute(propiedadCursoEClass, PROPIEDAD_CURSO__HORAS_GRP_GRA);
		createEAttribute(propiedadCursoEClass, PROPIEDAD_CURSO__HORAS_GRP_RED);
		createEAttribute(propiedadCursoEClass, PROPIEDAD_CURSO__COORDINADOR);

		cursoDiagramaEClass = createEClass(CURSO_DIAGRAMA);
		createEReference(cursoDiagramaEClass, CURSO_DIAGRAMA__GMFDIAGRAM);
		createEReference(cursoDiagramaEClass, CURSO_DIAGRAMA__ACTIVIDADES);
		createEReference(cursoDiagramaEClass, CURSO_DIAGRAMA__TEMAS);
		createEReference(cursoDiagramaEClass, CURSO_DIAGRAMA__ENLACES_ACTIVIDAD);
		createEReference(cursoDiagramaEClass,
				CURSO_DIAGRAMA__ENLACES_USA_BLOQUE);
		createEReference(cursoDiagramaEClass, CURSO_DIAGRAMA__ENLACE_USA);
		createEReference(cursoDiagramaEClass, CURSO_DIAGRAMA__ENLACES_ES_UN);
		createEReference(cursoDiagramaEClass,
				CURSO_DIAGRAMA__UNIONESBIFURCACIONES);

		actividadDiagramaEClass = createEClass(ACTIVIDAD_DIAGRAMA);
		createEReference(actividadDiagramaEClass,
				ACTIVIDAD_DIAGRAMA__ELEMENTO_NODO_FINAL);
		createEReference(actividadDiagramaEClass,
				ACTIVIDAD_DIAGRAMA__ELEMENTO_NODO_INICIAL);

		conceptosDiagramaEClass = createEClass(CONCEPTOS_DIAGRAMA);

		temaEClass = createEClass(TEMA);
		createEAttribute(temaEClass, TEMA__NOMBRE);
		createEAttribute(temaEClass, TEMA__ANOTACIONES);
		createEReference(temaEClass, TEMA__CONCEPTOS);

		conceptoEClass = createEClass(CONCEPTO);
		createEAttribute(conceptoEClass, CONCEPTO__NOMBRE);
		createEAttribute(conceptoEClass, CONCEPTO__ANOTACIONES);
		createEReference(conceptoEClass, CONCEPTO__ATRIBUTOS);

		atributoEClass = createEClass(ATRIBUTO);
		createEAttribute(atributoEClass, ATRIBUTO__NOMBRE);

		enlaceUsaBloqueEClass = createEClass(ENLACE_USA_BLOQUE);
		createEAttribute(enlaceUsaBloqueEClass, ENLACE_USA_BLOQUE__ETIQUETA);
		createEReference(enlaceUsaBloqueEClass, ENLACE_USA_BLOQUE__ORIGEN);
		createEReference(enlaceUsaBloqueEClass, ENLACE_USA_BLOQUE__DESTINO);

		enlaceEsUnEClass = createEClass(ENLACE_ES_UN);
		createEAttribute(enlaceEsUnEClass, ENLACE_ES_UN__ETIQUETA);
		createEReference(enlaceEsUnEClass, ENLACE_ES_UN__ORIGEN);
		createEReference(enlaceEsUnEClass, ENLACE_ES_UN__DESTINO);

		enlaceUsaEClass = createEClass(ENLACE_USA);
		createEAttribute(enlaceUsaEClass, ENLACE_USA__ETIQUETA);
		createEReference(enlaceUsaEClass, ENLACE_USA__ORIGEN);
		createEReference(enlaceUsaEClass, ENLACE_USA__DESTINO);

		actividadEClass = createEClass(ACTIVIDAD);
		createEAttribute(actividadEClass, ACTIVIDAD__NOMBRE);
		createEAttribute(actividadEClass, ACTIVIDAD__BLOQUE);
		createEReference(actividadEClass, ACTIVIDAD__ESPACIOS);

		actividadEspacioEClass = createEClass(ACTIVIDAD_ESPACIO);
		createEAttribute(actividadEspacioEClass, ACTIVIDAD_ESPACIO__NOMBRE);
		createEReference(actividadEspacioEClass, ACTIVIDAD_ESPACIO__TAREAS);
		createEReference(actividadEspacioEClass, ACTIVIDAD_ESPACIO__LECCIONES);
		createEReference(actividadEspacioEClass, ACTIVIDAD_ESPACIO__PRUEBAS);

		tareaEClass = createEClass(TAREA);
		createEAttribute(tareaEClass, TAREA__NOMBRE);
		createEAttribute(tareaEClass, TAREA__TIPO);
		createEAttribute(tareaEClass, TAREA__PORCENTAJE_NOTA);
		createEAttribute(tareaEClass, TAREA__DURACION);
		createEReference(tareaEClass, TAREA__CONTENIDOS);

		leccionEClass = createEClass(LECCION);
		createEAttribute(leccionEClass, LECCION__NOMBRE);
		createEAttribute(leccionEClass, LECCION__PROFESOR);
		createEAttribute(leccionEClass, LECCION__PORCENTAJE_NOTA);
		createEAttribute(leccionEClass, LECCION__DURACION);
		createEReference(leccionEClass, LECCION__CONTENIDOS);

		pruebaEClass = createEClass(PRUEBA);
		createEAttribute(pruebaEClass, PRUEBA__NOMBRE);
		createEAttribute(pruebaEClass, PRUEBA__TIPO);
		createEAttribute(pruebaEClass, PRUEBA__PORCENTAJE_NOTA);
		createEAttribute(pruebaEClass, PRUEBA__DURACION);

		actividadNodoInicialEClass = createEClass(ACTIVIDAD_NODO_INICIAL);

		actividadNodoFinalEClass = createEClass(ACTIVIDAD_NODO_FINAL);

		actividadEnlaceEClass = createEClass(ACTIVIDAD_ENLACE);
		createEAttribute(actividadEnlaceEClass, ACTIVIDAD_ENLACE__ETIQUETA);
		createEReference(actividadEnlaceEClass, ACTIVIDAD_ENLACE__ORIGEN);
		createEReference(actividadEnlaceEClass, ACTIVIDAD_ENLACE__DESTINO);

		actividadUnionBifurcacionEClass = createEClass(ACTIVIDAD_UNION_BIFURCACION);

		actividadNodoEClass = createEClass(ACTIVIDAD_NODO);

		archivoAdjuntoEClass = createEClass(ARCHIVO_ADJUNTO);
		createEAttribute(archivoAdjuntoEClass, ARCHIVO_ADJUNTO__NOMBRE);
		createEAttribute(archivoAdjuntoEClass, ARCHIVO_ADJUNTO__FILE_ID);

		miRelativeBendpointsEClass = createEClass(MI_RELATIVE_BENDPOINTS);

		// Create enums
		bloqueEEnum = createEEnum(BLOQUE);

		// Create data types
		miRelativeBendpointEDataType = createEDataType(MI_RELATIVE_BENDPOINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		NotationPackage theNotationPackage = (NotationPackage) EPackage.Registry.INSTANCE
				.getEPackage(NotationPackage.eNS_URI);
		org.eclipse.emf.emfstore.internal.common.model.ModelPackage theModelPackage_1 = (org.eclipse.emf.emfstore.internal.common.model.ModelPackage) EPackage.Registry.INSTANCE
				.getEPackage(org.eclipse.emf.emfstore.internal.common.model.ModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		actividadDiagramaEClass.getESuperTypes().add(this.getCursoDiagrama());
		conceptosDiagramaEClass.getESuperTypes().add(this.getCursoDiagrama());
		temaEClass.getESuperTypes().add(this.getCursoElement());
		conceptoEClass.getESuperTypes().add(this.getCursoElement());
		atributoEClass.getESuperTypes().add(this.getCursoElement());
		enlaceUsaBloqueEClass.getESuperTypes().add(this.getCursoElement());
		enlaceEsUnEClass.getESuperTypes().add(this.getCursoElement());
		enlaceUsaEClass.getESuperTypes().add(this.getCursoElement());
		actividadEClass.getESuperTypes().add(this.getCursoElement());
		actividadEspacioEClass.getESuperTypes().add(this.getCursoElement());
		tareaEClass.getESuperTypes().add(this.getActividadNodo());
		tareaEClass.getESuperTypes().add(this.getCursoElement());
		leccionEClass.getESuperTypes().add(this.getActividadNodo());
		leccionEClass.getESuperTypes().add(this.getCursoElement());
		pruebaEClass.getESuperTypes().add(this.getActividadNodo());
		pruebaEClass.getESuperTypes().add(this.getCursoElement());
		actividadNodoInicialEClass.getESuperTypes()
				.add(this.getActividadNodo());
		actividadNodoInicialEClass.getESuperTypes().add(this.getCursoElement());
		actividadNodoFinalEClass.getESuperTypes().add(this.getActividadNodo());
		actividadNodoFinalEClass.getESuperTypes().add(this.getCursoElement());
		actividadEnlaceEClass.getESuperTypes().add(this.getCursoElement());
		actividadUnionBifurcacionEClass.getESuperTypes().add(
				this.getActividadNodo());
		actividadUnionBifurcacionEClass.getESuperTypes().add(
				this.getCursoElement());
		archivoAdjuntoEClass.getESuperTypes().add(this.getCursoElement());
		miRelativeBendpointsEClass.getESuperTypes().add(
				theNotationPackage.getRelativeBendpoints());
		miRelativeBendpointsEClass.getESuperTypes().add(
				theModelPackage_1.getNonDomainElement());

		// Initialize classes and features; add operations and parameters
		initEClass(cursoElementEClass, CursoElement.class, "CursoElement",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cursoEClass, Curso.class, "Curso", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCurso_Diagramas(), this.getCursoDiagrama(), null,
				"diagramas", null, 0, -1, Curso.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurso_Propiedades(), this.getPropiedadCurso(), null,
				"propiedades", null, 1, 1, Curso.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propiedadCursoEClass, PropiedadCurso.class,
				"PropiedadCurso", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropiedadCurso_Bibliografia(),
				ecorePackage.getEString(), "bibliografia", "", 0, 1,
				PropiedadCurso.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPropiedadCurso_RequisitosPrevios(),
				ecorePackage.getEString(), "requisitosPrevios", "", 0, 1,
				PropiedadCurso.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPropiedadCurso_Competencias(),
				ecorePackage.getEString(), "competencias", "", 0, 1,
				PropiedadCurso.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPropiedadCurso_SistemaEvaluacion(),
				ecorePackage.getEString(), "sistemaEvaluacion", "", 0, 1,
				PropiedadCurso.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPropiedadCurso_Asignatura(),
				ecorePackage.getEString(), "asignatura", "", 0, 1,
				PropiedadCurso.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPropiedadCurso_Area(), ecorePackage.getEString(),
				"area", "", 0, 1, PropiedadCurso.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropiedadCurso_Oferta(), ecorePackage.getEString(),
				"oferta", "", 0, 1, PropiedadCurso.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropiedadCurso_Semestre(), ecorePackage.getEString(),
				"semestre", "", 0, 1, PropiedadCurso.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropiedadCurso_Creditos(), ecorePackage.getEString(),
				"creditos", "", 0, 1, PropiedadCurso.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropiedadCurso_Horas_grp_gra(),
				ecorePackage.getEString(), "horas_grp_gra", "", 0, 1,
				PropiedadCurso.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPropiedadCurso_Horas_grp_red(),
				ecorePackage.getEString(), "horas_grp_red", "", 0, 1,
				PropiedadCurso.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPropiedadCurso_Coordinador(),
				ecorePackage.getEString(), "coordinador", "", 0, 1,
				PropiedadCurso.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(cursoDiagramaEClass, CursoDiagrama.class, "CursoDiagrama",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCursoDiagrama_Gmfdiagram(),
				theNotationPackage.getDiagram(), null, "gmfdiagram", null, 0,
				1, CursoDiagrama.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCursoDiagrama_Actividades(), this.getActividad(),
				null, "actividades", null, 0, -1, CursoDiagrama.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCursoDiagrama_Temas(), this.getTema(), null, "temas",
				null, 0, -1, CursoDiagrama.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCursoDiagrama_EnlacesActividad(),
				this.getActividadEnlace(), null, "enlacesActividad", null, 0,
				-1, CursoDiagrama.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCursoDiagrama_EnlacesUsaBloque(),
				this.getEnlaceUsaBloque(), null, "enlacesUsaBloque", null, 0,
				-1, CursoDiagrama.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCursoDiagrama_EnlaceUsa(), this.getEnlaceUsa(), null,
				"enlaceUsa", null, 0, -1, CursoDiagrama.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCursoDiagrama_EnlacesEsUn(), this.getEnlaceEsUn(),
				null, "enlacesEsUn", null, 0, -1, CursoDiagrama.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCursoDiagrama_Unionesbifurcaciones(),
				this.getActividadUnionBifurcacion(), null,
				"unionesbifurcaciones", null, 0, -1, CursoDiagrama.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(actividadDiagramaEClass, ActividadDiagrama.class,
				"ActividadDiagrama", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActividadDiagrama_ElementoNodoFinal(),
				this.getActividadNodoFinal(), null, "elementoNodoFinal", null,
				1, 1, ActividadDiagrama.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActividadDiagrama_ElementoNodoInicial(),
				this.getActividadNodoInicial(), null, "elementoNodoInicial",
				null, 1, 1, ActividadDiagrama.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conceptosDiagramaEClass, ConceptosDiagrama.class,
				"ConceptosDiagrama", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(temaEClass, Tema.class, "Tema", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTema_Nombre(), ecorePackage.getEString(), "nombre",
				null, 1, 1, Tema.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTema_Anotaciones(), ecorePackage.getEString(),
				"anotaciones", null, 0, 1, Tema.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTema_Conceptos(), this.getConcepto(), null,
				"conceptos", null, 0, -1, Tema.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conceptoEClass, Concepto.class, "Concepto", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConcepto_Nombre(), ecorePackage.getEString(),
				"nombre", null, 1, 1, Concepto.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcepto_Anotaciones(), ecorePackage.getEString(),
				"anotaciones", null, 0, 1, Concepto.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getConcepto_Atributos(), this.getAtributo(), null,
				"atributos", null, 0, -1, Concepto.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atributoEClass, Atributo.class, "Atributo", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtributo_Nombre(), ecorePackage.getEString(),
				"nombre", null, 1, 1, Atributo.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(enlaceUsaBloqueEClass, EnlaceUsaBloque.class,
				"EnlaceUsaBloque", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnlaceUsaBloque_Etiqueta(),
				ecorePackage.getEString(), "etiqueta", null, 0, 1,
				EnlaceUsaBloque.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getEnlaceUsaBloque_Origen(), this.getTema(), null,
				"origen", null, 1, 1, EnlaceUsaBloque.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnlaceUsaBloque_Destino(), this.getTema(), null,
				"destino", null, 1, 1, EnlaceUsaBloque.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enlaceEsUnEClass, EnlaceEsUn.class, "EnlaceEsUn",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnlaceEsUn_Etiqueta(), ecorePackage.getEString(),
				"etiqueta", null, 0, 1, EnlaceEsUn.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEnlaceEsUn_Origen(), this.getConcepto(), null,
				"origen", null, 1, 1, EnlaceEsUn.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnlaceEsUn_Destino(), this.getConcepto(), null,
				"destino", null, 1, 1, EnlaceEsUn.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enlaceUsaEClass, EnlaceUsa.class, "EnlaceUsa", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnlaceUsa_Etiqueta(), ecorePackage.getEString(),
				"etiqueta", null, 0, 1, EnlaceUsa.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEnlaceUsa_Origen(), this.getConcepto(), null,
				"origen", null, 1, 1, EnlaceUsa.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnlaceUsa_Destino(), this.getConcepto(), null,
				"destino", null, 1, 1, EnlaceUsa.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actividadEClass, Actividad.class, "Actividad", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActividad_Nombre(), ecorePackage.getEString(),
				"nombre", null, 1, 1, Actividad.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getActividad_Bloque(), this.getBloque(), "bloque", null,
				0, 1, Actividad.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getActividad_Espacios(), this.getActividadEspacio(),
				null, "espacios", null, 0, -1, Actividad.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actividadEspacioEClass, ActividadEspacio.class,
				"ActividadEspacio", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActividadEspacio_Nombre(), ecorePackage.getEString(),
				"nombre", null, 1, 1, ActividadEspacio.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getActividadEspacio_Tareas(), this.getTarea(), null,
				"tareas", null, 0, -1, ActividadEspacio.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActividadEspacio_Lecciones(), this.getLeccion(),
				null, "lecciones", null, 0, -1, ActividadEspacio.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getActividadEspacio_Pruebas(), this.getPrueba(), null,
				"pruebas", null, 0, -1, ActividadEspacio.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tareaEClass, Tarea.class, "Tarea", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTarea_Nombre(), ecorePackage.getEString(), "nombre",
				null, 1, 1, Tarea.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTarea_Tipo(), ecorePackage.getEString(), "tipo",
				null, 0, 1, Tarea.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTarea_PorcentajeNota(), ecorePackage.getEFloat(),
				"porcentajeNota", null, 0, 1, Tarea.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarea_Duracion(), ecorePackage.getEFloat(),
				"duracion", null, 0, 1, Tarea.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTarea_Contenidos(), this.getArchivoAdjunto(), null,
				"contenidos", null, 0, 1, Tarea.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(tareaEClass, ecorePackage.getEBoolean(),
				"EnlacesCompletos", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(leccionEClass, Leccion.class, "Leccion", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLeccion_Nombre(), ecorePackage.getEString(),
				"nombre", null, 1, 1, Leccion.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLeccion_Profesor(), ecorePackage.getEString(),
				"profesor", null, 0, 1, Leccion.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLeccion_PorcentajeNota(), ecorePackage.getEFloat(),
				"porcentajeNota", null, 0, 1, Leccion.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLeccion_Duracion(), ecorePackage.getEFloat(),
				"duracion", null, 0, 1, Leccion.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getLeccion_Contenidos(), this.getArchivoAdjunto(), null,
				"contenidos", null, 0, 1, Leccion.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(leccionEClass, ecorePackage.getEBoolean(),
				"EnlacesCompletos", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pruebaEClass, Prueba.class, "Prueba", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrueba_Nombre(), ecorePackage.getEString(), "nombre",
				null, 1, 1, Prueba.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPrueba_Tipo(), ecorePackage.getEString(), "tipo",
				null, 0, 1, Prueba.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPrueba_PorcentajeNota(), ecorePackage.getEFloat(),
				"porcentajeNota", null, 0, 1, Prueba.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrueba_Duracion(), ecorePackage.getEFloat(),
				"duracion", null, 0, 1, Prueba.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = addEOperation(pruebaEClass, ecorePackage.getEBoolean(),
				"EnlacesCompletos", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actividadNodoInicialEClass, ActividadNodoInicial.class,
				"ActividadNodoInicial", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(actividadNodoFinalEClass, ActividadNodoFinal.class,
				"ActividadNodoFinal", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(actividadEnlaceEClass, ActividadEnlace.class,
				"ActividadEnlace", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActividadEnlace_Etiqueta(),
				ecorePackage.getEString(), "etiqueta", null, 0, 1,
				ActividadEnlace.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getActividadEnlace_Origen(), this.getActividadNodo(),
				null, "origen", null, 1, 1, ActividadEnlace.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getActividadEnlace_Destino(), this.getActividadNodo(),
				null, "destino", null, 1, 1, ActividadEnlace.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(actividadUnionBifurcacionEClass,
				ActividadUnionBifurcacion.class, "ActividadUnionBifurcacion",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actividadNodoEClass, ActividadNodo.class, "ActividadNodo",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(archivoAdjuntoEClass, ArchivoAdjunto.class,
				"ArchivoAdjunto", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArchivoAdjunto_Nombre(), ecorePackage.getEString(),
				"nombre", null, 0, 1, ArchivoAdjunto.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchivoAdjunto_FileId(), ecorePackage.getEString(),
				"fileId", null, 0, 1, ArchivoAdjunto.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(miRelativeBendpointsEClass, MiRelativeBendpoints.class,
				"MiRelativeBendpoints", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(bloqueEEnum, Bloque.class, "Bloque");
		addEEnumLiteral(bloqueEEnum, Bloque.EMPTY);

		// Initialize data types
		initEDataType(miRelativeBendpointEDataType, MiRelativeBendpoint.class,
				"MiRelativeBendpoint", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation(this, source, new String[] { "ecore",
				"http://www.eclipse.org/emf/2002/Ecore#/" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source, new String[] { "invocationDelegates",
				"http://www.eclipse.org/emf/2002/Ecore/OCL",
				"settingDelegates",
				"http://www.eclipse.org/emf/2002/Ecore/OCL",
				"validationDelegates",
				"http://www.eclipse.org/emf/2002/Ecore/OCL" });
		addAnnotation(
				actividadDiagramaEClass,
				source,
				new String[] {
						"constraints",
						"NombreDuplicadoActividad NombreDuplicadoEspacio NombreDuplicadoTarea NombreDuplicadoPrueba NombreDuplicadoLeccion" });
		addAnnotation(conceptosDiagramaEClass, source, new String[] {
				"constraints",
				"NombreDuplicadoConcepto NombreDuplicadoCaracter\u00edstica" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";
		addAnnotation(
				actividadDiagramaEClass,
				source,
				new String[] {
						"NombreDuplicadoActividad",
						"self.actividades->select(nombre<>null)->isUnique(nombre)",
						"NombreDuplicadoEspacio",
						"self.actividades.espacios->select(nombre<>null)->isUnique(nombre)",
						"NombreDuplicadoTarea",
						"self.actividades.espacios.tareas->select(nombre<>null)->isUnique(nombre)",
						"NombreDuplicadoPrueba",
						"self.actividades.espacios.pruebas->select(nombre<>null)->isUnique(nombre)",
						"NombreDuplicadoLeccion",
						"self.actividades.espacios.lecciones->select(nombre<>null)->isUnique(nombre)" });
		addAnnotation(
				conceptosDiagramaEClass,
				source,
				new String[] {
						"NombreDuplicadoConcepto",
						"self.temas.conceptos->select(nombre<>null)->isUnique(nombre)",
						"NombreDuplicadoCaracter\u00edstica",
						"self.temas.conceptos.atributos->select(nombre<>null)->isUnique(nombre)" });
		addAnnotation(
				tareaEClass.getEOperations().get(0),
				source,
				new String[] {
						"body",
						"ActividadEnlace.allInstances()->exists(v1,v2|v1.origen=self and v2.destino=self)" });
		addAnnotation(
				leccionEClass.getEOperations().get(0),
				source,
				new String[] {
						"body",
						"ActividadEnlace.allInstances()->exists(v1,v2|v1.origen=self and v2.destino=self)" });
		addAnnotation(
				pruebaEClass.getEOperations().get(0),
				source,
				new String[] {
						"body",
						"ActividadEnlace.allInstances()->exists(v1,v2|v1.origen=self and v2.destino=self)" });
	}

	 /**
	   * Adds a Bloque element to the list of bloques used for filling the Bloque
	   * property in properties view of Activity diagrams.
	   * 
	   * @return true if the 'Bloque' has been added, false otherwise (it is not
	   *         added if a 'Bloque' with the same name already exists).
	   * @generated NOT
	   */
	  public boolean addBloque(String name, String literal)
	  {
	    if (Bloque.getByName(name) == null)
	    {
	      // If there is not any 'Bloque' with this name, create it
	      Bloque newBloque = Bloque.createNewBloque(name, literal);
	      addEEnumLiteral(bloqueEEnum, newBloque);
	      return true;
	    }

	    return false;
	  }

	  /**
	   * Removes a Bloque element from the list of bloques used for filling the
	   * Bloque property in properties view of Activity diagrams.
	   * 
	   * @generated NOT
	   */
	  public void removeBloque(String name, String literal)// EEnum owner,
	                                                       // Enumerator e)
	  {
	    EList<EEnumLiteral> ownerLiterals = bloqueEEnum.getELiterals();
	    boolean removed = false;
	    int count = 0;

	    // Remove the 'Bloque' element
	    Bloque.removeBloque(name);

	    // Remove it from the list of literals
	    for (; !removed && count < ownerLiterals.size(); count++)
	    {
	      EEnumLiteral element = ownerLiterals.get(count);
	      if (name.equals(element.getName())
	          && literal.equals(element.getLiteral()))
	      {
	        ownerLiterals.remove(count);
	        removed = true;
	      }
	    }

	    count--;

	    // Update the value of the rest of elements
	    if (removed)
	    {
	      for (; count < ownerLiterals.size(); count++)
	      {
	        Bloque bloque = Bloque.get(count);
	        EEnumLiteralImpl l = (EEnumLiteralImpl) ecoreFactory
	            .createEEnumLiteral();
	        l.setInstance(bloque);
	        l.setGeneratedInstance(true);
	        ownerLiterals.set(count, l);
	      }
	    }
	  }

	  /**
	   * Removes all Bloque elements from the list of bloques used for filling the
	   * Bloque property in properties view of Activity diagrams.
	   * 
	   * @generated NOT
	   */
	  public void removeAllBloques()
	  {
	    // Remove the 'Bloque' elements
	    Bloque.removeAllBloques();

	    // Remove them from the list of literals
	    EList<EEnumLiteral> ownerLiterals = bloqueEEnum.getELiterals();
	    for (int i = ownerLiterals.size() - 1; i > 0; i--)
	    {
	      ownerLiterals.remove(i);
	    }
	  }

	  public boolean changeBloqueName(String oldName, String newName)
	  {
	    if (Bloque.getByName(newName) != null)
	    {
	      // If a 'Bloque' with the same name already exist, don't do anything
	      return false;
	    }

	    EList<EEnumLiteral> ownerLiterals = bloqueEEnum.getELiterals();

	    int value = -1;

	    // Get the value of the element
	    for (int i = 0; i < ownerLiterals.size(); i++)
	    {
	      EEnumLiteral element = ownerLiterals.get(i);
	      if (oldName.equals(element.getName()))
	      {
	        value = element.getValue();
	        break;
	      }
	    }

	    // Change it in the 'Bloque' array of values
	    Bloque bloque = Bloque.changeBloqueNameAndLiteral(value, newName, newName);

	    // Change it in the list of literals
	    EEnumLiteralImpl l = (EEnumLiteralImpl) ecoreFactory.createEEnumLiteral();
	    l.setInstance(bloque);
	    l.setGeneratedInstance(true);
	    ownerLiterals.set(value, l);

	    return true;
	  }
} //ModelPackageImpl
