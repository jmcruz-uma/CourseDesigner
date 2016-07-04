package org.mindmap.ui.diagram.actividadDiagram.part;


import org.eclipse.gef.palette.PaletteRoot;

public class ActMindmapEditorReadOnly extends ActMindmapDiagramEditor{
	public static final String ID = "org.mindmap.ui.diagram.actividadDiagram.part.MindmapDiagramEditorROID"; //$NON-NLS-1$

	@Override
	public boolean isEditable() {
	    return false;
	}

	@Override
	public boolean isEditorInputModifiable() {
	    return false;
	}

	@Override
	public boolean isEditorInputReadOnly() {
	    return true;
	}

	@Override
	public boolean isDirty() {
	    return false;
	}

	@Override
	protected PaletteRoot createPaletteRoot(PaletteRoot existingPaletteRoot) {
		//PaletteRoot root = super.createPaletteRoot(existingPaletteRoot);
		//new org.mindmap.ui.diagram.actividadDiagram.part.MindmapPaletteFactory()
		//		.fillPalette(root);
		return null;
	}
}
