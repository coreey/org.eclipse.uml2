/*
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: Element.java,v 1.23 2006/05/26 18:16:52 khussey Exp $
 */
package org.eclipse.uml2;

import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Element is an abstract metaclass with no superclass. It is used as the common superclass for all metaclasses in the infrastructure library. Element has a derived composition association to itself to support the general capability for elements to own other elements. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Element#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.Element#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.Element#getOwnedComments <em>Owned Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EModelElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Element}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Element#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Elements owned by this element. This is a derived union.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Element</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getElement_OwnedElement()
	 * @see org.eclipse.uml2.Element#getOwner
	 * @model type="org.eclipse.uml2.Element" opposite="owner" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList getOwnedElements();


	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.Element#getOwnedElements <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Element that owns this element. This is a derived union.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see org.eclipse.uml2.UML2Package#getElement_Owner()
	 * @see org.eclipse.uml2.Element#getOwnedElements
	 * @model opposite="ownedElement" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Element getOwner();


	/**
	 * Returns the value of the '<em><b>Owned Comment</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Comment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Comment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Comments owned by this element. Subsets Element::ownedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Comment</em>' containment reference list.
	 * @see org.eclipse.uml2.UML2Package#getElement_OwnedComment()
	 * @model type="org.eclipse.uml2.Comment" containment="true" ordered="false"
	 * @generated
	 */
	EList getOwnedComments();



    /**
     * Creates a {@link org.eclipse.uml2.Comment} and appends it to the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.Comment} to create.
	 * @return The new {@link org.eclipse.uml2.Comment}.
	 * @see #getOwnedComments()
	 * @generated NOT
	 * @deprecated Use #createOwnedComment() instead.
     */
    Comment createOwnedComment(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.Comment} and appends it to the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.Comment}.
	 * @see #getOwnedComments()
	 * @generated NOT
	 */
    Comment createOwnedComment();


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * not self.allOwnedElements()->includes(self)
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean validateNotOwnSelf(DiagnosticChain diagnostics, Map context);


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An invariant constraint based on the following OCL expression:
	 * <code>
	 * self.mustBeOwned() implies owner->notEmpty()
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean validateHasOwner(DiagnosticChain diagnostics, Map context);


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * ownedElement->union(ownedElement->collect(e | e.allOwnedElements()))
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Set"
	 * @generated
	 */
	Set allOwnedElements();


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query based on the following OCL expression:
	 * <code>
	 * true
	 * </code>
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.uml2.Boolean"
	 * @generated
	 */
	boolean mustBeOwned();


	// <!-- begin-custom-operations -->

	/**
	 * Creates an {@link org.eclipse.emf.ecore.EAnnotation}with the specified
	 * source and this element as its Ecore model element.
	 * 
	 * @param source
	 *            The source of the {@link org.eclipse.emf.ecore.EAnnotation}to
	 *            create.
	 * @return The new {@link org.eclipse.emf.ecore.EAnnotation}.
	 * @see #getEAnnotations()
	 */
	EAnnotation createEAnnotation(String source);

	/**
	 * Determines whether the specified stereotype is applied to this element.
	 * 
	 * @param stereotype
	 *            The stereotype to test for application.
	 * @return <code>true</code> if the stereotype is applied to this element;
	 *         <code>false</code> otherwise.
	 */
	boolean isApplied(Stereotype stereotype);

	/**
	 * Determines whether the specified stereotype is required for this element.
	 * 
	 * @param stereotype
	 *            The stereotype to test for requirement.
	 * @return <code>true</code> if the stereotype is required for this
	 *         element; <code>false</code> otherwise.
	 */
	boolean isRequired(Stereotype stereotype);

	/**
	 * Retrieves the set of stereotypes that are applicable to this element,
	 * including those are required and/or may already be applied.
	 * 
	 * @return The stereotypes applicable to this element.
	 */
	Set getApplicableStereotypes();

	/**
	 * Retrieves the stereotype with the specified qualified name that is
	 * applicable to this element, or <code>null</code> if no such stereotype
	 * exists.
	 * 
	 * @param qualifiedStereotypeName
	 *            The qualified name of the applicable stereotype to retrieve.
	 * @return The applicable stereotype with the specified qualified name.
	 */
	Stereotype getApplicableStereotype(String qualifiedStereotypeName);

	/**
	 * Retrieves the set of stereotypes applied to this element.
	 * 
	 * @return The stereotypes applied to this element.
	 */
	Set getAppliedStereotypes();

	/**
	 * Retrieves the set of substereotypes of the specified superstereotype that
	 * are applied to this element.
	 * 
	 * @param superstereotype
	 *            The superstereotype of the applied (sub)stereotypes to
	 *            retrieve.
	 * @return The (sub)stereotypes applied to this element.
	 */
	Set getAppliedSubstereotypes(Stereotype superstereotype);

	/**
	 * Retrieves the stereotype with the specified qualified name that is
	 * applied to this element, or <code>null</code> if no such stereotype is
	 * applied.
	 * 
	 * @param qualifiedStereotypeName
	 *            The qualified name of the applied stereotype to retrieve.
	 * @return The applied stereotype with the specified qualified name.
	 */
	Stereotype getAppliedStereotype(String qualifiedStereotypeName);

	/**
	 * Retrieves the substereotype (of the specified superstereotype) with the
	 * specified qualified name that is applied to this element, or
	 * <code>null</code> if no such stereotype is applied.
	 * 
	 * @param superstereotype
	 *            The superstereotype of the applied (sub)stereotype to
	 *            retrieve.
	 * @param qualifiedStereotypeName
	 *            The qualified name of the applied (sub)stereotype to retrieve.
	 * @return The applied (sub)stereotype with the specified qualified name.
	 */
	Stereotype getAppliedSubstereotype(Stereotype superstereotype,
			String qualifiedStereotypeName);

	/**
	 * Applies the specified stereotype to this element.
	 * 
	 * @param stereotype
	 *            The stereotype to be applied.
	 * @throws IllegalArgumentException
	 *             If the stereotype is already applied or is not applicable to
	 *             this element.
	 */
	void apply(Stereotype stereotype);

	/**
	 * Unapplies the specified stereotype from this element.
	 * 
	 * @param stereotype
	 *            The stereotype to be unapplied.
	 * @throws IllegalArgumentException
	 *             If the stereotype is required or is not applied to this
	 *             element.
	 */
	void unapply(Stereotype stereotype);

	/**
	 * Retrieves the value of the property with the specified name from the
	 * specified stereotype application for this element.
	 * 
	 * @param stereotype
	 *            The stereotype whose application contains the property.
	 * @param propertyName
	 *            The name of the property whose value to retrieve.
	 * @return The value of the applied stereotype property.
	 * @throws IllegalArgumentException
	 *             If the stereotype is not applied to this element or the
	 *             property does not exist.
	 */
	Object getValue(Stereotype stereotype, String propertyName);

	/**
	 * Sets the value of the property with the specified name in the specified
	 * stereotype application for this element.
	 * 
	 * @param stereotype
	 *            The stereotype whose application contains the property.
	 * @param propertyName
	 *            The name of the property whose value to set.
	 * @param value
	 *            The new value of the applied stereotype property.
	 * @throws IllegalArgumentException
	 *             If the stereotype is not applied to this element or the
	 *             property does not exist.
	 */
	void setValue(Stereotype stereotype, String propertyName, Object value);

	/**
	 * Determines whether this element has a (non-default) value for the
	 * property with the specified name in the specified stereotype application.
	 * 
	 * @param stereotype
	 *            The stereotype whose application contains the property.
	 * @param propertyName
	 *            The name of the property whose value to test.
	 * @return <code>true</code> if the applied stereotype property has a
	 *         (non-default) value; <code>false</code> otherwise.
	 */
	boolean hasValue(Stereotype stereotype, String propertyName);

	/**
	 * Retrieves the model that contains (either directly or indirectly) this
	 * element.
	 * 
	 * @return The model containing this element, or <code>null</code>.
	 */
	Model getModel();

	/**
	 * Retrieves the nearest package that contains (either directly or
	 * indirectly) this element, or the element itself (if it is a package).
	 * 
	 * @return The nearest package containing this element, the element itself,
	 *         or <code>null</code>.
	 */
	org.eclipse.uml2.Package getNearestPackage();

	/**
	 * Destroys this element by removing all usage cross references to it (from
	 * within its resource set) and removing it from its containing resource or
	 * object.
	 * <p>
	 * Note that this operation can be expensive (since it traverses all
	 * containment hierarchies) and doesn't guarantee that all references will
	 * be removed (since references can exist in other resources that don't
	 * belong to the same resource set).
	 */
	void destroy();

	/**
	 * Retrieves the version of the specified stereotype that is applied to this
	 * element.
	 * 
	 * @param stereotype
	 *            The stereotype whose applied version to retrieve.
	 * @return The version of the stereotype, or <code>null</code> if not
	 *         applied.
	 */
	String getAppliedVersion(Stereotype stereotype);

	/**
	 * Retrieves the set of keywords for this element.
	 * 
	 * @return The keywords for this element.
	 */
	Set getKeywords();

	/**
	 * Determines whether this element has the specified keyword.
	 * 
	 * @param keyword
	 *            The keyword in question.
	 * @return <code>true</code> if this element has the specified keyword;
	 *         <code>false</code> otherwise.
	 */
	boolean hasKeyword(String keyword);

	/**
	 * Adds the specified keyword to this element.
	 * 
	 * @param keyword
	 *            The keyword to be added.
	 * @throws IllegalArgumentException
	 *             If the keyword is invalid (i.e. empty).
	 */
	void addKeyword(String keyword);

	/**
	 * Removes the specified keyword from this element.
	 * 
	 * @param keyword
	 *            The keyword to be removed.
	 * @throws IllegalArgumentException
	 *             If this element does not have the keyword.
	 */
	void removeKeyword(String keyword);

	// <!-- end-custom-operations -->

} // Element
