/*
 * Copyright (c) 2005, 2018 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350
 *   Christian W. Damus (CEA) - 251963
 *   Kenn Hussey - 535301
 *
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A PackageImport is a Relationship that imports all the non-private members of a Package into the Namespace owning the PackageImport, so that those Elements may be referred to by their unqualified names in the importingNamespace.
 * <p>From package UML::CommonStructure.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.PackageImport#getImportedPackage <em>Imported Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.PackageImport#getImportingNamespace <em>Importing Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.PackageImport#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getPackageImport()
 * @model
 * @generated
 */
public interface PackageImport
		extends DirectedRelationship {

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The default value is <code>"public"</code>.
	 * The literals are from the enumeration {@link org.eclipse.uml2.uml.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the visibility of the imported PackageableElements within the importingNamespace, i.e., whether imported Elements will in turn be visible to other Namespaces. If the PackageImport is public, the imported Elements will be visible outside the importingNamespace, while, if the PackageImport is private, they will not.
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.eclipse.uml2.uml.VisibilityKind
	 * @see #setVisibility(VisibilityKind)
	 * @see org.eclipse.uml2.uml.UMLPackage#getPackageImport_Visibility()
	 * @model default="public" required="true" ordered="false"
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.PackageImport#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.eclipse.uml2.uml.VisibilityKind
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityKind value);

	/**
	 * Returns the value of the '<em><b>Imported Package</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.DirectedRelationship#getTargets() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the Package whose members are imported into a Namespace.
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Package</em>' reference.
	 * @see #setImportedPackage(org.eclipse.uml2.uml.Package)
	 * @see org.eclipse.uml2.uml.UMLPackage#getPackageImport_ImportedPackage()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Package getImportedPackage();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.PackageImport#getImportedPackage <em>Imported Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Package</em>' reference.
	 * @see #getImportedPackage()
	 * @generated
	 */
	void setImportedPackage(org.eclipse.uml2.uml.Package value);

	/**
	 * Returns the value of the '<em><b>Importing Namespace</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Namespace#getPackageImports <em>Package Import</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.DirectedRelationship#getSources() <em>Source</em>}'</li>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the Namespace that imports the members from a Package.
	 * <p>From package UML::CommonStructure.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Importing Namespace</em>' container reference.
	 * @see #setImportingNamespace(Namespace)
	 * @see org.eclipse.uml2.uml.UMLPackage#getPackageImport_ImportingNamespace()
	 * @see org.eclipse.uml2.uml.Namespace#getPackageImports
	 * @model opposite="packageImport" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Namespace getImportingNamespace();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.PackageImport#getImportingNamespace <em>Importing Namespace</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importing Namespace</em>' container reference.
	 * @see #getImportingNamespace()
	 * @generated
	 */
	void setImportingNamespace(Namespace value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The visibility of a PackageImport is either public or private.
	 * visibility = VisibilityKind::public or visibility = VisibilityKind::private
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validatePublicOrPrivate(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // PackageImport
