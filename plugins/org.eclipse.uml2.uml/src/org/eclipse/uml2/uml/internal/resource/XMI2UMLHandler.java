/*
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: XMI2UMLHandler.java,v 1.2.2.2 2006/10/18 18:01:37 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.resource;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EMOFExtendedMetaData;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resource.XMI2UMLResource;

public class XMI2UMLHandler
		extends UMLHandler {

	protected static final String PRIMITIVE_TYPE_BOOLEAN = "Boolean"; //$NON-NLS-1$

	protected static final String PRIMITIVE_TYPE_BOOLEAN_URI = UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI + '#' + PRIMITIVE_TYPE_BOOLEAN;

	protected static final String PRIMITIVE_TYPE_INTEGER = "Integer"; //$NON-NLS-1$

	protected static final String PRIMITIVE_TYPE_INTEGER_URI = UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI + '#' + PRIMITIVE_TYPE_INTEGER;

	protected static final String PRIMITIVE_TYPE_STRING = "String"; //$NON-NLS-1$

	protected static final String PRIMITIVE_TYPE_STRING_URI = UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI + '#' + PRIMITIVE_TYPE_STRING;

	protected static final String PRIMITIVE_TYPE_UNLIMITED_NATURAL = "UnlimitedNatural"; //$NON-NLS-1$

	protected static final String PRIMITIVE_TYPE_UNLIMITED_NATURAL_URI = UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI + '#' + PRIMITIVE_TYPE_UNLIMITED_NATURAL;

	protected static final String ECORE_EXTENSION_TYPE = "ecoreExtension"; //$NON-NLS-1$

	protected final static String XMI_IDREF = "idref"; //$NON-NLS-1$

	protected final static String IDREF_ATTRIB = XMIResource.XMI_NS + ':' + XMI_IDREF;

	public XMI2UMLHandler(XMLResource xmiResource, XMLHelper helper, Map options) {
		super(xmiResource, helper, options);
	}

	protected void handleProxy(InternalEObject proxy, String uriLiteral) {

		if (uriLiteral.startsWith(XMI2UMLResource.UML_METAMODEL_URI)
			|| uriLiteral.startsWith(XMI2UMLResource.UML_METAMODEL_2_1_URI)) {

			if (uriLiteral.endsWith(PRIMITIVE_TYPE_BOOLEAN)) {
				uriLiteral = PRIMITIVE_TYPE_BOOLEAN_URI;
			} else if (uriLiteral.endsWith(PRIMITIVE_TYPE_INTEGER)) {
				uriLiteral = PRIMITIVE_TYPE_INTEGER_URI;
			} else if (uriLiteral.endsWith(PRIMITIVE_TYPE_STRING)) {
				uriLiteral = PRIMITIVE_TYPE_STRING_URI;
			} else if (uriLiteral.endsWith(PRIMITIVE_TYPE_UNLIMITED_NATURAL)) {
				uriLiteral = PRIMITIVE_TYPE_UNLIMITED_NATURAL_URI;
			} else {
				uriLiteral = UMLResource.UML_METAMODEL_URI
					+ uriLiteral.substring(uriLiteral.indexOf('#'));
			}
		} else if (uriLiteral.startsWith(XMI2UMLResource.STANDARD_PROFILE_URI)
			|| uriLiteral.startsWith(XMI2UMLResource.STANDARD_PROFILE_2_1_URI)) {

			uriLiteral = UMLResource.STANDARD_PROFILE_URI
				+ uriLiteral.substring(uriLiteral.indexOf('#'));
		}

		super.handleProxy(proxy, uriLiteral);
	}

	protected void processElement(String name, String prefix, String localName) {

		if (EMOFExtendedMetaData.EXTENSION.equals(localName)
			&& XMI2UMLResource.XMI_NS_URI.equals(helper.getURI(prefix))
			&& attribs != null
			&& EcorePackage.eNS_URI.equals(attribs
				.getValue(EMOFExtendedMetaData.XMI_EXTENDER_ATTRIBUTE))) {

			types.push(ECORE_EXTENSION_TYPE);
		} else {
			super.processElement(name, prefix, localName);
		}
	}

	public void endElement(String uri, String localName, String name) {

		if (types.peek() == ECORE_EXTENSION_TYPE) {
			elements.pop();
			types.pop();
			helper.popContext();
			mixedTargets.pop();
		} else {
			super.endElement(uri, localName, name);
		}
	}

	protected void setAttribValue(EObject object, String name, String value) {

		if (IDREF_ATTRIB.equals(name)
			&& (!recordUnknownFeature || types.peek() != UNKNOWN_FEATURE_TYPE)) {

			handleProxy((InternalEObject) object, '#' + value);
		} else {
			super.setAttribValue(object, name, value);
		}
	}

}
