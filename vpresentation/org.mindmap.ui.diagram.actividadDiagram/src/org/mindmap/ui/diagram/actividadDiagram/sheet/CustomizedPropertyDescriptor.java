package org.mindmap.ui.diagram.actividadDiagram.sheet;

import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IInputValidator;
//import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.viewers.ICellEditorValidator;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.emf.common.ui.celleditor.ExtendedComboBoxCellEditor;
import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.EMFEditUIPlugin;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.emf.emfstore.client.ESLocalProject;
import org.eclipse.emf.emfstore.client.ESWorkspaceProvider;
import org.eclipse.emf.emfstore.internal.client.model.ProjectSpace;
import org.eclipse.emf.emfstore.internal.client.model.Workspace;
import org.eclipse.emf.emfstore.internal.client.model.filetransfer.FileDownloadStatus;
import org.eclipse.emf.emfstore.internal.client.model.filetransfer.FileInformation;
import org.eclipse.emf.emfstore.internal.client.model.impl.api.ESWorkspaceImpl;
import org.eclipse.emf.emfstore.internal.client.model.util.EMFStoreCommand;
import org.eclipse.emf.emfstore.internal.client.model.util.WorkspaceUtil;
import org.eclipse.emf.emfstore.internal.common.model.util.FileUtil;
import org.eclipse.emf.emfstore.internal.common.model.util.ModelUtil;
import org.eclipse.emf.emfstore.internal.server.exceptions.FileTransferException;
import org.eclipse.emf.emfstore.internal.server.model.FileIdentifier;
import org.mindmap.model.ArchivoAdjunto;
import org.mindmap.model.Leccion;
import org.mindmap.model.ModelFactory;
import org.mindmap.model.ModelPackage;
import org.mindmap.model.Tarea;
import org.mindmap.model.control.ProjectControl;
import org.mindmap.model.impl.ArchivoAdjuntoImpl;

public class CustomizedPropertyDescriptor extends PropertyDescriptor {

	public CustomizedPropertyDescriptor(Object object,
			IItemPropertyDescriptor itemPropertyDescriptor) {
		super(object, itemPropertyDescriptor);
	}

