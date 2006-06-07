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
 * $Id: ParameterEffectKind.java,v 1.2 2006/06/07 21:39:13 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Parameter Effect Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The datatype ParameterEffectKind is an enumeration that indicates the effect of a behavior on values passed in or out of its parameters.
 * <!-- end-model-doc -->
 * @see org.eclipse.uml2.uml.UMLPackage#getParameterEffectKind()
 * @model
 * @generated
 */
public final class ParameterEffectKind
		extends AbstractEnumerator {

	/**
	 * The '<em><b>Create</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the behavior creates values.
	 * <!-- end-model-doc -->
	 * @see #CREATE_LITERAL
	 * @model name="create"
	 * @generated
	 * @ordered
	 */
	public static final int CREATE = 0;

	/**
	 * The '<em><b>Read</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the behavior reads values.
	 * <!-- end-model-doc -->
	 * @see #READ_LITERAL
	 * @model name="read"
	 * @generated
	 * @ordered
	 */
	public static final int READ = 1;

	/**
	 * The '<em><b>Update</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the behavior updates values.
	 * <!-- end-model-doc -->
	 * @see #UPDATE_LITERAL
	 * @model name="update"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE = 2;

	/**
	 * The '<em><b>Delete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the behavior deletes values.
	 * <!-- end-model-doc -->
	 * @see #DELETE_LITERAL
	 * @model name="delete"
	 * @generated
	 * @ordered
	 */
	public static final int DELETE = 3;

	/**
	 * The '<em><b>Create</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE
	 * @generated
	 * @ordered
	 */
	public static final ParameterEffectKind CREATE_LITERAL = new ParameterEffectKind(
		CREATE, "create", "create"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Read</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ
	 * @generated
	 * @ordered
	 */
	public static final ParameterEffectKind READ_LITERAL = new ParameterEffectKind(
		READ, "read", "read"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Update</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATE
	 * @generated
	 * @ordered
	 */
	public static final ParameterEffectKind UPDATE_LITERAL = new ParameterEffectKind(
		UPDATE, "update", "update"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Delete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE
	 * @generated
	 * @ordered
	 */
	public static final ParameterEffectKind DELETE_LITERAL = new ParameterEffectKind(
		DELETE, "delete", "delete"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * An array of all the '<em><b>Parameter Effect Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ParameterEffectKind[] VALUES_ARRAY = new ParameterEffectKind[]{
		CREATE_LITERAL, READ_LITERAL, UPDATE_LITERAL, DELETE_LITERAL,};

	/**
	 * A public read-only list of all the '<em><b>Parameter Effect Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays
		.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Parameter Effect Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParameterEffectKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParameterEffectKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parameter Effect Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParameterEffectKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParameterEffectKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parameter Effect Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParameterEffectKind get(int value) {
		switch (value) {
			case CREATE :
				return CREATE_LITERAL;
			case READ :
				return READ_LITERAL;
			case UPDATE :
				return UPDATE_LITERAL;
			case DELETE :
				return DELETE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ParameterEffectKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ParameterEffectKind
