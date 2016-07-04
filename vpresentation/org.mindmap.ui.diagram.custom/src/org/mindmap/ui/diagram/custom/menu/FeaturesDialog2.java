package org.mindmap.ui.diagram.custom.menu;

import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

//import mindmap.diagram.menu.CreateProjectActionDelegate;



import org.eclipse.emf.emfstore.client.ESLocalProject;
import org.eclipse.emf.emfstore.internal.client.model.util.EMFStoreCommand;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.mindmap.model.PropiedadCurso;
import org.mindmap.model.control.ProjectControl;
import org.mindmap.model.control.ProjectUtilities;

public class FeaturesDialog2 extends Dialog {
	private Display display;
	private static String tempPath = null;
	private Image img = PlatformUI.getWorkbench().getSharedImages()
			.getImage(ISharedImages.IMG_ETOOL_SAVE_EDIT);
	private Image img2 =PlatformUI.getWorkbench().getSharedImages()
			.getImage(ISharedImages.IMG_ETOOL_SAVEALL_EDIT);
	private Text semestreText, areaText, requisitosText, actividadesText,
			competenciasText, evaluacionText, bibliografiaText, asignaturaText,
			ofertaText, creditosText, HGGText, HGRText, coordinadorText;


	public static final String[] TABS = { "Requisitos previos", 
		"Competencias", "Sistema de Evaluacion", "Bibliografia",
		"Asignatura" };
	public static final String[] ASIGTABLABEL = { "Asignatura", "Area",
			"Oferta", "Semestre", "Créditos", "Horas grupos",
			"Horas grupos reducidos", "Coordinador" };



	private PropiedadCurso propiedadCurso;
	private final static String TITLE = "Propiedades";

	// --------------------------------------------------------------------------
	// Public Methods

	/**
	 * Constructor.
	 * 
	 * @param parent
	 *            A shell which will be the parent of the new instance
	 * @param style
	 *            The style of dialog to construct
	 */
	public FeaturesDialog2(Shell parent, PropiedadCurso pc, int style) {
		super(parent, style);
		propiedadCurso = pc;
	}

	public static void center(Shell shell) {

		Rectangle bds = shell.getParent().getBounds();

		org.eclipse.swt.graphics.Point p = shell.getSize();

		int nLeft = (bds.width - p.x) / 2;
		int nTop = (bds.height - p.y) / 2;

		shell.setBounds(nLeft, nTop, p.x, p.y);
	}

	/**
	 * Constructor.
	 * 
	 * @param parent
	 *            A shell which will be the parent of the new instance
	 */
	public FeaturesDialog2(Shell parent, PropiedadCurso pc) {
		this(parent, pc, 0);
		propiedadCurso = pc;
	}

	private Shell sShell = null; 
	private Group group = null;
	private CTabFolder cTabFolder = null;
	private Composite requisitosComposite = null;
	private Composite competenciasComposite = null;
	private Composite evaluacionComposite = null;
	private Composite bibliografiaComposite = null;
	private Composite asignaturaComposite = null;

	private Button button, button1, button3, button4, button5,
			button6;
	private Label label = null;
	private int cont = 0;
	private int conta = 0;

