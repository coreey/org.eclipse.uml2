/*
 * Copyright (c) 2005, 2018 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Christian W. Damus (CEA) - 251963
 *   Kenn Hussey (CEA) - 418466
 *   Kenn Hussey - 535301
 *
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OutputPin is a Pin that holds output values produced by an Action.
 * <p>From package UML::Actions.</p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getOutputPin()
 * @model
 * @generated
 */
public interface OutputPin
		extends Pin {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An OutputPin may have incoming ActivityEdges only when it is owned by a StructuredActivityNode, and these edges must have sources contained (directly or indirectly) in the owning StructuredActivityNode.
	 * incoming->notEmpty() implies
	 * 	action<>null and
	 * 	action.oclIsKindOf(StructuredActivityNode) and
	 * 	action.oclAsType(StructuredActivityNode).allOwnedNodes()->includesAll(incoming.source)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateIncomingEdgesStructuredOnly(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // OutputPin
