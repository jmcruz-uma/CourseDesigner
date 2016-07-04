package org.mindmap.ui.diagram.conceptsDiagram.part;


import org.eclipse.gef.palette.PaletteRoot;



public class ConceptsMindmapEditorReadOnly extends MindmapDiagramEditor{
	public static String ID="org.mindmap.ui.diagram.conceptsDiagram.part.ConceptsMindmapDiagramEditorROID";
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
