package org.mindmap.ui.diagram.conceptsDiagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MindmapPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createModel1Group());
	}

	/**
	 * Creates "model" palette tool group
	 * @generated
	 */
	private PaletteContainer createModel1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				org.mindmap.ui.diagram.conceptsDiagram.part.Messages.Model1Group_title);
		paletteContainer.setId("createModel1Group"); //$NON-NLS-1$
		paletteContainer.add(createTema1CreationTool());
		paletteContainer.add(createConcepto2CreationTool());
		paletteContainer.add(createCaracterística3CreationTool());
		paletteContainer.add(createEnlaceUsaBloque4CreationTool());
		paletteContainer.add(createEnlaceEsUn5CreationTool());
		paletteContainer.add(createEnlaceUsa6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTema1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				org.mindmap.ui.diagram.conceptsDiagram.part.Messages.Tema1CreationTool_title,
				org.mindmap.ui.diagram.conceptsDiagram.part.Messages.Tema1CreationTool_desc,
				Collections
						.singletonList(org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.Tema_2001));
		entry.setId("createTema1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes
				.getImageDescriptor(org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.Tema_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConcepto2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				org.mindmap.ui.diagram.conceptsDiagram.part.Messages.Concepto2CreationTool_title,
				org.mindmap.ui.diagram.conceptsDiagram.part.Messages.Concepto2CreationTool_desc,
				Collections
						.singletonList(org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.Concepto_3001));
		entry.setId("createConcepto2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes
				.getImageDescriptor(org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.Concepto_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCaracterística3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				org.mindmap.ui.diagram.conceptsDiagram.part.Messages.Característica3CreationTool_title,
				org.mindmap.ui.diagram.conceptsDiagram.part.Messages.Característica3CreationTool_desc,
				Collections
						.singletonList(org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.Atributo_3002));
		entry.setId("createCaracterística3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes
				.getImageDescriptor(org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.Atributo_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnlaceUsaBloque4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				org.mindmap.ui.diagram.conceptsDiagram.part.Messages.EnlaceUsaBloque4CreationTool_title,
				org.mindmap.ui.diagram.conceptsDiagram.part.Messages.EnlaceUsaBloque4CreationTool_desc,
				Collections
						.singletonList(org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.EnlaceUsaBloque_4003));
		entry.setId("createEnlaceUsaBloque4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes
				.getImageDescriptor(org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.EnlaceUsaBloque_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnlaceEsUn5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				org.mindmap.ui.diagram.conceptsDiagram.part.Messages.EnlaceEsUn5CreationTool_title,
				org.mindmap.ui.diagram.conceptsDiagram.part.Messages.EnlaceEsUn5CreationTool_desc,
				Collections
						.singletonList(org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.EnlaceEsUn_4001));
		entry.setId("createEnlaceEsUn5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes
				.getImageDescriptor(org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.EnlaceEsUn_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnlaceUsa6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				org.mindmap.ui.diagram.conceptsDiagram.part.Messages.EnlaceUsa6CreationTool_title,
				org.mindmap.ui.diagram.conceptsDiagram.part.Messages.EnlaceUsa6CreationTool_desc,
				Collections
						.singletonList(org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.EnlaceUsa_4002));
		entry.setId("createEnlaceUsa6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes
				.getImageDescriptor(org.mindmap.ui.diagram.conceptsDiagram.providers.MindmapElementTypes.EnlaceUsa_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
