/**
 */
package org.mindmap.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actividad Espacio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mindmap.model.ActividadEspacio#getNombre <em>Nombre</em>}</li>
 *   <li>{@link org.mindmap.model.ActividadEspacio#getTareas <em>Tareas</em>}</li>
 *   <li>{@link org.mindmap.model.ActividadEspacio#getLecciones <em>Lecciones</em>}</li>
 *   <li>{@link org.mindmap.model.ActividadEspacio#getPruebas <em>Pruebas</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mindmap.model.ModelPackage#getActividadEspacio()
 * @model
 * @generated
 */
public interface ActividadEspacio extends CursoElement {
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
	 * @see org.mindmap.model.ModelPackage#getActividadEspacio_Nombre()
	 * @model required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link org.mindmap.model.ActividadEspacio#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Tareas</b></em>' containment reference list.
	 * The list contents are of type {@link org.mindmap.model.Tarea}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tareas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tareas</em>' containment reference list.
	 * @see org.mindmap.model.ModelPackage#getActividadEspacio_Tareas()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Tarea> getTareas();

	/**
	 * Returns the value of the '<em><b>Lecciones</b></em>' containment reference list.
	 * The list contents are of type {@link org.mindmap.model.Leccion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lecciones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lecciones</em>' containment reference list.
	 * @see org.mindmap.model.ModelPackage#getActividadEspacio_Lecciones()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Leccion> getLecciones();

	/**
	 * Returns the value of the '<em><b>Pruebas</b></em>' containment reference list.
	 * The list contents are of type {@link org.mindmap.model.Prueba}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pruebas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pruebas</em>' containment reference list.
	 * @see org.mindmap.model.ModelPackage#getActividadEspacio_Pruebas()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Prueba> getPruebas();

} // ActividadEspacio
