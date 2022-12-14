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
 * $Id: PackageImportImpl.java,v 1.26 2006/05/26 18:16:44 khussey Exp $
 */
package org.eclipse.uml2.impl;

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

import org.eclipse.uml2.Element;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.PackageImport;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.internal.operation.PackageImportOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.PackageImportImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PackageImportImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PackageImportImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PackageImportImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PackageImportImpl#getImportedPackage <em>Imported Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.PackageImportImpl#getImportingNamespace <em>Importing Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImportImpl extends DirectedRelationshipImpl implements PackageImport {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.PUBLIC_LITERAL;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityKind visibility = VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImportedPackage() <em>Imported Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedPackage()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.Package importedPackage = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.PACKAGE_IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTargets() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList targets = (EList) cache.get(eResource, this, UML2Package.Literals.DIRECTED_RELATIONSHIP__TARGET);
			if (targets == null) {
				cache.put(eResource, this, UML2Package.Literals.DIRECTED_RELATIONSHIP__TARGET, targets = new DerivedUnionEObjectEList(Element.class, this, UML2Package.PACKAGE_IMPORT__TARGET, TARGET_ESUBSETS));
			}
			return targets;
		}
		return new DerivedUnionEObjectEList(Element.class, this, UML2Package.PACKAGE_IMPORT__TARGET, TARGET_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargets() {
		return super.isSetTargets()
			|| eIsSet(UML2Package.PACKAGE_IMPORT__IMPORTED_PACKAGE);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getTargets() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected static final int[] TARGET_ESUBSETS = new int[] {UML2Package.PACKAGE_IMPORT__IMPORTED_PACKAGE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSources() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList sources = (EList) cache.get(eResource, this, UML2Package.Literals.DIRECTED_RELATIONSHIP__SOURCE);
			if (sources == null) {
				cache.put(eResource, this, UML2Package.Literals.DIRECTED_RELATIONSHIP__SOURCE, sources = new DerivedUnionEObjectEList(Element.class, this, UML2Package.PACKAGE_IMPORT__SOURCE, SOURCE_ESUBSETS));
			}
			return sources;
		}
		return new DerivedUnionEObjectEList(Element.class, this, UML2Package.PACKAGE_IMPORT__SOURCE, SOURCE_ESUBSETS);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSources() {
		return super.isSetSources()
			|| eIsSet(UML2Package.PACKAGE_IMPORT__IMPORTING_NAMESPACE);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getSources() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected static final int[] SOURCE_ESUBSETS = new int[] {UML2Package.PACKAGE_IMPORT__IMPORTING_NAMESPACE};

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityKind newVisibility) {
		VisibilityKind oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PACKAGE_IMPORT__VISIBILITY, oldVisibility, visibility));


	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.Package getImportedPackage() {
		if (importedPackage != null && importedPackage.eIsProxy()) {
			InternalEObject oldImportedPackage = (InternalEObject)importedPackage;
			importedPackage = (org.eclipse.uml2.Package)eResolveProxy(oldImportedPackage);
			if (importedPackage != oldImportedPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.PACKAGE_IMPORT__IMPORTED_PACKAGE, oldImportedPackage, importedPackage));
			}
		}
		return importedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.Package basicGetImportedPackage() {
		return importedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedPackage(org.eclipse.uml2.Package newImportedPackage) {
		org.eclipse.uml2.Package oldImportedPackage = importedPackage;
		importedPackage = newImportedPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PACKAGE_IMPORT__IMPORTED_PACKAGE, oldImportedPackage, importedPackage));


	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getImportingNamespace() {
		if (eContainerFeatureID != UML2Package.PACKAGE_IMPORT__IMPORTING_NAMESPACE) return null;
		return (Namespace)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportingNamespace(Namespace newImportingNamespace, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newImportingNamespace, UML2Package.PACKAGE_IMPORT__IMPORTING_NAMESPACE, msgs);

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportingNamespace(Namespace newImportingNamespace) {
		if (newImportingNamespace != eInternalContainer() || (eContainerFeatureID != UML2Package.PACKAGE_IMPORT__IMPORTING_NAMESPACE && newImportingNamespace != null)) {
			if (EcoreUtil.isAncestor(this, newImportingNamespace))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newImportingNamespace != null)
				msgs = ((InternalEObject)newImportingNamespace).eInverseAdd(this, UML2Package.NAMESPACE__PACKAGE_IMPORT, Namespace.class, msgs);
			msgs = basicSetImportingNamespace(newImportingNamespace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.PACKAGE_IMPORT__IMPORTING_NAMESPACE, newImportingNamespace, newImportingNamespace));

	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublicOrPrivate(DiagnosticChain diagnostics, Map context) {
		return PackageImportOperations.validatePublicOrPrivate(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.PACKAGE_IMPORT__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.PACKAGE_IMPORT__IMPORTING_NAMESPACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetImportingNamespace((Namespace)otherEnd, msgs);
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
			case UML2Package.PACKAGE_IMPORT__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.PACKAGE_IMPORT__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.PACKAGE_IMPORT__IMPORTING_NAMESPACE:
				return basicSetImportingNamespace(null, msgs);
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
			case UML2Package.PACKAGE_IMPORT__IMPORTING_NAMESPACE:
				return eInternalContainer().eInverseRemove(this, UML2Package.NAMESPACE__PACKAGE_IMPORT, Namespace.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		Namespace importingNamespace = getImportingNamespace();			
		if (importingNamespace != null) {
			return importingNamespace;
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
			|| eIsSet(UML2Package.PACKAGE_IMPORT__IMPORTING_NAMESPACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.PACKAGE_IMPORT__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.PACKAGE_IMPORT__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.PACKAGE_IMPORT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.PACKAGE_IMPORT__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.PACKAGE_IMPORT__RELATED_ELEMENT:
				return getRelatedElements();
			case UML2Package.PACKAGE_IMPORT__SOURCE:
				return getSources();
			case UML2Package.PACKAGE_IMPORT__TARGET:
				return getTargets();
			case UML2Package.PACKAGE_IMPORT__VISIBILITY:
				return getVisibility();
			case UML2Package.PACKAGE_IMPORT__IMPORTED_PACKAGE:
				if (resolve) return getImportedPackage();
				return basicGetImportedPackage();
			case UML2Package.PACKAGE_IMPORT__IMPORTING_NAMESPACE:
				return getImportingNamespace();
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
			case UML2Package.PACKAGE_IMPORT__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.PACKAGE_IMPORT__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.PACKAGE_IMPORT__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.PACKAGE_IMPORT__IMPORTED_PACKAGE:
				setImportedPackage((org.eclipse.uml2.Package)newValue);
				return;
			case UML2Package.PACKAGE_IMPORT__IMPORTING_NAMESPACE:
				setImportingNamespace((Namespace)newValue);
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
			case UML2Package.PACKAGE_IMPORT__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.PACKAGE_IMPORT__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.PACKAGE_IMPORT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.PACKAGE_IMPORT__IMPORTED_PACKAGE:
				setImportedPackage((org.eclipse.uml2.Package)null);
				return;
			case UML2Package.PACKAGE_IMPORT__IMPORTING_NAMESPACE:
				setImportingNamespace((Namespace)null);
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
			case UML2Package.PACKAGE_IMPORT__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.PACKAGE_IMPORT__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.PACKAGE_IMPORT__OWNER:
				return isSetOwner();
			case UML2Package.PACKAGE_IMPORT__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.PACKAGE_IMPORT__RELATED_ELEMENT:
				return isSetRelatedElements();
			case UML2Package.PACKAGE_IMPORT__SOURCE:
				return isSetSources();
			case UML2Package.PACKAGE_IMPORT__TARGET:
				return isSetTargets();
			case UML2Package.PACKAGE_IMPORT__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.PACKAGE_IMPORT__IMPORTED_PACKAGE:
				return importedPackage != null;
			case UML2Package.PACKAGE_IMPORT__IMPORTING_NAMESPACE:
				return getImportingNamespace() != null;
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
		result.append(" (visibility: "); //$NON-NLS-1$
		result.append(visibility);
		result.append(')');
		return result.toString();
	}


} //PackageImportImpl
