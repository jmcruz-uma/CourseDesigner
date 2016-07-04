/**
 */
package org.mindmap.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curso Diagrama</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mindmap.model.CursoDiagrama#getGmfdiagram <em>Gmfdiagram</em>}</li>
 *   <li>{@link org.mindmap.model.CursoDiagrama#getActividades <em>Actividades</em>}</li>
 *   <li>{@link org.mindmap.model.CursoDiagrama#getTemas <em>Temas</em>}</li>
 *   <li>{@link org.mindmap.model.CursoDiagrama#getEnlacesActividad <em>Enlaces Actividad</em>}</li>
 *   <li>{@link org.mindmap.model.CursoDiagrama#getEnlacesUsaBloque <em>Enlaces Usa Bloque</em>}</li>
 *   <li>{@link org.mindmap.model.CursoDiagrama#getEnlaceUsa <em>Enlace Usa</em>}</li>
 *   <li>{@link org.mindmap.model.CursoDiagrama#getEnlacesEsUn <em>Enlaces Es Un</em>}</li>
 *   <li>{@link org.mindmap.model.CursoDiagrama#getUnionesbifurcaciones <em>Unionesbifurcaciones</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mindmap.model.ModelPackage#getCursoDiagrama()
 * @model abstract="true"
 * @generated
 */
public interface CursoDiagrama extends EObject {
	/**
	 * Returns the value of the '<em><b>Gmfdiagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gmfdiagram</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gmfdiagram</em>' containment reference.
	 * @see #setGmfdiagram(Diagram)
	 * @see org.mindmap.model.ModelPackage#getCursoDiagrama_Gmfdiagram()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Diagram getGmfdiagram();

	/**
	 * Sets the value of the '{@link org.mindmap.model.CursoDiagrama#getGmfdiagram <em>Gmfdiagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gmfdiagram</em>' containment reference.
	 * @see #getGmfdiagram()
	 * @generated
	 */
	void setGmfdiagram(Diagram value);

	/**
	 * Returns the value of the '<em><b>Actividades</b></em>' containment reference list.
	 * The list contents are of type {@link org.mindmap.model.Actividad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actividades</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actividades</em>' containment reference list.
	 * @see org.mindmap.model.ModelPackage#getCursoDiagrama_Actividades()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Actividad> getActividades();

	/**
	 * Returns the value of the '<em><b>Temas</b></em>' containment reference list.
	 * The list contents are of type {@link org.mindmap.model.Tema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temas</em>' containment reference list.
	 * @see org.mindmap.model.ModelPackage#getCursoDiagrama_Temas()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Tema> getTemas();

	/**
	 * Returns the value of the '<em><b>Enlaces Actividad</b></em>' containment reference list.
	 * The list contents are of type {@link org.mindmap.model.ActividadEnlace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enlaces Actividad</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enlaces Actividad</em>' containment reference list.
	 * @see org.mindmap.model.ModelPackage#getCursoDiagrama_EnlacesActividad()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ActividadEnlace> getEnlacesActividad();

	/**
	 * Returns the value of the '<em><b>Enlaces Usa Bloque</b></em>' containment reference list.
	 * The list contents are of type {@link org.mindmap.model.EnlaceUsaBloque}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enlaces Usa Bloque</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enlaces Usa Bloque</em>' containment reference list.
	 * @see org.mindmap.model.ModelPackage#getCursoDiagrama_EnlacesUsaBloque()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EnlaceUsaBloque> getEnlacesUsaBloque();

	/**
	 * Returns the value of the '<em><b>Enlace Usa</b></em>' containment reference list.
	 * The list contents are of type {@link org.mindmap.model.EnlaceUsa}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enlace Usa</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enlace Usa</em>' containment reference list.
	 * @see org.mindmap.model.ModelPackage#getCursoDiagrama_EnlaceUsa()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EnlaceUsa> getEnlaceUsa();

	/**
	 * Returns the value of the '<em><b>Enlaces Es Un</b></em>' containment reference list.
	 * The list contents are of type {@link org.mindmap.model.EnlaceEsUn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enlaces Es Un</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enlaces Es Un</em>' containment reference list.
	 * @see org.mindmap.model.ModelPackage#getCursoDiagrama_EnlacesEsUn()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EnlaceEsUn> getEnlacesEsUn();

	/**
	 * Returns the value of the '<em><b>Unionesbifurcaciones</b></em>' containment reference list.
	 * The list contents are of type {@link org.mindmap.model.ActividadUnionBifurcacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unionesbifurcaciones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unionesbifurcaciones</em>' containment reference list.
	 * @see org.mindmap.model.ModelPackage#getCursoDiagrama_Unionesbifurcaciones()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ActividadUnionBifurcacion> getUnionesbifurcaciones();

	String getType();
} // CursoDiagrama
