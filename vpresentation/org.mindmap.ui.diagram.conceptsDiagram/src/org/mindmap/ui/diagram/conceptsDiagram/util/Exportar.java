package org.mindmap.ui.diagram.conceptsDiagram.util;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.emfstore.client.ESLocalProject;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.mindmap.model.Curso;
import org.mindmap.model.control.ProjectControl;

//import org.mindmap.ui.diagram.conceptsDiagram.part.ValidateAction;
import org.mindmap.ui.diagram.custom.menu.ExportarDialog;
import org.mindmap.ui.diagram.custom.menu.ScormTransformation;
import org.mindmap.ui.diagram.custom.menu.TransformationHTML;

public class Exportar extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);

		boolean success = false;
		IEditorReference[] edrefs = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage()
				.getEditorReferences();
		if (edrefs.length < 2) {
			MessageDialog.openError(PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getShell(), "Error",
					"Todos los editores deben estar abiertos para ser exportados");
		} else {
			// Obtenemos los diagramas de los editores y llamamos a validar
			IEditorReference conceptEditorRef = edrefs[0];
			IEditorPart conceptsEditor = conceptEditorRef.getEditor(false);
			Diagram de1 = ((DiagramEditor) conceptsEditor).getDiagram();
			IEditorReference actEditorRef = edrefs[1];
			IEditorPart actEditor = actEditorRef.getEditor(false);
			Diagram de2 = ((DiagramEditor) actEditor).getDiagram();

			Diagnostic res1 = org.mindmap.ui.diagram.conceptsDiagram.part.ValidateAction
					.validateExport(de1);
			Diagnostic res2 = org.mindmap.ui.diagram.actividadDiagram.part.ValidateAction
					.validateExport(de2);

			if (!(res1.getCode()==(Diagnostic.OK_INSTANCE.getCode()) && res2.getCode()==(Diagnostic.OK_INSTANCE.getCode()))) {
				if (!MessageDialog
						.openConfirm(
								PlatformUI.getWorkbench()
										.getActiveWorkbenchWindow().getShell(),
								"Error",
								"Los diagramas contienen errores. ¿Quiere continuar la exportación?\n En ese caso las exportaciones pueden contener errores o resultados no deseados.")) {
					return null;
				}
			}
			ExportarDialog dialog = new ExportarDialog(window.getShell());
			int option = dialog.open();

			ESLocalProject proyecto = ProjectControl.actualproject;
			EList<EObject> m = proyecto.getModelElements();

			// Elementos curso y diagramas del modelo
			Curso curso = (Curso) m.get(0);

			EObject conceptsdiagram = curso.getDiagramas().get(0);

			EObject actdiagram = curso.getDiagramas().get(1);

			if (option == 1) {// scorm

				ScormTransformation st = new ScormTransformation(curso);
				success = st.generate2();

			} else if (option == 2) {// html

				TransformationHTML t = new TransformationHTML(conceptsdiagram,
						actdiagram);
				success = t.generate2();

			}

			if (success) {
				MessageDialog.openInformation(window.getShell(), "Información",
						"Ficheros de salida creados correctamente.");
			}
		}
		return null;

	}

	// ---------------------------------------------------------------------------
	// Private Methods

	/**
	 * Parses a transformation
	 * 
	 * @return number of parse errors
	 */
	/*
	 * private int parse(String transformation) { File f = new
	 * File(transformation); ParserUtil parserUtil = new ParserUtil();
	 * parserUtil.parse(f, true); int errorCount =
	 * ParserUtil.getModelChecker().getErrorCount();
	 * 
	 * // check for errors: Iterator<?> errorIt =
	 * ParserUtil.getModelChecker().getErrors();
	 * System.out.println("Parsing result: " + errorCount + " errors"); if
	 * (errorCount > 0) { for (; errorIt.hasNext();) { MofScriptParseError
	 * parseError = (MofScriptParseError) errorIt .next();
	 * System.out.println("\t \t: Error: " + parseError.toString()); } } return
	 * errorCount; }
	 * 
	 * /** Saves the model taken from the given database URI in a file.
	 * 
	 * @param dbUri The database URI.
	 * 
	 * @param fileName The file to save the model.
	 * 
	 * @return The complete path of the saved file.
	 * 
	 * @throws Exception If there is some problem while saving the file.
	 */
	/*
	 * private String saveModelToFile(URI dbUri, String fileName) throws
	 * Exception { // Create the directory if it does not exist File dir = new
	 * File(ProjectUtilities.PROJECT_DIRECTORY); if (!dir.exists()) {
	 * dir.mkdir(); }
	 * 
	 * String filePath = ProjectUtilities.PROJECT_DIRECTORY + File.separator +
	 * fileName;
	 * 
	 * HibernateXMLResource res = new HibernateXMLResource(dbUri);
	 * res.load(Collections.EMPTY_MAP);
	 * 
	 * // Save the model in the file res.save(new FileWriter(filePath),
	 * Collections.EMPTY_MAP); res.unload();
	 * 
	 * return filePath; }
	 */

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
	/*
	 * private boolean execute(String inputModel, String outputFilePath) {
	 * ExecutionManager execMgr = ExecutionManager.getExecutionManager();
	 * XMIResourceFactoryImpl _xmiFac = new XMIResourceFactoryImpl(); EObject
	 * sourceModel = null; File sourceModelFile = new File(inputModel);
	 * ResourceSet rSet = new ResourceSetImpl();
	 * rSet.getResourceFactoryRegistry().getExtensionToFactoryMap() .put("*",
	 * _xmiFac); URI uri = URI.createFileURI(sourceModelFile.getAbsolutePath());
	 * Resource resource = null;
	 * 
	 * resource = rSet.getResource(uri, true);
	 * 
	 * if (resource != null) { if (resource.getContents().size() > 0) {
	 * sourceModel = (EObject) resource.getContents().get(0); } } EList<EObject>
	 * s2 = sourceModel.eContents();
	 * 
	 * // set the source model for the execution manager
	 * execMgr.addSourceModel(sourceModel);
	 * 
	 * // sets the root output directory File outputFile = new
	 * File(outputFilePath);
	 * execMgr.setRootDirectory(outputFile.getParentFile().getAbsolutePath());
	 * 
	 * // if true, files are not generated to the file system, but populated //
	 * into a // filemodel which can be fetched afterwards. Value false will
	 * result in // standard file generation execMgr.setUseFileModel(false);
	 * 
	 * // Turns off system logging execMgr.setUseLog(false);
	 * 
	 * // Adds an output listener for the transformation execution.
	 * execMgr.getExecutionStack().addOutputMessageListener( new
	 * ExecutionMessageListener() {
	 * 
	 * public void executionMessage(String type, String description) { // TODO
	 * it can be used for getting messages from the // conversion } });
	 * 
	 * // Sets the output filename in an environment variable
	 * System.setProperty(TRANSFORMATION_OUTPUT_FILENAME, outputFile.getName());
	 * 
	 * try { execMgr.executeTransformation(); // execMgr.getOutputModels();
	 * return true; } catch (Exception mex) { mex.printStackTrace(); showError(
	 * window.getShell(),
	 * "Se ha producido un error al generar el fichero de salida.",
	 * mex.getMessage()); return false; } }
	 * 
	 * //
	 * ------------------------------------------------------------------------
	 * --- // Private Methods
	 * 
	 * /** Shows an error message.
	 */
	/*
	 * private void showError(Shell shell, String message, String causeMessage)
	 * { Status status = new Status(IStatus.ERROR, "My Plug-in ID",
	 * causeMessage);
	 * 
	 * ErrorDialog.openError(shell, "Error", message, status); }
	 */

	// ---------------------------------------------------------------------------
	// Private Attributes

	// ---------------------------------------------------------------------------
	// Private Constants

	/*
	 * public static final String TRANSFORMATION_OUTPUT_FILENAME =
	 * "transformationOutputFilename"; public static final String
	 * REFERENCE_FILENAME = "referenceFilename"; private static final String
	 * CONCEPTS_DB_FILE = "dbconcepts.concepts_domain"; private static final
	 * String ACTIVITIES_DB_FILE = "dbactivities.activities_domain"; public
	 * static final String CONCEPTS_OUTPUT_FILE = "concepts.html"; public static
	 * final String ACTIVITIES_OUTPUT_FILE = "activities.html";
	 */

}
