/**
 */
package org.mindmap.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curso</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mindmap.model.Curso#getDiagramas <em>Diagramas</em>}</li>
 *   <li>{@link org.mindmap.model.Curso#getPropiedades <em>Propiedades</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mindmap.model.ModelPackage#getCurso()
 * @model
 * @generated
 */
public interface Curso extends EObject {
	/**
	 * Returns the value of the '<em><b>Diagramas</b></em>' containment reference list.
	 * The list contents are of type {@link org.mindmap.model.CursoDiagrama}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagramas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagramas</em>' containment reference list.
	 * @see org.mindmap.model.ModelPackage#getCurso_Diagramas()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<CursoDiagrama> getDiagramas();

	/**
	 * Returns the value of the '<em><b>Propiedades</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propiedades</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propiedades</em>' containment reference.
	 * @see #setPropiedades(PropiedadCurso)
	 * @see org.mindmap.model.ModelPackage#getCurso_Propiedades()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	PropiedadCurso getPropiedades();

	/**
	 * Sets the value of the '{@link org.mindmap.model.Curso#getPropiedades <em>Propiedades</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Propiedades</em>' containment reference.
	 * @see #getPropiedades()
	 * @generated
	 */
	void setPropiedades(PropiedadCurso value);

} // Curso
