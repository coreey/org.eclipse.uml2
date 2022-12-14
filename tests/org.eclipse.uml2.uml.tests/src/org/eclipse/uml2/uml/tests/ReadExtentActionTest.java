/*
 * Copyright (c) 2005, 2018 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 535301
 *
 */
package org.eclipse.uml2.uml.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.uml.ReadExtentAction;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Read Extent Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ReadExtentAction#validateTypeIsClassifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type Is Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadExtentAction#validateMultiplicityOfResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiplicity Of Result</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ReadExtentActionTest
		extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReadExtentActionTest.class);
	}

	/**
	 * Constructs a new Read Extent Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadExtentActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Read Extent Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ReadExtentAction getFixture() {
		return (ReadExtentAction) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp()
			throws Exception {
		setFixture(UMLFactory.eINSTANCE.createReadExtentAction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown()
			throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.ReadExtentAction#validateTypeIsClassifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type Is Classifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ReadExtentAction#validateTypeIsClassifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateTypeIsClassifier__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.ReadExtentAction#validateMultiplicityOfResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiplicity Of Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.ReadExtentAction#validateMultiplicityOfResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateMultiplicityOfResult__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

} //ReadExtentActionTest
