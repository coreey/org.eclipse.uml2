/*
 * Copyright (c) 2005, 2018 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 397324, 414970
 *   Kenn Hussey - 522703, 535301
 *
 */
package org.eclipse.uml2.codegen.ecore.genmodel.provider;

import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.provider.GenBaseItemProvider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.codegen.ecore.genmodel.GenClassifier;

import org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage;

import org.eclipse.uml2.codegen.ecore.ui.CodeGenEcoreUIPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.codegen.ecore.genmodel.GenClassifier} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GenClassifierItemProvider
		extends GenBaseItemProvider {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenClassifierItemProvider(AdapterFactory adapterFactory) {
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

			addDocumentationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Documentation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @since 2.14
	 * @generated
	 */
	protected void addDocumentationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory)
				.getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_GenClassifier_documentation_feature"), //$NON-NLS-1$
			getString("_UI_GenClassifier_documentation_description"), //$NON-NLS-1$
			org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.Literals.GEN_CLASSIFIER__DOCUMENTATION,
			true, true, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
			getString("_UI_ModelPropertyCategory"), //$NON-NLS-1$
			null));
	}

	/**
	 * This returns GenClassifier.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return super.getImage(object);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		return super.getText(object);
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

		switch (notification.getFeatureID(GenClassifier.class)) {
			case GenModelPackage.GEN_CLASSIFIER__GEN_PACKAGE :
			case GenModelPackage.GEN_CLASSIFIER__GEN_TYPE_PARAMETERS :
			case GenModelPackage.GEN_CLASSIFIER__DOCUMENTATION :
				fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CodeGenEcoreUIPlugin.INSTANCE;
	}

}
