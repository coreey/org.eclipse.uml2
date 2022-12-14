/*
 * Copyright (c) 2005, 2018 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466
 *   Kenn Hussey - 535301
 *
 */
package org.eclipse.uml2.uml.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.Variable;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#getLower() <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#getUpper() <em>Upper</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#validateUpperGeLower(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Upper Ge Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#validateLowerGe0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lower Ge0</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#validateValueSpecificationNoSideEffects(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Value Specification No Side Effects</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#validateValueSpecificationConstant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Value Specification Constant</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#validateLowerIsInteger(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lower Is Integer</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#validateUpperIsUnlimitedNatural(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Upper Is Unlimited Natural</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#compatibleWith(org.eclipse.uml2.uml.MultiplicityElement) <em>Compatible With</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#includesMultiplicity(org.eclipse.uml2.uml.MultiplicityElement) <em>Includes Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#is(int, int) <em>Is</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#isMultivalued() <em>Is Multivalued</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#lowerBound() <em>Lower Bound</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.MultiplicityElement#upperBound() <em>Upper Bound</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Variable#isAccessibleBy(org.eclipse.uml2.uml.Action) <em>Is Accessible By</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class VariableTest
		extends ConnectableElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VariableTest.class);
	}

	/**
	 * Constructs a new Variable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Variable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Variable getFixture() {
		return (Variable) fixture;
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
		setFixture(UMLFactory.eINSTANCE.createVariable());
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
	 * Tests the '{@link org.eclipse.uml2.uml.MultiplicityElement#getUpper() <em>Upper</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.MultiplicityElement#getUpper()
	 * @generated
	 */
	public void testGetUpper() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.MultiplicityElement#setUpper(int) <em>Upper</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.MultiplicityElement#setUpper(int)
	 * @generated
	 */
	public void testSetUpper() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.MultiplicityElement#getLower() <em>Lower</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.MultiplicityElement#getLower()
	 * @generated
	 */
	public void testGetLower() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.MultiplicityElement#setLower(int) <em>Lower</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.MultiplicityElement#setLower(int)
	 * @generated
	 */
	public void testSetLower() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.MultiplicityElement#validateLowerGe0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lower Ge0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.MultiplicityElement#validateLowerGe0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateLowerGe0__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.MultiplicityElement#validateUpperGeLower(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Upper Ge Lower</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.MultiplicityElement#validateUpperGeLower(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateUpperGeLower__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.MultiplicityElement#validateValueSpecificationNoSideEffects(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Value Specification No Side Effects</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.MultiplicityElement#validateValueSpecificationNoSideEffects(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateValueSpecificationNoSideEffects__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.MultiplicityElement#validateValueSpecificationConstant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Value Specification Constant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.MultiplicityElement#validateValueSpecificationConstant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateValueSpecificationConstant__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.MultiplicityElement#validateLowerIsInteger(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lower Is Integer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.MultiplicityElement#validateLowerIsInteger(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateLowerIsInteger__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.MultiplicityElement#validateUpperIsUnlimitedNatural(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Upper Is Unlimited Natural</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.MultiplicityElement#validateUpperIsUnlimitedNatural(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateUpperIsUnlimitedNatural__DiagnosticChain_Map() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.MultiplicityElement#isMultivalued() <em>Is Multivalued</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.MultiplicityElement#isMultivalued()
	 * @generated
	 */
	public void testIsMultivalued() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.MultiplicityElement#includesMultiplicity(org.eclipse.uml2.uml.MultiplicityElement) <em>Includes Multiplicity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.MultiplicityElement#includesMultiplicity(org.eclipse.uml2.uml.MultiplicityElement)
	 * @generated
	 */
	public void testIncludesMultiplicity__MultiplicityElement() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.MultiplicityElement#lowerBound() <em>Lower Bound</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.MultiplicityElement#lowerBound()
	 * @generated
	 */
	public void testLowerBound() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.MultiplicityElement#upperBound() <em>Upper Bound</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.MultiplicityElement#upperBound()
	 * @generated
	 */
	public void testUpperBound() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.MultiplicityElement#compatibleWith(org.eclipse.uml2.uml.MultiplicityElement) <em>Compatible With</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.MultiplicityElement#compatibleWith(org.eclipse.uml2.uml.MultiplicityElement)
	 * @generated
	 */
	public void testCompatibleWith__MultiplicityElement() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.MultiplicityElement#is(int, int) <em>Is</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.MultiplicityElement#is(int, int)
	 * @generated
	 */
	public void testIs__int_int() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.uml.Variable#isAccessibleBy(org.eclipse.uml2.uml.Action) <em>Is Accessible By</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Variable#isAccessibleBy(org.eclipse.uml2.uml.Action)
	 * @generated
	 */
	public void testIsAccessibleBy__Action() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
	}

} //VariableTest
