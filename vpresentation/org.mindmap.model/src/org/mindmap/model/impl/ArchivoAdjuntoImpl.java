/**
 */
package org.mindmap.model.impl;

import java.io.File;
import java.util.Observable;
import java.util.Observer;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.emfstore.internal.client.model.ProjectSpace;
import org.eclipse.emf.emfstore.internal.client.model.filetransfer.FileDownloadStatus;
import org.eclipse.emf.emfstore.internal.client.model.util.EMFStoreCommand;
import org.eclipse.emf.emfstore.internal.client.model.util.WorkspaceUtil;
import org.eclipse.emf.emfstore.internal.server.exceptions.FileTransferException;
import org.eclipse.emf.emfstore.internal.server.model.FileIdentifier;
import org.eclipse.emf.emfstore.internal.server.model.ModelFactory;
import org.mindmap.model.ArchivoAdjunto;
import org.mindmap.model.ModelPackage;
import org.mindmap.model.control.ProjectControl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Archivo Adjunto</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mindmap.model.impl.ArchivoAdjuntoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link org.mindmap.model.impl.ArchivoAdjuntoImpl#getFileId <em>File Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArchivoAdjuntoImpl extends CursoElementImpl implements
		ArchivoAdjunto {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileId() <em>File Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFileId()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileId() <em>File Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFileId()
	 * @generated
	 * @ordered
	 */
	protected String fileId = FILE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchivoAdjuntoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ARCHIVO_ADJUNTO;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.ARCHIVO_ADJUNTO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileId() {
		return fileId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileId(String newFileId) {
		String oldFileId = fileId;
		fileId = newFileId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.ARCHIVO_ADJUNTO__FILE_ID, oldFileId, fileId));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.ARCHIVO_ADJUNTO__NOMBRE:
			return getNombre();
		case ModelPackage.ARCHIVO_ADJUNTO__FILE_ID:
			return getFileId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModelPackage.ARCHIVO_ADJUNTO__NOMBRE:
			setNombre((String) newValue);
			return;
		case ModelPackage.ARCHIVO_ADJUNTO__FILE_ID:
			setFileId((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ModelPackage.ARCHIVO_ADJUNTO__NOMBRE:
			setNombre(NOMBRE_EDEFAULT);
			return;
		case ModelPackage.ARCHIVO_ADJUNTO__FILE_ID:
			setFileId(FILE_ID_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ModelPackage.ARCHIVO_ADJUNTO__NOMBRE:
			return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT
					.equals(nombre);
		case ModelPackage.ARCHIVO_ADJUNTO__FILE_ID:
			return FILE_ID_EDEFAULT == null ? fileId != null
					: !FILE_ID_EDEFAULT.equals(fileId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", fileId: ");
		result.append(fileId);
		result.append(')');
		return result.toString();
	}

	public FileIdentifier getFileIdentifier() {
		if (fileId == null) {
			return null;
		}
		FileIdentifier fid = ModelFactory.eINSTANCE.createFileIdentifier();
		fid.setIdentifier(fileId);
		return fid;
	}

	public void setFileIdentifier(FileIdentifier fileId) {
		if (fileId == null) {
			setFileId(null);
		} else {
			setFileId(fileId.getIdentifier());
		}
	}

	@Override
	public boolean importar(EObject element) {
		final ArchivoAdjuntoImpl importado = (ArchivoAdjuntoImpl) element;
		final ArchivoAdjunto nuevo = (ArchivoAdjunto) this;

		new EMFStoreCommand() {
			protected void doRun() {
				ProjectSpace ps = ProjectControl.getActualProjectSpace();

				nuevo.setNombre(importado.getNombre());

				final FileDownloadStatus status;
				try {
					status = ps.getFile(importado.getFileIdentifier());
					//Añadimos observer para cuando termine la descarga coger su id y lo guardamos
					status.addTransferFinishedObserver(new Observer() {
						public void update(Observable o, Object arg) {

							try {
								File ident = status.getTransferredFile();
							} catch (FileTransferException e) {
								// TODO Bloque catch generado automáticamente
								e.printStackTrace();
							}
							nuevo.setFileIdentifier(importado
									.getFileIdentifier());
							
							
							//Añade observer que registra si la descarga falla
							status.addDefaultFailObserver();
						}
					});
				} catch (FileTransferException e) {
					// TODO Bloque catch generado automáticamente
					registerSaveAsException(e);
				}
			}
		}.run(true); 
				
		return false;
	}

	private void registerSaveAsException(Exception e1) {
		String fail = "Save as... failed!";
		WorkspaceUtil.logException(fail, e1);
	}
} // ArchivoAdjuntoImpl