	/**
	 * Opens the dialog.
	 * 
	 * @return The project name.
	 */
	public void open() {

		Shell parent = getParent();
		sShell = new Shell(parent, SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL
				| SWT.MAX | SWT.RESIZE);
		sShell.setText(TITLE);

		display = parent.getDisplay();

	
		GridLayout gridLayout1 = new GridLayout();
		gridLayout1.numColumns = 1;

		createGroup();
		createCTabFolder();
		sShell.setLayout(gridLayout1);

		sShell.addListener(SWT.Close, new Listener() {
			public void handleEvent(Event event) {
				if (!todosDeshabilitados()) {
					int style = SWT.APPLICATION_MODAL | SWT.YES | SWT.NO
							| SWT.CANCEL | SWT.ICON_WARNING;
					MessageBox messageBox = new MessageBox(sShell, style);
					messageBox.setText("Información");
					messageBox
							.setMessage("Algunos datos no se han guardado, si cierra la ventana estos datos se perderán. ¿Desea guardarlos antes de salir?");
					int rc = messageBox.open();
					event.doit = (rc == SWT.NO || rc == SWT.YES);

					if (rc == SWT.YES) {
						// GUARDAR TODO
						new EMFStoreCommand() {
							protected void doRun() {
								propiedadCurso.setArea(areaText.getText());
								propiedadCurso.setAsignatura(asignaturaText
										.getText());
								propiedadCurso.setBibliografia(bibliografiaText
										.getText());
								propiedadCurso.setCompetencias(competenciasText
										.getText());
								propiedadCurso.setCoordinador(coordinadorText
										.getText());
								propiedadCurso.setCreditos(creditosText
										.getText());
								propiedadCurso.setHoras_grp_gra(HGGText
										.getText());
								propiedadCurso.setHoras_grp_red(HGRText
										.getText());
								propiedadCurso.setOferta(ofertaText.getText());
								propiedadCurso
										.setRequisitosPrevios(requisitosText
												.getText());
								propiedadCurso.setSemestre(semestreText
										.getText());
								propiedadCurso
										.setSistemaEvaluacion(evaluacionText
												.getText());
							}
						}.run();

						habilitarInicio(false);
					}

				}
			}
			

		});

		sShell.pack();
		center(sShell);
		sShell.open();
		while (!sShell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}

	}

