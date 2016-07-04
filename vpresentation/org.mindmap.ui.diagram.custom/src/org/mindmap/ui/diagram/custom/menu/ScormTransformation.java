package org.mindmap.ui.diagram.custom.menu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.emfstore.client.ESLocalProject;
import org.eclipse.emf.emfstore.internal.client.model.ProjectSpace;
//import org.eclipse.emf.emfstore.internal.client.model.ProjectSpace;
import org.eclipse.emf.emfstore.internal.client.model.filetransfer.FileDownloadStatus;
import org.eclipse.emf.emfstore.internal.client.model.filetransfer.FileInformation;
import org.eclipse.emf.emfstore.internal.client.model.util.WorkspaceUtil;
import org.eclipse.emf.emfstore.internal.common.model.util.FileUtil;
import org.eclipse.emf.emfstore.internal.server.exceptions.FileTransferException;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.image.ImageFileFormat;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.render.util.CopyToImageUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.mindmap.model.Actividad;
import org.mindmap.model.ActividadEspacio;
import org.mindmap.model.ArchivoAdjunto;
//import org.mindmap.model.Attachment;
import org.mindmap.model.Concepto;
import org.mindmap.model.Curso;
import org.mindmap.model.CursoDiagrama;
//import org.mindmap.model.CursoDiagram;
import org.mindmap.model.PropiedadCurso;
import org.mindmap.model.Prueba;
import org.mindmap.model.Leccion;
import org.mindmap.model.Tarea;
import org.mindmap.model.Tema;
import org.mindmap.model.control.ProjectControl;
import org.mindmap.model.control.ProjectUtilities;
import org.mindmap.ui.diagram.custom.application.ZipUtilities;

public class ScormTransformation 
{

	
	public static final String[] TABS = { "Requisitos previos", "Competencias",
			"Sistema de Evaluacion", "Bibliografia", "Asignatura" };

	public static final String[] ASIGTABLABEL = { "Asignatura", "Area",
			"Oferta", "Semestre", "Creditos", "Horas Grp. Gra",
			"Horas Grp. Red", "Coordinador" };



	private CursoDiagrama conceptsDiagram;
	private CursoDiagrama actDiagram;
	private PropiedadCurso propiedadCurso;

	

	public ScormTransformation(Curso curso) {
		conceptsDiagram = curso.getDiagramas().get(0);
		actDiagram = curso.getDiagramas().get(1);
		propiedadCurso = curso.getPropiedades();
	}

	
	

