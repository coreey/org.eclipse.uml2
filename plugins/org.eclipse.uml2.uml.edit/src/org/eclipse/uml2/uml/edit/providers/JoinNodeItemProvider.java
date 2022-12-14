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

import org.eclipse.uml2.uml.JoinNode;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.uml.JoinNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JoinNodeItemProvider
		extends ControlNodeItemProvider {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinNodeItemProvider(AdapterFactory adapterFactory) {
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

			addIsCombineDuplicatePropertyDescriptor(object);
			addJoinSpecPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Combine Duplicate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsCombineDuplicatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory)
				.getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_JoinNode_isCombineDuplicate_feature"), //$NON-NLS-1$
			getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
				"_UI_JoinNode_isCombineDuplicate_feature", "_UI_JoinNode_type"), //$NON-NLS-1$ //$NON-NLS-2$
			UMLPackage.Literals.JOIN_NODE__IS_COMBINE_DUPLICATE, true, false,
			false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Join Spec feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJoinSpecPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory)
				.getRootAdapterFactory(),
			getResourceLocator(), getString("_UI_JoinNode_joinSpec_feature"), //$NON-NLS-1$
			getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
				"_UI_JoinNode_joinSpec_feature", "_UI_JoinNode_type"), //$NON-NLS-1$ //$NON-NLS-2$
			UMLPackage.Literals.JOIN_NODE__JOIN_SPEC, true, false, true, null,
			null, new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
			}));
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
			childrenFeatures.add(UMLPackage.Literals.JOIN_NODE__JOIN_SPEC);
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
	 * This returns JoinNode.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
			getResourceLocator().getImage("full/obj16/JoinNode")); //$NON-NLS-1$
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
		return appendLabel(
			appendType(appendKeywords(new StringBuffer(), object),
				"_UI_JoinNode_type"), //$NON-NLS-1$
			object).toString();
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

		switch (notification.getFeatureID(JoinNode.class)) {
			case UMLPackage.JOIN_NODE__IS_COMBINE_DUPLICATE :
				fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
				return;
			case UMLPackage.JOIN_NODE__JOIN_SPEC :
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

		newChildDescriptors
			.add(createChildParameter(UMLPackage.Literals.JOIN_NODE__JOIN_SPEC,
				UMLFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.Literals.JOIN_NODE__JOIN_SPEC,
				UMLFactory.eINSTANCE.createExpression()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.Literals.JOIN_NODE__JOIN_SPEC,
				UMLFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.Literals.JOIN_NODE__JOIN_SPEC,
				UMLFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.Literals.JOIN_NODE__JOIN_SPEC,
				UMLFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.Literals.JOIN_NODE__JOIN_SPEC,
				UMLFactory.eINSTANCE.createDuration()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.Literals.JOIN_NODE__JOIN_SPEC,
				UMLFactory.eINSTANCE.createInterval()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.Literals.JOIN_NODE__JOIN_SPEC,
				UMLFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.Literals.JOIN_NODE__JOIN_SPEC,
				UMLFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.Literals.JOIN_NODE__JOIN_SPEC,
				UMLFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.Literals.JOIN_NODE__JOIN_SPEC,
				UMLFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.Literals.JOIN_NODE__JOIN_SPEC,
				UMLFactory.eINSTANCE.createLiteralReal()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.Literals.JOIN_NODE__JOIN_SPEC,
				UMLFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.Literals.JOIN_NODE__JOIN_SPEC,
				UMLFactory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors
			.add(createChildParameter(UMLPackage.Literals.JOIN_NODE__JOIN_SPEC,
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
			|| childFeature == UMLPackage.Literals.JOIN_NODE__JOIN_SPEC;

		if (qualify) {
			return getString("_UI_CreateChild_text2", //$NON-NLS-1$
				new Object[]{getTypeText(childObject),
					getFeatureText(childFeature), getTypeText(owner)});
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}