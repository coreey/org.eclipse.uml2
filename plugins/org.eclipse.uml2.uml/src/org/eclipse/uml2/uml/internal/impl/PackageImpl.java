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
 * $Id: PackageImpl.java,v 1.30.2.1 2006/11/17 15:27:16 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedSubsetEObjectEList;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageMerge;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.PackageOperations;
import org.eclipse.uml2.uml.internal.operations.ParameterableElementOperations;
import org.eclipse.uml2.uml.internal.operations.TemplateableElementOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getTemplateBindings <em>Template Binding</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getPackagedElements <em>Packaged Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getOwnedTypes <em>Owned Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getPackageMerges <em>Package Merge</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getNestedPackages <em>Nested Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getNestingPackage <em>Nesting Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getProfileApplications <em>Profile Application</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl
		extends NamespaceImpl
		implements org.eclipse.uml2.uml.Package {

	/**
	 * The cached value of the '{@link #getTemplateParameter() <em>Template Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateParameter()
	 * @generated
	 * @ordered
	 */
	protected TemplateParameter templateParameter = null;

	/**
	 * The cached value of the '{@link #getTemplateBindings() <em>Template Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateBindings()
	 * @generated
	 * @ordered
	 */
	protected EList templateBindings = null;

	/**
	 * The cached value of the '{@link #getOwnedTemplateSignature() <em>Owned Template Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTemplateSignature()
	 * @generated
	 * @ordered
	 */
	protected TemplateSignature ownedTemplateSignature = null;

	/**
	 * The cached value of the '{@link #getPackagedElements() <em>Packaged Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagedElements()
	 * @generated
	 * @ordered
	 */
	protected EList packagedElements = null;

	/**
	 * The cached value of the '{@link #getPackageMerges() <em>Package Merge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageMerges()
	 * @generated
	 * @ordered
	 */
	protected EList packageMerges = null;

	/**
	 * The cached value of the '{@link #getProfileApplications() <em>Profile Application</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileApplications()
	 * @generated
	 * @ordered
	 */
	protected EList profileApplications = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getOwner() {
		Element owner = basicGetOwner();
		return owner != null && owner.eIsProxy()
			? (Element) eResolveProxy((InternalEObject) owner)
			: owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getTemplateParameter() {
		if (templateParameter != null && templateParameter.eIsProxy()) {
			InternalEObject oldTemplateParameter = (InternalEObject) templateParameter;
			templateParameter = (TemplateParameter) eResolveProxy(oldTemplateParameter);
			if (templateParameter != oldTemplateParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.PACKAGE__TEMPLATE_PARAMETER,
						oldTemplateParameter, templateParameter));
			}
		}
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter basicGetTemplateParameter() {
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateParameter(
			TemplateParameter newTemplateParameter, NotificationChain msgs) {
		TemplateParameter oldTemplateParameter = templateParameter;
		templateParameter = newTemplateParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.PACKAGE__TEMPLATE_PARAMETER,
				oldTemplateParameter, newTemplateParameter);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			TemplateParameter owningTemplateParameter = basicGetOwningTemplateParameter();
			if (owningTemplateParameter != null
				&& owningTemplateParameter != newTemplateParameter) {
				setOwningTemplateParameter(null);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateParameter(TemplateParameter newTemplateParameter) {
		if (newTemplateParameter != templateParameter) {
			NotificationChain msgs = null;
			if (templateParameter != null)
				msgs = ((InternalEObject) templateParameter).eInverseRemove(
					this, UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
					TemplateParameter.class, msgs);
			if (newTemplateParameter != null)
				msgs = ((InternalEObject) newTemplateParameter).eInverseAdd(
					this, UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
					TemplateParameter.class, msgs);
			msgs = basicSetTemplateParameter(newTemplateParameter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PACKAGE__TEMPLATE_PARAMETER, newTemplateParameter,
				newTemplateParameter));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getOwningTemplateParameter() {
		if (eContainerFeatureID != UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER)
			return null;
		return (TemplateParameter) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter basicGetOwningTemplateParameter() {
		if (eContainerFeatureID != UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER)
			return null;
		return (TemplateParameter) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningTemplateParameter(
			TemplateParameter newOwningTemplateParameter, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newOwningTemplateParameter,
			UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER, msgs);

		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newOwningTemplateParameter != null) {
				if (newOwningTemplateParameter != templateParameter) {
					setTemplateParameter(newOwningTemplateParameter);
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
	public void setOwningTemplateParameter(
			TemplateParameter newOwningTemplateParameter) {
		if (newOwningTemplateParameter != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER && newOwningTemplateParameter != null)) {
			if (EcoreUtil.isAncestor(this, newOwningTemplateParameter))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningTemplateParameter != null)
				msgs = ((InternalEObject) newOwningTemplateParameter)
					.eInverseAdd(
						this,
						UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
						TemplateParameter.class, msgs);
			msgs = basicSetOwningTemplateParameter(newOwningTemplateParameter,
				msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER,
				newOwningTemplateParameter, newOwningTemplateParameter));

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
		visibility = newVisibility == null
			? VISIBILITY_EDEFAULT
			: newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PACKAGE__VISIBILITY, oldVisibility, visibility));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisibility() {
		return visibility != VISIBILITY_EDEFAULT;
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
						this, UMLPackage.PACKAGE__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList(Element.class, this,
			UMLPackage.PACKAGE__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTemplateBindings() {
		if (templateBindings == null) {
			templateBindings = new EObjectContainmentWithInverseEList.Resolving(
				TemplateBinding.class, this,
				UMLPackage.PACKAGE__TEMPLATE_BINDING,
				UMLPackage.TEMPLATE_BINDING__BOUND_ELEMENT);
		}
		return templateBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBinding createTemplateBinding(TemplateSignature signature) {
		TemplateBinding newTemplateBinding = (TemplateBinding) create(UMLPackage.Literals.TEMPLATE_BINDING);
		getTemplateBindings().add(newTemplateBinding);
		if (signature != null)
			newTemplateBinding.setSignature(signature);
		return newTemplateBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBinding getTemplateBinding(TemplateSignature signature) {
		return getTemplateBinding(signature, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBinding getTemplateBinding(TemplateSignature signature,
			boolean createOnDemand) {
		templateBindingLoop : for (Iterator i = getTemplateBindings()
			.iterator(); i.hasNext();) {
			TemplateBinding templateBinding = (TemplateBinding) i.next();
			if (signature != null
				&& !signature.equals(templateBinding.getSignature()))
				continue templateBindingLoop;
			return templateBinding;
		}
		return createOnDemand
			? createTemplateBinding(signature)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature getOwnedTemplateSignature() {
		if (ownedTemplateSignature != null && ownedTemplateSignature.eIsProxy()) {
			InternalEObject oldOwnedTemplateSignature = (InternalEObject) ownedTemplateSignature;
			ownedTemplateSignature = (TemplateSignature) eResolveProxy(oldOwnedTemplateSignature);
			if (ownedTemplateSignature != oldOwnedTemplateSignature) {
				InternalEObject newOwnedTemplateSignature = (InternalEObject) ownedTemplateSignature;
				NotificationChain msgs = oldOwnedTemplateSignature
					.eInverseRemove(this,
						UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE,
						TemplateSignature.class, null);
				if (newOwnedTemplateSignature.eInternalContainer() == null) {
					msgs = newOwnedTemplateSignature.eInverseAdd(this,
						UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE,
						TemplateSignature.class, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE,
						oldOwnedTemplateSignature, ownedTemplateSignature));
			}
		}
		return ownedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature basicGetOwnedTemplateSignature() {
		return ownedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedTemplateSignature(
			TemplateSignature newOwnedTemplateSignature, NotificationChain msgs) {
		TemplateSignature oldOwnedTemplateSignature = ownedTemplateSignature;
		ownedTemplateSignature = newOwnedTemplateSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE,
				oldOwnedTemplateSignature, newOwnedTemplateSignature);
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
	public void setOwnedTemplateSignature(
			TemplateSignature newOwnedTemplateSignature) {
		if (newOwnedTemplateSignature != ownedTemplateSignature) {
			NotificationChain msgs = null;
			if (ownedTemplateSignature != null)
				msgs = ((InternalEObject) ownedTemplateSignature)
					.eInverseRemove(this,
						UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE,
						TemplateSignature.class, msgs);
			if (newOwnedTemplateSignature != null)
				msgs = ((InternalEObject) newOwnedTemplateSignature)
					.eInverseAdd(this, UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE,
						TemplateSignature.class, msgs);
			msgs = basicSetOwnedTemplateSignature(newOwnedTemplateSignature,
				msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE,
				newOwnedTemplateSignature, newOwnedTemplateSignature));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature createOwnedTemplateSignature(EClass eClass) {
		TemplateSignature newOwnedTemplateSignature = (TemplateSignature) create(eClass);
		setOwnedTemplateSignature(newOwnedTemplateSignature);
		return newOwnedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature createOwnedTemplateSignature() {
		return createOwnedTemplateSignature(UMLPackage.Literals.TEMPLATE_SIGNATURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList ownedMembers = (EList) cache.get(eResource, this,
				UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
			if (ownedMembers == null) {
				cache
					.put(eResource, this,
						UMLPackage.Literals.NAMESPACE__OWNED_MEMBER,
						ownedMembers = new DerivedUnionEObjectEList(
							NamedElement.class, this,
							UMLPackage.PACKAGE__OWNED_MEMBER,
							OWNED_MEMBER_ESUBSETS));
			}
			return ownedMembers;
		}
		return new DerivedUnionEObjectEList(NamedElement.class, this,
			UMLPackage.PACKAGE__OWNED_MEMBER, OWNED_MEMBER_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPackagedElements() {
		if (packagedElements == null) {
			packagedElements = new EObjectContainmentEList.Resolving(
				PackageableElement.class, this,
				UMLPackage.PACKAGE__PACKAGED_ELEMENT);
		}
		return packagedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement createPackagedElement(String name, EClass eClass) {
		PackageableElement newPackagedElement = (PackageableElement) create(eClass);
		getPackagedElements().add(newPackagedElement);
		if (name != null)
			newPackagedElement.setName(name);
		return newPackagedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement getPackagedElement(String name) {
		return getPackagedElement(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement getPackagedElement(String name,
			boolean ignoreCase, EClass eClass, boolean createOnDemand) {
		packagedElementLoop : for (Iterator i = getPackagedElements()
			.iterator(); i.hasNext();) {
			PackageableElement packagedElement = (PackageableElement) i.next();
			if (eClass != null && !eClass.isInstance(packagedElement))
				continue packagedElementLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(packagedElement.getName())
				: name.equals(packagedElement.getName())))
				continue packagedElementLoop;
			return packagedElement;
		}
		return createOnDemand && eClass != null
			? createPackagedElement(name, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPackageMerges() {
		if (packageMerges == null) {
			packageMerges = new EObjectContainmentWithInverseEList.Resolving(
				PackageMerge.class, this, UMLPackage.PACKAGE__PACKAGE_MERGE,
				UMLPackage.PACKAGE_MERGE__RECEIVING_PACKAGE);
		}
		return packageMerges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageMerge createPackageMerge(
			org.eclipse.uml2.uml.Package mergedPackage) {
		PackageMerge newPackageMerge = (PackageMerge) create(UMLPackage.Literals.PACKAGE_MERGE);
		getPackageMerges().add(newPackageMerge);
		if (mergedPackage != null)
			newPackageMerge.setMergedPackage(mergedPackage);
		return newPackageMerge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageMerge getPackageMerge(
			org.eclipse.uml2.uml.Package mergedPackage) {
		return getPackageMerge(mergedPackage, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageMerge getPackageMerge(
			org.eclipse.uml2.uml.Package mergedPackage, boolean createOnDemand) {
		packageMergeLoop : for (Iterator i = getPackageMerges().iterator(); i
			.hasNext();) {
			PackageMerge packageMerge = (PackageMerge) i.next();
			if (mergedPackage != null
				&& !mergedPackage.equals(packageMerge.getMergedPackage()))
				continue packageMergeLoop;
			return packageMerge;
		}
		return createOnDemand
			? createPackageMerge(mergedPackage)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getOwnedTypes() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList ownedTypes = (EList) cache.get(eResource, this,
				UMLPackage.Literals.PACKAGE__OWNED_TYPE);
			if (ownedTypes == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.PACKAGE__OWNED_TYPE,
					ownedTypes = new DerivedSubsetEObjectEList(Type.class,
						this, UMLPackage.PACKAGE__OWNED_TYPE,
						OWNED_TYPE_ESUPERSETS));
			}
			return ownedTypes;
		}
		return new DerivedSubsetEObjectEList(Type.class, this,
			UMLPackage.PACKAGE__OWNED_TYPE, OWNED_TYPE_ESUPERSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createOwnedType(String name, EClass eClass) {
		Type newOwnedType = (Type) create(eClass);
		getOwnedTypes().add(newOwnedType);
		if (name != null)
			newOwnedType.setName(name);
		return newOwnedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getOwnedType(String name) {
		return getOwnedType(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getOwnedType(String name, boolean ignoreCase, EClass eClass,
			boolean createOnDemand) {
		ownedTypeLoop : for (Iterator i = getOwnedTypes().iterator(); i
			.hasNext();) {
			Type ownedType = (Type) i.next();
			if (eClass != null && !eClass.isInstance(ownedType))
				continue ownedTypeLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(ownedType.getName())
				: name.equals(ownedType.getName())))
				continue ownedTypeLoop;
			return ownedType;
		}
		return createOnDemand && eClass != null
			? createOwnedType(name, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getNestedPackages() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList nestedPackages = (EList) cache.get(eResource, this,
				UMLPackage.Literals.PACKAGE__NESTED_PACKAGE);
			if (nestedPackages == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.PACKAGE__NESTED_PACKAGE,
					nestedPackages = new DerivedSubsetEObjectEList(
						org.eclipse.uml2.uml.Package.class, this,
						UMLPackage.PACKAGE__NESTED_PACKAGE,
						NESTED_PACKAGE_ESUPERSETS));
			}
			return nestedPackages;
		}
		return new DerivedSubsetEObjectEList(
			org.eclipse.uml2.uml.Package.class, this,
			UMLPackage.PACKAGE__NESTED_PACKAGE, NESTED_PACKAGE_ESUPERSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package createNestedPackage(String name,
			EClass eClass) {
		org.eclipse.uml2.uml.Package newNestedPackage = (org.eclipse.uml2.uml.Package) create(eClass);
		getNestedPackages().add(newNestedPackage);
		if (name != null)
			newNestedPackage.setName(name);
		return newNestedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package getNestedPackage(String name) {
		return getNestedPackage(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package getNestedPackage(String name,
			boolean ignoreCase, EClass eClass, boolean createOnDemand) {
		nestedPackageLoop : for (Iterator i = getNestedPackages().iterator(); i
			.hasNext();) {
			org.eclipse.uml2.uml.Package nestedPackage = (org.eclipse.uml2.uml.Package) i
				.next();
			if (eClass != null && !eClass.isInstance(nestedPackage))
				continue nestedPackageLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(nestedPackage.getName())
				: name.equals(nestedPackage.getName())))
				continue nestedPackageLoop;
			return nestedPackage;
		}
		return createOnDemand && eClass != null
			? createNestedPackage(name, eClass)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package getNestingPackage() {
		org.eclipse.uml2.uml.Package nestingPackage = basicGetNestingPackage();
		return nestingPackage != null && nestingPackage.eIsProxy()
			? (org.eclipse.uml2.uml.Package) eResolveProxy((InternalEObject) nestingPackage)
			: nestingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public org.eclipse.uml2.uml.Package basicGetNestingPackage() {
		InternalEObject eInternalContainer = eInternalContainer();
		return eInternalContainer instanceof org.eclipse.uml2.uml.Package
			? (org.eclipse.uml2.uml.Package) eInternalContainer
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setNestingPackage(org.eclipse.uml2.uml.Package newNestingPackage) {
		if (newNestingPackage != eInternalContainer()) {
			if (EcoreUtil.isAncestor(this, newNestingPackage))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNestingPackage != null)
				msgs = ((InternalEList) newNestingPackage.getNestedPackages())
					.basicAdd(this, msgs);
			msgs = eBasicSetContainer((InternalEObject) newNestingPackage,
				UMLPackage.PACKAGE__NESTING_PACKAGE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.PACKAGE__NESTING_PACKAGE, newNestingPackage,
				newNestingPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProfileApplications() {
		if (profileApplications == null) {
			profileApplications = new EObjectContainmentWithInverseEList.Resolving(
				ProfileApplication.class, this,
				UMLPackage.PACKAGE__PROFILE_APPLICATION,
				UMLPackage.PROFILE_APPLICATION__APPLYING_PACKAGE);
		}
		return profileApplications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileApplication createProfileApplication() {
		ProfileApplication newProfileApplication = (ProfileApplication) create(UMLPackage.Literals.PROFILE_APPLICATION);
		getProfileApplications().add(newProfileApplication);
		return newProfileApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCompatibleWith(ParameterableElement p) {
		return ParameterableElementOperations.isCompatibleWith(this, p);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTemplateParameter() {
		return ParameterableElementOperations.isTemplateParameter(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList parameterableElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this,
				UMLPackage.Literals.TEMPLATEABLE_ELEMENT.getEOperations()
					.get(0));
			if (result == null) {
				cache.put(this, UMLPackage.Literals.TEMPLATEABLE_ELEMENT
					.getEOperations().get(0),
					result = TemplateableElementOperations
						.parameterableElements(this));
			}
			return result;
		}
		return TemplateableElementOperations.parameterableElements(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTemplate() {
		return TemplateableElementOperations.isTemplate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementsPublicOrPrivate(DiagnosticChain diagnostics,
			Map context) {
		return PackageOperations.validateElementsPublicOrPrivate(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package createNestedPackage(String name) {
		return createNestedPackage(name, UMLPackage.Literals.PACKAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class createOwnedClass(String name,
			boolean isAbstract) {
		return PackageOperations.createOwnedClass(this, name, isAbstract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createOwnedEnumeration(String name) {
		return PackageOperations.createOwnedEnumeration(this, name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createOwnedPrimitiveType(String name) {
		return PackageOperations.createOwnedPrimitiveType(this, name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProfileApplied(Profile profile) {
		return PackageOperations.isProfileApplied(this, profile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList applyProfile(Profile profile) {
		return PackageOperations.applyProfile(this, profile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList unapplyProfile(Profile profile) {
		return PackageOperations.unapplyProfile(this, profile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAppliedProfiles() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this, UMLPackage.Literals.PACKAGE
				.getEOperations().get(8));
			if (result == null) {
				cache.put(this, UMLPackage.Literals.PACKAGE.getEOperations()
					.get(8), result = PackageOperations
					.getAppliedProfiles(this));
			}
			return result;
		}
		return PackageOperations.getAppliedProfiles(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile getAppliedProfile(String qualifiedName) {
		return PackageOperations.getAppliedProfile(this, qualifiedName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile getAppliedProfile(String qualifiedName, boolean recurse) {
		return PackageOperations
			.getAppliedProfile(this, qualifiedName, recurse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAllProfileApplications() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this, UMLPackage.Literals.PACKAGE
				.getEOperations().get(12));
			if (result == null) {
				cache.put(this, UMLPackage.Literals.PACKAGE.getEOperations()
					.get(12), result = PackageOperations
					.getAllProfileApplications(this));
			}
			return result;
		}
		return PackageOperations.getAllProfileApplications(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileApplication getProfileApplication(Profile profile) {
		return PackageOperations.getProfileApplication(this, profile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileApplication getProfileApplication(Profile profile,
			boolean recurse) {
		return PackageOperations.getProfileApplication(this, profile, recurse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createOwnedInterface(String name) {
		return PackageOperations.createOwnedInterface(this, name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isModelLibrary() {
		return PackageOperations.isModelLibrary(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAllAppliedProfiles() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this, UMLPackage.Literals.PACKAGE
				.getEOperations().get(9));
			if (result == null) {
				cache.put(this, UMLPackage.Literals.PACKAGE.getEOperations()
					.get(9), result = PackageOperations
					.getAllAppliedProfiles(this));
			}
			return result;
		}
		return PackageOperations.getAllAppliedProfiles(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList visibleMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this, UMLPackage.Literals.PACKAGE
				.getEOperations().get(16));
			if (result == null) {
				cache.put(this, UMLPackage.Literals.PACKAGE.getEOperations()
					.get(16), result = PackageOperations.visibleMembers(this));
			}
			return result;
		}
		return PackageOperations.visibleMembers(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean makesVisible(NamedElement el) {
		return PackageOperations.makesVisible(this, el);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean mustBeOwned() {
		return PackageOperations.mustBeOwned(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.PACKAGE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.PACKAGE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.PACKAGE__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.PACKAGE__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.PACKAGE__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter(
					(TemplateParameter) otherEnd, msgs);
			case UMLPackage.PACKAGE__TEMPLATE_PARAMETER :
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter)
						.eInverseRemove(this,
							UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.PACKAGE__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE :
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject) ownedTemplateSignature)
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
							- UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE,
							null, msgs);
				return basicSetOwnedTemplateSignature(
					(TemplateSignature) otherEnd, msgs);
			case UMLPackage.PACKAGE__PACKAGE_MERGE :
				return ((InternalEList) getPackageMerges()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.PACKAGE__PROFILE_APPLICATION :
				return ((InternalEList) getProfileApplications()).basicAdd(
					otherEnd, msgs);
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
			case UMLPackage.PACKAGE__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.PACKAGE__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.PACKAGE__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.PACKAGE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.PACKAGE__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.PACKAGE__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.PACKAGE__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.PACKAGE__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.PACKAGE__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.PACKAGE__PACKAGE_MERGE :
				return ((InternalEList) getPackageMerges()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.PACKAGE__PACKAGED_ELEMENT :
				return ((InternalEList) getPackagedElements()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.PACKAGE__PROFILE_APPLICATION :
				return ((InternalEList) getProfileApplications()).basicRemove(
					otherEnd, msgs);
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
			case UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
					TemplateParameter.class, msgs);
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
			case UMLPackage.PACKAGE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.PACKAGE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.PACKAGE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.PACKAGE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.PACKAGE__NAME :
				return getName();
			case UMLPackage.PACKAGE__VISIBILITY :
				return getVisibility();
			case UMLPackage.PACKAGE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.PACKAGE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.PACKAGE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.PACKAGE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.PACKAGE__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.PACKAGE__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.PACKAGE__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.PACKAGE__MEMBER :
				return getMembers();
			case UMLPackage.PACKAGE__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.PACKAGE__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.PACKAGE__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.PACKAGE__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE :
				if (resolve)
					return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case UMLPackage.PACKAGE__OWNED_TYPE :
				return getOwnedTypes();
			case UMLPackage.PACKAGE__PACKAGE_MERGE :
				return getPackageMerges();
			case UMLPackage.PACKAGE__PACKAGED_ELEMENT :
				return getPackagedElements();
			case UMLPackage.PACKAGE__NESTED_PACKAGE :
				return getNestedPackages();
			case UMLPackage.PACKAGE__NESTING_PACKAGE :
				if (resolve)
					return getNestingPackage();
				return basicGetNestingPackage();
			case UMLPackage.PACKAGE__PROFILE_APPLICATION :
				return getProfileApplications();
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
			case UMLPackage.PACKAGE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.PACKAGE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.PACKAGE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.PACKAGE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.PACKAGE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.PACKAGE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.PACKAGE__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.PACKAGE__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.PACKAGE__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.PACKAGE__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.PACKAGE__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection) newValue);
				return;
			case UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.PACKAGE__OWNED_TYPE :
				getOwnedTypes().clear();
				getOwnedTypes().addAll((Collection) newValue);
				return;
			case UMLPackage.PACKAGE__PACKAGE_MERGE :
				getPackageMerges().clear();
				getPackageMerges().addAll((Collection) newValue);
				return;
			case UMLPackage.PACKAGE__PACKAGED_ELEMENT :
				getPackagedElements().clear();
				getPackagedElements().addAll((Collection) newValue);
				return;
			case UMLPackage.PACKAGE__NESTED_PACKAGE :
				getNestedPackages().clear();
				getNestedPackages().addAll((Collection) newValue);
				return;
			case UMLPackage.PACKAGE__NESTING_PACKAGE :
				setNestingPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.PACKAGE__PROFILE_APPLICATION :
				getProfileApplications().clear();
				getProfileApplications().addAll((Collection) newValue);
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
			case UMLPackage.PACKAGE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.PACKAGE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.PACKAGE__NAME :
				unsetName();
				return;
			case UMLPackage.PACKAGE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.PACKAGE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.PACKAGE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.PACKAGE__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.PACKAGE__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.PACKAGE__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.PACKAGE__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.PACKAGE__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.PACKAGE__OWNED_TYPE :
				getOwnedTypes().clear();
				return;
			case UMLPackage.PACKAGE__PACKAGE_MERGE :
				getPackageMerges().clear();
				return;
			case UMLPackage.PACKAGE__PACKAGED_ELEMENT :
				getPackagedElements().clear();
				return;
			case UMLPackage.PACKAGE__NESTED_PACKAGE :
				getNestedPackages().clear();
				return;
			case UMLPackage.PACKAGE__NESTING_PACKAGE :
				setNestingPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.PACKAGE__PROFILE_APPLICATION :
				getProfileApplications().clear();
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
			case UMLPackage.PACKAGE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.PACKAGE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.PACKAGE__OWNER :
				return isSetOwner();
			case UMLPackage.PACKAGE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.PACKAGE__NAME :
				return isSetName();
			case UMLPackage.PACKAGE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.PACKAGE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.PACKAGE__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.PACKAGE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.PACKAGE__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.PACKAGE__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.PACKAGE__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.PACKAGE__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.PACKAGE__MEMBER :
				return isSetMembers();
			case UMLPackage.PACKAGE__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.PACKAGE__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.PACKAGE__TEMPLATE_PARAMETER :
				return templateParameter != null;
			case UMLPackage.PACKAGE__TEMPLATE_BINDING :
				return templateBindings != null && !templateBindings.isEmpty();
			case UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE :
				return ownedTemplateSignature != null;
			case UMLPackage.PACKAGE__OWNED_TYPE :
				return !getOwnedTypes().isEmpty();
			case UMLPackage.PACKAGE__PACKAGE_MERGE :
				return packageMerges != null && !packageMerges.isEmpty();
			case UMLPackage.PACKAGE__PACKAGED_ELEMENT :
				return packagedElements != null && !packagedElements.isEmpty();
			case UMLPackage.PACKAGE__NESTED_PACKAGE :
				return !getNestedPackages().isEmpty();
			case UMLPackage.PACKAGE__NESTING_PACKAGE :
				return basicGetNestingPackage() != null;
			case UMLPackage.PACKAGE__PROFILE_APPLICATION :
				return profileApplications != null
					&& !profileApplications.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == ParameterableElement.class) {
			switch (derivedFeatureID) {
				case UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER :
					return UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
				case UMLPackage.PACKAGE__TEMPLATE_PARAMETER :
					return UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
				default :
					return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (derivedFeatureID) {
				default :
					return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (derivedFeatureID) {
				case UMLPackage.PACKAGE__TEMPLATE_BINDING :
					return UMLPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING;
				case UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE :
					return UMLPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE;
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
		if (baseClass == ParameterableElement.class) {
			switch (baseFeatureID) {
				case UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER :
					return UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER;
				case UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER :
					return UMLPackage.PACKAGE__TEMPLATE_PARAMETER;
				default :
					return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (baseFeatureID) {
				default :
					return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (baseFeatureID) {
				case UMLPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING :
					return UMLPackage.PACKAGE__TEMPLATE_BINDING;
				case UMLPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE :
					return UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE;
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
		result.append(" (visibility: "); //$NON-NLS-1$
		result.append(visibility);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		TemplateParameter owningTemplateParameter = basicGetOwningTemplateParameter();
		if (owningTemplateParameter != null) {
			return owningTemplateParameter;
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
			|| eIsSet(UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER);
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
		UMLPackage.PACKAGE__OWNED_COMMENT, UMLPackage.PACKAGE__NAME_EXPRESSION,
		UMLPackage.PACKAGE__ELEMENT_IMPORT, UMLPackage.PACKAGE__PACKAGE_IMPORT,
		UMLPackage.PACKAGE__OWNED_MEMBER, UMLPackage.PACKAGE__TEMPLATE_BINDING,
		UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE,
		UMLPackage.PACKAGE__PACKAGE_MERGE,
		UMLPackage.PACKAGE__PROFILE_APPLICATION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.PACKAGE__TEMPLATE_BINDING)
			|| eIsSet(UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE)
			|| eIsSet(UMLPackage.PACKAGE__PACKAGE_MERGE)
			|| eIsSet(UMLPackage.PACKAGE__PROFILE_APPLICATION);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMembers() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[]{
		UMLPackage.PACKAGE__OWNED_RULE, UMLPackage.PACKAGE__PACKAGED_ELEMENT};

	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedTypes() <em>Owned Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTypes()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_TYPE_ESUPERSETS = new int[]{UMLPackage.PACKAGE__PACKAGED_ELEMENT};

	/**
	 * The array of superset feature identifiers for the '{@link #getNestedPackages() <em>Nested Package</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedPackages()
	 * @generated
	 * @ordered
	 */
	protected static final int[] NESTED_PACKAGE_ESUPERSETS = new int[]{UMLPackage.PACKAGE__PACKAGED_ELEMENT};

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
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.PACKAGE__PACKAGED_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNamespace() {
		org.eclipse.uml2.uml.Package nestingPackage = basicGetNestingPackage();
		if (nestingPackage != null) {
			return nestingPackage;
		}
		return super.basicGetNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNamespace() {
		return super.isSetNamespace()
			|| eIsSet(UMLPackage.PACKAGE__NESTING_PACKAGE);
	}

} //PackageImpl
