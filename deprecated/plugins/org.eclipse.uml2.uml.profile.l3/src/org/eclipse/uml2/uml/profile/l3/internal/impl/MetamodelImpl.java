/*
 * Copyright (c) 2011 CEA and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA - initial API and implementation
 *
 */
package org.eclipse.uml2.uml.profile.l3.internal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.uml.Model;

import org.eclipse.uml2.uml.profile.l3.L3Package;
import org.eclipse.uml2.uml.profile.l3.Metamodel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metamodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.profile.l3.internal.impl.MetamodelImpl#getBase_Model <em>Base Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetamodelImpl
		extends EObjectImpl
		implements Metamodel {

	/**
	 * The cached value of the '{@link #getBase_Model() <em>Base Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Model()
	 * @generated
	 * @ordered
	 */
	protected Model base_Model;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetamodelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return L3Package.Literals.METAMODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getBase_Model() {
		if (base_Model != null && base_Model.eIsProxy()) {
			InternalEObject oldBase_Model = (InternalEObject) base_Model;
			base_Model = (Model) eResolveProxy(oldBase_Model);
			if (base_Model != oldBase_Model) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						L3Package.METAMODEL__BASE_MODEL, oldBase_Model,
						base_Model));
			}
		}
		return base_Model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetBase_Model() {
		return base_Model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Model(Model newBase_Model) {
		Model oldBase_Model = base_Model;
		base_Model = newBase_Model;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				L3Package.METAMODEL__BASE_MODEL, oldBase_Model, base_Model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case L3Package.METAMODEL__BASE_MODEL :
				if (resolve)
					return getBase_Model();
				return basicGetBase_Model();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case L3Package.METAMODEL__BASE_MODEL :
				setBase_Model((Model) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case L3Package.METAMODEL__BASE_MODEL :
				setBase_Model((Model) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case L3Package.METAMODEL__BASE_MODEL :
				return base_Model != null;
		}
		return super.eIsSet(featureID);
	}

} //MetamodelImpl