	private void copiarcontenido() {
		String path = ProjectUtilities.PROJECT_DIRECTORY + File.separator
				+ "cursoSco";

		EList<Actividad> listaActividades = actDiagram.getActividades();
		for (int i = 0; i < listaActividades.size(); i++) {
			EList<ActividadEspacio> lanes = listaActividades.get(i)
					.getEspacios();
			for (int j = 0; j < lanes.size(); j++) {
				EList<Tarea> tareas = lanes.get(j).getTareas();
				EList<Leccion> lecciones = lanes.get(j).getLecciones();

				for (int k = 0; k < tareas.size(); k++) {
					
					ArchivoAdjunto contenidoTarea = tareas.get(k)
							.getContenidos();
					if (contenidoTarea != null) {


						ProjectSpace ps = ProjectControl
								.getActualProjectSpace();
						FileInformation fileinfo = ps
								.getFileInfo(contenidoTarea.getFileIdentifier());
						try {
							final FileDownloadStatus status = ps
									.getFile(contenidoTarea.getFileIdentifier());

							if (fileinfo.isCached()) {
									File fo = status.getTransferredFile();

									File fd = new File(path + File.separator
											+ contenidoTarea.getNombre());
									FileUtil.copyFile(
											status.getTransferredFile(), fd);
								
							} else {
								final File fd = new File(path + File.separator
										+ contenidoTarea.getNombre());
								

									status.addTransferFinishedObserver(new Observer() {
										public void update(Observable o,
												Object arg) {
											
												try {
													FileUtil.copyFile(status.getTransferredFile(),
															fd);
												} catch (FileTransferException e) {
													// TODO Bloque catch generado automáticamente
													e.printStackTrace();
												} catch (IOException e) {
													// TODO Bloque catch generado automáticamente
													e.printStackTrace();
												}
												
										}
									});

									// Add observer that registers the exception
									// if the download
									// fails
									status.addDefaultFailObserver();

							

							}
						}catch (FileTransferException e2) {
							// TODO Bloque catch generado automáticamente
							e2.printStackTrace();
						} catch (IOException e) {
							// TODO Bloque catch generado automáticamente
							e.printStackTrace();
						}

						

					}
				}
				for (int k = 0; k < lecciones.size(); k++) {
				
					ArchivoAdjunto contenidoLeccion = lecciones.get(k)
							.getContenidos();
					if(contenidoLeccion!=null){
					ProjectSpace ps = ProjectControl
							.getActualProjectSpace();
					FileInformation fileinfo = ps
							.getFileInfo(contenidoLeccion.getFileIdentifier());
					try {
						final FileDownloadStatus status = ps
								.getFile(contenidoLeccion.getFileIdentifier());

						if (fileinfo.isCached()) {
								File fo = status.getTransferredFile();

								File fd = new File(path + File.separator
										+ contenidoLeccion.getNombre());
								FileUtil.copyFile(
										status.getTransferredFile(), fd);
							
						} else {
							final File fd = new File(path + File.separator
									+ contenidoLeccion.getNombre());
							

								status.addTransferFinishedObserver(new Observer() {
									public void update(Observable o,
											Object arg) {
										
											try {
												FileUtil.copyFile(status.getTransferredFile(),
														fd);
											} catch (FileTransferException e) {
												// TODO Bloque catch generado automáticamente
												e.printStackTrace();
											} catch (IOException e) {
												// TODO Bloque catch generado automáticamente
												e.printStackTrace();
											}
											
									
									}
								});

								//Añadimos observer que registre si la descarga falla
								status.addDefaultFailObserver();

						

						}
					}catch (FileTransferException e2) {
						// TODO Bloque catch generado automáticamente
						e2.printStackTrace();
					} catch (IOException e) {
						// TODO Bloque catch generado automáticamente
						e.printStackTrace();
					}
			
					}
				}

			}

		}

	}

