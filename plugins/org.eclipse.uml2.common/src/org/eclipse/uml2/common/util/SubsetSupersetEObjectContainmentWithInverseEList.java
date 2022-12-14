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
package org.eclipse.uml2.common.util;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * @since 1.2
 */
public class SubsetSupersetEObjectContainmentWithInverseEList<E>
		extends SubsetSupersetEObjectContainmentEList<E> {

	private static final long serialVersionUID = 1L;

	public static class Unsettable<E>
			extends SubsetSupersetEObjectContainmentWithInverseEList<E> {

		private static final long serialVersionUID = 1L;

		public static class Resolving<E>
				extends Unsettable<E> {

			private static final long serialVersionUID = 1L;

			public Resolving(Class<?> dataClass, InternalEObject owner,
					int featureID, int[] supersetFeatureIDs,
					int[] subsetFeatureIDs, int inverseFeatureID) {
				super(dataClass, owner, featureID, supersetFeatureIDs,
					subsetFeatureIDs, inverseFeatureID);
			}

			@Override
			protected boolean hasProxies() {
				return true;
			}

			@SuppressWarnings("unchecked")
			@Override
			protected E resolve(int index, E object) {
				return (E) resolve(index, (EObject) object);
			}
		}

		protected boolean isSet;

		public Unsettable(Class<?> dataClass, InternalEObject owner,
				int featureID, int[] supersetFeatureIDs,
				int[] subsetFeatureIDs, int inverseFeatureID) {
			super(dataClass, owner, featureID, supersetFeatureIDs,
				subsetFeatureIDs, inverseFeatureID);
		}

		@Override
		protected void didChange() {
			isSet = true;
		}

		@Override
		public boolean isSet() {
			return isSet;
		}

		@Override
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

	public static class Resolving<E>
			extends SubsetSupersetEObjectContainmentWithInverseEList<E> {

		private static final long serialVersionUID = 1L;

		public Resolving(Class<?> dataClass, InternalEObject owner,
				int featureID, int[] supersetFeatureIDs,
				int[] subsetFeatureIDs, int inverseFeatureID) {
			super(dataClass, owner, featureID, supersetFeatureIDs,
				subsetFeatureIDs, inverseFeatureID);
		}

		@Override
		protected boolean hasProxies() {
			return true;
		}

		@SuppressWarnings("unchecked")
		@Override
		protected E resolve(int index, E object) {
			return (E) resolve(index, (EObject) object);
		}
	}

	protected final int inverseFeatureID;

	public SubsetSupersetEObjectContainmentWithInverseEList(Class<?> dataClass,
			InternalEObject owner, int featureID, int[] supersetFeatureIDs,
			int[] subsetFeatureIDs, int inverseFeatureID) {
		super(dataClass, owner, featureID, supersetFeatureIDs, subsetFeatureIDs);

		this.inverseFeatureID = inverseFeatureID;
	}

	@Override
	protected boolean hasNavigableInverse() {
		return true;
	}

	@Override
	public int getInverseFeatureID() {
		return inverseFeatureID;
	}

	@Override
	public Class<?> getInverseFeatureClass() {
		return dataClass;
	}

}