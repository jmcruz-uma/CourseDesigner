/**
 */
package org.mindmap.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.mindmap.model.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(ModelPackage.eNS_URI);
			if (theModelFactory != null) {
				return theModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ModelPackage.CURSO:
			return createCurso();
		case ModelPackage.PROPIEDAD_CURSO:
			return createPropiedadCurso();
		case ModelPackage.ACTIVIDAD_DIAGRAMA:
			return createActividadDiagrama();
		case ModelPackage.CONCEPTOS_DIAGRAMA:
			return createConceptosDiagrama();
		case ModelPackage.TEMA:
			return createTema();
		case ModelPackage.CONCEPTO:
			return createConcepto();
		case ModelPackage.ATRIBUTO:
			return createAtributo();
		case ModelPackage.ENLACE_USA_BLOQUE:
			return createEnlaceUsaBloque();
		case ModelPackage.ENLACE_ES_UN:
			return createEnlaceEsUn();
		case ModelPackage.ENLACE_USA:
			return createEnlaceUsa();
		case ModelPackage.ACTIVIDAD:
			return createActividad();
		case ModelPackage.ACTIVIDAD_ESPACIO:
			return createActividadEspacio();
		case ModelPackage.TAREA:
			return createTarea();
		case ModelPackage.LECCION:
			return createLeccion();
		case ModelPackage.PRUEBA:
			return createPrueba();
		case ModelPackage.ACTIVIDAD_NODO_INICIAL:
			return createActividadNodoInicial();
		case ModelPackage.ACTIVIDAD_NODO_FINAL:
			return createActividadNodoFinal();
		case ModelPackage.ACTIVIDAD_ENLACE:
			return createActividadEnlace();
		case ModelPackage.ACTIVIDAD_UNION_BIFURCACION:
			return createActividadUnionBifurcacion();
		case ModelPackage.ARCHIVO_ADJUNTO:
			return createArchivoAdjunto();
		case ModelPackage.MI_RELATIVE_BENDPOINTS:
			return createMiRelativeBendpoints();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ModelPackage.BLOQUE:
			return createBloqueFromString(eDataType, initialValue);
		case ModelPackage.MI_RELATIVE_BENDPOINT:
			return createMiRelativeBendpointFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case ModelPackage.BLOQUE:
			return convertBloqueToString(eDataType, instanceValue);
		case ModelPackage.MI_RELATIVE_BENDPOINT:
			return convertMiRelativeBendpointToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Curso createCurso() {
		CursoImpl curso = new CursoImpl();
		return curso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropiedadCurso createPropiedadCurso() {
		PropiedadCursoImpl propiedadCurso = new PropiedadCursoImpl();
		return propiedadCurso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActividadDiagrama createActividadDiagrama() {
		ActividadDiagramaImpl actividadDiagrama = new ActividadDiagramaImpl();
		return actividadDiagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptosDiagrama createConceptosDiagrama() {
		ConceptosDiagramaImpl conceptosDiagrama = new ConceptosDiagramaImpl();
		return conceptosDiagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tema createTema() {
		TemaImpl tema = new TemaImpl();
		return tema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concepto createConcepto() {
		ConceptoImpl concepto = new ConceptoImpl();
		return concepto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atributo createAtributo() {
		AtributoImpl atributo = new AtributoImpl();
		return atributo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnlaceUsaBloque createEnlaceUsaBloque() {
		EnlaceUsaBloqueImpl enlaceUsaBloque = new EnlaceUsaBloqueImpl();
		return enlaceUsaBloque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnlaceEsUn createEnlaceEsUn() {
		EnlaceEsUnImpl enlaceEsUn = new EnlaceEsUnImpl();
		return enlaceEsUn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnlaceUsa createEnlaceUsa() {
		EnlaceUsaImpl enlaceUsa = new EnlaceUsaImpl();
		return enlaceUsa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actividad createActividad() {
		ActividadImpl actividad = new ActividadImpl();
		return actividad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActividadEspacio createActividadEspacio() {
		ActividadEspacioImpl actividadEspacio = new ActividadEspacioImpl();
		return actividadEspacio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tarea createTarea() {
		TareaImpl tarea = new TareaImpl();
		return tarea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Leccion createLeccion() {
		LeccionImpl leccion = new LeccionImpl();
		return leccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prueba createPrueba() {
		PruebaImpl prueba = new PruebaImpl();
		return prueba;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActividadNodoInicial createActividadNodoInicial() {
		ActividadNodoInicialImpl actividadNodoInicial = new ActividadNodoInicialImpl();
		return actividadNodoInicial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActividadNodoFinal createActividadNodoFinal() {
		ActividadNodoFinalImpl actividadNodoFinal = new ActividadNodoFinalImpl();
		return actividadNodoFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActividadEnlace createActividadEnlace() {
		ActividadEnlaceImpl actividadEnlace = new ActividadEnlaceImpl();
		return actividadEnlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActividadUnionBifurcacion createActividadUnionBifurcacion() {
		ActividadUnionBifurcacionImpl actividadUnionBifurcacion = new ActividadUnionBifurcacionImpl();
		return actividadUnionBifurcacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchivoAdjunto createArchivoAdjunto() {
		ArchivoAdjuntoImpl archivoAdjunto = new ArchivoAdjuntoImpl();
		return archivoAdjunto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiRelativeBendpoints createMiRelativeBendpoints() {
		MiRelativeBendpointsImpl miRelativeBendpoints = new MiRelativeBendpointsImpl();
		return miRelativeBendpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bloque createBloqueFromString(EDataType eDataType,
			String initialValue) {
		Bloque result = Bloque.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBloqueToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiRelativeBendpoint createMiRelativeBendpointFromString(
			EDataType eDataType, String initialValue) {
		return (MiRelativeBendpoint) super.createFromString(eDataType,
				initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMiRelativeBendpointToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPackage getModelPackage() {
		return (ModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //ModelFactoryImpl
