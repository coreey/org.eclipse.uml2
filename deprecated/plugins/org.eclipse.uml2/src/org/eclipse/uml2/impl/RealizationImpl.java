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
 * $Id: RealizationImpl.java,v 1.27 2006/05/26 18:16:44 khussey Exp $
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

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.Component;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.OpaqueExpression;
import org.eclipse.uml2.Realization;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

//import org.eclipse.uml2.common.util.CacheAdapter;
//import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectResolvingEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectWithInverseResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.RealizationImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.RealizationImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.RealizationImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.RealizationImpl#getClients <em>Client</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.RealizationImpl#getSuppliers <em>Supplier</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.RealizationImpl#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.RealizationImpl#getRealizingClassifier <em>Realizing Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RealizationImpl extends AbstractionImpl implements Realization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getRealizingClassifier() <em>Realizing Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingClassifier()
	 * @generated
	 * @ordered
	 */
	protected Classifier realizingClassifier = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getSources() {
		return super.getSources();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSources() {
		return super.isSetSources()
			|| eIsSet(UML2Package.REALIZATION__ABSTRACTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getTargets() {
		return super.getTargets();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargets() {
		return super.isSetTargets()
			|| eIsSet(UML2Package.REALIZATION__REALIZING_CLASSIFIER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getAbstraction() {
		if (eContainerFeatureID != UML2Package.REALIZATION__ABSTRACTION) return null;
		return (Component)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstraction(Component newAbstraction, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAbstraction, UML2Package.REALIZATION__ABSTRACTION, msgs);

		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newAbstraction != null) {
				EList clients = getClients();
				if (!clients.contains(newAbstraction)) {
					clients.add(newAbstraction);
				}
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstraction(Component newAbstraction) {
		if (newAbstraction != eInternalContainer() || (eContainerFeatureID != UML2Package.REALIZATION__ABSTRACTION && newAbstraction != null)) {
			if (EcoreUtil.isAncestor(this, newAbstraction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAbstraction != null)
				msgs = ((InternalEObject)newAbstraction).eInverseAdd(this, UML2Package.COMPONENT__REALIZATION, Component.class, msgs);
			msgs = basicSetAbstraction(newAbstraction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.REALIZATION__ABSTRACTION, newAbstraction, newAbstraction));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getRealizingClassifier() {
		if (realizingClassifier != null && realizingClassifier.eIsProxy()) {
			InternalEObject oldRealizingClassifier = (InternalEObject)realizingClassifier;
			realizingClassifier = (Classifier)eResolveProxy(oldRealizingClassifier);
			if (realizingClassifier != oldRealizingClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.REALIZATION__REALIZING_CLASSIFIER, oldRealizingClassifier, realizingClassifier));
			}
		}
		return realizingClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetRealizingClassifier() {
		return realizingClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizingClassifier(Classifier newRealizingClassifier) {
		Classifier oldRealizingClassifier = realizingClassifier;
		realizingClassifier = newRealizingClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.REALIZATION__REALIZING_CLASSIFIER, oldRealizingClassifier, realizingClassifier));


		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newRealizingClassifier != null) {
				EList suppliers = getSuppliers();
				if (!suppliers.contains(newRealizingClassifier)) {
					suppliers.add(newRealizingClassifier);
				}
			}
		}
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.REALIZATION__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.REALIZATION__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
			case UML2Package.REALIZATION__OWNED_TEMPLATE_SIGNATURE:
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.REALIZATION__OWNED_TEMPLATE_SIGNATURE, null, msgs);
				return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
			case UML2Package.REALIZATION__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
			case UML2Package.REALIZATION__TEMPLATE_PARAMETER:
				if (templateParameter != null)
					msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
			case UML2Package.REALIZATION__OWNING_PARAMETER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningParameter((TemplateParameter)otherEnd, msgs);
			case UML2Package.REALIZATION__CLIENT:
				return ((InternalEList)getClients()).basicAdd(otherEnd, msgs);
			case UML2Package.REALIZATION__ABSTRACTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAbstraction((Component)otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.REALIZATION__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.REALIZATION__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.REALIZATION__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.REALIZATION__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UML2Package.REALIZATION__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
			case UML2Package.REALIZATION__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
			case UML2Package.REALIZATION__TEMPLATE_PARAMETER:
				return basicSetTemplateParameter(null, msgs);
			case UML2Package.REALIZATION__OWNING_PARAMETER:
				return basicSetOwningParameter(null, msgs);
			case UML2Package.REALIZATION__CLIENT:
				return ((InternalEList)getClients()).basicRemove(otherEnd, msgs);
			case UML2Package.REALIZATION__MAPPING:
				return basicSetMapping(null, msgs);
			case UML2Package.REALIZATION__ABSTRACTION:
				return basicSetAbstraction(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case UML2Package.REALIZATION__OWNING_PARAMETER:
				return eInternalContainer().eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			case UML2Package.REALIZATION__ABSTRACTION:
				return eInternalContainer().eInverseRemove(this, UML2Package.COMPONENT__REALIZATION, Component.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		Component abstraction = getAbstraction();			
		if (abstraction != null) {
			return abstraction;
		}
		return super.basicGetOwner();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UML2Package.REALIZATION__ABSTRACTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClients() {
		if (clients == null) {
			clients = new SubsetSupersetEObjectWithInverseResolvingEList.ManyInverse(NamedElement.class, this, UML2Package.REALIZATION__CLIENT, null, CLIENT_ESUBSETS, UML2Package.NAMED_ELEMENT__CLIENT_DEPENDENCY);
		}
		return clients;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSuppliers() {
		if (suppliers == null) {
			suppliers = new SubsetSupersetEObjectResolvingEList(NamedElement.class, this, UML2Package.REALIZATION__SUPPLIER, null, SUPPLIER_ESUBSETS);
		}
		return suppliers;
	}


	/**
	 * The array of subset feature identifiers for the '{@link #getSources() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected static final int[] SOURCE_ESUBSETS = new int[] {UML2Package.REALIZATION__ABSTRACTION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getOwner() {
		Element owner = basicGetOwner();
		return owner != null && owner.eIsProxy() ? (Element)eResolveProxy((InternalEObject)owner) : owner;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getTargets() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected static final int[] TARGET_ESUBSETS = new int[] {UML2Package.REALIZATION__REALIZING_CLASSIFIER};

	/**
	 * The array of subset feature identifiers for the '{@link #getClients() <em>Client</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClients()
	 * @generated
	 * @ordered
	 */
	protected static final int[] CLIENT_ESUBSETS = new int[] {UML2Package.REALIZATION__ABSTRACTION};

	/**
	 * The array of subset feature identifiers for the '{@link #getSuppliers() <em>Supplier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppliers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] SUPPLIER_ESUBSETS = new int[] {UML2Package.REALIZATION__REALIZING_CLASSIFIER};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.REALIZATION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.REALIZATION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.REALIZATION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.REALIZATION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.REALIZATION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.REALIZATION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.REALIZATION__NAME:
				return getName();
			case UML2Package.REALIZATION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.REALIZATION__VISIBILITY:
				return getVisibility();
			case UML2Package.REALIZATION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.REALIZATION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.REALIZATION__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.REALIZATION__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.REALIZATION__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.REALIZATION__RELATED_ELEMENT:
				return getRelatedElements();
			case UML2Package.REALIZATION__SOURCE:
				return getSources();
			case UML2Package.REALIZATION__TARGET:
				return getTargets();
			case UML2Package.REALIZATION__CLIENT:
				return getClients();
			case UML2Package.REALIZATION__SUPPLIER:
				return getSuppliers();
			case UML2Package.REALIZATION__MAPPING:
				return getMapping();
			case UML2Package.REALIZATION__ABSTRACTION:
				return getAbstraction();
			case UML2Package.REALIZATION__REALIZING_CLASSIFIER:
				if (resolve) return getRealizingClassifier();
				return basicGetRealizingClassifier();
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
			case UML2Package.REALIZATION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.REALIZATION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.REALIZATION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.REALIZATION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.REALIZATION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.REALIZATION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.REALIZATION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.REALIZATION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.REALIZATION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.REALIZATION__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.REALIZATION__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.REALIZATION__CLIENT:
				getClients().clear();
				getClients().addAll((Collection)newValue);
				return;
			case UML2Package.REALIZATION__SUPPLIER:
				getSuppliers().clear();
				getSuppliers().addAll((Collection)newValue);
				return;
			case UML2Package.REALIZATION__MAPPING:
				setMapping((OpaqueExpression)newValue);
				return;
			case UML2Package.REALIZATION__ABSTRACTION:
				setAbstraction((Component)newValue);
				return;
			case UML2Package.REALIZATION__REALIZING_CLASSIFIER:
				setRealizingClassifier((Classifier)newValue);
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
			case UML2Package.REALIZATION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.REALIZATION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.REALIZATION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.REALIZATION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.REALIZATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.REALIZATION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.REALIZATION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.REALIZATION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.REALIZATION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.REALIZATION__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.REALIZATION__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.REALIZATION__CLIENT:
				getClients().clear();
				return;
			case UML2Package.REALIZATION__SUPPLIER:
				getSuppliers().clear();
				return;
			case UML2Package.REALIZATION__MAPPING:
				setMapping((OpaqueExpression)null);
				return;
			case UML2Package.REALIZATION__ABSTRACTION:
				setAbstraction((Component)null);
				return;
			case UML2Package.REALIZATION__REALIZING_CLASSIFIER:
				setRealizingClassifier((Classifier)null);
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
			case UML2Package.REALIZATION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.REALIZATION__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.REALIZATION__OWNER:
				return isSetOwner();
			case UML2Package.REALIZATION__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.REALIZATION__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.REALIZATION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.REALIZATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.REALIZATION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.REALIZATION__VISIBILITY:
				return isSetVisibility();
			case UML2Package.REALIZATION__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.REALIZATION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.REALIZATION__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.REALIZATION__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.REALIZATION__PACKAGEABLE_ELEMENT_VISIBILITY:
				return isSetPackageableElement_visibility();
			case UML2Package.REALIZATION__RELATED_ELEMENT:
				return isSetRelatedElements();
			case UML2Package.REALIZATION__SOURCE:
				return isSetSources();
			case UML2Package.REALIZATION__TARGET:
				return isSetTargets();
			case UML2Package.REALIZATION__CLIENT:
				return clients != null && !clients.isEmpty();
			case UML2Package.REALIZATION__SUPPLIER:
				return suppliers != null && !suppliers.isEmpty();
			case UML2Package.REALIZATION__MAPPING:
				return mapping != null;
			case UML2Package.REALIZATION__ABSTRACTION:
				return getAbstraction() != null;
			case UML2Package.REALIZATION__REALIZING_CLASSIFIER:
				return realizingClassifier != null;
		}
		return eDynamicIsSet(featureID);
	}


} //RealizationImpl
