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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Usage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Usage whose client is an Operation and whose supplier is a Signal, specifying that the Operation sends the Signal.
 * <p>From package StandardProfile (URI {@literal http://www.omg.org/spec/UML/20131001/StandardProfile}).</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.profile.standard.Send#getBase_Usage <em>Base Usage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.profile.standard.StandardPackage#getSend()
 * @model
 * @generated
 */
public interface Send
		extends EObject {

	/**
	 * Returns the value of the '<em><b>Base Usage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package StandardProfile (URI {@literal http://www.omg.org/spec/UML/20131001/StandardProfile}).</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Usage</em>' reference.
	 * @see #setBase_Usage(Usage)
	 * @see org.eclipse.uml2.uml.profile.standard.StandardPackage#getSend_Base_Usage()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Usage getBase_Usage();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.profile.standard.Send#getBase_Usage <em>Base Usage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Usage</em>' reference.
	 * @see #getBase_Usage()
	 * @generated
	 */
	void setBase_Usage(Usage value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Usage.client->forAll(oclIsKindOf(Operation)) and self.base_Usage.supplier->forAll(oclIsKindOf(Signal))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateClientOperationSendsSupplierSignal(
			DiagnosticChain diagnostics, Map<Object, Object> context);

} // Send
