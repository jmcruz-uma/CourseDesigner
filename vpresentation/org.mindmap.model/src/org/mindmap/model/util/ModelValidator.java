/**
 */
package org.mindmap.model.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.mindmap.model.*;
import org.mindmap.model.impl.MiRelativeBendpoint;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.mindmap.model.ModelPackage
 * @generated
 */
public class ModelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ModelValidator INSTANCE = new ModelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.mindmap.model";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Enlaces Completos' of 'Tarea'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TAREA__ENLACES_COMPLETOS = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Enlaces Completos' of 'Leccion'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LECCION__ENLACES_COMPLETOS = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Enlaces Completos' of 'Prueba'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRUEBA__ENLACES_COMPLETOS = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Delegates evaluation of the given invariant expression against the object in the given context.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static boolean validate(EClass eClass, EObject eObject,
			DiagnosticChain diagnostics, Map<Object, Object> context,
			String validationDelegate, EOperation invariant, String expression,
			int severity, String source, int code) {
		return EObjectValidator.validate(eClass, eObject, diagnostics, context,
				validationDelegate, invariant, expression, severity, source,
				code);
	}

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return ModelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
		case ModelPackage.CURSO_ELEMENT:
			return validateCursoElement((CursoElement) value, diagnostics,
					context);
		case ModelPackage.CURSO:
			return validateCurso((Curso) value, diagnostics, context);
		case ModelPackage.PROPIEDAD_CURSO:
			return validatePropiedadCurso((PropiedadCurso) value, diagnostics,
					context);
		case ModelPackage.CURSO_DIAGRAMA:
			return validateCursoDiagrama((CursoDiagrama) value, diagnostics,
					context);
		case ModelPackage.ACTIVIDAD_DIAGRAMA:
			return validateActividadDiagrama((ActividadDiagrama) value,
					diagnostics, context);
		case ModelPackage.CONCEPTOS_DIAGRAMA:
			return validateConceptosDiagrama((ConceptosDiagrama) value,
					diagnostics, context);
		case ModelPackage.TEMA:
			return validateTema((Tema) value, diagnostics, context);
		case ModelPackage.CONCEPTO:
			return validateConcepto((Concepto) value, diagnostics, context);
		case ModelPackage.ATRIBUTO:
			return validateAtributo((Atributo) value, diagnostics, context);
		case ModelPackage.ENLACE_USA_BLOQUE:
			return validateEnlaceUsaBloque((EnlaceUsaBloque) value,
					diagnostics, context);
		case ModelPackage.ENLACE_ES_UN:
			return validateEnlaceEsUn((EnlaceEsUn) value, diagnostics, context);
		case ModelPackage.ENLACE_USA:
			return validateEnlaceUsa((EnlaceUsa) value, diagnostics, context);
		case ModelPackage.ACTIVIDAD:
			return validateActividad((Actividad) value, diagnostics, context);
		case ModelPackage.ACTIVIDAD_ESPACIO:
			return validateActividadEspacio((ActividadEspacio) value,
					diagnostics, context);
		case ModelPackage.TAREA:
			return validateTarea((Tarea) value, diagnostics, context);
		case ModelPackage.LECCION:
			return validateLeccion((Leccion) value, diagnostics, context);
		case ModelPackage.PRUEBA:
			return validatePrueba((Prueba) value, diagnostics, context);
		case ModelPackage.ACTIVIDAD_NODO_INICIAL:
			return validateActividadNodoInicial((ActividadNodoInicial) value,
					diagnostics, context);
		case ModelPackage.ACTIVIDAD_NODO_FINAL:
			return validateActividadNodoFinal((ActividadNodoFinal) value,
					diagnostics, context);
		case ModelPackage.ACTIVIDAD_ENLACE:
			return validateActividadEnlace((ActividadEnlace) value,
					diagnostics, context);
		case ModelPackage.ACTIVIDAD_UNION_BIFURCACION:
			return validateActividadUnionBifurcacion(
					(ActividadUnionBifurcacion) value, diagnostics, context);
		case ModelPackage.ACTIVIDAD_NODO:
			return validateActividadNodo((ActividadNodo) value, diagnostics,
					context);
		case ModelPackage.ARCHIVO_ADJUNTO:
			return validateArchivoAdjunto((ArchivoAdjunto) value, diagnostics,
					context);
		case ModelPackage.MI_RELATIVE_BENDPOINTS:
			return validateMiRelativeBendpoints((MiRelativeBendpoints) value,
					diagnostics, context);
		case ModelPackage.BLOQUE:
			return validateBloque((Bloque) value, diagnostics, context);
		case ModelPackage.MI_RELATIVE_BENDPOINT:
			return validateMiRelativeBendpoint((MiRelativeBendpoint) value,
					diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCursoElement(CursoElement cursoElement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cursoElement, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurso(Curso curso, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(curso, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropiedadCurso(PropiedadCurso propiedadCurso,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propiedadCurso, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCursoDiagrama(CursoDiagrama cursoDiagrama,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cursoDiagrama, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActividadDiagrama(
			ActividadDiagrama actividadDiagrama, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(actividadDiagrama, diagnostics,
				context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(actividadDiagrama,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(actividadDiagrama,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(actividadDiagrama,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(
					actividadDiagrama, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(actividadDiagrama,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(actividadDiagrama, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(actividadDiagrama, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(actividadDiagrama,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validateActividadDiagrama_NombreDuplicadoActividad(
					actividadDiagrama, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateActividadDiagrama_NombreDuplicadoEspacio(
					actividadDiagrama, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateActividadDiagrama_NombreDuplicadoTarea(
					actividadDiagrama, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateActividadDiagrama_NombreDuplicadoPrueba(
					actividadDiagrama, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateActividadDiagrama_NombreDuplicadoLeccion(
					actividadDiagrama, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NombreDuplicadoActividad constraint of '<em>Actividad Diagrama</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTIVIDAD_DIAGRAMA__NOMBRE_DUPLICADO_ACTIVIDAD__EEXPRESSION = "self.actividades->select(nombre<>null)->isUnique(nombre)";

	/**
	 * Validates the NombreDuplicadoActividad constraint of '<em>Actividad Diagrama</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActividadDiagrama_NombreDuplicadoActividad(
			ActividadDiagrama actividadDiagrama, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(ModelPackage.Literals.ACTIVIDAD_DIAGRAMA,
				actividadDiagrama, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL",
				"NombreDuplicadoActividad",
				ACTIVIDAD_DIAGRAMA__NOMBRE_DUPLICADO_ACTIVIDAD__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the NombreDuplicadoEspacio constraint of '<em>Actividad Diagrama</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTIVIDAD_DIAGRAMA__NOMBRE_DUPLICADO_ESPACIO__EEXPRESSION = "self.actividades.espacios->select(nombre<>null)->isUnique(nombre)";

	/**
	 * Validates the NombreDuplicadoEspacio constraint of '<em>Actividad Diagrama</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActividadDiagrama_NombreDuplicadoEspacio(
			ActividadDiagrama actividadDiagrama, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(ModelPackage.Literals.ACTIVIDAD_DIAGRAMA,
				actividadDiagrama, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL",
				"NombreDuplicadoEspacio",
				ACTIVIDAD_DIAGRAMA__NOMBRE_DUPLICADO_ESPACIO__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the NombreDuplicadoTarea constraint of '<em>Actividad Diagrama</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTIVIDAD_DIAGRAMA__NOMBRE_DUPLICADO_TAREA__EEXPRESSION = "self.actividades.espacios.tareas->select(nombre<>null)->isUnique(nombre)";

	/**
	 * Validates the NombreDuplicadoTarea constraint of '<em>Actividad Diagrama</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActividadDiagrama_NombreDuplicadoTarea(
			ActividadDiagrama actividadDiagrama, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(ModelPackage.Literals.ACTIVIDAD_DIAGRAMA,
				actividadDiagrama, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL",
				"NombreDuplicadoTarea",
				ACTIVIDAD_DIAGRAMA__NOMBRE_DUPLICADO_TAREA__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the NombreDuplicadoPrueba constraint of '<em>Actividad Diagrama</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTIVIDAD_DIAGRAMA__NOMBRE_DUPLICADO_PRUEBA__EEXPRESSION = "self.actividades.espacios.pruebas->select(nombre<>null)->isUnique(nombre)";

	/**
	 * Validates the NombreDuplicadoPrueba constraint of '<em>Actividad Diagrama</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActividadDiagrama_NombreDuplicadoPrueba(
			ActividadDiagrama actividadDiagrama, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(ModelPackage.Literals.ACTIVIDAD_DIAGRAMA,
				actividadDiagrama, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL",
				"NombreDuplicadoPrueba",
				ACTIVIDAD_DIAGRAMA__NOMBRE_DUPLICADO_PRUEBA__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the NombreDuplicadoLeccion constraint of '<em>Actividad Diagrama</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTIVIDAD_DIAGRAMA__NOMBRE_DUPLICADO_LECCION__EEXPRESSION = "self.actividades.espacios.lecciones->select(nombre<>null)->isUnique(nombre)";

	/**
	 * Validates the NombreDuplicadoLeccion constraint of '<em>Actividad Diagrama</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActividadDiagrama_NombreDuplicadoLeccion(
			ActividadDiagrama actividadDiagrama, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(ModelPackage.Literals.ACTIVIDAD_DIAGRAMA,
				actividadDiagrama, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL",
				"NombreDuplicadoLeccion",
				ACTIVIDAD_DIAGRAMA__NOMBRE_DUPLICADO_LECCION__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptosDiagrama(
			ConceptosDiagrama conceptosDiagrama, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(conceptosDiagrama, diagnostics,
				context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(conceptosDiagrama,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(conceptosDiagrama,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(conceptosDiagrama,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(
					conceptosDiagrama, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(conceptosDiagrama,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(conceptosDiagrama, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(conceptosDiagrama, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(conceptosDiagrama,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConceptosDiagrama_NombreDuplicadoConcepto(
					conceptosDiagrama, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConceptosDiagrama_NombreDuplicadoCaracterística(
					conceptosDiagrama, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NombreDuplicadoConcepto constraint of '<em>Conceptos Diagrama</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONCEPTOS_DIAGRAMA__NOMBRE_DUPLICADO_CONCEPTO__EEXPRESSION = "self.temas.conceptos->select(nombre<>null)->isUnique(nombre)";

	/**
	 * Validates the NombreDuplicadoConcepto constraint of '<em>Conceptos Diagrama</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptosDiagrama_NombreDuplicadoConcepto(
			ConceptosDiagrama conceptosDiagrama, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(ModelPackage.Literals.CONCEPTOS_DIAGRAMA,
				conceptosDiagrama, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL",
				"NombreDuplicadoConcepto",
				CONCEPTOS_DIAGRAMA__NOMBRE_DUPLICADO_CONCEPTO__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the NombreDuplicadoCaracterística constraint of '<em>Conceptos Diagrama</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONCEPTOS_DIAGRAMA__NOMBRE_DUPLICADO_CARACTERÍSTICA__EEXPRESSION = "self.temas.conceptos.atributos->select(nombre<>null)->isUnique(nombre)";

	/**
	 * Validates the NombreDuplicadoCaracterística constraint of '<em>Conceptos Diagrama</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptosDiagrama_NombreDuplicadoCaracterística(
			ConceptosDiagrama conceptosDiagrama, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(
				ModelPackage.Literals.CONCEPTOS_DIAGRAMA,
				conceptosDiagrama,
				diagnostics,
				context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL",
				"NombreDuplicadoCaracterística",
				CONCEPTOS_DIAGRAMA__NOMBRE_DUPLICADO_CARACTERÍSTICA__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTema(Tema tema, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tema, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcepto(Concepto concepto,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(concepto, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtributo(Atributo atributo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(atributo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnlaceUsaBloque(EnlaceUsaBloque enlaceUsaBloque,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enlaceUsaBloque, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnlaceEsUn(EnlaceEsUn enlaceEsUn,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enlaceEsUn, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnlaceUsa(EnlaceUsa enlaceUsa,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enlaceUsa, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActividad(Actividad actividad,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actividad, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActividadEspacio(ActividadEspacio actividadEspacio,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actividadEspacio, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTarea(Tarea tarea, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tarea, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(tarea, diagnostics,
				context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(tarea, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(tarea, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(tarea,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(tarea, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(tarea, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(tarea, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(tarea, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTarea_EnlacesCompletos(tarea, diagnostics,
					context);
		return result;
	}

	/**
	 * Validates the EnlacesCompletos constraint of '<em>Tarea</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTarea_EnlacesCompletos(Tarea tarea,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tarea.EnlacesCompletos(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeccion(Leccion leccion,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(leccion, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(leccion,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(leccion, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(leccion, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(leccion,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(leccion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(leccion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(leccion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(leccion, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateLeccion_EnlacesCompletos(leccion, diagnostics,
					context);
		return result;
	}

	/**
	 * Validates the EnlacesCompletos constraint of '<em>Leccion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeccion_EnlacesCompletos(Leccion leccion,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return leccion.EnlacesCompletos(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrueba(Prueba prueba, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(prueba, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(prueba,
				diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(prueba, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(prueba, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(prueba,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(prueba, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(prueba, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(prueba, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(prueba, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePrueba_EnlacesCompletos(prueba, diagnostics,
					context);
		return result;
	}

	/**
	 * Validates the EnlacesCompletos constraint of '<em>Prueba</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrueba_EnlacesCompletos(Prueba prueba,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return prueba.EnlacesCompletos(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActividadNodoInicial(
			ActividadNodoInicial actividadNodoInicial,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actividadNodoInicial,
				diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActividadNodoFinal(
			ActividadNodoFinal actividadNodoFinal, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actividadNodoFinal, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActividadEnlace(ActividadEnlace actividadEnlace,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actividadEnlace, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActividadUnionBifurcacion(
			ActividadUnionBifurcacion actividadUnionBifurcacion,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actividadUnionBifurcacion,
				diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActividadNodo(ActividadNodo actividadNodo,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actividadNodo, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchivoAdjunto(ArchivoAdjunto archivoAdjunto,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(archivoAdjunto, diagnostics,
				context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMiRelativeBendpoints(
			MiRelativeBendpoints miRelativeBendpoints,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(miRelativeBendpoints,
				diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBloque(Bloque bloque, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMiRelativeBendpoint(
			MiRelativeBendpoint miRelativeBendpoint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
		
	}

} //ModelValidator
