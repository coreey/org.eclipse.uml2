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
 * $Id: CreateObjectActionImpl.java,v 1.26 2006/05/26 18:16:44 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Activity;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.CreateObjectAction;
import org.eclipse.uml2.OutputPin;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.StructuredActivityNode;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Object Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.CreateObjectActionImpl#getOutputs <em>Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.CreateObjectActionImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.CreateObjectActionImpl#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreateObjectActionImpl extends ActionImpl implements CreateObjectAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected Classifier classifier = null;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected OutputPin result = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateObjectActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.CREATE_OBJECT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutputs() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList outputs = (EList) cache.get(eResource, this, UML2Package.Literals.ACTION__OUTPUT);
			if (outputs == null) {
				cache.put(eResource, this, UML2Package.Literals.ACTION__OUTPUT, outputs = new DerivedUnionEObjectEList(OutputPin.class, this, UML2Package.CREATE_OBJECT_ACTION__OUTPUT, OUTPUT_ESUBSETS));
			}
			return outputs;
		}
		return new DerivedUnionEObjectEList(OutputPin.class, this, UML2Package.CREATE_OBJECT_ACTION__OUTPUT, OUTPUT_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOutputs() {
		return super.isSetOutputs()
			|| eIsSet(UML2Package.CREATE_OBJECT_ACTION__RESULT);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOutputs() <em>Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OUTPUT_ESUBSETS = new int[] {UML2Package.CREATE_OBJECT_ACTION__RESULT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getClassifier() {
		if (classifier != null && classifier.eIsProxy()) {
			InternalEObject oldClassifier = (InternalEObject)classifier;
			classifier = (Classifier)eResolveProxy(oldClassifier);
			if (classifier != oldClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.CREATE_OBJECT_ACTION__CLASSIFIER, oldClassifier, classifier));
			}
		}
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetClassifier() {
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifier(Classifier newClassifier) {
		Classifier oldClassifier = classifier;
		classifier = newClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CREATE_OBJECT_ACTION__CLASSIFIER, oldClassifier, classifier));


	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResult(OutputPin newResult, NotificationChain msgs) {
		OutputPin oldResult = result;
		result = newResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.CREATE_OBJECT_ACTION__RESULT, oldResult, newResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(OutputPin newResult) {
		if (newResult != result) {
			NotificationChain msgs = null;
			if (result != null)
				msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.CREATE_OBJECT_ACTION__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.CREATE_OBJECT_ACTION__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CREATE_OBJECT_ACTION__RESULT, newResult, newResult));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createResult() instead.
	 */
	public OutputPin createResult(EClass eClass) {
		OutputPin newResult = (OutputPin) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.CREATE_OBJECT_ACTION__RESULT, null, newResult));
		}
		setResult(newResult);
		return newResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OutputPin createResult() {
		OutputPin newResult = UML2Factory.eINSTANCE.createOutputPin();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.CREATE_OBJECT_ACTION__RESULT, null, newResult));
		}
		setResult(newResult);
		return newResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.CREATE_OBJECT_ACTION__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.CREATE_OBJECT_ACTION__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.CREATE_OBJECT_ACTION__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.CREATE_OBJECT_ACTION__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UML2Package.CREATE_OBJECT_ACTION__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
			case UML2Package.CREATE_OBJECT_ACTION__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
			case UML2Package.CREATE_OBJECT_ACTION__OUTGOING:
				return ((InternalEList)getOutgoings()).basicRemove(otherEnd, msgs);
			case UML2Package.CREATE_OBJECT_ACTION__INCOMING:
				return ((InternalEList)getIncomings()).basicRemove(otherEnd, msgs);
			case UML2Package.CREATE_OBJECT_ACTION__ACTIVITY:
				return basicSetActivity(null, msgs);
			case UML2Package.CREATE_OBJECT_ACTION__IN_STRUCTURED_NODE:
				return basicSetInStructuredNode(null, msgs);
			case UML2Package.CREATE_OBJECT_ACTION__IN_PARTITION:
				return ((InternalEList)getInPartitions()).basicRemove(otherEnd, msgs);
			case UML2Package.CREATE_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION:
				return ((InternalEList)getInInterruptibleRegions()).basicRemove(otherEnd, msgs);
			case UML2Package.CREATE_OBJECT_ACTION__HANDLER:
				return ((InternalEList)getHandlers()).basicRemove(otherEnd, msgs);
			case UML2Package.CREATE_OBJECT_ACTION__LOCAL_PRECONDITION:
				return ((InternalEList)getLocalPreconditions()).basicRemove(otherEnd, msgs);
			case UML2Package.CREATE_OBJECT_ACTION__LOCAL_POSTCONDITION:
				return ((InternalEList)getLocalPostconditions()).basicRemove(otherEnd, msgs);
			case UML2Package.CREATE_OBJECT_ACTION__RESULT:
				return basicSetResult(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.CREATE_OBJECT_ACTION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.CREATE_OBJECT_ACTION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.CREATE_OBJECT_ACTION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.CREATE_OBJECT_ACTION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.CREATE_OBJECT_ACTION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.CREATE_OBJECT_ACTION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.CREATE_OBJECT_ACTION__NAME:
				return getName();
			case UML2Package.CREATE_OBJECT_ACTION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.CREATE_OBJECT_ACTION__VISIBILITY:
				return getVisibility();
			case UML2Package.CREATE_OBJECT_ACTION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.CREATE_OBJECT_ACTION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.CREATE_OBJECT_ACTION__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.CREATE_OBJECT_ACTION__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.CREATE_OBJECT_ACTION__OUTGOING:
				return getOutgoings();
			case UML2Package.CREATE_OBJECT_ACTION__INCOMING:
				return getIncomings();
			case UML2Package.CREATE_OBJECT_ACTION__IN_GROUP:
				return getInGroups();
			case UML2Package.CREATE_OBJECT_ACTION__ACTIVITY:
				return getActivity();
			case UML2Package.CREATE_OBJECT_ACTION__REDEFINED_ELEMENT:
				return getRedefinedElements();
			case UML2Package.CREATE_OBJECT_ACTION__IN_STRUCTURED_NODE:
				return getInStructuredNode();
			case UML2Package.CREATE_OBJECT_ACTION__IN_PARTITION:
				return getInPartitions();
			case UML2Package.CREATE_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION:
				return getInInterruptibleRegions();
			case UML2Package.CREATE_OBJECT_ACTION__HANDLER:
				return getHandlers();
			case UML2Package.CREATE_OBJECT_ACTION__EFFECT:
				return getEffect();
			case UML2Package.CREATE_OBJECT_ACTION__OUTPUT:
				return getOutputs();
			case UML2Package.CREATE_OBJECT_ACTION__INPUT:
				return getInputs();
			case UML2Package.CREATE_OBJECT_ACTION__CONTEXT:
				return getContext();
			case UML2Package.CREATE_OBJECT_ACTION__LOCAL_PRECONDITION:
				return getLocalPreconditions();
			case UML2Package.CREATE_OBJECT_ACTION__LOCAL_POSTCONDITION:
				return getLocalPostconditions();
			case UML2Package.CREATE_OBJECT_ACTION__CLASSIFIER:
				if (resolve) return getClassifier();
				return basicGetClassifier();
			case UML2Package.CREATE_OBJECT_ACTION__RESULT:
				return getResult();
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
			case UML2Package.CREATE_OBJECT_ACTION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.CREATE_OBJECT_ACTION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.CREATE_OBJECT_ACTION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.CREATE_OBJECT_ACTION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.CREATE_OBJECT_ACTION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.CREATE_OBJECT_ACTION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.CREATE_OBJECT_ACTION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.CREATE_OBJECT_ACTION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.CREATE_OBJECT_ACTION__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.CREATE_OBJECT_ACTION__OUTGOING:
				getOutgoings().clear();
				getOutgoings().addAll((Collection)newValue);
				return;
			case UML2Package.CREATE_OBJECT_ACTION__INCOMING:
				getIncomings().clear();
				getIncomings().addAll((Collection)newValue);
				return;
			case UML2Package.CREATE_OBJECT_ACTION__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case UML2Package.CREATE_OBJECT_ACTION__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				getRedefinedElements().addAll((Collection)newValue);
				return;
			case UML2Package.CREATE_OBJECT_ACTION__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)newValue);
				return;
			case UML2Package.CREATE_OBJECT_ACTION__IN_PARTITION:
				getInPartitions().clear();
				getInPartitions().addAll((Collection)newValue);
				return;
			case UML2Package.CREATE_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection)newValue);
				return;
			case UML2Package.CREATE_OBJECT_ACTION__HANDLER:
				getHandlers().clear();
				getHandlers().addAll((Collection)newValue);
				return;
			case UML2Package.CREATE_OBJECT_ACTION__EFFECT:
				setEffect((String)newValue);
				return;
			case UML2Package.CREATE_OBJECT_ACTION__LOCAL_PRECONDITION:
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection)newValue);
				return;
			case UML2Package.CREATE_OBJECT_ACTION__LOCAL_POSTCONDITION:
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection)newValue);
				return;
			case UML2Package.CREATE_OBJECT_ACTION__CLASSIFIER:
				setClassifier((Classifier)newValue);
				return;
			case UML2Package.CREATE_OBJECT_ACTION__RESULT:
				setResult((OutputPin)newValue);
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
			case UML2Package.CREATE_OBJECT_ACTION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.CREATE_OBJECT_ACTION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.CREATE_OBJECT_ACTION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.CREATE_OBJECT_ACTION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.CREATE_OBJECT_ACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.CREATE_OBJECT_ACTION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.CREATE_OBJECT_ACTION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.CREATE_OBJECT_ACTION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.CREATE_OBJECT_ACTION__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.CREATE_OBJECT_ACTION__OUTGOING:
				getOutgoings().clear();
				return;
			case UML2Package.CREATE_OBJECT_ACTION__INCOMING:
				getIncomings().clear();
				return;
			case UML2Package.CREATE_OBJECT_ACTION__ACTIVITY:
				setActivity((Activity)null);
				return;
			case UML2Package.CREATE_OBJECT_ACTION__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				return;
			case UML2Package.CREATE_OBJECT_ACTION__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)null);
				return;
			case UML2Package.CREATE_OBJECT_ACTION__IN_PARTITION:
				getInPartitions().clear();
				return;
			case UML2Package.CREATE_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				return;
			case UML2Package.CREATE_OBJECT_ACTION__HANDLER:
				getHandlers().clear();
				return;
			case UML2Package.CREATE_OBJECT_ACTION__EFFECT:
				setEffect(EFFECT_EDEFAULT);
				return;
			case UML2Package.CREATE_OBJECT_ACTION__LOCAL_PRECONDITION:
				getLocalPreconditions().clear();
				return;
			case UML2Package.CREATE_OBJECT_ACTION__LOCAL_POSTCONDITION:
				getLocalPostconditions().clear();
				return;
			case UML2Package.CREATE_OBJECT_ACTION__CLASSIFIER:
				setClassifier((Classifier)null);
				return;
			case UML2Package.CREATE_OBJECT_ACTION__RESULT:
				setResult((OutputPin)null);
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
			case UML2Package.CREATE_OBJECT_ACTION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.CREATE_OBJECT_ACTION__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.CREATE_OBJECT_ACTION__OWNER:
				return isSetOwner();
			case UML2Package.CREATE_OBJECT_ACTION__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.CREATE_OBJECT_ACTION__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.CREATE_OBJECT_ACTION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.CREATE_OBJECT_ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.CREATE_OBJECT_ACTION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.CREATE_OBJECT_ACTION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.CREATE_OBJECT_ACTION__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.CREATE_OBJECT_ACTION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.CREATE_OBJECT_ACTION__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.CREATE_OBJECT_ACTION__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.CREATE_OBJECT_ACTION__OUTGOING:
				return outgoings != null && !outgoings.isEmpty();
			case UML2Package.CREATE_OBJECT_ACTION__INCOMING:
				return incomings != null && !incomings.isEmpty();
			case UML2Package.CREATE_OBJECT_ACTION__IN_GROUP:
				return isSetInGroups();
			case UML2Package.CREATE_OBJECT_ACTION__ACTIVITY:
				return getActivity() != null;
			case UML2Package.CREATE_OBJECT_ACTION__REDEFINED_ELEMENT:
				return isSetRedefinedElements();
			case UML2Package.CREATE_OBJECT_ACTION__IN_STRUCTURED_NODE:
				return getInStructuredNode() != null;
			case UML2Package.CREATE_OBJECT_ACTION__IN_PARTITION:
				return inPartitions != null && !inPartitions.isEmpty();
			case UML2Package.CREATE_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION:
				return inInterruptibleRegions != null && !inInterruptibleRegions.isEmpty();
			case UML2Package.CREATE_OBJECT_ACTION__HANDLER:
				return handlers != null && !handlers.isEmpty();
			case UML2Package.CREATE_OBJECT_ACTION__EFFECT:
				return EFFECT_EDEFAULT == null ? effect != null : !EFFECT_EDEFAULT.equals(effect);
			case UML2Package.CREATE_OBJECT_ACTION__OUTPUT:
				return isSetOutputs();
			case UML2Package.CREATE_OBJECT_ACTION__INPUT:
				return isSetInputs();
			case UML2Package.CREATE_OBJECT_ACTION__CONTEXT:
				return getContext() != null;
			case UML2Package.CREATE_OBJECT_ACTION__LOCAL_PRECONDITION:
				return localPreconditions != null && !localPreconditions.isEmpty();
			case UML2Package.CREATE_OBJECT_ACTION__LOCAL_POSTCONDITION:
				return localPostconditions != null && !localPostconditions.isEmpty();
			case UML2Package.CREATE_OBJECT_ACTION__CLASSIFIER:
				return classifier != null;
			case UML2Package.CREATE_OBJECT_ACTION__RESULT:
				return result != null;
		}
		return eDynamicIsSet(featureID);
	}


} //CreateObjectActionImpl
