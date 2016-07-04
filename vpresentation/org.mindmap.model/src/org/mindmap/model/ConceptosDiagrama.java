/**
 */
package org.mindmap.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conceptos Diagrama</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.mindmap.model.ModelPackage#getConceptosDiagrama()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NombreDuplicadoConcepto NombreDuplicadoCaracter\355stica'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL NombreDuplicadoConcepto='self.temas.conceptos->select(nombre<>null)->isUnique(nombre)' NombreDuplicadoCaracter\355stica='self.temas.conceptos.atributos->select(nombre<>null)->isUnique(nombre)'"
 * @generated
 */
public interface ConceptosDiagrama extends CursoDiagrama {
} // ConceptosDiagrama
