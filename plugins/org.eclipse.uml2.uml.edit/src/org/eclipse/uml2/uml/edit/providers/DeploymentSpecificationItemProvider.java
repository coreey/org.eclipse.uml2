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
 *   Kenn Hussey (CEA) - 327039, 414970, 370089, 511674
 *
 */
package org.eclipse.uml2.uml.edit.providers;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.uml.DeploymentSpecification;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.uml.DeploymentSpecification} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DeploymentSpecificationItemProvider
		extends ArtifactItemProvider {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentSpecificationItemProvider(AdapterFactory adapterFactory) {
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

			addDeploymentLocationPropertyDescriptor(object);
			addExecutionLocationPropertyDescriptor(object);
			addDeploymentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Deployment Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeploymentLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory)
				.getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_DeploymentSpecification_deploymentLocation_feature"), //$NON-NLS-1$
			getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
				"_UI_DeploymentSpecification_deploymentLocation_feature", //$NON-NLS-1$
				"_UI_DeploymentSpecification_type"), //$NON-NLS-1$
			UMLPackage.Literals.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION,
			true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
			null, null));
	}

	/**
	 * This adds a property descriptor for the Execution Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExecutionLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory)
				.getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_DeploymentSpecification_executionLocation_feature"), //$NON-NLS-1$
			getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
				"_UI_DeploymentSpecification_executionLocation_feature", //$NON-NLS-1$
				"_UI_DeploymentSpecification_type"), //$NON-NLS-1$
			UMLPackage.Literals.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION,
			true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
			null, null));
	}

	/**
	 * This adds a property descriptor for the Deployment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeploymentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory)
				.getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_DeploymentSpecification_deployment_feature"), //$NON-NLS-1$
			getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
				"_UI_DeploymentSpecification_deployment_feature", //$NON-NLS-1$
				"_UI_DeploymentSpecification_type"), //$NON-NLS-1$
			UMLPackage.Literals.DEPLOYMENT_SPECIFICATION__DEPLOYMENT, true,
			false, true, null, null,
			new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
			}));
	}

	/**
	 * This returns DeploymentSpecification.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator()
			.getImage("full/obj16/DeploymentSpecification")); //$NON-NLS-1$
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
				"_UI_DeploymentSpecification_type"), //$NON-NLS-1$
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

		switch (notification.getFeatureID(DeploymentSpecification.class)) {
			case UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION :
			case UMLPackage.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION :
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

		boolean qualify = childFeature == UMLPackage.Literals.CLASSIFIER__COLLABORATION_USE
			|| childFeature == UMLPackage.Literals.CLASSIFIER__REPRESENTATION;

		if (qualify) {
			return getString("_UI_CreateChild_text2", //$NON-NLS-1$
				new Object[]{getTypeText(childObject),
					getFeatureText(childFeature), getTypeText(owner)});
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}