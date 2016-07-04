/**
 */
package org.mindmap.model;

import org.eclipse.emf.emfstore.internal.server.model.FileIdentifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Archivo Adjunto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mindmap.model.ArchivoAdjunto#getNombre <em>Nombre</em>}</li>
 *   <li>{@link org.mindmap.model.ArchivoAdjunto#getFileId <em>File Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mindmap.model.ModelPackage#getArchivoAdjunto()
 * @model
 * @generated
 */
public interface ArchivoAdjunto extends CursoElement {
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
	 * @see org.mindmap.model.ModelPackage#getArchivoAdjunto_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link org.mindmap.model.ArchivoAdjunto#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>File Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Id</em>' attribute.
	 * @see #setFileId(String)
	 * @see org.mindmap.model.ModelPackage#getArchivoAdjunto_FileId()
	 * @model
	 * @generated
	 */
	String getFileId();

	/**
	 * Sets the value of the '{@link org.mindmap.model.ArchivoAdjunto#getFileId <em>File Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Id</em>' attribute.
	 * @see #getFileId()
	 * @generated
	 */
	void setFileId(String value);

	public FileIdentifier getFileIdentifier();

	public void setFileIdentifier(FileIdentifier ident);
} // ArchivoAdjunto
