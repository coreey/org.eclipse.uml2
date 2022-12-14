/*
 * Copyright (c) 2006, 2018 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 535301
 *
 */
package org.eclipse.uml2.uml.internal.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.uml2.uml.resource.XMI2UMLResource;

public class XMI2UMLResourceImpl
		extends UMLResourceImpl
		implements XMI2UMLResource {

	public XMI2UMLResourceImpl(URI uri) {
		super(uri);
	}

	@Override
	protected XMLHelper createXMLHelper() {
		return new XMI2UMLHelperImpl(this);
	}

	@Override
	protected XMLLoad createXMLLoad() {
		return new XMI2UMLLoadImpl(createXMLHelper());
	}

	@Override
	protected XMLSave createXMLSave() {
		return new XMI2UMLSaveImpl(createXMLHelper());
	}

	@Override
	protected boolean assignIDsWhileLoading() {
		return false;
	}

}
