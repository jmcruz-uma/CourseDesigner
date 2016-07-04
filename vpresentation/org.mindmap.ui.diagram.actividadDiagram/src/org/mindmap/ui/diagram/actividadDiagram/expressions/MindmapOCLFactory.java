package org.mindmap.ui.diagram.actividadDiagram.expressions;

import java.util.Collections;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.EcoreFactory;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.ecore.Variable;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.options.ParsingOptions;

/**
 * @generated
 */
public class MindmapOCLFactory {

	/**
	 * @generated
	 */
	private final org.mindmap.ui.diagram.actividadDiagram.expressions.MindmapAbstractExpression[] expressions;

	/**
	 * @generated
	 */
	private final String[] expressionBodies;

	/**
	 * @generated
	 */
	protected MindmapOCLFactory() {
		this.expressions = new org.mindmap.ui.diagram.actividadDiagram.expressions.MindmapAbstractExpression[2];
		this.expressionBodies = new String[] {
				"self<>oppositeEnd and not(self.oclIsTypeOf(ActividadNodoFinal)) and\r\nif(self.oclIsTypeOf(ActividadUnionBifurcacion)) then \r\n\tnot(oppositeEnd.oclIsTypeOf(ActividadUnionBifurcacion)) and\r\n\tnot(ActividadEnlace.allInstances()->select(origen=self)->select(p:ActividadEnlace|p.destino.oclIsTypeOf(ActividadNodoFinal))->size()>0) and\r\n\tif(ActividadEnlace.allInstances()->select(origen=self)->size()>0) then\r\n\t\tnot(oppositeEnd.oclIsTypeOf(ActividadNodoFinal)) and (ActividadEnlace.allInstances()->select(destino=self)->size()<2)\r\n\telse\r\n\t\ttrue\r\n\tendif\r\n\tand if(ActividadEnlace.allInstances()->select(destino=self)->select(p:ActividadEnlace|p.origen.oclIsTypeOf(ActividadNodoInicial))->size()>0) then\r\n\t\tnot(oppositeEnd.oclIsTypeOf(ActividadNodoFinal))\r\n\telse \r\n\t\ttrue\r\n\tendif\r\nelse \r\n\tActividadEnlace.allInstances()->select(origen=self)->size()<1 and\r\n\tif(oppositeEnd.oclIsTypeOf(ActividadUnionBifurcacion)) then\r\n\t\tnot(ActividadEnlace.allInstances()->select(destino=oppositeEnd)->select(p:ActividadEnlace|p.origen.oclIsTypeOf(ActividadNodoInicial))->size()>0)\r\n\telse\r\n\t\ttrue\r\n\tendif\r\nendif", //$NON-NLS-1$
				"self<>null and not(self.oclIsTypeOf(ActividadNodoInicial)) and\r\nif(self.oclIsTypeOf(ActividadUnionBifurcacion)) then\r\n\tif (ActividadEnlace.allInstances()->select(destino=self)->size()>0) then \r\n\t\tnot(oppositeEnd.oclIsTypeOf(ActividadNodoInicial)) and ActividadEnlace.allInstances()->select(origen=self)->size()<2\r\n\telse\r\n\t\ttrue\r\n\tendif\r\n\tand if(ActividadEnlace.allInstances()->select(origen=self)->select(p:ActividadEnlace|p.destino.oclIsTypeOf(ActividadNodoFinal))->size()>0) then\r\n\t\tnot(oppositeEnd.oclIsTypeOf(ActividadNodoInicial))\r\n\telse \r\n\t\ttrue\r\n\tendif\r\nelse\r\n\tActividadEnlace.allInstances()->select(destino=self)->size()<1\r\nendif", //$NON-NLS-1$
		};
	}

	/**
	 * @generated
	 */
	private static MindmapOCLFactory getInstance() {
		MindmapOCLFactory instance = org.mindmap.ui.diagram.actividadDiagram.part.ActDiagramEditorPlugin
				.getInstance().getMindmapOCLFactory();
		if (instance == null) {
			org.mindmap.ui.diagram.actividadDiagram.part.ActDiagramEditorPlugin
					.getInstance().setMindmapOCLFactory(
							instance = new MindmapOCLFactory());
		}
		return instance;
	}

