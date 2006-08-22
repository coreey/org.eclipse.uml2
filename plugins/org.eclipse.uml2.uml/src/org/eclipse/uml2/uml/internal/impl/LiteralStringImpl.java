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
 * $Id: LiteralStringImpl.java,v 1.11.2.1 2006/08/22 19:41:19 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.LiteralStringOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal String</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.LiteralStringImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiteralStringImpl
		extends LiteralSpecificationImpl
		implements LiteralString {

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The flag representing whether the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_ESETFLAG = 1 << 10;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralStringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.LITERAL_STRING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		boolean oldValueESet = (eFlags & VALUE_ESETFLAG) != 0;
		eFlags |= VALUE_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.LITERAL_STRING__VALUE, oldValue, value,
				!oldValueESet));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValue() {
		String oldValue = value;
		boolean oldValueESet = (eFlags & VALUE_ESETFLAG) != 0;
		value = VALUE_EDEFAULT;
		eFlags &= ~VALUE_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
				UMLPackage.LITERAL_STRING__VALUE, oldValue, VALUE_EDEFAULT,
				oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValue() {
		return (eFlags & VALUE_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int integerValue() {
		return LiteralStringOperations.integerValue(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int unlimitedValue() {
		return LiteralStringOperations.unlimitedValue(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isComputable() {
		return LiteralStringOperations.isComputable(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String stringValue() {
		return LiteralStringOperations.stringValue(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.LITERAL_STRING__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.LITERAL_STRING__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.LITERAL_STRING__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.LITERAL_STRING__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.LITERAL_STRING__NAME :
				return getName();
			case UMLPackage.LITERAL_STRING__VISIBILITY :
				return getVisibility();
			case UMLPackage.LITERAL_STRING__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.LITERAL_STRING__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.LITERAL_STRING__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.LITERAL_STRING__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.LITERAL_STRING__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.LITERAL_STRING__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.LITERAL_STRING__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.LITERAL_STRING__VALUE :
				return getValue();
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
			case UMLPackage.LITERAL_STRING__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.LITERAL_STRING__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.LITERAL_STRING__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.LITERAL_STRING__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.LITERAL_STRING__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.LITERAL_STRING__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.LITERAL_STRING__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.LITERAL_STRING__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.LITERAL_STRING__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.LITERAL_STRING__VALUE :
				setValue((String) newValue);
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
			case UMLPackage.LITERAL_STRING__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.LITERAL_STRING__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.LITERAL_STRING__NAME :
				unsetName();
				return;
			case UMLPackage.LITERAL_STRING__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.LITERAL_STRING__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.LITERAL_STRING__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.LITERAL_STRING__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.LITERAL_STRING__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.LITERAL_STRING__TYPE :
				setType((Type) null);
				return;
			case UMLPackage.LITERAL_STRING__VALUE :
				unsetValue();
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
			case UMLPackage.LITERAL_STRING__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.LITERAL_STRING__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.LITERAL_STRING__OWNER :
				return isSetOwner();
			case UMLPackage.LITERAL_STRING__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.LITERAL_STRING__NAME :
				return isSetName();
			case UMLPackage.LITERAL_STRING__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.LITERAL_STRING__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.LITERAL_STRING__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.LITERAL_STRING__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.LITERAL_STRING__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.LITERAL_STRING__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.LITERAL_STRING__TEMPLATE_PARAMETER :
				return templateParameter != null;
			case UMLPackage.LITERAL_STRING__TYPE :
				return type != null;
			case UMLPackage.LITERAL_STRING__VALUE :
				return isSetValue();
		}
		return eDynamicIsSet(featureID);
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
		result.append(" (value: "); //$NON-NLS-1$
		if ((eFlags & VALUE_ESETFLAG) != 0)
			result.append(value);
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

} //LiteralStringImpl
