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
 * $Id: DestroyObjectActionImplTest.java,v 1.2.2.1 2004/08/24 00:56:40 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.impl.DestroyObjectActionImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Destroy Object Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.DestroyObjectActionImpl#isDestroyLinks() <em>Is Destroy Links</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.DestroyObjectActionImpl#isDestroyOwnedObjects() <em>Is Destroy Owned Objects</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.DestroyObjectActionImpl#getInputs() <em>Get Inputs</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DestroyObjectActionImplTest extends ActionImplTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DestroyObjectActionImplTest.class);
	}

	/**
	 * Constructs a new Destroy Object Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestroyObjectActionImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Destroy Object Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DestroyObjectActionImpl getFixture() {
		return (DestroyObjectActionImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((DestroyObjectActionImpl) UML2Factory.eINSTANCE.createDestroyObjectAction());
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

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.DestroyObjectActionImpl#isDestroyLinks() <em>Is Destroy Links</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.DestroyObjectActionImpl#isDestroyLinks()
	 * @generated
	 */
	public void testIsDestroyLinks() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.DestroyObjectActionImpl#setIsDestroyLinks() <em>Is Destroy Links</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.DestroyObjectActionImpl#setIsDestroyLinks()
	 * @generated
	 */
	public void testSetIsDestroyLinks() {
		// TODO: implement this feature setter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.DestroyObjectActionImpl#isDestroyOwnedObjects() <em>Is Destroy Owned Objects</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.DestroyObjectActionImpl#isDestroyOwnedObjects()
	 * @generated
	 */
	public void testIsDestroyOwnedObjects() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.DestroyObjectActionImpl#setIsDestroyOwnedObjects() <em>Is Destroy Owned Objects</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.DestroyObjectActionImpl#setIsDestroyOwnedObjects()
	 * @generated
	 */
	public void testSetIsDestroyOwnedObjects() {
		// TODO: implement this feature setter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.DestroyObjectActionImpl#getInputs() <em>Get Inputs</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.DestroyObjectActionImpl#getInputs()
	 * @generated
	 */
	public void testGetInputsGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetInputs() {
		testGetInGroupsGen();
		
		super.testGetInputs();

		assertTrue(getFixture().getInputs().contains(getFixture().getTarget()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ActionImplTest#setUpInputs()
	 */
	protected void setUpInputs() {
		super.setUpInputs();

		getFixture().setTarget(UML2Factory.eINSTANCE.createInputPin());
	}

} //DestroyObjectActionImplTest
