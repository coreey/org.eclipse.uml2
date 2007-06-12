/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: Interaction.java,v 1.10 2007/06/12 12:53:16 khussey Exp $
 */
package org.eclipse.uml2.uml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interaction is a unit of behavior that focuses on the observable exchange of information between connectable elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Interaction#getLifelines <em>Lifeline</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Interaction#getFragments <em>Fragment</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Interaction#getActions <em>Action</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Interaction#getFormalGates <em>Formal Gate</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Interaction#getMessages <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getInteraction()
 * @model
 * @generated
 */
public interface Interaction
		extends Behavior, InteractionFragment {

	/**
	 * Returns the value of the '<em><b>Lifeline</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Lifeline}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Lifeline#getInteraction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the participants in this Interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lifeline</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInteraction_Lifeline()
	 * @see org.eclipse.uml2.uml.Lifeline#getInteraction
	 * @model opposite="interaction" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<Lifeline> getLifelines();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Lifeline}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Lifeline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Lifeline}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Lifeline}.
	 * @see #getLifelines()
	 * @generated
	 */
	Lifeline createLifeline(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Lifeline} with the specified '<em><b>Name</b></em>' from the '<em><b>Lifeline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Lifeline} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Lifeline} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getLifelines()
	 * @generated
	 */
	Lifeline getLifeline(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Lifeline} with the specified '<em><b>Name</b></em>' from the '<em><b>Lifeline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Lifeline} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Lifeline} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Lifeline} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getLifelines()
	 * @generated
	 */
	Lifeline getLifeline(String name, boolean ignoreCase, boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Fragment</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.InteractionFragment}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.InteractionFragment#getEnclosingInteraction <em>Enclosing Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ordered set of fragments in the Interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fragment</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInteraction_Fragment()
	 * @see org.eclipse.uml2.uml.InteractionFragment#getEnclosingInteraction
	 * @model opposite="enclosingInteraction" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<InteractionFragment> getFragments();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.InteractionFragment}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.InteractionFragment}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.InteractionFragment} to create.
	 * @return The new {@link org.eclipse.uml2.uml.InteractionFragment}.
	 * @see #getFragments()
	 * @generated
	 */
	InteractionFragment createFragment(String name, EClass eClass);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.InteractionFragment} with the specified '<em><b>Name</b></em>' from the '<em><b>Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.InteractionFragment} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.InteractionFragment} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFragments()
	 * @generated
	 */
	InteractionFragment getFragment(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.InteractionFragment} with the specified '<em><b>Name</b></em>' from the '<em><b>Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.InteractionFragment} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.InteractionFragment} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.InteractionFragment} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.InteractionFragment} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFragments()
	 * @generated
	 */
	InteractionFragment getFragment(String name, boolean ignoreCase,
			EClass eClass, boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actions owned by the Interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInteraction_Action()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Action}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Action}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Action} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Action}.
	 * @see #getActions()
	 * @generated
	 */
	Action createAction(String name, EClass eClass);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Action} with the specified '<em><b>Name</b></em>' from the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Action} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Action} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getActions()
	 * @generated
	 */
	Action getAction(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Action} with the specified '<em><b>Name</b></em>' from the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Action} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Action} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Action} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Action} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getActions()
	 * @generated
	 */
	Action getAction(String name, boolean ignoreCase, EClass eClass,
			boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Formal Gate</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Gate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the gates that form the message interface between this Interaction and any InteractionUses which reference it.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formal Gate</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInteraction_FormalGate()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<Gate> getFormalGates();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Gate}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Formal Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Gate}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Gate}.
	 * @see #getFormalGates()
	 * @generated
	 */
	Gate createFormalGate(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Gate} with the specified '<em><b>Name</b></em>' from the '<em><b>Formal Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Gate} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Gate} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFormalGates()
	 * @generated
	 */
	Gate getFormalGate(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Gate} with the specified '<em><b>Name</b></em>' from the '<em><b>Formal Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Gate} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Gate} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Gate} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFormalGates()
	 * @generated
	 */
	Gate getFormalGate(String name, boolean ignoreCase, boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Message}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Message#getInteraction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Messages contained in this Interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getInteraction_Message()
	 * @see org.eclipse.uml2.uml.Message#getInteraction
	 * @model opposite="interaction" containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
	EList<Message> getMessages();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Message}, with the specified '<em><b>Name</b></em>', and appends it to the '<em><b>Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Message}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Message}.
	 * @see #getMessages()
	 * @generated
	 */
	Message createMessage(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Message} with the specified '<em><b>Name</b></em>' from the '<em><b>Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Message} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Message} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getMessages()
	 * @generated
	 */
	Message getMessage(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Message} with the specified '<em><b>Name</b></em>' from the '<em><b>Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Message} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.Message} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.Message} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getMessages()
	 * @generated
	 */
	Message getMessage(String name, boolean ignoreCase, boolean createOnDemand);

} // Interaction
