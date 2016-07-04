/**
 */
package org.mindmap.model.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint;
import org.eclipse.gmf.runtime.notation.impl.RelativeBendpointsImpl;
import org.mindmap.model.MiRelativeBendpoints;
import org.mindmap.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mi Relative Bendpoints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MiRelativeBendpointsImpl extends RelativeBendpointsImpl implements
		MiRelativeBendpoints {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiRelativeBendpointsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.MI_RELATIVE_BENDPOINTS;
	}

	@SuppressWarnings("rawtypes")
	public void setPoints(List points) {
		List<MiRelativeBendpoint> actualPoints = new ArrayList<MiRelativeBendpoint>(
				points.size());
		for (Object point : points) {
			if (point instanceof MiRelativeBendpoint) {
				MiRelativeBendpoint mePoint = (MiRelativeBendpoint) point;
				actualPoints.add(mePoint);
			} else if (point instanceof RelativeBendpoint) {
				RelativeBendpoint relativePoint = (RelativeBendpoint) point;
				MiRelativeBendpoint mePoint = copyPoint(relativePoint);
				actualPoints.add(mePoint);
			}
		}
		super.setPoints(actualPoints);
	}

	private MiRelativeBendpoint copyPoint(RelativeBendpoint relativePoint) {
		MiRelativeBendpoint copy = new MiRelativeBendpoint(
				relativePoint.getSourceX(), relativePoint.getSourceY(),
				relativePoint.getTargetX(), relativePoint.getTargetY());

		return copy;
	}
} //MiRelativeBendpointsImpl
