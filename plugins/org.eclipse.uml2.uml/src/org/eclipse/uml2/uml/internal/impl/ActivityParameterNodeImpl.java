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
 * $Id: ActivityParameterNodeImpl.java,v 1.11 2006/01/03 19:50:25 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityParameterNode;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.ObjectNodeOrderingKind;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ActivityParameterNodeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Parameter Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ActivityParameterNodeImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityParameterNodeImpl
		extends ObjectNodeImpl
		implements ActivityParameterNode {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityParameterNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ACTIVITY_PARAMETER_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getParameter() {
		Parameter parameter = (Parameter) eVirtualGet(UMLPackage.ACTIVITY_PARAMETER_NODE__PARAMETER);
		if (parameter != null && parameter.eIsProxy()) {
			InternalEObject oldParameter = (InternalEObject) parameter;
			parameter = (Parameter) eResolveProxy(oldParameter);
			if (parameter != oldParameter) {
				eVirtualSet(UMLPackage.ACTIVITY_PARAMETER_NODE__PARAMETER,
					parameter);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.ACTIVITY_PARAMETER_NODE__PARAMETER,
						oldParameter, parameter));
			}
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetParameter() {
		return (Parameter) eVirtualGet(UMLPackage.ACTIVITY_PARAMETER_NODE__PARAMETER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(Parameter newParameter) {
		Parameter parameter = newParameter;
		Object oldParameter = eVirtualSet(
			UMLPackage.ACTIVITY_PARAMETER_NODE__PARAMETER, parameter);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ACTIVITY_PARAMETER_NODE__PARAMETER,
				oldParameter == EVIRTUAL_NO_VALUE
					? null
					: oldParameter, parameter));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHasParameters(DiagnosticChain diagnostics,
			Map context) {
		return ActivityParameterNodeOperations.validateHasParameters(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSameType(DiagnosticChain diagnostics, Map context) {
		return ActivityParameterNodeOperations.validateSameType(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoEdges(DiagnosticChain diagnostics, Map context) {
		return ActivityParameterNodeOperations.validateNoEdges(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoIncomingEdges(DiagnosticChain diagnostics,
			Map context) {
		return ActivityParameterNodeOperations.validateNoIncomingEdges(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoOutgoingEdges(DiagnosticChain diagnostics,
			Map context) {
		return ActivityParameterNodeOperations.validateNoOutgoingEdges(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.ACTIVITY_PARAMETER_NODE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__NAME :
				return getName();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__VISIBILITY :
				return getVisibility();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__IN_STRUCTURED_NODE :
				return getInStructuredNode();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__ACTIVITY :
				return getActivity();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__OUTGOING :
				return getOutgoings();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__INCOMING :
				return getIncomings();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__IN_GROUP :
				return getInGroups();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__ORDERING :
				return getOrdering();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__IS_CONTROL_TYPE :
				return isControlType()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__UPPER_BOUND :
				return getUpperBound();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__IN_STATE :
				return getInStates();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__SELECTION :
				if (resolve)
					return getSelection();
				return basicGetSelection();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__PARAMETER :
				if (resolve)
					return getParameter();
				return basicGetParameter();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.ACTIVITY_PARAMETER_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__ORDERING :
				setOrdering((ObjectNodeOrderingKind) newValue);
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__IS_CONTROL_TYPE :
				setIsControlType(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__UPPER_BOUND :
				setUpperBound((ValueSpecification) newValue);
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__IN_STATE :
				getInStates().clear();
				getInStates().addAll((Collection) newValue);
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__SELECTION :
				setSelection((Behavior) newValue);
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__PARAMETER :
				setParameter((Parameter) newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.ACTIVITY_PARAMETER_NODE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__NAME :
				unsetName();
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__TYPE :
				setType((Type) null);
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__ORDERING :
				setOrdering(ORDERING_EDEFAULT);
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__IS_CONTROL_TYPE :
				setIsControlType(IS_CONTROL_TYPE_EDEFAULT);
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__UPPER_BOUND :
				setUpperBound((ValueSpecification) null);
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__IN_STATE :
				getInStates().clear();
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__SELECTION :
				setSelection((Behavior) null);
				return;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__PARAMETER :
				setParameter((Parameter) null);
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.ACTIVITY_PARAMETER_NODE__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.ACTIVITY_PARAMETER_NODE__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__OWNER :
				return isSetOwner();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.ACTIVITY_PARAMETER_NODE__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__NAME :
				return isSetName();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.ACTIVITY_PARAMETER_NODE__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.ACTIVITY_PARAMETER_NODE__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.ACTIVITY_PARAMETER_NODE__NAME_EXPRESSION) != null;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__IN_STRUCTURED_NODE :
				return getInStructuredNode() != null;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__ACTIVITY :
				return getActivity() != null;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__OUTGOING :
				EList outgoing = (EList) eVirtualGet(UMLPackage.ACTIVITY_PARAMETER_NODE__OUTGOING);
				return outgoing != null && !outgoing.isEmpty();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__INCOMING :
				EList incoming = (EList) eVirtualGet(UMLPackage.ACTIVITY_PARAMETER_NODE__INCOMING);
				return incoming != null && !incoming.isEmpty();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__IN_PARTITION :
				EList inPartition = (EList) eVirtualGet(UMLPackage.ACTIVITY_PARAMETER_NODE__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__IN_INTERRUPTIBLE_REGION :
				EList inInterruptibleRegion = (EList) eVirtualGet(UMLPackage.ACTIVITY_PARAMETER_NODE__IN_INTERRUPTIBLE_REGION);
				return inInterruptibleRegion != null
					&& !inInterruptibleRegion.isEmpty();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__REDEFINED_NODE :
				EList redefinedNode = (EList) eVirtualGet(UMLPackage.ACTIVITY_PARAMETER_NODE__REDEFINED_NODE);
				return redefinedNode != null && !redefinedNode.isEmpty();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__TYPE :
				return eVirtualGet(UMLPackage.ACTIVITY_PARAMETER_NODE__TYPE) != null;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__ORDERING :
				return eVirtualGet(
					UMLPackage.ACTIVITY_PARAMETER_NODE__ORDERING,
					ORDERING_EDEFAULT) != ORDERING_EDEFAULT;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__IS_CONTROL_TYPE :
				return ((eFlags & IS_CONTROL_TYPE_EFLAG) != 0) != IS_CONTROL_TYPE_EDEFAULT;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__UPPER_BOUND :
				return eVirtualGet(UMLPackage.ACTIVITY_PARAMETER_NODE__UPPER_BOUND) != null;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__IN_STATE :
				EList inState = (EList) eVirtualGet(UMLPackage.ACTIVITY_PARAMETER_NODE__IN_STATE);
				return inState != null && !inState.isEmpty();
			case UMLPackage.ACTIVITY_PARAMETER_NODE__SELECTION :
				return eVirtualGet(UMLPackage.ACTIVITY_PARAMETER_NODE__SELECTION) != null;
			case UMLPackage.ACTIVITY_PARAMETER_NODE__PARAMETER :
				return eVirtualGet(UMLPackage.ACTIVITY_PARAMETER_NODE__PARAMETER) != null;
		}
		return eDynamicIsSet(featureID);
	}

} //ActivityParameterNodeImpl
