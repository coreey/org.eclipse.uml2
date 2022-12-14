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
 * $Id: ActionTest.java,v 1.3 2006/05/29 17:27:33 khussey Exp $
 */
package org.eclipse.uml2.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.Action;
import org.eclipse.uml2.UML2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.Action#getContext() <em>Context</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ActionTest extends ExecutableNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActionTest.class);
	}

	/**
	 * Constructs a new Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Action getFixture() {
		return (Action)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(UML2Factory.eINSTANCE.createAction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	public void testGetOutputs() {
		setUpOutputs();
	}

	public void testGetInputs() {
		setUpInputs();
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.Action#getContext() <em>Context</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.Action#getContext()
	 * @generated
	 */
	public void testGetContext() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}


	public void testGetOwnedElements() {
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getInputs()));
		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getLocalPostconditions()));
		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getLocalPreconditions()));
		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getOutputs()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		setUpInputs();
		setUpOutputs();

		getFixture().getLocalPostconditions().add(UML2Factory.eINSTANCE.createConstraint());
		getFixture().getLocalPostconditions().add(UML2Factory.eINSTANCE.createConstraint());

		getFixture().getLocalPreconditions().add(UML2Factory.eINSTANCE.createConstraint());
		getFixture().getLocalPreconditions().add(UML2Factory.eINSTANCE.createConstraint());
	}

	protected void setUpInputs() {
		// do nothing
	}

	protected void setUpOutputs() {
		// do nothing
	}

} //ActionImplTest
