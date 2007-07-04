/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: VariableImpl.java,v 1.27.2.1 2007/07/04 19:41:56 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.Variable;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.MultiplicityElementOperations;
import org.eclipse.uml2.uml.internal.operations.VariableOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.VariableImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.VariableImpl#isOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.VariableImpl#isUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.VariableImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.VariableImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.VariableImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.VariableImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.VariableImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.VariableImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.VariableImpl#getActivityScope <em>Activity Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableImpl
		extends ConnectableElementImpl
		implements Variable {

	/**
	 * The default value of the '{@link #isOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ORDERED_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_ORDERED_EFLAG = 1 << 10;

	/**
	 * The default value of the '{@link #isUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = true;

	/**
	 * The flag representing the value of the '{@link #isUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_UNIQUE_EFLAG = 1 << 11;

	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_EDEFAULT = 1;

	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getUpperValue() <em>Upper Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification upperValue = null;

	/**
	 * The cached value of the '{@link #getLowerValue() <em>Lower Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification lowerValue = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
		eFlags |= IS_UNIQUE_EFLAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList ownedElements = (EList) cache.get(eResource, this,
				UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT,
					ownedElements = new DerivedUnionEObjectEList(Element.class,
						this, UMLPackage.VARIABLE__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList(Element.class, this,
			UMLPackage.VARIABLE__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOrdered() {
		return (eFlags & IS_ORDERED_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(boolean newIsOrdered) {
		boolean oldIsOrdered = (eFlags & IS_ORDERED_EFLAG) != 0;
		if (newIsOrdered)
			eFlags |= IS_ORDERED_EFLAG;
		else
			eFlags &= ~IS_ORDERED_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.VARIABLE__IS_ORDERED, oldIsOrdered, newIsOrdered));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnique() {
		return (eFlags & IS_UNIQUE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(boolean newIsUnique) {
		boolean oldIsUnique = (eFlags & IS_UNIQUE_EFLAG) != 0;
		if (newIsUnique)
			eFlags |= IS_UNIQUE_EFLAG;
		else
			eFlags &= ~IS_UNIQUE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.VARIABLE__IS_UNIQUE, oldIsUnique, newIsUnique));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpper() {
		return MultiplicityElementOperations.getUpper(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(int newUpper) {
		MultiplicityElementOperations.setUpper(this, newUpper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLower() {
		return MultiplicityElementOperations.getLower(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(int newLower) {
		MultiplicityElementOperations.setLower(this, newLower);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getUpperValue() {
		if (upperValue != null && upperValue.eIsProxy()) {
			InternalEObject oldUpperValue = (InternalEObject) upperValue;
			upperValue = (ValueSpecification) eResolveProxy(oldUpperValue);
			if (upperValue != oldUpperValue) {
				InternalEObject newUpperValue = (InternalEObject) upperValue;
				NotificationChain msgs = oldUpperValue.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.VARIABLE__UPPER_VALUE,
					null, null);
				if (newUpperValue.eInternalContainer() == null) {
					msgs = newUpperValue.eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.VARIABLE__UPPER_VALUE, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.VARIABLE__UPPER_VALUE, oldUpperValue,
						upperValue));
			}
		}
		return upperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetUpperValue() {
		return upperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperValue(
			ValueSpecification newUpperValue, NotificationChain msgs) {
		ValueSpecification oldUpperValue = upperValue;
		upperValue = newUpperValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.VARIABLE__UPPER_VALUE,
				oldUpperValue, newUpperValue);
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
	public void setUpperValue(ValueSpecification newUpperValue) {
		if (newUpperValue != upperValue) {
			NotificationChain msgs = null;
			if (upperValue != null)
				msgs = ((InternalEObject) upperValue).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.VARIABLE__UPPER_VALUE,
					null, msgs);
			if (newUpperValue != null)
				msgs = ((InternalEObject) newUpperValue).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.VARIABLE__UPPER_VALUE,
					null, msgs);
			msgs = basicSetUpperValue(newUpperValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.VARIABLE__UPPER_VALUE, newUpperValue, newUpperValue));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createUpperValue(String name, Type type,
			EClass eClass) {
		ValueSpecification newUpperValue = (ValueSpecification) create(eClass);
		setUpperValue(newUpperValue);
		if (name != null)
			newUpperValue.setName(name);
		if (type != null)
			newUpperValue.setType(type);
		return newUpperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getLowerValue() {
		if (lowerValue != null && lowerValue.eIsProxy()) {
			InternalEObject oldLowerValue = (InternalEObject) lowerValue;
			lowerValue = (ValueSpecification) eResolveProxy(oldLowerValue);
			if (lowerValue != oldLowerValue) {
				InternalEObject newLowerValue = (InternalEObject) lowerValue;
				NotificationChain msgs = oldLowerValue.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.VARIABLE__LOWER_VALUE,
					null, null);
				if (newLowerValue.eInternalContainer() == null) {
					msgs = newLowerValue.eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.VARIABLE__LOWER_VALUE, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.VARIABLE__LOWER_VALUE, oldLowerValue,
						lowerValue));
			}
		}
		return lowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetLowerValue() {
		return lowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerValue(
			ValueSpecification newLowerValue, NotificationChain msgs) {
		ValueSpecification oldLowerValue = lowerValue;
		lowerValue = newLowerValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.VARIABLE__LOWER_VALUE,
				oldLowerValue, newLowerValue);
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
	public void setLowerValue(ValueSpecification newLowerValue) {
		if (newLowerValue != lowerValue) {
			NotificationChain msgs = null;
			if (lowerValue != null)
				msgs = ((InternalEObject) lowerValue).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.VARIABLE__LOWER_VALUE,
					null, msgs);
			if (newLowerValue != null)
				msgs = ((InternalEObject) newLowerValue).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE - UMLPackage.VARIABLE__LOWER_VALUE,
					null, msgs);
			msgs = basicSetLowerValue(newLowerValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.VARIABLE__LOWER_VALUE, newLowerValue, newLowerValue));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createLowerValue(String name, Type type,
			EClass eClass) {
		ValueSpecification newLowerValue = (ValueSpecification) create(eClass);
		setLowerValue(newLowerValue);
		if (name != null)
			newLowerValue.setName(name);
		if (type != null)
			newLowerValue.setType(type);
		return newLowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getNamespace() {
		Namespace namespace = basicGetNamespace();
		return namespace != null && namespace.eIsProxy()
			? (Namespace) eResolveProxy((InternalEObject) namespace)
			: namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivityScope() {
		if (eContainerFeatureID != UMLPackage.VARIABLE__ACTIVITY_SCOPE)
			return null;
		return (Activity) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetActivityScope() {
		if (eContainerFeatureID != UMLPackage.VARIABLE__ACTIVITY_SCOPE)
			return null;
		return (Activity) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityScope(Activity newActivityScope,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newActivityScope,
			UMLPackage.VARIABLE__ACTIVITY_SCOPE, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityScope(Activity newActivityScope) {
		if (newActivityScope != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.VARIABLE__ACTIVITY_SCOPE && newActivityScope != null)) {
			if (EcoreUtil.isAncestor(this, newActivityScope))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newActivityScope != null)
				msgs = ((InternalEObject) newActivityScope).eInverseAdd(this,
					UMLPackage.ACTIVITY__VARIABLE, Activity.class, msgs);
			msgs = basicSetActivityScope(newActivityScope, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.VARIABLE__ACTIVITY_SCOPE, newActivityScope,
				newActivityScope));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode getScope() {
		if (eContainerFeatureID != UMLPackage.VARIABLE__SCOPE)
			return null;
		return (StructuredActivityNode) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode basicGetScope() {
		if (eContainerFeatureID != UMLPackage.VARIABLE__SCOPE)
			return null;
		return (StructuredActivityNode) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScope(StructuredActivityNode newScope,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newScope,
			UMLPackage.VARIABLE__SCOPE, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(StructuredActivityNode newScope) {
		if (newScope != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.VARIABLE__SCOPE && newScope != null)) {
			if (EcoreUtil.isAncestor(this, newScope))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newScope != null)
				msgs = ((InternalEObject) newScope).eInverseAdd(this,
					UMLPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE,
					StructuredActivityNode.class, msgs);
			msgs = basicSetScope(newScope, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.VARIABLE__SCOPE, newScope, newScope));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperGt0(DiagnosticChain diagnostics, Map context) {
		return MultiplicityElementOperations.validateUpperGt0(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowerGe0(DiagnosticChain diagnostics, Map context) {
		return MultiplicityElementOperations.validateLowerGe0(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperGeLower(DiagnosticChain diagnostics, Map context) {
		return MultiplicityElementOperations.validateUpperGeLower(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSpecificationNoSideEffects(
			DiagnosticChain diagnostics, Map context) {
		return MultiplicityElementOperations
			.validateValueSpecificationNoSideEffects(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSpecificationConstant(
			DiagnosticChain diagnostics, Map context) {
		return MultiplicityElementOperations
			.validateValueSpecificationConstant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultivalued() {
		return MultiplicityElementOperations.isMultivalued(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean includesCardinality(int C) {
		return MultiplicityElementOperations.includesCardinality(this, C);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean includesMultiplicity(MultiplicityElement M) {
		return MultiplicityElementOperations.includesMultiplicity(this, M);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int lowerBound() {
		return MultiplicityElementOperations.lowerBound(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int upperBound() {
		return MultiplicityElementOperations.upperBound(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean compatibleWith(MultiplicityElement other) {
		return MultiplicityElementOperations.compatibleWith(this, other);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean is(int lowerbound, int upperbound) {
		return MultiplicityElementOperations.is(this, lowerbound, upperbound);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOwned(DiagnosticChain diagnostics, Map context) {
		return VariableOperations.validateOwned(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAccessibleBy(Action a) {
		return VariableOperations.isAccessibleBy(this, a);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.VARIABLE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.VARIABLE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.VARIABLE__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter(
					(TemplateParameter) otherEnd, msgs);
			case UMLPackage.VARIABLE__TEMPLATE_PARAMETER :
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter)
						.eInverseRemove(this,
							UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.VARIABLE__END :
				return ((InternalEList) getEnds()).basicAdd(otherEnd, msgs);
			case UMLPackage.VARIABLE__SCOPE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetScope((StructuredActivityNode) otherEnd, msgs);
			case UMLPackage.VARIABLE__ACTIVITY_SCOPE :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetActivityScope((Activity) otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.VARIABLE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.VARIABLE__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.VARIABLE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.VARIABLE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.VARIABLE__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.VARIABLE__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.VARIABLE__END :
				return ((InternalEList) getEnds()).basicRemove(otherEnd, msgs);
			case UMLPackage.VARIABLE__UPPER_VALUE :
				return basicSetUpperValue(null, msgs);
			case UMLPackage.VARIABLE__LOWER_VALUE :
				return basicSetLowerValue(null, msgs);
			case UMLPackage.VARIABLE__SCOPE :
				return basicSetScope(null, msgs);
			case UMLPackage.VARIABLE__ACTIVITY_SCOPE :
				return basicSetActivityScope(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case UMLPackage.VARIABLE__OWNING_TEMPLATE_PARAMETER :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
					TemplateParameter.class, msgs);
			case UMLPackage.VARIABLE__SCOPE :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE,
					StructuredActivityNode.class, msgs);
			case UMLPackage.VARIABLE__ACTIVITY_SCOPE :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.ACTIVITY__VARIABLE, Activity.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.VARIABLE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.VARIABLE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.VARIABLE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.VARIABLE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.VARIABLE__NAME :
				return getName();
			case UMLPackage.VARIABLE__VISIBILITY :
				return getVisibility();
			case UMLPackage.VARIABLE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.VARIABLE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.VARIABLE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.VARIABLE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.VARIABLE__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.VARIABLE__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.VARIABLE__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.VARIABLE__END :
				return getEnds();
			case UMLPackage.VARIABLE__IS_ORDERED :
				return isOrdered()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.VARIABLE__IS_UNIQUE :
				return isUnique()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.VARIABLE__UPPER :
				return new Integer(getUpper());
			case UMLPackage.VARIABLE__LOWER :
				return new Integer(getLower());
			case UMLPackage.VARIABLE__UPPER_VALUE :
				if (resolve)
					return getUpperValue();
				return basicGetUpperValue();
			case UMLPackage.VARIABLE__LOWER_VALUE :
				if (resolve)
					return getLowerValue();
				return basicGetLowerValue();
			case UMLPackage.VARIABLE__SCOPE :
				if (resolve)
					return getScope();
				return basicGetScope();
			case UMLPackage.VARIABLE__ACTIVITY_SCOPE :
				if (resolve)
					return getActivityScope();
				return basicGetActivityScope();
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
			case UMLPackage.VARIABLE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.VARIABLE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.VARIABLE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.VARIABLE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.VARIABLE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.VARIABLE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.VARIABLE__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.VARIABLE__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.VARIABLE__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.VARIABLE__END :
				getEnds().clear();
				getEnds().addAll((Collection) newValue);
				return;
			case UMLPackage.VARIABLE__IS_ORDERED :
				setIsOrdered(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.VARIABLE__IS_UNIQUE :
				setIsUnique(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.VARIABLE__UPPER :
				setUpper(((Integer) newValue).intValue());
				return;
			case UMLPackage.VARIABLE__LOWER :
				setLower(((Integer) newValue).intValue());
				return;
			case UMLPackage.VARIABLE__UPPER_VALUE :
				setUpperValue((ValueSpecification) newValue);
				return;
			case UMLPackage.VARIABLE__LOWER_VALUE :
				setLowerValue((ValueSpecification) newValue);
				return;
			case UMLPackage.VARIABLE__SCOPE :
				setScope((StructuredActivityNode) newValue);
				return;
			case UMLPackage.VARIABLE__ACTIVITY_SCOPE :
				setActivityScope((Activity) newValue);
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
			case UMLPackage.VARIABLE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.VARIABLE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.VARIABLE__NAME :
				unsetName();
				return;
			case UMLPackage.VARIABLE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.VARIABLE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.VARIABLE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.VARIABLE__TYPE :
				setType((Type) null);
				return;
			case UMLPackage.VARIABLE__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.VARIABLE__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.VARIABLE__END :
				getEnds().clear();
				return;
			case UMLPackage.VARIABLE__IS_ORDERED :
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case UMLPackage.VARIABLE__IS_UNIQUE :
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case UMLPackage.VARIABLE__UPPER :
				setUpper(UPPER_EDEFAULT);
				return;
			case UMLPackage.VARIABLE__LOWER :
				setLower(LOWER_EDEFAULT);
				return;
			case UMLPackage.VARIABLE__UPPER_VALUE :
				setUpperValue((ValueSpecification) null);
				return;
			case UMLPackage.VARIABLE__LOWER_VALUE :
				setLowerValue((ValueSpecification) null);
				return;
			case UMLPackage.VARIABLE__SCOPE :
				setScope((StructuredActivityNode) null);
				return;
			case UMLPackage.VARIABLE__ACTIVITY_SCOPE :
				setActivityScope((Activity) null);
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSetGen(int featureID) {
		switch (featureID) {
			case UMLPackage.VARIABLE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.VARIABLE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.VARIABLE__OWNER :
				return isSetOwner();
			case UMLPackage.VARIABLE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.VARIABLE__NAME :
				return isSetName();
			case UMLPackage.VARIABLE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.VARIABLE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.VARIABLE__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.VARIABLE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.VARIABLE__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.VARIABLE__TYPE :
				return type != null;
			case UMLPackage.VARIABLE__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.VARIABLE__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.VARIABLE__END :
				return ends != null && !ends.isEmpty();
			case UMLPackage.VARIABLE__IS_ORDERED :
				return ((eFlags & IS_ORDERED_EFLAG) != 0) != IS_ORDERED_EDEFAULT;
			case UMLPackage.VARIABLE__IS_UNIQUE :
				return ((eFlags & IS_UNIQUE_EFLAG) != 0) != IS_UNIQUE_EDEFAULT;
			case UMLPackage.VARIABLE__UPPER :
				return getUpper() != UPPER_EDEFAULT;
			case UMLPackage.VARIABLE__LOWER :
				return getLower() != LOWER_EDEFAULT;
			case UMLPackage.VARIABLE__UPPER_VALUE :
				return upperValue != null;
			case UMLPackage.VARIABLE__LOWER_VALUE :
				return lowerValue != null;
			case UMLPackage.VARIABLE__SCOPE :
				return basicGetScope() != null;
			case UMLPackage.VARIABLE__ACTIVITY_SCOPE :
				return basicGetActivityScope() != null;
		}
		return eDynamicIsSet(featureID);
	}

	public boolean eIsSet(int featureID) {

		switch (featureID) {
			case UMLPackage.VARIABLE__END :
				return !getEnds().isEmpty();
		}

		return eIsSetGen(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == MultiplicityElement.class) {
			switch (derivedFeatureID) {
				case UMLPackage.VARIABLE__IS_ORDERED :
					return UMLPackage.MULTIPLICITY_ELEMENT__IS_ORDERED;
				case UMLPackage.VARIABLE__IS_UNIQUE :
					return UMLPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE;
				case UMLPackage.VARIABLE__UPPER :
					return UMLPackage.MULTIPLICITY_ELEMENT__UPPER;
				case UMLPackage.VARIABLE__LOWER :
					return UMLPackage.MULTIPLICITY_ELEMENT__LOWER;
				case UMLPackage.VARIABLE__UPPER_VALUE :
					return UMLPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE;
				case UMLPackage.VARIABLE__LOWER_VALUE :
					return UMLPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE;
				default :
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == MultiplicityElement.class) {
			switch (baseFeatureID) {
				case UMLPackage.MULTIPLICITY_ELEMENT__IS_ORDERED :
					return UMLPackage.VARIABLE__IS_ORDERED;
				case UMLPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE :
					return UMLPackage.VARIABLE__IS_UNIQUE;
				case UMLPackage.MULTIPLICITY_ELEMENT__UPPER :
					return UMLPackage.VARIABLE__UPPER;
				case UMLPackage.MULTIPLICITY_ELEMENT__LOWER :
					return UMLPackage.VARIABLE__LOWER;
				case UMLPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE :
					return UMLPackage.VARIABLE__UPPER_VALUE;
				case UMLPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE :
					return UMLPackage.VARIABLE__LOWER_VALUE;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isOrdered: "); //$NON-NLS-1$
		result.append((eFlags & IS_ORDERED_EFLAG) != 0);
		result.append(", isUnique: "); //$NON-NLS-1$
		result.append((eFlags & IS_UNIQUE_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[]{
		UMLPackage.VARIABLE__OWNED_COMMENT,
		UMLPackage.VARIABLE__NAME_EXPRESSION, UMLPackage.VARIABLE__UPPER_VALUE,
		UMLPackage.VARIABLE__LOWER_VALUE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.VARIABLE__UPPER_VALUE)
			|| eIsSet(UMLPackage.VARIABLE__LOWER_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNamespace() {
		StructuredActivityNode scope = basicGetScope();
		if (scope != null) {
			return scope;
		}
		Activity activityScope = basicGetActivityScope();
		if (activityScope != null) {
			return activityScope;
		}
		return super.basicGetNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNamespace() {
		return super.isSetNamespace() || eIsSet(UMLPackage.VARIABLE__SCOPE)
			|| eIsSet(UMLPackage.VARIABLE__ACTIVITY_SCOPE);
	}

} //VariableImpl
