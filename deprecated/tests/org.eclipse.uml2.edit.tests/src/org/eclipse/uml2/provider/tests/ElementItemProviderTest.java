/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: ElementItemProviderTest.java,v 1.1.2.1 2004/09/14 19:31:14 khussey Exp $
 */
package org.eclipse.uml2.provider.tests;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.provider.UML2ItemProviderAdapterFactory;

/**
 * <!-- begin-user-doc --> A test case for the '<em><b>Element</b></em>'
 * item provider adapter. <!-- end-user-doc -->
 * 
 * @generated
 */
public abstract class ElementItemProviderTest
	extends TestCase {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The adapter factory for this Element item provider adapter test case.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private AdapterFactory adapterFactory = null;

	/**
	 * The command stack for this Element item provider adapter test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private CommandStack commandStack = null;

	/**
	 * The editing domain for this Element item provider adapter test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EditingDomain editingDomain = null;

	/**
	 * The model object for this Element item provider adapter test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Element modelObject = null;

	/**
	 * Constructs a new Element item provider adapter test case with the given
	 * name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ElementItemProviderTest(String name) {
		super(name);
	}

	/**
	 * Sets the adapter factory for this Element item provider adapter test
	 * case. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void setAdapterFactory(AdapterFactory adapterFactory) {
		this.adapterFactory = adapterFactory;
	}

	/**
	 * Returns the adapter factory for this Element item provider adapter test
	 * case. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AdapterFactory getAdapterFactory() {
		return adapterFactory;
	}

	/**
	 * Sets the command stack for this Element item provider adapter test case.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void setCommandStack(CommandStack commandStack) {
		this.commandStack = commandStack;
	}

	/**
	 * Returns the command stack for this Element item provider adapter test
	 * case. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CommandStack getCommandStack() {
		return commandStack;
	}

	/**
	 * Sets the editing domain for this Element item provider adapter test case.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void setEditingDomain(EditingDomain editingDomain) {
		this.editingDomain = editingDomain;
	}

	/**
	 * Returns the editing domain for this Element item provider adapter test
	 * case. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EditingDomain getEditingDomain() {
		return editingDomain;
	}

	/**
	 * Sets the model object for this Element item provider adapter test case.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void setModelObject(Element modelObject) {
		this.modelObject = modelObject;
	}

	/*
	 * (non-Javadoc) <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp() @generated
	 */
	protected void setUp()
		throws Exception {
		setAdapterFactory(new UML2ItemProviderAdapterFactory());
		setCommandStack(new BasicCommandStack());
		setEditingDomain(new AdapterFactoryEditingDomain(getAdapterFactory(),
			getCommandStack()));

	}

	/*
	 * (non-Javadoc) <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#tearDown() @generated
	 */
	protected void tearDown()
		throws Exception {
		setAdapterFactory(null);
		setCommandStack(null);
		setEditingDomain(null);
		setModelObject(null);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected List getEAllSubClasses(EClass eClass) {
		List eAllSubClasses = new ArrayList();

		for (Iterator eClassifiers = UML2Package.eINSTANCE.getEClassifiers()
			.iterator(); eClassifiers.hasNext();) {
			EClassifier eClassifier = (EClassifier) eClassifiers.next();

			if (EClass.class.isInstance(eClassifier)
				&& eClass.isSuperTypeOf((EClass) eClassifier)
				&& !((EClass) eClassifier).isAbstract()) {
				eAllSubClasses.add(eClassifier);
			}
		}

		return eAllSubClasses;
	}

	/**
	 * Returns the model object for this Element item provider adapter test
	 * case. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private Element getModelObject() {
		return modelObject;
	}

	public void testSetTarget() {
		ReferenceQueue referenceQueue = new ReferenceQueue();
		Reference reference = new PhantomReference(getModelObject(),
			referenceQueue);

		adapterFactory
			.adapt(getModelObject(), IEditingDomainItemProvider.class);

		getModelObject().eAdapters().clear();
		setModelObject(null);

		System.gc();

		if (!reference.isEnqueued()) {
			System.runFinalization();
		}

		assertTrue(reference.isEnqueued());

		try {
			reference = referenceQueue.remove();

			if (null != reference) {
				reference.clear();
			}
		} catch (InterruptedException ie) {
			// do nothing
		}
	}

	public void testDispose() {
		ReferenceQueue referenceQueue = new ReferenceQueue();
		Reference reference = new PhantomReference(getModelObject(),
			referenceQueue);

		IDisposable disposable = (IDisposable) adapterFactory.adapt(
			getModelObject(), IEditingDomainItemProvider.class);

		disposable.dispose();
		setModelObject(null);

		System.gc();

		if (!reference.isEnqueued()) {
			System.runFinalization();
		}

		assertTrue(reference.isEnqueued());

		try {
			reference = referenceQueue.remove();

			if (null != reference) {
				reference.clear();
			}
		} catch (InterruptedException ie) {
			// do nothing
		}
	}

} //ElementItemProviderTest
