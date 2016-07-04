package org.mindmap.ui.diagram.custom.menu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.channels.FileChannel;
import java.util.Iterator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.emfstore.client.ESLocalProject;
import org.eclipse.emf.emfstore.internal.common.model.impl.ProjectImpl;
import org.eclipse.emf.emfstore.internal.common.model.util.FileUtil;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.mofscript.parser.MofScriptParseError;
import org.eclipse.mofscript.parser.ParserUtil;
import org.eclipse.mofscript.runtime.ExecutionManager;
//import org.eclipse.mofscript.parser.MofScriptParseError;
//import org.eclipse.mofscript.parser.ParserUtil;
//import org.eclipse.mofscript.runtime.ExecutionManager;
//import org.eclipse.mofscript.runtime.ExecutionMessageListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.mindmap.model.CursoDiagrama;
import org.mindmap.model.control.ProjectControl;
import org.mindmap.model.control.ProjectUtilities;
import org.mindmap.ui.diagram.custom.application.ApplicationFilesParser;

public class TransformationHTML {

	private CursoDiagrama cd;
	private CursoDiagrama ad;
	private boolean success = true;

	public TransformationHTML(EObject conceptsdiagram, EObject actdiagram) {
		cd = (CursoDiagrama) conceptsdiagram;
		ad = (CursoDiagrama) actdiagram;
	}

	// ---------------------------------------------------------------------------
	// Private Methods

	/**
	 * Parses a transformation
	 * 
	 * @return number of parse errors
	 */
	private int parse(String transformation) {
		File f = new File(transformation);
		ParserUtil parserUtil = new ParserUtil();
		parserUtil.setCompilePath(transformation);
		parserUtil.parse(f, true);
		int errorCount = ParserUtil.getModelChecker().getErrorCount();

		// check for errors:
		Iterator<?> errorIt = ParserUtil.getModelChecker().getErrors();
		System.out.println("Parsing result: " + errorCount + " errors");
		if (errorCount > 0) {
			for (; errorIt.hasNext();) {
				MofScriptParseError parseError = (MofScriptParseError) errorIt
						.next();
				System.out.println("\t \t: Error: " + parseError.toString());
			}
		}
		return errorCount;
	}

	/**
	 * Executes the transformation.
	 * 
	 * @param inputModel
	 *            The name (path) of the input model.
	 * @param outputFilePath
	 *            The path of the output file.
	 * @return <i>true</i> if the execution has been successful, <i>false</i>
	 *         otherwise.
	 */
	private boolean execute(CursoDiagrama inputModel, String outputFilePath) {// (String
																				// inputModel,
																				// String
																				// outputFilePath)
																				// {
		ExecutionManager execMgr = ExecutionManager.getExecutionManager();

		EObject sourceModel = inputModel;

		execMgr.addSourceModel(sourceModel);

		// sets the root output directory
		File outputFile = new File(outputFilePath);
		execMgr.setRootDirectory(outputFile.getParentFile().getAbsolutePath());

		// if true, files are not generated to the file system, but populated
		// into a
		// filemodel which can be fetched afterwards. Value false will result in
		// standard file generation
		execMgr.setUseFileModel(false);

		// Turns off system logging
		execMgr.setUseLog(false);

		// Sets the output filename in an environment variable
		System.setProperty(TRANSFORMATION_OUTPUT_FILENAME, outputFile.getName());

		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();

		try {
			execMgr.executeTransformation();
			return true;
		} catch (Exception mex) {
			mex.printStackTrace();
			showError(
					window.getShell(),
					"Se ha producido un error al generar el fichero de salida.",
					mex.getMessage());
			return false;
		}
	}

	// ---------------------------------------------------------------------------
	// Private Methods

	/**
	 * Shows an error message.
	 */
	private void showError(Shell shell, String message, String causeMessage) {
		Status status = new Status(IStatus.ERROR, "My Plug-in ID", causeMessage);

		ErrorDialog.openError(shell, "Error", message, status);
	}

	// ---------------------------------------------------------------------------
	// Private Attributes

	// ---------------------------------------------------------------------------
	// Private Constants

	private static final String TRANSFORMATION_OUTPUT_FILENAME = "transformationOutputFilename";
	private static final String REFERENCE_FILENAME = "referenceFilename";

	private static final String CONCEPTS_OUTPUT_FILE = "concepts.html";
	private static final String ACTIVITIES_OUTPUT_FILE = "activities.html";

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
			success = false;
			System.out.println(e);
		}
	}

	public boolean generate2() {
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();

		String outputDir = null;

		if (!ScormTransformation.scormExecution) {
			DirectoryDialog dirDialog = new DirectoryDialog(window.getShell(),
					SWT.SAVE);
			dirDialog.setText("Generar salida");
			dirDialog.setMessage("Selecciona el directorio de salida");
			outputDir = dirDialog.open();
			if (outputDir == null) {
				return false;
			}
		} else {
			outputDir = ProjectUtilities.PROJECT_DIRECTORY + File.separator
					+ "cursoSco";
		}
		// Transform Concepts diagram
		String transformation = ApplicationFilesParser.getInstance()
				.getConceptsTransformationFile();
		int errs = parse(transformation);
		if (errs == 0) {

			success &= execute(cd, outputDir + File.separator
					+ CONCEPTS_OUTPUT_FILE);
		}

		// Transform Activities diagram
		transformation = ApplicationFilesParser.getInstance()
				.getActivitiesTransformationFile();
		errs = parse(transformation);
		if (errs == 0) {

			System.setProperty(REFERENCE_FILENAME, ACTIVITIES_OUTPUT_FILE);
			success &= execute(ad, outputDir + File.separator
					+ ACTIVITIES_OUTPUT_FILE);

		}

		if (!ScormTransformation.scormExecution) {

			File style = new File("style");

			File styleDir = new File(style.getAbsolutePath() + File.separator
					+ "style.css");

			File fd = new File(outputDir + File.separator + "style");
			fd.mkdir();
			File fs = new File(fd + File.separator + "style.css");
			copyFile(styleDir, fs);

			// Añadimos el index
			crearIndex(outputDir);
		}

		return success;
	}

	private void crearIndex(String outdir) {
		File fileindex = new File(outdir + File.separator + "index.html");
		PrintWriter pwF=null;
		try {
		FileOutputStream fosF =	new FileOutputStream(fileindex);
		OutputStreamWriter oswF =
				new OutputStreamWriter(fosF,"UTF-8");
		pwF =new PrintWriter(oswF);
		

			String head = "<!doctype html>\n<html>\n<head>\n<meta charset=\"utf-8\">\n<link rel=\"stylesheet\" type=\"text/css\" href=\"style/style.css\">\n<title>Índice</title>\n</head>\n";
			String body = "<body>\n<div id=\"cabecera\">\n";
			String contenido = "<h2>Índice</h2>\n</div>\n<div class=\"caja\">\n";
			String bloques = "<h3><a href=\"concepts.html\">Bloques temáticos</a></h3>\n";
			String actividades = "<h3><a href=\"activities.html\">Actividades</a></h3>\n";
			String end = "</div>\n</body>\n</html>\n";
			String total = head + body + contenido + bloques + actividades
					+ end;
			
			
			pwF.println(total);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		
			pwF.close();
		}
	}
}
