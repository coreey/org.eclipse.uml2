/*
 * Copyright (c) 2005, 2017 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 204200
 *   Kenn Hussey - 286329, 323181, 519572
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;
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
import org.eclipse.uml2.uml.DestroyObjectAction;
import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.DestroyObjectActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Destroy Object Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DestroyObjectActionImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DestroyObjectActionImpl#isDestroyLinks <em>Is Destroy Links</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DestroyObjectActionImpl#isDestroyOwnedObjects <em>Is Destroy Owned Objects</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DestroyObjectActionImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DestroyObjectActionImpl
		extends ActionImpl
		implements DestroyObjectAction {

	/**
	 * The default value of the '{@link #isDestroyLinks() <em>Is Destroy Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDestroyLinks()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DESTROY_LINKS_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isDestroyLinks() <em>Is Destroy Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDestroyLinks()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_DESTROY_LINKS_EFLAG = 1 << 14;

	/**
	 * The default value of the '{@link #isDestroyOwnedObjects() <em>Is Destroy Owned Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDestroyOwnedObjects()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DESTROY_OWNED_OBJECTS_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isDestroyOwnedObjects() <em>Is Destroy Owned Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDestroyOwnedObjects()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_DESTROY_OWNED_OBJECTS_EFLAG = 1 << 15;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected InputPin target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DestroyObjectActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.DESTROY_OBJECT_ACTION;
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
						UMLPackage.DESTROY_OBJECT_ACTION__INPUT,
						INPUT_ESUBSETS));
			}
			return inputs;
		}
		return new DerivedUnionEObjectEList<InputPin>(InputPin.class, this,
			UMLPackage.DESTROY_OBJECT_ACTION__INPUT, INPUT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDestroyLinks() {
		return (eFlags & IS_DESTROY_LINKS_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDestroyLinks(boolean newIsDestroyLinks) {
		boolean oldIsDestroyLinks = (eFlags & IS_DESTROY_LINKS_EFLAG) != 0;
		if (newIsDestroyLinks)
			eFlags |= IS_DESTROY_LINKS_EFLAG;
		else
			eFlags &= ~IS_DESTROY_LINKS_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.DESTROY_OBJECT_ACTION__IS_DESTROY_LINKS,
				oldIsDestroyLinks, newIsDestroyLinks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDestroyOwnedObjects() {
		return (eFlags & IS_DESTROY_OWNED_OBJECTS_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDestroyOwnedObjects(boolean newIsDestroyOwnedObjects) {
		boolean oldIsDestroyOwnedObjects = (eFlags
			& IS_DESTROY_OWNED_OBJECTS_EFLAG) != 0;
		if (newIsDestroyOwnedObjects)
			eFlags |= IS_DESTROY_OWNED_OBJECTS_EFLAG;
		else
			eFlags &= ~IS_DESTROY_OWNED_OBJECTS_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.DESTROY_OBJECT_ACTION__IS_DESTROY_OWNED_OBJECTS,
				oldIsDestroyOwnedObjects, newIsDestroyOwnedObjects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (InputPin) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				InternalEObject newTarget = (InternalEObject) target;
				NotificationChain msgs = oldTarget
					.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.DESTROY_OBJECT_ACTION__TARGET,
						null, null);
				if (newTarget.eInternalContainer() == null) {
					msgs = newTarget.eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.DESTROY_OBJECT_ACTION__TARGET,
						null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.DESTROY_OBJECT_ACTION__TARGET, oldTarget,
						target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(InputPin newTarget,
			NotificationChain msgs) {
		InputPin oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.DESTROY_OBJECT_ACTION__TARGET,
				oldTarget, newTarget);
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
	public void setTarget(InputPin newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject) target)
					.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.DESTROY_OBJECT_ACTION__TARGET,
						null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject) newTarget)
					.eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.DESTROY_OBJECT_ACTION__TARGET,
						null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.DESTROY_OBJECT_ACTION__TARGET, newTarget,
				newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createTarget(String name, Type type, EClass eClass) {
		InputPin newTarget = (InputPin) create(eClass);
		setTarget(newTarget);
		if (name != null)
			newTarget.setName(name);
		if (type != null)
			newTarget.setType(type);
		return newTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createTarget(String name, Type type) {
		return createTarget(name, type, UMLPackage.Literals.INPUT_PIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DestroyObjectActionOperations.validateMultiplicity(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DestroyObjectActionOperations.validateNoType(this, diagnostics,
			context);
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
			case UMLPackage.DESTROY_OBJECT_ACTION__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.DESTROY_OBJECT_ACTION__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.DESTROY_OBJECT_ACTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList<?>) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.DESTROY_OBJECT_ACTION__INCOMING :
				return ((InternalEList<?>) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.DESTROY_OBJECT_ACTION__OUTGOING :
				return ((InternalEList<?>) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_PARTITION :
				return ((InternalEList<?>) getInPartitions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.DESTROY_OBJECT_ACTION__HANDLER :
				return ((InternalEList<?>) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.DESTROY_OBJECT_ACTION__LOCAL_POSTCONDITION :
				return ((InternalEList<?>) getLocalPostconditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.DESTROY_OBJECT_ACTION__LOCAL_PRECONDITION :
				return ((InternalEList<?>) getLocalPreconditions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.DESTROY_OBJECT_ACTION__TARGET :
				return basicSetTarget(null, msgs);
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
			case UMLPackage.DESTROY_OBJECT_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.DESTROY_OBJECT_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.DESTROY_OBJECT_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.DESTROY_OBJECT_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.DESTROY_OBJECT_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.DESTROY_OBJECT_ACTION__NAME :
				return getName();
			case UMLPackage.DESTROY_OBJECT_ACTION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.DESTROY_OBJECT_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.DESTROY_OBJECT_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.DESTROY_OBJECT_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.DESTROY_OBJECT_ACTION__IS_LEAF :
				return isLeaf();
			case UMLPackage.DESTROY_OBJECT_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.DESTROY_OBJECT_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.DESTROY_OBJECT_ACTION__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.DESTROY_OBJECT_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.DESTROY_OBJECT_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.DESTROY_OBJECT_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.DESTROY_OBJECT_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.DESTROY_OBJECT_ACTION__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.DESTROY_OBJECT_ACTION__INPUT :
				return getInputs();
			case UMLPackage.DESTROY_OBJECT_ACTION__IS_LOCALLY_REENTRANT :
				return isLocallyReentrant();
			case UMLPackage.DESTROY_OBJECT_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.DESTROY_OBJECT_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.DESTROY_OBJECT_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.DESTROY_OBJECT_ACTION__IS_DESTROY_LINKS :
				return isDestroyLinks();
			case UMLPackage.DESTROY_OBJECT_ACTION__IS_DESTROY_OWNED_OBJECTS :
				return isDestroyOwnedObjects();
			case UMLPackage.DESTROY_OBJECT_ACTION__TARGET :
				if (resolve)
					return getTarget();
				return basicGetTarget();
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
			case UMLPackage.DESTROY_OBJECT_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll(
					(Collection<? extends InterruptibleActivityRegion>) newValue);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings()
					.addAll((Collection<? extends ActivityEdge>) newValue);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes()
					.addAll((Collection<? extends ActivityNode>) newValue);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions()
					.addAll((Collection<? extends ActivityPartition>) newValue);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers()
					.addAll((Collection<? extends ExceptionHandler>) newValue);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__IS_LOCALLY_REENTRANT :
				setIsLocallyReentrant((Boolean) newValue);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__IS_DESTROY_LINKS :
				setIsDestroyLinks((Boolean) newValue);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__IS_DESTROY_OWNED_OBJECTS :
				setIsDestroyOwnedObjects((Boolean) newValue);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__TARGET :
				setTarget((InputPin) newValue);
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
			case UMLPackage.DESTROY_OBJECT_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__NAME :
				unsetName();
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__IS_LOCALLY_REENTRANT :
				setIsLocallyReentrant(IS_LOCALLY_REENTRANT_EDEFAULT);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__IS_DESTROY_LINKS :
				setIsDestroyLinks(IS_DESTROY_LINKS_EDEFAULT);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__IS_DESTROY_OWNED_OBJECTS :
				setIsDestroyOwnedObjects(IS_DESTROY_OWNED_OBJECTS_EDEFAULT);
				return;
			case UMLPackage.DESTROY_OBJECT_ACTION__TARGET :
				setTarget((InputPin) null);
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
			case UMLPackage.DESTROY_OBJECT_ACTION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.DESTROY_OBJECT_ACTION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.DESTROY_OBJECT_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.DESTROY_OBJECT_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.DESTROY_OBJECT_ACTION__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.DESTROY_OBJECT_ACTION__NAME :
				return isSetName();
			case UMLPackage.DESTROY_OBJECT_ACTION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.DESTROY_OBJECT_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.DESTROY_OBJECT_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.DESTROY_OBJECT_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.DESTROY_OBJECT_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.DESTROY_OBJECT_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.DESTROY_OBJECT_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.DESTROY_OBJECT_ACTION__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION :
				return inInterruptibleRegions != null
					&& !inInterruptibleRegions.isEmpty();
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.DESTROY_OBJECT_ACTION__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.DESTROY_OBJECT_ACTION__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.DESTROY_OBJECT_ACTION__REDEFINED_NODE :
				return redefinedNodes != null && !redefinedNodes.isEmpty();
			case UMLPackage.DESTROY_OBJECT_ACTION__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.DESTROY_OBJECT_ACTION__HANDLER :
				return handlers != null && !handlers.isEmpty();
			case UMLPackage.DESTROY_OBJECT_ACTION__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.DESTROY_OBJECT_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.DESTROY_OBJECT_ACTION__IS_LOCALLY_REENTRANT :
				return ((eFlags
					& IS_LOCALLY_REENTRANT_EFLAG) != 0) != IS_LOCALLY_REENTRANT_EDEFAULT;
			case UMLPackage.DESTROY_OBJECT_ACTION__LOCAL_POSTCONDITION :
				return localPostconditions != null
					&& !localPostconditions.isEmpty();
			case UMLPackage.DESTROY_OBJECT_ACTION__LOCAL_PRECONDITION :
				return localPreconditions != null
					&& !localPreconditions.isEmpty();
			case UMLPackage.DESTROY_OBJECT_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.DESTROY_OBJECT_ACTION__IS_DESTROY_LINKS :
				return ((eFlags
					& IS_DESTROY_LINKS_EFLAG) != 0) != IS_DESTROY_LINKS_EDEFAULT;
			case UMLPackage.DESTROY_OBJECT_ACTION__IS_DESTROY_OWNED_OBJECTS :
				return ((eFlags
					& IS_DESTROY_OWNED_OBJECTS_EFLAG) != 0) != IS_DESTROY_OWNED_OBJECTS_EDEFAULT;
			case UMLPackage.DESTROY_OBJECT_ACTION__TARGET :
				return target != null;
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
			case UMLPackage.DESTROY_OBJECT_ACTION___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.DESTROY_OBJECT_ACTION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DESTROY_OBJECT_ACTION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DESTROY_OBJECT_ACTION___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.DESTROY_OBJECT_ACTION___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.DESTROY_OBJECT_ACTION___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.DESTROY_OBJECT_ACTION___DESTROY :
				destroy();
				return null;
			case UMLPackage.DESTROY_OBJECT_ACTION___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.DESTROY_OBJECT_ACTION___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.DESTROY_OBJECT_ACTION___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.DESTROY_OBJECT_ACTION___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.DESTROY_OBJECT_ACTION___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.DESTROY_OBJECT_ACTION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.DESTROY_OBJECT_ACTION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.DESTROY_OBJECT_ACTION___GET_MODEL :
				return getModel();
			case UMLPackage.DESTROY_OBJECT_ACTION___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.DESTROY_OBJECT_ACTION___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.DESTROY_OBJECT_ACTION___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.DESTROY_OBJECT_ACTION___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.DESTROY_OBJECT_ACTION___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.DESTROY_OBJECT_ACTION___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.DESTROY_OBJECT_ACTION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.DESTROY_OBJECT_ACTION___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.DESTROY_OBJECT_ACTION___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.DESTROY_OBJECT_ACTION___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.DESTROY_OBJECT_ACTION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.DESTROY_OBJECT_ACTION___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.DESTROY_OBJECT_ACTION___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.DESTROY_OBJECT_ACTION___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.DESTROY_OBJECT_ACTION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.DESTROY_OBJECT_ACTION___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.DESTROY_OBJECT_ACTION___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.DESTROY_OBJECT_ACTION___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.DESTROY_OBJECT_ACTION___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.DESTROY_OBJECT_ACTION___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.DESTROY_OBJECT_ACTION___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.DESTROY_OBJECT_ACTION___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.DESTROY_OBJECT_ACTION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DESTROY_OBJECT_ACTION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DESTROY_OBJECT_ACTION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DESTROY_OBJECT_ACTION___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.DESTROY_OBJECT_ACTION___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.DESTROY_OBJECT_ACTION___GET_LABEL :
				return getLabel();
			case UMLPackage.DESTROY_OBJECT_ACTION___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.DESTROY_OBJECT_ACTION___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.DESTROY_OBJECT_ACTION___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.DESTROY_OBJECT_ACTION___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.DESTROY_OBJECT_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.DESTROY_OBJECT_ACTION___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.DESTROY_OBJECT_ACTION___SEPARATOR :
				return separator();
			case UMLPackage.DESTROY_OBJECT_ACTION___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.DESTROY_OBJECT_ACTION___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DESTROY_OBJECT_ACTION___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DESTROY_OBJECT_ACTION___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DESTROY_OBJECT_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.DESTROY_OBJECT_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.DESTROY_OBJECT_ACTION___CONTAINING_ACTIVITY :
				return containingActivity();
			case UMLPackage.DESTROY_OBJECT_ACTION___GET_CONTEXT :
				return getContext();
			case UMLPackage.DESTROY_OBJECT_ACTION___ALL_ACTIONS :
				return allActions();
			case UMLPackage.DESTROY_OBJECT_ACTION___ALL_OWNED_NODES :
				return allOwnedNodes();
			case UMLPackage.DESTROY_OBJECT_ACTION___CONTAINING_BEHAVIOR :
				return containingBehavior();
			case UMLPackage.DESTROY_OBJECT_ACTION___VALIDATE_MULTIPLICITY__DIAGNOSTICCHAIN_MAP :
				return validateMultiplicity((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.DESTROY_OBJECT_ACTION___VALIDATE_NO_TYPE__DIAGNOSTICCHAIN_MAP :
				return validateNoType((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isDestroyLinks: "); //$NON-NLS-1$
		result.append((eFlags & IS_DESTROY_LINKS_EFLAG) != 0);
		result.append(", isDestroyOwnedObjects: "); //$NON-NLS-1$
		result.append((eFlags & IS_DESTROY_OWNED_OBJECTS_EFLAG) != 0);
		result.append(')');
		return result.toString();
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
		UMLPackage.DESTROY_OBJECT_ACTION__TARGET};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetInputs() {
		return super.isSetInputs()
			|| eIsSet(UMLPackage.DESTROY_OBJECT_ACTION__TARGET);
	}

} //DestroyObjectActionImpl
