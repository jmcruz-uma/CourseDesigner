/**
 */
package org.mindmap.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actividad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mindmap.model.Actividad#getNombre <em>Nombre</em>}</li>
 *   <li>{@link org.mindmap.model.Actividad#getBloque <em>Bloque</em>}</li>
 *   <li>{@link org.mindmap.model.Actividad#getEspacios <em>Espacios</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mindmap.model.ModelPackage#getActividad()
 * @model
 * @generated
 */
public interface Actividad extends CursoElement {
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
	 * @see org.mindmap.model.ModelPackage#getActividad_Nombre()
	 * @model required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link org.mindmap.model.Actividad#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Bloque</b></em>' attribute.
	 * The literals are from the enumeration {@link org.mindmap.model.Bloque2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bloque</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bloque</em>' attribute.
	 * @see org.mindmap.model.Bloque2
	 * @see #isSetBloque()
	 * @see #unsetBloque()
	 * @see #setBloque(Bloque2)
	 * @see org.mindmap.model.ModelPackage#getActividad_Bloque()
	 * @model unsettable="true"
	 * @generated
	 */
	Bloque getBloque();

	/**
	 * Sets the value of the '{@link org.mindmap.model.Actividad#getBloque <em>Bloque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bloque</em>' attribute.
	 * @see org.mindmap.model.Bloque2
	 * @see #isSetBloque()
	 * @see #unsetBloque()
	 * @see #getBloque()
	 * @generated
	 */
	void setBloque(Bloque value);

	/**
	 * Unsets the value of the '{@link org.mindmap.model.Actividad#getBloque <em>Bloque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBloque()
	 * @see #getBloque()
	 * @see #setBloque(Bloque2)
	 * @generated
	 */
	void unsetBloque();

	/**
	 * Returns whether the value of the '{@link org.mindmap.model.Actividad#getBloque <em>Bloque</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bloque</em>' attribute is set.
	 * @see #unsetBloque()
	 * @see #getBloque()
	 * @see #setBloque(Bloque2)
	 * @generated
	 */
	boolean isSetBloque();

	/**
	 * Returns the value of the '<em><b>Espacios</b></em>' containment reference list.
	 * The list contents are of type {@link org.mindmap.model.ActividadEspacio}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Espacios</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Espacios</em>' containment reference list.
	 * @see org.mindmap.model.ModelPackage#getActividad_Espacios()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ActividadEspacio> getEspacios();

} // Actividad
