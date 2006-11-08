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
 * $Id: NamedElementOperations.java,v 1.18.2.1 2006/11/08 15:26:27 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Named Element</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#validateHasNoQualifiedName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Has No Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#validateHasQualifiedName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Has Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#validateVisibilityNeedsOwnership(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visibility Needs Ownership</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#createDependency(org.eclipse.uml2.uml.NamedElement) <em>Create Dependency</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#getLabel() <em>Get Label</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#getLabel(boolean) <em>Get Label</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#getQualifiedName() <em>Get Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#allNamespaces() <em>All Namespaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#isDistinguishableFrom(org.eclipse.uml2.uml.NamedElement, org.eclipse.uml2.uml.Namespace) <em>Is Distinguishable From</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#separator() <em>Separator</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#allOwningPackages() <em>All Owning Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamedElementOperations
		extends ElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElementOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If there is no name, or one of the containing namespaces has no name, there is no qualified name.
	 * (self.name->isEmpty() or self.allNamespaces()->select(ns | ns.name->isEmpty())->notEmpty())
	 *   implies self.qualifiedName->isEmpty()
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHasNoQualifiedName(NamedElement namedElement,
			DiagnosticChain diagnostics, Map context) {
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
						UMLValidator.NAMED_ELEMENT__HAS_NO_QUALIFIED_NAME,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateHasNoQualifiedName", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(namedElement, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{namedElement}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When there is a name, and all of the containing namespaces have a name, the qualified name is constructed from the names of the containing namespaces.
	 * (self.name->notEmpty() and self.allNamespaces()->select(ns | ns.name->isEmpty())->isEmpty()) implies
	 *   self.qualifiedName = self.allNamespaces()->iterate( ns : Namespace; result: String = self.name | ns.name->union(self.separator())->union(result))
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHasQualifiedName(NamedElement namedElement,
			DiagnosticChain diagnostics, Map context) {
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
						UMLValidator.NAMED_ELEMENT__HAS_QUALIFIED_NAME,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateHasQualifiedName", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(namedElement, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{namedElement}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a NamedElement is not owned by a Namespace, it does not have a visibility.
	 * namespace->isEmpty() implies visibility->isEmpty()
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateVisibilityNeedsOwnership(
			NamedElement namedElement, DiagnosticChain diagnostics, Map context) {
		boolean result = true;

		if (namedElement.getNamespace() == null
			&& namedElement
				.eIsSet(UMLPackage.Literals.NAMED_ELEMENT__VISIBILITY)) {

			result = false;

			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.NAMED_ELEMENT__VISIBILITY_NEEDS_OWNERSHIP,
					UMLPlugin.INSTANCE.getString(
						"_UI_NamedElement_VisibilityNeedsOwnership_diagnostic", //$NON-NLS-1$
						getMessageSubstitutions(context, namedElement)),
					new Object[]{namedElement}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static Dependency createDependency(NamedElement namedElement,
			NamedElement supplier) {
		org.eclipse.uml2.uml.Package package_ = namedElement
			.getNearestPackage();

		if (package_ == null) {
			throw new IllegalStateException();
		}

		if (supplier == null) {
			throw new IllegalArgumentException(String.valueOf(supplier));
		}

		Dependency dependency = (Dependency) package_.createPackagedElement(
			null, UMLPackage.Literals.DEPENDENCY);

		dependency.getClients().add(namedElement);
		dependency.getSuppliers().add(supplier);

		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static String getLabel(NamedElement namedElement) {
		return namedElement.getLabel(true);
	}

	protected static final String LABEL_KEY_PREFIX = "_label_"; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static String getLabel(NamedElement namedElement, boolean localize) {
		String qualifiedName = namedElement.getQualifiedName();
		return getString(namedElement, LABEL_KEY_PREFIX
			+ getValidJavaIdentifier(isEmpty(qualifiedName)
				? EMPTY_STRING
				: qualifiedName.replace(':', '_')), namedElement.getName(),
			localize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When there is a name, and all of the containing namespaces have a name, the qualified name is constructed from the names of the containing namespaces.
	 * result = if self.name->notEmpty() and self.allNamespaces()->select(ns | ns.name->isEmpty())->isEmpty()
	 * then 
	 *     self.allNamespaces()->iterate( ns : Namespace; result: String = self.name | ns.name->union(self.separator())->union(result))
	 * else
	 *     Set{}
	 * endif
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static String getQualifiedName(NamedElement namedElement) {
		return getQualifiedName(namedElement, namedElement.separator());
	}

	protected static EList allNamespaces(NamedElement namedElement,
			EList allNamespaces) {
		Namespace namespace = namedElement.getNamespace();

		if (namespace != null && allNamespaces.add(namespace)) {
			allNamespaces(namespace, allNamespaces);
		}

		return allNamespaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allNamespaces() gives the sequence of namespaces in which the NamedElement is nested, working outwards.
	 * result = if self.namespace->isEmpty()
	 * then Sequence{}
	 * else self.namespace.allNamespaces()->prepend(self.namespace)
	 * endif
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList allNamespaces(NamedElement namedElement) {
		return ECollections.unmodifiableEList(allNamespaces(namedElement,
			new UniqueEList.FastCompare()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isDistinguishableFrom() determines whether two NamedElements may logically co-exist within a Namespace. By default, two named elements are distinguishable if (a) they have unrelated types or (b) they have related types but different names.
	 * result = if self.oclIsKindOf(n.oclType) or n.oclIsKindOf(self.oclType)
	 * then ns.getNamesOfMember(self)->intersection(ns.getNamesOfMember(n))->isEmpty()
	 * else true
	 * endif
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean isDistinguishableFrom(NamedElement namedElement,
			NamedElement n, Namespace ns) {
		EClass eClass = namedElement.eClass();
		EClass nEClass = n.eClass();

		if (nEClass.isSuperTypeOf(eClass) || eClass.isSuperTypeOf(nEClass)) {
			EList namesOfN = ns.getNamesOfMember(n);

			for (Iterator namesOfMember = ns.getNamesOfMember(namedElement)
				.iterator(); namesOfMember.hasNext();) {

				if (namesOfN.contains(namesOfMember.next())) {
					return false;
				}
			}
		}

		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query separator() gives the string that is used to separate names when constructing a qualified name.
	 * result = '::'
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static String separator(NamedElement namedElement) {
		return NamedElement.SEPARATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allOwningPackages() returns all the directly or indirectly owning packages.
	 * result = self.namespace->select(p | p.oclIsKindOf(Package))->union(p.allOwningPackages())
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static EList allOwningPackages(NamedElement namedElement) {
		EList allOwningPackages = new UniqueEList.FastCompare();

		while ((namedElement = (NamedElement) getOwningElement(namedElement,
			UMLPackage.Literals.PACKAGE, true)) != null) {

			allOwningPackages.add(namedElement);
		}

		return ECollections.unmodifiableEList(allOwningPackages);
	}

} // NamedElementOperations