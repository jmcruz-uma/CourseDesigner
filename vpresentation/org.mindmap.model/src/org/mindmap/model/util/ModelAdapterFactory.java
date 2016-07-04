/**
 */
package org.mindmap.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.emfstore.internal.common.model.NonDomainElement;

import org.eclipse.gmf.runtime.notation.Bendpoints;
import org.eclipse.gmf.runtime.notation.RelativeBendpoints;

import org.mindmap.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.mindmap.model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelSwitch<Adapter> modelSwitch = new ModelSwitch<Adapter>() {
		@Override
		public Adapter caseCursoElement(CursoElement object) {
			return createCursoElementAdapter();
		}

		@Override
		public Adapter caseCurso(Curso object) {
			return createCursoAdapter();
		}

		@Override
		public Adapter casePropiedadCurso(PropiedadCurso object) {
			return createPropiedadCursoAdapter();
		}

		@Override
		public Adapter caseCursoDiagrama(CursoDiagrama object) {
			return createCursoDiagramaAdapter();
		}

		@Override
		public Adapter caseActividadDiagrama(ActividadDiagrama object) {
			return createActividadDiagramaAdapter();
		}

		@Override
		public Adapter caseConceptosDiagrama(ConceptosDiagrama object) {
			return createConceptosDiagramaAdapter();
		}

		@Override
		public Adapter caseTema(Tema object) {
			return createTemaAdapter();
		}

		@Override
		public Adapter caseConcepto(Concepto object) {
			return createConceptoAdapter();
		}

		@Override
		public Adapter caseAtributo(Atributo object) {
			return createAtributoAdapter();
		}

		@Override
		public Adapter caseEnlaceUsaBloque(EnlaceUsaBloque object) {
			return createEnlaceUsaBloqueAdapter();
		}

		@Override
		public Adapter caseEnlaceEsUn(EnlaceEsUn object) {
			return createEnlaceEsUnAdapter();
		}

		@Override
		public Adapter caseEnlaceUsa(EnlaceUsa object) {
			return createEnlaceUsaAdapter();
		}

		@Override
		public Adapter caseActividad(Actividad object) {
			return createActividadAdapter();
		}

		@Override
		public Adapter caseActividadEspacio(ActividadEspacio object) {
			return createActividadEspacioAdapter();
		}

		@Override
		public Adapter caseTarea(Tarea object) {
			return createTareaAdapter();
		}

		@Override
		public Adapter caseLeccion(Leccion object) {
			return createLeccionAdapter();
		}

		@Override
		public Adapter casePrueba(Prueba object) {
			return createPruebaAdapter();
		}

		@Override
		public Adapter caseActividadNodoInicial(ActividadNodoInicial object) {
			return createActividadNodoInicialAdapter();
		}

		@Override
		public Adapter caseActividadNodoFinal(ActividadNodoFinal object) {
			return createActividadNodoFinalAdapter();
		}

		@Override
		public Adapter caseActividadEnlace(ActividadEnlace object) {
			return createActividadEnlaceAdapter();
		}

		@Override
		public Adapter caseActividadUnionBifurcacion(
				ActividadUnionBifurcacion object) {
			return createActividadUnionBifurcacionAdapter();
		}

		@Override
		public Adapter caseActividadNodo(ActividadNodo object) {
			return createActividadNodoAdapter();
		}

		@Override
		public Adapter caseArchivoAdjunto(ArchivoAdjunto object) {
			return createArchivoAdjuntoAdapter();
		}

		@Override
		public Adapter caseMiRelativeBendpoints(MiRelativeBendpoints object) {
			return createMiRelativeBendpointsAdapter();
		}

		@Override
		public Adapter caseBendpoints(Bendpoints object) {
			return createBendpointsAdapter();
		}

		@Override
		public Adapter caseRelativeBendpoints(RelativeBendpoints object) {
			return createRelativeBendpointsAdapter();
		}

		@Override
		public Adapter caseNonDomainElement(NonDomainElement object) {
			return createNonDomainElementAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mindmap.model.CursoElement <em>Curso Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mindmap.model.CursoElement
	 * @generated
	 */
	public Adapter createCursoElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mindmap.model.Curso <em>Curso</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mindmap.model.Curso
	 * @generated
	 */
	public Adapter createCursoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mindmap.model.PropiedadCurso <em>Propiedad Curso</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mindmap.model.PropiedadCurso
	 * @generated
	 */
	public Adapter createPropiedadCursoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mindmap.model.CursoDiagrama <em>Curso Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mindmap.model.CursoDiagrama
	 * @generated
	 */
	public Adapter createCursoDiagramaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mindmap.model.ActividadDiagrama <em>Actividad Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mindmap.model.ActividadDiagrama
	 * @generated
	 */
	public Adapter createActividadDiagramaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mindmap.model.ConceptosDiagrama <em>Conceptos Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mindmap.model.ConceptosDiagrama
	 * @generated
	 */
	public Adapter createConceptosDiagramaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mindmap.model.Tema <em>Tema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mindmap.model.Tema
	 * @generated
	 */
	public Adapter createTemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mindmap.model.Concepto <em>Concepto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mindmap.model.Concepto
	 * @generated
	 */
	public Adapter createConceptoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mindmap.model.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mindmap.model.Atributo
	 * @generated
	 */
	public Adapter createAtributoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mindmap.model.EnlaceUsaBloque <em>Enlace Usa Bloque</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mindmap.model.EnlaceUsaBloque
	 * @generated
	 */
	public Adapter createEnlaceUsaBloqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mindmap.model.EnlaceEsUn <em>Enlace Es Un</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mindmap.model.EnlaceEsUn
	 * @generated
	 */
	public Adapter createEnlaceEsUnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mindmap.model.EnlaceUsa <em>Enlace Usa</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mindmap.model.EnlaceUsa
	 * @generated
	 */
	public Adapter createEnlaceUsaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mindmap.model.Actividad <em>Actividad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mindmap.model.Actividad
	 * @generated
	 */
	public Adapter createActividadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mindmap.model.ActividadEspacio <em>Actividad Espacio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mindmap.model.ActividadEspacio
	 * @generated
	 */
	public Adapter createActividadEspacioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mindmap.model.Tarea <em>Tarea</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mindmap.model.Tarea
	 * @generated
	 */
	public Adapter createTareaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mindmap.model.Leccion <em>Leccion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mindmap.model.Leccion
	 * @generated
	 */
	public Adapter createLeccionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mindmap.model.Prueba <em>Prueba</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mindmap.model.Prueba
	 * @generated
	 */
	public Adapter createPruebaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mindmap.model.ActividadNodoInicial <em>Actividad Nodo Inicial</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mindmap.model.ActividadNodoInicial
	 * @generated
	 */
	public Adapter createActividadNodoInicialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mindmap.model.ActividadNodoFinal <em>Actividad Nodo Final</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mindmap.model.ActividadNodoFinal
	 * @generated
	 */
	public Adapter createActividadNodoFinalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mindmap.model.ActividadEnlace <em>Actividad Enlace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mindmap.model.ActividadEnlace
	 * @generated
	 */
	public Adapter createActividadEnlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mindmap.model.ActividadUnionBifurcacion <em>Actividad Union Bifurcacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mindmap.model.ActividadUnionBifurcacion
	 * @generated
	 */
	public Adapter createActividadUnionBifurcacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mindmap.model.ActividadNodo <em>Actividad Nodo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mindmap.model.ActividadNodo
	 * @generated
	 */
	public Adapter createActividadNodoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mindmap.model.ArchivoAdjunto <em>Archivo Adjunto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mindmap.model.ArchivoAdjunto
	 * @generated
	 */
	public Adapter createArchivoAdjuntoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mindmap.model.MiRelativeBendpoints <em>Mi Relative Bendpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mindmap.model.MiRelativeBendpoints
	 * @generated
	 */
	public Adapter createMiRelativeBendpointsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.Bendpoints <em>Bendpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmf.runtime.notation.Bendpoints
	 * @generated
	 */
	public Adapter createBendpointsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.runtime.notation.RelativeBendpoints <em>Relative Bendpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmf.runtime.notation.RelativeBendpoints
	 * @generated
	 */
	public Adapter createRelativeBendpointsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.emfstore.internal.common.model.NonDomainElement <em>Non Domain Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.emfstore.internal.common.model.NonDomainElement
	 * @generated
	 */
	public Adapter createNonDomainElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModelAdapterFactory
