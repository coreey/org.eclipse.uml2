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
 * $Id: SupersetEObjectWithInverseResolvingEList.java,v 1.3.2.1 2004/09/01 18:17:31 khussey Exp $
 */
package org.eclipse.uml2.internal.util;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 *  
 */
public class SupersetEObjectWithInverseResolvingEList
	extends SupersetEObjectWithInverseEList {

	public static class Unsettable
		extends SupersetEObjectWithInverseResolvingEList {

		public static class ManyInverse
			extends Unsettable {

			public ManyInverse(Class dataClass, InternalEObject owner,
					int featureID, int[] subsetFeatureIDs, int inverseFeatureID) {
				super(dataClass, owner, featureID, subsetFeatureIDs,
					inverseFeatureID);
			}

			public ManyInverse(Class dataClass, InternalEObject owner,
					int featureID, int subsetFeatureID, int inverseFeatureID) {
				this(dataClass, owner, featureID, new int[]{subsetFeatureID},
					inverseFeatureID);
			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.eclipse.emf.ecore.util.EcoreEList#hasManyInverse()
			 */
			protected boolean hasManyInverse() {
				return true;
			}
		}

		protected boolean isSet;

		public Unsettable(Class dataClass, InternalEObject owner,
				int featureID, int[] subsetFeatureIDs, int inverseFeatureID) {
			super(dataClass, owner, featureID, subsetFeatureIDs,
				inverseFeatureID);
		}

		public Unsettable(Class dataClass, InternalEObject owner,
				int featureID, int subsetFeatureID, int inverseFeatureID) {
			this(dataClass, owner, featureID, new int[]{subsetFeatureID},
				inverseFeatureID);
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

	public static class ManyInverse
		extends SupersetEObjectWithInverseResolvingEList {

		public ManyInverse(Class dataClass, InternalEObject owner,
				int featureID, int[] subsetFeatureIDs, int inverseFeatureID) {
			super(dataClass, owner, featureID, subsetFeatureIDs,
				inverseFeatureID);
		}

		public ManyInverse(Class dataClass, InternalEObject owner,
				int featureID, int subsetFeatureID, int inverseFeatureID) {
			this(dataClass, owner, featureID, new int[]{subsetFeatureID},
				inverseFeatureID);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.emf.ecore.util.EcoreEList#hasManyInverse()
		 */
		protected boolean hasManyInverse() {
			return true;
		}
	}

	public SupersetEObjectWithInverseResolvingEList(Class dataClass,
			InternalEObject owner, int featureID, int[] subsetFeatureIDs,
			int inverseFeatureID) {
		super(dataClass, owner, featureID, subsetFeatureIDs, inverseFeatureID);
	}

	public SupersetEObjectWithInverseResolvingEList(Class dataClass,
			InternalEObject owner, int featureID, int subsetFeatureID,
			int inverseFeatureID) {
		this(dataClass, owner, featureID, new int[]{subsetFeatureID},
			inverseFeatureID);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.util.EcoreEList#hasProxies()
	 */
	protected boolean hasProxies() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.util.BasicEList#resolve(int,
	 *      java.lang.Object)
	 */
	protected Object resolve(int index, Object object) {
		return resolve(index, (EObject) object);
	}

}