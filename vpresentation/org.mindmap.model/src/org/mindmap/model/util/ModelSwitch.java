/**
 */
package org.mindmap.model.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.emf.emfstore.internal.common.model.NonDomainElement;

import org.eclipse.gmf.runtime.notation.Bendpoints;
import org.eclipse.gmf.runtime.notation.RelativeBendpoints;

import org.mindmap.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.mindmap.model.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ModelPackage.CURSO_ELEMENT: {
			CursoElement cursoElement = (CursoElement) theEObject;
			T result = caseCursoElement(cursoElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.CURSO: {
			Curso curso = (Curso) theEObject;
			T result = caseCurso(curso);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.PROPIEDAD_CURSO: {
			PropiedadCurso propiedadCurso = (PropiedadCurso) theEObject;
			T result = casePropiedadCurso(propiedadCurso);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.CURSO_DIAGRAMA: {
			CursoDiagrama cursoDiagrama = (CursoDiagrama) theEObject;
			T result = caseCursoDiagrama(cursoDiagrama);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.ACTIVIDAD_DIAGRAMA: {
			ActividadDiagrama actividadDiagrama = (ActividadDiagrama) theEObject;
			T result = caseActividadDiagrama(actividadDiagrama);
			if (result == null)
				result = caseCursoDiagrama(actividadDiagrama);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.CONCEPTOS_DIAGRAMA: {
			ConceptosDiagrama conceptosDiagrama = (ConceptosDiagrama) theEObject;
			T result = caseConceptosDiagrama(conceptosDiagrama);
			if (result == null)
				result = caseCursoDiagrama(conceptosDiagrama);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.TEMA: {
			Tema tema = (Tema) theEObject;
			T result = caseTema(tema);
			if (result == null)
				result = caseCursoElement(tema);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.CONCEPTO: {
			Concepto concepto = (Concepto) theEObject;
			T result = caseConcepto(concepto);
			if (result == null)
				result = caseCursoElement(concepto);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.ATRIBUTO: {
			Atributo atributo = (Atributo) theEObject;
			T result = caseAtributo(atributo);
			if (result == null)
				result = caseCursoElement(atributo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.ENLACE_USA_BLOQUE: {
			EnlaceUsaBloque enlaceUsaBloque = (EnlaceUsaBloque) theEObject;
			T result = caseEnlaceUsaBloque(enlaceUsaBloque);
			if (result == null)
				result = caseCursoElement(enlaceUsaBloque);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.ENLACE_ES_UN: {
			EnlaceEsUn enlaceEsUn = (EnlaceEsUn) theEObject;
			T result = caseEnlaceEsUn(enlaceEsUn);
			if (result == null)
				result = caseCursoElement(enlaceEsUn);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.ENLACE_USA: {
			EnlaceUsa enlaceUsa = (EnlaceUsa) theEObject;
			T result = caseEnlaceUsa(enlaceUsa);
			if (result == null)
				result = caseCursoElement(enlaceUsa);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.ACTIVIDAD: {
			Actividad actividad = (Actividad) theEObject;
			T result = caseActividad(actividad);
			if (result == null)
				result = caseCursoElement(actividad);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.ACTIVIDAD_ESPACIO: {
			ActividadEspacio actividadEspacio = (ActividadEspacio) theEObject;
			T result = caseActividadEspacio(actividadEspacio);
			if (result == null)
				result = caseCursoElement(actividadEspacio);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.TAREA: {
			Tarea tarea = (Tarea) theEObject;
			T result = caseTarea(tarea);
			if (result == null)
				result = caseActividadNodo(tarea);
			if (result == null)
				result = caseCursoElement(tarea);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.LECCION: {
			Leccion leccion = (Leccion) theEObject;
			T result = caseLeccion(leccion);
			if (result == null)
				result = caseActividadNodo(leccion);
			if (result == null)
				result = caseCursoElement(leccion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.PRUEBA: {
			Prueba prueba = (Prueba) theEObject;
			T result = casePrueba(prueba);
			if (result == null)
				result = caseActividadNodo(prueba);
			if (result == null)
				result = caseCursoElement(prueba);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.ACTIVIDAD_NODO_INICIAL: {
			ActividadNodoInicial actividadNodoInicial = (ActividadNodoInicial) theEObject;
			T result = caseActividadNodoInicial(actividadNodoInicial);
			if (result == null)
				result = caseActividadNodo(actividadNodoInicial);
			if (result == null)
				result = caseCursoElement(actividadNodoInicial);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.ACTIVIDAD_NODO_FINAL: {
			ActividadNodoFinal actividadNodoFinal = (ActividadNodoFinal) theEObject;
			T result = caseActividadNodoFinal(actividadNodoFinal);
			if (result == null)
				result = caseActividadNodo(actividadNodoFinal);
			if (result == null)
				result = caseCursoElement(actividadNodoFinal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.ACTIVIDAD_ENLACE: {
			ActividadEnlace actividadEnlace = (ActividadEnlace) theEObject;
			T result = caseActividadEnlace(actividadEnlace);
			if (result == null)
				result = caseCursoElement(actividadEnlace);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.ACTIVIDAD_UNION_BIFURCACION: {
			ActividadUnionBifurcacion actividadUnionBifurcacion = (ActividadUnionBifurcacion) theEObject;
			T result = caseActividadUnionBifurcacion(actividadUnionBifurcacion);
			if (result == null)
				result = caseActividadNodo(actividadUnionBifurcacion);
			if (result == null)
				result = caseCursoElement(actividadUnionBifurcacion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.ACTIVIDAD_NODO: {
			ActividadNodo actividadNodo = (ActividadNodo) theEObject;
			T result = caseActividadNodo(actividadNodo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.ARCHIVO_ADJUNTO: {
			ArchivoAdjunto archivoAdjunto = (ArchivoAdjunto) theEObject;
			T result = caseArchivoAdjunto(archivoAdjunto);
			if (result == null)
				result = caseCursoElement(archivoAdjunto);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.MI_RELATIVE_BENDPOINTS: {
			MiRelativeBendpoints miRelativeBendpoints = (MiRelativeBendpoints) theEObject;
			T result = caseMiRelativeBendpoints(miRelativeBendpoints);
			if (result == null)
				result = caseRelativeBendpoints(miRelativeBendpoints);
			if (result == null)
				result = caseNonDomainElement(miRelativeBendpoints);
			if (result == null)
				result = caseBendpoints(miRelativeBendpoints);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Curso Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curso Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCursoElement(CursoElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Curso</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curso</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurso(Curso object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propiedad Curso</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propiedad Curso</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropiedadCurso(PropiedadCurso object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Curso Diagrama</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curso Diagrama</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCursoDiagrama(CursoDiagrama object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actividad Diagrama</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actividad Diagrama</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActividadDiagrama(ActividadDiagrama object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conceptos Diagrama</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conceptos Diagrama</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptosDiagrama(ConceptosDiagrama object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTema(Tema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concepto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concepto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcepto(Concepto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atributo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtributo(Atributo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enlace Usa Bloque</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enlace Usa Bloque</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnlaceUsaBloque(EnlaceUsaBloque object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enlace Es Un</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enlace Es Un</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnlaceEsUn(EnlaceEsUn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enlace Usa</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enlace Usa</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnlaceUsa(EnlaceUsa object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actividad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actividad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActividad(Actividad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actividad Espacio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actividad Espacio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActividadEspacio(ActividadEspacio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tarea</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tarea</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTarea(Tarea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leccion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leccion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeccion(Leccion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prueba</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prueba</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrueba(Prueba object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actividad Nodo Inicial</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actividad Nodo Inicial</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActividadNodoInicial(ActividadNodoInicial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actividad Nodo Final</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actividad Nodo Final</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActividadNodoFinal(ActividadNodoFinal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actividad Enlace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actividad Enlace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActividadEnlace(ActividadEnlace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actividad Union Bifurcacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actividad Union Bifurcacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActividadUnionBifurcacion(ActividadUnionBifurcacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actividad Nodo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actividad Nodo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActividadNodo(ActividadNodo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Archivo Adjunto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Archivo Adjunto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchivoAdjunto(ArchivoAdjunto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mi Relative Bendpoints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mi Relative Bendpoints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMiRelativeBendpoints(MiRelativeBendpoints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bendpoints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bendpoints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBendpoints(Bendpoints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Bendpoints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Bendpoints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativeBendpoints(RelativeBendpoints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Domain Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Domain Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonDomainElement(NonDomainElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ModelSwitch
