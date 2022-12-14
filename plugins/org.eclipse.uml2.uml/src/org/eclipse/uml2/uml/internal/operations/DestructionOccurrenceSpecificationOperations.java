/*
 * Copyright (c) 2011, 2018 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   Kenn Hussey (CEA) - initial API and implementation
 *   Kenn Hussey (CEA) - 297216, 418466, 451350, 485756
 *   Kenn Hussey - 535301
 *
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.DestructionOccurrenceSpecification;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Destruction Occurrence Specification</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.DestructionOccurrenceSpecification#validateNoOccurrenceSpecificationsBelow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Occurrence Specifications Below</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DestructionOccurrenceSpecificationOperations
		extends OccurrenceSpecificationOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DestructionOccurrenceSpecificationOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No other OccurrenceSpecifications on a given Lifeline in an InteractionOperand may appear below a DestructionOccurrenceSpecification.
	 * let o : InteractionOperand = enclosingOperand in o->notEmpty() and 
	 * let peerEvents : OrderedSet(OccurrenceSpecification) = covered.events->select(enclosingOperand = o)
	 * in peerEvents->last() = self
	 * @param destructionOccurrenceSpecification The receiving '<em><b>Destruction Occurrence Specification</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNoOccurrenceSpecificationsBelow(
			DestructionOccurrenceSpecification destructionOccurrenceSpecification,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					UMLValidator.DIAGNOSTIC_SOURCE,
					UMLValidator.DESTRUCTION_OCCURRENCE_SPECIFICATION__NO_OCCURRENCE_SPECIFICATIONS_BELOW,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
						new Object[]{"validateNoOccurrenceSpecificationsBelow", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(
									destructionOccurrenceSpecification,
									context)}), new Object[]{destructionOccurrenceSpecification}));
			}
			return false;
		}
		return true;
	}

} // DestructionOccurrenceSpecificationOperations