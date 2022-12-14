/*
 * Copyright (c) 2005, 2018 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 286329, 323181, 535301
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.FinalNode;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.FinalNodeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Final Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class FinalNodeImpl
		extends ControlNodeImpl
		implements FinalNode {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.FINAL_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoOutgoingEdges(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FinalNodeOperations.validateNoOutgoingEdges(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case UMLPackage.FINAL_NODE___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.FINAL_NODE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.FINAL_NODE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.FINAL_NODE___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.FINAL_NODE___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.FINAL_NODE___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.FINAL_NODE___DESTROY :
				destroy();
				return null;
			case UMLPackage.FINAL_NODE___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.FINAL_NODE___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.FINAL_NODE___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.FINAL_NODE___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.FINAL_NODE___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.FINAL_NODE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.FINAL_NODE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.FINAL_NODE___GET_MODEL :
				return getModel();
			case UMLPackage.FINAL_NODE___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.FINAL_NODE___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.FINAL_NODE___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.FINAL_NODE___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.FINAL_NODE___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.FINAL_NODE___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.FINAL_NODE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.FINAL_NODE___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.FINAL_NODE___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.FINAL_NODE___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.FINAL_NODE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.FINAL_NODE___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.FINAL_NODE___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.FINAL_NODE___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.FINAL_NODE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.FINAL_NODE___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.FINAL_NODE___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.FINAL_NODE___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.FINAL_NODE___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.FINAL_NODE___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.FINAL_NODE___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.FINAL_NODE___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.FINAL_NODE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.FINAL_NODE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.FINAL_NODE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.FINAL_NODE___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.FINAL_NODE___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.FINAL_NODE___GET_LABEL :
				return getLabel();
			case UMLPackage.FINAL_NODE___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.FINAL_NODE___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.FINAL_NODE___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.FINAL_NODE___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.FINAL_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.FINAL_NODE___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.FINAL_NODE___SEPARATOR :
				return separator();
			case UMLPackage.FINAL_NODE___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.FINAL_NODE___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.FINAL_NODE___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.FINAL_NODE___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.FINAL_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.FINAL_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.FINAL_NODE___CONTAINING_ACTIVITY :
				return containingActivity();
			case UMLPackage.FINAL_NODE___VALIDATE_NO_OUTGOING_EDGES__DIAGNOSTICCHAIN_MAP :
				return validateNoOutgoingEdges(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

} //FinalNodeImpl
