/*
 * Copyright (c) 2005, 2018 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 247980
 *   Kenn Hussey - 323181, 535301
 *   Kenn Hussey (CEA) - 451350
 *
 */
package org.eclipse.uml2.codegen.ecore.genmodel.util;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.uml2.codegen.ecore.genmodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage
 * @generated
 */
public class GenModelSwitch<T>
		extends Switch<T> {

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GenModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenModelSwitch() {
		if (modelPackage == null) {
			modelPackage = GenModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GenModelPackage.GEN_BASE : {
				GenBase genBase = (GenBase) theEObject;
				T result = caseGenBase(genBase);
				if (result == null)
					result = caseGenModel_GenBase(genBase);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case GenModelPackage.GEN_CLASS : {
				GenClass genClass = (GenClass) theEObject;
				T result = caseGenClass(genClass);
				if (result == null)
					result = caseGenModel_GenClass(genClass);
				if (result == null)
					result = caseGenClassifier(genClass);
				if (result == null)
					result = caseGenModel_GenClassifier(genClass);
				if (result == null)
					result = caseGenBase(genClass);
				if (result == null)
					result = caseGenModel_GenBase(genClass);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case GenModelPackage.GEN_CLASSIFIER : {
				GenClassifier genClassifier = (GenClassifier) theEObject;
				T result = caseGenClassifier(genClassifier);
				if (result == null)
					result = caseGenModel_GenClassifier(genClassifier);
				if (result == null)
					result = caseGenBase(genClassifier);
				if (result == null)
					result = caseGenModel_GenBase(genClassifier);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case GenModelPackage.GEN_DATA_TYPE : {
				GenDataType genDataType = (GenDataType) theEObject;
				T result = caseGenDataType(genDataType);
				if (result == null)
					result = caseGenModel_GenDataType(genDataType);
				if (result == null)
					result = caseGenClassifier(genDataType);
				if (result == null)
					result = caseGenModel_GenClassifier(genDataType);
				if (result == null)
					result = caseGenBase(genDataType);
				if (result == null)
					result = caseGenModel_GenBase(genDataType);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case GenModelPackage.GEN_ENUM : {
				GenEnum genEnum = (GenEnum) theEObject;
				T result = caseGenEnum(genEnum);
				if (result == null)
					result = caseGenModel_GenEnum(genEnum);
				if (result == null)
					result = caseGenDataType(genEnum);
				if (result == null)
					result = caseGenModel_GenDataType(genEnum);
				if (result == null)
					result = caseGenClassifier(genEnum);
				if (result == null)
					result = caseGenModel_GenClassifier(genEnum);
				if (result == null)
					result = caseGenBase(genEnum);
				if (result == null)
					result = caseGenModel_GenBase(genEnum);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case GenModelPackage.GEN_ENUM_LITERAL : {
				GenEnumLiteral genEnumLiteral = (GenEnumLiteral) theEObject;
				T result = caseGenEnumLiteral(genEnumLiteral);
				if (result == null)
					result = caseGenModel_GenEnumLiteral(genEnumLiteral);
				if (result == null)
					result = caseGenBase(genEnumLiteral);
				if (result == null)
					result = caseGenModel_GenBase(genEnumLiteral);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case GenModelPackage.GEN_FEATURE : {
				GenFeature genFeature = (GenFeature) theEObject;
				T result = caseGenFeature(genFeature);
				if (result == null)
					result = caseGenModel_GenFeature(genFeature);
				if (result == null)
					result = caseGenTypedElement(genFeature);
				if (result == null)
					result = caseGenModel_GenTypedElement(genFeature);
				if (result == null)
					result = caseGenBase(genFeature);
				if (result == null)
					result = caseGenModel_GenBase(genFeature);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case GenModelPackage.GEN_MODEL : {
				GenModel genModel = (GenModel) theEObject;
				T result = caseGenModel(genModel);
				if (result == null)
					result = caseGenModel_GenModel(genModel);
				if (result == null)
					result = caseGenBase(genModel);
				if (result == null)
					result = caseGenModel_GenBase(genModel);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case GenModelPackage.GEN_OPERATION : {
				GenOperation genOperation = (GenOperation) theEObject;
				T result = caseGenOperation(genOperation);
				if (result == null)
					result = caseGenModel_GenOperation(genOperation);
				if (result == null)
					result = caseGenTypedElement(genOperation);
				if (result == null)
					result = caseGenModel_GenTypedElement(genOperation);
				if (result == null)
					result = caseGenBase(genOperation);
				if (result == null)
					result = caseGenModel_GenBase(genOperation);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case GenModelPackage.GEN_PACKAGE : {
				GenPackage genPackage = (GenPackage) theEObject;
				T result = caseGenPackage(genPackage);
				if (result == null)
					result = caseGenModel_GenPackage(genPackage);
				if (result == null)
					result = caseGenBase(genPackage);
				if (result == null)
					result = caseGenModel_GenBase(genPackage);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case GenModelPackage.GEN_PARAMETER : {
				GenParameter genParameter = (GenParameter) theEObject;
				T result = caseGenParameter(genParameter);
				if (result == null)
					result = caseGenModel_GenParameter(genParameter);
				if (result == null)
					result = caseGenTypedElement(genParameter);
				if (result == null)
					result = caseGenModel_GenTypedElement(genParameter);
				if (result == null)
					result = caseGenBase(genParameter);
				if (result == null)
					result = caseGenModel_GenBase(genParameter);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case GenModelPackage.GEN_TYPED_ELEMENT : {
				GenTypedElement genTypedElement = (GenTypedElement) theEObject;
				T result = caseGenTypedElement(genTypedElement);
				if (result == null)
					result = caseGenModel_GenTypedElement(genTypedElement);
				if (result == null)
					result = caseGenBase(genTypedElement);
				if (result == null)
					result = caseGenModel_GenBase(genTypedElement);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			default :
				return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenBase(GenBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenClass(GenClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenClassifier(GenClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenDataType(GenDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenEnum(GenEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Enum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Enum Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenEnumLiteral(GenEnumLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenFeature(GenFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenModel(GenModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenOperation(GenOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenPackage(GenPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenParameter(GenParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenTypedElement(GenTypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenModel_GenBase(
			org.eclipse.emf.codegen.ecore.genmodel.GenBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenModel_GenClassifier(
			org.eclipse.emf.codegen.ecore.genmodel.GenClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenModel_GenClass(
			org.eclipse.emf.codegen.ecore.genmodel.GenClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenModel_GenDataType(
			org.eclipse.emf.codegen.ecore.genmodel.GenDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenModel_GenEnum(
			org.eclipse.emf.codegen.ecore.genmodel.GenEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Enum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Enum Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenModel_GenEnumLiteral(
			org.eclipse.emf.codegen.ecore.genmodel.GenEnumLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenModel_GenTypedElement(
			org.eclipse.emf.codegen.ecore.genmodel.GenTypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenModel_GenFeature(
			org.eclipse.emf.codegen.ecore.genmodel.GenFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenModel_GenModel(
			org.eclipse.emf.codegen.ecore.genmodel.GenModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenModel_GenOperation(
			org.eclipse.emf.codegen.ecore.genmodel.GenOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenModel_GenPackage(
			org.eclipse.emf.codegen.ecore.genmodel.GenPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenModel_GenParameter(
			org.eclipse.emf.codegen.ecore.genmodel.GenParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GenModelSwitch
