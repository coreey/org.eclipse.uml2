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
 * $Id: AddStructuralFeatureValueActionImpl.java,v 1.25 2006/05/26 18:16:43 khussey Exp $
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
import org.eclipse.uml2.AddStructuralFeatureValueAction;
import org.eclipse.uml2.InputPin;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.StructuralFeature;
import org.eclipse.uml2.StructuredActivityNode;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Structural Feature Value Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.AddStructuralFeatureValueActionImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.AddStructuralFeatureValueActionImpl#isReplaceAll <em>Is Replace All</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.AddStructuralFeatureValueActionImpl#getInsertAt <em>Insert At</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddStructuralFeatureValueActionImpl extends WriteStructuralFeatureActionImpl implements AddStructuralFeatureValueAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #isReplaceAll() <em>Is Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReplaceAll()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REPLACE_ALL_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isReplaceAll() <em>Is Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReplaceAll()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_REPLACE_ALL_EFLAG = 1 << 9;

	/**
	 * The cached value of the '{@link #getInsertAt() <em>Insert At</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertAt()
	 * @generated
	 * @ordered
	 */
	protected InputPin insertAt = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddStructuralFeatureValueActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.ADD_STRUCTURAL_FEATURE_VALUE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputs() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList inputs = (EList) cache.get(eResource, this, UML2Package.Literals.ACTION__INPUT);
			if (inputs == null) {
				cache.put(eResource, this, UML2Package.Literals.ACTION__INPUT, inputs = new DerivedUnionEObjectEList(InputPin.class, this, UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INPUT, INPUT_ESUBSETS));
			}
			return inputs;
		}
		return new DerivedUnionEObjectEList(InputPin.class, this, UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INPUT, INPUT_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInputs() {
		return super.isSetInputs()
			|| eIsSet(UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getInputs() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected static final int[] INPUT_ESUBSETS = new int[] {UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OBJECT, UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__VALUE, UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReplaceAll() {
		return (eFlags & IS_REPLACE_ALL_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReplaceAll(boolean newIsReplaceAll) {
		boolean oldIsReplaceAll = (eFlags & IS_REPLACE_ALL_EFLAG) != 0;
		if (newIsReplaceAll) eFlags |= IS_REPLACE_ALL_EFLAG; else eFlags &= ~IS_REPLACE_ALL_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REPLACE_ALL, oldIsReplaceAll, newIsReplaceAll));


	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getInsertAt() {
		return insertAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsertAt(InputPin newInsertAt, NotificationChain msgs) {
		InputPin oldInsertAt = insertAt;
		insertAt = newInsertAt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT, oldInsertAt, newInsertAt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertAt(InputPin newInsertAt) {
		if (newInsertAt != insertAt) {
			NotificationChain msgs = null;
			if (insertAt != null)
				msgs = ((InternalEObject)insertAt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT, null, msgs);
			if (newInsertAt != null)
				msgs = ((InternalEObject)newInsertAt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT, null, msgs);
			msgs = basicSetInsertAt(newInsertAt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT, newInsertAt, newInsertAt));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public InputPin createInsertAt(EClass eClass) {
		InputPin newInsertAt = (InputPin) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT, null, newInsertAt));
		}
		setInsertAt(newInsertAt);
		return newInsertAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public InputPin createInsertAt() {
		InputPin newInsertAt = UML2Factory.eINSTANCE.createInputPin();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT, null, newInsertAt));
		}
		setInsertAt(newInsertAt);
		return newInsertAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OUTGOING:
				return ((InternalEList)getOutgoings()).basicRemove(otherEnd, msgs);
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INCOMING:
				return ((InternalEList)getIncomings()).basicRemove(otherEnd, msgs);
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__ACTIVITY:
				return basicSetActivity(null, msgs);
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_STRUCTURED_NODE:
				return basicSetInStructuredNode(null, msgs);
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_PARTITION:
				return ((InternalEList)getInPartitions()).basicRemove(otherEnd, msgs);
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_INTERRUPTIBLE_REGION:
				return ((InternalEList)getInInterruptibleRegions()).basicRemove(otherEnd, msgs);
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__HANDLER:
				return ((InternalEList)getHandlers()).basicRemove(otherEnd, msgs);
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_PRECONDITION:
				return ((InternalEList)getLocalPreconditions()).basicRemove(otherEnd, msgs);
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_POSTCONDITION:
				return ((InternalEList)getLocalPostconditions()).basicRemove(otherEnd, msgs);
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OBJECT:
				return basicSetObject(null, msgs);
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__VALUE:
				return basicSetValue(null, msgs);
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT:
				return basicSetInsertAt(null, msgs);
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
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__NAME:
				return getName();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__VISIBILITY:
				return getVisibility();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OUTGOING:
				return getOutgoings();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INCOMING:
				return getIncomings();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_GROUP:
				return getInGroups();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__ACTIVITY:
				return getActivity();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__REDEFINED_ELEMENT:
				return getRedefinedElements();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_STRUCTURED_NODE:
				return getInStructuredNode();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_PARTITION:
				return getInPartitions();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_INTERRUPTIBLE_REGION:
				return getInInterruptibleRegions();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__HANDLER:
				return getHandlers();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__EFFECT:
				return getEffect();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OUTPUT:
				return getOutputs();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INPUT:
				return getInputs();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__CONTEXT:
				return getContext();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_PRECONDITION:
				return getLocalPreconditions();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_POSTCONDITION:
				return getLocalPostconditions();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__STRUCTURAL_FEATURE:
				if (resolve) return getStructuralFeature();
				return basicGetStructuralFeature();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OBJECT:
				return getObject();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__VALUE:
				return getValue();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REPLACE_ALL:
				return isReplaceAll() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT:
				return getInsertAt();
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
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OUTGOING:
				getOutgoings().clear();
				getOutgoings().addAll((Collection)newValue);
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INCOMING:
				getIncomings().clear();
				getIncomings().addAll((Collection)newValue);
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				getRedefinedElements().addAll((Collection)newValue);
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)newValue);
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_PARTITION:
				getInPartitions().clear();
				getInPartitions().addAll((Collection)newValue);
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection)newValue);
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__HANDLER:
				getHandlers().clear();
				getHandlers().addAll((Collection)newValue);
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__EFFECT:
				setEffect((String)newValue);
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_PRECONDITION:
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection)newValue);
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_POSTCONDITION:
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection)newValue);
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__STRUCTURAL_FEATURE:
				setStructuralFeature((StructuralFeature)newValue);
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OBJECT:
				setObject((InputPin)newValue);
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__VALUE:
				setValue((InputPin)newValue);
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REPLACE_ALL:
				setIsReplaceAll(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT:
				setInsertAt((InputPin)newValue);
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
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OUTGOING:
				getOutgoings().clear();
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INCOMING:
				getIncomings().clear();
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__ACTIVITY:
				setActivity((Activity)null);
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)null);
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_PARTITION:
				getInPartitions().clear();
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__HANDLER:
				getHandlers().clear();
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__EFFECT:
				setEffect(EFFECT_EDEFAULT);
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_PRECONDITION:
				getLocalPreconditions().clear();
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_POSTCONDITION:
				getLocalPostconditions().clear();
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__STRUCTURAL_FEATURE:
				setStructuralFeature((StructuralFeature)null);
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OBJECT:
				setObject((InputPin)null);
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__VALUE:
				setValue((InputPin)null);
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REPLACE_ALL:
				setIsReplaceAll(IS_REPLACE_ALL_EDEFAULT);
				return;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT:
				setInsertAt((InputPin)null);
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
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OWNER:
				return isSetOwner();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OUTGOING:
				return outgoings != null && !outgoings.isEmpty();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INCOMING:
				return incomings != null && !incomings.isEmpty();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_GROUP:
				return isSetInGroups();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__ACTIVITY:
				return getActivity() != null;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__REDEFINED_ELEMENT:
				return isSetRedefinedElements();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_STRUCTURED_NODE:
				return getInStructuredNode() != null;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_PARTITION:
				return inPartitions != null && !inPartitions.isEmpty();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_INTERRUPTIBLE_REGION:
				return inInterruptibleRegions != null && !inInterruptibleRegions.isEmpty();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__HANDLER:
				return handlers != null && !handlers.isEmpty();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__EFFECT:
				return EFFECT_EDEFAULT == null ? effect != null : !EFFECT_EDEFAULT.equals(effect);
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OUTPUT:
				return isSetOutputs();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INPUT:
				return isSetInputs();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__CONTEXT:
				return getContext() != null;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_PRECONDITION:
				return localPreconditions != null && !localPreconditions.isEmpty();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_POSTCONDITION:
				return localPostconditions != null && !localPostconditions.isEmpty();
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__STRUCTURAL_FEATURE:
				return structuralFeature != null;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OBJECT:
				return object != null;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__VALUE:
				return value != null;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REPLACE_ALL:
				return ((eFlags & IS_REPLACE_ALL_EFLAG) != 0) != IS_REPLACE_ALL_EDEFAULT;
			case UML2Package.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT:
				return insertAt != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isReplaceAll: "); //$NON-NLS-1$
		result.append((eFlags & IS_REPLACE_ALL_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}


} //AddStructuralFeatureValueActionImpl