	/**
	 * @generated
	 */
	public static String getExpressionBody(int index) {
		return getInstance().expressionBodies[index];
	}

	/**
	 * @generated
	 */
	public static org.mindmap.ui.diagram.actividadDiagram.expressions.MindmapAbstractExpression getExpression(
			int index, EClassifier context, Map<String, EClassifier> environment) {
		MindmapOCLFactory cached = getInstance();
		if (index < 0 || index >= cached.expressions.length) {
			throw new IllegalArgumentException();
		}
		if (cached.expressions[index] == null) {
			cached.expressions[index] = getExpression(
					cached.expressionBodies[index],
					context,
					environment == null ? Collections
							.<String, EClassifier> emptyMap() : environment);
		}
		return cached.expressions[index];
	}

	/**
	 * This is factory method, callers are responsible to keep reference to the return value if they want to reuse parsed expression
	 * @generated
	 */
	public static org.mindmap.ui.diagram.actividadDiagram.expressions.MindmapAbstractExpression getExpression(
			String body, EClassifier context,
			Map<String, EClassifier> environment) {
		return new Expression(body, context, environment);
	}

	/**
	 * This method will become private in the next release
	 * @generated
	 */
	public static org.mindmap.ui.diagram.actividadDiagram.expressions.MindmapAbstractExpression getExpression(
			String body, EClassifier context) {
		return getExpression(body, context,
				Collections.<String, EClassifier> emptyMap());
	}

	/**
	 * @generated
	 */
	private static class Expression
			extends
			org.mindmap.ui.diagram.actividadDiagram.expressions.MindmapAbstractExpression {

		/**
		 * @generated
		 */
		private final org.eclipse.ocl.ecore.OCL oclInstance;

		/**
		 * @generated
		 */
		private OCLExpression oclExpression;

		/**
		 * @generated
		 */
		public Expression(String body, EClassifier context,
				Map<String, EClassifier> environment) {
			super(body, context);
			oclInstance = org.eclipse.ocl.ecore.OCL.newInstance();
			initCustomEnv(oclInstance.getEnvironment(), environment);
			Helper oclHelper = oclInstance.createOCLHelper();
			oclHelper.setContext(context());
			try {
				oclExpression = oclHelper.createQuery(body());
				setStatus(IStatus.OK, null, null);
			} catch (ParserException e) {
				setStatus(IStatus.ERROR, e.getMessage(), e);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("rawtypes")
		protected Object doEvaluate(Object context, Map env) {
			if (oclExpression == null) {
				return null;
			}
			// on the first call, both evalEnvironment and extentMap are clear, for later we have finally, below.
			EvaluationEnvironment<?, ?, ?, ?, ?> evalEnv = oclInstance
					.getEvaluationEnvironment();
			// initialize environment
			for (Object nextKey : env.keySet()) {
				evalEnv.replace((String) nextKey, env.get(nextKey));
			}
			try {
				Object result = oclInstance.evaluate(context, oclExpression);
				return oclInstance.isInvalid(result) ? null : result;
			} finally {
				evalEnv.clear();
				oclInstance.setExtentMap(null); // clear allInstances cache, and get the oclInstance ready for the next call
			}
		}

		/**
		 * @generated
		 */
		private static void initCustomEnv(
				Environment<?, EClassifier, ?, ?, ?, EParameter, ?, ?, ?, ?, ?, ?> ecoreEnv,
				Map<String, EClassifier> environment) {
			// Use EObject as implicit root class for any object, to allow eContainer() and other EObject operations from OCL expressions
			ParsingOptions.setOption(ecoreEnv,
					ParsingOptions.implicitRootClass(ecoreEnv),
					EcorePackage.eINSTANCE.getEObject());
			for (String varName : environment.keySet()) {
				EClassifier varType = environment.get(varName);
				ecoreEnv.addElement(varName,
						createVar(ecoreEnv, varName, varType), false);
			}
		}

		/**
		 * @generated
		 */
		private static Variable createVar(
				Environment<?, EClassifier, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> ecoreEnv,
				String name, EClassifier type) {
			Variable var = EcoreFactory.eINSTANCE.createVariable();
			var.setName(name);
			var.setType(ecoreEnv.getUMLReflection().getOCLType(type));
			return var;
		}
	}
}
