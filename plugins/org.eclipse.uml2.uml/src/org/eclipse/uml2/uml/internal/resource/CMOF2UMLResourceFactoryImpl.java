/*
 * Copyright (c) 2007, 2018 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   Kenn Hussey (IBM Corporation, Embarcadero Technologies) - initial API and implementation
 *   Kenn Hussey (CEA) - 351774, 364419, 418466
 *   Kenn Hussey - 535301
 *
 */
package org.eclipse.uml2.uml.internal.resource;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.mapping.ecore2xml.Ecore2XMLPackage;
import org.eclipse.emf.mapping.ecore2xml.Ecore2XMLRegistry;
import org.eclipse.emf.mapping.ecore2xml.impl.Ecore2XMLRegistryImpl;
import org.eclipse.emf.mapping.ecore2xml.util.Ecore2XMLResource;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.CMOF2UMLExtendedMetaData;
import org.eclipse.uml2.uml.resource.CMOF2UMLResource;
import org.eclipse.uml2.uml.resource.CMOF2UMLResourceHandler;

public class CMOF2UMLResourceFactoryImpl
		extends UMLResourceFactoryImpl
		implements CMOF2UMLResource.Factory {

	public CMOF2UMLResourceFactoryImpl() {
		super();
	}

	@Override
	public Resource createResourceGen(URI uri) {
		CMOF2UMLResource result = new CMOF2UMLResourceImpl(uri);
		result.setEncoding(CMOF2UMLResource.DEFAULT_ENCODING);
		return result;
	}

	@Override
	public Resource createResource(URI uri) {
		CMOF2UMLResource resource = (CMOF2UMLResource) super
			.createResource(uri);

		Map<Object, Object> defaultLoadOptions = resource
			.getDefaultLoadOptions();

		EPackage.Registry ePackageRegistry = new EPackageRegistryImpl(
			EPackage.Registry.INSTANCE);

		ePackageRegistry.put(Ecore2XMLPackage.eNS_URI,
			Ecore2XMLPackage.eINSTANCE);
		ePackageRegistry.put(CMOF2UMLResource.CMOF_METAMODEL_NS_URI,
			UMLPackage.eINSTANCE);

		ePackageRegistry
			.put(
				"platform:/plugin/org.eclipse.uml2.uml/model/UML.ecore", UMLPackage.eINSTANCE); //$NON-NLS-1$

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.setPackageRegistry(ePackageRegistry);

		resourceSet
			.getResourceFactoryRegistry()
			.getExtensionToFactoryMap()
			.put(Ecore2XMLResource.FILE_EXTENSION,
				Ecore2XMLResource.Factory.INSTANCE);

		Ecore2XMLRegistry ecore2xmlRegistry = new Ecore2XMLRegistryImpl(
			Ecore2XMLRegistry.INSTANCE);

		ecore2xmlRegistry
			.put(
				CMOF2UMLResource.CMOF_METAMODEL_NS_URI,
				EcoreUtil.getObjectByType(
					resourceSet
						.getResource(
							URI.createURI("platform:/plugin/org.eclipse.uml2.uml/model/CMOF_2_UML.ecore2xml"), //$NON-NLS-1$
							true).getContents(),
					Ecore2XMLPackage.Literals.XML_MAP));

		ExtendedMetaData extendedMetaData = new CMOF2UMLExtendedMetaData(
			ePackageRegistry, ecore2xmlRegistry);

		defaultLoadOptions.put(XMLResource.OPTION_EXTENDED_META_DATA,
			extendedMetaData);
		defaultLoadOptions.put(XMLResource.OPTION_LAX_FEATURE_PROCESSING,
			Boolean.FALSE);

		XMLResource.ResourceHandler resourceHandler = new CMOF2UMLResourceHandler();

		defaultLoadOptions.put(XMLResource.OPTION_RESOURCE_HANDLER,
			resourceHandler);

		Map<Object, Object> defaultSaveOptions = resource
			.getDefaultSaveOptions();

		defaultSaveOptions.put(XMLResource.OPTION_EXTENDED_META_DATA,
			extendedMetaData);
		defaultSaveOptions.put(XMLResource.OPTION_SAVE_TYPE_INFORMATION,
			Boolean.TRUE);
		defaultSaveOptions.put(XMLResource.OPTION_RESOURCE_HANDLER,
			resourceHandler);

		return resource;
	}

}
