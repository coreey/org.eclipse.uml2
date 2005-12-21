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
 * $Id: PackageOperations.java,v 1.7 2005/12/21 20:13:08 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Package</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Package#validateElementsPublicOrPrivate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Elements Public Or Private</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#visibleMembers() <em>Visible Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#makesVisible(org.eclipse.uml2.uml.NamedElement) <em>Makes Visible</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#mustBeOwned() <em>Must Be Owned</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class PackageOperations
		extends UMLOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PackageOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If an element that is owned by a package has visibility, it is public or private.
	 * self.ownedElements->forAll(e | e.visibility->notEmpty() implies e.visbility = #public or e.visibility = #private)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateElementsPublicOrPrivate(
			org.eclipse.uml2.uml.Package package_, DiagnosticChain diagnostics,
			Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.PACKAGE__ELEMENTS_PUBLIC_OR_PRIVATE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateElementsPublicOrPrivate", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(package_, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{package_}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static org.eclipse.uml2.uml.Package createNestedPackage(
			org.eclipse.uml2.uml.Package package_, String name) {

		if (isEmpty(name)) {
			throw new IllegalArgumentException(String.valueOf(name));
		}

		org.eclipse.uml2.uml.Package nestedPackage = (org.eclipse.uml2.uml.Package) package_
			.createPackagedElement(UMLPackage.Literals.PACKAGE);
		nestedPackage.setName(name);
		return nestedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static org.eclipse.uml2.uml.Class createOwnedClass(
			org.eclipse.uml2.uml.Package package_, String name,
			boolean isAbstract) {

		if (isEmpty(name)) {
			throw new IllegalArgumentException(String.valueOf(name));
		}

		org.eclipse.uml2.uml.Class ownedClass = (org.eclipse.uml2.uml.Class) package_
			.createPackagedElement(UMLPackage.Literals.CLASS);
		ownedClass.setName(name);
		ownedClass.setIsAbstract(isAbstract);
		return ownedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static Enumeration createOwnedEnumeration(
			org.eclipse.uml2.uml.Package package_, String name) {

		if (isEmpty(name)) {
			throw new IllegalArgumentException(String.valueOf(name));
		}

		Enumeration enumeration = (Enumeration) package_
			.createPackagedElement(UMLPackage.Literals.ENUMERATION);
		enumeration.setName(name);
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static PrimitiveType createOwnedPrimitiveType(
			org.eclipse.uml2.uml.Package package_, String name) {

		if (isEmpty(name)) {
			throw new IllegalArgumentException(String.valueOf(name));
		}

		PrimitiveType primitiveType = (PrimitiveType) package_
			.createPackagedElement(UMLPackage.Literals.PRIMITIVE_TYPE);
		primitiveType.setName(name);
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static boolean isProfileApplied(
			org.eclipse.uml2.uml.Package package_, Profile profile) {
		return getProfileApplication(package_, profile) != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList applyProfile(org.eclipse.uml2.uml.Package package_,
			Profile profile) {

		if (profile == null) {
			throw new IllegalArgumentException(String.valueOf(profile));
		}

		EPackage profileDefinition = profile.getDefinition();

		if (profileDefinition == null) {
			throw new IllegalArgumentException(String.valueOf(profile));
		}

		ProfileApplication profileApplication = package_
			.getProfileApplication(profile);

		if (profileApplication == null) {
			profileApplication = package_.createProfileApplication();
			profileApplication.setAppliedProfile(profile);

			getEAnnotation(profileApplication, UMLPackage.eNS_URI, true)
				.getReferences().add(profileDefinition);

		} else {
			getEAnnotation(profileApplication, UMLPackage.eNS_URI, true)
				.getReferences().set(0, profileDefinition);

		}

		return ElementOperations.applyAllRequiredStereotypes(package_);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList unapplyProfile(org.eclipse.uml2.uml.Package package_,
			Profile profile) {

		if (profile == null) {
			throw new IllegalArgumentException(String.valueOf(profile));
		}

		ProfileApplication profileApplication = package_
			.getProfileApplication(profile);

		if (profileApplication == null) {
			throw new IllegalArgumentException(String.valueOf(profile));
		}

		profileApplication.destroy();

		return ElementOperations.unapplyAllNonApplicableStereotypes(package_);
	}

	protected static EList getAppliedProfiles(
			org.eclipse.uml2.uml.Package package_, EList appliedProfiles) {

		for (Iterator profileApplications = package_.getProfileApplications()
			.iterator(); profileApplications.hasNext();) {

			Profile appliedProfile = ((ProfileApplication) profileApplications
				.next()).getAppliedProfile();

			if (appliedProfile != null) {
				appliedProfiles.add(appliedProfile);
			}
		}

		return appliedProfiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList getAppliedProfiles(org.eclipse.uml2.uml.Package package_) {
		return getAppliedProfiles(package_, new UniqueEList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static Profile getAppliedProfile(
			org.eclipse.uml2.uml.Package package_, String qualifiedName) {

		for (Iterator profileApplications = package_.getProfileApplications()
			.iterator(); profileApplications.hasNext();) {

			Profile appliedProfile = ((ProfileApplication) profileApplications
				.next()).getAppliedProfile();

			if (appliedProfile != null
				&& appliedProfile.getQualifiedName().equals(qualifiedName)) {

				return appliedProfile;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static Profile getAppliedProfile(
			org.eclipse.uml2.uml.Package package_, String qualifiedName,
			boolean isRecursive) {
		Profile appliedProfile = package_.getAppliedProfile(qualifiedName);

		if (appliedProfile == null && isRecursive) {

			for (package_ = package_.getNestingPackage(); package_ != null
				&& appliedProfile == null; package_ = package_
				.getNestingPackage()) {

				appliedProfile = package_.getAppliedProfile(qualifiedName);
			}
		}

		return appliedProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList getAllProfileApplications(
			org.eclipse.uml2.uml.Package package_) {
		EList allProfileApplications = new UniqueEList(package_
			.getProfileApplications());

		for (Iterator allOwningPackages = package_.allOwningPackages()
			.iterator(); allOwningPackages.hasNext();) {

			allProfileApplications
				.addAll(((org.eclipse.uml2.uml.Package) allOwningPackages
					.next()).getProfileApplications());
		}

		return ECollections.unmodifiableEList(allProfileApplications);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static ProfileApplication getProfileApplication(
			org.eclipse.uml2.uml.Package package_, Profile profile) {

		for (Iterator profileApplications = package_.getProfileApplications()
			.iterator(); profileApplications.hasNext();) {
			ProfileApplication profileApplication = (ProfileApplication) profileApplications
				.next();

			if (profileApplication.getAppliedProfile() == profile) {
				return profileApplication;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static ProfileApplication getProfileApplication(
			org.eclipse.uml2.uml.Package package_, Profile profile,
			boolean isRecursive) {
		ProfileApplication profileApplication = package_
			.getProfileApplication(profile);

		if (profileApplication == null && isRecursive) {

			for (package_ = package_.getNestingPackage(); package_ != null
				&& profileApplication == null; package_ = package_
				.getNestingPackage()) {

				profileApplication = package_.getProfileApplication(profile);
			}
		}

		return profileApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static Interface createOwnedInterface(
			org.eclipse.uml2.uml.Package package_, String name) {

		if (isEmpty(name)) {
			throw new IllegalArgumentException(String.valueOf(name));
		}

		Interface interface_ = (Interface) package_
			.createPackagedElement(UMLPackage.Literals.INTERFACE);
		interface_.setName(name);
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList getAllAppliedProfiles(
			org.eclipse.uml2.uml.Package package_) {
		EList allAppliedProfiles = getAppliedProfiles(package_,
			new UniqueEList());

		for (Iterator allOwningPackages = package_.allOwningPackages()
			.iterator(); allOwningPackages.hasNext();) {

			getAppliedProfiles((org.eclipse.uml2.uml.Package) allOwningPackages
				.next(), allAppliedProfiles);
		}

		return ECollections.unmodifiableEList(allAppliedProfiles);
	}

	protected static EList getAllImportedPackages(
			org.eclipse.uml2.uml.Package package_, EList allImportedPackages) {

		for (Iterator packageImports = package_.getPackageImports().iterator(); packageImports
			.hasNext();) {

			PackageImport packageImport = (PackageImport) packageImports.next();

			if (packageImport.getVisibility() == VisibilityKind.PUBLIC_LITERAL) {
				org.eclipse.uml2.uml.Package importedPackage = packageImport
					.getImportedPackage();

				if (importedPackage != null
					&& allImportedPackages.add(importedPackage)) {

					getAllImportedPackages(importedPackage, allImportedPackages);
				}
			}
		}

		return allImportedPackages;
	}

	protected static EList visibleMembers(
			org.eclipse.uml2.uml.Package package_, EList visibleMembers) {

		for (Iterator ownedMembers = package_.getOwnedMembers().iterator(); ownedMembers
			.hasNext();) {

			PackageableElement ownedMember = (PackageableElement) ownedMembers
				.next();

			if (ownedMember.getVisibility() == VisibilityKind.PUBLIC_LITERAL) {
				visibleMembers.add(ownedMember);
			}
		}

		for (Iterator elementImports = package_.getElementImports().iterator(); elementImports
			.hasNext();) {

			ElementImport elementImport = (ElementImport) elementImports.next();

			if (elementImport.getVisibility() == VisibilityKind.PUBLIC_LITERAL) {
				PackageableElement importedElement = elementImport
					.getImportedElement();

				if (importedElement != null) {
					visibleMembers.add(importedElement);
				}
			}
		}

		return visibleMembers;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query visibleMembers() defines which members of a Package can be accessed outside it.
	 * result = member->select( m | self.makesVisible(m))
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList visibleMembers(org.eclipse.uml2.uml.Package package_) {
		EList visibleMembers = visibleMembers(package_, new UniqueEList());

		for (Iterator allImportedPackages = getAllImportedPackages(package_,
			new UniqueEList()).iterator(); allImportedPackages.hasNext();) {

			visibleMembers((org.eclipse.uml2.uml.Package) allImportedPackages
				.next(), visibleMembers);
		}

		return ECollections.unmodifiableEList(visibleMembers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query makesVisible() defines whether a Package makes an element visible outside itself. Elements with no visibility and elements with public visibility are made visible.
	 * self.member->includes(el)
	 * result = (ownedMember->includes(el)) or
	 * (elementImport->select(ei|ei.importedElement = #public)->collect(ei|ei.importedElement)->includes(el)) or
	 * (packageImport->select(pi|pi.visibility = #public)->collect(pi|pi.importedPackage.member->includes(el))->notEmpty())
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean makesVisible(org.eclipse.uml2.uml.Package package_,
			NamedElement el) {

		if (package_.getOwnedMembers().contains(el)) {
			return el.getVisibility() == VisibilityKind.PUBLIC_LITERAL;
		}

		for (Iterator elementImports = package_.getElementImports().iterator(); elementImports
			.hasNext();) {

			ElementImport elementImport = (ElementImport) elementImports.next();

			if (safeEquals(elementImport.getImportedElement(), el)) {
				return elementImport.getVisibility() == VisibilityKind.PUBLIC_LITERAL;
			}
		}

		for (Iterator packageImports = package_.getPackageImports().iterator(); packageImports
			.hasNext();) {

			PackageImport packageImport = (PackageImport) packageImports.next();

			if (packageImport.getVisibility() == VisibilityKind.PUBLIC_LITERAL) {
				org.eclipse.uml2.uml.Package importedPackage = packageImport
					.getImportedPackage();

				return importedPackage != null
					&& importedPackage.visibleMembers().contains(el);
			}
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query mustBeOwned() indicates whether elements of this type must have an owner.
	 * result = false
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean mustBeOwned(org.eclipse.uml2.uml.Package package_) {
		return false;
	}

} // PackageOperations