	@Override
	public CellEditor createPropertyEditor(Composite composite) {
		if (!itemPropertyDescriptor.canSetProperty(object)) {
			return null;
		}

		CellEditor result = null;

		Object genericFeature = itemPropertyDescriptor.getFeature(object);
		if (genericFeature instanceof EReference[]) {
			result = new ExtendedComboBoxCellEditor(composite,
					new ArrayList<Object>(itemPropertyDescriptor
							.getChoiceOfValues(object)),
					getEditLabelProvider(),
					itemPropertyDescriptor.isSortChoices(object));
		} else if (genericFeature instanceof EStructuralFeature) {
			final EStructuralFeature feature = (EStructuralFeature) genericFeature;
			final EClassifier eType = feature.getEType();
			final Collection<?> choiceOfValues = itemPropertyDescriptor
					.getChoiceOfValues(object);
			if (choiceOfValues != null) {
				if (itemPropertyDescriptor.isMany(object)) {
					boolean valid = true;
					for (Object choice : choiceOfValues) {
						if (!eType.isInstance(choice)) {
							valid = false;
							break;
						}
					}

					if (valid) {
						final ILabelProvider editLabelProvider = getEditLabelProvider();
						result = new ExtendedDialogCellEditor(composite,
								editLabelProvider) {
							@Override
							protected Object openDialogBox(
									Control cellEditorWindow) {
								FeatureEditorDialog dialog = new FeatureEditorDialog(
										cellEditorWindow.getShell(),
										editLabelProvider, object,
										feature.getEType(),
										(List<?>) doGetValue(),
										getDisplayName(),
										new ArrayList<Object>(choiceOfValues),
										false,
										itemPropertyDescriptor
												.isSortChoices(object),
										feature.isUnique());
								dialog.open();
								return dialog.getResult();
							}
						};
					}
				}

				if (result == null) {
					/** Añadimos nuestro CellEditor para los ficheros **/
					if (feature.getName().equals(
							ModelPackage.Literals.TAREA__CONTENIDOS.getName())
							|| feature.getName().equals(
									ModelPackage.Literals.LECCION__CONTENIDOS
											.getName())) {
						result = createContenidosTypeCellEditor(composite);
					} else {

						result = new ExtendedComboBoxCellEditor(composite,
								new ArrayList<Object>(choiceOfValues),
								getEditLabelProvider(),
								itemPropertyDescriptor.isSortChoices(object));
					}
				}
			} else if (eType instanceof EDataType) {
				EDataType eDataType = (EDataType) eType;
				if (eDataType.isSerializable()) {
					if (itemPropertyDescriptor.isMany(object)) {
						final ILabelProvider editLabelProvider = getEditLabelProvider();
						result = new ExtendedDialogCellEditor(composite,
								editLabelProvider) {
							@Override
							protected Object openDialogBox(
									Control cellEditorWindow) {
								FeatureEditorDialog dialog = new FeatureEditorDialog(
										cellEditorWindow.getShell(),
										editLabelProvider, object,
										feature.getEType(),
										(List<?>) doGetValue(),
										getDisplayName(), null,
										itemPropertyDescriptor
												.isMultiLine(object), false,
										feature.isUnique());
								dialog.open();
								return dialog.getResult();
							}
						};
					} else if (eDataType.getInstanceClass() == Boolean.class
							|| eDataType.getInstanceClass() == Boolean.TYPE) {
						result = new ExtendedComboBoxCellEditor(composite,
								Arrays.asList(new Object[] { Boolean.FALSE,
										Boolean.TRUE }),
								getEditLabelProvider(),
								itemPropertyDescriptor.isSortChoices(object));
					} else {

						result = createEDataTypeCellEditor(eDataType, composite);

					}
				}
			}
		}

		return result;

	}


	protected CellEditor createContenidosTypeCellEditor(Composite composite) {
		
		return new MyDialogCellEditor(composite);

	}

	private class MyDialogCellEditor extends CellEditor {

				
		/**
		 * The editor control.
		 */
		private Composite editor;

		/**
		 * The current contents.
		 */
		private Control contents;

		/**
		 * The label that gets reused by <code>updateLabel</code>.
		 */
		private Label defaultLabel;

		/**
		 * The button.
		 */
		private Button button;

		/**
		 * Listens for 'focusLost' events and fires the 'apply' event as long as
		 * the focus wasn't lost because the dialog was opened.
		 */
		private FocusListener buttonFocusListener;

		/**
		 * The value of this cell editor; initially <code>null</code>.
		 */
		private ArchivoAdjunto value = null;

		
		/**
		 * Internal class for laying out the dialog.
		 */
		private class DialogCellLayout extends Layout {
			public void layout(Composite editor, boolean force) {
				Rectangle bounds = editor.getClientArea();
				Point size = button
						.computeSize(SWT.DEFAULT, SWT.DEFAULT, force);
				if (contents != null) {
					contents.setBounds(0, 0, bounds.width - size.x * 2,
							bounds.height);
				}
				botonGuardar.setBounds(bounds.width - size.x - size.x, 0,
						size.x, bounds.height);

			
				button.setBounds(bounds.width - size.x, 0, size.x,
						bounds.height);
			}

