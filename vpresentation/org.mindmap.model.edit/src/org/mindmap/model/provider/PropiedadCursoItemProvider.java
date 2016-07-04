/**
 */
package org.mindmap.model.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.mindmap.model.ModelPackage;
import org.mindmap.model.PropiedadCurso;

/**
 * This is the item provider adapter for a {@link org.mindmap.model.PropiedadCurso} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PropiedadCursoItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropiedadCursoItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addBibliografiaPropertyDescriptor(object);
			addRequisitosPreviosPropertyDescriptor(object);
			addCompetenciasPropertyDescriptor(object);
			addSistemaEvaluacionPropertyDescriptor(object);
			addAsignaturaPropertyDescriptor(object);
			addAreaPropertyDescriptor(object);
			addOfertaPropertyDescriptor(object);
			addSemestrePropertyDescriptor(object);
			addCreditosPropertyDescriptor(object);
			addHoras_grp_graPropertyDescriptor(object);
			addHoras_grp_redPropertyDescriptor(object);
			addCoordinadorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Bibliografia feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBibliografiaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_PropiedadCurso_bibliografia_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PropiedadCurso_bibliografia_feature",
						"_UI_PropiedadCurso_type"),
				ModelPackage.Literals.PROPIEDAD_CURSO__BIBLIOGRAFIA, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Requisitos Previos feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequisitosPreviosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_PropiedadCurso_requisitosPrevios_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PropiedadCurso_requisitosPrevios_feature",
						"_UI_PropiedadCurso_type"),
				ModelPackage.Literals.PROPIEDAD_CURSO__REQUISITOS_PREVIOS,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null, null));
	}

	/**
	 * This adds a property descriptor for the Competencias feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompetenciasPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_PropiedadCurso_competencias_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PropiedadCurso_competencias_feature",
						"_UI_PropiedadCurso_type"),
				ModelPackage.Literals.PROPIEDAD_CURSO__COMPETENCIAS, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Sistema Evaluacion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSistemaEvaluacionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_PropiedadCurso_sistemaEvaluacion_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PropiedadCurso_sistemaEvaluacion_feature",
						"_UI_PropiedadCurso_type"),
				ModelPackage.Literals.PROPIEDAD_CURSO__SISTEMA_EVALUACION,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null, null));
	}

	/**
	 * This adds a property descriptor for the Asignatura feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAsignaturaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_PropiedadCurso_asignatura_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PropiedadCurso_asignatura_feature",
						"_UI_PropiedadCurso_type"),
				ModelPackage.Literals.PROPIEDAD_CURSO__ASIGNATURA, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Area feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAreaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_PropiedadCurso_area_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PropiedadCurso_area_feature",
						"_UI_PropiedadCurso_type"),
				ModelPackage.Literals.PROPIEDAD_CURSO__AREA, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Oferta feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOfertaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_PropiedadCurso_oferta_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PropiedadCurso_oferta_feature",
						"_UI_PropiedadCurso_type"),
				ModelPackage.Literals.PROPIEDAD_CURSO__OFERTA, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Semestre feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemestrePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_PropiedadCurso_semestre_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PropiedadCurso_semestre_feature",
						"_UI_PropiedadCurso_type"),
				ModelPackage.Literals.PROPIEDAD_CURSO__SEMESTRE, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Creditos feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreditosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_PropiedadCurso_creditos_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PropiedadCurso_creditos_feature",
						"_UI_PropiedadCurso_type"),
				ModelPackage.Literals.PROPIEDAD_CURSO__CREDITOS, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Horas grp gra feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHoras_grp_graPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_PropiedadCurso_horas_grp_gra_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PropiedadCurso_horas_grp_gra_feature",
						"_UI_PropiedadCurso_type"),
				ModelPackage.Literals.PROPIEDAD_CURSO__HORAS_GRP_GRA, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Horas grp red feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHoras_grp_redPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_PropiedadCurso_horas_grp_red_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PropiedadCurso_horas_grp_red_feature",
						"_UI_PropiedadCurso_type"),
				ModelPackage.Literals.PROPIEDAD_CURSO__HORAS_GRP_RED, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Coordinador feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCoordinadorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_PropiedadCurso_coordinador_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PropiedadCurso_coordinador_feature",
						"_UI_PropiedadCurso_type"),
				ModelPackage.Literals.PROPIEDAD_CURSO__COORDINADOR, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				null));
	}

	/**
	 * This returns PropiedadCurso.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/PropiedadCurso"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PropiedadCurso) object).getBibliografia();
		return label == null || label.length() == 0 ? getString("_UI_PropiedadCurso_type")
				: getString("_UI_PropiedadCurso_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(PropiedadCurso.class)) {
		case ModelPackage.PROPIEDAD_CURSO__BIBLIOGRAFIA:
		case ModelPackage.PROPIEDAD_CURSO__REQUISITOS_PREVIOS:
		case ModelPackage.PROPIEDAD_CURSO__COMPETENCIAS:
		case ModelPackage.PROPIEDAD_CURSO__SISTEMA_EVALUACION:
		case ModelPackage.PROPIEDAD_CURSO__ASIGNATURA:
		case ModelPackage.PROPIEDAD_CURSO__AREA:
		case ModelPackage.PROPIEDAD_CURSO__OFERTA:
		case ModelPackage.PROPIEDAD_CURSO__SEMESTRE:
		case ModelPackage.PROPIEDAD_CURSO__CREDITOS:
		case ModelPackage.PROPIEDAD_CURSO__HORAS_GRP_GRA:
		case ModelPackage.PROPIEDAD_CURSO__HORAS_GRP_RED:
		case ModelPackage.PROPIEDAD_CURSO__COORDINADOR:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MindmapEditPlugin.INSTANCE;
	}

}
