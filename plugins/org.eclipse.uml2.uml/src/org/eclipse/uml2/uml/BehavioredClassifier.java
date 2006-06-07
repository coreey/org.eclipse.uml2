/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: BehavioredClassifier.java,v 1.10 2006/06/07 21:39:13 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviored Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A behaviored classifier may have an interface realization.
 * A classifier can have behavior specifications defined in its namespace. One of these may specify the behavior of the classifier itself.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.BehavioredClassifier#getOwnedBehaviors <em>Owned Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.BehavioredClassifier#getClassifierBehavior <em>Classifier Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.BehavioredClassifier#getInterfaceRealizations <em>Interface Realization</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.BehavioredClassifier#getOwnedTriggers <em>Owned Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getBehavioredClassifier()
 * @model abstract="true"
 * @generated
 */
public interface BehavioredClassifier
		extends Classifier {

	/**
	 * Returns the value of the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Behavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References behavior specifications owned by a classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Behavior</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getBehavioredClassifier_OwnedBehavior()
	 * @model type="org.eclipse.uml2.uml.Behavior" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList getOwnedBehaviors();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Behavior}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Behavior}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Behavior} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Behavior}.
	 * @see #getOwnedBehaviors()
	 * @generated
	 */
	Behavior createOwnedBehavior(String name, EClass eClass);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Behavior} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Behavior} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Behavior} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedBehaviors()
	 * @generated
	 */
	Behavior getOwnedBehavior(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Behavior} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Behavior} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Behavior} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Behavior} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Behavior} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedBehaviors()
	 * @generated
	 */
	Behavior getOwnedBehavior(String name, boolean ignoreCase, EClass eClass,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A behavior specification that specifies the behavior of the classifier itself.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier Behavior</em>' reference.
	 * @see #setClassifierBehavior(Behavior)
	 * @see org.eclipse.uml2.uml.UMLPackage#getBehavioredClassifier_ClassifierBehavior()
	 * @model ordered="false"
	 * @generated
	 */
	Behavior getClassifierBehavior();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.BehavioredClassifier#getClassifierBehavior <em>Classifier Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier Behavior</em>' reference.
	 * @see #getClassifierBehavior()
	 * @generated
	 */
	void setClassifierBehavior(Behavior value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Behavior}, with the specified '<em><b>Name</b></em>', and sets the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Behavior}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Behavior} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Behavior}.
	 * @see #getClassifierBehavior()
	 * @generated
	 */
	Behavior createClassifierBehavior(String name, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Interface Realization</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.InterfaceRealization}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.InterfaceRealization#getImplementingClassifier <em>Implementing Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of InterfaceRealizations owned by the BehavioredClassifier. Interface realizations reference the Interfaces of which the BehavioredClassifier is an implementation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface Realization</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getBehavioredClassifier_InterfaceRealization()
	 * @see org.eclipse.uml2.uml.InterfaceRealization#getImplementingClassifier
	 * @model type="org.eclipse.uml2.uml.InterfaceRealization" opposite="implementingClassifier" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList getInterfaceRealizations();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.InterfaceRealization}, with the specified '<em><b>Name</b></em>', and '<em><b>Contract</b></em>', and appends it to the '<em><b>Interface Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.InterfaceRealization}, or <code>null</code>.
	 * @param contract The '<em><b>Contract</b></em>' for the new {@link org.eclipse.uml2.uml.InterfaceRealization}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.InterfaceRealization}.
	 * @see #getInterfaceRealizations()
	 * @generated
	 */
	InterfaceRealization createInterfaceRealization(String name,
			Interface contract);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.InterfaceRealization} with the specified '<em><b>Name</b></em>', and '<em><b>Contract</b></em>' from the '<em><b>Interface Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.InterfaceRealization} to retrieve, or <code>null</code>.
	 * @param contract The '<em><b>Contract</b></em>' of the {@link org.eclipse.uml2.uml.InterfaceRealization} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.InterfaceRealization} with the specified '<em><b>Name</b></em>', and '<em><b>Contract</b></em>', or <code>null</code>.
	 * @see #getInterfaceRealizations()
	 * @generated
	 */
	InterfaceRealization getInterfaceRealization(String name, Interface contract);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.InterfaceRealization} with the specified '<em><b>Name</b></em>', and '<em><b>Contract</b></em>' from the '<em><b>Interface Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.InterfaceRealization} to retrieve, or <code>null</code>.
	 * @param contract The '<em><b>Contract</b></em>' of the {@link org.eclipse.uml2.uml.InterfaceRealization} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.InterfaceRealization} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.InterfaceRealization} with the specified '<em><b>Name</b></em>', and '<em><b>Contract</b></em>', or <code>null</code>.
	 * @see #getInterfaceRealizations()
	 * @generated
	 */
	InterfaceRealization getInterfaceRealization(String name,
			Interface contract, boolean ignoreCase, boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Owned Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References Trigger descriptions owned by a Classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Trigger</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getBehavioredClassifier_OwnedTrigger()
	 * @model type="org.eclipse.uml2.uml.Trigger" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList getOwnedTriggers();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Trigger}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Owned Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Trigger}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Trigger}.
	 * @see #getOwnedTriggers()
	 * @generated
	 */
	Trigger createOwnedTrigger(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Trigger} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Trigger} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Trigger} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedTriggers()
	 * @generated
	 */
	Trigger getOwnedTrigger(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Trigger} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Trigger} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Trigger} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Trigger} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedTriggers()
	 * @generated
	 */
	Trigger getOwnedTrigger(String name, boolean ignoreCase,
			boolean createOnDemand);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a behavior is classifier behavior, it does not have a specification.
	 * self.classifierBehavior.notEmpty() implies self.specification.isEmpty()
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateClassBehavior(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the interfaces on which this behaviored classifier has an interface realization dependency.
	 * <!-- end-model-doc -->
	 * @model kind="operation" type="org.eclipse.uml2.uml.Interface" ordered="false"
	 * @generated
	 */
	EList getImplementedInterfaces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves all the interfaces on which this behaviored classifier or any of its parents has an interface realization dependency.
	 * <!-- end-model-doc -->
	 * @model kind="operation" type="org.eclipse.uml2.uml.Interface" ordered="false"
	 * @generated
	 */
	EList getAllImplementedInterfaces();

} // BehavioredClassifier