			public Point computeSize(Composite editor, int wHint, int hHint,
					boolean force) {
				if (wHint != SWT.DEFAULT && hHint != SWT.DEFAULT) {
					return new Point(wHint, hHint);
				}
				Point contentsSize = contents.computeSize(SWT.DEFAULT,
						SWT.DEFAULT, force);
				Point buttonSize = button.computeSize(SWT.DEFAULT, SWT.DEFAULT,
						force);
				Point buttonGuardarSize = botonGuardar.computeSize(SWT.DEFAULT,
						SWT.DEFAULT, force);
				// Just return the button width to ensure the button is not
				// clipped
				// if the label is long.
				// The label will just use whatever extra width there is
				// Point result = new Point(buttonSize.x,
				// Math.max(contentsSize.y,
				// buttonSize.y));
				Point result = new Point(buttonGuardarSize.x, Math.max(
						contentsSize.y, buttonSize.y));
				return result;
			}
		}

		/**
		 * Default DialogCellEditor style
		 */
		private static final int defaultStyle = SWT.NONE;

		/**
		 * Creates a new dialog cell editor with no control
		 * 
		 * @since 2.1
		 */
		public MyDialogCellEditor() {
			setStyle(defaultStyle);
		}

		/**
		 * Creates a new dialog cell editor parented under the given control.
		 * The cell editor value is <code>null</code> initially, and has no
		 * validator.
		 * 
		 * @param parent
		 *            the parent control
		 */
		protected MyDialogCellEditor(Composite parent) {
			this(parent, defaultStyle);
		}

		/**
		 * Creates a new dialog cell editor parented under the given control.
		 * The cell editor value is <code>null</code> initially, and has no
		 * validator.
		 * 
		 * @param parent
		 *            the parent control
		 * @param style
		 *            the style bits
		 * @since 2.1
		 */
		protected MyDialogCellEditor(Composite parent, int style) {
			super(parent, style);
		}

		/**
		 * Creates the button for this cell editor under the given parent
		 * control.
		 * <p>
		 * The default implementation of this framework method creates the
		 * button display on the right hand side of the dialog cell editor.
		 * Subclasses may extend or reimplement.
		 * </p>
		 * 
		 * @param parent
		 *            the parent control
		 * @return the new button control
		 */
		protected Button createButton(Composite parent) {
			Image imgfile = PlatformUI.getWorkbench().getSharedImages()
					.getImage(ISharedImages.IMG_OBJ_FILE);

			Button result = new Button(parent, SWT.DOWN);
			result.setImage(imgfile);

			return result;
		}

		private Button crearBotonGuardar(Composite parent) {
			Image imgsave = PlatformUI.getWorkbench().getSharedImages()
					.getImage(ISharedImages.IMG_ETOOL_SAVE_EDIT);
			Button result = new Button(parent, SWT.DOWN);
			result.setImage(imgsave);
			result.setToolTipText("Guarda el archivo en el pc.");
			return result;

		}

		/**
		 * Creates the controls used to show the value of this cell editor.
		 * <p>
		 * The default implementation of this framework method creates a label
		 * widget, using the same font and background color as the parent
		 * control.
		 * </p>
		 * <p>
		 * Subclasses may reimplement. If you reimplement this method, you
		 * should also reimplement <code>updateContents</code>.
		 * </p>
		 * 
		 * @param cell
		 *            the control for this cell editor
		 * @return the underlying control
		 */
		protected Control createContents(Composite cell) {
			defaultLabel = new Label(cell, SWT.LEFT);
			defaultLabel.setFont(cell.getFont());
			defaultLabel.setBackground(cell.getBackground());
			return defaultLabel;
		}

		private Button botonGuardar;