	private void crearimagenes() {

		
		IEditorReference[] edrefs = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage()
				.getEditorReferences();
		IEditorReference conceptEditorRef = edrefs[0];
		IEditorPart conceptsEditor = conceptEditorRef.getEditor(false);
		Diagram de1 = ((DiagramEditor) conceptsEditor).getDiagram();
		IEditorReference actEditorRef = edrefs[1];
		IEditorPart actEditor = actEditorRef.getEditor(false);
		Diagram de2 = ((DiagramEditor) actEditor).getDiagram();

	
		CopyToImageUtil ctiu = new CopyToImageUtil();
		// Bloque
		IPath destination = new Path(ProjectUtilities.PROJECT_DIRECTORY
				+ File.separator + "cursoSco" + File.separator + "Bloques.png");
		ImageFileFormat format = ImageFileFormat.PNG;
		ProgressMonitorDialog progressMonitorDialog = new ProgressMonitorDialog(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
		progressMonitorDialog.open();
		IProgressMonitor monitor = progressMonitorDialog.getProgressMonitor();
		//Actividades
		IPath destination2 = new Path(ProjectUtilities.PROJECT_DIRECTORY
				+ File.separator + "cursoSco" + File.separator
				+ "Actividades.png");
		try {//copiamos diagramas a imagen en destination y destination2
			ctiu.copyToImage(de1.getDiagram(), destination, format, monitor,
					PreferencesHint.USE_DEFAULTS);
			ctiu.copyToImage(de2.getDiagram(), destination2, format, monitor,
					PreferencesHint.USE_DEFAULTS);

		} catch (CoreException e) {
			e.printStackTrace();
			try {
				throw new ExecutionException(e.toString());
			} catch (ExecutionException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} finally {
			progressMonitorDialog.close();
		}
	}



	private void crearmanifest() {
		String nombreCurso = ProjectControl.actualproject.getProjectName();
		List<Element> listaElementos = new LinkedList<Element>();

		File mani = new File(ProjectUtilities.PROJECT_DIRECTORY
				+ File.separator + "cursoSco" + File.separator
				+ "imsmanifest.xml");
		//root
		Document doc = new Document();
		Namespace ns = Namespace
				.getNamespace("http://www.imsproject.org/xsd/imscp_rootv1p1p2");

		Element root = new Element("manifest", ns);
		Namespace ns2 = Namespace.getNamespace("imsmd",
				"http://www.imsglobal.org/xsd/imsmd_rootv1p2p1");
		Namespace ns3 = Namespace.getNamespace("xsi",
				"http://www.w3.org/2001/XMLSchema-instance");
		Namespace ns4 = Namespace.getNamespace("adlcp",
				"http://www.adlnet.org/xsd/adlcp_rootv1p2");

		root.addNamespaceDeclaration(ns2);
		root.addNamespaceDeclaration(ns3);
		root.addNamespaceDeclaration(ns4);
		root.setAttribute("identifier", "MANIFEST-" + nombreCurso);// nombre del
																	// proyecto
		root.setAttribute(
				"schemaLocation",
				"http://www.imsproject.org/xsd/imscp_rootv1p1p2 imscp_rootv1p1p2.xsd http://www.imsglobal.org/xsd/imsmd_rootv1p2p1 imsmd_rootv1p2p1.xsd http://www.adlnet.org/xsd/adlcp_rootv1p2 adlcp_rootv1p2.xsd",
				ns3);

		doc.addContent(root);

		Random r = new Random();
		Integer idres = Math.abs(r.nextInt());
		int prim = idres;//guardamos el primer idrecurso para despues añadir los recursos a partir de prim consecutivamente
		Element org = new Element("organizations");
		org.setAttribute("default", "ORG-" + (Math.abs(new Random().nextInt())));
		root.addContent(org);

		Element organization = new Element("organization");
		organization.setAttribute("identifier", nombreCurso);// "Navegador");//
																// Poner nombre
																// del
																// proyecto en
																// curso
		organization.setAttribute("structure", "hierarchical");
		org.addContent(organization);
		Element organizationTitle = new Element("title");
		organizationTitle.setText("Introduccion");
		organization.addContent(organizationTitle);

		Random ro = new Random();
		int idorg = Math.abs(ro.nextInt());

		//Propiedades del curso
		Element characteristics = new Element("item");
		characteristics.setAttribute("identifier", "ITEM-" + (++idorg));
		characteristics.setAttribute("isvisible", "true");
		organization.addContent(characteristics);
		Element characteristicsTitle = new Element("title");
		characteristicsTitle.setText("Caracteristicas");
		characteristics.addContent(characteristicsTitle);

		for (int i = 0; i < TABS.length; i++) {
			Element orgcont = new Element("item");
			
			orgcont.setAttribute("identifier", TABS[i]);
			orgcont.setAttribute("identifierref", "RES-" + idres.toString()); // Asociar
																				// con
																				// resource
																				// correspondiente
			idres++;
			orgcont.setAttribute("isvisible", "true");
			Element elemTitle = new Element("title");
			elemTitle.setText(TABS[i]);
			orgcont.addContent(elemTitle);
			
			characteristics.addContent(orgcont);
		}

		//Mapas de curso->imagenes de los diagramas
		Element mapas = new Element("item");
		mapas.setAttribute("identifier", "ITEM-" + (++idorg));
		mapas.setAttribute("isvisible", "true");
		organization.addContent(mapas);
		Element mapasTitle = new Element("title");
		mapasTitle.setText("Mapas del curso");
		mapas.addContent(mapasTitle);

		Element imgblock = new Element("item");

		imgblock.setAttribute("identifier", "ITEM-" + (++idorg));
		imgblock.setAttribute("identifierref", "RES-" + idres.toString()); // Asociar
																			// con
																			// resource
																			// correspondiente
		idres++;
		imgblock.setAttribute("isvisible", "true");

		mapas.addContent(imgblock);
		Element imgblockTitle = new Element("title");
		imgblockTitle.setText("Bloques");
		imgblock.addContent(imgblockTitle);

		Element imgActivities = new Element("item");
		imgActivities.setAttribute("identifier", "ITEM-" + (++idorg));
		imgActivities.setAttribute("identifierref", "RES-" + idres.toString()); // Asociar
																				// con
																				// resource
																				// correspondiente
		idres++;
		imgActivities.setAttribute("isvisible", "true");

		mapas.addContent(imgActivities);
		Element imgActivitiesTitle = new Element("title");
		imgActivitiesTitle.setText("Actividades");
		imgActivities.addContent(imgActivitiesTitle);

		// Bloques navegador->asociar con html
		Element bloques = new Element("item");
		bloques.setAttribute("identifier", "ITEM-" + (++idorg));
		bloques.setAttribute("isvisible", "true");
		bloques.setAttribute("identifierref", "RES-" + idres.toString()); // Asociar
																			// con
																			// html
		idres++;
		organization.addContent(bloques);
		Element bloquesTitle = new Element("title");
		bloquesTitle.setText("Bloques");
		bloques.addContent(bloquesTitle);

		EList<Tema> listaBloques = conceptsDiagram.getTemas();
		for (int i = 0; i < listaBloques.size(); i++) {
			Element bloque = new Element("item");
			bloque.setAttribute("identifier", "ITEM-" + (++idorg));
			bloque.setAttribute("isvisible", "true");
			bloques.addContent(bloque);
			Element bloqueTitle = new Element("title");
			bloqueTitle
					.setText("Bloque: " + listaBloques.get(i).getNombre() == null ? ""
							: listaBloques.get(i).getNombre());
			bloque.addContent(bloqueTitle);

			EList<Concepto> listaConceptos = listaBloques.get(i).getConceptos();
			for (int j = 0; j < listaConceptos.size(); j++) {
				Element concepto = new Element("item");
				concepto.setAttribute("identifier", "ITEM-" + (++idorg));
				concepto.setAttribute("isvisible", "true");
				
				bloque.addContent(concepto);
				Element conceptoTitle = new Element("title");
				conceptoTitle.setText("Concepto: "
						+ listaConceptos.get(j).getNombre() == null ? ""
						: listaConceptos.get(j).getNombre());
				concepto.addContent(conceptoTitle);
		
			}
		}

		//Actividades navegador->asociar a su html
		Element actividades = new Element("item");
		actividades.setAttribute("identifier", "ITEM-" + (++idorg));
		actividades.setAttribute("isvisible", "true");
		actividades.setAttribute("identifierref", "RES-" + idres.toString()); // Asociar
																				// con
																				// html
		idres++;
		organization.addContent(actividades);
		Element actividadesTitle = new Element("title");
		actividadesTitle.setText("Actividades");
		actividades.addContent(actividadesTitle);

		EList<Actividad> listaActividades = actDiagram.getActividades();
		for (int i = 0; i < listaActividades.size(); i++) {
			Element actividad = new Element("item");
			actividad.setAttribute("identifier", "ITEM-" + (++idorg));
			actividad.setAttribute("isvisible", "true");

			actividades.addContent(actividad);
			Element actividadTitle = new Element("title");
			actividadTitle.setText("Actividad: "
					+ listaActividades.get(i).getNombre() == null ? ""
					: listaActividades.get(i).getNombre());
			actividad.addContent(actividadTitle);

			EList<ActividadEspacio> lanes = listaActividades.get(i)
					.getEspacios();
			for (int j = 0; j < lanes.size(); j++) {

				Element lane = new Element("item");
				lane.setAttribute("identifier", "ITEM-" + (++idorg));
				lane.setAttribute("isvisible", "true");
				actividad.addContent(lane);
				Element laneTitle = new Element("title");
				laneTitle
						.setText("Espacio: " + lanes.get(j).getNombre() == null ? ""
								: lanes.get(j).getNombre());
				lane.addContent(laneTitle);

				EList<Leccion> lecciones = lanes.get(j).getLecciones();
				EList<Tarea> tareas = lanes.get(j).getTareas();
				EList<Prueba> exams = lanes.get(j).getPruebas();

				for (int k = 0; k < lecciones.size(); k++) {
					Element leccion = new Element("item");
					leccion.setAttribute("identifier", "ITEM-" + (++idorg));
					leccion.setAttribute("isvisible", "true");
					
					lane.addContent(leccion);
					Element leccionTitle = new Element("title");
					leccionTitle.setText("Lección: "
							+ lecciones.get(k).getNombre() == null ? ""
							: lecciones.get(k).getNombre());
					leccion.addContent(leccionTitle);
					// Asociar con su recurso Contenido
					if (lecciones.get(k).getContenidos() != null) {
						leccion.setAttribute("identifierref",
								"RES-" + idres.toString()); // Asociar con
															// recurso
						idres++;
						String text = lecciones.get(k).getContenidos()
								.getNombre();
						Element resleccion = new Element("resource");
						Integer temp = idres - 1;
						resleccion.setAttribute("identifier",
								"RES-" + temp.toString());
						resleccion.setAttribute("type", "webcontent");
						resleccion.setAttribute("href", text.substring(text
								.lastIndexOf(File.separator) + 1));
						resleccion.setAttribute("scormtype", "sco", ns4);
						// resources.addContent(resleccion); ALMACENAR

						Element fileleccion = new Element("file");
						resleccion.addContent(fileleccion);
						fileleccion.setAttribute("href", text.substring(text
								.lastIndexOf(File.separator) + 1));

						listaElementos.add(resleccion);

					}
				}
				for (int k = 0; k < tareas.size(); k++) {
					Element tarea = new Element("item");
					tarea.setAttribute("identifier", "ITEM-" + (++idorg));
					tarea.setAttribute("isvisible", "true");
					
					lane.addContent(tarea);
					Element tareaTitle = new Element("title");
					tareaTitle
							.setText("Tarea: " + tareas.get(k).getNombre() == null ? ""
									: tareas.get(k).getNombre());
					tarea.addContent(tareaTitle);
					// Asociar con su recurso Contenido
					if (tareas.get(k).getContenidos() != null) {
						tarea.setAttribute("identifierref",
								"RES-" + idres.toString()); // Asociar con html
						idres++;
						String text = tareas.get(k).getContenidos().getNombre();
						Element restarea = new Element("resource");
						Integer temp = idres - 1;
						restarea.setAttribute("identifier",
								"RES-" + temp.toString());
						restarea.setAttribute("type", "webcontent");
						restarea.setAttribute("href", text.substring(text
								.lastIndexOf(File.separator) + 1));
						restarea.setAttribute("scormtype", "sco", ns4);

						Element filetarea = new Element("file");
						restarea.addContent(filetarea);
						filetarea.setAttribute("href", text.substring(text
								.lastIndexOf(File.separator) + 1));

						listaElementos.add(restarea);

					}
				}

				for (int k = 0; k < exams.size(); k++) {
					Element exam = new Element("item");
					exam.setAttribute("identifier", "ITEM-" + (++idorg));
					exam.setAttribute("isvisible", "true");
					
					lane.addContent(exam);
					Element examTitle = new Element("title");
					examTitle
							.setText("Prueba: " + exams.get(k).getNombre() == null ? ""
									: exams.get(k).getNombre());
					exam.addContent(examTitle);
				}
			}

		}

		// RECURSOS
		Element resources = new Element("resources");
		root.addContent(resources);

		// primero caracteristicas

		for (int i = 0; i < TABS.length; i++) {
			
				Element rescont = new Element("resource");
				rescont.setAttribute("identifier", "RES-" + (prim++));
				rescont.setAttribute("type", "webcontent");
				rescont.setAttribute("href", TABS[i] + ".html");
				rescont.setAttribute("scormtype", "sco", ns4);
				resources.addContent(rescont);
				Element filecont = new Element("file");
				rescont.addContent(filecont);
				filecont.setAttribute("href", TABS[i] + ".html");

			
		}

		// segundo mapas
		Element resimgblock = new Element("resource");
		resimgblock.setAttribute("identifier", "RES-" + (prim++));
		resimgblock.setAttribute("type", "webcontent");
		resimgblock.setAttribute("href", "Bloques.png");
		resimgblock.setAttribute("scormtype", "sco", ns4);

		resources.addContent(resimgblock);
		Element fileimgblock = new Element("file");
		resimgblock.addContent(fileimgblock);
		fileimgblock.setAttribute("href", "Bloques.png");

		Element resimgact = new Element("resource");
		resimgact.setAttribute("identifier", "RES-" + (prim++));
		resimgact.setAttribute("type", "webcontent");
		resimgact.setAttribute("href", "Actividades.png");
		resimgact.setAttribute("scormtype", "sco", ns4);
		resources.addContent(resimgact);
		Element fileimgact = new Element("file");
		resimgact.addContent(fileimgact);
		fileimgact.setAttribute("href", "Actividades.png");

		// Bloques
		Element resblock = new Element("resource");
		resblock.setAttribute("identifier", "RES-" + (prim++));
		resblock.setAttribute("type", "webcontent");
		resblock.setAttribute("href", "concepts.html");
		resblock.setAttribute("scormtype", "sco", ns4);
		resources.addContent(resblock);
		Element fileblock = new Element("file");
		resblock.addContent(fileblock);
		fileblock.setAttribute("href", "concepts.html"); // html

		// Actividades
		Element resact = new Element("resource");
		resact.setAttribute("identifier", "RES-" + (prim++));
		resact.setAttribute("type", "webcontent");
		resact.setAttribute("href", "activities.html");
		resact.setAttribute("scormtype", "sco", ns4);
		resources.addContent(resact);
		Element fileact = new Element("file");
		resact.addContent(fileact);
		fileact.setAttribute("href", "activities.html"); // html

		for (int i = 0; i < listaElementos.size(); i++) {
			resources.addContent(listaElementos.get(i));
			prim++;
		}

		/******** ESTILO ******/
		Element resstyle = new Element("resource");
		resstyle.setAttribute("identifier", "RES-" + (prim++));
		resstyle.setAttribute("type", "webcontent");
		resstyle.setAttribute("href", "style/style.css");
		resstyle.setAttribute("scormtype", "asset", ns4);
		resources.addContent(resstyle);
		Element filestyle = new Element("file");
		resstyle.addContent(filestyle);
		filestyle.setAttribute("href", "style/style.css"); // html

		Format format = Format.getPrettyFormat();
		// Creamos el serializador con el formato deseado
		XMLOutputter xmloutputter = new XMLOutputter(format);

		FileWriter writer = null;
		try {

			writer = new FileWriter(mani);
			xmloutputter.output(doc, writer);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	

	private void copyDirectory(File srcDir, File dstDir) {
		try {
			if (srcDir.isDirectory()) {
				if (!dstDir.exists()) {
					dstDir.mkdir();
				}

				String[] children = srcDir.list();
				for (int i = 0; i < children.length; i++) {
					copyDirectory(new File(srcDir, children[i]), new File(
							dstDir, children[i]));
				}
			} else {
				copyFile(srcDir, dstDir);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * Copia un solo archivo
	 * 
	 * @param s
	 * @param t
	 * @throws IOException
	 */
	public void copyFile(File s, File t) {
		try {
			FileChannel in = (new FileInputStream(s)).getChannel();
			FileChannel out = (new FileOutputStream(t)).getChannel();
			in.transferTo(0, s.length(), out);
			in.close();
			out.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void copiarFicheros(File f1, File f2) {

		try {
			InputStream in = new FileInputStream(f1);
			OutputStream out = new FileOutputStream(f2);

			byte[] buf = new byte[1024];
			int len;

			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}

			in.close();
			out.close();

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	

	private void crearhtml() {
		
		TransformationHTML t = new TransformationHTML(
				(EObject) conceptsDiagram, (EObject) actDiagram);
		t.generate2();
	}


	public static boolean scormExecution = false;

	public boolean generate2() {
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();

	boolean success=true;

		

			
			// Get output directory
			FileDialog fileDialog = new FileDialog(window.getShell(), SWT.SAVE);
			fileDialog.setOverwrite(true);

			fileDialog.setText("Generar salida");
			// fileDialog.setMessage("Selecciona el directorio de salida");
			String outputDir = fileDialog.open();
			if (outputDir == null) {
				return false;
			}

			scormExecution = true;

			// Hay que usar la carpeta template y crear el manifest

			File scoPath = new File(ProjectUtilities.PROJECT_DIRECTORY
					+ File.separator + "cursoSco");
			// if (!scoPath.exists()) {
			scoPath.mkdir(); // Project_directory se crea con la apertura del
								// proyecto

			File temp = new File("templates"); // templates ims para scorm
			copyDirectory(temp, scoPath);

			// Añadir estilo

			File scoPathst = new File(ProjectUtilities.PROJECT_DIRECTORY
					+ File.separator + "cursoSco" + File.separator + "style");
			// if (!scoPath.exists()) {
			scoPathst.mkdir(); // Project_directory se crea con la apertura del
								// proyecto

			File st = new File("style");
			copyDirectory(st, scoPathst);

			// Añadir a la carpeta Ficheros: imagenes,html y caracteristicas

			crearimagenes();
			crearhtml();
			crearficheros2();

			// Contenido de tareas y lecciones
			copiarcontenido();
			// Crear el manifest

			crearmanifest();

			File projectFile = new File(outputDir);

			try {
				ZipUtilities.zipScorm(projectFile, scoPath);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

				Status status = new Status(IStatus.ERROR, "My Plug-in ID",
						e.getMessage());
				ErrorDialog.openError(window.getShell(), "Error",
						e.getMessage(), status);
				success=false;

			} finally {
				scormExecution = false;
			}

	

		return success;
	}

	// Creamos los ficheros con las propiedades del curso
	private void crearficheros2() {

		PrintWriter pwF = null;
		try {
			File filereq = new File(ProjectUtilities.PROJECT_DIRECTORY
						+ File.separator + "cursoSco" + File.separator
						+ "Requisitos previos" + ".html");
			
			FileOutputStream fosF =	new FileOutputStream(filereq);
			OutputStreamWriter oswF =
					new OutputStreamWriter(fosF,"UTF-8");
			pwF =new PrintWriter(oswF);
			String requisitos = propiedadCurso.getRequisitosPrevios();
			
			String treq =PropiedadesHtml(requisitos,"Requisitos previos");
			pwF.println(treq);
			pwF.close();

			String competencias = propiedadCurso.getCompetencias();
			File filecomp = new File(ProjectUtilities.PROJECT_DIRECTORY
					+ File.separator + "cursoSco" + File.separator
					+ "Competencias" + ".html");

			fosF =	new FileOutputStream(filecomp);
			oswF =
					new OutputStreamWriter(fosF,"UTF-8");
			pwF =new PrintWriter(oswF);

			String tcomp = PropiedadesHtml(competencias,"Competencias");
			
			pwF.println(tcomp);
			pwF.close();

			String evaluacion = propiedadCurso.getSistemaEvaluacion();
			File fileev = new File(ProjectUtilities.PROJECT_DIRECTORY
					+ File.separator + "cursoSco" + File.separator
					+ "Sistema de Evaluacion" + ".html");
			fosF =	new FileOutputStream(fileev);
			oswF =
					new OutputStreamWriter(fosF,"UTF-8");
			pwF =new PrintWriter(oswF);
			
			String tev = PropiedadesHtml(evaluacion,"Sistema de Evaluación");
			
			pwF.println(tev);
			pwF.close();

			String bibliografia = propiedadCurso.getBibliografia();
			File filebi = new File(ProjectUtilities.PROJECT_DIRECTORY
					+ File.separator + "cursoSco" + File.separator
					+ "Bibliografia" + ".html");
			fosF =	new FileOutputStream(filebi);
			oswF =
					new OutputStreamWriter(fosF,"UTF-8");
			pwF =new PrintWriter(oswF);

			String tb = PropiedadesHtml(bibliografia,"Bibliografia");
		
			pwF.println(tb);
			pwF.close();

			/** Ahora Asignatura **/
			File fileasig = new File(ProjectUtilities.PROJECT_DIRECTORY
					+ File.separator + "cursoSco" + File.separator
					+ "Asignatura" + ".html");
			fosF =	new FileOutputStream(fileasig);
			oswF =
					new OutputStreamWriter(fosF,"UTF-8");
			pwF =new PrintWriter(oswF);
			String ti = "<!doctype html>\n<html>\n<head>\n<meta charset=\"UTF-8\">\n<link rel=\"stylesheet\" type=\"text/css\" href=\"style/style.css\">\n<title>Curso</title>\n</head>\n><body>\n"
					+ "<h2>Asignatura</h2>\n";
			pwF.println(ti);
			pwF.println("<div class=\"caja\">\n<h3>Area</h3>\n<p>"+ propiedadCurso.getArea() +"</p>\n</div>\n");
			pwF.println("<div class=\"caja\">\n<h3>Asignatura</h3>\n<p>" + propiedadCurso.getAsignatura()+"</p>\n</div>\n");
					
			pwF.println("<div class=\"caja\">\n<h3>Oferta</h3>\n<p>" + propiedadCurso.getOferta() + "</p>\n</div>\n");
			pwF.println("<div class=\"caja\">\n<h3>Semestre</h3>\n<p>" + propiedadCurso.getSemestre()
					+ "</p>\n</div>\n");
			pwF.println("<div class=\"caja\">\n<h3>Creditos</h3>\n<p>" + propiedadCurso.getCreditos()
					+ "</p>\n</div>\n");
			pwF.println("<div class=\"caja\">\n<h3>Horas Grp. Gra</h3>\n<p>"
					+ propiedadCurso.getHoras_grp_gra() + "</p>\n</div>\n");
			pwF.println("<div class=\"caja\">\n<h3>Horas Grp. Red</h3>\n<p>"
					+ propiedadCurso.getHoras_grp_red() + "</p>\n</div>\n");
			pwF.println("<div class=\"caja\">\n<h3>Coordinador</h3>\n<p>" + propiedadCurso.getCoordinador()
					+ "</p>\n</div>\n");

			String tf = "</body>\n</html>\n";

			pwF.println(tf);
			pwF.close();

		} catch (IOException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		} finally {

			pwF.close();

		}
		
	}

	private String PropiedadesHtml(String texto,String feature)
	{
		String head="<!doctype html><html>\n<head>\n<meta charset=\"UTF-8\">\n<link rel=\"stylesheet\" type=\"text/css\" href=\"style/style.css\">\n<title>Curso</title>\n</head>\n";
		String body="<body>\n<div class=\"caja\">\n";
		String contenido="<h2>"+feature+"</h2>\n"+"<p>"+texto+"</p>\n";
		String end="</div>\n</body>\n</html>\n";
		return head+body+contenido+end;
	}
}
