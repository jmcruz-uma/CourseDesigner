/**
 */
package org.mindmap.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concepto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mindmap.model.Concepto#getNombre <em>Nombre</em>}</li>
 *   <li>{@link org.mindmap.model.Concepto#getAnotaciones <em>Anotaciones</em>}</li>
 *   <li>{@link org.mindmap.model.Concepto#getAtributos <em>Atributos</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mindmap.model.ModelPackage#getConcepto()
 * @model
 * @generated
 */
public interface Concepto extends CursoElement {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see org.mindmap.model.ModelPackage#getConcepto_Nombre()
	 * @model required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link org.mindmap.model.Concepto#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Anotaciones</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anotaciones</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anotaciones</em>' attribute.
	 * @see #setAnotaciones(String)
	 * @see org.mindmap.model.ModelPackage#getConcepto_Anotaciones()
	 * @model
	 * @generated
	 */
	String getAnotaciones();

	/**
	 * Sets the value of the '{@link org.mindmap.model.Concepto#getAnotaciones <em>Anotaciones</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anotaciones</em>' attribute.
	 * @see #getAnotaciones()
	 * @generated
	 */
	void setAnotaciones(String value);

	/**
	 * Returns the value of the '<em><b>Atributos</b></em>' containment reference list.
	 * The list contents are of type {@link org.mindmap.model.Atributo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributos</em>' containment reference list.
	 * @see org.mindmap.model.ModelPackage#getConcepto_Atributos()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Atributo> getAtributos();

} // Concepto
