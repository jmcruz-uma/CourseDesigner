package org.mindmap.ui.diagram.actividadDiagram.part;

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
				org.mindmap.ui.diagram.actividadDiagram.part.Messages.Model1Group_title);
		paletteContainer.setId("createModel1Group"); //$NON-NLS-1$
		paletteContainer.add(createNodoInicial1CreationTool());
		paletteContainer.add(createNodoFinal2CreationTool());
		paletteContainer.add(createActividad3CreationTool());
		paletteContainer.add(createEspacio4CreationTool());
		paletteContainer.add(createTarea5CreationTool());
		paletteContainer.add(createLección6CreationTool());
		paletteContainer.add(createPrueba7CreationTool());
		paletteContainer.add(createSiguiente8CreationTool());
		paletteContainer.add(createUnionBifurcacion9CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNodoInicial1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				org.mindmap.ui.diagram.actividadDiagram.part.Messages.NodoInicial1CreationTool_title,
				org.mindmap.ui.diagram.actividadDiagram.part.Messages.NodoInicial1CreationTool_desc,
				Collections
						.singletonList(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.ActividadNodoInicial_2002));
		entry.setId("createNodoInicial1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes
				.getImageDescriptor(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.ActividadNodoInicial_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNodoFinal2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				org.mindmap.ui.diagram.actividadDiagram.part.Messages.NodoFinal2CreationTool_title,
				org.mindmap.ui.diagram.actividadDiagram.part.Messages.NodoFinal2CreationTool_desc,
				Collections
						.singletonList(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.ActividadNodoFinal_2004));
		entry.setId("createNodoFinal2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes
				.getImageDescriptor(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.ActividadNodoFinal_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActividad3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				org.mindmap.ui.diagram.actividadDiagram.part.Messages.Actividad3CreationTool_title,
				org.mindmap.ui.diagram.actividadDiagram.part.Messages.Actividad3CreationTool_desc,
				Collections
						.singletonList(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.Actividad_2003));
		entry.setId("createActividad3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes
				.getImageDescriptor(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.Actividad_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEspacio4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				org.mindmap.ui.diagram.actividadDiagram.part.Messages.Espacio4CreationTool_title,
				org.mindmap.ui.diagram.actividadDiagram.part.Messages.Espacio4CreationTool_desc,
				Collections
						.singletonList(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.ActividadEspacio_3001));
		entry.setId("createEspacio4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes
				.getImageDescriptor(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.ActividadEspacio_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTarea5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				org.mindmap.ui.diagram.actividadDiagram.part.Messages.Tarea5CreationTool_title,
				org.mindmap.ui.diagram.actividadDiagram.part.Messages.Tarea5CreationTool_desc,
				Collections
						.singletonList(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.Tarea_3002));
		entry.setId("createTarea5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes
				.getImageDescriptor(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.Tarea_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLección6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				org.mindmap.ui.diagram.actividadDiagram.part.Messages.Lección6CreationTool_title,
				org.mindmap.ui.diagram.actividadDiagram.part.Messages.Lección6CreationTool_desc,
				Collections
						.singletonList(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.Leccion_3003));
		entry.setId("createLección6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes
				.getImageDescriptor(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.Leccion_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPrueba7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				org.mindmap.ui.diagram.actividadDiagram.part.Messages.Prueba7CreationTool_title,
				org.mindmap.ui.diagram.actividadDiagram.part.Messages.Prueba7CreationTool_desc,
				Collections
						.singletonList(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.Prueba_3004));
		entry.setId("createPrueba7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes
				.getImageDescriptor(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.Prueba_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSiguiente8CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				org.mindmap.ui.diagram.actividadDiagram.part.Messages.Siguiente8CreationTool_title,
				org.mindmap.ui.diagram.actividadDiagram.part.Messages.Siguiente8CreationTool_desc,
				Collections
						.singletonList(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.ActividadEnlace_4001));
		entry.setId("createSiguiente8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes
				.getImageDescriptor(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.ActividadEnlace_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUnionBifurcacion9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				org.mindmap.ui.diagram.actividadDiagram.part.Messages.UnionBifurcacion9CreationTool_title,
				org.mindmap.ui.diagram.actividadDiagram.part.Messages.UnionBifurcacion9CreationTool_desc,
				Collections
						.singletonList(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.ActividadUnionBifurcacion_2001));
		entry.setId("createUnionBifurcacion9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes
				.getImageDescriptor(org.mindmap.ui.diagram.actividadDiagram.providers.MindmapElementTypes.ActividadUnionBifurcacion_2001));
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
