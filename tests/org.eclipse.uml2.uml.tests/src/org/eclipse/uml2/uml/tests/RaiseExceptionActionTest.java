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
 * $Id: RaiseExceptionActionTest.java,v 1.4 2006/05/26 17:28:10 khussey Exp $
 */
package org.eclipse.uml2.uml.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.uml.RaiseExceptionAction;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Raise Exception Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RaiseExceptionActionTest
		extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RaiseExceptionActionTest.class);
	}

	/**
	 * Constructs a new Raise Exception Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RaiseExceptionActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Raise Exception Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RaiseExceptionAction getFixture() {
		return (RaiseExceptionAction) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp()
			throws Exception {
		setFixture(UMLFactory.eINSTANCE.createRaiseExceptionAction());
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

} //RaiseExceptionActionTest
