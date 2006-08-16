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
 * $Id: ProfileOperations.java,v 1.28.2.1 2006/08/16 18:22:25 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Profile</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Profile#validateMetaclassReferenceNotSpecialized(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Metaclass Reference Not Specialized</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#validateReferencesSameMetamodel(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate References Same Metamodel</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#create(org.eclipse.uml2.uml.Classifier) <em>Create</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#createOwnedStereotype(java.lang.String, boolean) <em>Create Owned Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#isDefined() <em>Is Defined</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#define() <em>Define</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#getDefinition() <em>Get Definition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#getDefinition(org.eclipse.uml2.uml.NamedElement) <em>Get Definition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#getReferencedMetaclasses() <em>Get Referenced Metaclasses</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#getReferencedMetamodels() <em>Get Referenced Metamodels</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Profile#getOwnedExtensions(boolean) <em>Get Owned Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfileOperations
		extends PackageOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfileOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An element imported as a metaclassReference is not specialized or generalized in a Profile.
	 * self.metaclassReference.importedElement->
	 *   select(c | c.oclIsKindOf(Classifier) and
	 *     (c.generalization.namespace = self or
	 *       (c.specialization.namespace = self) )->isEmpty()
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateMetaclassReferenceNotSpecialized(
			Profile profile, DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		for (Iterator referencedMetaclasses = profile
			.getReferencedMetaclasses().iterator(); result
			&& referencedMetaclasses.hasNext();) {

			org.eclipse.uml2.uml.Class referencedMetaclass = (org.eclipse.uml2.uml.Class) referencedMetaclasses
				.next();

			for (Iterator allContents = getAllContents(profile, true, false); allContents
				.hasNext();) {

				Object object = allContents.next();

				if (object instanceof org.eclipse.uml2.uml.Package
					&& containsSpecializations(
						(org.eclipse.uml2.uml.Package) object,
						referencedMetaclass)) {

					result = false;
					break;
				}
			}

			if (result) {

				for (Iterator allParents = referencedMetaclass.allParents()
					.iterator(); allParents.hasNext();) {

					if (EcoreUtil.isAncestor(profile, (Classifier) allParents
						.next())) {

						result = false;
						break;
					}
				}
			}
		}

		if (!result && diagnostics != null) {
			diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
				UMLValidator.DIAGNOSTIC_SOURCE,
				UMLValidator.PROFILE__METACLASS_REFERENCE_NOT_SPECIALIZED,
				UMLPlugin.INSTANCE.getString(
					"_UI_Profile_MetaclassReferenceNotSpecialized_diagnostic", //$NON-NLS-1$
					getMessageSubstitutions(context, profile)),
				new Object[]{profile}));
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All elements imported either as metaclassReferences or through metamodelReferences are members of the same base reference metamodel.
	 * self.metamodelReference.importedPackage.elementImport.importedElement.allOwningPackages())->
	 *   union(self.metaclassReference.importedElement.allOwningPackages() )->notEmpty()
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateReferencesSameMetamodel(Profile profile,
			DiagnosticChain diagnostics, Map context) {
		EList metamodels = new UniqueEList.FastCompare(profile
			.getReferencedMetamodels());

		for (Iterator referencedMetaclasses = profile
			.getReferencedMetaclasses().iterator(); referencedMetaclasses
			.hasNext();) {

			metamodels.add(((org.eclipse.uml2.uml.Class) referencedMetaclasses
				.next()).getModel());
		}

		if (metamodels.size() != 1) {

			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.PROFILE__REFERENCES_SAME_METAMODEL,
					UMLPlugin.INSTANCE.getString(
						"_UI_Profile_ReferencesSameMetamodel_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, profile)),
					new Object[]{profile}));
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
	public static EObject create(Profile profile, Classifier classifier) {
		ENamedElement definition = profile.getDefinition(classifier);

		if (definition instanceof EClass) {
			return EcoreUtil.create((EClass) definition);
		}

		throw new IllegalArgumentException(String.valueOf(classifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static ElementImport createMetaclassReference(Profile profile,
			org.eclipse.uml2.uml.Class metaclass) {

		if (metaclass == null
			|| profile.getReferencedMetaclasses().contains(metaclass)) {

			throw new IllegalArgumentException(String.valueOf(metaclass));
		}

		ElementImport metaclassReference = profile.createElementImport(
			metaclass, VisibilityKind.PUBLIC_LITERAL);

		profile.getMetaclassReferences().add(metaclassReference);

		return metaclassReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static PackageImport createMetamodelReference(Profile profile,
			Model metamodel) {

		if (metamodel == null
			|| profile.getReferencedMetamodels().contains(metamodel)) {

			throw new IllegalArgumentException(String.valueOf(metamodel));
		}

		PackageImport metamodelReference = profile.createPackageImport(
			metamodel, VisibilityKind.PUBLIC_LITERAL);

		profile.getMetamodelReferences().add(metamodelReference);

		return metamodelReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static Stereotype createOwnedStereotype(Profile profile,
			String name, boolean isAbstract) {
		Stereotype ownedStereotype = (Stereotype) profile.createOwnedType(name,
			UMLPackage.Literals.STEREOTYPE);
		ownedStereotype.setIsAbstract(isAbstract);
		return ownedStereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static boolean isDefined(Profile profile) {
		EAnnotation eAnnotation = profile.getEAnnotation(UMLPackage.eNS_URI);
		return eAnnotation != null && eAnnotation.getContents().size() > 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EPackage define(Profile profile) {
		Map options = new HashMap();

		options.put(UML2EcoreConverter.OPTION__ECORE_TAGGED_VALUES,
			OPTION__PROCESS);
		options.put(UML2EcoreConverter.OPTION__DUPLICATE_FEATURES,
			OPTION__PROCESS);
		options.put(UML2EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE,
			OPTION__PROCESS);

		Collection ePackages = convertToEcore(profile, options);
		EPackage definition = ePackages.size() == 1
			? (EPackage) ePackages.iterator().next()
			: null;

		if (definition != null) {
			getEAnnotation(profile, UMLPackage.eNS_URI, true).getContents()
				.add(0, definition);
		}

		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EPackage getDefinition(Profile profile) {
		EAnnotation eAnnotation = profile.getEAnnotation(UMLPackage.eNS_URI);

		if (eAnnotation != null) {
			EList contents = eAnnotation.getContents();

			if (contents.size() > 0) {
				return (EPackage) contents.get(0);
			}
		}

		return null;
	}

	protected static ENamedElement getDefinition(Profile profile,
			NamedElement namedElement, EPackage profileDefinition) {

		if (namedElement instanceof Classifier) {

			if (profileDefinition != null) {

				for (Iterator eClassifiers = profileDefinition
					.getEClassifiers().iterator(); eClassifiers.hasNext();) {

					EClassifier eClassifier = (EClassifier) eClassifiers.next();
					EAnnotation eAnnotation = eClassifier
						.getEAnnotation(UMLPackage.eNS_URI);

					if (eAnnotation != null
						&& eAnnotation.getReferences().contains(namedElement)) {

						return eClassifier;
					}
				}
			}

			return null;
		} else if (namedElement instanceof Property) {
			ENamedElement namespaceDefinition = getDefinition(profile,
				namedElement.getNamespace(), profileDefinition);
			return namespaceDefinition instanceof EClass
				? ((EClass) namespaceDefinition)
					.getEStructuralFeature(getValidJavaIdentifier(namedElement
						.getName()))
				: null;
		} else if (namedElement instanceof EnumerationLiteral) {
			ENamedElement namespaceDefinition = getDefinition(profile,
				namedElement.getNamespace(), profileDefinition);
			return namespaceDefinition instanceof EEnum
				? ((EEnum) namespaceDefinition).getEEnumLiteral(namedElement
					.getName())
				: null;
		} else if (namedElement instanceof org.eclipse.uml2.uml.Package) {
			return namedElement == profile
				? profileDefinition
				: null;
		} else {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static ENamedElement getDefinition(Profile profile,
			NamedElement namedElement) {
		return getDefinition(profile, namedElement, profile.getDefinition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList getReferencedMetaclasses(Profile profile) {
		EList referencedMetaclasses = new UniqueEList.FastCompare();

		for (Iterator metaclassReferences = profile.getMetaclassReferences()
			.iterator(); metaclassReferences.hasNext();) {

			PackageableElement importedElement = ((ElementImport) metaclassReferences
				.next()).getImportedElement();

			if (importedElement != null) {
				referencedMetaclasses.add(importedElement);
			}
		}

		return ECollections.unmodifiableEList(referencedMetaclasses);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList getReferencedMetamodels(Profile profile) {
		EList referencedMetamodels = new UniqueEList.FastCompare();

		for (Iterator metamodelReferences = profile.getMetamodelReferences()
			.iterator(); metamodelReferences.hasNext();) {

			org.eclipse.uml2.uml.Package importedPackage = ((PackageImport) metamodelReferences
				.next()).getImportedPackage();

			if (importedPackage != null) {
				referencedMetamodels.add(importedPackage);
			}
		}

		return ECollections.unmodifiableEList(referencedMetamodels);
	}

	protected static EList getOwnedExtensions(Profile profile,
			boolean requiredOnly, EList ownedExtensions) {

		for (Iterator extensions = EcoreUtil.getObjectsByType(
			profile.getPackagedElements(), UMLPackage.Literals.EXTENSION)
			.iterator(); extensions.hasNext();) {

			Extension extension = (Extension) extensions.next();

			if (!requiredOnly || extension.isRequired()) {
				ownedExtensions.add(extension);
			}
		}

		return ownedExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EList getOwnedExtensions(Profile profile, boolean requiredOnly) {
		return ECollections.unmodifiableEList(getOwnedExtensions(profile,
			requiredOnly, new UniqueEList.FastCompare()));
	}

} // ProfileOperations