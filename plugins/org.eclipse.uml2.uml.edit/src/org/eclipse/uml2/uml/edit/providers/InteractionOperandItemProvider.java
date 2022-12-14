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
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.uml.InteractionOperand} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InteractionOperandItemProvider
		extends NamespaceItemProvider {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperandItemProvider(AdapterFactory adapterFactory) {
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

			addCoveredPropertyDescriptor(object);
			addEnclosingOperandPropertyDescriptor(object);
			addEnclosingInteractionPropertyDescriptor(object);
			addGeneralOrderingPropertyDescriptor(object);
			addFragmentPropertyDescriptor(object);
			addGuardPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Covered feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCoveredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory)
				.getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_InteractionFragment_covered_feature"), //$NON-NLS-1$
			getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
				"_UI_InteractionFragment_covered_feature", //$NON-NLS-1$
				"_UI_InteractionFragment_type"), //$NON-NLS-1$
			UMLPackage.Literals.INTERACTION_FRAGMENT__COVERED, true, false,
			true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the General Ordering feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeneralOrderingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory)
				.getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_InteractionFragment_generalOrdering_feature"), //$NON-NLS-1$
			getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
				"_UI_InteractionFragment_generalOrdering_feature", //$NON-NLS-1$
				"_UI_InteractionFragment_type"), //$NON-NLS-1$
			UMLPackage.Literals.INTERACTION_FRAGMENT__GENERAL_ORDERING, true,
			false, true, null, null,
			new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
			}));
	}

	/**
	 * This adds a property descriptor for the Enclosing Interaction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnclosingInteractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory)
				.getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_InteractionFragment_enclosingInteraction_feature"), //$NON-NLS-1$
			getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
				"_UI_InteractionFragment_enclosingInteraction_feature", //$NON-NLS-1$
				"_UI_InteractionFragment_type"), //$NON-NLS-1$
			UMLPackage.Literals.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION,
			true, false, true, null, null,
			new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
			}));
	}

	/**
	 * This adds a property descriptor for the Enclosing Operand feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnclosingOperandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory)
				.getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_InteractionFragment_enclosingOperand_feature"), //$NON-NLS-1$
			getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
				"_UI_InteractionFragment_enclosingOperand_feature", //$NON-NLS-1$
				"_UI_InteractionFragment_type"), //$NON-NLS-1$
			UMLPackage.Literals.INTERACTION_FRAGMENT__ENCLOSING_OPERAND, true,
			false, true, null, null,
			new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
			}));
	}

	/**
	 * This adds a property descriptor for the Guard feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGuardPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory)
				.getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_InteractionOperand_guard_feature"), //$NON-NLS-1$
			getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
				"_UI_InteractionOperand_guard_feature", //$NON-NLS-1$
				"_UI_InteractionOperand_type"), //$NON-NLS-1$
			UMLPackage.Literals.INTERACTION_OPERAND__GUARD, true, false, true,
			null, null, new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
			}));
	}

	/**
	 * This adds a property descriptor for the Fragment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFragmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory)
				.getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_InteractionOperand_fragment_feature"), //$NON-NLS-1$
			getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
				"_UI_InteractionOperand_fragment_feature", //$NON-NLS-1$
				"_UI_InteractionOperand_type"), //$NON-NLS-1$
			UMLPackage.Literals.INTERACTION_OPERAND__FRAGMENT, true, false,
			true, null, null,
			new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
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
			childrenFeatures.add(
				UMLPackage.Literals.INTERACTION_FRAGMENT__GENERAL_ORDERING);
			childrenFeatures
				.add(UMLPackage.Literals.INTERACTION_OPERAND__FRAGMENT);
			childrenFeatures
				.add(UMLPackage.Literals.INTERACTION_OPERAND__GUARD);
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
	 * This returns InteractionOperand.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
			getResourceLocator().getImage("full/obj16/InteractionOperand")); //$NON-NLS-1$
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
				"_UI_InteractionOperand_type"), //$NON-NLS-1$
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

		switch (notification.getFeatureID(InteractionOperand.class)) {
			case UMLPackage.INTERACTION_OPERAND__GENERAL_ORDERING :
			case UMLPackage.INTERACTION_OPERAND__FRAGMENT :
			case UMLPackage.INTERACTION_OPERAND__GUARD :
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
			UMLPackage.Literals.INTERACTION_FRAGMENT__GENERAL_ORDERING,
			UMLFactory.eINSTANCE.createGeneralOrdering()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION_OPERAND__FRAGMENT,
			UMLFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION_OPERAND__FRAGMENT,
			UMLFactory.eINSTANCE.createInteractionUse()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION_OPERAND__FRAGMENT,
			UMLFactory.eINSTANCE.createPartDecomposition()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION_OPERAND__FRAGMENT,
			UMLFactory.eINSTANCE.createInteractionOperand()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION_OPERAND__FRAGMENT,
			UMLFactory.eINSTANCE.createOccurrenceSpecification()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION_OPERAND__FRAGMENT,
			UMLFactory.eINSTANCE.createActionExecutionSpecification()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION_OPERAND__FRAGMENT,
			UMLFactory.eINSTANCE.createBehaviorExecutionSpecification()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION_OPERAND__FRAGMENT,
			UMLFactory.eINSTANCE.createCombinedFragment()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION_OPERAND__FRAGMENT,
			UMLFactory.eINSTANCE.createConsiderIgnoreFragment()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION_OPERAND__FRAGMENT,
			UMLFactory.eINSTANCE.createContinuation()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION_OPERAND__FRAGMENT,
			UMLFactory.eINSTANCE.createMessageOccurrenceSpecification()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION_OPERAND__FRAGMENT,
			UMLFactory.eINSTANCE.createDestructionOccurrenceSpecification()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION_OPERAND__FRAGMENT,
			UMLFactory.eINSTANCE.createExecutionOccurrenceSpecification()));

		newChildDescriptors.add(createChildParameter(
			UMLPackage.Literals.INTERACTION_OPERAND__FRAGMENT,
			UMLFactory.eINSTANCE.createStateInvariant()));

		newChildDescriptors.add(
			createChildParameter(UMLPackage.Literals.INTERACTION_OPERAND__GUARD,
				UMLFactory.eINSTANCE.createInteractionConstraint()));
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

		boolean qualify = childFeature == UMLPackage.Literals.NAMESPACE__OWNED_RULE
			|| childFeature == UMLPackage.Literals.INTERACTION_OPERAND__GUARD;

		if (qualify) {
			return getString("_UI_CreateChild_text2", //$NON-NLS-1$
				new Object[]{getTypeText(childObject),
					getFeatureText(childFeature), getTypeText(owner)});
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}