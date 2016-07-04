package org.mindmap.ui.diagram.actividadDiagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.mindmap.model.ModelPackage;

/**
 * @generated
 */
public class MindmapParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser actividadNombre_5005Parser;

	/**
	 * @generated
	 */
	private IParser getActividadNombre_5005Parser() {
		if (actividadNombre_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { ModelPackage.eINSTANCE
					.getActividad_Nombre() };
			org.mindmap.ui.diagram.actividadDiagram.parsers.MessageFormatParser parser = new org.mindmap.ui.diagram.actividadDiagram.parsers.MessageFormatParser(
					features);
			actividadNombre_5005Parser = parser;
		}
		return actividadNombre_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser actividadEspacioNombre_5004Parser;

	/**
	 * @generated
	 */
	private IParser getActividadEspacioNombre_5004Parser() {
		if (actividadEspacioNombre_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ModelPackage.eINSTANCE
					.getActividadEspacio_Nombre() };
			org.mindmap.ui.diagram.actividadDiagram.parsers.MessageFormatParser parser = new org.mindmap.ui.diagram.actividadDiagram.parsers.MessageFormatParser(
					features);
			actividadEspacioNombre_5004Parser = parser;
		}
		return actividadEspacioNombre_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser tareaNombre_5001Parser;

	/**
	 * @generated
	 */
	private IParser getTareaNombre_5001Parser() {
		if (tareaNombre_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ModelPackage.eINSTANCE
					.getTarea_Nombre() };
			org.mindmap.ui.diagram.actividadDiagram.parsers.MessageFormatParser parser = new org.mindmap.ui.diagram.actividadDiagram.parsers.MessageFormatParser(
					features);
			tareaNombre_5001Parser = parser;
		}
		return tareaNombre_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser leccionNombre_5002Parser;

	/**
	 * @generated
	 */
	private IParser getLeccionNombre_5002Parser() {
		if (leccionNombre_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ModelPackage.eINSTANCE
					.getLeccion_Nombre() };
			org.mindmap.ui.diagram.actividadDiagram.parsers.MessageFormatParser parser = new org.mindmap.ui.diagram.actividadDiagram.parsers.MessageFormatParser(
					features);
			leccionNombre_5002Parser = parser;
		}
		return leccionNombre_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser pruebaNombre_5003Parser;

	/**
	 * @generated
	 */
	private IParser getPruebaNombre_5003Parser() {
		if (pruebaNombre_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ModelPackage.eINSTANCE
					.getPrueba_Nombre() };
			org.mindmap.ui.diagram.actividadDiagram.parsers.MessageFormatParser parser = new org.mindmap.ui.diagram.actividadDiagram.parsers.MessageFormatParser(
					features);
			pruebaNombre_5003Parser = parser;
		}
		return pruebaNombre_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser actividadEnlaceEtiqueta_6001Parser;

	/**
	 * @generated
	 */
	private IParser getActividadEnlaceEtiqueta_6001Parser() {
		if (actividadEnlaceEtiqueta_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { ModelPackage.eINSTANCE
					.getActividadEnlace_Etiqueta() };
			org.mindmap.ui.diagram.actividadDiagram.parsers.MessageFormatParser parser = new org.mindmap.ui.diagram.actividadDiagram.parsers.MessageFormatParser(
					features);
			actividadEnlaceEtiqueta_6001Parser = parser;
		}
		return actividadEnlaceEtiqueta_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadNombreEditPart.VISUAL_ID:
			return getActividadNombre_5005Parser();
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEspacioNombreEditPart.VISUAL_ID:
			return getActividadEspacioNombre_5004Parser();
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.TareaNombreEditPart.VISUAL_ID:
			return getTareaNombre_5001Parser();
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.LeccionNombreEditPart.VISUAL_ID:
			return getLeccionNombre_5002Parser();
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.PruebaNombreEditPart.VISUAL_ID:
			return getPruebaNombre_5003Parser();
		case org.mindmap.ui.diagram.actividadDiagram.edit.parts.ActividadEnlaceEtiquetaEditPart.VISUAL_ID:
			return getActividadEnlaceEtiqueta_6001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(org.mindmap.ui.diagram.actividadDiagram.part.MindmapVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(org.mindmap.ui.diagram.actividadDiagram.part.MindmapVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
