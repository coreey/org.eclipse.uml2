/*
 * Copyright (c) 2006, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: XMI2UMLSaveImpl.java,v 1.1.2.1 2007/01/31 22:19:52 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.resource;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EMOFExtendedMetaData;
import org.eclipse.emf.ecore.xmi.impl.XMISaveImpl;

public class XMI2UMLSaveImpl
		extends XMISaveImpl {

	private static class Lookup
			extends XMISaveImpl.Lookup {

		public Lookup(XMLResource.XMLMap map, ExtendedMetaData extendedMetaData) {
			super(map, extendedMetaData);
		}

		protected int featureKind(EStructuralFeature f) {
			return !f.isTransient()
				&& ((EStructuralFeature.Internal) f).isContainer()
				? (f.isUnsettable()
					? OBJECT_HREF_SINGLE_UNSETTABLE
					: OBJECT_HREF_SINGLE)
				: super.featureKind(f);
		}

	}

	public XMI2UMLSaveImpl(XMLHelper helper) {
		super(helper);
	}

	protected void init(XMLResource resource, Map options) {
		super.init(resource, options);

		featureTable = new Lookup(map, extendedMetaData);
	}

	protected void saveContainedMany(EObject eObject,
			EStructuralFeature eStructuralFeature) {

		if (eStructuralFeature == EcorePackage.Literals.EMODEL_ELEMENT__EANNOTATIONS) {
			doc.startElement(EMOFExtendedMetaData.XMI_EXTENSION_ELEMENT);
			doc.addAttribute(EMOFExtendedMetaData.XMI_EXTENDER_ATTRIBUTE,
				EcorePackage.eNS_URI);
			super.saveContainedMany(eObject, eStructuralFeature);
			doc.endElement();
		} else {
			super.saveContainedMany(eObject, eStructuralFeature);
		}
	}

}
