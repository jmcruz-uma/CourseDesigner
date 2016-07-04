/**
 */
package org.mindmap.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actividad Diagrama</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mindmap.model.ActividadDiagrama#getElementoNodoFinal <em>Elemento Nodo Final</em>}</li>
 *   <li>{@link org.mindmap.model.ActividadDiagrama#getElementoNodoInicial <em>Elemento Nodo Inicial</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mindmap.model.ModelPackage#getActividadDiagrama()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NombreDuplicadoActividad NombreDuplicadoEspacio NombreDuplicadoTarea NombreDuplicadoPrueba NombreDuplicadoLeccion'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL NombreDuplicadoActividad='self.actividades->select(nombre<>null)->isUnique(nombre)' NombreDuplicadoEspacio='self.actividades.espacios->select(nombre<>null)->isUnique(nombre)' NombreDuplicadoTarea='self.actividades.espacios.tareas->select(nombre<>null)->isUnique(nombre)' NombreDuplicadoPrueba='self.actividades.espacios.pruebas->select(nombre<>null)->isUnique(nombre)' NombreDuplicadoLeccion='self.actividades.espacios.lecciones->select(nombre<>null)->isUnique(nombre)'"
 * @generated
 */
public interface ActividadDiagrama extends CursoDiagrama {
	/**
	 * Returns the value of the '<em><b>Elemento Nodo Final</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elemento Nodo Final</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elemento Nodo Final</em>' containment reference.
	 * @see #setElementoNodoFinal(ActividadNodoFinal)
	 * @see org.mindmap.model.ModelPackage#getActividadDiagrama_ElementoNodoFinal()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	ActividadNodoFinal getElementoNodoFinal();

	/**
	 * Sets the value of the '{@link org.mindmap.model.ActividadDiagrama#getElementoNodoFinal <em>Elemento Nodo Final</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elemento Nodo Final</em>' containment reference.
	 * @see #getElementoNodoFinal()
	 * @generated
	 */
	void setElementoNodoFinal(ActividadNodoFinal value);

	/**
	 * Returns the value of the '<em><b>Elemento Nodo Inicial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elemento Nodo Inicial</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elemento Nodo Inicial</em>' containment reference.
	 * @see #setElementoNodoInicial(ActividadNodoInicial)
	 * @see org.mindmap.model.ModelPackage#getActividadDiagrama_ElementoNodoInicial()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	ActividadNodoInicial getElementoNodoInicial();

	/**
	 * Sets the value of the '{@link org.mindmap.model.ActividadDiagrama#getElementoNodoInicial <em>Elemento Nodo Inicial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elemento Nodo Inicial</em>' containment reference.
	 * @see #getElementoNodoInicial()
	 * @generated
	 */
	void setElementoNodoInicial(ActividadNodoInicial value);

} // ActividadDiagrama
