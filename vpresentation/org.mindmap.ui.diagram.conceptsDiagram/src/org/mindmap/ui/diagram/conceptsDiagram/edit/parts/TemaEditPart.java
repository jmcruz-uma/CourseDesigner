package org.mindmap.ui.diagram.conceptsDiagram.edit.parts;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ScalablePolygonShape;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class TemaEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public TemaEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new org.mindmap.ui.diagram.conceptsDiagram.edit.policies.TemaItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new BloqueFigure();
	}

	/**
	 * @generated
	 */
	public BloqueFigure getPrimaryShape() {
		return (BloqueFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof org.mindmap.ui.diagram.conceptsDiagram.edit.parts.TemaNombreEditPart) {
			((org.mindmap.ui.diagram.conceptsDiagram.edit.parts.TemaNombreEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureTemaFigure_name());
			return true;
		}
		if (childEditPart instanceof org.mindmap.ui.diagram.conceptsDiagram.edit.parts.TemaBloqueCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureTemaFigure_Contenido();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((org.mindmap.ui.diagram.conceptsDiagram.edit.parts.TemaBloqueCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof org.mindmap.ui.diagram.conceptsDiagram.edit.parts.TemaNombreEditPart) {
			return true;
		}
		if (childEditPart instanceof org.mindmap.ui.diagram.conceptsDiagram.edit.parts.TemaBloqueCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureTemaFigure_Contenido();
			pane.remove(((org.mindmap.ui.diagram.conceptsDiagram.edit.parts.TemaBloqueCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof org.mindmap.ui.diagram.conceptsDiagram.edit.parts.TemaBloqueCompartmentEditPart) {
			return getPrimaryShape().getFigureTemaFigure_Contenido();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(org.mindmap.ui.diagram.conceptsDiagram.part.MindmapVisualIDRegistry
				.getType(org.mindmap.ui.diagram.conceptsDiagram.edit.parts.TemaNombreEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class BloqueFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureTemaFigure_name;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTemaFigure_tema;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureTemaFigure_Contenido;

		/**
		 * @generated
		 */
		public BloqueFigure() {

			BorderLayout layoutThis = new BorderLayout();
			this.setLayoutManager(layoutThis);

			this.setBorder(new MarginBorder(getMapMode().DPtoLP(1),
					getMapMode().DPtoLP(1), getMapMode().DPtoLP(1),
					getMapMode().DPtoLP(1)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure temaFigure_Cabecera0 = new RectangleFigure();

			temaFigure_Cabecera0.setOutline(false);

			this.add(temaFigure_Cabecera0, BorderLayout.TOP);

			ToolbarLayout layoutTemaFigure_Cabecera0 = new ToolbarLayout();
			layoutTemaFigure_Cabecera0.setStretchMinorAxis(true);
			layoutTemaFigure_Cabecera0
					.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutTemaFigure_Cabecera0.setSpacing(0);
			layoutTemaFigure_Cabecera0.setVertical(false);

			temaFigure_Cabecera0.setLayoutManager(layoutTemaFigure_Cabecera0);

			ScalablePolygonShape temaFigure_header1 = new ScalablePolygonShape();

			temaFigure_header1.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0)));
			temaFigure_header1.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(40)));
			temaFigure_header1.addPoint(new Point(getMapMode().DPtoLP(35),
					getMapMode().DPtoLP(40)));
			temaFigure_header1.addPoint(new Point(getMapMode().DPtoLP(40),
					getMapMode().DPtoLP(35)));
			temaFigure_header1.addPoint(new Point(getMapMode().DPtoLP(40),
					getMapMode().DPtoLP(0)));
			temaFigure_header1.setFill(true);

			temaFigure_header1.setBorder(new MarginBorder(getMapMode().DPtoLP(
					10), getMapMode().DPtoLP(10), getMapMode().DPtoLP(13),
					getMapMode().DPtoLP(13)));

			temaFigure_Cabecera0.add(temaFigure_header1);

			ToolbarLayout layoutTemaFigure_header1 = new ToolbarLayout();
			layoutTemaFigure_header1.setStretchMinorAxis(true);
			layoutTemaFigure_header1
					.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutTemaFigure_header1.setSpacing(10);
			layoutTemaFigure_header1.setVertical(false);

			temaFigure_header1.setLayoutManager(layoutTemaFigure_header1);

			fFigureTemaFigure_tema = new WrappingLabel();

			fFigureTemaFigure_tema.setText("\u00ABBloque\u00BB");

			temaFigure_header1.add(fFigureTemaFigure_tema);

			fFigureTemaFigure_name = new WrappingLabel();

			fFigureTemaFigure_name.setText("");

			temaFigure_header1.add(fFigureTemaFigure_name);

			fFigureTemaFigure_Contenido = new RectangleFigure();

			fFigureTemaFigure_Contenido.setOutline(false);
			fFigureTemaFigure_Contenido
					.setForegroundColor(ColorConstants.white);

			this.add(fFigureTemaFigure_Contenido, BorderLayout.CENTER);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTemaFigure_name() {
			return fFigureTemaFigure_name;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTemaFigure_tema() {
			return fFigureTemaFigure_tema;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureTemaFigure_Contenido() {
			return fFigureTemaFigure_Contenido;
		}

	}

}