	/**
	 * This method initializes group
	 * 
	 */
	private void createGroup() {

	

		ESLocalProject proyecto = ProjectControl.actualproject;
		String projectName = proyecto.getProjectName();

		GridData gridData2 = new GridData();
		gridData2.horizontalAlignment = GridData.CENTER;
		gridData2.grabExcessHorizontalSpace = false;
		gridData2.verticalAlignment = GridData.CENTER;
		GridData gridData1 = new GridData();
		gridData1.horizontalAlignment = GridData.CENTER;
		gridData1.grabExcessHorizontalSpace = true;
		gridData1.verticalAlignment = GridData.CENTER;
		GridData gridData = new GridData();
		gridData.horizontalAlignment = GridData.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalIndent = 0;
		gridData.verticalAlignment = GridData.CENTER;
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
		gridLayout.makeColumnsEqualWidth = false;
		GridData data = new GridData(GridData.FILL_BOTH);
		group = new Group(sShell, SWT.NONE);

		group.setLayoutData(data);
		group.setLayout(gridLayout);
		group.setLayoutData(gridData);

		label = new Label(group, SWT.NONE);
		label.setText(projectName);
		label.setLayoutData(gridData1);
		button = new Button(group, SWT.NONE);
		button.setImage(img2);
		button.setLayoutData(gridData2);

		//Si se pulsa "guardar todo" se guarda todo el contenido en el modelo
		button.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) { 

				habilitarInicio(false);

				new EMFStoreCommand() {
					protected void doRun() {
						propiedadCurso.setArea(areaText.getText());
						propiedadCurso.setAsignatura(asignaturaText.getText());
						propiedadCurso.setBibliografia(bibliografiaText
								.getText());
						propiedadCurso.setCompetencias(competenciasText
								.getText());
						propiedadCurso.setCoordinador(coordinadorText.getText());
						propiedadCurso.setCreditos(creditosText.getText());
						propiedadCurso.setHoras_grp_gra(HGGText.getText());
						propiedadCurso.setHoras_grp_red(HGRText.getText());
						propiedadCurso.setOferta(ofertaText.getText());
						propiedadCurso.setRequisitosPrevios(requisitosText
								.getText());
						propiedadCurso.setSemestre(semestreText.getText());
						propiedadCurso.setSistemaEvaluacion(evaluacionText
								.getText());

					}
				}.run();
				
				
			}
		});

	}

	/**
	 * This method initializes cTabFolder
	 * 
	 */
	private void createCTabFolder() {
		GridData gridData3 = new GridData();
		gridData3.grabExcessHorizontalSpace = true;
		gridData3.horizontalAlignment = GridData.FILL;
		gridData3.verticalAlignment = GridData.FILL;
		gridData3.grabExcessVerticalSpace = true;
		cTabFolder = new CTabFolder(sShell, SWT.NONE);
		cTabFolder.setLayout(new RowLayout());
		cTabFolder.setLayoutData(gridData3);
		cTabFolder.setLayout(new FillLayout());

		// Panel 1
		createComposite();
		CTabItem cTabItem = new CTabItem(cTabFolder, SWT.NONE);
		cTabItem.setText(TABS[cont++]);
		cTabItem.setControl(requisitosComposite);

		// Panel 2
		/*
		 * createComposite2(); CTabItem cTabItem2 = new CTabItem(cTabFolder,
		 * SWT.NONE); cTabItem2.setText(TABS[cont++]);
		 * cTabItem2.setControl(actividadesComposite);
		 */
		// Panel 3
		createComposite3();
		CTabItem cTabItem3 = new CTabItem(cTabFolder, SWT.NONE);
		cTabItem3.setText(TABS[cont++]);
		cTabItem3.setControl(competenciasComposite);

		// Panel 4
		createComposite4();
		CTabItem cTabItem4 = new CTabItem(cTabFolder, SWT.NONE);
		cTabItem4.setText(TABS[cont++]);
		cTabItem4.setControl(evaluacionComposite);

		// Panel 5
		createComposite5();
		CTabItem cTabItem5 = new CTabItem(cTabFolder, SWT.NONE);
		cTabItem5.setText(TABS[cont++]);
		cTabItem5.setControl(bibliografiaComposite);

		// Panel6
		createComposite6();
		CTabItem cTabItem6 = new CTabItem(cTabFolder, SWT.NONE);
		cTabItem6.setText(TABS[cont++]);
		cTabItem6.setControl(asignaturaComposite);

		cTabFolder.setSelection(cTabItem);
		habilitarInicio(false);

	}

	//Composite para el panel de requisitos previos
	private void createComposite() {
		GridData gridData5 = new GridData();
		gridData5.horizontalAlignment = GridData.CENTER;
		gridData5.verticalAlignment = GridData.CENTER;
		GridData gridData4 = new GridData();
		gridData4.grabExcessHorizontalSpace = true;
		gridData4.horizontalAlignment = GridData.FILL;
		gridData4.verticalAlignment = GridData.FILL;
		gridData4.grabExcessVerticalSpace = true;
		requisitosComposite = new Composite(cTabFolder, SWT.NONE);
		requisitosComposite.setLayout(new GridLayout());
		requisitosText = new Text(requisitosComposite, SWT.MULTI | SWT.WRAP
				| SWT.V_SCROLL);
		requisitosText.setLayoutData(gridData4);

		requisitosText.setText(propiedadCurso.getRequisitosPrevios());

		requisitosText.addModifyListener(new ModifyListener() {
			//Si se modifica el texto hay que habilitar los botones de guardado
			@Override
			public void modifyText(ModifyEvent e) { 
				habilitarRequisitos(true);
				habilitarTodos(true);
			}

		});

		button1 = new Button(requisitosComposite, SWT.NONE);
		button1.setImage(img);
		button1.setLayoutData(gridData5);
		button1.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) { //Guardamos el contenido
				new EMFStoreCommand() {
					protected void doRun() {
						new EMFStoreCommand() {
							protected void doRun() {
								propiedadCurso
										.setRequisitosPrevios(requisitosText
												.getText());
							}
						}.run();

					}
				}.run(true);

				//Despues de guardar deshabilitamos el boton del panel y "guardar todo" si no hay más botones habilitados
				habilitarRequisitos(false);
				if (todosDeshabilitados()) {
					habilitarTodos(false);
				}
			}
		});

	}

	
	//Composite para el panel de las competencias
	private void createComposite3() {
		GridData gridData5 = new GridData();
		gridData5.horizontalAlignment = GridData.CENTER;
		gridData5.verticalAlignment = GridData.CENTER;
		GridData gridData4 = new GridData();
		gridData4.grabExcessHorizontalSpace = true;
		gridData4.horizontalAlignment = GridData.FILL;
		gridData4.verticalAlignment = GridData.FILL;
		gridData4.grabExcessVerticalSpace = true;
		competenciasComposite = new Composite(cTabFolder, SWT.NONE);
		competenciasComposite.setLayout(new GridLayout());
		competenciasText = new Text(competenciasComposite, SWT.MULTI | SWT.WRAP
				| SWT.V_SCROLL);
		competenciasText.setLayoutData(gridData4);
		competenciasText.setText(propiedadCurso.getCompetencias());

		competenciasText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				//Si se modifica el texto hay que habilitar los botones de guardado
				habilitarCompetencias(true);
				habilitarTodos(true);
			}

		});

		button3 = new Button(competenciasComposite, SWT.NONE);
		button3.setImage(img);
		button3.setLayoutData(gridData5);
		button3.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) { //Guardamos el contenido
				new EMFStoreCommand() {
					protected void doRun() {
						propiedadCurso.setCompetencias(competenciasText
								.getText());
					}
				}.run();

				//Despues de guardar deshabilitamos el boton del panel y "guardar todo" si no hay más botones habilitados
				habilitarCompetencias(false);
				if (todosDeshabilitados()) {
					habilitarTodos(false);
				}
			}
		});

	}

	private void createComposite4() {
		GridData gridData5 = new GridData();
		gridData5.horizontalAlignment = GridData.CENTER;
		gridData5.verticalAlignment = GridData.CENTER;
		GridData gridData4 = new GridData();
		gridData4.grabExcessHorizontalSpace = true;
		gridData4.horizontalAlignment = GridData.FILL;
		gridData4.verticalAlignment = GridData.FILL;
		gridData4.grabExcessVerticalSpace = true;
		evaluacionComposite = new Composite(cTabFolder, SWT.NONE);
		evaluacionComposite.setLayout(new GridLayout());
		evaluacionText = new Text(evaluacionComposite, SWT.MULTI | SWT.WRAP
				| SWT.V_SCROLL);
		evaluacionText.setLayoutData(gridData4);

		evaluacionText.setText(propiedadCurso.getSistemaEvaluacion());

		evaluacionText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				//Si se modifica el texto hay que habilitar los botones de guardado
				habilitarEvaluacion(true);
				habilitarTodos(true);
			}

		});

		button4 = new Button(evaluacionComposite, SWT.NONE);
		button4.setImage(img);
		button4.setLayoutData(gridData5);
		button4.addSelectionListener(new SelectionAdapter() {

			//Guardamos el contenido
			@Override
			public void widgetSelected(SelectionEvent e) {
				new EMFStoreCommand() {
					protected void doRun() {
						propiedadCurso.setSistemaEvaluacion(evaluacionText
								.getText());
					}
				}.run();
			
				//Despues de guardar deshabilitamos el boton del panel y "guardar todo" si no hay más botones habilitados
				habilitarEvaluacion(false);
				if (todosDeshabilitados()) {
					habilitarTodos(false);
				}
			}
		});
	}

	private void createComposite5() {
		GridData gridData5 = new GridData();
		gridData5.horizontalAlignment = GridData.CENTER;
		gridData5.verticalAlignment = GridData.CENTER;
		GridData gridData4 = new GridData();
		gridData4.grabExcessHorizontalSpace = true;
		gridData4.horizontalAlignment = GridData.FILL;
		gridData4.verticalAlignment = GridData.FILL;
		gridData4.grabExcessVerticalSpace = true;
		bibliografiaComposite = new Composite(cTabFolder, SWT.NONE);
		bibliografiaComposite.setLayout(new GridLayout());
		bibliografiaText = new Text(bibliografiaComposite, SWT.MULTI | SWT.WRAP
				| SWT.V_SCROLL);
		bibliografiaText.setLayoutData(gridData4);
		bibliografiaText.setText(propiedadCurso.getBibliografia());

		bibliografiaText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				habilitarBibliografia(true);
				habilitarTodos(true);
			}

		});

		button5 = new Button(bibliografiaComposite, SWT.NONE);
		button5.setImage(img);
		button5.setLayoutData(gridData5);
		button5.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) { 
				new EMFStoreCommand() {
					protected void doRun() {
						propiedadCurso.setBibliografia(bibliografiaText
								.getText());
					}
				}.run();
		
				//Despues de guardar deshabilitamos el boton del panel y "guardar todo" si no hay más botones habilitados
				habilitarBibliografia(false);
				if (todosDeshabilitados()) {
					habilitarTodos(false);
				}
			}
		});
	}

	//Composite para el panel asignatura: contendrá un texto para cada propiedad de la que se compone
	private void createComposite6() {
		GridData gridData13 = new GridData();
		gridData13.horizontalAlignment = GridData.BEGINNING;
		gridData13.grabExcessVerticalSpace = false;
		gridData13.verticalAlignment = GridData.CENTER;
		GridData gridData12 = new GridData();
		gridData12.horizontalAlignment = GridData.CENTER;
		gridData12.verticalAlignment = GridData.CENTER;
		GridData gridData11 = new GridData();
		gridData11.horizontalAlignment = GridData.FILL;
		gridData11.grabExcessVerticalSpace = true;
		gridData11.grabExcessHorizontalSpace = true;
		gridData11.verticalAlignment = GridData.FILL;
		GridData gridData10 = new GridData();
		gridData10.grabExcessHorizontalSpace = true;
		gridData10.verticalAlignment = GridData.FILL;
		gridData10.grabExcessVerticalSpace = true;
		gridData10.horizontalAlignment = GridData.FILL;
		GridData gridData9 = new GridData();
		gridData9.horizontalAlignment = GridData.FILL;
		gridData9.grabExcessVerticalSpace = true;
		gridData9.grabExcessHorizontalSpace = true;
		gridData9.verticalAlignment = GridData.FILL;
		GridData gridData8 = new GridData();
		gridData8.horizontalAlignment = GridData.FILL;
		gridData8.grabExcessVerticalSpace = true;
		gridData8.grabExcessHorizontalSpace = true;
		gridData8.verticalAlignment = GridData.FILL;
		GridData gridData7 = new GridData();
		gridData7.horizontalAlignment = GridData.FILL;
		gridData7.grabExcessVerticalSpace = true;
		gridData7.grabExcessHorizontalSpace = true;
		gridData7.verticalAlignment = GridData.FILL;
		GridData gridData6 = new GridData();
		gridData6.horizontalAlignment = GridData.FILL;
		gridData6.grabExcessVerticalSpace = true;
		gridData6.grabExcessHorizontalSpace = true;
		gridData6.verticalAlignment = GridData.FILL;
		GridData gridData5 = new GridData();
		gridData5.grabExcessHorizontalSpace = true;
		gridData5.verticalAlignment = GridData.FILL;
		gridData5.grabExcessVerticalSpace = true;
		gridData5.horizontalAlignment = GridData.FILL;
		GridData gridData4 = new GridData();
		gridData4.grabExcessHorizontalSpace = true;
		gridData4.verticalAlignment = GridData.FILL;
		gridData4.grabExcessVerticalSpace = true;
		gridData4.horizontalAlignment = GridData.FILL;
		GridLayout gridLayout2 = new GridLayout();
		gridLayout2.numColumns = 1;
		gridLayout2.horizontalSpacing = 5;
		gridLayout2.verticalSpacing = 5;
		gridLayout2.makeColumnsEqualWidth = false;
		asignaturaComposite = new Composite(cTabFolder, SWT.NONE);
		asignaturaComposite.setLayout(gridLayout2);
		Label asignaturaLabel = new Label(asignaturaComposite, SWT.NONE);
		asignaturaLabel.setText(ASIGTABLABEL[conta++]);
		asignaturaLabel.setLayoutData(gridData13);
		asignaturaText = new Text(asignaturaComposite, SWT.MULTI | SWT.WRAP
				| SWT.V_SCROLL);
		asignaturaText.setLayoutData(gridData4);

		asignaturaText.setText(propiedadCurso.getAsignatura());
		asignaturaText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				//Si se modifica el texto hay que habilitar los botones de guardado
				habilitarAsignaturas(true);
				habilitarTodos(true);
			}

		});

		Label areaLabel = new Label(asignaturaComposite, SWT.NONE);
		areaLabel.setText(ASIGTABLABEL[conta++]);
		areaText = new Text(asignaturaComposite, SWT.MULTI | SWT.WRAP
				| SWT.V_SCROLL);
		areaText.setLayoutData(gridData5);

		areaText.setText(propiedadCurso.getArea());

		areaText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				//Si se modifica el texto hay que habilitar los botones de guardado
				habilitarAsignaturas(true);
				habilitarTodos(true);
			}

		});

		Label ofertaLabel = new Label(asignaturaComposite, SWT.NONE);
		ofertaLabel.setText(ASIGTABLABEL[conta++]);
		ofertaText = new Text(asignaturaComposite, SWT.MULTI | SWT.WRAP
				| SWT.V_SCROLL);
		ofertaText.setLayoutData(gridData6);

		ofertaText.setText(propiedadCurso.getOferta());

		ofertaText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				//Si se modifica el texto hay que habilitar los botones de guardado
				habilitarAsignaturas(true);
				habilitarTodos(true);
			}

		});
		Label semestreLabel = new Label(asignaturaComposite, SWT.NONE);
		semestreLabel.setText(ASIGTABLABEL[conta++]);
		semestreText = new Text(asignaturaComposite, SWT.MULTI | SWT.WRAP
				| SWT.V_SCROLL);
		semestreText.setLayoutData(gridData8);

		semestreText.setText(propiedadCurso.getSemestre());

		semestreText.addModifyListener(new ModifyListener() {
			//Si se modifica el texto hay que habilitar los botones de guardado

			@Override
			public void modifyText(ModifyEvent e) {
				habilitarAsignaturas(true);
				habilitarTodos(true);
			}

		});
		Label creditosLabel = new Label(asignaturaComposite, SWT.NONE);
		creditosLabel.setText(ASIGTABLABEL[conta++]);
		creditosText = new Text(asignaturaComposite, SWT.MULTI | SWT.WRAP
				| SWT.V_SCROLL);
		creditosText.setLayoutData(gridData7);

		creditosText.setText(propiedadCurso.getCreditos());

		creditosText.addModifyListener(new ModifyListener() {
			//Si se modifica el texto hay que habilitar los botones de guardado

			@Override
			public void modifyText(ModifyEvent e) {
				habilitarAsignaturas(true);
				habilitarTodos(true);
			}

		});
		Label HGGLabel = new Label(asignaturaComposite, SWT.NONE);
		HGGLabel.setText(ASIGTABLABEL[conta++]);
		HGGText = new Text(asignaturaComposite, SWT.MULTI | SWT.WRAP
				| SWT.V_SCROLL);
		HGGText.setLayoutData(gridData9);

		HGGText.setText(propiedadCurso.getHoras_grp_gra());

		HGGText.addModifyListener(new ModifyListener() {
			//Si se modifica el texto hay que habilitar los botones de guardado

			@Override
			public void modifyText(ModifyEvent e) {
				habilitarAsignaturas(true);
				habilitarTodos(true);
			}

		});
		Label HGRLabel = new Label(asignaturaComposite, SWT.NONE);
		HGRLabel.setText(ASIGTABLABEL[conta++]);
		HGRText = new Text(asignaturaComposite, SWT.MULTI | SWT.WRAP
				| SWT.V_SCROLL);
		HGRText.setLayoutData(gridData11);

		HGRText.setText(propiedadCurso.getHoras_grp_red());

		HGRText.addModifyListener(new ModifyListener() {
			//Si se modifica el texto hay que habilitar los botones de guardado

			@Override
			public void modifyText(ModifyEvent e) {
				habilitarAsignaturas(true);
				habilitarTodos(true);
			}

		});
		Label coordinadorLabel = new Label(asignaturaComposite, SWT.NONE);
		coordinadorLabel.setText(ASIGTABLABEL[conta++]);
		coordinadorText = new Text(asignaturaComposite, SWT.MULTI | SWT.WRAP
				| SWT.V_SCROLL);
		coordinadorText.setLayoutData(gridData10);

		coordinadorText.setText(propiedadCurso.getCoordinador());

		coordinadorText.addModifyListener(new ModifyListener() {
			//Si se modifica el texto hay que habilitar los botones de guardado

			@Override
			public void modifyText(ModifyEvent e) {
				habilitarAsignaturas(true);
				habilitarTodos(true);
			}

		});
		button6 = new Button(asignaturaComposite, SWT.NONE);
		button6.setImage(img);
		button6.setLayoutData(gridData12);
		button6.addSelectionListener(new SelectionAdapter() {
			//Si se pulsa el boton de guardado se guarda el contenido en el modelo
			@Override
			public void widgetSelected(SelectionEvent e) { 
				new EMFStoreCommand() {
					protected void doRun() {
						propiedadCurso.setAsignatura(asignaturaText.getText());
						propiedadCurso.setArea(areaText.getText());
						propiedadCurso.setOferta(ofertaText.getText());
						propiedadCurso.setSemestre(semestreText.getText());
						propiedadCurso.setCreditos(creditosText.getText());
						propiedadCurso.setHoras_grp_gra(HGGText.getText());
						propiedadCurso.setHoras_grp_red(HGRText.getText());
						propiedadCurso.setCoordinador(coordinadorText.getText());
					}
				}.run();
			
				habilitarAsignaturas(false);
				if (todosDeshabilitados()) {
					habilitarTodos(false);
				}
			}
		});

	}

	
	public void habilitarRequisitos(boolean c) {
		button1.setEnabled(c);
	}

	

	public void habilitarCompetencias(boolean c) {
		button3.setEnabled(c);
	}

	public void habilitarEvaluacion(boolean c) {
		button4.setEnabled(c);
	}

	public void habilitarBibliografia(boolean c) {
		button5.setEnabled(c);
	}

	public void habilitarAsignaturas(boolean c) {
		button6.setEnabled(c);
	}

	public void habilitarTodos(boolean c) {
		button.setEnabled(c);
	}

	public boolean todosDeshabilitados() {
		return !button1.isEnabled() // && !button2.isEnabled()
				&& !button3.isEnabled()
				&& !button4.isEnabled()
				&& !button5.isEnabled() && !button6.isEnabled();
	}

	public void habilitarInicio(boolean p) {
		button1.setEnabled(p);
		// button2.setEnabled(p);
		button3.setEnabled(p);
		button4.setEnabled(p);
		button5.setEnabled(p);
		button6.setEnabled(p);
		button.setEnabled(p);

	}

}