		private FocusListener buttonFocusListener2;

		
		/*
		 * (non-Javadoc) Method declared on CellEditor.
		 */
		protected Control createControl(Composite parent) {
			
			Font font = parent.getFont();
			Color bg = parent.getBackground();

			editor = new Composite(parent, getStyle());
			editor.setFont(font);
			editor.setBackground(bg);
			editor.setLayout(new DialogCellLayout());

			contents = createContents(editor);

			button = createButton(editor);
			button.setFont(font);

			button.addKeyListener(new KeyAdapter() {
				
				public void keyReleased(KeyEvent e) {
					if (e.character == '\u001b') { // Escape
						fireCancelEditor();
					}
				}
			});

			button.addFocusListener(getButtonFocusListener());

			button.addSelectionListener(new SelectionAdapter() {
				
				public void widgetSelected(SelectionEvent event) {
					
					//Quitar el focus del boton porque siempre lo pierde al abrir el dialog
					button.removeFocusListener(getButtonFocusListener());

					Object newValue = openDialogBox(editor);

					//añadir listener cuando se cierre el dialog
					button.addFocusListener(getButtonFocusListener());

					boolean newValidState = isCorrect(newValue);
					if (newValidState) {
						markDirty();
						doSetValue(newValue);
					} else {
						
						setErrorMessage(MessageFormat.format(getErrorMessage(),
								new Object[] { newValue.toString() }));
					}
					fireApplyEditorValue();
				}
				
			});

			/** Nuevo boton save **/
			botonGuardar = crearBotonGuardar(editor);
			botonGuardar.setFont(font);

			

			botonGuardar.addFocusListener(getButtonFocusListener2());

			botonGuardar.addSelectionListener(new SelectionAdapter() {
				/*
				 * (non-Javadoc)
				 * 
				 * @see
				 * org.eclipse.swt.events.SelectionListener#widgetSelected(org
				 * .eclipse.swt.events.SelectionEvent)
				 */
				public void widgetSelected(SelectionEvent event) {

					//Quitar el focus del boton porque siempre lo pierde al abrir el dialog
					botonGuardar.removeFocusListener(getButtonFocusListener2());
					openSaveBox(editor);
				
				}

			});

			updateContents(value);
			setValueValid(true);


			return editor;
		}

		private Object openSaveBox(Control cellEditorWindow) {
			
			FileDialog fileDialog = new FileDialog(cellEditorWindow.getShell());
			String path = fileDialog.open();

			if (path != null) {
				try {
					
					//Obtener el fichero
					ProjectSpace ps = ProjectControl.getActualProjectSpace();

					final FileDownloadStatus status = ps.getFile(value
							.getFileIdentifier());

					
					//Añadimos observer que lo copia cuando termina la descarga
					final File destinationFile = new File(path);
					status.addTransferFinishedObserver(new Observer() {
						public void update(Observable o, Object arg) {
							try {
								FileUtil.copyFile(status.getTransferredFile(),
										destinationFile);
								
								openInformation(
										"Archivo guardado correctamente",
										"El archivo se guardó correctamente");

							} catch (IOException e1) {
								registerSaveAsException(e1);
							} catch (FileTransferException e) {
								registerSaveAsException(e);
							}
						}
					});

					
					//Añadimos observer que registra si ocurre una excepción en la descarga
					status.addDefaultFailObserver();
				} catch (FileTransferException e1) {
					registerSaveAsException(e1);

				}
			}
			return null;
		}

