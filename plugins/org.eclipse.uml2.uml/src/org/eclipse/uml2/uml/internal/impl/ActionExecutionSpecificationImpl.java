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
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.ActionExecutionSpecification;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.OccurrenceSpecification;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ActionExecutionSpecificationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Execution Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActionExecutionSpecificationImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionExecutionSpecificationImpl
		extends ExecutionSpecificationImpl
		implements ActionExecutionSpecification {

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionExecutionSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ACTION_EXECUTION_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		if (action != null && action.eIsProxy()) {
			InternalEObject oldAction = (InternalEObject) action;
			action = (Action) eResolveProxy(oldAction);
			if (action != oldAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.ACTION_EXECUTION_SPECIFICATION__ACTION,
						oldAction, action));
			}
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		Action oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ACTION_EXECUTION_SPECIFICATION__ACTION, oldAction,
				action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionReferenced(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ActionExecutionSpecificationOperations
			.validateActionReferenced(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__NAME :
				return getName();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__VISIBILITY :
				return getVisibility();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__COVERED :
				return getCovereds();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__ENCLOSING_OPERAND :
				if (resolve)
					return getEnclosingOperand();
				return basicGetEnclosingOperand();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION :
				if (resolve)
					return getEnclosingInteraction();
				return basicGetEnclosingInteraction();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__GENERAL_ORDERING :
				return getGeneralOrderings();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__FINISH :
				if (resolve)
					return getFinish();
				return basicGetFinish();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__START :
				if (resolve)
					return getStart();
				return basicGetStart();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__ACTION :
				if (resolve)
					return getAction();
				return basicGetAction();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__COVERED :
				getCovereds().clear();
				getCovereds().addAll((Collection<? extends Lifeline>) newValue);
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) newValue);
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) newValue);
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				getGeneralOrderings()
					.addAll((Collection<? extends GeneralOrdering>) newValue);
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__FINISH :
				setFinish((OccurrenceSpecification) newValue);
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__START :
				setStart((OccurrenceSpecification) newValue);
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__ACTION :
				setAction((Action) newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__NAME :
				unsetName();
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__COVERED :
				getCovereds().clear();
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) null);
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) null);
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__FINISH :
				setFinish((OccurrenceSpecification) null);
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__START :
				setStart((OccurrenceSpecification) null);
				return;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__ACTION :
				setAction((Action) null);
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__OWNER :
				return isSetOwner();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__NAME :
				return isSetName();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__COVERED :
				return covereds != null && !covereds.isEmpty();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__ENCLOSING_OPERAND :
				return basicGetEnclosingOperand() != null;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION :
				return basicGetEnclosingInteraction() != null;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__GENERAL_ORDERING :
				return generalOrderings != null && !generalOrderings.isEmpty();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__FINISH :
				return finish != null;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__START :
				return start != null;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION__ACTION :
				return action != null;
		}
		return eDynamicIsSet(featureID);
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
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___DESTROY :
				destroy();
				return null;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___GET_MODEL :
				return getModel();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___GET_LABEL :
				return getLabel();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___SEPARATOR :
				return separator();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___VALIDATE_SAME_LIFELINE__DIAGNOSTICCHAIN_MAP :
				return validateSameLifeline((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ACTION_EXECUTION_SPECIFICATION___VALIDATE_ACTION_REFERENCED__DIAGNOSTICCHAIN_MAP :
				return validateActionReferenced(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

} //ActionExecutionSpecificationImpl
