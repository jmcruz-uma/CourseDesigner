/**
 */
package org.mindmap.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actividad Enlace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mindmap.model.ActividadEnlace#getEtiqueta <em>Etiqueta</em>}</li>
 *   <li>{@link org.mindmap.model.ActividadEnlace#getOrigen <em>Origen</em>}</li>
 *   <li>{@link org.mindmap.model.ActividadEnlace#getDestino <em>Destino</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mindmap.model.ModelPackage#getActividadEnlace()
 * @model
 * @generated
 */
public interface ActividadEnlace extends CursoElement {
	/**
	 * Returns the value of the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etiqueta</em>' attribute.
	 * @see #setEtiqueta(String)
	 * @see org.mindmap.model.ModelPackage#getActividadEnlace_Etiqueta()
	 * @model
	 * @generated
	 */
	String getEtiqueta();

	/**
	 * Sets the value of the '{@link org.mindmap.model.ActividadEnlace#getEtiqueta <em>Etiqueta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etiqueta</em>' attribute.
	 * @see #getEtiqueta()
	 * @generated
	 */
	void setEtiqueta(String value);

	/**
	 * Returns the value of the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origen</em>' reference.
	 * @see #setOrigen(ActividadNodo)
	 * @see org.mindmap.model.ModelPackage#getActividadEnlace_Origen()
	 * @model required="true"
	 * @generated
	 */
	ActividadNodo getOrigen();

	/**
	 * Sets the value of the '{@link org.mindmap.model.ActividadEnlace#getOrigen <em>Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origen</em>' reference.
	 * @see #getOrigen()
	 * @generated
	 */
	void setOrigen(ActividadNodo value);

	/**
	 * Returns the value of the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destino</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destino</em>' reference.
	 * @see #setDestino(ActividadNodo)
	 * @see org.mindmap.model.ModelPackage#getActividadEnlace_Destino()
	 * @model required="true"
	 * @generated
	 */
	ActividadNodo getDestino();

	/**
	 * Sets the value of the '{@link org.mindmap.model.ActividadEnlace#getDestino <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destino</em>' reference.
	 * @see #getDestino()
	 * @generated
	 */
	void setDestino(ActividadNodo value);

} // ActividadEnlace
