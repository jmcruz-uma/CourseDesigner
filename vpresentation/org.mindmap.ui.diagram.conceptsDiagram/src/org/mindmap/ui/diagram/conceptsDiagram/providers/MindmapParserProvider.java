package org.mindmap.ui.diagram.conceptsDiagram.providers;

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
	private IParser temaNombre_5002Parser;

	/**
	 * @generated
	 */
	private IParser getTemaNombre_5002Parser() {
		if (temaNombre_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ModelPackage.eINSTANCE
					.getTema_Nombre() };
			org.mindmap.ui.diagram.conceptsDiagram.parsers.MessageFormatParser parser = new org.mindmap.ui.diagram.conceptsDiagram.parsers.MessageFormatParser(
					features);
			temaNombre_5002Parser = parser;
		}
		return temaNombre_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser conceptoNombre_5001Parser;

	/**
	 * @generated
	 */
	private IParser getConceptoNombre_5001Parser() {
		if (conceptoNombre_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ModelPackage.eINSTANCE
					.getConcepto_Nombre() };
			org.mindmap.ui.diagram.conceptsDiagram.parsers.MessageFormatParser parser = new org.mindmap.ui.diagram.conceptsDiagram.parsers.MessageFormatParser(
					features);
			conceptoNombre_5001Parser = parser;
		}
		return conceptoNombre_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser atributo_3002Parser;

	/**
	 * @generated
	 */
	private IParser getAtributo_3002Parser() {
		if (atributo_3002Parser == null) {
			EAttribute[] features = new EAttribute[] { ModelPackage.eINSTANCE
					.getAtributo_Nombre() };
			org.mindmap.ui.diagram.conceptsDiagram.parsers.MessageFormatParser parser = new org.mindmap.ui.diagram.conceptsDiagram.parsers.MessageFormatParser(
					features);
			atributo_3002Parser = parser;
		}
		return atributo_3002Parser;
	}

	/**
	 * @generated
	 */
	private IParser enlaceEsUnEtiqueta_6001Parser;

	/**
	 * @generated
	 */
	private IParser getEnlaceEsUnEtiqueta_6001Parser() {
		if (enlaceEsUnEtiqueta_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { ModelPackage.eINSTANCE
					.getEnlaceEsUn_Etiqueta() };
			org.mindmap.ui.diagram.conceptsDiagram.parsers.MessageFormatParser parser = new org.mindmap.ui.diagram.conceptsDiagram.parsers.MessageFormatParser(
					features);
			enlaceEsUnEtiqueta_6001Parser = parser;
		}
		return enlaceEsUnEtiqueta_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser enlaceUsaEtiqueta_6002Parser;

	/**
	 * @generated
	 */
	private IParser getEnlaceUsaEtiqueta_6002Parser() {
		if (enlaceUsaEtiqueta_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { ModelPackage.eINSTANCE
					.getEnlaceUsa_Etiqueta() };
			org.mindmap.ui.diagram.conceptsDiagram.parsers.MessageFormatParser parser = new org.mindmap.ui.diagram.conceptsDiagram.parsers.MessageFormatParser(
					features);
			enlaceUsaEtiqueta_6002Parser = parser;
		}
		return enlaceUsaEtiqueta_6002Parser;
	}

	/**
	 * @generated
	 */
	private IParser enlaceUsaBloqueEtiqueta_6003Parser;

	/**
	 * @generated
	 */
	private IParser getEnlaceUsaBloqueEtiqueta_6003Parser() {
		if (enlaceUsaBloqueEtiqueta_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { ModelPackage.eINSTANCE
					.getEnlaceUsaBloque_Etiqueta() };
			org.mindmap.ui.diagram.conceptsDiagram.parsers.MessageFormatParser parser = new org.mindmap.ui.diagram.conceptsDiagram.parsers.MessageFormatParser(
					features);
			enlaceUsaBloqueEtiqueta_6003Parser = parser;
		}
		return enlaceUsaBloqueEtiqueta_6003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.TemaNombreEditPart.VISUAL_ID:
			return getTemaNombre_5002Parser();
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.ConceptoNombreEditPart.VISUAL_ID:
			return getConceptoNombre_5001Parser();
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.AtributoEditPart.VISUAL_ID:
			return getAtributo_3002Parser();
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceEsUnEtiquetaEditPart.VISUAL_ID:
			return getEnlaceEsUnEtiqueta_6001Parser();
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaEtiquetaEditPart.VISUAL_ID:
			return getEnlaceUsaEtiqueta_6002Parser();
		case org.mindmap.ui.diagram.conceptsDiagram.edit.parts.EnlaceUsaBloqueEtiquetaEditPart.VISUAL_ID:
			return getEnlaceUsaBloqueEtiqueta_6003Parser();
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
			return getParser(org.mindmap.ui.diagram.conceptsDiagram.part.MindmapVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(org.mindmap.ui.diagram.conceptsDiagram.part.MindmapVisualIDRegistry
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
			if (org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes
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
