/*
 * Copyright (c) 2005, 2011 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039
 *
 * $Id: AcceptEventActionTest.java,v 1.6 2007/02/14 20:06:12 khussey Exp $
 */
package org.eclipse.uml2.uml.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.uml.AcceptEventAction;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Accept Event Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.AcceptEventAction#validateTriggerEvents(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trigger Events</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.AcceptEventAction#validateNoInputPins(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Input Pins</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.AcceptEventAction#validateNoOutputPins(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Output Pins</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.AcceptEventAction#validateUnmarshallSignalEvents(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unmarshall Signal Events</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class AcceptEventActionTest
		extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AcceptEventActionTest.class);
	}

	/**
	 * Constructs a new Accept Event Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptEventActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Accept Event Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AcceptEventAction getFixture() {
		return (AcceptEventAction) fixture;
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
		setFixture(UMLFactory.eINSTANCE.createAcceptEventAction());
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
	 * Tests the '{@link org.eclipse.uml2.uml.AcceptEventAction#validateNoInputPins(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Input Pins</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.AcceptEventAction#validateNoInputPins(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateNoInputPins__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.AcceptEventAction#validateNoOutputPins(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Output Pins</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.AcceptEventAction#validateNoOutputPins(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateNoOutputPins__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.AcceptEventAction#validateTriggerEvents(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trigger Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.AcceptEventAction#validateTriggerEvents(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateTriggerEvents__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.AcceptEventAction#validateUnmarshallSignalEvents(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unmarshall Signal Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.AcceptEventAction#validateUnmarshallSignalEvents(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateUnmarshallSignalEvents__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

} //AcceptEventActionTest
