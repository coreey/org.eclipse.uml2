/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ExtensionEndItemProviderTest.java,v 1.4 2005/05/18 17:04:09 khussey Exp $
 */
package org.eclipse.uml2.provider.tests;

import junit.textui.TestRunner;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.uml2.Extension;
import org.eclipse.uml2.ExtensionEnd;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the '<em><b>Extension End</b></em>' item provider adapter.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtensionEndItemProviderTest extends PropertyItemProviderTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExtensionEndItemProviderTest.class);
	}

	/**
	 * Constructs a new Extension End item provider adapter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionEndItemProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the model object for this Extension End item provider adapter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ExtensionEnd getModelObject() {
		return (ExtensionEnd) modelObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		super.setUp();

		setModelObject(UML2Factory.eINSTANCE.createExtensionEnd());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.provider.tests.PropertyItemProviderTest#testCreateSetCommand()
	 */
	public void testCreateSetCommand() {
		testCreateSetCommandGen();

		// test PROPERTY__OWNING_ASSOCIATION subset...
		Extension extension = UML2Factory.eINSTANCE.createExtension();

		Command command = SetCommand.create(getEditingDomain(),
			getModelObject(), UML2Package.eINSTANCE
				.getProperty_OwningAssociation(), extension);

		getCommandStack().execute(command);

		assertSame(extension, getModelObject().getOwningAssociation());
		assertSame(getModelObject().getOwningAssociation(), getModelObject()
			.getAssociation());

		getCommandStack().undo();

		assertNotSame(extension, getModelObject().getOwningAssociation());
		assertSame(getModelObject().getOwningAssociation(), getModelObject()
			.getAssociation());

		getCommandStack().redo();

		assertSame(extension, getModelObject().getOwningAssociation());
		assertSame(getModelObject().getOwningAssociation(), getModelObject()
			.getAssociation());

		// test PROPERTY__ASSOCIATION superset...
		Extension oldExtension = UML2Factory.eINSTANCE.createExtension();
		Extension newExtension = UML2Factory.eINSTANCE.createExtension();

		getModelObject().setOwningAssociation(oldExtension);

		command = SetCommand.create(getEditingDomain(), getModelObject(),
			UML2Package.eINSTANCE.getProperty_Association(), newExtension);

		getCommandStack().execute(command);

		assertSame(newExtension, getModelObject().getAssociation());
		assertSame(null, getModelObject().getOwningAssociation());

		getCommandStack().undo();

		assertSame(oldExtension, getModelObject().getAssociation());
		assertSame(oldExtension, getModelObject().getOwningAssociation());

		getCommandStack().redo();

		assertSame(newExtension, getModelObject().getAssociation());
		assertSame(null, getModelObject().getOwningAssociation());
	}

} //ExtensionEndItemProviderTest
