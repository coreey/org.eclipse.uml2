/*
 * Copyright (c) 2014, 2018 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   Kenn Hussey (CEA) - initial API and implementation
 *   Kenn Hussey (CEA) - 451350
 *   Kenn Hussey - 535301
 *
 */
package org.eclipse.uml2.uml.profile.standard;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specifies a derivation relationship among model elements that are usually, but not necessarily, of the same type. A derived dependency specifies that the client may be computed from the supplier. The mapping specifies the computation. The client may be implemented for design reasons, such as efficiency, even though it is logically redundant.
 * <p>From package StandardProfile (URI {@literal http://www.omg.org/spec/UML/20131001/StandardProfile}).</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.profile.standard.Derive#getComputation <em>Computation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.profile.standard.Derive#getBase_Abstraction <em>Base Abstraction</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.profile.standard.StandardPackage#getDerive()
 * @model
 * @generated
 */
public interface Derive
		extends EObject {

	/**
	 * Returns the value of the '<em><b>Computation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specification for computing the derived client element from the derivation supplier element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Computation</em>' containment reference.
	 * @see #setComputation(ValueSpecification)
	 * @see org.eclipse.uml2.uml.profile.standard.StandardPackage#getDerive_Computation()
	 * @model containment="true" resolveProxies="true" required="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getComputation();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.profile.standard.Derive#getComputation <em>Computation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computation</em>' containment reference.
	 * @see #getComputation()
	 * @generated
	 */
	void setComputation(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Base Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package StandardProfile (URI {@literal http://www.omg.org/spec/UML/20131001/StandardProfile}).</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Abstraction</em>' reference.
	 * @see #setBase_Abstraction(Abstraction)
	 * @see org.eclipse.uml2.uml.profile.standard.StandardPackage#getDerive_Base_Abstraction()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Abstraction getBase_Abstraction();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.profile.standard.Derive#getBase_Abstraction <em>Base Abstraction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Abstraction</em>' reference.
	 * @see #getBase_Abstraction()
	 * @generated
	 */
	void setBase_Abstraction(Abstraction value);

} // Derive
