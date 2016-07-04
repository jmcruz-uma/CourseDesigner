/**
 */
package org.mindmap.model.provider;

import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.mindmap.model.CursoDiagrama;
import org.mindmap.model.ModelFactory;
import org.mindmap.model.ModelPackage;

/**
 * This is the item provider adapter for a {@link org.mindmap.model.CursoDiagrama} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CursoDiagramaItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CursoDiagramaItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures
					.add(ModelPackage.Literals.CURSO_DIAGRAMA__GMFDIAGRAM);
			childrenFeatures
					.add(ModelPackage.Literals.CURSO_DIAGRAMA__ACTIVIDADES);
			childrenFeatures.add(ModelPackage.Literals.CURSO_DIAGRAMA__TEMAS);
			childrenFeatures
					.add(ModelPackage.Literals.CURSO_DIAGRAMA__ENLACES_ACTIVIDAD);
			childrenFeatures
					.add(ModelPackage.Literals.CURSO_DIAGRAMA__ENLACES_USA_BLOQUE);
			childrenFeatures
					.add(ModelPackage.Literals.CURSO_DIAGRAMA__ENLACE_USA);
			childrenFeatures
					.add(ModelPackage.Literals.CURSO_DIAGRAMA__ENLACES_ES_UN);
			childrenFeatures
					.add(ModelPackage.Literals.CURSO_DIAGRAMA__UNIONESBIFURCACIONES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_CursoDiagrama_type");
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

		switch (notification.getFeatureID(CursoDiagrama.class)) {
		case ModelPackage.CURSO_DIAGRAMA__GMFDIAGRAM:
		case ModelPackage.CURSO_DIAGRAMA__ACTIVIDADES:
		case ModelPackage.CURSO_DIAGRAMA__TEMAS:
		case ModelPackage.CURSO_DIAGRAMA__ENLACES_ACTIVIDAD:
		case ModelPackage.CURSO_DIAGRAMA__ENLACES_USA_BLOQUE:
		case ModelPackage.CURSO_DIAGRAMA__ENLACE_USA:
		case ModelPackage.CURSO_DIAGRAMA__ENLACES_ES_UN:
		case ModelPackage.CURSO_DIAGRAMA__UNIONESBIFURCACIONES:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(
				ModelPackage.Literals.CURSO_DIAGRAMA__GMFDIAGRAM,
				NotationFactory.eINSTANCE.createDiagram()));

		newChildDescriptors.add(createChildParameter(
				ModelPackage.Literals.CURSO_DIAGRAMA__GMFDIAGRAM,
				NotationFactory.eINSTANCE.createStandardDiagram()));

		newChildDescriptors.add(createChildParameter(
				ModelPackage.Literals.CURSO_DIAGRAMA__ACTIVIDADES,
				ModelFactory.eINSTANCE.createActividad()));

		newChildDescriptors.add(createChildParameter(
				ModelPackage.Literals.CURSO_DIAGRAMA__TEMAS,
				ModelFactory.eINSTANCE.createTema()));

		newChildDescriptors.add(createChildParameter(
				ModelPackage.Literals.CURSO_DIAGRAMA__ENLACES_ACTIVIDAD,
				ModelFactory.eINSTANCE.createActividadEnlace()));

		newChildDescriptors.add(createChildParameter(
				ModelPackage.Literals.CURSO_DIAGRAMA__ENLACES_USA_BLOQUE,
				ModelFactory.eINSTANCE.createEnlaceUsaBloque()));

		newChildDescriptors.add(createChildParameter(
				ModelPackage.Literals.CURSO_DIAGRAMA__ENLACE_USA,
				ModelFactory.eINSTANCE.createEnlaceUsa()));

		newChildDescriptors.add(createChildParameter(
				ModelPackage.Literals.CURSO_DIAGRAMA__ENLACES_ES_UN,
				ModelFactory.eINSTANCE.createEnlaceEsUn()));

		newChildDescriptors.add(createChildParameter(
				ModelPackage.Literals.CURSO_DIAGRAMA__UNIONESBIFURCACIONES,
				ModelFactory.eINSTANCE.createActividadUnionBifurcacion()));
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
