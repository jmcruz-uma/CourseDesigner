/**
 */
package org.mindmap.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.mindmap.model.ConceptosDiagrama;
import org.mindmap.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conceptos Diagrama</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConceptosDiagramaImpl extends CursoDiagramaImpl implements
		ConceptosDiagrama {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptosDiagramaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CONCEPTOS_DIAGRAMA;
	}

	@Override
	public String getType() {
		return "Concepts";
	}

} //ConceptosDiagramaImpl
