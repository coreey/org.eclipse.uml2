/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ObjectFlowImpl.java,v 1.13 2005/11/22 14:57:01 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.Activity;
import org.eclipse.uml2.ActivityNode;
import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.InterruptibleActivityRegion;
import org.eclipse.uml2.ObjectFlow;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.StructuredActivityNode;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;
import org.eclipse.uml2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ObjectFlowImpl#isMulticast <em>Is Multicast</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ObjectFlowImpl#isMultireceive <em>Is Multireceive</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ObjectFlowImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ObjectFlowImpl#getSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectFlowImpl extends ActivityEdgeImpl implements ObjectFlow {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #isMulticast() <em>Is Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isMulticast()
	 * @generated
	 * @ordered
	 */
    protected static final boolean IS_MULTICAST_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isMulticast() <em>Is Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMulticast()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_MULTICAST_EFLAG = 1 << 9;

	/**
	 * The default value of the '{@link #isMultireceive() <em>Is Multireceive</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isMultireceive()
	 * @generated
	 * @ordered
	 */
    protected static final boolean IS_MULTIRECEIVE_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isMultireceive() <em>Is Multireceive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultireceive()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_MULTIRECEIVE_EFLAG = 1 << 10;

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ObjectFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getObjectFlow();
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isMulticast() {
		return (eFlags & IS_MULTICAST_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setIsMulticast(boolean newIsMulticast) {
		boolean oldIsMulticast = (eFlags & IS_MULTICAST_EFLAG) != 0;
		if (newIsMulticast) eFlags |= IS_MULTICAST_EFLAG; else eFlags &= ~IS_MULTICAST_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.OBJECT_FLOW__IS_MULTICAST, oldIsMulticast, newIsMulticast));

	}


	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isMultireceive() {
		return (eFlags & IS_MULTIRECEIVE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setIsMultireceive(boolean newIsMultireceive) {
		boolean oldIsMultireceive = (eFlags & IS_MULTIRECEIVE_EFLAG) != 0;
		if (newIsMultireceive) eFlags |= IS_MULTIRECEIVE_EFLAG; else eFlags &= ~IS_MULTIRECEIVE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.OBJECT_FLOW__IS_MULTIRECEIVE, oldIsMultireceive, newIsMultireceive));

	}


	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Behavior getTransformation() {
		Behavior transformation = (Behavior)eVirtualGet(UML2Package.OBJECT_FLOW__TRANSFORMATION);
		if (transformation != null && transformation.eIsProxy()) {
			InternalEObject oldTransformation = (InternalEObject)transformation;
			transformation = (Behavior)eResolveProxy(oldTransformation);
			if (transformation != oldTransformation) {
				eVirtualSet(UML2Package.OBJECT_FLOW__TRANSFORMATION, transformation);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.OBJECT_FLOW__TRANSFORMATION, oldTransformation, transformation));
			}
		}
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Behavior basicGetTransformation() {
		return (Behavior)eVirtualGet(UML2Package.OBJECT_FLOW__TRANSFORMATION);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setTransformation(Behavior newTransformation) {
		Behavior transformation = newTransformation;
		Object oldTransformation = eVirtualSet(UML2Package.OBJECT_FLOW__TRANSFORMATION, transformation);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.OBJECT_FLOW__TRANSFORMATION, oldTransformation == EVIRTUAL_NO_VALUE ? null : oldTransformation, transformation));

	}


	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Behavior getSelection() {
		Behavior selection = (Behavior)eVirtualGet(UML2Package.OBJECT_FLOW__SELECTION);
		if (selection != null && selection.eIsProxy()) {
			InternalEObject oldSelection = (InternalEObject)selection;
			selection = (Behavior)eResolveProxy(oldSelection);
			if (selection != oldSelection) {
				eVirtualSet(UML2Package.OBJECT_FLOW__SELECTION, selection);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.OBJECT_FLOW__SELECTION, oldSelection, selection));
			}
		}
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Behavior basicGetSelection() {
		return (Behavior)eVirtualGet(UML2Package.OBJECT_FLOW__SELECTION);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSelection(Behavior newSelection) {
		Behavior selection = newSelection;
		Object oldSelection = eVirtualSet(UML2Package.OBJECT_FLOW__SELECTION, selection);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.OBJECT_FLOW__SELECTION, oldSelection == EVIRTUAL_NO_VALUE ? null : oldSelection, selection));

	}


	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.OBJECT_FLOW__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.OBJECT_FLOW__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.OBJECT_FLOW__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.OBJECT_FLOW__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.OBJECT_FLOW__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.OBJECT_FLOW__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.OBJECT_FLOW__NAME:
				return getName();
			case UML2Package.OBJECT_FLOW__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.OBJECT_FLOW__VISIBILITY:
				return getVisibility();
			case UML2Package.OBJECT_FLOW__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.OBJECT_FLOW__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.OBJECT_FLOW__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.OBJECT_FLOW__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.OBJECT_FLOW__ACTIVITY:
				return getActivity();
			case UML2Package.OBJECT_FLOW__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case UML2Package.OBJECT_FLOW__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case UML2Package.OBJECT_FLOW__IN_GROUP:
				return getInGroups();
			case UML2Package.OBJECT_FLOW__GUARD:
				return getGuard();
			case UML2Package.OBJECT_FLOW__REDEFINED_ELEMENT:
				return getRedefinedElements();
			case UML2Package.OBJECT_FLOW__IN_STRUCTURED_NODE:
				return getInStructuredNode();
			case UML2Package.OBJECT_FLOW__IN_PARTITION:
				return getInPartitions();
			case UML2Package.OBJECT_FLOW__WEIGHT:
				return getWeight();
			case UML2Package.OBJECT_FLOW__INTERRUPTS:
				if (resolve) return getInterrupts();
				return basicGetInterrupts();
			case UML2Package.OBJECT_FLOW__IS_MULTICAST:
				return isMulticast() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.OBJECT_FLOW__IS_MULTIRECEIVE:
				return isMultireceive() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.OBJECT_FLOW__TRANSFORMATION:
				if (resolve) return getTransformation();
				return basicGetTransformation();
			case UML2Package.OBJECT_FLOW__SELECTION:
				if (resolve) return getSelection();
				return basicGetSelection();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.OBJECT_FLOW__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.OBJECT_FLOW__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.OBJECT_FLOW__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.OBJECT_FLOW__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.OBJECT_FLOW__NAME:
				setName((String)newValue);
				return;
			case UML2Package.OBJECT_FLOW__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.OBJECT_FLOW__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.OBJECT_FLOW__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.OBJECT_FLOW__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.OBJECT_FLOW__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case UML2Package.OBJECT_FLOW__SOURCE:
				setSource((ActivityNode)newValue);
				return;
			case UML2Package.OBJECT_FLOW__TARGET:
				setTarget((ActivityNode)newValue);
				return;
			case UML2Package.OBJECT_FLOW__GUARD:
				setGuard((ValueSpecification)newValue);
				return;
			case UML2Package.OBJECT_FLOW__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				getRedefinedElements().addAll((Collection)newValue);
				return;
			case UML2Package.OBJECT_FLOW__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)newValue);
				return;
			case UML2Package.OBJECT_FLOW__IN_PARTITION:
				getInPartitions().clear();
				getInPartitions().addAll((Collection)newValue);
				return;
			case UML2Package.OBJECT_FLOW__WEIGHT:
				setWeight((ValueSpecification)newValue);
				return;
			case UML2Package.OBJECT_FLOW__INTERRUPTS:
				setInterrupts((InterruptibleActivityRegion)newValue);
				return;
			case UML2Package.OBJECT_FLOW__IS_MULTICAST:
				setIsMulticast(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.OBJECT_FLOW__IS_MULTIRECEIVE:
				setIsMultireceive(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.OBJECT_FLOW__TRANSFORMATION:
				setTransformation((Behavior)newValue);
				return;
			case UML2Package.OBJECT_FLOW__SELECTION:
				setSelection((Behavior)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.OBJECT_FLOW__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.OBJECT_FLOW__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.OBJECT_FLOW__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.OBJECT_FLOW__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.OBJECT_FLOW__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.OBJECT_FLOW__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.OBJECT_FLOW__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.OBJECT_FLOW__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.OBJECT_FLOW__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.OBJECT_FLOW__ACTIVITY:
				setActivity((Activity)null);
				return;
			case UML2Package.OBJECT_FLOW__SOURCE:
				setSource((ActivityNode)null);
				return;
			case UML2Package.OBJECT_FLOW__TARGET:
				setTarget((ActivityNode)null);
				return;
			case UML2Package.OBJECT_FLOW__GUARD:
				setGuard((ValueSpecification)null);
				return;
			case UML2Package.OBJECT_FLOW__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				return;
			case UML2Package.OBJECT_FLOW__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)null);
				return;
			case UML2Package.OBJECT_FLOW__IN_PARTITION:
				getInPartitions().clear();
				return;
			case UML2Package.OBJECT_FLOW__WEIGHT:
				setWeight((ValueSpecification)null);
				return;
			case UML2Package.OBJECT_FLOW__INTERRUPTS:
				setInterrupts((InterruptibleActivityRegion)null);
				return;
			case UML2Package.OBJECT_FLOW__IS_MULTICAST:
				setIsMulticast(IS_MULTICAST_EDEFAULT);
				return;
			case UML2Package.OBJECT_FLOW__IS_MULTIRECEIVE:
				setIsMultireceive(IS_MULTIRECEIVE_EDEFAULT);
				return;
			case UML2Package.OBJECT_FLOW__TRANSFORMATION:
				setTransformation((Behavior)null);
				return;
			case UML2Package.OBJECT_FLOW__SELECTION:
				setSelection((Behavior)null);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.OBJECT_FLOW__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.OBJECT_FLOW__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.OBJECT_FLOW__OWNER:
				return isSetOwner();
			case UML2Package.OBJECT_FLOW__OWNED_COMMENT:
				EList ownedComment = (EList)eVirtualGet(UML2Package.OBJECT_FLOW__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.OBJECT_FLOW__TEMPLATE_BINDING:
				EList templateBinding = (EList)eVirtualGet(UML2Package.OBJECT_FLOW__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.OBJECT_FLOW__OWNED_TEMPLATE_SIGNATURE:
				return eVirtualGet(UML2Package.OBJECT_FLOW__OWNED_TEMPLATE_SIGNATURE) != null;
			case UML2Package.OBJECT_FLOW__NAME:
				String name = (String)eVirtualGet(UML2Package.OBJECT_FLOW__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.OBJECT_FLOW__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.OBJECT_FLOW__VISIBILITY:
				return eVirtualGet(UML2Package.OBJECT_FLOW__VISIBILITY, VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UML2Package.OBJECT_FLOW__CLIENT_DEPENDENCY:
				EList clientDependency = (EList)eVirtualGet(UML2Package.OBJECT_FLOW__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.OBJECT_FLOW__NAME_EXPRESSION:
				return eVirtualGet(UML2Package.OBJECT_FLOW__NAME_EXPRESSION) != null;
			case UML2Package.OBJECT_FLOW__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.OBJECT_FLOW__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.OBJECT_FLOW__ACTIVITY:
				return getActivity() != null;
			case UML2Package.OBJECT_FLOW__SOURCE:
				return eVirtualGet(UML2Package.OBJECT_FLOW__SOURCE) != null;
			case UML2Package.OBJECT_FLOW__TARGET:
				return eVirtualGet(UML2Package.OBJECT_FLOW__TARGET) != null;
			case UML2Package.OBJECT_FLOW__IN_GROUP:
				return isSetInGroups();
			case UML2Package.OBJECT_FLOW__GUARD:
				return eVirtualGet(UML2Package.OBJECT_FLOW__GUARD) != null;
			case UML2Package.OBJECT_FLOW__REDEFINED_ELEMENT:
				return isSetRedefinedElements();
			case UML2Package.OBJECT_FLOW__IN_STRUCTURED_NODE:
				return getInStructuredNode() != null;
			case UML2Package.OBJECT_FLOW__IN_PARTITION:
				EList inPartition = (EList)eVirtualGet(UML2Package.OBJECT_FLOW__IN_PARTITION);
				return inPartition != null && !inPartition.isEmpty();
			case UML2Package.OBJECT_FLOW__WEIGHT:
				return eVirtualGet(UML2Package.OBJECT_FLOW__WEIGHT) != null;
			case UML2Package.OBJECT_FLOW__INTERRUPTS:
				return eVirtualGet(UML2Package.OBJECT_FLOW__INTERRUPTS) != null;
			case UML2Package.OBJECT_FLOW__IS_MULTICAST:
				return ((eFlags & IS_MULTICAST_EFLAG) != 0) != IS_MULTICAST_EDEFAULT;
			case UML2Package.OBJECT_FLOW__IS_MULTIRECEIVE:
				return ((eFlags & IS_MULTIRECEIVE_EFLAG) != 0) != IS_MULTIRECEIVE_EDEFAULT;
			case UML2Package.OBJECT_FLOW__TRANSFORMATION:
				return eVirtualGet(UML2Package.OBJECT_FLOW__TRANSFORMATION) != null;
			case UML2Package.OBJECT_FLOW__SELECTION:
				return eVirtualGet(UML2Package.OBJECT_FLOW__SELECTION) != null;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isMulticast: "); //$NON-NLS-1$
		result.append((eFlags & IS_MULTICAST_EFLAG) != 0);
		result.append(", isMultireceive: "); //$NON-NLS-1$
		result.append((eFlags & IS_MULTIRECEIVE_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}


} //ObjectFlowImpl
