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
 * $Id: ActivityTest.java,v 1.4 2006/05/26 17:28:10 khussey Exp $
 */
package org.eclipse.uml2.uml.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Activity#getStructuredNodes() <em>Structured Node</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Activity#validateNoSupergroups(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Supergroups</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Activity#validateActivityParameterNode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Parameter Node</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Activity#validateAutonomous(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autonomous</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ActivityTest
		extends BehaviorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActivityTest.class);
	}

	/**
	 * Constructs a new Activity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Activity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Activity getFixture() {
		return (Activity) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp()
			throws Exception {
		setFixture(UMLFactory.eINSTANCE.createActivity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown()
			throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Activity#getStructuredNodes() <em>Structured Node</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Activity#getStructuredNodes()
	 * @generated
	 */
	public void testGetStructuredNodes() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Activity#validateNoSupergroups(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Supergroups</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Activity#validateNoSupergroups(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateNoSupergroups__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Activity#validateActivityParameterNode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Parameter Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Activity#validateActivityParameterNode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateActivityParameterNode__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Activity#validateAutonomous(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autonomous</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Activity#validateAutonomous(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateAutonomous__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

} //ActivityTest
