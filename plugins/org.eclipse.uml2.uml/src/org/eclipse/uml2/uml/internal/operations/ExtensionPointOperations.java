/*
 * Copyright (c) 2005, 2018 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 418466, 451350, 485756
 *   Kenn Hussey - 535301
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.ExtensionPoint;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Extension Point</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ExtensionPoint#validateMustHaveName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Must Have Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtensionPointOperations
		extends RedefinableElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionPointOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An ExtensionPoint must have a name.
	 * name->notEmpty ()
	 * @param extensionPoint The receiving '<em><b>Extension Point</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMustHaveName(ExtensionPoint extensionPoint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.EXTENSION_POINT__MUST_HAVE_NAME,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateMustHaveName", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(extensionPoint, context)}), new Object[]{extensionPoint}));
			}
			return false;
		}
		return true;
	}

} // ExtensionPointOperations