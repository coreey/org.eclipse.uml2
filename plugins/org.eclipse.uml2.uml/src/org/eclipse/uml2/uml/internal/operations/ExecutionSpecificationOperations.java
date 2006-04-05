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
 * $Id: ExecutionSpecificationOperations.java,v 1.5 2006/04/05 20:23:13 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.ExecutionSpecification;
import org.eclipse.uml2.uml.OccurrenceSpecification;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Execution Specification</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ExecutionSpecification#validateSameLifeline(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Same Lifeline</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecutionSpecificationOperations
		extends NamedElementOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionSpecificationOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The startEvent and the finishEvent must be on the same Lifeline
	 * start.lifeline = finish.lifeline
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static boolean validateSameLifeline(
			ExecutionSpecification executionSpecification,
			DiagnosticChain diagnostics, Map context) {
		OccurrenceSpecification start = executionSpecification.getStart();

		if (start != null) {
			OccurrenceSpecification finish = executionSpecification.getFinish();

			if (finish != null) {
				EList startCovereds = start.getCovereds();
				EList finishCovereds = finish.getCovereds();

				if (!startCovereds.containsAll(finishCovereds)
					|| !finishCovereds.containsAll(startCovereds)) {

					if (diagnostics != null) {
						diagnostics
							.add(new BasicDiagnostic(
								Diagnostic.WARNING,
								UMLValidator.DIAGNOSTIC_SOURCE,
								UMLValidator.EXECUTION_SPECIFICATION__SAME_LIFELINE,
								UMLPlugin.INSTANCE
									.getString(
										"_UI_ExecutionSpecification_SameLifeline_diagnostic", //$NON-NLS-1$
										getMessageSubstitutions(context,
											executionSpecification)),
								new Object[]{executionSpecification}));
					}

					return false;
				}

			}
		}

		return true;
	}

} // ExecutionSpecificationOperations
