/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: UML2Util.java,v 1.23.2.4 2007/07/04 13:14:19 khussey Exp $
 */
package org.eclipse.uml2.common.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.WeakHashMap;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.AbstractTreeIterator;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.util.EcoreSwitch;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.framework.Bundle;

/**
 * Utilities for working with EMF-based objects and resources.
 * 
 * @since 1.2
 */
public class UML2Util {

	protected UML2Util() {
		super();
	}

	/**
	 * An interface for classes that can determine matches based on some
	 * criteria.
	 */
	public static interface EObjectMatcher {

		/**
		 * Determines whether the specified object matches some criteria.
		 * 
		 * @param eObject
		 *            The candidate object.
		 * @return <code>true</code> if the object meets the criteria;
		 *         <code>false</code> otherwise.
		 */
		public boolean matches(EObject eObject);

	}

	/**
	 * A matcher that determines matches based on the class of candidate
	 * objects.
	 */
	public static class EClassMatcher
			implements EObjectMatcher {

		protected final EObject eObject;

		/**
		 * Constructs a new class matcher based on the specified object.
		 * 
		 * @param eObject
		 *            The object whose class is to be used as a match criterion.
		 */
		public EClassMatcher(EObject eObject) {
			super();

			this.eObject = eObject;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.uml2.common.util.UML2Util.EObjectMatcher#matches(org.eclipse.emf.ecore.EObject)
		 */
		public boolean matches(EObject otherEObject) {
			return eObject == null
				? false
				: (otherEObject == null
					? false
					: eObject.eClass() == otherEObject.eClass());
		}
	}

	/**
	 * A matcher that determines matches based on the class of, and the value
	 * for a specific structural feature held by, candidate objects.
	 */
	public static class EStructuralFeatureMatcher
			extends EClassMatcher {

		protected final EStructuralFeature eStructuralFeature;

		/**
		 * Constructs a new structural feature matcher based on the specified
		 * object.
		 * 
		 * @param eObject
		 *            The object whose class is to be used as a match criterion.
		 * @param eStructuralFeature
		 *            The structural feature whose value is to be used as a
		 *            match criterion.
		 */
		public EStructuralFeatureMatcher(EObject eObject,
				EStructuralFeature eStructuralFeature) {
			super(eObject);

			this.eStructuralFeature = eStructuralFeature;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.uml2.common.util.UML2Util.EClassMatcher#matches(org.eclipse.emf.ecore.EObject)
		 */
		public boolean matches(EObject otherEObject) {
			return super.matches(otherEObject)
				&& safeEquals(eObject.eGet(eStructuralFeature), otherEObject
					.eGet(eStructuralFeature));
		}
	}

	/**
	 * An interface for classes that can convert objects to another
	 * representation.
	 */
	public static interface Converter {

		/**
		 * Converts the specified objects using the specified options, reporting
		 * problems to the specified diagnostics, within the specified context.
		 * 
		 * @param eObjects
		 *            The objects to be converted.
		 * @param options
		 *            The options to use.
		 * @param diagnostics
		 *            The chain of diagnostics to which problems are to be
		 *            appended.
		 * @param context
		 *            The cache of context-specific information.
		 * @return Another representation of the objects.
		 */
		Collection convert(Collection eObjects, Map options,
				DiagnosticChain diagnostics, Map context);

	}

	/**
	 * The abstract parent of classes that can provide a textual representation
	 * of objects, classes, and features.
	 */
	public static abstract class QualifiedTextProvider {

		/**
		 * Retrieves a textual representation of the specified object.
		 * 
		 * @param eObject
		 *            The object for which to retrieve text.
		 * @return A textual representation of the object.
		 */
		public String getText(EObject eObject) {

			return eObject instanceof ENamedElement
				? ((ENamedElement) eObject).getName()
				: EMPTY_STRING;
		}

		/**
		 * Retrieves the string used to separate segments of qualified text.
		 * 
		 * @return The separator to be used.
		 */
		public abstract String getSeparator();

		/**
		 * Retrieves a textual representation of the specified structural
		 * feature.
		 * 
		 * @param eStructuralFeature
		 *            The feature for which to retrieve text.
		 * @return A textual representation of the feature.
		 */
		public String getFeatureText(EStructuralFeature eStructuralFeature) {
			return eStructuralFeature.getName();
		}

		/**
		 * Retrieves a textual representation of the specified object's class.
		 * 
		 * @param eObject
		 *            The object for which to retrieve text.
		 * @return A textual representation of the object's class.
		 */
		public String getClassText(EObject eObject) {
			return eObject.eClass().getName();
		}

	}

	/**
	 * The default URI converter for resource bundle look-ups.
	 */
	protected static final URIConverter DEFAULT_URI_CONVERTER = new URIConverterImpl();

	/**
	 * A cache of resource bundles.
	 */
	protected static final Map RESOURCE_BUNDLES = Collections
		.synchronizedMap(new WeakHashMap());

	/**
	 * The empty string.
	 */
	public static final String EMPTY_STRING = ""; //$NON-NLS-1$

	/**
	 * The platform line separator.
	 */
	protected static final String LINE_SEPARATOR = System.getProperties()
		.getProperty("line.separator"); //$NON-NLS-1$

	/**
	 * The scheme for platform URIs.
	 */
	public static final String URI_SCHEME_PLATFORM = "platform"; //$NON-NLS-1$

	/**
	 * The first segment for platform plugin URIs.
	 */
	public static final String URI_SEGMENT_PLUGIN = "plugin"; //$NON-NLS-1$

	/**
	 * The first segment for platform resource URIs.
	 */
	public static final String URI_SEGMENT_RESOURCE = "resource"; //$NON-NLS-1$

	/**
	 * The standard extension for properties files.
	 */
	public static final String PROPERTIES_FILE_EXTENSION = "properties"; //$NON-NLS-1$

	/**
	 * Retrieves the candidate resource bundle URIs based on the specified base
	 * URI and base segment in the specified locale.
	 * 
	 * @param baseURI
	 *            The base URI (i.e. without the last segment) for the candidate
	 *            resource bundle URIs.
	 * @param locale
	 *            The locale within which to base the candidate resource bundle
	 *            URIs.
	 * @param baseSegment
	 *            The base segment (i.e. the last segment without the extension)
	 *            for the candidate resource bundle URIs.
	 * @return The candidate resource bundle URIs with the base URI and base
	 *         segment in the locale.
	 */
	protected static List getResourceBundleURIs(URI baseURI, Locale locale,
			String baseSegment) {
		List resourceBundleURIs = new ArrayList();
		String language = locale.getLanguage();

		if (language.length() > 0) {
			baseSegment += ('_' + language);
			resourceBundleURIs.add(0, baseURI.appendSegment(baseSegment)
				.appendFileExtension(PROPERTIES_FILE_EXTENSION));

			String country = locale.getCountry();

			if (country.length() > 0) {
				baseSegment += ('_' + country);
				resourceBundleURIs.add(0, baseURI.appendSegment(baseSegment)
					.appendFileExtension(PROPERTIES_FILE_EXTENSION));

				String variant = locale.getVariant();

				if (variant.length() > 0) {
					baseSegment += ('_' + variant);
					resourceBundleURIs.add(0, baseURI
						.appendSegment(baseSegment).appendFileExtension(
							PROPERTIES_FILE_EXTENSION));
				}
			}
		}

		return resourceBundleURIs;
	}

	/**
	 * Retrieves the candidate resource bundle URIs for the specified URI in the
	 * specified locale (if specified).
	 * 
	 * @param uri
	 *            The URI upon which to base the candidate resource bundle URIs.
	 * @param locale
	 *            The locale within which to base the candidate resource bundle
	 *            URIs, or <code>null</code>.
	 * @return The candidate resource bundle URIs for the URI in the locale (if
	 *         specified).
	 */
	protected static List getResourceBundleURIs(URI uri, Locale locale) {
		List resourceBundleURIs = new ArrayList();
		URI baseURI = uri.trimSegments(1);
		String baseSegment = uri.trimFileExtension().lastSegment();

		if (baseSegment != null) {
			resourceBundleURIs.add(baseURI.appendSegment(baseSegment)
				.appendFileExtension(PROPERTIES_FILE_EXTENSION));

			if (locale != null) {
				Locale defaultLocale = Locale.getDefault();

				resourceBundleURIs.addAll(0, getResourceBundleURIs(baseURI,
					defaultLocale, baseSegment));

				if (!locale.equals(defaultLocale)) {
					resourceBundleURIs.addAll(0, getResourceBundleURIs(baseURI,
						locale, baseSegment));
				}
			}
		}

		return resourceBundleURIs;
	}

	/**
	 * Retrieves the (cached) resource bundle for the specified object in the
	 * specified locale (if specified).
	 * 
	 * @param eObject
	 *            The object for which to retrieve the resource bundle.
	 * @param locale
	 *            The locale in which to retrieve the resource bundle, or
	 *            <code>null</code>.
	 * @return The resource bundle for the object in the locale (if specified).
	 */
	protected static ResourceBundle getResourceBundle(EObject eObject,
			Locale locale) {
		Resource resource = eObject.eResource();

		if (resource != null) {
			Map resourceBundles = (Map) RESOURCE_BUNDLES.get(resource);

			if (resourceBundles == null) {
				RESOURCE_BUNDLES.put(resource, resourceBundles = Collections
					.synchronizedMap(new HashMap()));
			}

			if (!resourceBundles.containsKey(locale)) {
				ResourceSet resourceSet = resource.getResourceSet();
				URIConverter uriConverter = resourceSet == null
					? DEFAULT_URI_CONVERTER
					: resourceSet.getURIConverter();

				URI uri = resource.getURI();
				List resourceBundleURIs = getResourceBundleURIs(uri, locale);

				if (EcorePlugin.IS_ECLIPSE_RUNNING) {
					URI normalizedURI = uriConverter.normalize(uri);
					int segmentCount = normalizedURI.segmentCount();

					if (URI_SCHEME_PLATFORM.equals(normalizedURI.scheme())
						&& segmentCount > 2
						&& URI_SEGMENT_PLUGIN.equals(normalizedURI.segment(0))) {

						Bundle bundle = Platform.getBundle(normalizedURI
							.segment(1));

						if (bundle != null) {
							Bundle[] fragments = Platform.getFragments(bundle);

							if (fragments != null) {
								String[] trailingSegments = (String[]) normalizedURI
									.segmentsList().subList(2, segmentCount)
									.toArray(new String[]{});

								for (int f = 0; f < fragments.length; f++) {
									resourceBundleURIs.addAll(0,
										getResourceBundleURIs(normalizedURI
											.trimSegments(segmentCount - 1)
											.appendSegment(
												fragments[f].getSymbolicName())
											.appendSegments(trailingSegments),
											locale));
								}
							}
						}
					}
				}

				ResourceBundle resourceBundle = null;

				for (Iterator rbu = resourceBundleURIs.iterator(); rbu
					.hasNext();) {

					try {
						InputStream inputStream = uriConverter
							.createInputStream((URI) rbu.next());
						try {
							resourceBundle = new PropertyResourceBundle(
								inputStream);
						} finally {
							inputStream.close();
						}
						break;
					} catch (IOException ioe) {
						// ignore
					}
				}

				resourceBundles.put(locale, resourceBundle);
			}

			return (ResourceBundle) resourceBundles.get(locale);
		}

		return null;
	}

	/**
	 * Retrieves the (cached) resource bundle for the specified object,
	 * localized in the default locale if indicated.
	 * 
	 * @param eObject
	 *            The object for which to retrieve the resource bundle.
	 * @param localize
	 *            Whether to retrieve the resource bundle based on (the default)
	 *            locale.
	 * @return The resource bundle for the object (in the default locale).
	 */
	protected static ResourceBundle getResourceBundle(EObject eObject,
			boolean localize) {
		return getResourceBundle(eObject, localize
			? Locale.getDefault()
			: null);
	}

	/**
	 * Retrieves a string for the specified object, localized if indicated.
	 * 
	 * @param object
	 *            The object for which to retrieve a (localized) string.
	 * @param key
	 *            The key in the resource bundle.
	 * @param defaultString
	 *            The string to return if no string for the given key can be
	 *            found.
	 * @param localize
	 *            Whether the string should be localized.
	 * @return The (localized) string.
	 */
	protected static String getString(EObject eObject, String key,
			String defaultString, boolean localize) {
		String string = defaultString;

		if (eObject != null) {

			try {
				ResourceBundle resourceBundle = getResourceBundle(eObject,
					localize);

				if (resourceBundle != null) {
					string = resourceBundle.getString(key);
				}
			} catch (MissingResourceException mre) {
				// ignore
			}
		}

		return string;
	}

	/**
	 * Retrieves a qualified textual representation of the specified object
	 * using the specified qualified text provider.
	 * 
	 * @param eObject
	 *            The object for which to retrieve qualified text.
	 * @param qualifiedTextProvider
	 *            The provider to be used.
	 * @return A qualified textual representation of the object.
	 */
	public static String getQualifiedText(EObject eObject,
			QualifiedTextProvider qualifiedTextProvider) {

		return getQualifiedText(eObject, qualifiedTextProvider,
			new StringBuffer()).toString();
	}

	protected static StringBuffer getQualifiedText(EObject eObject,
			QualifiedTextProvider qualifiedTextProvider,
			StringBuffer qualifiedText) {

		EObject eContainer = eObject == null
			? null
			: eObject.eContainer();

		if (eContainer != null) {
			getQualifiedText(eContainer, qualifiedTextProvider, qualifiedText);

			if (qualifiedText.length() > 0) {
				qualifiedText.append(qualifiedTextProvider.getSeparator());
			}
		}

		return getQualifiedTextSegment(eObject, qualifiedTextProvider,
			qualifiedText);
	}

	protected static StringBuffer getQualifiedTextSegment(EObject eObject,
			QualifiedTextProvider qualifiedTextProvider,
			StringBuffer qualifiedText) {

		String text = qualifiedTextProvider.getText(eObject);

		if (!isEmpty(text)) {
			return qualifiedText.append(text);
		} else if (eObject == null) {
			return qualifiedText.append(String.valueOf(eObject));
		}

		qualifiedText.append('{');

		EStructuralFeature eContainingFeature = eObject.eContainingFeature();

		if (eContainingFeature != null) {
			qualifiedText.append(qualifiedTextProvider
				.getFeatureText(eContainingFeature));

			if (eContainingFeature.isMany()) {
				qualifiedText.append(' ');

				List list = (List) eObject.eContainer().eGet(
					eContainingFeature, false);

				qualifiedText.append('[');
				qualifiedText.append(list.indexOf(eObject));
				qualifiedText.append(']');
			}

			qualifiedText.append(' ');
		}

		qualifiedText.append(qualifiedTextProvider.getClassText(eObject));
		qualifiedText.append('}');

		return qualifiedText;
	}

	protected static String getMessageSubstitution(Map context, Object object) {

		if (object instanceof EObject) {
			EObject eObject = (EObject) object;

			if (context != null) {
				EValidator.SubstitutionLabelProvider substitutionLabelProvider = (EValidator.SubstitutionLabelProvider) context
					.get(EValidator.SubstitutionLabelProvider.class);

				if (substitutionLabelProvider != null) {
					return substitutionLabelProvider.getObjectLabel(eObject);
				}

				QualifiedTextProvider qualifiedTestProvider = (QualifiedTextProvider) context
					.get(QualifiedTextProvider.class);

				if (qualifiedTestProvider != null) {
					return getQualifiedText(eObject, qualifiedTestProvider);
				}
			}

			Resource resource = eObject.eResource();

			if (resource != null) {
				return resource.getURI().lastSegment() + '#'
					+ resource.getURIFragment(eObject);
			}

			return EcoreUtil.getIdentification((EObject) object);
		} else {
			return String.valueOf(object);
		}
	}

	protected static Object[] getMessageSubstitutions(Map context,
			Object object0) {
		return new Object[]{getMessageSubstitution(context, object0)};
	}

	protected static Object[] getMessageSubstitutions(Map context,
			Object object0, Object object1) {
		return new Object[]{getMessageSubstitution(context, object0),
			getMessageSubstitution(context, object1)};
	}

	protected static Object[] getMessageSubstitutions(Map context,
			Object object0, Object object1, Object object2) {
		return new Object[]{getMessageSubstitution(context, object0),
			getMessageSubstitution(context, object1),
			getMessageSubstitution(context, object2)};
	}

	/**
	 * Safely determines whether <code>object</code> equals
	 * <code>otherObject</code>, i.e. without throwing an exception if
	 * <code>object</code> is <code>null</code>.
	 * 
	 * @param object
	 *            The first object to compare.
	 * @param otherObject
	 *            The second object to compare.
	 * @return <code>true</code> if <code>object</code> equals
	 *         <code>otherObject</code>; <code>false</code> otherwise.
	 */
	public static boolean safeEquals(Object object, Object otherObject) {
		return object == null
			? otherObject == null
			: object.equals(otherObject);
	}

	/**
	 * Determines whether the specified string is empty, i.e. is
	 * <code>null</code> or has a length of zero.
	 * 
	 * @param string
	 *            The string in question.
	 * @return <code>true</code> if the string is empty; <code>false</code>
	 *         otherwise.
	 */
	public static boolean isEmpty(String string) {
		return string == null || string.length() == 0;
	}

	/**
	 * Retrieves the first of the specified objects that matches the criteria
	 * used by the specified matcher.
	 * 
	 * @param eObjects
	 *            The collection of candidate objects.
	 * @param filter
	 *            The matcher to be used.
	 * @return The first object that matches the criteria.
	 */
	public static EObject findEObject(Collection eObjects, EObjectMatcher filter) {
		return findEObject(eObjects.iterator(), filter);
	}

	/**
	 * Retrieves the first of the specified objects that matches the criteria
	 * used by the specified matcher.
	 * 
	 * @param iterator
	 *            The iterator for the candidate objects.
	 * @param filter
	 *            The matcher to be used.
	 * @return The first object that matches the criteria.
	 */
	public static EObject findEObject(Iterator iterator, EObjectMatcher filter) {

		while (iterator.hasNext()) {
			EObject eObject = (EObject) iterator.next();

			if (filter.matches(eObject)) {
				return eObject;
			}
		}

		return null;
	}

	protected static EClassifier getCommonEType(EClassifier eType,
			final EClassifier otherEType) {

		if (eType == null || eType.equals(otherEType)) {
			return eType;
		} else {
			return (EClassifier) new EcoreSwitch() {

				public Object caseEClassifier(EClassifier eClassifier) {

					return EcorePackage.eINSTANCE.getEObject();
				}

				public Object caseEClass(EClass eClass) {

					if (otherEType instanceof EClass) {
						EClass otherEClass = (EClass) otherEType;

						if (eClass.isSuperTypeOf(otherEClass)) {
							return eClass;
						} else if (otherEClass.isSuperTypeOf(eClass)) {
							return otherEClass;
						}

						for (Iterator eAllSuperTypes = eClass
							.getEAllSuperTypes().iterator(); eAllSuperTypes
							.hasNext();) {

							EClass eSuperType = (EClass) eAllSuperTypes.next();

							if (eSuperType.isSuperTypeOf(otherEClass)) {
								return eSuperType;
							}
						}

						for (Iterator otherEAllSuperTypes = otherEClass
							.getEAllSuperTypes().iterator(); otherEAllSuperTypes
							.hasNext();) {

							EClass otherESuperType = (EClass) otherEAllSuperTypes
								.next();

							if (otherESuperType.isSuperTypeOf(eClass)) {
								return otherESuperType;
							}
						}
					}

					return super.caseEClass(eClass);
				}

				public Object caseEDataType(EDataType eDataType) {
					return otherEType instanceof EDataType
						&& eDataType.getInstanceClass().equals(
							((EDataType) otherEType).getInstanceClass())
						? eDataType
						: EcorePackage.eINSTANCE.getEJavaObject();
				}

				public Object caseEEnum(EEnum eEnum) {
					return otherEType instanceof EEnum
						? EcorePackage.eINSTANCE.getEEnumerator()
						: EcorePackage.eINSTANCE.getEJavaObject();
				}
			}.doSwitch(eType);
		}
	}

	protected static int getLesserLowerBound(int lowerBound, int otherLowerBound) {
		return Math.min(lowerBound, otherLowerBound);
	}

	protected static int getGreaterUpperBound(int upperBound,
			int otherUpperBound) {

		return upperBound == ETypedElement.UNBOUNDED_MULTIPLICITY
			|| otherUpperBound == ETypedElement.UNBOUNDED_MULTIPLICITY
			? ETypedElement.UNBOUNDED_MULTIPLICITY
			: Math.max(upperBound, otherUpperBound);
	}

	/**
	 * Obtains a valid Java identifier based on the specified name.
	 * 
	 * @param name
	 *            The name from which to obtain a valid identifier.
	 * @return A valid (Java) identifier.
	 */
	public static String getValidJavaIdentifier(String name) {
		return getValidJavaIdentifier(name, new StringBuffer()).toString();
	}

	/**
	 * Appends a valid Java identifier based on the specified name to the
	 * specified buffer.
	 * 
	 * @param name
	 *            The name from which to obtain the valid identifier.
	 * @param validJavaIdentifier
	 *            The buffer to which to append the valid identifier.
	 * @return The buffer.
	 */
	protected static StringBuffer getValidJavaIdentifier(String name,
			StringBuffer validJavaIdentifier) {

		if (isEmpty(name)) {
			validJavaIdentifier.append('_');
		} else {
			char char_0 = name.charAt(0);

			if (Character.isJavaIdentifierStart(char_0)) {
				validJavaIdentifier.append(char_0);
			} else {
				validJavaIdentifier.append('_');

				if (Character.isJavaIdentifierPart(char_0)) {
					validJavaIdentifier.append(char_0);
				}
			}

			for (int i = 1; i < name.length(); i++) {
				char char_i = name.charAt(i);

				if (Character.isJavaIdentifierPart(char_i)) {
					validJavaIdentifier.append(char_i);
				}
			}
		}

		return validJavaIdentifier;
	}

	protected static boolean isNCNameStart(char c) {
		return Character.isLetter(c) || c == '_';
	}

	protected static boolean isNCNamePart(char c) {
		return Character.isLetterOrDigit(c) || c == '.' || c == '-' || c == '_';
	}

	protected static String getValidNCName(String name) {
		return getValidNCName(name, new StringBuffer()).toString();
	}

	protected static StringBuffer getValidNCName(String name,
			StringBuffer validNCName) {

		if (isEmpty(name)) {
			validNCName.insert(0, '_');
		} else {

			for (int i = name.length(); --i > 0;) {
				char char_i = name.charAt(i);

				if (isNCNamePart(char_i)) {
					validNCName.insert(0, char_i);
				}
			}

			char char_0 = name.charAt(0);

			if (isNCNameStart(char_0)) {
				validNCName.insert(0, char_0);
			} else {

				if (isNCNamePart(char_0)) {
					validNCName.insert(0, char_0);
				}

				validNCName.insert(0, '_');
			}
		}

		return validNCName;
	}

	/**
	 * Obtains a valid XMI identifier for the specified object based on the URI
	 * fragment segments of its containment hierarchy.
	 * 
	 * @param internalEObject
	 *            The object for which to obtain an XMI identifier.
	 * @return An XMI identifier for the object.
	 */
	public static String getXMIIdentifier(InternalEObject internalEObject) {
		return getXMIIdentifier(internalEObject, new StringBuffer()).toString();
	}

	protected static StringBuffer getXMIIdentifier(
			InternalEObject internalEObject, StringBuffer xmiIdentifier) {
		InternalEObject eInternalContainer = internalEObject
			.eInternalContainer();
		Resource.Internal eDirectResource = internalEObject.eDirectResource();

		while (eInternalContainer != null && eDirectResource == null) {
			getValidNCName(eInternalContainer.eURIFragmentSegment(
				internalEObject.eContainingFeature(), internalEObject),
				xmiIdentifier);

			internalEObject = eInternalContainer;
			eInternalContainer = internalEObject.eInternalContainer();
			eDirectResource = internalEObject.eDirectResource();

			if (eInternalContainer != null && eDirectResource == null) {
				xmiIdentifier.insert(0, '-');
			}
		}

		if (eDirectResource != null) {
			int index = eDirectResource.getContents().indexOf(internalEObject);
			int length = xmiIdentifier.length();

			if (index > 0 || length == 0) {

				if (length > 0) {
					xmiIdentifier.insert(0, '-');
				}

				xmiIdentifier.insert(0, index);
				xmiIdentifier.insert(0, '_');
			}
		}

		return xmiIdentifier;
	}

	/**
	 * Counts the number of instances of the specified classifier.
	 * 
	 * @param iterator
	 *            The iterator for the candidate objects.
	 * @param eClassifier
	 *            The classifier in question.
	 * @return The number of the instances of the classifier.
	 */
	public static int getInstanceCount(Iterator iterator,
			EClassifier eClassifier) {
		int count = 0;

		while (iterator.hasNext()) {

			if (eClassifier.isInstance(iterator.next())) {
				count++;
			}
		}

		return count;
	}

	protected static boolean addConstraint(EModelElement eModelElement,
			String constraint) {

		if (isEmpty(constraint)) {
			return false;
		} else {
			List constraints = new ArrayList(EcoreUtil
				.getConstraints(eModelElement));

			boolean result = constraints.add(constraint);

			EcoreUtil.setConstraints(eModelElement, constraints);

			return result;
		}
	}

	protected static void addDocumentation(EModelElement eModelElement,
			String text) {

		if (!isEmpty(text)) {
			String documentation = EcoreUtil.getDocumentation(eModelElement);

			EcoreUtil.setDocumentation(eModelElement, documentation == null
				? text
				: documentation + LINE_SEPARATOR + text);
		}
	}

	protected static Collection getRootContainers(Collection eObjects) {
		Collection rootContainers = new UniqueEList.FastCompare();

		for (Iterator i = eObjects.iterator(); i.hasNext();) {
			rootContainers.add(EcoreUtil.getRootContainer((EObject) i.next()));
		}

		return rootContainers;
	}

	/**
	 * Retrieves an iterator over the content tree of the specified object which
	 * optionally includes the root object and/or copies contents while
	 * iterating.
	 * 
	 * @param eObject
	 *            The root of the content hierarchy.
	 * @param includeRoot
	 *            Whether to include the root object.
	 * @param defensiveCopy
	 *            Whether to copy contents while iterating.
	 * @return A content tree iterator.
	 */
	public static TreeIterator getAllContents(EObject eObject,
			boolean includeRoot, final boolean defensiveCopy) {
		return new AbstractTreeIterator(eObject, includeRoot) {

			protected Iterator getChildren(Object object) {
				return defensiveCopy
					? new ArrayList(((EObject) object).eContents()).iterator()
					: ((EObject) object).eContents().iterator();
			}
		};
	}

	/**
	 * Creates an annotation with the specified source on the specified model
	 * element.
	 * 
	 * @param eModelElement
	 *            The model element on which to create the annotation.
	 * @param source
	 *            The source for the new annotation.
	 * @return A new annotation.
	 */
	public static EAnnotation createEAnnotation(EModelElement eModelElement,
			String source) {
		EAnnotation eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
		eAnnotation.setEModelElement(eModelElement);
		eAnnotation.setSource(source);
		return eAnnotation;
	}

	/**
	 * Retrieves the annotation with the specified source on the specified model
	 * element, optionally creating one on demand if no such annotation exists.
	 * 
	 * @param eModelElement
	 *            The model element from/on which to retrieve/create the
	 *            annotation.
	 * @param source
	 *            The source for the (new) annotation.
	 * @param createOnDemand
	 *            Whether to create one if no such annotation exists.
	 * @return The (new) annotation.
	 */
	public static EAnnotation getEAnnotation(EModelElement eModelElement,
			String source, boolean createOnDemand) {
		EAnnotation eAnnotation = eModelElement.getEAnnotation(source);

		return eAnnotation == null && createOnDemand
			? createEAnnotation(eModelElement, source)
			: eAnnotation;
	}

	/**
	 * Retrieves a collection of non-navigable inverse references to the
	 * specified object.
	 * 
	 * @param eObject
	 *            The referenced object.
	 * @return The non-navigable inverse references to the object.
	 */
	public static Collection getNonNavigableInverseReferences(EObject eObject) {
		ECrossReferenceAdapter crossReferenceAdapter = ECrossReferenceAdapter
			.getCrossReferenceAdapter(eObject);
		return crossReferenceAdapter == null
			? Collections.EMPTY_LIST
			: crossReferenceAdapter.getNonNavigableInverseReferences(eObject);
	}

	/**
	 * Retrieves a collection of inverse references to the specified object.
	 * 
	 * @param eObject
	 *            The referenced object.
	 * @return The inverse references to the object.
	 */
	public static Collection getInverseReferences(EObject eObject) {
		ECrossReferenceAdapter crossReferenceAdapter = ECrossReferenceAdapter
			.getCrossReferenceAdapter(eObject);
		return crossReferenceAdapter == null
			? Collections.EMPTY_LIST
			: crossReferenceAdapter.getInverseReferences(eObject);
	}

	protected static void removeReferences(EObject eObject,
			EObject ancestorEObject) {
		List nonNavigableInverseReferences = new ArrayList(
			getNonNavigableInverseReferences(eObject));

		for (Iterator nnir = nonNavigableInverseReferences.iterator(); nnir
			.hasNext();) {

			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) nnir
				.next();

			if (setting.getEStructuralFeature().isChangeable()
				&& (ancestorEObject == null || !EcoreUtil.isAncestor(
					ancestorEObject, setting.getEObject()))) {

				EcoreUtil.remove(setting, eObject);
			}
		}

		for (Iterator eAllReferences = eObject.eClass().getEAllReferences()
			.iterator(); eAllReferences.hasNext();) {

			EReference eReference = (EReference) eAllReferences.next();

			if (eReference.isChangeable() && !eReference.isContainer()
				&& !eReference.isContainment() && eObject.eIsSet(eReference)) {

				if (eReference.isMany()) {

					for (Iterator values = ((List) eObject.eGet(eReference))
						.iterator(); values.hasNext();) {

						Object value = values.next();

						if (ancestorEObject == null
							|| !EcoreUtil.isAncestor(ancestorEObject,
								(EObject) value)) {

							values.remove();
						}
					}
				} else {

					if (ancestorEObject == null
						|| !EcoreUtil.isAncestor(ancestorEObject,
							(EObject) eObject.eGet(eReference))) {

						eObject.eUnset(eReference);
					}
				}
			}
		}
	}

	protected static void destroy(EObject eObject) {

		if (eObject.eContents().isEmpty()) {
			removeReferences(eObject, eObject);
			eObject.eAdapters().clear();
		} else {

			for (Iterator allContents = getAllContents(eObject, true, false); allContents
				.hasNext();) {

				removeReferences((EObject) allContents.next(), eObject);
			}

			for (Iterator allContents = getAllContents(eObject, true, false); allContents
				.hasNext();) {

				((EObject) allContents.next()).eAdapters().clear();
			}
		}

		EcoreUtil.remove(eObject);
	}

	protected static void destroyAll(Collection eObjects) {

		for (Iterator o = eObjects.iterator(); o.hasNext();) {
			destroy((EObject) o.next());
		}
	}

	/**
	 * Loads a resource with the specified URI into the specified resource set
	 * and retrieves the first instance of the specified class from its
	 * contents.
	 * 
	 * @param resourceSet
	 *            The resource set into which to load the resource.
	 * @param uri
	 *            The URI of the resource to be loaded.
	 * @param eClass
	 *            The class of the object to be retrieved.
	 * @return The first instance of the class in the resource.
	 */
	public static Object load(ResourceSet resourceSet, URI uri, EClass eClass) {

		try {
			return EcoreUtil.getObjectByType(resourceSet.getResource(uri, true)
				.getContents(), eClass);
		} catch (Exception e) {
			return null;
		}
	}

	protected static boolean intersect(Collection collection,
			Collection otherCollection) {

		if (!collection.isEmpty() && !collection.isEmpty()) {

			for (Iterator c = collection.iterator(); c.hasNext();) {

				if (otherCollection.contains(c.next())) {
					return true;
				}
			}
		}

		return false;
	}
}
