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
 * $Id: SupersetEObjectEList.java,v 1.3.2.1 2004/09/01 19:02:49 khussey Exp $
 */
package org.eclipse.uml2.internal.util;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectEList;

/**
 *  
 */
public class SupersetEObjectEList
	extends EObjectEList {

	public static class Unsettable
		extends SupersetEObjectEList {

		protected boolean isSet;

		public Unsettable(Class dataClass, InternalEObject owner,
				int featureID, int[] subsetFeatureIDs) {
			super(dataClass, owner, featureID, subsetFeatureIDs);
		}

		public Unsettable(Class dataClass, InternalEObject owner,
				int featureID, int subsetFeatureID) {
			this(dataClass, owner, featureID, new int[]{subsetFeatureID});
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.emf.common.util.BasicEList#didChange()
		 */
		protected void didChange() {
			isSet = true;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.emf.common.notify.impl.NotifyingListImpl#isSet()
		 */
		public boolean isSet() {
			return isSet;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.emf.ecore.EStructuralFeature.Setting#unset()
		 */
		public void unset() {
			super.unset();

			if (isNotificationRequired()) {
				boolean oldIsSet = isSet;
				isSet = false;

				owner.eNotify(createNotification(Notification.UNSET, oldIsSet,
					false));
			} else {
				isSet = false;
			}
		}
	}

	protected final int[] subsetFeatureIDs;

	public SupersetEObjectEList(Class dataClass, InternalEObject owner,
			int featureID, int[] subsetFeatureIDs) {
		super(dataClass, owner, featureID);

		this.subsetFeatureIDs = subsetFeatureIDs;
	}

	public SupersetEObjectEList(Class dataClass, InternalEObject owner,
			int featureID, int subsetFeatureID) {
		this(dataClass, owner, featureID, new int[]{subsetFeatureID});
	}

	protected void subsetRemove(Object object) {

		for (int i = 0; i < subsetFeatureIDs.length; i++) {
			EStructuralFeature subsetEStructuralFeature = owner.eClass()
				.getEStructuralFeature(subsetFeatureIDs[i]);

			if (subsetEStructuralFeature.isMany()) {
				((EList) owner.eGet(subsetEStructuralFeature)).remove(object);
			} else {

				if (object.equals(owner.eGet(subsetEStructuralFeature))) {
					owner.eSet(subsetEStructuralFeature, null);
				}
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.BasicEList#didRemove(int,
	 *      java.lang.Object)
	 */
	protected void didRemove(int index, Object oldObject) {
		super.didRemove(index, oldObject);

		subsetRemove(oldObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.notify.impl.NotifyingListImpl#basicSet(int,
	 *      java.lang.Object, org.eclipse.emf.common.notify.NotificationChain)
	 */
	public NotificationChain basicSet(int index, Object object,
			NotificationChain notifications) {
		notifications = super.basicSet(index, object, notifications);

		subsetRemove(object);

		return notifications;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.List#set(int, java.lang.Object)
	 */
	public Object set(int index, Object object) {
		Object result = super.set(index, object);

		subsetRemove(object);

		return result;
	}

}