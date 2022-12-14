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
 * $Id: NamespaceImpl.java,v 1.35 2006/04/10 20:40:16 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Constraint;
import org.eclipse.uml2.ElementImport;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.PackageImport;
import org.eclipse.uml2.PackageableElement;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.eclipse.uml2.internal.operation.NamespaceOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.NamespaceImpl#getOwnedRules <em>Owned Rule</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NamespaceImpl#getImportedMembers <em>Imported Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NamespaceImpl#getElementImports <em>Element Import</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.NamespaceImpl#getPackageImports <em>Package Import</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NamespaceImpl extends NamedElementImpl implements Namespace {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getOwnedRules() <em>Owned Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRules()
	 * @generated
	 * @ordered
	 */
	protected EList ownedRules = null;

	/**
	 * The cached value of the '{@link #getElementImports() <em>Element Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementImports()
	 * @generated
	 * @ordered
	 */
	protected EList elementImports = null;

	/**
	 * The cached value of the '{@link #getPackageImports() <em>Package Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageImports()
	 * @generated
	 * @ordered
	 */
	protected EList packageImports = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.Literals.NAMESPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList members = (EList) cache.get(eResource(), this, UML2Package.Literals.NAMESPACE__MEMBER);
			if (members == null) {
				List union = getMembersHelper(new UniqueEList.FastCompare());
				cache.put(eResource(), this, UML2Package.Literals.NAMESPACE__MEMBER, members = new UnionEObjectEList(this, UML2Package.Literals.NAMESPACE__MEMBER, union.size(), union.toArray()));
			}
			return members;
		}
		List union = getMembersHelper(new UniqueEList.FastCompare());
		return new UnionEObjectEList(this, UML2Package.Literals.NAMESPACE__MEMBER, union.size(), union.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMembers() {
		return eIsSet(UML2Package.NAMESPACE__IMPORTED_MEMBER)
			|| isSetOwnedMembers();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public NamedElement getMember(String name) {
		return getMember(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getMember(String name, boolean ignoreCase, EClass eClass) {
		memberLoop: for (Iterator i = getMembers().iterator(); i.hasNext(); ) {
			NamedElement member = (NamedElement) i.next();
			if (eClass != null && !eClass.isInstance(member))
				continue memberLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(member.getName()) : name.equals(member.getName())))
				continue memberLoop;
			return member;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedMembersHelper(EList ownedMembers) {
		if (eIsSet(UML2Package.NAMESPACE__OWNED_RULE)) {
			ownedMembers.addAll(getOwnedRules());
		}
		return ownedMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedRules() {
		if (ownedRules == null) {
			ownedRules = new EObjectContainmentWithInverseEList(Constraint.class, this, UML2Package.NAMESPACE__OWNED_RULE, UML2Package.CONSTRAINT__NAMESPACE);
		}
		return ownedRules;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Constraint getOwnedRule(String name) {
		return getOwnedRule(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getOwnedRule(String name, boolean ignoreCase, EClass eClass) {
		ownedRuleLoop: for (Iterator i = getOwnedRules().iterator(); i.hasNext(); ) {
			Constraint ownedRule = (Constraint) i.next();
			if (eClass != null && !eClass.isInstance(ownedRule))
				continue ownedRuleLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedRule.getName()) : name.equals(ownedRule.getName())))
				continue ownedRuleLoop;
			return ownedRule;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Constraint createOwnedRule(EClass eClass) {
		Constraint newOwnedRule = (Constraint) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.NAMESPACE__OWNED_RULE, null, newOwnedRule));
		}
		getOwnedRules().add(newOwnedRule);
		return newOwnedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Constraint createOwnedRule() {
		Constraint newOwnedRule = UML2Factory.eINSTANCE.createConstraint();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.NAMESPACE__OWNED_RULE, null, newOwnedRule));
		}
		getOwnedRules().add(newOwnedRule);
		return newOwnedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getImportedMembers() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			EList result = (EList) cache.get(this,
				UML2Package.Literals.NAMESPACE__IMPORTED_MEMBER);

			if (result == null) {
				Set importedMember = importedMember();
				cache.put(this,
					UML2Package.Literals.NAMESPACE__IMPORTED_MEMBER,
					result = new EcoreEList.UnmodifiableEList(this,
						UML2Package.Literals.NAMESPACE__IMPORTED_MEMBER,
						importedMember.size(), importedMember.toArray()));
			}

			return result;
		}

		Set importedMember = importedMember();
		return new EcoreEList.UnmodifiableEList(this,
			UML2Package.Literals.NAMESPACE__IMPORTED_MEMBER, importedMember
				.size(), importedMember.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public PackageableElement getImportedMember(String name) {
		return getImportedMember(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement getImportedMember(String name, boolean ignoreCase, EClass eClass) {
		importedMemberLoop: for (Iterator i = getImportedMembers().iterator(); i.hasNext(); ) {
			PackageableElement importedMember = (PackageableElement) i.next();
			if (eClass != null && !eClass.isInstance(importedMember))
				continue importedMemberLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(importedMember.getName()) : name.equals(importedMember.getName())))
				continue importedMemberLoop;
			return importedMember;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getElementImports() {
		if (elementImports == null) {
			elementImports = new EObjectContainmentWithInverseEList(ElementImport.class, this, UML2Package.NAMESPACE__ELEMENT_IMPORT, UML2Package.ELEMENT_IMPORT__IMPORTING_NAMESPACE);
		}
		return elementImports;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @deprecated Use #createElementImport() instead.
	 */
	public ElementImport createElementImport(EClass eClass) {
		ElementImport newElementImport = (ElementImport) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.NAMESPACE__ELEMENT_IMPORT, null, newElementImport));
		}
		getElementImports().add(newElementImport);
		return newElementImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ElementImport createElementImport() {
		ElementImport newElementImport = UML2Factory.eINSTANCE.createElementImport();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.NAMESPACE__ELEMENT_IMPORT, null, newElementImport));
		}
		getElementImports().add(newElementImport);
		return newElementImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPackageImports() {
		if (packageImports == null) {
			packageImports = new EObjectContainmentWithInverseEList(PackageImport.class, this, UML2Package.NAMESPACE__PACKAGE_IMPORT, UML2Package.PACKAGE_IMPORT__IMPORTING_NAMESPACE);
		}
		return packageImports;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PackageImport createPackageImport(EClass eClass) {
		PackageImport newPackageImport = (PackageImport) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.NAMESPACE__PACKAGE_IMPORT, null, newPackageImport));
		}
		getPackageImports().add(newPackageImport);
		return newPackageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PackageImport createPackageImport() {
		PackageImport newPackageImport = UML2Factory.eINSTANCE.createPackageImport();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.NAMESPACE__PACKAGE_IMPORT, null, newPackageImport));
		}
		getPackageImports().add(newPackageImport);
		return newPackageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMembersAreDistinguishable(DiagnosticChain diagnostics, Map context) {
		return NamespaceOperations.validateMembersAreDistinguishable(this, diagnostics, context);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set getNamesOfMember(NamedElement element) {
		return NamespaceOperations.getNamesOfMember(this, element);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean membersAreDistinguishable() {
		return NamespaceOperations.membersAreDistinguishable(this);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImportedMemberDerived(DiagnosticChain diagnostics, Map context) {
		return NamespaceOperations.validateImportedMemberDerived(this, diagnostics, context);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set importedMember() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Set result = (Set) cache.get(this, UML2Package.Literals.NAMESPACE.getEOperations().get(4));
			if (result == null) {
				cache.put(this, UML2Package.Literals.NAMESPACE.getEOperations().get(4), result = NamespaceOperations.importedMember(this));
			}
			return result;
		}
		return NamespaceOperations.importedMember(this);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set importMembers(Set imps) {
		return NamespaceOperations.importMembers(this, imps);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set excludeCollisions(Set imps) {
		return NamespaceOperations.excludeCollisions(this, imps);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2Package.NAMESPACE__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
			case UML2Package.NAMESPACE__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
			case UML2Package.NAMESPACE__OWNED_TEMPLATE_SIGNATURE:
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.NAMESPACE__OWNED_TEMPLATE_SIGNATURE, null, msgs);
				return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
			case UML2Package.NAMESPACE__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
			case UML2Package.NAMESPACE__OWNED_RULE:
				return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
			case UML2Package.NAMESPACE__ELEMENT_IMPORT:
				return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
			case UML2Package.NAMESPACE__PACKAGE_IMPORT:
				return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
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
			case UML2Package.NAMESPACE__EANNOTATIONS:
				return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
			case UML2Package.NAMESPACE__OWNED_COMMENT:
				return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
			case UML2Package.NAMESPACE__TEMPLATE_BINDING:
				return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case UML2Package.NAMESPACE__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UML2Package.NAMESPACE__CLIENT_DEPENDENCY:
				return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
			case UML2Package.NAMESPACE__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
			case UML2Package.NAMESPACE__OWNED_RULE:
				return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
			case UML2Package.NAMESPACE__ELEMENT_IMPORT:
				return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
			case UML2Package.NAMESPACE__PACKAGE_IMPORT:
				return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			try {
				Method method = getClass().getMethod("getOwnedMembers", null); //$NON-NLS-1$
				EList ownedMembers = (EList) cache.get(eResource(), this, method);
				if (ownedMembers == null) {
					List union = getOwnedMembersHelper(new UniqueEList.FastCompare());
					cache.put(eResource(), this, method, ownedMembers = new UnionEObjectEList(this, null, union.size(), union.toArray()));
				}
				return ownedMembers;
			}
			catch (NoSuchMethodException nsme) {
				// ignore
			}
		}
		List union = getOwnedMembersHelper(new UniqueEList.FastCompare());
		return new UnionEObjectEList(this, null, union.size(), union.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return eIsSet(UML2Package.NAMESPACE__OWNED_RULE);
	}


	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMembers() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[] {UML2Package.NAMESPACE__OWNED_RULE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public NamedElement getOwnedMember(String name) {
		return getOwnedMember(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getOwnedMember(String name, boolean ignoreCase, EClass eClass) {
		ownedMemberLoop: for (Iterator i = getOwnedMembers().iterator(); i.hasNext(); ) {
			NamedElement ownedMember = (NamedElement) i.next();
			if (eClass != null && !eClass.isInstance(ownedMember))
				continue ownedMemberLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedMember.getName()) : name.equals(ownedMember.getName())))
				continue ownedMemberLoop;
			return ownedMember;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedElementsHelper(EList ownedElements) {
		ownedElements.addAll(super.getOwnedElements());
		if (eIsSet(UML2Package.NAMESPACE__ELEMENT_IMPORT)) {
			ownedElements.addAll(getElementImports());
		}
		if (eIsSet(UML2Package.NAMESPACE__PACKAGE_IMPORT)) {
			ownedElements.addAll(getPackageImports());
		}
		if (isSetOwnedMembers()) {
			for (Iterator i = ((InternalEList) getOwnedMembers()).basicIterator(); i.hasNext(); ) {
				ownedElements.add(i.next());
			}
		}
		return ownedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList ownedElements = (EList) cache.get(eResource(), this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				List union = getOwnedElementsHelper(new UniqueEList.FastCompare());
				cache.put(eResource(), this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT, ownedElements = new UnionEObjectEList(this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT, union.size(), union.toArray()));
			}
			return ownedElements;
		}
		List union = getOwnedElementsHelper(new UniqueEList.FastCompare());
		return new UnionEObjectEList(this, UML2Package.Literals.ELEMENT__OWNED_ELEMENT, union.size(), union.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UML2Package.NAMESPACE__ELEMENT_IMPORT)
			|| eIsSet(UML2Package.NAMESPACE__PACKAGE_IMPORT)
			|| isSetOwnedMembers();
	}


	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {UML2Package.NAMESPACE__OWNED_COMMENT, UML2Package.NAMESPACE__TEMPLATE_BINDING, UML2Package.NAMESPACE__OWNED_TEMPLATE_SIGNATURE, UML2Package.NAMESPACE__NAME_EXPRESSION, UML2Package.NAMESPACE__ELEMENT_IMPORT, UML2Package.NAMESPACE__PACKAGE_IMPORT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2Package.NAMESPACE__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.NAMESPACE__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.NAMESPACE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.NAMESPACE__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.NAMESPACE__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.NAMESPACE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.NAMESPACE__NAME:
				return getName();
			case UML2Package.NAMESPACE__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.NAMESPACE__VISIBILITY:
				return getVisibility();
			case UML2Package.NAMESPACE__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.NAMESPACE__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.NAMESPACE__MEMBER:
				return getMembers();
			case UML2Package.NAMESPACE__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.NAMESPACE__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.NAMESPACE__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.NAMESPACE__PACKAGE_IMPORT:
				return getPackageImports();
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
			case UML2Package.NAMESPACE__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.NAMESPACE__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.NAMESPACE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.NAMESPACE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.NAMESPACE__NAME:
				setName((String)newValue);
				return;
			case UML2Package.NAMESPACE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.NAMESPACE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.NAMESPACE__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.NAMESPACE__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.NAMESPACE__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.NAMESPACE__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
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
			case UML2Package.NAMESPACE__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.NAMESPACE__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.NAMESPACE__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.NAMESPACE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.NAMESPACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.NAMESPACE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.NAMESPACE__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.NAMESPACE__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.NAMESPACE__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.NAMESPACE__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.NAMESPACE__PACKAGE_IMPORT:
				getPackageImports().clear();
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
			case UML2Package.NAMESPACE__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.NAMESPACE__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.NAMESPACE__OWNER:
				return isSetOwner();
			case UML2Package.NAMESPACE__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case UML2Package.NAMESPACE__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case UML2Package.NAMESPACE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.NAMESPACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.NAMESPACE__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.NAMESPACE__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.NAMESPACE__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case UML2Package.NAMESPACE__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.NAMESPACE__MEMBER:
				return isSetMembers();
			case UML2Package.NAMESPACE__OWNED_RULE:
				return ownedRules != null && !ownedRules.isEmpty();
			case UML2Package.NAMESPACE__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.NAMESPACE__ELEMENT_IMPORT:
				return elementImports != null && !elementImports.isEmpty();
			case UML2Package.NAMESPACE__PACKAGE_IMPORT:
				return packageImports != null && !packageImports.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getMembersHelper(EList members) {
		EList importedMembers = getImportedMembers();
		if (!importedMembers.isEmpty()) {
			for (Iterator i = ((InternalEList) importedMembers).basicIterator(); i.hasNext(); ) {
				members.add(i.next());
			}
		}
		if (isSetOwnedMembers()) {
			for (Iterator i = ((InternalEList) getOwnedMembers()).basicIterator(); i.hasNext(); ) {
				members.add(i.next());
			}
		}
		return members;
	}

	// <!-- begin-custom-operations -->

	private static Method GET_IMPORTED_PACKAGES = null;

	static {
		try {
			GET_IMPORTED_PACKAGES = NamespaceImpl.class.getMethod(
				"getImportedPackages", null); //$NON-NLS-1$
		} catch (Exception e) {
			// ignore
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Namespace#getImportedPackages()
	 */
	public Set getImportedPackages() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			Set result = (Set) cache.get(eResource(), this,
				GET_IMPORTED_PACKAGES);

			if (result == null) {
				cache.put(eResource(), this, GET_IMPORTED_PACKAGES,
					result = Collections.unmodifiableSet(NamespaceOperations
						.getImportedPackages(this)));
			}

			return result;
		}

		return Collections.unmodifiableSet(NamespaceOperations
			.getImportedPackages(this));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Namespace#importElement(org.eclipse.uml2.VisibilityKind,
	 *      org.eclipse.uml2.PackageableElement)
	 */
	public void importElement(VisibilityKind visibility,
			PackageableElement element) {
		NamespaceOperations.importElement(this, visibility, element);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Namespace#importPackage(org.eclipse.uml2.VisibilityKind,
	 *      org.eclipse.uml2.Package)
	 */
	public void importPackage(VisibilityKind visibility,
			org.eclipse.uml2.Package package_) {
		NamespaceOperations.importPackage(this, visibility, package_);
	}

	// <!-- begin-custom-operations -->

} //NamespaceImpl
