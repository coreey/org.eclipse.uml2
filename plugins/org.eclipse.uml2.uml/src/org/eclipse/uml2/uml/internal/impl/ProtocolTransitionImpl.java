/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ProtocolTransitionImpl.java,v 1.14 2005/12/21 20:13:08 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.CallEvent;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Event;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.ProtocolTransition;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.TransitionKind;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Vertex;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.impl.StructuredClassifierImpl.PartEList;
import org.eclipse.uml2.uml.internal.operations.ProtocolTransitionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProtocolTransitionImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProtocolTransitionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProtocolTransitionImpl#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProtocolTransitionImpl#getReferreds <em>Referred</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ProtocolTransitionImpl#getPreCondition <em>Pre Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtocolTransitionImpl
		extends TransitionImpl
		implements ProtocolTransition {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.PROTOCOL_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList) eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.PROTOCOL_TRANSITION__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.PROTOCOL_TRANSITION__OWNED_ELEMENT,
					new int[]{UMLPackage.PROTOCOL_TRANSITION__OWNED_COMMENT,
						UMLPackage.PROTOCOL_TRANSITION__NAME_EXPRESSION,
						UMLPackage.PROTOCOL_TRANSITION__ELEMENT_IMPORT,
						UMLPackage.PROTOCOL_TRANSITION__PACKAGE_IMPORT,
						UMLPackage.PROTOCOL_TRANSITION__OWNED_MEMBER,
						UMLPackage.PROTOCOL_TRANSITION__EFFECT,
						UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getGuard() {
		return (Constraint) eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__GUARD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(Constraint newGuard) {
		if (newGuard != null && !getOwnedRules().contains(newGuard)) {
			getOwnedRules().add(newGuard);
		}
		Constraint guard = newGuard;
		Object oldGuard = eVirtualSet(UMLPackage.PROTOCOL_TRANSITION__GUARD,
			guard);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PROTOCOL_TRANSITION__GUARD,
				oldGuard == EVIRTUAL_NO_VALUE
					? null
					: oldGuard, guard));

		if (eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__PRE_CONDITION) != null
			&& eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__PRE_CONDITION) != newGuard) {
			setPreCondition(null);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getPostCondition() {
		return (Constraint) eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostCondition(Constraint newPostCondition,
			NotificationChain msgs) {
		Object oldPostCondition = eVirtualSet(
			UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION, newPostCondition);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION,
				oldPostCondition == EVIRTUAL_NO_VALUE
					? null
					: oldPostCondition, newPostCondition);
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
	public void setPostCondition(Constraint newPostCondition) {
		Constraint postCondition = (Constraint) eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION);
		if (newPostCondition != postCondition) {
			NotificationChain msgs = null;
			if (postCondition != null)
				msgs = ((InternalEObject) postCondition).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION, null,
					msgs);
			if (newPostCondition != null)
				msgs = ((InternalEObject) newPostCondition).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION, null,
					msgs);
			msgs = basicSetPostCondition(newPostCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION,
				newPostCondition, newPostCondition));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createPostCondition(EClass eClass) {
		Constraint newPostCondition = (Constraint) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		setPostCondition(newPostCondition);
		return newPostCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createPostCondition() {
		Constraint newPostCondition = UMLFactory.eINSTANCE.createConstraint();
		setPostCondition(newPostCondition);
		return newPostCondition;
	}

	protected static class ReferredEList
			extends DerivedEObjectEList {

		protected class ReferredListIterator
				extends DerivedListIterator {

			public Object next() {
				return ((CallEvent) ((Trigger) super.next()).getEvent())
					.getOperation();
			}

			public Object previous() {
				return ((CallEvent) ((Trigger) super.previous()).getEvent())
					.getOperation();
			}

		}

		protected class ResolvingReferredListIterator
				extends ReferredListIterator {

			protected boolean resolve() {
				return true;
			}

		}

		protected ReferredEList(Class dataClass, InternalEObject owner,
				int featureID, int[] sourceFeatureIDs) {
			super(dataClass, owner, featureID, sourceFeatureIDs);
		}

		public List basicList() {
			return new ReferredEList(dataClass, owner, featureID,
				sourceFeatureIDs) {

				public ListIterator listIterator(int index) {
					return basicListIterator(index);
				}
			};
		}

		protected ListIterator newListIterator() {
			return new ReferredListIterator();
		}

		protected ListIterator newResolvingListIterator() {
			return new ResolvingReferredListIterator();
		}

		protected boolean isIncluded(Object object) {
			Event event = ((Trigger) object).getEvent();
			return event instanceof CallEvent
				&& super.isIncluded(((CallEvent) event).getOperation());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getReferreds() {
		EList referred = (EList) eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__REFERRED);
		if (referred == null) {
			eVirtualSet(UMLPackage.PROTOCOL_TRANSITION__REFERRED,
				referred = new PartEList(Operation.class, this,
					UMLPackage.PROTOCOL_TRANSITION__REFERRED,
					new int[]{UMLPackage.PROTOCOL_TRANSITION__TRIGGER}));
		}
		return referred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getReferred(String name) {
		for (Iterator i = getReferreds().iterator(); i.hasNext();) {
			Operation referred = (Operation) i.next();
			if (name.equals(referred.getName())) {
				return referred;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getPreCondition() {
		return (Constraint) eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__PRE_CONDITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreCondition(Constraint newPreCondition,
			NotificationChain msgs) {
		Object oldPreCondition = eVirtualSet(
			UMLPackage.PROTOCOL_TRANSITION__PRE_CONDITION, newPreCondition);
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				UMLPackage.PROTOCOL_TRANSITION__PRE_CONDITION,
				oldPreCondition == EVIRTUAL_NO_VALUE
					? null
					: oldPreCondition, newPreCondition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		if (newPreCondition != null
			|| oldPreCondition == eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__GUARD)) {
			setGuard(newPreCondition);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreCondition(Constraint newPreCondition) {
		Constraint preCondition = (Constraint) eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__PRE_CONDITION);
		if (newPreCondition != preCondition) {
			NotificationChain msgs = null;
			if (preCondition != null)
				msgs = ((InternalEObject) preCondition).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.PROTOCOL_TRANSITION__PRE_CONDITION, null,
					msgs);
			if (newPreCondition != null)
				msgs = ((InternalEObject) newPreCondition).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.PROTOCOL_TRANSITION__PRE_CONDITION, null,
					msgs);
			msgs = basicSetPreCondition(newPreCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PROTOCOL_TRANSITION__PRE_CONDITION, newPreCondition,
				newPreCondition));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createPreCondition(EClass eClass) {
		Constraint newPreCondition = (Constraint) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		setPreCondition(newPreCondition);
		return newPreCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createPreCondition() {
		Constraint newPreCondition = UMLFactory.eINSTANCE.createConstraint();
		setPreCondition(newPreCondition);
		return newPreCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBelongsToPsm(DiagnosticChain diagnostics, Map context) {
		return ProtocolTransitionOperations.validateBelongsToPsm(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociatedActions(DiagnosticChain diagnostics,
			Map context) {
		return ProtocolTransitionOperations.validateAssociatedActions(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefersToOperation(DiagnosticChain diagnostics,
			Map context) {
		return ProtocolTransitionOperations.validateRefersToOperation(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.PROTOCOL_TRANSITION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.PROTOCOL_TRANSITION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.PROTOCOL_TRANSITION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.PROTOCOL_TRANSITION__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.PROTOCOL_TRANSITION__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.PROTOCOL_TRANSITION__CONTAINER :
				return eBasicSetContainer(null,
					UMLPackage.PROTOCOL_TRANSITION__CONTAINER, msgs);
			case UMLPackage.PROTOCOL_TRANSITION__TARGET :
				return basicSetTarget(null, msgs);
			case UMLPackage.PROTOCOL_TRANSITION__EFFECT :
				return basicSetEffect(null, msgs);
			case UMLPackage.PROTOCOL_TRANSITION__TRIGGER :
				return ((InternalEList) getTriggers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.PROTOCOL_TRANSITION__SOURCE :
				return basicSetSource(null, msgs);
			case UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION :
				return basicSetPostCondition(null, msgs);
			case UMLPackage.PROTOCOL_TRANSITION__PRE_CONDITION :
				return basicSetPreCondition(null, msgs);
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
			case UMLPackage.PROTOCOL_TRANSITION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.PROTOCOL_TRANSITION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.PROTOCOL_TRANSITION__NAME :
				return getName();
			case UMLPackage.PROTOCOL_TRANSITION__VISIBILITY :
				return getVisibility();
			case UMLPackage.PROTOCOL_TRANSITION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.PROTOCOL_TRANSITION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.PROTOCOL_TRANSITION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.PROTOCOL_TRANSITION__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.PROTOCOL_TRANSITION__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.PROTOCOL_TRANSITION__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.PROTOCOL_TRANSITION__MEMBER :
				return getMembers();
			case UMLPackage.PROTOCOL_TRANSITION__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.PROTOCOL_TRANSITION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.PROTOCOL_TRANSITION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.PROTOCOL_TRANSITION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.PROTOCOL_TRANSITION__KIND :
				return getKind();
			case UMLPackage.PROTOCOL_TRANSITION__CONTAINER :
				return getContainer();
			case UMLPackage.PROTOCOL_TRANSITION__TARGET :
				if (resolve)
					return getTarget();
				return basicGetTarget();
			case UMLPackage.PROTOCOL_TRANSITION__REDEFINED_TRANSITION :
				if (resolve)
					return getRedefinedTransition();
				return basicGetRedefinedTransition();
			case UMLPackage.PROTOCOL_TRANSITION__GUARD :
				return getGuard();
			case UMLPackage.PROTOCOL_TRANSITION__EFFECT :
				return getEffect();
			case UMLPackage.PROTOCOL_TRANSITION__TRIGGER :
				return getTriggers();
			case UMLPackage.PROTOCOL_TRANSITION__SOURCE :
				if (resolve)
					return getSource();
				return basicGetSource();
			case UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION :
				return getPostCondition();
			case UMLPackage.PROTOCOL_TRANSITION__REFERRED :
				return getReferreds();
			case UMLPackage.PROTOCOL_TRANSITION__PRE_CONDITION :
				return getPreCondition();
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
			case UMLPackage.PROTOCOL_TRANSITION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.PROTOCOL_TRANSITION__KIND :
				setKind((TransitionKind) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__CONTAINER :
				setContainer((Region) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__TARGET :
				setTarget((Vertex) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__REDEFINED_TRANSITION :
				setRedefinedTransition((Transition) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__GUARD :
				setGuard((Constraint) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__EFFECT :
				setEffect((Behavior) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__TRIGGER :
				getTriggers().clear();
				getTriggers().addAll((Collection) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__SOURCE :
				setSource((Vertex) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION :
				setPostCondition((Constraint) newValue);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__PRE_CONDITION :
				setPreCondition((Constraint) newValue);
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
			case UMLPackage.PROTOCOL_TRANSITION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.PROTOCOL_TRANSITION__NAME :
				unsetName();
				return;
			case UMLPackage.PROTOCOL_TRANSITION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.PROTOCOL_TRANSITION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.PROTOCOL_TRANSITION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.PROTOCOL_TRANSITION__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.PROTOCOL_TRANSITION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__KIND :
				setKind(KIND_EDEFAULT);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__CONTAINER :
				setContainer((Region) null);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__TARGET :
				setTarget((Vertex) null);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__REDEFINED_TRANSITION :
				setRedefinedTransition((Transition) null);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__GUARD :
				setGuard((Constraint) null);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__EFFECT :
				setEffect((Behavior) null);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__TRIGGER :
				getTriggers().clear();
				return;
			case UMLPackage.PROTOCOL_TRANSITION__SOURCE :
				setSource((Vertex) null);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION :
				setPostCondition((Constraint) null);
				return;
			case UMLPackage.PROTOCOL_TRANSITION__PRE_CONDITION :
				setPreCondition((Constraint) null);
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
			case UMLPackage.PROTOCOL_TRANSITION__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.PROTOCOL_TRANSITION__OWNER :
				return isSetOwner();
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.PROTOCOL_TRANSITION__NAME :
				return isSetName();
			case UMLPackage.PROTOCOL_TRANSITION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.PROTOCOL_TRANSITION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.PROTOCOL_TRANSITION__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.PROTOCOL_TRANSITION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.PROTOCOL_TRANSITION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__NAME_EXPRESSION) != null;
			case UMLPackage.PROTOCOL_TRANSITION__ELEMENT_IMPORT :
				EList elementImport = (EList) eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.PROTOCOL_TRANSITION__PACKAGE_IMPORT :
				EList packageImport = (EList) eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_RULE :
				EList ownedRule = (EList) eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.PROTOCOL_TRANSITION__MEMBER :
				return isSetMembers();
			case UMLPackage.PROTOCOL_TRANSITION__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.PROTOCOL_TRANSITION__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.PROTOCOL_TRANSITION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.PROTOCOL_TRANSITION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.PROTOCOL_TRANSITION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.PROTOCOL_TRANSITION__KIND :
				return eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__KIND,
					KIND_EDEFAULT) != KIND_EDEFAULT;
			case UMLPackage.PROTOCOL_TRANSITION__CONTAINER :
				return getContainer() != null;
			case UMLPackage.PROTOCOL_TRANSITION__TARGET :
				return eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__TARGET) != null;
			case UMLPackage.PROTOCOL_TRANSITION__REDEFINED_TRANSITION :
				return eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__REDEFINED_TRANSITION) != null;
			case UMLPackage.PROTOCOL_TRANSITION__GUARD :
				return eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__GUARD) != null;
			case UMLPackage.PROTOCOL_TRANSITION__EFFECT :
				return eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__EFFECT) != null;
			case UMLPackage.PROTOCOL_TRANSITION__TRIGGER :
				EList trigger = (EList) eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__TRIGGER);
				return trigger != null && !trigger.isEmpty();
			case UMLPackage.PROTOCOL_TRANSITION__SOURCE :
				return eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__SOURCE) != null;
			case UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION :
				return eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION) != null;
			case UMLPackage.PROTOCOL_TRANSITION__REFERRED :
				return !getReferreds().isEmpty();
			case UMLPackage.PROTOCOL_TRANSITION__PRE_CONDITION :
				return eVirtualGet(UMLPackage.PROTOCOL_TRANSITION__PRE_CONDITION) != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.PROTOCOL_TRANSITION__POST_CONDITION);
	}

} //ProtocolTransitionImpl
