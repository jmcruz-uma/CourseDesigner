package org.mindmap.ui.diagram.conceptsDiagram.edit.parts;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.mindmap.model.control.ProjectControl;
import org.mindmap.model.impl.ModelPackageImpl;
import org.mindmap.ui.diagram.conceptsDiagram.edit.parts.TemaEditPart.BloqueFigure;

/**
 * @generated
 */
public class ConceptosDiagramEditPart extends DiagramEditPart {

	/**
	 * @generated
	 */
	public final static String MODEL_ID = "Concepts"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1000;

	/**
	 * @generated
	 */
	public ConceptosDiagramEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new org.mindmap.ui.diagram.conceptsDiagram.edit.policies.ConceptosDiagramItemSemanticEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new org.mindmap.ui.diagram.conceptsDiagram.edit.policies.ConceptosDiagramCanonicalEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						org.mindmap.ui.diagram.conceptsDiagram.part.MindmapVisualIDRegistry.TYPED_INSTANCE));
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}
	
	/**
	   * Remove the child's Figure from the {@link #getContentPane() contentPane}.
	   * 
	   * @see AbstractEditPart#removeChildVisual(EditPart)
	   * @generated NOT
	   */
	  protected void removeChildVisual(EditPart childEditPart)
	  {
	    IFigure child = ((GraphicalEditPart) childEditPart).getFigure();
	    getContentPane().remove(child);

	    // Remove the 'Bloque'
	    String bloqueName = ((BloqueFigure) child.getChildren().get(0))
	        .getFigureTemaFigure_name().getText();
	    if (!ProjectControl.update&&!ProjectControl.importrunning&&!flagreorder&&!bloqueName.isEmpty())
	    {
	      ((ModelPackageImpl) ModelPackageImpl.init()).removeBloque(bloqueName,bloqueName);
	    }
	  }

	  protected void reorderChild(EditPart editpart, int index) {
		   flagreorder=true;
			removeChildVisual(editpart);
			List children = getChildren();
			children.remove(editpart);
			children.add(index, editpart);
			addChildVisual(editpart, index);
			flagreorder=false;
		}
	  private boolean flagreorder=false;


}
