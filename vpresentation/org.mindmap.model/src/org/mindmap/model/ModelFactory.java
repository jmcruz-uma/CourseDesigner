/**
 */
package org.mindmap.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.mindmap.model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = org.mindmap.model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Curso</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Curso</em>'.
	 * @generated
	 */
	Curso createCurso();

	/**
	 * Returns a new object of class '<em>Propiedad Curso</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Propiedad Curso</em>'.
	 * @generated
	 */
	PropiedadCurso createPropiedadCurso();

	/**
	 * Returns a new object of class '<em>Actividad Diagrama</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actividad Diagrama</em>'.
	 * @generated
	 */
	ActividadDiagrama createActividadDiagrama();

	/**
	 * Returns a new object of class '<em>Conceptos Diagrama</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conceptos Diagrama</em>'.
	 * @generated
	 */
	ConceptosDiagrama createConceptosDiagrama();

	/**
	 * Returns a new object of class '<em>Tema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tema</em>'.
	 * @generated
	 */
	Tema createTema();

	/**
	 * Returns a new object of class '<em>Concepto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concepto</em>'.
	 * @generated
	 */
	Concepto createConcepto();

	/**
	 * Returns a new object of class '<em>Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atributo</em>'.
	 * @generated
	 */
	Atributo createAtributo();

	/**
	 * Returns a new object of class '<em>Enlace Usa Bloque</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enlace Usa Bloque</em>'.
	 * @generated
	 */
	EnlaceUsaBloque createEnlaceUsaBloque();

	/**
	 * Returns a new object of class '<em>Enlace Es Un</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enlace Es Un</em>'.
	 * @generated
	 */
	EnlaceEsUn createEnlaceEsUn();

	/**
	 * Returns a new object of class '<em>Enlace Usa</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enlace Usa</em>'.
	 * @generated
	 */
	EnlaceUsa createEnlaceUsa();

	/**
	 * Returns a new object of class '<em>Actividad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actividad</em>'.
	 * @generated
	 */
	Actividad createActividad();

	/**
	 * Returns a new object of class '<em>Actividad Espacio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actividad Espacio</em>'.
	 * @generated
	 */
	ActividadEspacio createActividadEspacio();

	/**
	 * Returns a new object of class '<em>Tarea</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tarea</em>'.
	 * @generated
	 */
	Tarea createTarea();

	/**
	 * Returns a new object of class '<em>Leccion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leccion</em>'.
	 * @generated
	 */
	Leccion createLeccion();

	/**
	 * Returns a new object of class '<em>Prueba</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prueba</em>'.
	 * @generated
	 */
	Prueba createPrueba();

	/**
	 * Returns a new object of class '<em>Actividad Nodo Inicial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actividad Nodo Inicial</em>'.
	 * @generated
	 */
	ActividadNodoInicial createActividadNodoInicial();

	/**
	 * Returns a new object of class '<em>Actividad Nodo Final</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actividad Nodo Final</em>'.
	 * @generated
	 */
	ActividadNodoFinal createActividadNodoFinal();

	/**
	 * Returns a new object of class '<em>Actividad Enlace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actividad Enlace</em>'.
	 * @generated
	 */
	ActividadEnlace createActividadEnlace();

	/**
	 * Returns a new object of class '<em>Actividad Union Bifurcacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actividad Union Bifurcacion</em>'.
	 * @generated
	 */
	ActividadUnionBifurcacion createActividadUnionBifurcacion();

	/**
	 * Returns a new object of class '<em>Archivo Adjunto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Archivo Adjunto</em>'.
	 * @generated
	 */
	ArchivoAdjunto createArchivoAdjunto();

	/**
	 * Returns a new object of class '<em>Mi Relative Bendpoints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mi Relative Bendpoints</em>'.
	 * @generated
	 */
	MiRelativeBendpoints createMiRelativeBendpoints();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
