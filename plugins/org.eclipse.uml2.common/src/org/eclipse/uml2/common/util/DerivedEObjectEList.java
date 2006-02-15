/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: DerivedEObjectEList.java,v 1.6 2006/02/15 16:36:16 khussey Exp $
 */
package org.eclipse.uml2.common.util;

import java.util.AbstractSequentialList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.util.InternalEList;

public class DerivedEObjectEList
		extends AbstractSequentialList
		implements EStructuralFeature.Setting, InternalEList.Unsettable {

	protected class DerivedListIterator
			implements ListIterator {

		protected int index = 0;

		protected int featureIndex = 0;

		protected InternalEList values = null;

		protected ListIterator valuesIterator = null;

		protected int valuesIndex = -1;

		protected int valuesSize = 0;

		protected EStructuralFeature preparedFeature = null;

		protected EList preparedValues = new UniqueEList.FastCompare();

		protected int prepared = 0;

		protected boolean scanNext(EStructuralFeature nextFeature,
				InternalEList nextValues, ListIterator nextValuesIterator) {
			boolean isFeatureMap = FeatureMapUtil.isFeatureMap(nextFeature);

			while (nextValuesIterator.hasNext()) {
				Object nextValue = nextValuesIterator.next();

				if (isFeatureMap) {
					FeatureMap.Entry entry = (FeatureMap.Entry) nextValue;
					nextFeature = entry.getEStructuralFeature();
					nextValue = entry.getValue();
				}

				if ((isIncluded(nextFeature)
					? nextValue != null
					: isIncluded(nextValue)) && preparedValues.add(nextValue)) {

					values = nextValues;
					valuesIterator = nextValuesIterator;
					preparedFeature = nextFeature;
					return true;
				}
			}

			return false;
		}

		protected boolean scanNext(EStructuralFeature nextFeature,
				InternalEList nextValues, int nextValuesIndex,
				int nextValuesSize) {
			boolean isFeatureMap = FeatureMapUtil.isFeatureMap(nextFeature);

			while (nextValuesIndex < nextValuesSize) {
				Object nextValue = resolve()
					? nextValues.get(nextValuesIndex)
					: nextValues.basicGet(nextValuesIndex);

				if (isFeatureMap) {
					FeatureMap.Entry entry = (FeatureMap.Entry) nextValue;
					nextFeature = entry.getEStructuralFeature();
					nextValue = entry.getValue();
				}

				if ((isIncluded(nextFeature)
					? nextValue != null
					: isIncluded(nextValue)) && preparedValues.add(nextValue)) {

					values = nextValues;
					valuesIterator = null;
					valuesIndex = nextValuesIndex;
					valuesSize = nextValuesSize;
					preparedFeature = nextFeature;
					return true;
				} else {
					nextValuesIndex++;
				}
			}

			return false;
		}

		protected boolean prepareNext() {

			if (values == null || (valuesIterator == null
				? !scanNext(preparedFeature, values, valuesIndex, valuesSize)
				: !scanNext(preparedFeature, values, valuesIterator))) {

				while (featureIndex < sourceFeatureIDs.length) {
					int sourceFeatureID = sourceFeatureIDs[featureIndex++];

					if (owner.eIsSet(sourceFeatureID)) {
						EStructuralFeature sourceFeature = getEStructuralFeature(sourceFeatureID);
						Object value = owner.eGet(sourceFeatureID, resolve(),
							true);

						if (sourceFeature.isMany()
							|| FeatureMapUtil.isFeatureMap(sourceFeature)) {

							InternalEList valuesList = (InternalEList) value;

							if (valuesList instanceof RandomAccess
								? scanNext(sourceFeature, valuesList, 0,
									valuesList.size())
								: scanNext(sourceFeature, valuesList, resolve()
									? valuesList.listIterator()
									: valuesList.basicListIterator())) {

								prepared = 3;
								return true;
							}
						} else if ((isIncluded(sourceFeature)
							? value != null
							: isIncluded(value)) && preparedValues.add(value)) {

							values = null;
							valuesIterator = null;
							preparedFeature = sourceFeature;
							prepared = 2;
							return true;
						}
					}
				}

				prepared = 1;
				return false;
			} else {
				prepared = 3;
				return true;
			}
		}

		public boolean hasNext() {

			switch (prepared) {
				case 3 :
				case 2 :
					return true;
				case 1 :
					return false;
				case -3 :

					if (valuesIterator == null) {
						valuesIndex++;
					} else {
						valuesIterator.next();
					}
				default :
					return prepareNext();
			}
		}

		public Object next() {

			if (hasNext()) {
				prepared = 0;
				Object next = preparedValues.get(index++);
				hasNext();
				return next;
			} else {
				throw new NoSuchElementException();
			}
		}

		protected boolean scanPrevious(EStructuralFeature previousFeature,
				InternalEList previousValues,
				ListIterator previousValuesIterator) {
			boolean isFeatureMap = FeatureMapUtil.isFeatureMap(previousFeature);

			while (previousValuesIterator.hasPrevious()) {
				Object previousValue = previousValuesIterator.previous();

				if (isFeatureMap) {
					FeatureMap.Entry entry = (FeatureMap.Entry) previousValue;
					previousFeature = entry.getEStructuralFeature();
					previousValue = entry.getValue();
				}

				if (index > 0 && previousValue == preparedValues.get(index - 1)) {
					values = previousValues;
					valuesIterator = previousValuesIterator;
					preparedFeature = previousFeature;
					return true;
				}
			}

			return false;
		}

		protected boolean scanPrevious(EStructuralFeature previousFeature,
				InternalEList previousValues, int previousValuesIndex,
				int previousValuesSize) {
			boolean isFeatureMap = FeatureMapUtil.isFeatureMap(previousFeature);

			while (--previousValuesIndex >= 0) {
				Object previousValue = resolve()
					? previousValues.get(previousValuesIndex)
					: previousValues.basicGet(previousValuesIndex);

				if (isFeatureMap) {
					FeatureMap.Entry entry = (FeatureMap.Entry) previousValue;
					previousFeature = entry.getEStructuralFeature();
					previousValue = entry.getValue();
				}

				if (index > 0 && previousValue == preparedValues.get(index - 1)) {
					values = previousValues;
					valuesIterator = null;
					valuesIndex = previousValuesIndex;
					valuesSize = previousValuesSize;
					preparedFeature = previousFeature;
					return true;
				}
			}

			return false;
		}

		protected boolean preparePrevious() {

			if (values == null
				|| (valuesIterator == null
					? !scanPrevious(preparedFeature, values, valuesIndex + 1,
						valuesSize)
					: !scanPrevious(preparedFeature, values, valuesIterator))) {

				while (featureIndex > 0) {
					int sourceFeatureID = sourceFeatureIDs[--featureIndex];

					if (owner.eIsSet(sourceFeatureID)) {
						EStructuralFeature sourceFeature = getEStructuralFeature(sourceFeatureID);
						Object value = owner.eGet(sourceFeatureID, resolve(),
							true);

						if (sourceFeature.isMany()
							|| FeatureMapUtil.isFeatureMap(sourceFeature)) {

							InternalEList valuesList = (InternalEList) value;
							int valuesListSize = valuesList.size();

							if (valuesList instanceof RandomAccess
								? scanPrevious(sourceFeature, valuesList,
									valuesListSize, valuesListSize)
								: scanPrevious(sourceFeature, valuesList,
									resolve()
										? valuesList
											.listIterator(valuesListSize)
										: valuesList
											.basicListIterator(valuesListSize))) {

								prepared = -3;
								return true;
							}
						} else if (index > 0
							&& value == preparedValues.get(index - 1)) {

							values = null;
							valuesIterator = null;
							preparedFeature = sourceFeature;
							prepared = -2;
							return true;
						}
					}
				}

				prepared = -1;
				return false;
			} else {
				prepared = -3;
				return true;
			}
		}

		public boolean hasPrevious() {

			switch (prepared) {
				case -3 :
				case -2 :
					return true;
				case -1 :
					return false;
				case 3 :

					if (valuesIterator == null) {
						--valuesIndex;
					} else {
						valuesIterator.previous();
					}
				default :
					return preparePrevious();
			}
		}

		public Object previous() {

			if (prepared < -1 || hasPrevious()) {
				prepared = 0;
				Object previous = preparedValues.remove(--index);
				hasPrevious();
				return previous;
			} else {
				throw new NoSuchElementException();
			}
		}

		public int nextIndex() {
			return index;
		}

		public int previousIndex() {
			return index - 1;
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}

		public void set(Object element) {
			throw new UnsupportedOperationException();
		}

		public void add(Object element) {
			throw new UnsupportedOperationException();
		}

		protected boolean resolve() {
			return false;
		}

	}

	protected class EmptyDerivedListIterator
			extends DerivedListIterator {

		public boolean hasNext() {
			return false;
		}

		public boolean hasPrevious() {
			return false;
		}
	}

	protected class ResolvingDerivedListIterator
			extends DerivedListIterator {

		protected boolean resolve() {
			return true;
		}

	}

	protected final Class dataClass;

	protected final InternalEObject owner;

	protected final int featureID;

	protected final int[] sourceFeatureIDs;

	public DerivedEObjectEList(Class dataClass, InternalEObject owner,
			int featureID, int[] sourceFeatureIDs) {
		super();

		this.dataClass = dataClass;
		this.owner = owner;
		this.featureID = featureID;
		this.sourceFeatureIDs = sourceFeatureIDs;
	}

	public Object get(boolean resolve) {
		return this;
	}

	public EObject getEObject() {
		return owner;
	}

	public EStructuralFeature getEStructuralFeature() {
		return getEStructuralFeature(featureID);
	}

	public EStructuralFeature getEStructuralFeature(int featureID) {
		return owner.eClass().getEStructuralFeature(featureID);
	}

	public boolean isSet() {
		return !isEmpty();
	}

	public void set(Object newValue) {
		clear();
		addAll((List) newValue);
	}

	public void unset() {
		clear();
	}

	public ListIterator listIterator(int index) {
		return listIterator(index, true);
	}

	public int size() {

		if (sourceFeatureIDs != null) {
			EList values = new UniqueEList.FastCompare();

			for (int i = 0; i < sourceFeatureIDs.length; i++) {
				int sourceFeatureID = sourceFeatureIDs[i];

				if (owner.eIsSet(sourceFeatureID)) {
					EStructuralFeature sourceFeature = getEStructuralFeature(sourceFeatureID);
					Object value = owner.eGet(sourceFeatureID, false, true);

					if (FeatureMapUtil.isFeatureMap(sourceFeature)) {
						FeatureMap featureMap = (FeatureMap) value;

						for (int j = 0, size = featureMap.size(); j < size; j++) {
							value = featureMap.getValue(j);

							if (isIncluded(featureMap.getEStructuralFeature(j))
								? value != null
								: isIncluded(value)) {

								values.add(value);
							}
						}
					} else if (isIncluded(sourceFeature)) {

						if (sourceFeature.isMany()) {
							InternalEList valuesList = (InternalEList) value;

							if (valuesList instanceof RandomAccess) {

								for (int j = 0, size = valuesList.size(); j < size; j++) {
									values.add(valuesList.basicGet(j));
								}
							} else {

								for (Iterator v = valuesList.basicIterator(); v
									.hasNext();) {

									values.add(v.next());
								}
							}
						} else if (value != null) {
							values.add(value);
						}
					} else {

						if (sourceFeature.isMany()) {
							InternalEList valuesList = (InternalEList) value;

							if (valuesList instanceof RandomAccess) {

								for (int j = 0, size = valuesList.size(); j < size; j++) {
									value = valuesList.basicGet(j);

									if (isIncluded(value)) {
										values.add(value);
									}
								}
							} else {

								for (Iterator v = valuesList.basicIterator(); v
									.hasNext();) {

									value = v.next();

									if (isIncluded(value)) {
										values.add(value);
									}
								}
							}
						} else if (isIncluded(value)) {
							values.add(value);
						}
					}
				}
			}

			return values.size();
		}

		return 0;
	}

	public boolean isEmpty() {

		if (sourceFeatureIDs != null) {

			for (int i = 0; i < sourceFeatureIDs.length; i++) {
				int sourceFeatureID = sourceFeatureIDs[i];

				if (owner.eIsSet(sourceFeatureID)) {
					EStructuralFeature sourceFeature = getEStructuralFeature(sourceFeatureID);
					Object value = owner.eGet(sourceFeatureID, false, true);

					if (FeatureMapUtil.isFeatureMap(sourceFeature)) {
						FeatureMap featureMap = (FeatureMap) value;

						for (int j = 0, size = featureMap.size(); j < size; j++) {

							if (isIncluded(featureMap.getEStructuralFeature(j))
								? featureMap.getValue(j) != null
								: isIncluded(featureMap.getValue(j))) {

								return false;
							}
						}
					} else if (isIncluded(sourceFeature)) {

						if (sourceFeature.isMany()
							? ((List) value).size() > 0
							: value != null) {

							return false;
						}
					} else {

						if (sourceFeature.isMany()) {
							InternalEList valuesList = (InternalEList) value;

							if (valuesList instanceof RandomAccess) {

								for (int j = 0, size = valuesList.size(); j < size; j++) {

									if (isIncluded(valuesList.basicGet(j))) {
										return false;
									}
								}
							} else {

								for (Iterator v = valuesList.basicIterator(); v
									.hasNext();) {

									if (isIncluded(v.next())) {
										return false;
									}
								}
							}
						} else if (isIncluded(value)) {
							return false;
						}
					}
				}
			}
		}

		return true;
	}

	public Object basicGet(int index) {
		return basicList().get(index);
	}

	public List basicList() {
		return new DerivedEObjectEList(dataClass, owner, featureID,
			sourceFeatureIDs) {

			public ListIterator listIterator(int index) {
				return basicListIterator(index);
			}
		};
	}

	public Iterator basicIterator() {
		return basicListIterator();
	}

	public ListIterator basicListIterator() {
		return basicListIterator(0);
	}

	public ListIterator basicListIterator(int index) {
		return listIterator(index, false);
	}

	public NotificationChain basicRemove(Object object,
			NotificationChain notifications) {
		remove(object);
		return notifications;
	}

	protected boolean isNotificationRequired() {
		return false;
	}

	protected NotificationImpl createNotification(int eventType,
			Object oldObject, Object newObject, int index, boolean wasSet) {
		return new NotificationImpl(eventType, oldObject, newObject, index,
			wasSet) {

			public Object getNotifier() {
				return owner;
			}

			public Object getFeature() {
				return getEStructuralFeature();
			}

			public int getFeatureID(Class expectedClass) {
				return featureID;
			}
		};
	}

	protected void dispatchNotification(Notification notification) {
		owner.eNotify(notification);
	}

	public NotificationChain basicAdd(Object object,
			NotificationChain notifications) {
		addUnique(object);
		return notifications;
	}

	public void add(int index, Object object) {
		addUnique(index, object);
	}

	public void addUnique(Object object) {
		addUnique(size(), object);
	}

	public void addUnique(int index, Object object) {

		if (isNotificationRequired()) {
			boolean oldIsSet = isSet();
			super.add(index, validate(index, object));
			NotificationImpl notification = createNotification(
				Notification.ADD, null, object, index, oldIsSet);
			dispatchNotification(notification);
		} else {
			super.add(index, validate(index, object));
		}
	}

	public Object remove(int index) {

		if (isNotificationRequired()) {
			boolean oldIsSet = isSet();
			NotificationImpl notification = createNotification(
				Notification.REMOVE, super.remove(index), null, index, oldIsSet);
			dispatchNotification(notification);
			return notification.getOldValue();
		} else {
			return super.remove(index);
		}
	}

	public Object set(int index, Object object) {
		return setUnique(index, object);
	}

	public Object setUnique(int index, Object object) {

		if (isNotificationRequired()) {
			boolean oldIsSet = isSet();
			Notification notification = createNotification(Notification.SET,
				super.set(index, validate(index, object)), object, index,
				oldIsSet);
			dispatchNotification(notification);
			return notification.getOldValue();
		} else {
			return super.set(index, validate(index, object));
		}
	}

	public void move(int newPosition, Object object) {
		throw new UnsupportedOperationException();
	}

	public Object move(int newPosition, int oldPosition) {
		throw new UnsupportedOperationException();
	}

	protected boolean isIncluded(EStructuralFeature feature) {
		return dataClass
			.isAssignableFrom(feature.getEType().getInstanceClass());
	}

	protected boolean isIncluded(Object object) {
		return dataClass.isInstance(object);
	}

	protected ListIterator newListIterator() {
		return new DerivedListIterator();
	}

	protected Object validate(int index, Object object) {

		if (!isIncluded(object)) {
			throw new IllegalArgumentException(String.valueOf(object));
		}

		return object;
	}

	protected ListIterator newResolvingListIterator() {
		return new ResolvingDerivedListIterator();
	}

	protected ListIterator newEmptyListIterator() {
		return new EmptyDerivedListIterator();
	}

	protected ListIterator listIterator(int index, boolean resolve) {

		if (sourceFeatureIDs == null || sourceFeatureIDs.length == 0) {

			if (index != 0) {
				throw new IndexOutOfBoundsException("index = " + index //$NON-NLS-1$
					+ ", size = 0"); //$NON-NLS-1$
			}

			return newEmptyListIterator();
		}

		ListIterator listIterator = resolve
			? newResolvingListIterator()
			: newListIterator();

		for (int i = 0; i < index; i++) {
			listIterator.next();
		}

		return listIterator;
	}

}
