package org.mindmap.ui.diagram.custom.application;


import java.util.ArrayList;
import java.util.List;

public class ErrorTree {
	private String name;
	private List children = new ArrayList();
	private ErrorTree parent;

	public ErrorTree(String n) {
		name = n;
	}

	protected Object getParent() {
		return parent;
	}

	public ErrorTree addChild(ErrorTree child){
		children.add(child);
		child.parent = this;
		child.name = child.name;
		return this;
	}

	public List getChildren() {
		return children;
	}

	public String toString() {
		return name;
	}

	public void removeChildren(ErrorTree parent) {
		parent.children.removeAll(children);
	}

	
}

