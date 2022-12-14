/*
 * Copyright (c) 2005, 2018 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
 *   Kenn Hussey - 535301
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.AddStructuralFeatureValueAction;
import org.eclipse.uml2.uml.UMLPlugin;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Add Structural Feature Value Action</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.AddStructuralFeatureValueAction#validateRequiredValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Required Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.AddStructuralFeatureValueAction#validateInsertAtPin(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insert At Pin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddStructuralFeatureValueActionOperations
		extends WriteStructuralFeatureActionOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddStructuralFeatureValueActionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value InputPin is required.
	 * value<>null
	 * @param addStructuralFeatureValueAction The receiving '<em><b>Add Structural Feature Value Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateRequiredValue(
			AddStructuralFeatureValueAction addStructuralFeatureValueAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = addStructuralFeatureValueAction.getValue() != null;

		if (!result && diagnostics != null) {
			diagnostics.add(new BasicDiagnostic(Diagnostic.WARNING,
				UMLValidator.DIAGNOSTIC_SOURCE,
				UMLValidator.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__REQUIRED_VALUE,
				UMLPlugin.INSTANCE.getString(
					"_UI_AddStructuralFeatureValueAction_RequiredValue_diagnostic", //$NON-NLS-1$
					getMessageSubstitutions(context,
						addStructuralFeatureValueAction)),
				new Object[]{addStructuralFeatureValueAction}));
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AddStructuralFeatureActions adding a value to ordered StructuralFeatures must have a single InputPin for the insertion point with type UnlimitedNatural and multiplicity of 1..1 if isReplaceAll=false, and must have no Input Pin for the insertion point when the StructuralFeature is unordered.
	 * if not structuralFeature.isOrdered then insertAt = null
	 * else 
	 *   not isReplaceAll implies
	 *   	insertAt<>null and 
	 *   	insertAt->forAll(type=UnlimitedNatural and is(1,1.oclAsType(UnlimitedNatural)))
	 * endif
	 * @param addStructuralFeatureValueAction The receiving '<em><b>Add Structural Feature Value Action</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInsertAtPin(
			AddStructuralFeatureValueAction addStructuralFeatureValueAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT_PIN,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateInsertAtPin", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(addStructuralFeatureValueAction,
									context)}), new Object[]{addStructuralFeatureValueAction}));
			}
			return false;
		}
		return true;
	}

} // AddStructuralFeatureValueActionOperations