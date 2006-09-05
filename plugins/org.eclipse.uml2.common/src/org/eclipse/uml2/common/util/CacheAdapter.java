/*
 * Copyright (c) 2004, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: CacheAdapter.java,v 1.12.2.1 2006/09/05 20:04:00 khussey Exp $
 */
package org.eclipse.uml2.common.util;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class CacheAdapter
		extends ECrossReferenceAdapter {

	public static final CacheAdapter INSTANCE = new CacheAdapter();

	private final Map values = Collections.synchronizedMap(new HashMap());

	protected boolean adapting = false;

	public static CacheAdapter getCacheAdapter(Notifier notifier) {
		List eAdapters = notifier.eAdapters();

		for (int i = 0, size = eAdapters.size(); i < size; i++) {
			Object adapter = eAdapters.get(i);

			if (adapter instanceof CacheAdapter) {
				return (CacheAdapter) adapter;
			}
		}

		return null;
	}

	protected boolean addAdapter(EList adapters) {
		return adapters.contains(this)
			? false
			: adapters.add(this);
	}

	public boolean adapt(Notifier notifier) {
		boolean result = false;

		if (notifier != null) {
			adapting = true;
			result = addAdapter(notifier.eAdapters());
			adapting = false;
		}

		return result;
	}

	protected void addAdapter(Notifier notifier) {
		addAdapter(notifier.eAdapters());
	}

	protected void addAdapter(EObject eObject) {

		if (eObject != null && !eObject.eIsProxy()) {
			Resource eResource = eObject.eResource();

			if (eResource == null) {
				addAdapter(EcoreUtil.getRootContainer(eObject).eAdapters());
			} else {
				ResourceSet resourceSet = eResource.getResourceSet();

				if (resourceSet == null) {
					addAdapter(eResource.eAdapters());
				} else {
					addAdapter(resourceSet.eAdapters());
				}
			}
		}
	}

	public Collection getNonNavigableInverseReferences(EObject eObject) {
		addAdapter(eObject);

		return super.getNonNavigableInverseReferences(eObject);
	}

	public Collection getInverseReferences(EObject eObject) {
		addAdapter(eObject);

		return super.getInverseReferences(eObject);
	}

	public void handleCrossReference(EObject eObject) {
		inverseCrossReferencer.add(eObject);
	}

	public void setTarget(Notifier target) {

		if (!adapting) {
			super.setTarget(target);
		}
	}

	protected void unsetTarget(EObject target) {
		super.unsetTarget(target);

		clear(target.eResource());
	}

	protected void unsetTarget(Resource target) {
		super.unsetTarget(target);

		clear(target);
	}

	public void notifyChanged(Notification msg) {
		super.notifyChanged(msg);

		Object notifier = msg.getNotifier();

		if (notifier instanceof EObject) {
			clear(((EObject) notifier).eResource());
		} else if (notifier instanceof Resource) {

			if (msg.getFeatureID(Resource.class) == Resource.RESOURCE__CONTENTS) {
				clear();
			}
		}
	}

	public void clear() {
		values.clear();
	}

	public void clear(Resource resource) {
		values.remove(resource);

		if (resource != null) {
			values.remove(null);
		}
	}

	public boolean containsKey(EObject eObject, Object key) {
		return containsKey(null, eObject, key);
	}

	public boolean containsKey(Resource resource, EObject eObject, Object key) {
		Map resourceMap = (Map) values.get(resource);

		if (resourceMap != null) {
			Map eObjectMap = (Map) resourceMap.get(eObject);

			if (eObjectMap != null) {
				return eObjectMap.containsKey(key);
			}
		}

		return false;
	}

	public Object get(EObject eObject, Object key) {
		return get(null, eObject, key);
	}

	public Object get(Resource resource, EObject eObject, Object key) {
		Map resourceMap = (Map) values.get(resource);

		if (resourceMap != null) {
			Map eObjectMap = (Map) resourceMap.get(eObject);

			if (eObjectMap != null) {
				return eObjectMap.get(key);
			}
		}

		return null;
	}

	public Object put(EObject eObject, Object key, Object value) {
		return put(null, eObject, key, value);
	}

	public Object put(Resource resource, EObject eObject, Object key,
			Object value) {

		if (key == null) {
			throw new IllegalArgumentException(String.valueOf(key));
		}

		Map resourceMap = (Map) values.get(resource);

		if (resourceMap == null) {
			resourceMap = new HashMap();

			values.put(resource, resourceMap);
		}

		Map eObjectMap = (Map) resourceMap.get(eObject);

		if (eObjectMap == null) {
			eObjectMap = new HashMap();

			resourceMap.put(eObject, eObjectMap);
		}

		return eObjectMap.put(key, value);
	}

	protected boolean resolve() {
		return false;
	}

	protected boolean isIncluded(EReference eReference) {
		return super.isIncluded(eReference) && eReference.isChangeable();
	}

}