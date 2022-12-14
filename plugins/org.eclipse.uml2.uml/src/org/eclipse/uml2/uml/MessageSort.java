/*
 * Copyright (c) 2006, 2018 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 327039, 418466, 451350, 485756
 *   Christian W. Damus (CEA) - 251963
 *   Kenn Hussey - 342235, 535301
 *
 */
package org.eclipse.uml2.uml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Message Sort</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This is an enumerated type that identifies the type of communication action that was used to generate the Message.
 * <p>From package UML::Interactions.</p>
 * <!-- end-model-doc -->
 * @see org.eclipse.uml2.uml.UMLPackage#getMessageSort()
 * @model
 * @generated
 */
public enum MessageSort
		implements Enumerator {
	/**
	 * The '<em><b>Synch Call</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The message was generated by a synchronous call to an operation.
	 * <!-- end-model-doc -->
	 * @see #SYNCH_CALL
	 * @generated
	 * @ordered
	 */
	SYNCH_CALL_LITERAL(0, "synchCall", "synchCall"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Asynch Call</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The message was generated by an asynchronous call to an operation; i.e., a CallAction with isSynchronous = false.
	 * <!-- end-model-doc -->
	 * @see #ASYNCH_CALL
	 * @generated
	 * @ordered
	 */
	ASYNCH_CALL_LITERAL(1, "asynchCall", "asynchCall"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Asynch Signal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The message was generated by an asynchronous send action.
	 * <!-- end-model-doc -->
	 * @see #ASYNCH_SIGNAL
	 * @generated
	 * @ordered
	 */
	ASYNCH_SIGNAL_LITERAL(2, "asynchSignal", "asynchSignal"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Create Message</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The message designating the creation of another lifeline object.
	 * <!-- end-model-doc -->
	 * @see #CREATE_MESSAGE
	 * @generated
	 * @ordered
	 */
	CREATE_MESSAGE_LITERAL(3, "createMessage", "createMessage"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Delete Message</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The message designating the termination of another lifeline.
	 * <!-- end-model-doc -->
	 * @see #DELETE_MESSAGE
	 * @generated
	 * @ordered
	 */
	DELETE_MESSAGE_LITERAL(4, "deleteMessage", "deleteMessage"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Reply</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The message is a reply message to an operation call.
	 * <!-- end-model-doc -->
	 * @see #REPLY
	 * @generated
	 * @ordered
	 */
	REPLY_LITERAL(5, "reply", "reply"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Synch Call</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The message was generated by a synchronous call to an operation.
	 * <!-- end-model-doc -->
	 * @see #SYNCH_CALL_LITERAL
	 * @model name="synchCall"
	 * @generated
	 * @ordered
	 */
	public static final int SYNCH_CALL = 0;

	/**
	 * The '<em><b>Asynch Call</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The message was generated by an asynchronous call to an operation; i.e., a CallAction with isSynchronous = false.
	 * <!-- end-model-doc -->
	 * @see #ASYNCH_CALL_LITERAL
	 * @model name="asynchCall"
	 * @generated
	 * @ordered
	 */
	public static final int ASYNCH_CALL = 1;

	/**
	 * The '<em><b>Asynch Signal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The message was generated by an asynchronous send action.
	 * <!-- end-model-doc -->
	 * @see #ASYNCH_SIGNAL_LITERAL
	 * @model name="asynchSignal"
	 * @generated
	 * @ordered
	 */
	public static final int ASYNCH_SIGNAL = 2;

	/**
	 * The '<em><b>Create Message</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The message designating the creation of another lifeline object.
	 * <!-- end-model-doc -->
	 * @see #CREATE_MESSAGE_LITERAL
	 * @model name="createMessage"
	 * @generated
	 * @ordered
	 */
	public static final int CREATE_MESSAGE = 3;

	/**
	 * The '<em><b>Delete Message</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The message designating the termination of another lifeline.
	 * <!-- end-model-doc -->
	 * @see #DELETE_MESSAGE_LITERAL
	 * @model name="deleteMessage"
	 * @generated
	 * @ordered
	 */
	public static final int DELETE_MESSAGE = 4;

	/**
	 * The '<em><b>Reply</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The message is a reply message to an operation call.
	 * <!-- end-model-doc -->
	 * @see #REPLY_LITERAL
	 * @model name="reply"
	 * @generated
	 * @ordered
	 */
	public static final int REPLY = 5;

	/**
	 * An array of all the '<em><b>Message Sort</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MessageSort[] VALUES_ARRAY = new MessageSort[]{
		SYNCH_CALL_LITERAL, ASYNCH_CALL_LITERAL, ASYNCH_SIGNAL_LITERAL,
		CREATE_MESSAGE_LITERAL, DELETE_MESSAGE_LITERAL, REPLY_LITERAL,};

	/**
	 * A public read-only list of all the '<em><b>Message Sort</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MessageSort> VALUES = Collections
		.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Message Sort</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageSort get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageSort result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Sort</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageSort getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageSort result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Sort</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageSort get(int value) {
		switch (value) {
			case SYNCH_CALL :
				return SYNCH_CALL_LITERAL;
			case ASYNCH_CALL :
				return ASYNCH_CALL_LITERAL;
			case ASYNCH_SIGNAL :
				return ASYNCH_SIGNAL_LITERAL;
			case CREATE_MESSAGE :
				return CREATE_MESSAGE_LITERAL;
			case DELETE_MESSAGE :
				return DELETE_MESSAGE_LITERAL;
			case REPLY :
				return REPLY_LITERAL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MessageSort(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //MessageSort
