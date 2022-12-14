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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Message defines a particular communication between Lifelines of an Interaction.
 * <p>From package UML::Interactions.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Message#getArguments <em>Argument</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Message#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Message#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Message#getMessageKind <em>Message Kind</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Message#getMessageSort <em>Message Sort</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Message#getReceiveEvent <em>Receive Event</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Message#getSendEvent <em>Send Event</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Message#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getMessage()
 * @model
 * @generated
 */
public interface Message
		extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Message Kind</b></em>' attribute.
	 * The default value is <code>"unknown"</code>.
	 * The literals are from the enumeration {@link org.eclipse.uml2.uml.MessageKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The derived kind of the Message (complete, lost, found, or unknown).
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Kind</em>' attribute.
	 * @see org.eclipse.uml2.uml.MessageKind
	 * @see org.eclipse.uml2.uml.UMLPackage#getMessage_MessageKind()
	 * @model default="unknown" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	MessageKind getMessageKind();

	/**
	 * Returns the value of the '<em><b>Message Sort</b></em>' attribute.
	 * The default value is <code>"synchCall"</code>.
	 * The literals are from the enumeration {@link org.eclipse.uml2.uml.MessageSort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sort of communication reflected by the Message.
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Sort</em>' attribute.
	 * @see org.eclipse.uml2.uml.MessageSort
	 * @see #setMessageSort(MessageSort)
	 * @see org.eclipse.uml2.uml.UMLPackage#getMessage_MessageSort()
	 * @model default="synchCall" required="true" ordered="false"
	 * @generated
	 */
	MessageSort getMessageSort();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Message#getMessageSort <em>Message Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Sort</em>' attribute.
	 * @see org.eclipse.uml2.uml.MessageSort
	 * @see #getMessageSort()
	 * @generated
	 */
	void setMessageSort(MessageSort value);

	/**
	 * Returns the value of the '<em><b>Receive Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Receiving of the Message.
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receive Event</em>' reference.
	 * @see #setReceiveEvent(MessageEnd)
	 * @see org.eclipse.uml2.uml.UMLPackage#getMessage_ReceiveEvent()
	 * @model ordered="false"
	 * @generated
	 */
	MessageEnd getReceiveEvent();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Message#getReceiveEvent <em>Receive Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Event</em>' reference.
	 * @see #getReceiveEvent()
	 * @generated
	 */
	void setReceiveEvent(MessageEnd value);

	/**
	 * Returns the value of the '<em><b>Send Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Sending of the Message.
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Send Event</em>' reference.
	 * @see #setSendEvent(MessageEnd)
	 * @see org.eclipse.uml2.uml.UMLPackage#getMessage_SendEvent()
	 * @model ordered="false"
	 * @generated
	 */
	MessageEnd getSendEvent();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Message#getSendEvent <em>Send Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Event</em>' reference.
	 * @see #getSendEvent()
	 * @generated
	 */
	void setSendEvent(MessageEnd value);

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Connector on which this Message is sent.
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connector</em>' reference.
	 * @see #setConnector(Connector)
	 * @see org.eclipse.uml2.uml.UMLPackage#getMessage_Connector()
	 * @model ordered="false"
	 * @generated
	 */
	Connector getConnector();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Message#getConnector <em>Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(Connector value);

	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.Interaction#getMessages <em>Message</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.NamedElement#getNamespace() <em>Namespace</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The enclosing Interaction owning the Message.
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interaction</em>' container reference.
	 * @see #setInteraction(Interaction)
	 * @see org.eclipse.uml2.uml.UMLPackage#getMessage_Interaction()
	 * @see org.eclipse.uml2.uml.Interaction#getMessages
	 * @model opposite="message" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Interaction getInteraction();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Message#getInteraction <em>Interaction</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction</em>' container reference.
	 * @see #getInteraction()
	 * @generated
	 */
	void setInteraction(Interaction value);

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ValueSpecification}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwnedElements() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The arguments of the Message.
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getMessage_Argument()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ValueSpecification> getArguments();

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.ValueSpecification}, with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', and appends it to the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.ValueSpecification}, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' for the new {@link org.eclipse.uml2.uml.ValueSpecification}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ValueSpecification} to create.
	 * @return The new {@link org.eclipse.uml2.uml.ValueSpecification}.
	 * @see #getArguments()
	 * @generated
	 */
	ValueSpecification createArgument(String name, Type type, EClass eClass);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ValueSpecification} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ValueSpecification} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.ValueSpecification} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ValueSpecification} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getArguments()
	 * @generated
	 */
	ValueSpecification getArgument(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ValueSpecification} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ValueSpecification} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.ValueSpecification} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ValueSpecification} to retrieve, or <code>null</code>.
	 * @param createOnDemand Whether to create a {@link org.eclipse.uml2.uml.ValueSpecification} on demand if not found.
	 * @return The first {@link org.eclipse.uml2.uml.ValueSpecification} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getArguments()
	 * @generated
	 */
	ValueSpecification getArgument(String name, Type type, boolean ignoreCase,
			EClass eClass, boolean createOnDemand);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The signature of the Message is the specification of its content. It refers either an Operation or a Signal.
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature</em>' reference.
	 * @see #setSignature(NamedElement)
	 * @see org.eclipse.uml2.uml.UMLPackage#getMessage_Signature()
	 * @model ordered="false"
	 * @generated
	 */
	NamedElement getSignature();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Message#getSignature <em>Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(NamedElement value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the sendEvent and the receiveEvent of the same Message are on the same Lifeline, the sendEvent must be ordered before the receiveEvent.
	 * receiveEvent.oclIsKindOf(MessageOccurrenceSpecification)
	 * implies
	 * let f :  Lifeline = sendEvent->select(oclIsKindOf(MessageOccurrenceSpecification)).oclAsType(MessageOccurrenceSpecification)->asOrderedSet()->first().covered in
	 * f = receiveEvent->select(oclIsKindOf(MessageOccurrenceSpecification)).oclAsType(MessageOccurrenceSpecification)->asOrderedSet()->first().covered  implies
	 * f.events->indexOf(sendEvent.oclAsType(MessageOccurrenceSpecification)->asOrderedSet()->first() ) < 
	 * f.events->indexOf(receiveEvent.oclAsType(MessageOccurrenceSpecification)->asOrderedSet()->first() )
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateSendingReceivingMessageEvent(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The signature must either refer an Operation (in which case messageSort is either synchCall or asynchCall or reply) or a Signal (in which case messageSort is asynchSignal). The name of the NamedElement referenced by signature must be the same as that of the Message.
	 * signature->notEmpty() implies 
	 * ((signature.oclIsKindOf(Operation) and 
	 * (messageSort = MessageSort::asynchCall or messageSort = MessageSort::synchCall or messageSort = MessageSort::reply) 
	 * ) or (signature.oclIsKindOf(Signal)  and messageSort = MessageSort::asynchSignal )
	 *  ) and name = signature.name
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateSignatureReferTo(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In the case when a Message with messageSort synchCall or asynchCall has a non empty Operation signature, the arguments of the Message must correspond to the in and inout parameters of the Operation. A Parameter corresponds to an Argument if the Argument is of the same Class or a specialization of that of the Parameter.
	 * (messageSort = MessageSort::asynchCall or messageSort = MessageSort::synchCall) and signature.oclIsKindOf(Operation)  implies 
	 *  let requestParms : OrderedSet(Parameter) = signature.oclAsType(Operation).ownedParameter->
	 *  select(direction = ParameterDirectionKind::inout or direction = ParameterDirectionKind::_'in'  )
	 * in requestParms->size() = self.argument->size() and
	 * self.argument->forAll( o: ValueSpecification | 
	 * not (o.oclIsKindOf(Expression) and o.oclAsType(Expression).symbol->size()=0 and o.oclAsType(Expression).operand->isEmpty() ) implies 
	 * let p : Parameter = requestParms->at(self.argument->indexOf(o)) in
	 * o.type.oclAsType(Classifier).conformsTo(p.type.oclAsType(Classifier))
	 * )
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateSignatureIsOperationRequest(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In the case when a Message with messageSort reply has a non empty Operation signature, the arguments of the Message must correspond to the out, inout, and return parameters of the Operation. A Parameter corresponds to an Argument if the Argument is of the same Class or a specialization of that of the Parameter.
	 * (messageSort = MessageSort::reply) and signature.oclIsKindOf(Operation) implies 
	 *  let replyParms : OrderedSet(Parameter) = signature.oclAsType(Operation).ownedParameter->
	 * select(direction = ParameterDirectionKind::inout or direction = ParameterDirectionKind::out or direction = ParameterDirectionKind::return)
	 * in replyParms->size() = self.argument->size() and
	 * self.argument->forAll( o: ValueSpecification | o.oclIsKindOf(Expression) and let e : Expression = o.oclAsType(Expression) in
	 * e.operand->notEmpty()  implies 
	 * let p : Parameter = replyParms->at(self.argument->indexOf(o)) in
	 * e.operand->asSequence()->first().type.oclAsType(Classifier).conformsTo(p.type.oclAsType(Classifier))
	 * )
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateSignatureIsOperationReply(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In the case when the Message signature is a Signal, the arguments of the Message must correspond to the attributes of the Signal. A Message Argument corresponds to a Signal Attribute if the Argument is of the same Class or a specialization of that of the Attribute.
	 * (messageSort = MessageSort::asynchSignal ) and signature.oclIsKindOf(Signal) implies
	 *    let signalAttributes : OrderedSet(Property) = signature.oclAsType(Signal).inheritedMember()->
	 *              select(n:NamedElement | n.oclIsTypeOf(Property))->collect(oclAsType(Property))->asOrderedSet()
	 *    in signalAttributes->size() = self.argument->size()
	 *    and self.argument->forAll( o: ValueSpecification |
	 *           not (o.oclIsKindOf(Expression)
	 *           and o.oclAsType(Expression).symbol->size()=0
	 *           and o.oclAsType(Expression).operand->isEmpty() ) implies
	 *               let p : Property = signalAttributes->at(self.argument->indexOf(o))
	 *               in o.type.oclAsType(Classifier).conformsTo(p.type.oclAsType(Classifier)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateSignatureIsSignal(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Arguments of a Message must only be: i) attributes of the sending lifeline, ii) constants, iii) symbolic values (which are wildcard values representing any legal value), iv) explicit parameters of the enclosing Interaction, v) attributes of the class owning the Interaction.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateArguments(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Messages cannot cross boundaries of CombinedFragments or their operands.  This is true if and only if both MessageEnds are enclosed within the same InteractionFragment (i.e., an InteractionOperand or an Interaction).
	 * sendEvent->notEmpty() and receiveEvent->notEmpty() implies
	 * let sendEnclosingFrag : Set(InteractionFragment) = 
	 * sendEvent->asOrderedSet()->first().enclosingFragment()
	 * in 
	 * let receiveEnclosingFrag : Set(InteractionFragment) = 
	 * receiveEvent->asOrderedSet()->first().enclosingFragment()
	 * in  sendEnclosingFrag = receiveEnclosingFrag
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateCannotCrossBoundaries(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the MessageEnds are both OccurrenceSpecifications, then the connector must go between the Parts represented by the Lifelines of the two MessageEnds.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateOccurrenceSpecifications(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // Message
