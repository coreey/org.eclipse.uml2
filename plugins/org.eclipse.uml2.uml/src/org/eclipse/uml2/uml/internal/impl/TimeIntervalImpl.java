/*
 * Copyright (c) 2005, 2018 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 212765, 418466, 451350, 485756
 *   Kenn Hussey - 535301
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TimeExpression;
import org.eclipse.uml2.uml.TimeInterval;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TimeIntervalImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TimeIntervalImpl#getMin <em>Min</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeIntervalImpl
		extends IntervalImpl
		implements TimeInterval {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeIntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.TIME_INTERVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSpecification getMax() {
		if (max != null && max.eIsProxy()) {
			InternalEObject oldMax = (InternalEObject) max;
			max = (ValueSpecification) eResolveProxy(oldMax);
			if (max != oldMax) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.TIME_INTERVAL__MAX, oldMax, max));
			}
		}
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSpecification basicGetMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMax(ValueSpecification newMax) {
		if (newMax != null && !(newMax instanceof TimeExpression)) {
			throw new IllegalArgumentException(
				"newMax must be an instance of TimeExpression"); //$NON-NLS-1$
		}
		ValueSpecification oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TIME_INTERVAL__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMax() {
		return max != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSpecification getMin() {
		if (min != null && min.eIsProxy()) {
			InternalEObject oldMin = (InternalEObject) min;
			min = (ValueSpecification) eResolveProxy(oldMin);
			if (min != oldMin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.TIME_INTERVAL__MIN, oldMin, min));
			}
		}
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSpecification basicGetMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMin(ValueSpecification newMin) {
		if (newMin != null && !(newMin instanceof TimeExpression)) {
			throw new IllegalArgumentException(
				"newMin must be an instance of TimeExpression"); //$NON-NLS-1$
		}
		ValueSpecification oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TIME_INTERVAL__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMin() {
		return min != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.TIME_INTERVAL__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.TIME_INTERVAL__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.TIME_INTERVAL__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.TIME_INTERVAL__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.TIME_INTERVAL__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.TIME_INTERVAL__NAME :
				return getName();
			case UMLPackage.TIME_INTERVAL__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.TIME_INTERVAL__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.TIME_INTERVAL__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.TIME_INTERVAL__VISIBILITY :
				return getVisibility();
			case UMLPackage.TIME_INTERVAL__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.TIME_INTERVAL__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.TIME_INTERVAL__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.TIME_INTERVAL__MAX :
				if (resolve)
					return getMax();
				return basicGetMax();
			case UMLPackage.TIME_INTERVAL__MIN :
				if (resolve)
					return getMin();
				return basicGetMin();
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
			case UMLPackage.TIME_INTERVAL__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.TIME_INTERVAL__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.TIME_INTERVAL__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.TIME_INTERVAL__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.TIME_INTERVAL__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.TIME_INTERVAL__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.TIME_INTERVAL__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.TIME_INTERVAL__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.TIME_INTERVAL__MAX :
				setMax((ValueSpecification) newValue);
				return;
			case UMLPackage.TIME_INTERVAL__MIN :
				setMin((ValueSpecification) newValue);
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
			case UMLPackage.TIME_INTERVAL__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.TIME_INTERVAL__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.TIME_INTERVAL__NAME :
				unsetName();
				return;
			case UMLPackage.TIME_INTERVAL__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.TIME_INTERVAL__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.TIME_INTERVAL__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.TIME_INTERVAL__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.TIME_INTERVAL__TYPE :
				setType((Type) null);
				return;
			case UMLPackage.TIME_INTERVAL__MAX :
				setMax((ValueSpecification) null);
				return;
			case UMLPackage.TIME_INTERVAL__MIN :
				setMin((ValueSpecification) null);
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
			case UMLPackage.TIME_INTERVAL__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.TIME_INTERVAL__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.TIME_INTERVAL__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.TIME_INTERVAL__OWNER :
				return isSetOwner();
			case UMLPackage.TIME_INTERVAL__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.TIME_INTERVAL__NAME :
				return isSetName();
			case UMLPackage.TIME_INTERVAL__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.TIME_INTERVAL__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.TIME_INTERVAL__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.TIME_INTERVAL__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.TIME_INTERVAL__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.TIME_INTERVAL__TEMPLATE_PARAMETER :
				return templateParameter != null;
			case UMLPackage.TIME_INTERVAL__TYPE :
				return type != null;
			case UMLPackage.TIME_INTERVAL__MAX :
				return isSetMax();
			case UMLPackage.TIME_INTERVAL__MIN :
				return isSetMin();
		}
		return eDynamicIsSet(featureID);
	}

} //TimeIntervalImpl
