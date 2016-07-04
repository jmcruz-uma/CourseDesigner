/**
 */
package org.mindmap.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.mindmap.model.ModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore#/'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mindmap.org/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.mindmap.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = org.mindmap.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mindmap.model.impl.CursoElementImpl <em>Curso Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mindmap.model.impl.CursoElementImpl
	 * @see org.mindmap.model.impl.ModelPackageImpl#getCursoElement()
	 * @generated
	 */
	int CURSO_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Curso Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSO_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mindmap.model.impl.CursoImpl <em>Curso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mindmap.model.impl.CursoImpl
	 * @see org.mindmap.model.impl.ModelPackageImpl#getCurso()
	 * @generated
	 */
	int CURSO = 1;

	/**
	 * The feature id for the '<em><b>Diagramas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSO__DIAGRAMAS = 0;

	/**
	 * The feature id for the '<em><b>Propiedades</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSO__PROPIEDADES = 1;

	/**
	 * The number of structural features of the '<em>Curso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSO_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.mindmap.model.impl.PropiedadCursoImpl <em>Propiedad Curso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mindmap.model.impl.PropiedadCursoImpl
	 * @see org.mindmap.model.impl.ModelPackageImpl#getPropiedadCurso()
	 * @generated
	 */
	int PROPIEDAD_CURSO = 2;

	/**
	 * The feature id for the '<em><b>Bibliografia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD_CURSO__BIBLIOGRAFIA = 0;

	/**
	 * The feature id for the '<em><b>Requisitos Previos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD_CURSO__REQUISITOS_PREVIOS = 1;

	/**
	 * The feature id for the '<em><b>Competencias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD_CURSO__COMPETENCIAS = 2;

	/**
	 * The feature id for the '<em><b>Sistema Evaluacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD_CURSO__SISTEMA_EVALUACION = 3;

	/**
	 * The feature id for the '<em><b>Asignatura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD_CURSO__ASIGNATURA = 4;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD_CURSO__AREA = 5;

	/**
	 * The feature id for the '<em><b>Oferta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD_CURSO__OFERTA = 6;

	/**
	 * The feature id for the '<em><b>Semestre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD_CURSO__SEMESTRE = 7;

	/**
	 * The feature id for the '<em><b>Creditos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD_CURSO__CREDITOS = 8;

	/**
	 * The feature id for the '<em><b>Horas grp gra</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD_CURSO__HORAS_GRP_GRA = 9;

	/**
	 * The feature id for the '<em><b>Horas grp red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD_CURSO__HORAS_GRP_RED = 10;

	/**
	 * The feature id for the '<em><b>Coordinador</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD_CURSO__COORDINADOR = 11;

	/**
	 * The number of structural features of the '<em>Propiedad Curso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIEDAD_CURSO_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link org.mindmap.model.impl.CursoDiagramaImpl <em>Curso Diagrama</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mindmap.model.impl.CursoDiagramaImpl
	 * @see org.mindmap.model.impl.ModelPackageImpl#getCursoDiagrama()
	 * @generated
	 */
	int CURSO_DIAGRAMA = 3;

	/**
	 * The feature id for the '<em><b>Gmfdiagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSO_DIAGRAMA__GMFDIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Actividades</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSO_DIAGRAMA__ACTIVIDADES = 1;

	/**
	 * The feature id for the '<em><b>Temas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSO_DIAGRAMA__TEMAS = 2;

	/**
	 * The feature id for the '<em><b>Enlaces Actividad</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSO_DIAGRAMA__ENLACES_ACTIVIDAD = 3;

	/**
	 * The feature id for the '<em><b>Enlaces Usa Bloque</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSO_DIAGRAMA__ENLACES_USA_BLOQUE = 4;

	/**
	 * The feature id for the '<em><b>Enlace Usa</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSO_DIAGRAMA__ENLACE_USA = 5;

	/**
	 * The feature id for the '<em><b>Enlaces Es Un</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSO_DIAGRAMA__ENLACES_ES_UN = 6;

	/**
	 * The feature id for the '<em><b>Unionesbifurcaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSO_DIAGRAMA__UNIONESBIFURCACIONES = 7;

	/**
	 * The number of structural features of the '<em>Curso Diagrama</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURSO_DIAGRAMA_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.mindmap.model.impl.ActividadDiagramaImpl <em>Actividad Diagrama</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mindmap.model.impl.ActividadDiagramaImpl
	 * @see org.mindmap.model.impl.ModelPackageImpl#getActividadDiagrama()
	 * @generated
	 */
	int ACTIVIDAD_DIAGRAMA = 4;

	/**
	 * The feature id for the '<em><b>Gmfdiagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_DIAGRAMA__GMFDIAGRAM = CURSO_DIAGRAMA__GMFDIAGRAM;

	/**
	 * The feature id for the '<em><b>Actividades</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_DIAGRAMA__ACTIVIDADES = CURSO_DIAGRAMA__ACTIVIDADES;

	/**
	 * The feature id for the '<em><b>Temas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_DIAGRAMA__TEMAS = CURSO_DIAGRAMA__TEMAS;

	/**
	 * The feature id for the '<em><b>Enlaces Actividad</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_DIAGRAMA__ENLACES_ACTIVIDAD = CURSO_DIAGRAMA__ENLACES_ACTIVIDAD;

	/**
	 * The feature id for the '<em><b>Enlaces Usa Bloque</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_DIAGRAMA__ENLACES_USA_BLOQUE = CURSO_DIAGRAMA__ENLACES_USA_BLOQUE;

	/**
	 * The feature id for the '<em><b>Enlace Usa</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_DIAGRAMA__ENLACE_USA = CURSO_DIAGRAMA__ENLACE_USA;

	/**
	 * The feature id for the '<em><b>Enlaces Es Un</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_DIAGRAMA__ENLACES_ES_UN = CURSO_DIAGRAMA__ENLACES_ES_UN;

	/**
	 * The feature id for the '<em><b>Unionesbifurcaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_DIAGRAMA__UNIONESBIFURCACIONES = CURSO_DIAGRAMA__UNIONESBIFURCACIONES;

	/**
	 * The feature id for the '<em><b>Elemento Nodo Final</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_DIAGRAMA__ELEMENTO_NODO_FINAL = CURSO_DIAGRAMA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elemento Nodo Inicial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_DIAGRAMA__ELEMENTO_NODO_INICIAL = CURSO_DIAGRAMA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Actividad Diagrama</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_DIAGRAMA_FEATURE_COUNT = CURSO_DIAGRAMA_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mindmap.model.impl.ConceptosDiagramaImpl <em>Conceptos Diagrama</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mindmap.model.impl.ConceptosDiagramaImpl
	 * @see org.mindmap.model.impl.ModelPackageImpl#getConceptosDiagrama()
	 * @generated
	 */
	int CONCEPTOS_DIAGRAMA = 5;

	/**
	 * The feature id for the '<em><b>Gmfdiagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTOS_DIAGRAMA__GMFDIAGRAM = CURSO_DIAGRAMA__GMFDIAGRAM;

	/**
	 * The feature id for the '<em><b>Actividades</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTOS_DIAGRAMA__ACTIVIDADES = CURSO_DIAGRAMA__ACTIVIDADES;

	/**
	 * The feature id for the '<em><b>Temas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTOS_DIAGRAMA__TEMAS = CURSO_DIAGRAMA__TEMAS;

	/**
	 * The feature id for the '<em><b>Enlaces Actividad</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTOS_DIAGRAMA__ENLACES_ACTIVIDAD = CURSO_DIAGRAMA__ENLACES_ACTIVIDAD;

	/**
	 * The feature id for the '<em><b>Enlaces Usa Bloque</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTOS_DIAGRAMA__ENLACES_USA_BLOQUE = CURSO_DIAGRAMA__ENLACES_USA_BLOQUE;

	/**
	 * The feature id for the '<em><b>Enlace Usa</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTOS_DIAGRAMA__ENLACE_USA = CURSO_DIAGRAMA__ENLACE_USA;

	/**
	 * The feature id for the '<em><b>Enlaces Es Un</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTOS_DIAGRAMA__ENLACES_ES_UN = CURSO_DIAGRAMA__ENLACES_ES_UN;

	/**
	 * The feature id for the '<em><b>Unionesbifurcaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTOS_DIAGRAMA__UNIONESBIFURCACIONES = CURSO_DIAGRAMA__UNIONESBIFURCACIONES;

	/**
	 * The number of structural features of the '<em>Conceptos Diagrama</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTOS_DIAGRAMA_FEATURE_COUNT = CURSO_DIAGRAMA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mindmap.model.impl.TemaImpl <em>Tema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mindmap.model.impl.TemaImpl
	 * @see org.mindmap.model.impl.ModelPackageImpl#getTema()
	 * @generated
	 */
	int TEMA = 6;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMA__NOMBRE = CURSO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Anotaciones</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMA__ANOTACIONES = CURSO_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conceptos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMA__CONCEPTOS = CURSO_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMA_FEATURE_COUNT = CURSO_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.mindmap.model.impl.ConceptoImpl <em>Concepto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mindmap.model.impl.ConceptoImpl
	 * @see org.mindmap.model.impl.ModelPackageImpl#getConcepto()
	 * @generated
	 */
	int CONCEPTO = 7;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTO__NOMBRE = CURSO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Anotaciones</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTO__ANOTACIONES = CURSO_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTO__ATRIBUTOS = CURSO_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Concepto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTO_FEATURE_COUNT = CURSO_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.mindmap.model.impl.AtributoImpl <em>Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mindmap.model.impl.AtributoImpl
	 * @see org.mindmap.model.impl.ModelPackageImpl#getAtributo()
	 * @generated
	 */
	int ATRIBUTO = 8;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__NOMBRE = CURSO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_FEATURE_COUNT = CURSO_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mindmap.model.impl.EnlaceUsaBloqueImpl <em>Enlace Usa Bloque</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mindmap.model.impl.EnlaceUsaBloqueImpl
	 * @see org.mindmap.model.impl.ModelPackageImpl#getEnlaceUsaBloque()
	 * @generated
	 */
	int ENLACE_USA_BLOQUE = 9;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE_USA_BLOQUE__ETIQUETA = CURSO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE_USA_BLOQUE__ORIGEN = CURSO_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE_USA_BLOQUE__DESTINO = CURSO_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Enlace Usa Bloque</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE_USA_BLOQUE_FEATURE_COUNT = CURSO_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.mindmap.model.impl.EnlaceEsUnImpl <em>Enlace Es Un</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mindmap.model.impl.EnlaceEsUnImpl
	 * @see org.mindmap.model.impl.ModelPackageImpl#getEnlaceEsUn()
	 * @generated
	 */
	int ENLACE_ES_UN = 10;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE_ES_UN__ETIQUETA = CURSO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE_ES_UN__ORIGEN = CURSO_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE_ES_UN__DESTINO = CURSO_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Enlace Es Un</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE_ES_UN_FEATURE_COUNT = CURSO_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.mindmap.model.impl.EnlaceUsaImpl <em>Enlace Usa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mindmap.model.impl.EnlaceUsaImpl
	 * @see org.mindmap.model.impl.ModelPackageImpl#getEnlaceUsa()
	 * @generated
	 */
	int ENLACE_USA = 11;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE_USA__ETIQUETA = CURSO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE_USA__ORIGEN = CURSO_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE_USA__DESTINO = CURSO_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Enlace Usa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACE_USA_FEATURE_COUNT = CURSO_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.mindmap.model.impl.ActividadImpl <em>Actividad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mindmap.model.impl.ActividadImpl
	 * @see org.mindmap.model.impl.ModelPackageImpl#getActividad()
	 * @generated
	 */
	int ACTIVIDAD = 12;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD__NOMBRE = CURSO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bloque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD__BLOQUE = CURSO_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Espacios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD__ESPACIOS = CURSO_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Actividad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_FEATURE_COUNT = CURSO_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.mindmap.model.impl.ActividadEspacioImpl <em>Actividad Espacio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mindmap.model.impl.ActividadEspacioImpl
	 * @see org.mindmap.model.impl.ModelPackageImpl#getActividadEspacio()
	 * @generated
	 */
	int ACTIVIDAD_ESPACIO = 13;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_ESPACIO__NOMBRE = CURSO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tareas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_ESPACIO__TAREAS = CURSO_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lecciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_ESPACIO__LECCIONES = CURSO_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pruebas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_ESPACIO__PRUEBAS = CURSO_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Actividad Espacio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_ESPACIO_FEATURE_COUNT = CURSO_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.mindmap.model.impl.ActividadNodoImpl <em>Actividad Nodo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mindmap.model.impl.ActividadNodoImpl
	 * @see org.mindmap.model.impl.ModelPackageImpl#getActividadNodo()
	 * @generated
	 */
	int ACTIVIDAD_NODO = 21;

	/**
	 * The number of structural features of the '<em>Actividad Nodo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_NODO_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mindmap.model.impl.TareaImpl <em>Tarea</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mindmap.model.impl.TareaImpl
	 * @see org.mindmap.model.impl.ModelPackageImpl#getTarea()
	 * @generated
	 */
	int TAREA = 14;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__NOMBRE = ACTIVIDAD_NODO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__TIPO = ACTIVIDAD_NODO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Porcentaje Nota</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__PORCENTAJE_NOTA = ACTIVIDAD_NODO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Duracion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__DURACION = ACTIVIDAD_NODO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contenidos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__CONTENIDOS = ACTIVIDAD_NODO_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Tarea</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_FEATURE_COUNT = ACTIVIDAD_NODO_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.mindmap.model.impl.LeccionImpl <em>Leccion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mindmap.model.impl.LeccionImpl
	 * @see org.mindmap.model.impl.ModelPackageImpl#getLeccion()
	 * @generated
	 */
	int LECCION = 15;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECCION__NOMBRE = ACTIVIDAD_NODO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Profesor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECCION__PROFESOR = ACTIVIDAD_NODO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Porcentaje Nota</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECCION__PORCENTAJE_NOTA = ACTIVIDAD_NODO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Duracion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECCION__DURACION = ACTIVIDAD_NODO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contenidos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECCION__CONTENIDOS = ACTIVIDAD_NODO_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Leccion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECCION_FEATURE_COUNT = ACTIVIDAD_NODO_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.mindmap.model.impl.PruebaImpl <em>Prueba</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mindmap.model.impl.PruebaImpl
	 * @see org.mindmap.model.impl.ModelPackageImpl#getPrueba()
	 * @generated
	 */
	int PRUEBA = 16;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRUEBA__NOMBRE = ACTIVIDAD_NODO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRUEBA__TIPO = ACTIVIDAD_NODO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Porcentaje Nota</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRUEBA__PORCENTAJE_NOTA = ACTIVIDAD_NODO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Duracion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRUEBA__DURACION = ACTIVIDAD_NODO_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Prueba</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRUEBA_FEATURE_COUNT = ACTIVIDAD_NODO_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.mindmap.model.impl.ActividadNodoInicialImpl <em>Actividad Nodo Inicial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mindmap.model.impl.ActividadNodoInicialImpl
	 * @see org.mindmap.model.impl.ModelPackageImpl#getActividadNodoInicial()
	 * @generated
	 */
	int ACTIVIDAD_NODO_INICIAL = 17;

	/**
	 * The number of structural features of the '<em>Actividad Nodo Inicial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_NODO_INICIAL_FEATURE_COUNT = ACTIVIDAD_NODO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mindmap.model.impl.ActividadNodoFinalImpl <em>Actividad Nodo Final</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mindmap.model.impl.ActividadNodoFinalImpl
	 * @see org.mindmap.model.impl.ModelPackageImpl#getActividadNodoFinal()
	 * @generated
	 */
	int ACTIVIDAD_NODO_FINAL = 18;

	/**
	 * The number of structural features of the '<em>Actividad Nodo Final</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_NODO_FINAL_FEATURE_COUNT = ACTIVIDAD_NODO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mindmap.model.impl.ActividadEnlaceImpl <em>Actividad Enlace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mindmap.model.impl.ActividadEnlaceImpl
	 * @see org.mindmap.model.impl.ModelPackageImpl#getActividadEnlace()
	 * @generated
	 */
	int ACTIVIDAD_ENLACE = 19;

	/**
	 * The feature id for the '<em><b>Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_ENLACE__ETIQUETA = CURSO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_ENLACE__ORIGEN = CURSO_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_ENLACE__DESTINO = CURSO_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Actividad Enlace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_ENLACE_FEATURE_COUNT = CURSO_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.mindmap.model.impl.ActividadUnionBifurcacionImpl <em>Actividad Union Bifurcacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mindmap.model.impl.ActividadUnionBifurcacionImpl
	 * @see org.mindmap.model.impl.ModelPackageImpl#getActividadUnionBifurcacion()
	 * @generated
	 */
	int ACTIVIDAD_UNION_BIFURCACION = 20;

	/**
	 * The number of structural features of the '<em>Actividad Union Bifurcacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_UNION_BIFURCACION_FEATURE_COUNT = ACTIVIDAD_NODO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mindmap.model.impl.ArchivoAdjuntoImpl <em>Archivo Adjunto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mindmap.model.impl.ArchivoAdjuntoImpl
	 * @see org.mindmap.model.impl.ModelPackageImpl#getArchivoAdjunto()
	 * @generated
	 */
	int ARCHIVO_ADJUNTO = 22;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVO_ADJUNTO__NOMBRE = CURSO_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVO_ADJUNTO__FILE_ID = CURSO_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Archivo Adjunto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVO_ADJUNTO_FEATURE_COUNT = CURSO_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mindmap.model.impl.MiRelativeBendpointsImpl <em>Mi Relative Bendpoints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mindmap.model.impl.MiRelativeBendpointsImpl
	 * @see org.mindmap.model.impl.ModelPackageImpl#getMiRelativeBendpoints()
	 * @generated
	 */
	int MI_RELATIVE_BENDPOINTS = 23;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MI_RELATIVE_BENDPOINTS__POINTS = NotationPackage.RELATIVE_BENDPOINTS__POINTS;

	/**
	 * The number of structural features of the '<em>Mi Relative Bendpoints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MI_RELATIVE_BENDPOINTS_FEATURE_COUNT = NotationPackage.RELATIVE_BENDPOINTS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mindmap.model.Bloque2 <em>Bloque</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mindmap.model.Bloque2
	 * @see org.mindmap.model.impl.ModelPackageImpl#getBloque()
	 * @generated
	 */
	int BLOQUE = 24;

	/**
	 * The meta object id for the '<em>Mi Relative Bendpoint</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mindmap.model.impl.MiRelativeBendpoint
	 * @see org.mindmap.model.impl.ModelPackageImpl#getMiRelativeBendpoint()
	 * @generated
	 */
	int MI_RELATIVE_BENDPOINT = 25;

	/**
	 * Returns the meta object for class '{@link org.mindmap.model.CursoElement <em>Curso Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Curso Element</em>'.
	 * @see org.mindmap.model.CursoElement
	 * @generated
	 */
	EClass getCursoElement();

	/**
	 * Returns the meta object for class '{@link org.mindmap.model.Curso <em>Curso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Curso</em>'.
	 * @see org.mindmap.model.Curso
	 * @generated
	 */
	EClass getCurso();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mindmap.model.Curso#getDiagramas <em>Diagramas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagramas</em>'.
	 * @see org.mindmap.model.Curso#getDiagramas()
	 * @see #getCurso()
	 * @generated
	 */
	EReference getCurso_Diagramas();

	/**
	 * Returns the meta object for the containment reference '{@link org.mindmap.model.Curso#getPropiedades <em>Propiedades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Propiedades</em>'.
	 * @see org.mindmap.model.Curso#getPropiedades()
	 * @see #getCurso()
	 * @generated
	 */
	EReference getCurso_Propiedades();

	/**
	 * Returns the meta object for class '{@link org.mindmap.model.PropiedadCurso <em>Propiedad Curso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propiedad Curso</em>'.
	 * @see org.mindmap.model.PropiedadCurso
	 * @generated
	 */
	EClass getPropiedadCurso();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.PropiedadCurso#getBibliografia <em>Bibliografia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bibliografia</em>'.
	 * @see org.mindmap.model.PropiedadCurso#getBibliografia()
	 * @see #getPropiedadCurso()
	 * @generated
	 */
	EAttribute getPropiedadCurso_Bibliografia();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.PropiedadCurso#getRequisitosPrevios <em>Requisitos Previos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requisitos Previos</em>'.
	 * @see org.mindmap.model.PropiedadCurso#getRequisitosPrevios()
	 * @see #getPropiedadCurso()
	 * @generated
	 */
	EAttribute getPropiedadCurso_RequisitosPrevios();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.PropiedadCurso#getCompetencias <em>Competencias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Competencias</em>'.
	 * @see org.mindmap.model.PropiedadCurso#getCompetencias()
	 * @see #getPropiedadCurso()
	 * @generated
	 */
	EAttribute getPropiedadCurso_Competencias();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.PropiedadCurso#getSistemaEvaluacion <em>Sistema Evaluacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sistema Evaluacion</em>'.
	 * @see org.mindmap.model.PropiedadCurso#getSistemaEvaluacion()
	 * @see #getPropiedadCurso()
	 * @generated
	 */
	EAttribute getPropiedadCurso_SistemaEvaluacion();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.PropiedadCurso#getAsignatura <em>Asignatura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asignatura</em>'.
	 * @see org.mindmap.model.PropiedadCurso#getAsignatura()
	 * @see #getPropiedadCurso()
	 * @generated
	 */
	EAttribute getPropiedadCurso_Asignatura();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.PropiedadCurso#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area</em>'.
	 * @see org.mindmap.model.PropiedadCurso#getArea()
	 * @see #getPropiedadCurso()
	 * @generated
	 */
	EAttribute getPropiedadCurso_Area();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.PropiedadCurso#getOferta <em>Oferta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oferta</em>'.
	 * @see org.mindmap.model.PropiedadCurso#getOferta()
	 * @see #getPropiedadCurso()
	 * @generated
	 */
	EAttribute getPropiedadCurso_Oferta();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.PropiedadCurso#getSemestre <em>Semestre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semestre</em>'.
	 * @see org.mindmap.model.PropiedadCurso#getSemestre()
	 * @see #getPropiedadCurso()
	 * @generated
	 */
	EAttribute getPropiedadCurso_Semestre();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.PropiedadCurso#getCreditos <em>Creditos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creditos</em>'.
	 * @see org.mindmap.model.PropiedadCurso#getCreditos()
	 * @see #getPropiedadCurso()
	 * @generated
	 */
	EAttribute getPropiedadCurso_Creditos();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.PropiedadCurso#getHoras_grp_gra <em>Horas grp gra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horas grp gra</em>'.
	 * @see org.mindmap.model.PropiedadCurso#getHoras_grp_gra()
	 * @see #getPropiedadCurso()
	 * @generated
	 */
	EAttribute getPropiedadCurso_Horas_grp_gra();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.PropiedadCurso#getHoras_grp_red <em>Horas grp red</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horas grp red</em>'.
	 * @see org.mindmap.model.PropiedadCurso#getHoras_grp_red()
	 * @see #getPropiedadCurso()
	 * @generated
	 */
	EAttribute getPropiedadCurso_Horas_grp_red();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.PropiedadCurso#getCoordinador <em>Coordinador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordinador</em>'.
	 * @see org.mindmap.model.PropiedadCurso#getCoordinador()
	 * @see #getPropiedadCurso()
	 * @generated
	 */
	EAttribute getPropiedadCurso_Coordinador();

	/**
	 * Returns the meta object for class '{@link org.mindmap.model.CursoDiagrama <em>Curso Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Curso Diagrama</em>'.
	 * @see org.mindmap.model.CursoDiagrama
	 * @generated
	 */
	EClass getCursoDiagrama();

	/**
	 * Returns the meta object for the containment reference '{@link org.mindmap.model.CursoDiagrama#getGmfdiagram <em>Gmfdiagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gmfdiagram</em>'.
	 * @see org.mindmap.model.CursoDiagrama#getGmfdiagram()
	 * @see #getCursoDiagrama()
	 * @generated
	 */
	EReference getCursoDiagrama_Gmfdiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mindmap.model.CursoDiagrama#getActividades <em>Actividades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actividades</em>'.
	 * @see org.mindmap.model.CursoDiagrama#getActividades()
	 * @see #getCursoDiagrama()
	 * @generated
	 */
	EReference getCursoDiagrama_Actividades();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mindmap.model.CursoDiagrama#getTemas <em>Temas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Temas</em>'.
	 * @see org.mindmap.model.CursoDiagrama#getTemas()
	 * @see #getCursoDiagrama()
	 * @generated
	 */
	EReference getCursoDiagrama_Temas();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mindmap.model.CursoDiagrama#getEnlacesActividad <em>Enlaces Actividad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enlaces Actividad</em>'.
	 * @see org.mindmap.model.CursoDiagrama#getEnlacesActividad()
	 * @see #getCursoDiagrama()
	 * @generated
	 */
	EReference getCursoDiagrama_EnlacesActividad();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mindmap.model.CursoDiagrama#getEnlacesUsaBloque <em>Enlaces Usa Bloque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enlaces Usa Bloque</em>'.
	 * @see org.mindmap.model.CursoDiagrama#getEnlacesUsaBloque()
	 * @see #getCursoDiagrama()
	 * @generated
	 */
	EReference getCursoDiagrama_EnlacesUsaBloque();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mindmap.model.CursoDiagrama#getEnlaceUsa <em>Enlace Usa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enlace Usa</em>'.
	 * @see org.mindmap.model.CursoDiagrama#getEnlaceUsa()
	 * @see #getCursoDiagrama()
	 * @generated
	 */
	EReference getCursoDiagrama_EnlaceUsa();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mindmap.model.CursoDiagrama#getEnlacesEsUn <em>Enlaces Es Un</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enlaces Es Un</em>'.
	 * @see org.mindmap.model.CursoDiagrama#getEnlacesEsUn()
	 * @see #getCursoDiagrama()
	 * @generated
	 */
	EReference getCursoDiagrama_EnlacesEsUn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mindmap.model.CursoDiagrama#getUnionesbifurcaciones <em>Unionesbifurcaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unionesbifurcaciones</em>'.
	 * @see org.mindmap.model.CursoDiagrama#getUnionesbifurcaciones()
	 * @see #getCursoDiagrama()
	 * @generated
	 */
	EReference getCursoDiagrama_Unionesbifurcaciones();

	/**
	 * Returns the meta object for class '{@link org.mindmap.model.ActividadDiagrama <em>Actividad Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actividad Diagrama</em>'.
	 * @see org.mindmap.model.ActividadDiagrama
	 * @generated
	 */
	EClass getActividadDiagrama();

	/**
	 * Returns the meta object for the containment reference '{@link org.mindmap.model.ActividadDiagrama#getElementoNodoFinal <em>Elemento Nodo Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elemento Nodo Final</em>'.
	 * @see org.mindmap.model.ActividadDiagrama#getElementoNodoFinal()
	 * @see #getActividadDiagrama()
	 * @generated
	 */
	EReference getActividadDiagrama_ElementoNodoFinal();

	/**
	 * Returns the meta object for the containment reference '{@link org.mindmap.model.ActividadDiagrama#getElementoNodoInicial <em>Elemento Nodo Inicial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elemento Nodo Inicial</em>'.
	 * @see org.mindmap.model.ActividadDiagrama#getElementoNodoInicial()
	 * @see #getActividadDiagrama()
	 * @generated
	 */
	EReference getActividadDiagrama_ElementoNodoInicial();

	/**
	 * Returns the meta object for class '{@link org.mindmap.model.ConceptosDiagrama <em>Conceptos Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conceptos Diagrama</em>'.
	 * @see org.mindmap.model.ConceptosDiagrama
	 * @generated
	 */
	EClass getConceptosDiagrama();

	/**
	 * Returns the meta object for class '{@link org.mindmap.model.Tema <em>Tema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tema</em>'.
	 * @see org.mindmap.model.Tema
	 * @generated
	 */
	EClass getTema();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.Tema#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see org.mindmap.model.Tema#getNombre()
	 * @see #getTema()
	 * @generated
	 */
	EAttribute getTema_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.Tema#getAnotaciones <em>Anotaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anotaciones</em>'.
	 * @see org.mindmap.model.Tema#getAnotaciones()
	 * @see #getTema()
	 * @generated
	 */
	EAttribute getTema_Anotaciones();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mindmap.model.Tema#getConceptos <em>Conceptos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conceptos</em>'.
	 * @see org.mindmap.model.Tema#getConceptos()
	 * @see #getTema()
	 * @generated
	 */
	EReference getTema_Conceptos();

	/**
	 * Returns the meta object for class '{@link org.mindmap.model.Concepto <em>Concepto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concepto</em>'.
	 * @see org.mindmap.model.Concepto
	 * @generated
	 */
	EClass getConcepto();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.Concepto#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see org.mindmap.model.Concepto#getNombre()
	 * @see #getConcepto()
	 * @generated
	 */
	EAttribute getConcepto_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.Concepto#getAnotaciones <em>Anotaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anotaciones</em>'.
	 * @see org.mindmap.model.Concepto#getAnotaciones()
	 * @see #getConcepto()
	 * @generated
	 */
	EAttribute getConcepto_Anotaciones();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mindmap.model.Concepto#getAtributos <em>Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos</em>'.
	 * @see org.mindmap.model.Concepto#getAtributos()
	 * @see #getConcepto()
	 * @generated
	 */
	EReference getConcepto_Atributos();

	/**
	 * Returns the meta object for class '{@link org.mindmap.model.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo</em>'.
	 * @see org.mindmap.model.Atributo
	 * @generated
	 */
	EClass getAtributo();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.Atributo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see org.mindmap.model.Atributo#getNombre()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Nombre();

	/**
	 * Returns the meta object for class '{@link org.mindmap.model.EnlaceUsaBloque <em>Enlace Usa Bloque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enlace Usa Bloque</em>'.
	 * @see org.mindmap.model.EnlaceUsaBloque
	 * @generated
	 */
	EClass getEnlaceUsaBloque();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.EnlaceUsaBloque#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see org.mindmap.model.EnlaceUsaBloque#getEtiqueta()
	 * @see #getEnlaceUsaBloque()
	 * @generated
	 */
	EAttribute getEnlaceUsaBloque_Etiqueta();

	/**
	 * Returns the meta object for the reference '{@link org.mindmap.model.EnlaceUsaBloque#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origen</em>'.
	 * @see org.mindmap.model.EnlaceUsaBloque#getOrigen()
	 * @see #getEnlaceUsaBloque()
	 * @generated
	 */
	EReference getEnlaceUsaBloque_Origen();

	/**
	 * Returns the meta object for the reference '{@link org.mindmap.model.EnlaceUsaBloque#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destino</em>'.
	 * @see org.mindmap.model.EnlaceUsaBloque#getDestino()
	 * @see #getEnlaceUsaBloque()
	 * @generated
	 */
	EReference getEnlaceUsaBloque_Destino();

	/**
	 * Returns the meta object for class '{@link org.mindmap.model.EnlaceEsUn <em>Enlace Es Un</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enlace Es Un</em>'.
	 * @see org.mindmap.model.EnlaceEsUn
	 * @generated
	 */
	EClass getEnlaceEsUn();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.EnlaceEsUn#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see org.mindmap.model.EnlaceEsUn#getEtiqueta()
	 * @see #getEnlaceEsUn()
	 * @generated
	 */
	EAttribute getEnlaceEsUn_Etiqueta();

	/**
	 * Returns the meta object for the reference '{@link org.mindmap.model.EnlaceEsUn#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origen</em>'.
	 * @see org.mindmap.model.EnlaceEsUn#getOrigen()
	 * @see #getEnlaceEsUn()
	 * @generated
	 */
	EReference getEnlaceEsUn_Origen();

	/**
	 * Returns the meta object for the reference '{@link org.mindmap.model.EnlaceEsUn#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destino</em>'.
	 * @see org.mindmap.model.EnlaceEsUn#getDestino()
	 * @see #getEnlaceEsUn()
	 * @generated
	 */
	EReference getEnlaceEsUn_Destino();

	/**
	 * Returns the meta object for class '{@link org.mindmap.model.EnlaceUsa <em>Enlace Usa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enlace Usa</em>'.
	 * @see org.mindmap.model.EnlaceUsa
	 * @generated
	 */
	EClass getEnlaceUsa();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.EnlaceUsa#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see org.mindmap.model.EnlaceUsa#getEtiqueta()
	 * @see #getEnlaceUsa()
	 * @generated
	 */
	EAttribute getEnlaceUsa_Etiqueta();

	/**
	 * Returns the meta object for the reference '{@link org.mindmap.model.EnlaceUsa#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origen</em>'.
	 * @see org.mindmap.model.EnlaceUsa#getOrigen()
	 * @see #getEnlaceUsa()
	 * @generated
	 */
	EReference getEnlaceUsa_Origen();

	/**
	 * Returns the meta object for the reference '{@link org.mindmap.model.EnlaceUsa#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destino</em>'.
	 * @see org.mindmap.model.EnlaceUsa#getDestino()
	 * @see #getEnlaceUsa()
	 * @generated
	 */
	EReference getEnlaceUsa_Destino();

	/**
	 * Returns the meta object for class '{@link org.mindmap.model.Actividad <em>Actividad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actividad</em>'.
	 * @see org.mindmap.model.Actividad
	 * @generated
	 */
	EClass getActividad();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.Actividad#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see org.mindmap.model.Actividad#getNombre()
	 * @see #getActividad()
	 * @generated
	 */
	EAttribute getActividad_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.Actividad#getBloque <em>Bloque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bloque</em>'.
	 * @see org.mindmap.model.Actividad#getBloque()
	 * @see #getActividad()
	 * @generated
	 */
	EAttribute getActividad_Bloque();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mindmap.model.Actividad#getEspacios <em>Espacios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Espacios</em>'.
	 * @see org.mindmap.model.Actividad#getEspacios()
	 * @see #getActividad()
	 * @generated
	 */
	EReference getActividad_Espacios();

	/**
	 * Returns the meta object for class '{@link org.mindmap.model.ActividadEspacio <em>Actividad Espacio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actividad Espacio</em>'.
	 * @see org.mindmap.model.ActividadEspacio
	 * @generated
	 */
	EClass getActividadEspacio();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.ActividadEspacio#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see org.mindmap.model.ActividadEspacio#getNombre()
	 * @see #getActividadEspacio()
	 * @generated
	 */
	EAttribute getActividadEspacio_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mindmap.model.ActividadEspacio#getTareas <em>Tareas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tareas</em>'.
	 * @see org.mindmap.model.ActividadEspacio#getTareas()
	 * @see #getActividadEspacio()
	 * @generated
	 */
	EReference getActividadEspacio_Tareas();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mindmap.model.ActividadEspacio#getLecciones <em>Lecciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lecciones</em>'.
	 * @see org.mindmap.model.ActividadEspacio#getLecciones()
	 * @see #getActividadEspacio()
	 * @generated
	 */
	EReference getActividadEspacio_Lecciones();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mindmap.model.ActividadEspacio#getPruebas <em>Pruebas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pruebas</em>'.
	 * @see org.mindmap.model.ActividadEspacio#getPruebas()
	 * @see #getActividadEspacio()
	 * @generated
	 */
	EReference getActividadEspacio_Pruebas();

	/**
	 * Returns the meta object for class '{@link org.mindmap.model.Tarea <em>Tarea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tarea</em>'.
	 * @see org.mindmap.model.Tarea
	 * @generated
	 */
	EClass getTarea();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.Tarea#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see org.mindmap.model.Tarea#getNombre()
	 * @see #getTarea()
	 * @generated
	 */
	EAttribute getTarea_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.Tarea#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see org.mindmap.model.Tarea#getTipo()
	 * @see #getTarea()
	 * @generated
	 */
	EAttribute getTarea_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.Tarea#getPorcentajeNota <em>Porcentaje Nota</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Porcentaje Nota</em>'.
	 * @see org.mindmap.model.Tarea#getPorcentajeNota()
	 * @see #getTarea()
	 * @generated
	 */
	EAttribute getTarea_PorcentajeNota();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.Tarea#getDuracion <em>Duracion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duracion</em>'.
	 * @see org.mindmap.model.Tarea#getDuracion()
	 * @see #getTarea()
	 * @generated
	 */
	EAttribute getTarea_Duracion();

	/**
	 * Returns the meta object for the containment reference '{@link org.mindmap.model.Tarea#getContenidos <em>Contenidos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contenidos</em>'.
	 * @see org.mindmap.model.Tarea#getContenidos()
	 * @see #getTarea()
	 * @generated
	 */
	EReference getTarea_Contenidos();

	/**
	 * Returns the meta object for class '{@link org.mindmap.model.Leccion <em>Leccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leccion</em>'.
	 * @see org.mindmap.model.Leccion
	 * @generated
	 */
	EClass getLeccion();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.Leccion#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see org.mindmap.model.Leccion#getNombre()
	 * @see #getLeccion()
	 * @generated
	 */
	EAttribute getLeccion_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.Leccion#getProfesor <em>Profesor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profesor</em>'.
	 * @see org.mindmap.model.Leccion#getProfesor()
	 * @see #getLeccion()
	 * @generated
	 */
	EAttribute getLeccion_Profesor();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.Leccion#getPorcentajeNota <em>Porcentaje Nota</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Porcentaje Nota</em>'.
	 * @see org.mindmap.model.Leccion#getPorcentajeNota()
	 * @see #getLeccion()
	 * @generated
	 */
	EAttribute getLeccion_PorcentajeNota();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.Leccion#getDuracion <em>Duracion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duracion</em>'.
	 * @see org.mindmap.model.Leccion#getDuracion()
	 * @see #getLeccion()
	 * @generated
	 */
	EAttribute getLeccion_Duracion();

	/**
	 * Returns the meta object for the containment reference '{@link org.mindmap.model.Leccion#getContenidos <em>Contenidos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contenidos</em>'.
	 * @see org.mindmap.model.Leccion#getContenidos()
	 * @see #getLeccion()
	 * @generated
	 */
	EReference getLeccion_Contenidos();

	/**
	 * Returns the meta object for class '{@link org.mindmap.model.Prueba <em>Prueba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prueba</em>'.
	 * @see org.mindmap.model.Prueba
	 * @generated
	 */
	EClass getPrueba();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.Prueba#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see org.mindmap.model.Prueba#getNombre()
	 * @see #getPrueba()
	 * @generated
	 */
	EAttribute getPrueba_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.Prueba#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see org.mindmap.model.Prueba#getTipo()
	 * @see #getPrueba()
	 * @generated
	 */
	EAttribute getPrueba_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.Prueba#getPorcentajeNota <em>Porcentaje Nota</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Porcentaje Nota</em>'.
	 * @see org.mindmap.model.Prueba#getPorcentajeNota()
	 * @see #getPrueba()
	 * @generated
	 */
	EAttribute getPrueba_PorcentajeNota();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.Prueba#getDuracion <em>Duracion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duracion</em>'.
	 * @see org.mindmap.model.Prueba#getDuracion()
	 * @see #getPrueba()
	 * @generated
	 */
	EAttribute getPrueba_Duracion();

	/**
	 * Returns the meta object for class '{@link org.mindmap.model.ActividadNodoInicial <em>Actividad Nodo Inicial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actividad Nodo Inicial</em>'.
	 * @see org.mindmap.model.ActividadNodoInicial
	 * @generated
	 */
	EClass getActividadNodoInicial();

	/**
	 * Returns the meta object for class '{@link org.mindmap.model.ActividadNodoFinal <em>Actividad Nodo Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actividad Nodo Final</em>'.
	 * @see org.mindmap.model.ActividadNodoFinal
	 * @generated
	 */
	EClass getActividadNodoFinal();

	/**
	 * Returns the meta object for class '{@link org.mindmap.model.ActividadEnlace <em>Actividad Enlace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actividad Enlace</em>'.
	 * @see org.mindmap.model.ActividadEnlace
	 * @generated
	 */
	EClass getActividadEnlace();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.ActividadEnlace#getEtiqueta <em>Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etiqueta</em>'.
	 * @see org.mindmap.model.ActividadEnlace#getEtiqueta()
	 * @see #getActividadEnlace()
	 * @generated
	 */
	EAttribute getActividadEnlace_Etiqueta();

	/**
	 * Returns the meta object for the reference '{@link org.mindmap.model.ActividadEnlace#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origen</em>'.
	 * @see org.mindmap.model.ActividadEnlace#getOrigen()
	 * @see #getActividadEnlace()
	 * @generated
	 */
	EReference getActividadEnlace_Origen();

	/**
	 * Returns the meta object for the reference '{@link org.mindmap.model.ActividadEnlace#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destino</em>'.
	 * @see org.mindmap.model.ActividadEnlace#getDestino()
	 * @see #getActividadEnlace()
	 * @generated
	 */
	EReference getActividadEnlace_Destino();

	/**
	 * Returns the meta object for class '{@link org.mindmap.model.ActividadUnionBifurcacion <em>Actividad Union Bifurcacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actividad Union Bifurcacion</em>'.
	 * @see org.mindmap.model.ActividadUnionBifurcacion
	 * @generated
	 */
	EClass getActividadUnionBifurcacion();

	/**
	 * Returns the meta object for class '{@link org.mindmap.model.ActividadNodo <em>Actividad Nodo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actividad Nodo</em>'.
	 * @see org.mindmap.model.ActividadNodo
	 * @generated
	 */
	EClass getActividadNodo();

	/**
	 * Returns the meta object for class '{@link org.mindmap.model.ArchivoAdjunto <em>Archivo Adjunto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archivo Adjunto</em>'.
	 * @see org.mindmap.model.ArchivoAdjunto
	 * @generated
	 */
	EClass getArchivoAdjunto();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.ArchivoAdjunto#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see org.mindmap.model.ArchivoAdjunto#getNombre()
	 * @see #getArchivoAdjunto()
	 * @generated
	 */
	EAttribute getArchivoAdjunto_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link org.mindmap.model.ArchivoAdjunto#getFileId <em>File Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Id</em>'.
	 * @see org.mindmap.model.ArchivoAdjunto#getFileId()
	 * @see #getArchivoAdjunto()
	 * @generated
	 */
	EAttribute getArchivoAdjunto_FileId();

	/**
	 * Returns the meta object for class '{@link org.mindmap.model.MiRelativeBendpoints <em>Mi Relative Bendpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mi Relative Bendpoints</em>'.
	 * @see org.mindmap.model.MiRelativeBendpoints
	 * @generated
	 */
	EClass getMiRelativeBendpoints();

	/**
	 * Returns the meta object for enum '{@link org.mindmap.model.Bloque2 <em>Bloque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bloque</em>'.
	 * @see org.mindmap.model.Bloque2
	 * @generated
	 */
	EEnum getBloque();

	/**
	 * Returns the meta object for data type '{@link org.mindmap.model.impl.MiRelativeBendpoint <em>Mi Relative Bendpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mi Relative Bendpoint</em>'.
	 * @see org.mindmap.model.impl.MiRelativeBendpoint
	 * @model instanceClass="org.mindmap.model.impl.MiRelativeBendpoint"
	 * @generated
	 */
	EDataType getMiRelativeBendpoint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.mindmap.model.impl.CursoElementImpl <em>Curso Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mindmap.model.impl.CursoElementImpl
		 * @see org.mindmap.model.impl.ModelPackageImpl#getCursoElement()
		 * @generated
		 */
		EClass CURSO_ELEMENT = eINSTANCE.getCursoElement();

		/**
		 * The meta object literal for the '{@link org.mindmap.model.impl.CursoImpl <em>Curso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mindmap.model.impl.CursoImpl
		 * @see org.mindmap.model.impl.ModelPackageImpl#getCurso()
		 * @generated
		 */
		EClass CURSO = eINSTANCE.getCurso();

		/**
		 * The meta object literal for the '<em><b>Diagramas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURSO__DIAGRAMAS = eINSTANCE.getCurso_Diagramas();

		/**
		 * The meta object literal for the '<em><b>Propiedades</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURSO__PROPIEDADES = eINSTANCE.getCurso_Propiedades();

		/**
		 * The meta object literal for the '{@link org.mindmap.model.impl.PropiedadCursoImpl <em>Propiedad Curso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mindmap.model.impl.PropiedadCursoImpl
		 * @see org.mindmap.model.impl.ModelPackageImpl#getPropiedadCurso()
		 * @generated
		 */
		EClass PROPIEDAD_CURSO = eINSTANCE.getPropiedadCurso();

		/**
		 * The meta object literal for the '<em><b>Bibliografia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPIEDAD_CURSO__BIBLIOGRAFIA = eINSTANCE
				.getPropiedadCurso_Bibliografia();

		/**
		 * The meta object literal for the '<em><b>Requisitos Previos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPIEDAD_CURSO__REQUISITOS_PREVIOS = eINSTANCE
				.getPropiedadCurso_RequisitosPrevios();

		/**
		 * The meta object literal for the '<em><b>Competencias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPIEDAD_CURSO__COMPETENCIAS = eINSTANCE
				.getPropiedadCurso_Competencias();

		/**
		 * The meta object literal for the '<em><b>Sistema Evaluacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPIEDAD_CURSO__SISTEMA_EVALUACION = eINSTANCE
				.getPropiedadCurso_SistemaEvaluacion();

		/**
		 * The meta object literal for the '<em><b>Asignatura</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPIEDAD_CURSO__ASIGNATURA = eINSTANCE
				.getPropiedadCurso_Asignatura();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPIEDAD_CURSO__AREA = eINSTANCE.getPropiedadCurso_Area();

		/**
		 * The meta object literal for the '<em><b>Oferta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPIEDAD_CURSO__OFERTA = eINSTANCE
				.getPropiedadCurso_Oferta();

		/**
		 * The meta object literal for the '<em><b>Semestre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPIEDAD_CURSO__SEMESTRE = eINSTANCE
				.getPropiedadCurso_Semestre();

		/**
		 * The meta object literal for the '<em><b>Creditos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPIEDAD_CURSO__CREDITOS = eINSTANCE
				.getPropiedadCurso_Creditos();

		/**
		 * The meta object literal for the '<em><b>Horas grp gra</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPIEDAD_CURSO__HORAS_GRP_GRA = eINSTANCE
				.getPropiedadCurso_Horas_grp_gra();

		/**
		 * The meta object literal for the '<em><b>Horas grp red</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPIEDAD_CURSO__HORAS_GRP_RED = eINSTANCE
				.getPropiedadCurso_Horas_grp_red();

		/**
		 * The meta object literal for the '<em><b>Coordinador</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPIEDAD_CURSO__COORDINADOR = eINSTANCE
				.getPropiedadCurso_Coordinador();

		/**
		 * The meta object literal for the '{@link org.mindmap.model.impl.CursoDiagramaImpl <em>Curso Diagrama</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mindmap.model.impl.CursoDiagramaImpl
		 * @see org.mindmap.model.impl.ModelPackageImpl#getCursoDiagrama()
		 * @generated
		 */
		EClass CURSO_DIAGRAMA = eINSTANCE.getCursoDiagrama();

		/**
		 * The meta object literal for the '<em><b>Gmfdiagram</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURSO_DIAGRAMA__GMFDIAGRAM = eINSTANCE
				.getCursoDiagrama_Gmfdiagram();

		/**
		 * The meta object literal for the '<em><b>Actividades</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURSO_DIAGRAMA__ACTIVIDADES = eINSTANCE
				.getCursoDiagrama_Actividades();

		/**
		 * The meta object literal for the '<em><b>Temas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURSO_DIAGRAMA__TEMAS = eINSTANCE.getCursoDiagrama_Temas();

		/**
		 * The meta object literal for the '<em><b>Enlaces Actividad</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURSO_DIAGRAMA__ENLACES_ACTIVIDAD = eINSTANCE
				.getCursoDiagrama_EnlacesActividad();

		/**
		 * The meta object literal for the '<em><b>Enlaces Usa Bloque</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURSO_DIAGRAMA__ENLACES_USA_BLOQUE = eINSTANCE
				.getCursoDiagrama_EnlacesUsaBloque();

		/**
		 * The meta object literal for the '<em><b>Enlace Usa</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURSO_DIAGRAMA__ENLACE_USA = eINSTANCE
				.getCursoDiagrama_EnlaceUsa();

		/**
		 * The meta object literal for the '<em><b>Enlaces Es Un</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURSO_DIAGRAMA__ENLACES_ES_UN = eINSTANCE
				.getCursoDiagrama_EnlacesEsUn();

		/**
		 * The meta object literal for the '<em><b>Unionesbifurcaciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURSO_DIAGRAMA__UNIONESBIFURCACIONES = eINSTANCE
				.getCursoDiagrama_Unionesbifurcaciones();

		/**
		 * The meta object literal for the '{@link org.mindmap.model.impl.ActividadDiagramaImpl <em>Actividad Diagrama</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mindmap.model.impl.ActividadDiagramaImpl
		 * @see org.mindmap.model.impl.ModelPackageImpl#getActividadDiagrama()
		 * @generated
		 */
		EClass ACTIVIDAD_DIAGRAMA = eINSTANCE.getActividadDiagrama();

		/**
		 * The meta object literal for the '<em><b>Elemento Nodo Final</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVIDAD_DIAGRAMA__ELEMENTO_NODO_FINAL = eINSTANCE
				.getActividadDiagrama_ElementoNodoFinal();

		/**
		 * The meta object literal for the '<em><b>Elemento Nodo Inicial</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVIDAD_DIAGRAMA__ELEMENTO_NODO_INICIAL = eINSTANCE
				.getActividadDiagrama_ElementoNodoInicial();

		/**
		 * The meta object literal for the '{@link org.mindmap.model.impl.ConceptosDiagramaImpl <em>Conceptos Diagrama</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mindmap.model.impl.ConceptosDiagramaImpl
		 * @see org.mindmap.model.impl.ModelPackageImpl#getConceptosDiagrama()
		 * @generated
		 */
		EClass CONCEPTOS_DIAGRAMA = eINSTANCE.getConceptosDiagrama();

		/**
		 * The meta object literal for the '{@link org.mindmap.model.impl.TemaImpl <em>Tema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mindmap.model.impl.TemaImpl
		 * @see org.mindmap.model.impl.ModelPackageImpl#getTema()
		 * @generated
		 */
		EClass TEMA = eINSTANCE.getTema();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMA__NOMBRE = eINSTANCE.getTema_Nombre();

		/**
		 * The meta object literal for the '<em><b>Anotaciones</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMA__ANOTACIONES = eINSTANCE.getTema_Anotaciones();

		/**
		 * The meta object literal for the '<em><b>Conceptos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMA__CONCEPTOS = eINSTANCE.getTema_Conceptos();

		/**
		 * The meta object literal for the '{@link org.mindmap.model.impl.ConceptoImpl <em>Concepto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mindmap.model.impl.ConceptoImpl
		 * @see org.mindmap.model.impl.ModelPackageImpl#getConcepto()
		 * @generated
		 */
		EClass CONCEPTO = eINSTANCE.getConcepto();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPTO__NOMBRE = eINSTANCE.getConcepto_Nombre();

		/**
		 * The meta object literal for the '<em><b>Anotaciones</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPTO__ANOTACIONES = eINSTANCE.getConcepto_Anotaciones();

		/**
		 * The meta object literal for the '<em><b>Atributos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPTO__ATRIBUTOS = eINSTANCE.getConcepto_Atributos();

		/**
		 * The meta object literal for the '{@link org.mindmap.model.impl.AtributoImpl <em>Atributo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mindmap.model.impl.AtributoImpl
		 * @see org.mindmap.model.impl.ModelPackageImpl#getAtributo()
		 * @generated
		 */
		EClass ATRIBUTO = eINSTANCE.getAtributo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__NOMBRE = eINSTANCE.getAtributo_Nombre();

		/**
		 * The meta object literal for the '{@link org.mindmap.model.impl.EnlaceUsaBloqueImpl <em>Enlace Usa Bloque</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mindmap.model.impl.EnlaceUsaBloqueImpl
		 * @see org.mindmap.model.impl.ModelPackageImpl#getEnlaceUsaBloque()
		 * @generated
		 */
		EClass ENLACE_USA_BLOQUE = eINSTANCE.getEnlaceUsaBloque();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENLACE_USA_BLOQUE__ETIQUETA = eINSTANCE
				.getEnlaceUsaBloque_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENLACE_USA_BLOQUE__ORIGEN = eINSTANCE
				.getEnlaceUsaBloque_Origen();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENLACE_USA_BLOQUE__DESTINO = eINSTANCE
				.getEnlaceUsaBloque_Destino();

		/**
		 * The meta object literal for the '{@link org.mindmap.model.impl.EnlaceEsUnImpl <em>Enlace Es Un</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mindmap.model.impl.EnlaceEsUnImpl
		 * @see org.mindmap.model.impl.ModelPackageImpl#getEnlaceEsUn()
		 * @generated
		 */
		EClass ENLACE_ES_UN = eINSTANCE.getEnlaceEsUn();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENLACE_ES_UN__ETIQUETA = eINSTANCE.getEnlaceEsUn_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENLACE_ES_UN__ORIGEN = eINSTANCE.getEnlaceEsUn_Origen();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENLACE_ES_UN__DESTINO = eINSTANCE.getEnlaceEsUn_Destino();

		/**
		 * The meta object literal for the '{@link org.mindmap.model.impl.EnlaceUsaImpl <em>Enlace Usa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mindmap.model.impl.EnlaceUsaImpl
		 * @see org.mindmap.model.impl.ModelPackageImpl#getEnlaceUsa()
		 * @generated
		 */
		EClass ENLACE_USA = eINSTANCE.getEnlaceUsa();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENLACE_USA__ETIQUETA = eINSTANCE.getEnlaceUsa_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENLACE_USA__ORIGEN = eINSTANCE.getEnlaceUsa_Origen();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENLACE_USA__DESTINO = eINSTANCE.getEnlaceUsa_Destino();

		/**
		 * The meta object literal for the '{@link org.mindmap.model.impl.ActividadImpl <em>Actividad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mindmap.model.impl.ActividadImpl
		 * @see org.mindmap.model.impl.ModelPackageImpl#getActividad()
		 * @generated
		 */
		EClass ACTIVIDAD = eINSTANCE.getActividad();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVIDAD__NOMBRE = eINSTANCE.getActividad_Nombre();

		/**
		 * The meta object literal for the '<em><b>Bloque</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVIDAD__BLOQUE = eINSTANCE.getActividad_Bloque();

		/**
		 * The meta object literal for the '<em><b>Espacios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVIDAD__ESPACIOS = eINSTANCE.getActividad_Espacios();

		/**
		 * The meta object literal for the '{@link org.mindmap.model.impl.ActividadEspacioImpl <em>Actividad Espacio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mindmap.model.impl.ActividadEspacioImpl
		 * @see org.mindmap.model.impl.ModelPackageImpl#getActividadEspacio()
		 * @generated
		 */
		EClass ACTIVIDAD_ESPACIO = eINSTANCE.getActividadEspacio();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVIDAD_ESPACIO__NOMBRE = eINSTANCE
				.getActividadEspacio_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tareas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVIDAD_ESPACIO__TAREAS = eINSTANCE
				.getActividadEspacio_Tareas();

		/**
		 * The meta object literal for the '<em><b>Lecciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVIDAD_ESPACIO__LECCIONES = eINSTANCE
				.getActividadEspacio_Lecciones();

		/**
		 * The meta object literal for the '<em><b>Pruebas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVIDAD_ESPACIO__PRUEBAS = eINSTANCE
				.getActividadEspacio_Pruebas();

		/**
		 * The meta object literal for the '{@link org.mindmap.model.impl.TareaImpl <em>Tarea</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mindmap.model.impl.TareaImpl
		 * @see org.mindmap.model.impl.ModelPackageImpl#getTarea()
		 * @generated
		 */
		EClass TAREA = eINSTANCE.getTarea();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAREA__NOMBRE = eINSTANCE.getTarea_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAREA__TIPO = eINSTANCE.getTarea_Tipo();

		/**
		 * The meta object literal for the '<em><b>Porcentaje Nota</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAREA__PORCENTAJE_NOTA = eINSTANCE.getTarea_PorcentajeNota();

		/**
		 * The meta object literal for the '<em><b>Duracion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAREA__DURACION = eINSTANCE.getTarea_Duracion();

		/**
		 * The meta object literal for the '<em><b>Contenidos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAREA__CONTENIDOS = eINSTANCE.getTarea_Contenidos();

		/**
		 * The meta object literal for the '{@link org.mindmap.model.impl.LeccionImpl <em>Leccion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mindmap.model.impl.LeccionImpl
		 * @see org.mindmap.model.impl.ModelPackageImpl#getLeccion()
		 * @generated
		 */
		EClass LECCION = eINSTANCE.getLeccion();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LECCION__NOMBRE = eINSTANCE.getLeccion_Nombre();

		/**
		 * The meta object literal for the '<em><b>Profesor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LECCION__PROFESOR = eINSTANCE.getLeccion_Profesor();

		/**
		 * The meta object literal for the '<em><b>Porcentaje Nota</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LECCION__PORCENTAJE_NOTA = eINSTANCE
				.getLeccion_PorcentajeNota();

		/**
		 * The meta object literal for the '<em><b>Duracion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LECCION__DURACION = eINSTANCE.getLeccion_Duracion();

		/**
		 * The meta object literal for the '<em><b>Contenidos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LECCION__CONTENIDOS = eINSTANCE.getLeccion_Contenidos();

		/**
		 * The meta object literal for the '{@link org.mindmap.model.impl.PruebaImpl <em>Prueba</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mindmap.model.impl.PruebaImpl
		 * @see org.mindmap.model.impl.ModelPackageImpl#getPrueba()
		 * @generated
		 */
		EClass PRUEBA = eINSTANCE.getPrueba();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRUEBA__NOMBRE = eINSTANCE.getPrueba_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRUEBA__TIPO = eINSTANCE.getPrueba_Tipo();

		/**
		 * The meta object literal for the '<em><b>Porcentaje Nota</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRUEBA__PORCENTAJE_NOTA = eINSTANCE
				.getPrueba_PorcentajeNota();

		/**
		 * The meta object literal for the '<em><b>Duracion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRUEBA__DURACION = eINSTANCE.getPrueba_Duracion();

		/**
		 * The meta object literal for the '{@link org.mindmap.model.impl.ActividadNodoInicialImpl <em>Actividad Nodo Inicial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mindmap.model.impl.ActividadNodoInicialImpl
		 * @see org.mindmap.model.impl.ModelPackageImpl#getActividadNodoInicial()
		 * @generated
		 */
		EClass ACTIVIDAD_NODO_INICIAL = eINSTANCE.getActividadNodoInicial();

		/**
		 * The meta object literal for the '{@link org.mindmap.model.impl.ActividadNodoFinalImpl <em>Actividad Nodo Final</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mindmap.model.impl.ActividadNodoFinalImpl
		 * @see org.mindmap.model.impl.ModelPackageImpl#getActividadNodoFinal()
		 * @generated
		 */
		EClass ACTIVIDAD_NODO_FINAL = eINSTANCE.getActividadNodoFinal();

		/**
		 * The meta object literal for the '{@link org.mindmap.model.impl.ActividadEnlaceImpl <em>Actividad Enlace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mindmap.model.impl.ActividadEnlaceImpl
		 * @see org.mindmap.model.impl.ModelPackageImpl#getActividadEnlace()
		 * @generated
		 */
		EClass ACTIVIDAD_ENLACE = eINSTANCE.getActividadEnlace();

		/**
		 * The meta object literal for the '<em><b>Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVIDAD_ENLACE__ETIQUETA = eINSTANCE
				.getActividadEnlace_Etiqueta();

		/**
		 * The meta object literal for the '<em><b>Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVIDAD_ENLACE__ORIGEN = eINSTANCE
				.getActividadEnlace_Origen();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVIDAD_ENLACE__DESTINO = eINSTANCE
				.getActividadEnlace_Destino();

		/**
		 * The meta object literal for the '{@link org.mindmap.model.impl.ActividadUnionBifurcacionImpl <em>Actividad Union Bifurcacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mindmap.model.impl.ActividadUnionBifurcacionImpl
		 * @see org.mindmap.model.impl.ModelPackageImpl#getActividadUnionBifurcacion()
		 * @generated
		 */
		EClass ACTIVIDAD_UNION_BIFURCACION = eINSTANCE
				.getActividadUnionBifurcacion();

		/**
		 * The meta object literal for the '{@link org.mindmap.model.impl.ActividadNodoImpl <em>Actividad Nodo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mindmap.model.impl.ActividadNodoImpl
		 * @see org.mindmap.model.impl.ModelPackageImpl#getActividadNodo()
		 * @generated
		 */
		EClass ACTIVIDAD_NODO = eINSTANCE.getActividadNodo();

		/**
		 * The meta object literal for the '{@link org.mindmap.model.impl.ArchivoAdjuntoImpl <em>Archivo Adjunto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mindmap.model.impl.ArchivoAdjuntoImpl
		 * @see org.mindmap.model.impl.ModelPackageImpl#getArchivoAdjunto()
		 * @generated
		 */
		EClass ARCHIVO_ADJUNTO = eINSTANCE.getArchivoAdjunto();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHIVO_ADJUNTO__NOMBRE = eINSTANCE
				.getArchivoAdjunto_Nombre();

		/**
		 * The meta object literal for the '<em><b>File Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHIVO_ADJUNTO__FILE_ID = eINSTANCE
				.getArchivoAdjunto_FileId();

		/**
		 * The meta object literal for the '{@link org.mindmap.model.impl.MiRelativeBendpointsImpl <em>Mi Relative Bendpoints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mindmap.model.impl.MiRelativeBendpointsImpl
		 * @see org.mindmap.model.impl.ModelPackageImpl#getMiRelativeBendpoints()
		 * @generated
		 */
		EClass MI_RELATIVE_BENDPOINTS = eINSTANCE.getMiRelativeBendpoints();

		/**
		 * The meta object literal for the '{@link org.mindmap.model.Bloque2 <em>Bloque</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mindmap.model.Bloque2
		 * @see org.mindmap.model.impl.ModelPackageImpl#getBloque()
		 * @generated
		 */
		EEnum BLOQUE = eINSTANCE.getBloque();

		/**
		 * The meta object literal for the '<em>Mi Relative Bendpoint</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mindmap.model.impl.MiRelativeBendpoint
		 * @see org.mindmap.model.impl.ModelPackageImpl#getMiRelativeBendpoint()
		 * @generated
		 */
		EDataType MI_RELATIVE_BENDPOINT = eINSTANCE.getMiRelativeBendpoint();

	}

} //ModelPackage
