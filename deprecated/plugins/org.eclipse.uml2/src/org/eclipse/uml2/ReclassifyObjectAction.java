/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: ReclassifyObjectAction.java,v 1.4.2.1 2004/08/24 01:03:45 khussey Exp $
 */
package org.eclipse.uml2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reclassify Object Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ReclassifyObjectAction adds given classifier to an object and removes given classifiers from that object. Multiple classifiers may be added and removed at a time. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.ReclassifyObjectAction#isReplaceAll <em>Is Replace All</em>}</li>
 *   <li>{@link org.eclipse.uml2.ReclassifyObjectAction#getOldClassifiers <em>Old Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.ReclassifyObjectAction#getNewClassifiers <em>New Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.ReclassifyObjectAction#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.UML2Package#getReclassifyObjectAction()
 * @model 
 * @generated
 */
public interface ReclassifyObjectAction extends Action{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Is Replace All</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Replace All</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether existing classifiers should be removed before adding the new classifiers. The default value is false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Replace All</em>' attribute.
	 * @see #setIsReplaceAll(boolean)
	 * @see org.eclipse.uml2.UML2Package#getReclassifyObjectAction_IsReplaceAll()
	 * @model default="false" dataType="org.eclipse.uml2.Boolean" volatile="true"
	 * @generated
	 */
	boolean isReplaceAll();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ReclassifyObjectAction#isReplaceAll <em>Is Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Replace All</em>' attribute.
	 * @see #isReplaceAll()
	 * @generated
	 */
	void setIsReplaceAll(boolean value);

	/**
	 * Returns the value of the '<em><b>Old Classifier</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Classifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of classifiers to be removed from the classifiers of the object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Old Classifier</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getReclassifyObjectAction_OldClassifier()
	 * @model type="org.eclipse.uml2.Classifier" ordered="false"
	 * @generated
	 */
	EList getOldClassifiers();

    /**
     * Retrieves the {@link org.eclipse.uml2.Classifier} with the specified name from the '<em><b>Old Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Classifier} to retrieve.
	 * @return The {@link org.eclipse.uml2.Classifier} with the specified name, or <code>null</code>.
	 * @see #getOldClassifiers()
	 * @generated
     */
    Classifier getOldClassifier(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>New Classifier</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Classifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of classifiers to be added to the classifiers of the object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>New Classifier</em>' reference list.
	 * @see org.eclipse.uml2.UML2Package#getReclassifyObjectAction_NewClassifier()
	 * @model type="org.eclipse.uml2.Classifier" ordered="false"
	 * @generated
	 */
	EList getNewClassifiers();

    /**
     * Retrieves the {@link org.eclipse.uml2.Classifier} with the specified name from the '<em><b>New Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param unqualifiedName The unqualified name of the {@link org.eclipse.uml2.Classifier} to retrieve.
	 * @return The {@link org.eclipse.uml2.Classifier} with the specified name, or <code>null</code>.
	 * @see #getNewClassifiers()
	 * @generated
     */
    Classifier getNewClassifier(String unqualifiedName);
      
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Holds the object to be reclassified. (Specializes Action.input.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(InputPin)
	 * @see org.eclipse.uml2.UML2Package#getReclassifyObjectAction_Object()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InputPin getObject();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.ReclassifyObjectAction#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(InputPin value);

    /**
     * Creates a {@link org.eclipse.uml2.InputPin} and sets the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.InputPin} to create.
	 * @return The new {@link org.eclipse.uml2.InputPin}.
	 * @see #getObject()
	 * @generated
     */
    InputPin createObject(EClass eClass);
     
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameters=""
	 * @generated
	 */
	EList getInputs();

} // ReclassifyObjectAction