		/**
		 * Exception handling in the save as usecase.
		 * 
		 * @param e1
		 *            the exception to handle
		 */
		private void registerSaveAsException(Exception e1) {
			String fail = "Save as... failed!";
			WorkspaceUtil.logException(fail, e1);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * Override in order to remove the button's focus listener if the
		 * celleditor is deactivating.
		 * 
		 * @see org.eclipse.jface.viewers.CellEditor#deactivate()
		 */
		public void deactivate() {
			if (button != null && !button.isDisposed()) {
				button.removeFocusListener(getButtonFocusListener());
			}
			if (botonGuardar != null && !botonGuardar.isDisposed()) {
				botonGuardar.removeFocusListener(getButtonFocusListener2());
			}

			super.deactivate();
		}

		public void deactivate2() {
			if (botonGuardar != null && !botonGuardar.isDisposed()) {
				botonGuardar.removeFocusListener(getButtonFocusListener());
			}

			super.deactivate();
		}

		/*
		 * (non-Javadoc) Method declared on CellEditor.
		 */
		protected Object doGetValue() {
			return value;
		}

		/*
		 * (non-Javadoc) Method declared on CellEditor. The focus is set to the
		 * cell editor's button.
		 */
		protected void doSetFocus() {
			button.setFocus();

			// add a FocusListener to the button
			button.addFocusListener(getButtonFocusListener());

			
		}

		/**
		 * Return a listener for button focus.
		 * 
		 * @return FocusListener
		 */
		private FocusListener getButtonFocusListener() {
			if (buttonFocusListener == null) {
				buttonFocusListener = new FocusListener() {

					/*
					 * (non-Javadoc)
					 * 
					 * @see
					 * org.eclipse.swt.events.FocusListener#focusGained(org.
					 * eclipse.swt.events.FocusEvent)
					 */
					public void focusGained(FocusEvent e) {
						// Do nothing
					}

					/*
					 * (non-Javadoc)
					 * 
					 * @see
					 * org.eclipse.swt.events.FocusListener#focusLost(org.eclipse
					 * .swt.events.FocusEvent)
					 */
					public void focusLost(FocusEvent e) {
						MyDialogCellEditor.this.focusLost();
					}
				};
			}

			return buttonFocusListener;
		}

		/**
		 * Return a listener for button focus.
		 * 
		 * @return FocusListener
		 */
		private FocusListener getButtonFocusListener2() {
			if (buttonFocusListener2 == null) {
				buttonFocusListener2 = new FocusListener() {

					/*
					 * (non-Javadoc)
					 * 
					 * @see
					 * org.eclipse.swt.events.FocusListener#focusGained(org.
					 * eclipse.swt.events.FocusEvent)
					 */
					public void focusGained(FocusEvent e) {
						// Do nothing
					}

					/*
					 * (non-Javadoc)
					 * 
					 * @see
					 * org.eclipse.swt.events.FocusListener#focusLost(org.eclipse
					 * .swt.events.FocusEvent)
					 */
					public void focusLost(FocusEvent e) {
						MyDialogCellEditor.this.focusLost();
					}
				};
			}

			return buttonFocusListener2;
		}

		/*
		 * (non-Javadoc) Method declared on CellEditor.
		 */
		protected void doSetValue(Object value) {
			this.value = (ArchivoAdjunto) value;
			updateContents(value);
		}

		/**
		 * Returns the default label widget created by
		 * <code>createContents</code>.
		 * 
		 * @return the default label widget
		 */
		protected Label getDefaultLabel() {
			return defaultLabel;
		}

		/**
		 * Opens a dialog box under the given parent control and returns the
		 * dialog's value when it closes, or <code>null</code> if the dialog was
		 * canceled or no selection was made in the dialog.
		 * <p>
		 * This framework method must be implemented by concrete subclasses. It
		 * is called when the user has pressed the button and the dialog box
		 * must pop up.
		 * </p>
		 * 
		 * @param cellEditorWindow
		 *            the parent control cell editor's window so that a subclass
		 *            can adjust the dialog box accordingly
		 * @return the selected value, or <code>null</code> if the dialog was
		 *         canceled or no selection was made in the dialog
		 */
		protected Object openDialogBox(Control cellEditorWindow) {
			if (value != null)// Eliminamos el archivo adjunto
			{
				new EMFStoreCommand() {
					@Override
					protected void doRun() {

						ProjectSpace ps = ProjectControl
								.getActualProjectSpace();
					
						try {
							
							FileIdentifier oldId = value.getFileIdentifier();
							FileInformation oldInfo = ps.getFileInfo(oldId);
							if (oldInfo.isPendingUpload()) { // Si esta
																// pendiente de
																// ser subido al
																// servidor lo cancelamos
								oldInfo.cancelPendingUpload();
							} else if (oldInfo.isCached()) { // Si ya se subió
																// simplemente
																// lo borramos
																// localmente
								FileDownloadStatus status = ps.getFile(oldId);
								if (status.isTransferFinished()) {
									File antiguoFichero = status
											.getTransferredFile();
									antiguoFichero.delete();
								}
							}

						} catch (FileTransferException e) {
							openError("Error","Error al borrar el archivo.");
							return;

						}

						// hay que eliminar el contenido del modelo
						if (object instanceof Tarea) {
							Tarea tarea = (Tarea) object;
							tarea.setContenidos(null);
						} else if (object instanceof Leccion) {
							Leccion leccion = (Leccion) object;
							leccion.setContenidos(null);
						}

					}
				}.run(false);
				return null;
			} else {// Esta vacio
				final FileDialog fileDialog = new FileDialog(
						cellEditorWindow.getShell());


				if (fileDialog.open() != null
						&& !fileDialog.getFileName().equals("")) {

					final File uploadFile = new File(
							fileDialog.getFilterPath(),
							fileDialog.getFileName());
					if (!uploadFile.exists()) {
						openError("Error", "El archivo no existe");
						return null;
					}

					// Creamos nuestro nuevo Archivo a adjuntar

					final ArchivoAdjunto archivo = ModelFactory.eINSTANCE
							.createArchivoAdjunto();

					new EMFStoreCommand() {
						@Override
						protected void doRun() {
							try {
								//Añadimos el archivo
								ProjectSpace ps = ProjectControl
										.getActualProjectSpace();
								FileIdentifier ident = ps.addFile(uploadFile);
								archivo.setNombre(fileDialog.getFileName());
								archivo.setFileIdentifier(ident);
								
								//Lo añadimos al modelo
								if (object instanceof Tarea) {
									Tarea tarea = (Tarea) object;
									tarea.setContenidos(archivo);

								} else if (object instanceof Leccion) {
									Leccion leccion = (Leccion) object;
									leccion.setContenidos(archivo);
								}
								
							} catch (FileTransferException e) {
								openError("Error","No se pudo adjuntar el archivo");
								return;
							}
						}
					}.run(false);

					return archivo;
				}

				return null;


			}
		}

		

		/**
		 * Opens an error dialog.
		 * 
		 * @param title
		 *            the title
		 * @param message
		 *            the message
		 */
		private void openError(final String title, final String message) {

			button.getDisplay().asyncExec(new Runnable() {
				public void run() {
					MessageDialog.openError(button.getShell(), title, message);
				}
			});

		}

		private void openInformation(final String title, final String message) {
			botonGuardar.getDisplay().asyncExec(new Runnable() {
				public void run() {
					MessageDialog.openInformation(botonGuardar.getShell(),
							title, message);
				}
			});
		}

		/**
		 * Updates the controls showing the value of this cell editor.
		 * <p>
		 * The default implementation of this framework method just converts the
		 * passed object to a string using <code>toString</code> and sets this
		 * as the text of the label widget.
		 * </p>
		 * <p>
		 * Subclasses may reimplement. If you reimplement this method, you
		 * should also reimplement <code>createContents</code>.
		 * </p>
		 * 
		 * @param value
		 *            the new value of this cell editor
		 */
		protected void updateContents(Object value) {

			if (value != null) {
				button.setImage(PlatformUI.getWorkbench().getSharedImages()
						.getImage(ISharedImages.IMG_ETOOL_DELETE));
				button.setToolTipText("Elimina el archivo actual como archivo adjunto.");
				botonGuardar.setVisible(true);

			} else {
				botonGuardar.setVisible(false);
				button.setImage(PlatformUI.getWorkbench().getSharedImages()
						.getImage(ISharedImages.IMG_OBJ_FILE));
				button.setToolTipText("Adjunta un archivo.");
			}

			if (defaultLabel == null) {
				return;
			}

			String text = "";//$NON-NLS-1$ if (value != null) { text =
			if (value != null) {
				text = value.toString();
				text = ((ArchivoAdjunto) value).getNombre();
			}
			defaultLabel.setText(text);

		}
	}
}
