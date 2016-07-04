package org.mindmap.ui.diagram.custom.application;

import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;


public class MyValidationView extends ViewPart {
	
	
	public static final String ID = "org.mindmap.ui.diagram.conceptsDiagram.validationview";

	
	

	public static ErrorTree mc = new ErrorTree("root");
	public static TreeViewer treeViewer;

	ErrorTree conceptsRoot;
	ErrorTree actRoot;
	
	public MyValidationView() {

	}
	
	@Override
	public void createPartControl(Composite parent) {
		treeViewer = new TreeViewer(parent);
		treeViewer.setContentProvider(new ErrorContentProvider());
		inicializarTree();
		treeViewer.setInput(getRootNode());
		treeViewer.expandAll();
	}

	private void inicializarTree(){
		conceptsRoot = new ErrorTree("Errores Diagrama de Conceptos");
		actRoot = new ErrorTree("Errores Diagrama de Actividades");
		mc.addChild(conceptsRoot);
		mc.addChild(actRoot);
	}
	
	private ErrorTree getRootNode() {
				
		return mc;
		
	}

	@Override
	public void setFocus() {
	}
	
	

	public void setActividadError(List<String> lista){
		
		actRoot.removeChildren(actRoot);
		
		for(int i=0;i<lista.size();i++){
			ErrorTree item=new ErrorTree(lista.get(i));
			actRoot.addChild(item);
		}
		
		treeViewer.setInput(getRootNode());
		
		treeViewer.expandAll();
	}



	public void setConceptsError(List<String> lista){
		
		conceptsRoot.removeChildren(conceptsRoot);
		
		for(int i=0;i<lista.size();i++){
			ErrorTree item=new ErrorTree(lista.get(i));
			conceptsRoot.addChild(item);
		}
		
		treeViewer.setInput(getRootNode());
		
		treeViewer.expandAll();
	}



	private class ErrorContentProvider implements ITreeContentProvider {

		public Object[] getChildren(Object parentElement) {
			return ((ErrorTree) parentElement).getChildren().toArray();
		}

		public Object getParent(Object element) {
			return ((ErrorTree) element).getParent();
		}

		public boolean hasChildren(Object element) {
			return ((ErrorTree) element).getChildren().size() > 0;
		}

		public Object[] getElements(Object inputElement) {
			return ((ErrorTree) inputElement).getChildren().toArray();
		}

		public void dispose() {
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}
	}

	

}

