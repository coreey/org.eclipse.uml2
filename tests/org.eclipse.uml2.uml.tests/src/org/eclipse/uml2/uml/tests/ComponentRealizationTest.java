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

import org.eclipse.uml2.uml.ComponentRealization;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Component Realization</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentRealizationTest
		extends RealizationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComponentRealizationTest.class);
	}

	/**
	 * Constructs a new Component Realization test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentRealizationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Component Realization test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ComponentRealization getFixture() {
		return (ComponentRealization) fixture;
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
		setFixture(UMLFactory.eINSTANCE.createComponentRealization());
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

} //ComponentRealizationTest
