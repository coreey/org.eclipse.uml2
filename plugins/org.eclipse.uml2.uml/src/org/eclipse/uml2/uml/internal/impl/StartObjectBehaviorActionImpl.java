/*
 * Copyright (c) 2008 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: StartObjectBehaviorActionImpl.java,v 1.1 2008/10/02 20:56:21 jbruck Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.StartObjectBehaviorAction;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.StartObjectBehaviorActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Object Behavior Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StartObjectBehaviorActionImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StartObjectBehaviorActionImpl#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StartObjectBehaviorActionImpl
		extends CallActionImpl
		implements StartObjectBehaviorAction {

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected InputPin object;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartObjectBehaviorActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.START_OBJECT_BEHAVIOR_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InputPin> getInputs() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<InputPin> inputs = (EList<InputPin>) cache.get(eResource,
				this, UMLPackage.Literals.ACTION__INPUT);
			if (inputs == null) {
				cache.put(eResource, this, UMLPackage.Literals.ACTION__INPUT,
					inputs = new DerivedUnionEObjectEList<InputPin>(
						InputPin.class, this,
						UMLPackage.START_OBJECT_BEHAVIOR_ACTION__INPUT,
						INPUT_ESUBSETS));
			}
			return inputs;
		}
		return new DerivedUnionEObjectEList<InputPin>(InputPin.class, this,
			UMLPackage.START_OBJECT_BEHAVIOR_ACTION__INPUT, INPUT_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getInputs() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected static final int[] INPUT_ESUBSETS = new int[]{
		UMLPackage.START_OBJECT_BEHAVIOR_ACTION__ARGUMENT,
		UMLPackage.START_OBJECT_BEHAVIOR_ACTION__OBJECT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getObject() {
		if (object != null && object.eIsProxy()) {
			InternalEObject oldObject = (InternalEObject) object;
			object = (InputPin) eResolveProxy(oldObject);
			if (object != oldObject) {
				InternalEObject newObject = (InternalEObject) object;
				NotificationChain msgs = oldObject.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.START_OBJECT_BEHAVIOR_ACTION__OBJECT,
					null, null);
				if (newObject.eInternalContainer() == null) {
					msgs = newObject.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- UMLPackage.START_OBJECT_BEHAVIOR_ACTION__OBJECT,
						null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.START_OBJECT_BEHAVIOR_ACTION__OBJECT,
						oldObject, object));
			}
		}
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin basicGetObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObject(InputPin newObject,
			NotificationChain msgs) {
		InputPin oldObject = object;
		object = newObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				UMLPackage.START_OBJECT_BEHAVIOR_ACTION__OBJECT, oldObject,
				newObject);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(InputPin newObject) {
		if (newObject != object) {
			NotificationChain msgs = null;
			if (object != null)
				msgs = ((InternalEObject) object).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.START_OBJECT_BEHAVIOR_ACTION__OBJECT,
					null, msgs);
			if (newObject != null)
				msgs = ((InternalEObject) newObject).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.START_OBJECT_BEHAVIOR_ACTION__OBJECT,
					null, msgs);
			msgs = basicSetObject(newObject, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.START_OBJECT_BEHAVIOR_ACTION__OBJECT, newObject,
				newObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createObject(String name, Type type, EClass eClass) {
		InputPin newObject = (InputPin) create(eClass);
		setObject(newObject);
		if (name != null)
			newObject.setName(name);
		if (type != null)
			newObject.setType(type);
		return newObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createObject(String name, Type type) {
		return createObject(name, type, UMLPackage.Literals.INPUT_PIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeOfObject(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return StartObjectBehaviorActionOperations.validateTypeOfObject(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityOfObject(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return StartObjectBehaviorActionOperations
			.validateMultiplicityOfObject(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberOrderArguments(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return StartObjectBehaviorActionOperations
			.validateNumberOrderArguments(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberOrderResults(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return StartObjectBehaviorActionOperations.validateNumberOrderResults(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeOrderingMultiplicityMatch(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StartObjectBehaviorActionOperations
			.validateTypeOrderingMultiplicityMatch(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__CLIENT_DEPENDENCY :
				return ((InternalEList<?>) getClientDependencies())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__ACTIVITY :
				return basicSetActivity(null, msgs);
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__OUTGOING :
				return ((InternalEList<?>) getOutgoings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__INCOMING :
				return ((InternalEList<?>) getIncomings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__IN_PARTITION :
				return ((InternalEList<?>) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList<?>) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__HANDLER :
				return ((InternalEList<?>) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__LOCAL_PRECONDITION :
				return ((InternalEList<?>) getLocalPreconditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__LOCAL_POSTCONDITION :
				return ((InternalEList<?>) getLocalPostconditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__ARGUMENT :
				return ((InternalEList<?>) getArguments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__RESULT :
				return ((InternalEList<?>) getResults()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__OBJECT :
				return basicSetObject(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__NAME :
				return getName();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__INPUT :
				return getInputs();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__ARGUMENT :
				return getArguments();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__ON_PORT :
				if (resolve)
					return getOnPort();
				return basicGetOnPort();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__IS_SYNCHRONOUS :
				return isSynchronous()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__RESULT :
				return getResults();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__OBJECT :
				if (resolve)
					return getObject();
				return basicGetObject();
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
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll(
					(Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll(
					(Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll(
					(Collection<? extends Dependency>) newValue);
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll(
					(Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings().addAll(
					(Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll(
					(Collection<? extends ActivityPartition>) newValue);
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions()
					.addAll(
						(Collection<? extends InterruptibleActivityRegion>) newValue);
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll(
					(Collection<? extends ActivityNode>) newValue);
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers().addAll(
					(Collection<? extends ExceptionHandler>) newValue);
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll(
					(Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll(
					(Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__ARGUMENT :
				getArguments().clear();
				getArguments()
					.addAll((Collection<? extends InputPin>) newValue);
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__ON_PORT :
				setOnPort((Port) newValue);
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__IS_SYNCHRONOUS :
				setIsSynchronous(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__RESULT :
				getResults().clear();
				getResults().addAll((Collection<? extends OutputPin>) newValue);
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__OBJECT :
				setObject((InputPin) newValue);
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
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__NAME :
				unsetName();
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__ARGUMENT :
				getArguments().clear();
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__ON_PORT :
				setOnPort((Port) null);
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__IS_SYNCHRONOUS :
				setIsSynchronous(IS_SYNCHRONOUS_EDEFAULT);
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__RESULT :
				getResults().clear();
				return;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__OBJECT :
				setObject((InputPin) null);
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
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__NAME :
				return isSetName();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__IN_INTERRUPTIBLE_REGION :
				return inInterruptibleRegions != null
					&& !inInterruptibleRegions.isEmpty();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__REDEFINED_NODE :
				return redefinedNodes != null && !redefinedNodes.isEmpty();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__HANDLER :
				return handlers != null && !handlers.isEmpty();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__LOCAL_PRECONDITION :
				return localPreconditions != null
					&& !localPreconditions.isEmpty();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__LOCAL_POSTCONDITION :
				return localPostconditions != null
					&& !localPostconditions.isEmpty();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__ARGUMENT :
				return arguments != null && !arguments.isEmpty();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__ON_PORT :
				return onPort != null;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__IS_SYNCHRONOUS :
				return ((eFlags & IS_SYNCHRONOUS_EFLAG) != 0) != IS_SYNCHRONOUS_EDEFAULT;
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__RESULT :
				return results != null && !results.isEmpty();
			case UMLPackage.START_OBJECT_BEHAVIOR_ACTION__OBJECT :
				return object != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetInputs() {
		return super.isSetInputs()
			|| eIsSet(UMLPackage.START_OBJECT_BEHAVIOR_ACTION__OBJECT);
	}

} //StartObjectBehaviorActionImpl