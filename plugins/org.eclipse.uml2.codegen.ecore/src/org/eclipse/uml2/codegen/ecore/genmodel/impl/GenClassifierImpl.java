/*
 * Copyright (c) 2005, 2018 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (CEA) - 451350
 *   Kenn Hussey - 535301
 *
 */
package org.eclipse.uml2.codegen.ecore.genmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class GenClassifierImpl
		extends org.eclipse.emf.codegen.ecore.genmodel.impl.GenClassifierImpl
		implements GenClassifier {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenModelPackage.Literals.GEN_CLASSIFIER;
	}

} //GenClassifierImpl
