/*
 * Copyright (c) 2005, 2018 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 215418, 204200
 *   Kenn Hussey - 323181, 438123, 535301
 *   Kenn Hussey (CEA) - 327039, 418466, 414970, 370089, 511674
 *
 */
package org.eclipse.uml2.uml.edit.providers;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.uml.Pin;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.uml.Pin} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PinItemProvider
		extends ObjectNodeItemProvider {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinItemProvider(AdapterFactory adapterFactory) {
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

			addIsOrderedPropertyDescriptor(object);
			addIsUniquePropertyDescriptor(object);
			addLowerPropertyDescriptor(object);
			addLowerValuePropertyDescriptor(object);
			addUpperPropertyDescriptor(object);
			addUpperValuePropertyDescriptor(object);
			addIsControlPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Ordered feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsOrderedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory)
				.getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_MultiplicityElement_isOrdered_feature"), //$NON-NLS-1$
			getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
				"_UI_MultiplicityElement_isOrdered_feature", //$NON-NLS-1$
				"_UI_MultiplicityElement_type"), //$NON-NLS-1$
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__IS_ORDERED, true, false,
			false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Is Unique feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsUniquePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory)
				.getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_MultiplicityElement_isUnique_feature"), //$NON-NLS-1$
			getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
				"_UI_MultiplicityElement_isUnique_feature", //$NON-NLS-1$
				"_UI_MultiplicityElement_type"), //$NON-NLS-1$
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__IS_UNIQUE, true, false,
			false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Upper feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpperPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory)
				.getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_MultiplicityElement_upper_feature"), //$NON-NLS-1$
			getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
				"_UI_MultiplicityElement_upper_feature", //$NON-NLS-1$
				"_UI_MultiplicityElement_type"), //$NON-NLS-1$
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER, true, false, false,
			ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Upper Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpperValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory)
				.getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_MultiplicityElement_upperValue_feature"), //$NON-NLS-1$
			getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
				"_UI_MultiplicityElement_upperValue_feature", //$NON-NLS-1$
				"_UI_MultiplicityElement_type"), //$NON-NLS-1$
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE, true, false,
			true, null, null,
			new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
			}));
	}

	/**
	 * This adds a property descriptor for the Lower feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLowerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory)
				.getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_MultiplicityElement_lower_feature"), //$NON-NLS-1$
			getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
				"_UI_MultiplicityElement_lower_feature", //$NON-NLS-1$
				"_UI_MultiplicityElement_type"), //$NON-NLS-1$
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER, true, false, false,
			ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Lower Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLowerValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory)
				.getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_MultiplicityElement_lowerValue_feature"), //$NON-NLS-1$
			getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
				"_UI_MultiplicityElement_lowerValue_feature", //$NON-NLS-1$
				"_UI_MultiplicityElement_type"), //$NON-NLS-1$
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE, true, false,
			true, null, null,
			new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
			}));
	}

	/**
	 * This adds a property descriptor for the Is Control feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsControlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory)
				.getRootAdapterFactory(),
			getResourceLocator(), getString("_UI_Pin_isControl_feature"), //$NON-NLS-1$
			getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
				"_UI_Pin_isControl_feature", "_UI_Pin_type"), //$NON-NLS-1$ //$NON-NLS-2$
			UMLPackage.Literals.PIN__IS_CONTROL, true, false, false,
			ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
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
				.add(UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE);
			childrenFeatures
				.add(UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE);
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
	 * This returns Pin.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
			getResourceLocator().getImage("full/obj16/Pin")); //$NON-NLS-1$
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		return MultiplicityElementItemProvider.appendMultiplicity(
			appendLabel(appendType(appendKeywords(new StringBuffer(), object),
				"_UI_Pin_type"), object), //$NON-NLS-1$
			object).toString();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChangedGen(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Pin.class)) {
			case UMLPackage.PIN__IS_ORDERED :
			case UMLPackage.PIN__IS_UNIQUE :
			case UMLPackage.PIN__LOWER :
			case UMLPackage.PIN__UPPER :
			case UMLPackage.PIN__IS_CONTROL :
				fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
				return;
			case UMLPackage.PIN__LOWER_VALUE :
			case UMLPackage.PIN__UPPER_VALUE :
				fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	@Override
	public void notifyChanged(Notification notification) {

		switch (notification.getFeatureID(Pin.class)) {
			case UMLPackage.PIN__UPPER_VALUE :
			case UMLPackage.PIN__LOWER_VALUE :
				updateChildren(notification);
				fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, true));
				return;
		}

		notifyChangedGen(notification);
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
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
			UMLFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
			UMLFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
			UMLFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
			UMLFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
			UMLFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
			UMLFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
			UMLFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
			UMLFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
			UMLFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
			UMLFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
			UMLFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
			UMLFactory.eINSTANCE.createLiteralReal()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
			UMLFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
			UMLFactory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE,
			UMLFactory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
			UMLFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
			UMLFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
			UMLFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
			UMLFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
			UMLFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
			UMLFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
			UMLFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
			UMLFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
			UMLFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
			UMLFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
			UMLFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
			UMLFactory.eINSTANCE.createLiteralReal()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
			UMLFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
			UMLFactory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE,
			UMLFactory.eINSTANCE.createTimeInterval()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child,
			Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == UMLPackage.Literals.NAMED_ELEMENT__NAME_EXPRESSION
			|| childFeature == UMLPackage.Literals.OBJECT_NODE__UPPER_BOUND
			|| childFeature == UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE
			|| childFeature == UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE;

		if (qualify) {
			return getString("_UI_CreateChild_text2", //$NON-NLS-1$
				new Object[]{getTypeText(childObject),
					getFeatureText(childFeature), getTypeText(owner)});
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}