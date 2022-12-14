/*
 * Copyright (c) 2005, 2018 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350
 *   Christian W. Damus (CEA) - 251963
 *   Kenn Hussey - 535301
 *
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ConnectorEnd is an endpoint of a Connector, which attaches the Connector to a ConnectableElement.
 * <p>From package UML::StructuredClassifiers.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ConnectorEnd#getDefiningEnd <em>Defining End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ConnectorEnd#getPartWithPort <em>Part With Port</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ConnectorEnd#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getConnectorEnd()
 * @model
 * @generated
 */
public interface ConnectorEnd
		extends MultiplicityElement {

	/**
	 * Returns the value of the '<em><b>Defining End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A derived property referencing the corresponding end on the Association which types the Connector owing this ConnectorEnd, if any. It is derived by selecting the end at the same place in the ordering of Association ends as this ConnectorEnd.
	 * <p>From package UML::StructuredClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Defining End</em>' reference.
	 * @see org.eclipse.uml2.uml.UMLPackage#getConnectorEnd_DefiningEnd()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Property getDefiningEnd();

	/**
	 * Returns the value of the '<em><b>Part With Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the role of the internal structure of a Classifier with the Port to which the ConnectorEnd is attached.
	 * <p>From package UML::StructuredClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part With Port</em>' reference.
	 * @see #setPartWithPort(Property)
	 * @see org.eclipse.uml2.uml.UMLPackage#getConnectorEnd_PartWithPort()
	 * @model ordered="false"
	 * @generated
	 */
	Property getPartWithPort();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ConnectorEnd#getPartWithPort <em>Part With Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part With Port</em>' reference.
	 * @see #getPartWithPort()
	 * @generated
	 */
	void setPartWithPort(Property value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ConnectableElement attached at this ConnectorEnd. When an instance of the containing Classifier is created, a link may (depending on the multiplicities) be created to an instance of the Classifier that types this ConnectableElement.
	 * <p>From package UML::StructuredClassifiers.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(ConnectableElement)
	 * @see org.eclipse.uml2.uml.UMLPackage#getConnectorEnd_Role()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ConnectableElement getRole();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ConnectorEnd#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(ConnectableElement value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of the ConnectorEnd may not be more general than the multiplicity of the corresponding end of the Association typing the owning Connector, if any.
	 * self.compatibleWith(definingEnd)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateMultiplicity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a ConnectorEnd is attached to a Port of the containing Classifier, partWithPort will be empty.
	 * (role.oclIsKindOf(Port) and role.owner = connector.owner) implies partWithPort->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validatePartWithPortEmpty(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a ConnectorEnd references a partWithPort, then the role must be a Port that is defined or inherited by the type of the partWithPort.
	 * partWithPort->notEmpty() implies 
	 *   (role.oclIsKindOf(Port) and partWithPort.type.oclAsType(Namespace).member->includes(role))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateRoleAndPartWithPort(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Property held in self.partWithPort must not be a Port.
	 * partWithPort->notEmpty() implies not partWithPort.oclIsKindOf(Port)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateSelfPartWithPort(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // ConnectorEnd
