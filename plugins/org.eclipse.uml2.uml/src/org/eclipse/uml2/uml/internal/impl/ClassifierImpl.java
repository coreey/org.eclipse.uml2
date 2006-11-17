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
 * $Id: ClassifierImpl.java,v 1.36.2.1 2006/11/17 15:27:15 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectWithInverseResolvingEList;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ClassifierTemplateParameter;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ClassifierOperations;
import org.eclipse.uml2.uml.internal.operations.ParameterableElementOperations;
import org.eclipse.uml2.uml.internal.operations.RedefinableElementOperations;
import org.eclipse.uml2.uml.internal.operations.TemplateableElementOperations;

import org.eclipse.uml2.uml.internal.operations.TypeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getRedefinitionContexts <em>Redefinition Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#isLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getTemplateBindings <em>Template Binding</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getFeatures <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getMembers <em>Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getAttributes <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getClientDependencies <em>Client Dependency</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getCollaborationUses <em>Collaboration Use</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#isAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getGeneralizations <em>Generalization</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getPowertypeExtents <em>Powertype Extent</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getInheritedMembers <em>Inherited Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getRedefinedClassifiers <em>Redefined Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getGenerals <em>General</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getSubstitutions <em>Substitution</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getOwnedUseCases <em>Owned Use Case</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getUseCases <em>Use Case</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ClassifierImpl
		extends NamespaceImpl
		implements Classifier {

	/**
	 * The default value of the '{@link #isLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LEAF_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_LEAF_EFLAG = 1 << 10;

	/**
	 * The cached value of the '{@link #getTemplateParameter() <em>Template Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateParameter()
	 * @generated
	 * @ordered
	 */
	protected TemplateParameter templateParameter = null;

	/**
	 * The cached value of the '{@link #getTemplateBindings() <em>Template Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateBindings()
	 * @generated
	 * @ordered
	 */
	protected EList templateBindings = null;

	/**
	 * The cached value of the '{@link #getOwnedTemplateSignature() <em>Owned Template Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTemplateSignature()
	 * @generated
	 * @ordered
	 */
	protected TemplateSignature ownedTemplateSignature = null;

	/**
	 * The cached value of the '{@link #getCollaborationUses() <em>Collaboration Use</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollaborationUses()
	 * @generated
	 * @ordered
	 */
	protected EList collaborationUses = null;

	/**
	 * The default value of the '{@link #isAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_ABSTRACT_EFLAG = 1 << 11;

	/**
	 * The cached value of the '{@link #getGeneralizations() <em>Generalization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralizations()
	 * @generated
	 * @ordered
	 */
	protected EList generalizations = null;

	/**
	 * The cached value of the '{@link #getPowertypeExtents() <em>Powertype Extent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowertypeExtents()
	 * @generated
	 * @ordered
	 */
	protected EList powertypeExtents = null;

	/**
	 * The cached value of the '{@link #getRedefinedClassifiers() <em>Redefined Classifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList redefinedClassifiers = null;

	/**
	 * The cached value of the '{@link #getSubstitutions() <em>Substitution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitutions()
	 * @generated
	 * @ordered
	 */
	protected EList substitutions = null;

	/**
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected CollaborationUse representation = null;

	/**
	 * The cached value of the '{@link #getOwnedUseCases() <em>Owned Use Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedUseCases()
	 * @generated
	 * @ordered
	 */
	protected EList ownedUseCases = null;

	/**
	 * The cached value of the '{@link #getUseCases() <em>Use Case</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCases()
	 * @generated
	 * @ordered
	 */
	protected EList useCases = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList redefinedElements = (EList) cache.get(eResource, this,
				UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
			if (redefinedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT,
					redefinedElements = new DerivedUnionEObjectEList(
						RedefinableElement.class, this,
						UMLPackage.CLASSIFIER__REDEFINED_ELEMENT,
						REDEFINED_ELEMENT_ESUBSETS));
			}
			return redefinedElements;
		}
		return new DerivedUnionEObjectEList(RedefinableElement.class, this,
			UMLPackage.CLASSIFIER__REDEFINED_ELEMENT,
			REDEFINED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableElement getRedefinedElement(String name) {
		return getRedefinedElement(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableElement getRedefinedElement(String name,
			boolean ignoreCase, EClass eClass) {
		redefinedElementLoop : for (Iterator i = getRedefinedElements()
			.iterator(); i.hasNext();) {
			RedefinableElement redefinedElement = (RedefinableElement) i.next();
			if (eClass != null && !eClass.isInstance(redefinedElement))
				continue redefinedElementLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(redefinedElement.getName())
				: name.equals(redefinedElement.getName())))
				continue redefinedElementLoop;
			return redefinedElement;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinitionContextsGen() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList redefinitionContexts = (EList) cache.get(eResource, this,
				UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
			if (redefinitionContexts == null) {
				cache
					.put(
						eResource,
						this,
						UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT,
						redefinitionContexts = new DerivedUnionEObjectEList(
							Classifier.class, this,
							UMLPackage.CLASSIFIER__REDEFINITION_CONTEXT, null));
			}
			return redefinitionContexts;
		}
		return new DerivedUnionEObjectEList(Classifier.class, this,
			UMLPackage.CLASSIFIER__REDEFINITION_CONTEXT, null);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRedefinitionContexts() <em>Redefinition Context</em>}' reference list.
	 * @see #getRedefinitionContexts()
	 */
	protected static final int[] REDEFINITION_CONTEXT_ESUBSETS = new int[]{UMLPackage.CLASSIFIER__NAMESPACE};

	public EList getRedefinitionContexts() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList redefinitionContexts = (EList) cache.get(eResource, this,
				UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
			if (redefinitionContexts == null) {
				cache
					.put(
						eResource,
						this,
						UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT,
						redefinitionContexts = new DerivedEObjectEList(
							Classifier.class, this,
							UMLPackage.CLASSIFIER__REDEFINITION_CONTEXT,
							REDEFINITION_CONTEXT_ESUBSETS));
			}
			return redefinitionContexts;
		}
		return new DerivedEObjectEList(Classifier.class, this,
			UMLPackage.CLASSIFIER__REDEFINITION_CONTEXT,
			REDEFINITION_CONTEXT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getRedefinitionContext(String name) {
		return getRedefinitionContext(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getRedefinitionContext(String name, boolean ignoreCase,
			EClass eClass) {
		redefinitionContextLoop : for (Iterator i = getRedefinitionContexts()
			.iterator(); i.hasNext();) {
			Classifier redefinitionContext = (Classifier) i.next();
			if (eClass != null && !eClass.isInstance(redefinitionContext))
				continue redefinitionContextLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(redefinitionContext.getName())
				: name.equals(redefinitionContext.getName())))
				continue redefinitionContextLoop;
			return redefinitionContext;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLeaf() {
		return (eFlags & IS_LEAF_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeaf(boolean newIsLeaf) {
		boolean oldIsLeaf = (eFlags & IS_LEAF_EFLAG) != 0;
		if (newIsLeaf)
			eFlags |= IS_LEAF_EFLAG;
		else
			eFlags &= ~IS_LEAF_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CLASSIFIER__IS_LEAF, oldIsLeaf, newIsLeaf));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getOwner() {
		Element owner = basicGetOwner();
		return owner != null && owner.eIsProxy()
			? (Element) eResolveProxy((InternalEObject) owner)
			: owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getTemplateParameter() {
		if (templateParameter != null && templateParameter.eIsProxy()) {
			InternalEObject oldTemplateParameter = (InternalEObject) templateParameter;
			templateParameter = (TemplateParameter) eResolveProxy(oldTemplateParameter);
			if (templateParameter != oldTemplateParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER,
						oldTemplateParameter, templateParameter));
			}
		}
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter basicGetTemplateParameter() {
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateParameterGen(
			TemplateParameter newTemplateParameter, NotificationChain msgs) {
		TemplateParameter oldTemplateParameter = templateParameter;
		templateParameter = newTemplateParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER,
				oldTemplateParameter, newTemplateParameter);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	public NotificationChain basicSetTemplateParameter(
			TemplateParameter newTemplateParameter, NotificationChain msgs) {

		if (newTemplateParameter != null
			&& !(newTemplateParameter instanceof ClassifierTemplateParameter)) {

			throw new IllegalArgumentException(newTemplateParameter.toString());
		}

		msgs = basicSetTemplateParameterGen(newTemplateParameter, msgs);

		Resource.Internal eInternalResource = eInternalResource();

		if (eInternalResource == null || !eInternalResource.isLoading()) {
			TemplateParameter owningTemplateParameter = basicGetOwningTemplateParameter();

			if (owningTemplateParameter != null
				&& owningTemplateParameter != newTemplateParameter) {

				setOwningTemplateParameter(null);
			}
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateParameter(TemplateParameter newTemplateParameter) {
		if (newTemplateParameter != templateParameter) {
			NotificationChain msgs = null;
			if (templateParameter != null)
				msgs = ((InternalEObject) templateParameter).eInverseRemove(
					this, UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
					TemplateParameter.class, msgs);
			if (newTemplateParameter != null)
				msgs = ((InternalEObject) newTemplateParameter).eInverseAdd(
					this, UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
					TemplateParameter.class, msgs);
			msgs = basicSetTemplateParameter(newTemplateParameter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER,
				newTemplateParameter, newTemplateParameter));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTemplateParameter() {
		return templateParameter != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getOwningTemplateParameter() {
		if (eContainerFeatureID != UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER)
			return null;
		return (TemplateParameter) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter basicGetOwningTemplateParameter() {
		if (eContainerFeatureID != UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER)
			return null;
		return (TemplateParameter) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningTemplateParameter(
			TemplateParameter newOwningTemplateParameter, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newOwningTemplateParameter,
			UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER, msgs);

		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newOwningTemplateParameter != null) {
				if (newOwningTemplateParameter != templateParameter) {
					setTemplateParameter(newOwningTemplateParameter);
				}
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningTemplateParameter(
			TemplateParameter newOwningTemplateParameter) {
		if (newOwningTemplateParameter != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER && newOwningTemplateParameter != null)) {
			if (EcoreUtil.isAncestor(this, newOwningTemplateParameter))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningTemplateParameter != null)
				msgs = ((InternalEObject) newOwningTemplateParameter)
					.eInverseAdd(
						this,
						UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
						TemplateParameter.class, msgs);
			msgs = basicSetOwningTemplateParameter(newOwningTemplateParameter,
				msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER,
				newOwningTemplateParameter, newOwningTemplateParameter));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityKind newVisibility) {
		VisibilityKind oldVisibility = visibility;
		visibility = newVisibility == null
			? VISIBILITY_EDEFAULT
			: newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CLASSIFIER__VISIBILITY, oldVisibility, visibility));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisibility() {
		return visibility != VISIBILITY_EDEFAULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getNamespace() {
		Namespace namespace = basicGetNamespace();
		return namespace != null && namespace.eIsProxy()
			? (Namespace) eResolveProxy((InternalEObject) namespace)
			: namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package getPackage() {
		org.eclipse.uml2.uml.Package package_ = basicGetPackage();
		return package_ != null && package_.eIsProxy()
			? (org.eclipse.uml2.uml.Package) eResolveProxy((InternalEObject) package_)
			: package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public org.eclipse.uml2.uml.Package basicGetPackage() {
		InternalEObject eInternalContainer = eInternalContainer();
		return eInternalContainer instanceof org.eclipse.uml2.uml.Package
			? (org.eclipse.uml2.uml.Package) eInternalContainer
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setPackage(org.eclipse.uml2.uml.Package newPackage) {
		if (newPackage != eInternalContainer()) {
			if (EcoreUtil.isAncestor(this, newPackage))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackage != null)
				msgs = ((InternalEList) newPackage.getOwnedTypes()).basicAdd(
					this, msgs);
			msgs = eBasicSetContainer((InternalEObject) newPackage,
				UMLPackage.CLASSIFIER__PACKAGE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CLASSIFIER__PACKAGE, newPackage, newPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList ownedElements = (EList) cache.get(eResource, this,
				UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT,
					ownedElements = new DerivedUnionEObjectEList(Element.class,
						this, UMLPackage.CLASSIFIER__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList(Element.class, this,
			UMLPackage.CLASSIFIER__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTemplateBindings() {
		if (templateBindings == null) {
			templateBindings = new EObjectContainmentWithInverseEList.Resolving(
				TemplateBinding.class, this,
				UMLPackage.CLASSIFIER__TEMPLATE_BINDING,
				UMLPackage.TEMPLATE_BINDING__BOUND_ELEMENT);
		}
		return templateBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBinding createTemplateBinding(TemplateSignature signature) {
		TemplateBinding newTemplateBinding = (TemplateBinding) create(UMLPackage.Literals.TEMPLATE_BINDING);
		getTemplateBindings().add(newTemplateBinding);
		if (signature != null)
			newTemplateBinding.setSignature(signature);
		return newTemplateBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBinding getTemplateBinding(TemplateSignature signature) {
		return getTemplateBinding(signature, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBinding getTemplateBinding(TemplateSignature signature,
			boolean createOnDemand) {
		templateBindingLoop : for (Iterator i = getTemplateBindings()
			.iterator(); i.hasNext();) {
			TemplateBinding templateBinding = (TemplateBinding) i.next();
			if (signature != null
				&& !signature.equals(templateBinding.getSignature()))
				continue templateBindingLoop;
			return templateBinding;
		}
		return createOnDemand
			? createTemplateBinding(signature)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature getOwnedTemplateSignature() {
		if (ownedTemplateSignature != null && ownedTemplateSignature.eIsProxy()) {
			InternalEObject oldOwnedTemplateSignature = (InternalEObject) ownedTemplateSignature;
			ownedTemplateSignature = (TemplateSignature) eResolveProxy(oldOwnedTemplateSignature);
			if (ownedTemplateSignature != oldOwnedTemplateSignature) {
				InternalEObject newOwnedTemplateSignature = (InternalEObject) ownedTemplateSignature;
				NotificationChain msgs = oldOwnedTemplateSignature
					.eInverseRemove(this,
						UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE,
						TemplateSignature.class, null);
				if (newOwnedTemplateSignature.eInternalContainer() == null) {
					msgs = newOwnedTemplateSignature.eInverseAdd(this,
						UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE,
						TemplateSignature.class, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE,
						oldOwnedTemplateSignature, ownedTemplateSignature));
			}
		}
		return ownedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature basicGetOwnedTemplateSignature() {
		return ownedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedTemplateSignatureGen(
			TemplateSignature newOwnedTemplateSignature, NotificationChain msgs) {
		TemplateSignature oldOwnedTemplateSignature = ownedTemplateSignature;
		ownedTemplateSignature = newOwnedTemplateSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE,
				oldOwnedTemplateSignature, newOwnedTemplateSignature);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	public NotificationChain basicSetOwnedTemplateSignature(
			TemplateSignature newOwnedTemplateSignature, NotificationChain msgs) {

		if (newOwnedTemplateSignature != null
			&& !(newOwnedTemplateSignature instanceof RedefinableTemplateSignature)) {

			throw new IllegalArgumentException(newOwnedTemplateSignature
				.toString());
		}

		return basicSetOwnedTemplateSignatureGen(newOwnedTemplateSignature,
			msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedTemplateSignature(
			TemplateSignature newOwnedTemplateSignature) {
		if (newOwnedTemplateSignature != ownedTemplateSignature) {
			NotificationChain msgs = null;
			if (ownedTemplateSignature != null)
				msgs = ((InternalEObject) ownedTemplateSignature)
					.eInverseRemove(this,
						UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE,
						TemplateSignature.class, msgs);
			if (newOwnedTemplateSignature != null)
				msgs = ((InternalEObject) newOwnedTemplateSignature)
					.eInverseAdd(this, UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE,
						TemplateSignature.class, msgs);
			msgs = basicSetOwnedTemplateSignature(newOwnedTemplateSignature,
				msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE,
				newOwnedTemplateSignature, newOwnedTemplateSignature));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature createOwnedTemplateSignature(EClass eClass) {
		TemplateSignature newOwnedTemplateSignature = (TemplateSignature) create(eClass);
		setOwnedTemplateSignature(newOwnedTemplateSignature);
		return newOwnedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TemplateSignature createOwnedTemplateSignature() {
		TemplateSignature newOwnedTemplateSignature = UMLFactory.eINSTANCE
			.createRedefinableTemplateSignature();
		setOwnedTemplateSignature(newOwnedTemplateSignature);
		return newOwnedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedTemplateSignature() {
		return ownedTemplateSignature != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFeatures() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList features = (EList) cache.get(eResource, this,
				UMLPackage.Literals.CLASSIFIER__FEATURE);
			if (features == null) {
				cache
					.put(eResource, this,
						UMLPackage.Literals.CLASSIFIER__FEATURE,
						features = new DerivedUnionEObjectEList(Feature.class,
							this, UMLPackage.CLASSIFIER__FEATURE,
							FEATURE_ESUBSETS));
			}
			return features;
		}
		return new DerivedUnionEObjectEList(Feature.class, this,
			UMLPackage.CLASSIFIER__FEATURE, FEATURE_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getFeature(String name) {
		return getFeature(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getFeature(String name, boolean ignoreCase, EClass eClass) {
		featureLoop : for (Iterator i = getFeatures().iterator(); i.hasNext();) {
			Feature feature = (Feature) i.next();
			if (eClass != null && !eClass.isInstance(feature))
				continue featureLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(feature.getName())
				: name.equals(feature.getName())))
				continue featureLoop;
			return feature;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList members = (EList) cache.get(eResource, this,
				UMLPackage.Literals.NAMESPACE__MEMBER);
			if (members == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.NAMESPACE__MEMBER,
					members = new DerivedUnionEObjectEList(NamedElement.class,
						this, UMLPackage.CLASSIFIER__MEMBER, MEMBER_ESUBSETS));
			}
			return members;
		}
		return new DerivedUnionEObjectEList(NamedElement.class, this,
			UMLPackage.CLASSIFIER__MEMBER, MEMBER_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList ownedMembers = (EList) cache.get(eResource, this,
				UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
			if (ownedMembers == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER,
					ownedMembers = new DerivedUnionEObjectEList(
						NamedElement.class, this,
						UMLPackage.CLASSIFIER__OWNED_MEMBER,
						OWNED_MEMBER_ESUBSETS));
			}
			return ownedMembers;
		}
		return new DerivedUnionEObjectEList(NamedElement.class, this,
			UMLPackage.CLASSIFIER__OWNED_MEMBER, OWNED_MEMBER_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAttributes() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList attributes = (EList) cache.get(eResource, this,
				UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
			if (attributes == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.CLASSIFIER__ATTRIBUTE,
					attributes = new DerivedUnionEObjectEList(Property.class,
						this, UMLPackage.CLASSIFIER__ATTRIBUTE, null));
			}
			return attributes;
		}
		return new DerivedUnionEObjectEList(Property.class, this,
			UMLPackage.CLASSIFIER__ATTRIBUTE, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getAttribute(String name, Type type) {
		return getAttribute(name, type, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getAttribute(String name, Type type, boolean ignoreCase,
			EClass eClass) {
		attributeLoop : for (Iterator i = getAttributes().iterator(); i
			.hasNext();) {
			Property attribute = (Property) i.next();
			if (eClass != null && !eClass.isInstance(attribute))
				continue attributeLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(attribute.getName())
				: name.equals(attribute.getName())))
				continue attributeLoop;
			if (type != null && !type.equals(attribute.getType()))
				continue attributeLoop;
			return attribute;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClientDependencies() {
		if (clientDependencies == null) {
			clientDependencies = new SubsetSupersetEObjectWithInverseResolvingEList.ManyInverse(
				Dependency.class, this,
				UMLPackage.CLASSIFIER__CLIENT_DEPENDENCY, null,
				CLIENT_DEPENDENCY_ESUBSETS, UMLPackage.DEPENDENCY__CLIENT);
		}
		return clientDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCollaborationUses() {
		if (collaborationUses == null) {
			collaborationUses = new SubsetSupersetEObjectContainmentEList.Resolving(
				CollaborationUse.class, this,
				UMLPackage.CLASSIFIER__COLLABORATION_USE, null,
				COLLABORATION_USE_ESUBSETS);
		}
		return collaborationUses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse createCollaborationUse(String name) {
		CollaborationUse newCollaborationUse = (CollaborationUse) create(UMLPackage.Literals.COLLABORATION_USE);
		getCollaborationUses().add(newCollaborationUse);
		if (name != null)
			newCollaborationUse.setName(name);
		return newCollaborationUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse getCollaborationUse(String name) {
		return getCollaborationUse(name, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse getCollaborationUse(String name,
			boolean ignoreCase, boolean createOnDemand) {
		collaborationUseLoop : for (Iterator i = getCollaborationUses()
			.iterator(); i.hasNext();) {
			CollaborationUse collaborationUse = (CollaborationUse) i.next();
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(collaborationUse.getName())
				: name.equals(collaborationUse.getName())))
				continue collaborationUseLoop;
			return collaborationUse;
		}
		return createOnDemand
			? createCollaborationUse(name)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return (eFlags & IS_ABSTRACT_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = (eFlags & IS_ABSTRACT_EFLAG) != 0;
		if (newIsAbstract)
			eFlags |= IS_ABSTRACT_EFLAG;
		else
			eFlags &= ~IS_ABSTRACT_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CLASSIFIER__IS_ABSTRACT, oldIsAbstract,
				newIsAbstract));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getGeneralizations() {
		if (generalizations == null) {
			generalizations = new EObjectContainmentWithInverseEList.Resolving(
				Generalization.class, this,
				UMLPackage.CLASSIFIER__GENERALIZATION,
				UMLPackage.GENERALIZATION__SPECIFIC);
		}
		return generalizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPowertypeExtents() {
		if (powertypeExtents == null) {
			powertypeExtents = new EObjectWithInverseResolvingEList(
				GeneralizationSet.class, this,
				UMLPackage.CLASSIFIER__POWERTYPE_EXTENT,
				UMLPackage.GENERALIZATION_SET__POWERTYPE);
		}
		return powertypeExtents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationSet getPowertypeExtent(String name) {
		return getPowertypeExtent(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationSet getPowertypeExtent(String name, boolean ignoreCase) {
		powertypeExtentLoop : for (Iterator i = getPowertypeExtents()
			.iterator(); i.hasNext();) {
			GeneralizationSet powertypeExtent = (GeneralizationSet) i.next();
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(powertypeExtent.getName())
				: name.equals(powertypeExtent.getName())))
				continue powertypeExtentLoop;
			return powertypeExtent;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInheritedMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this,
				UMLPackage.Literals.CLASSIFIER__INHERITED_MEMBER);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.CLASSIFIER__INHERITED_MEMBER,
					result = ClassifierOperations.getInheritedMembers(this));
			}
			return result;
		}
		return ClassifierOperations.getInheritedMembers(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getInheritedMember(String name) {
		return getInheritedMember(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getInheritedMember(String name, boolean ignoreCase,
			EClass eClass) {
		inheritedMemberLoop : for (Iterator i = getInheritedMembers()
			.iterator(); i.hasNext();) {
			NamedElement inheritedMember = (NamedElement) i.next();
			if (eClass != null && !eClass.isInstance(inheritedMember))
				continue inheritedMemberLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(inheritedMember.getName())
				: name.equals(inheritedMember.getName())))
				continue inheritedMemberLoop;
			return inheritedMember;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedClassifiers() {
		if (redefinedClassifiers == null) {
			redefinedClassifiers = new EObjectResolvingEList(Classifier.class,
				this, UMLPackage.CLASSIFIER__REDEFINED_CLASSIFIER);
		}
		return redefinedClassifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getRedefinedClassifier(String name) {
		return getRedefinedClassifier(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getRedefinedClassifier(String name, boolean ignoreCase,
			EClass eClass) {
		redefinedClassifierLoop : for (Iterator i = getRedefinedClassifiers()
			.iterator(); i.hasNext();) {
			Classifier redefinedClassifier = (Classifier) i.next();
			if (eClass != null && !eClass.isInstance(redefinedClassifier))
				continue redefinedClassifierLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(redefinedClassifier.getName())
				: name.equals(redefinedClassifier.getName())))
				continue redefinedClassifierLoop;
			return redefinedClassifier;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getGenerals() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this,
				UMLPackage.Literals.CLASSIFIER__GENERAL);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.CLASSIFIER__GENERAL,
					result = ClassifierOperations.getGenerals(this));
			}
			return result;
		}
		return ClassifierOperations.getGenerals(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getGeneral(String name) {
		return getGeneral(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getGeneral(String name, boolean ignoreCase, EClass eClass) {
		generalLoop : for (Iterator i = getGenerals().iterator(); i.hasNext();) {
			Classifier general = (Classifier) i.next();
			if (eClass != null && !eClass.isInstance(general))
				continue generalLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(general.getName())
				: name.equals(general.getName())))
				continue generalLoop;
			return general;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedUseCases() {
		if (ownedUseCases == null) {
			ownedUseCases = new EObjectContainmentEList.Resolving(
				UseCase.class, this, UMLPackage.CLASSIFIER__OWNED_USE_CASE);
		}
		return ownedUseCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase createOwnedUseCase(String name) {
		UseCase newOwnedUseCase = (UseCase) create(UMLPackage.Literals.USE_CASE);
		getOwnedUseCases().add(newOwnedUseCase);
		if (name != null)
			newOwnedUseCase.setName(name);
		return newOwnedUseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getOwnedUseCase(String name) {
		return getOwnedUseCase(name, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getOwnedUseCase(String name, boolean ignoreCase,
			boolean createOnDemand) {
		ownedUseCaseLoop : for (Iterator i = getOwnedUseCases().iterator(); i
			.hasNext();) {
			UseCase ownedUseCase = (UseCase) i.next();
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(ownedUseCase.getName())
				: name.equals(ownedUseCase.getName())))
				continue ownedUseCaseLoop;
			return ownedUseCase;
		}
		return createOnDemand
			? createOwnedUseCase(name)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUseCases() {
		if (useCases == null) {
			useCases = new EObjectWithInverseResolvingEList.ManyInverse(
				UseCase.class, this, UMLPackage.CLASSIFIER__USE_CASE,
				UMLPackage.USE_CASE__SUBJECT);
		}
		return useCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getUseCase(String name) {
		return getUseCase(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getUseCase(String name, boolean ignoreCase) {
		useCaseLoop : for (Iterator i = getUseCases().iterator(); i.hasNext();) {
			UseCase useCase = (UseCase) i.next();
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(useCase.getName())
				: name.equals(useCase.getName())))
				continue useCaseLoop;
			return useCase;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSubstitutions() {
		if (substitutions == null) {
			substitutions = new SubsetSupersetEObjectContainmentWithInverseEList.Resolving(
				Substitution.class, this, UMLPackage.CLASSIFIER__SUBSTITUTION,
				SUBSTITUTION_ESUPERSETS, null,
				UMLPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER);
		}
		return substitutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substitution createSubstitution(String name, Classifier contract) {
		Substitution newSubstitution = (Substitution) create(UMLPackage.Literals.SUBSTITUTION);
		getSubstitutions().add(newSubstitution);
		if (name != null)
			newSubstitution.setName(name);
		if (contract != null)
			newSubstitution.setContract(contract);
		return newSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substitution getSubstitution(String name, Classifier contract) {
		return getSubstitution(name, contract, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substitution getSubstitution(String name, Classifier contract,
			boolean ignoreCase, boolean createOnDemand) {
		substitutionLoop : for (Iterator i = getSubstitutions().iterator(); i
			.hasNext();) {
			Substitution substitution = (Substitution) i.next();
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(substitution.getName())
				: name.equals(substitution.getName())))
				continue substitutionLoop;
			if (contract != null
				&& !contract.equals(substitution.getContract()))
				continue substitutionLoop;
			return substitution;
		}
		return createOnDemand
			? createSubstitution(name, contract)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse getRepresentation() {
		if (representation != null && representation.eIsProxy()) {
			InternalEObject oldRepresentation = (InternalEObject) representation;
			representation = (CollaborationUse) eResolveProxy(oldRepresentation);
			if (representation != oldRepresentation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.CLASSIFIER__REPRESENTATION,
						oldRepresentation, representation));
			}
		}
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse basicGetRepresentation() {
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentation(CollaborationUse newRepresentation) {
		CollaborationUse oldRepresentation = representation;
		representation = newRepresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.CLASSIFIER__REPRESENTATION, oldRepresentation,
				representation));

		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newRepresentation != null) {
				EList collaborationUses = getCollaborationUses();
				if (!collaborationUses.contains(newRepresentation)) {
					collaborationUses.add(newRepresentation);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse createRepresentation(String name) {
		CollaborationUse newRepresentation = (CollaborationUse) create(UMLPackage.Literals.COLLABORATION_USE);
		setRepresentation(newRepresentation);
		if (name != null)
			newRepresentation.setName(name);
		return newRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinitionContextValid(
			DiagnosticChain diagnostics, Map context) {
		return RedefinableElementOperations.validateRedefinitionContextValid(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinitionConsistent(DiagnosticChain diagnostics,
			Map context) {
		return RedefinableElementOperations.validateRedefinitionConsistent(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRedefinitionContextValid(RedefinableElement redefined) {
		return RedefinableElementOperations.isRedefinitionContextValid(this,
			redefined);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConsistentWith(RedefinableElement redefinee) {
		return RedefinableElementOperations.isConsistentWith(this, redefinee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCompatibleWith(ParameterableElement p) {
		return ParameterableElementOperations.isCompatibleWith(this, p);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTemplateParameter() {
		return ParameterableElementOperations.isTemplateParameter(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation(boolean end1IsNavigable,
			AggregationKind end1Aggregation, String end1Name, int end1Lower,
			int end1Upper, Type end1Type, boolean end2IsNavigable,
			AggregationKind end2Aggregation, String end2Name, int end2Lower,
			int end2Upper) {
		return TypeOperations.createAssociation(this, end1IsNavigable,
			end1Aggregation, end1Name, end1Lower, end1Upper, end1Type,
			end2IsNavigable, end2Aggregation, end2Name, end2Lower, end2Upper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAssociations() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this, UMLPackage.Literals.TYPE
				.getEOperations().get(1));
			if (result == null) {
				cache.put(this, UMLPackage.Literals.TYPE.getEOperations()
					.get(1), result = TypeOperations.getAssociations(this));
			}
			return result;
		}
		return TypeOperations.getAssociations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList parameterableElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this,
				UMLPackage.Literals.TEMPLATEABLE_ELEMENT.getEOperations()
					.get(0));
			if (result == null) {
				cache.put(this, UMLPackage.Literals.TEMPLATEABLE_ELEMENT
					.getEOperations().get(0),
					result = TemplateableElementOperations
						.parameterableElements(this));
			}
			return result;
		}
		return TemplateableElementOperations.parameterableElements(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTemplate() {
		return ClassifierOperations.isTemplate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoCyclesInGeneralization(
			DiagnosticChain diagnostics, Map context) {
		return ClassifierOperations.validateNoCyclesInGeneralization(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecializeType(DiagnosticChain diagnostics,
			Map context) {
		return ClassifierOperations.validateSpecializeType(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralizationHierarchies(
			DiagnosticChain diagnostics, Map context) {
		return ClassifierOperations.validateGeneralizationHierarchies(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapsToGeneralizationSet(DiagnosticChain diagnostics,
			Map context) {
		return ClassifierOperations.validateMapsToGeneralizationSet(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization createGeneralization(Classifier general) {
		Generalization newGeneralization = (Generalization) create(UMLPackage.Literals.GENERALIZATION);
		getGeneralizations().add(newGeneralization);
		if (general != null)
			newGeneralization.setGeneral(general);
		return newGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization getGeneralization(Classifier general) {
		return getGeneralization(general, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization getGeneralization(Classifier general,
			boolean createOnDemand) {
		generalizationLoop : for (Iterator i = getGeneralizations().iterator(); i
			.hasNext();) {
			Generalization generalization = (Generalization) i.next();
			if (general != null && !general.equals(generalization.getGeneral()))
				continue generalizationLoop;
			return generalization;
		}
		return createOnDemand
			? createGeneralization(general)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAllAttributes() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this,
				UMLPackage.Literals.CLASSIFIER.getEOperations().get(4));
			if (result == null) {
				cache.put(this, UMLPackage.Literals.CLASSIFIER.getEOperations()
					.get(4), result = ClassifierOperations
					.getAllAttributes(this));
			}
			return result;
		}
		return ClassifierOperations.getAllAttributes(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOperations() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this,
				UMLPackage.Literals.CLASSIFIER.getEOperations().get(5));
			if (result == null) {
				cache.put(this, UMLPackage.Literals.CLASSIFIER.getEOperations()
					.get(5), result = ClassifierOperations.getOperations(this));
			}
			return result;
		}
		return ClassifierOperations.getOperations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAllOperations() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this,
				UMLPackage.Literals.CLASSIFIER.getEOperations().get(6));
			if (result == null) {
				cache.put(this, UMLPackage.Literals.CLASSIFIER.getEOperations()
					.get(6), result = ClassifierOperations
					.getAllOperations(this));
			}
			return result;
		}
		return ClassifierOperations.getAllOperations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation(String name, EList parameterNames,
			EList parameterTypes) {
		return ClassifierOperations.getOperation(this, name, parameterNames,
			parameterTypes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation(String name, EList parameterNames,
			EList parameterTypes, boolean ignoreCase) {
		return ClassifierOperations.getOperation(this, name, parameterNames,
			parameterTypes, ignoreCase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUsedInterfaces() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this,
				UMLPackage.Literals.CLASSIFIER.getEOperations().get(9));
			if (result == null) {
				cache.put(this, UMLPackage.Literals.CLASSIFIER.getEOperations()
					.get(9), result = ClassifierOperations
					.getUsedInterfaces(this));
			}
			return result;
		}
		return ClassifierOperations.getUsedInterfaces(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAllUsedInterfaces() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this,
				UMLPackage.Literals.CLASSIFIER.getEOperations().get(10));
			if (result == null) {
				cache.put(this, UMLPackage.Literals.CLASSIFIER.getEOperations()
					.get(10), result = ClassifierOperations
					.getAllUsedInterfaces(this));
			}
			return result;
		}
		return ClassifierOperations.getAllUsedInterfaces(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean maySpecializeType(Classifier c) {
		return ClassifierOperations.maySpecializeType(this, c);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList allFeatures() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this,
				UMLPackage.Literals.CLASSIFIER.getEOperations().get(13));
			if (result == null) {
				cache.put(this, UMLPackage.Literals.CLASSIFIER.getEOperations()
					.get(13), result = ClassifierOperations.allFeatures(this));
			}
			return result;
		}
		return ClassifierOperations.allFeatures(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList parents() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this,
				UMLPackage.Literals.CLASSIFIER.getEOperations().get(14));
			if (result == null) {
				cache.put(this, UMLPackage.Literals.CLASSIFIER.getEOperations()
					.get(14), result = ClassifierOperations.parents(this));
			}
			return result;
		}
		return ClassifierOperations.parents(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList inheritableMembers(Classifier c) {
		return ClassifierOperations.inheritableMembers(this, c);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasVisibilityOf(NamedElement n) {
		return ClassifierOperations.hasVisibilityOf(this, n);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean conformsTo(Classifier other) {
		return ClassifierOperations.conformsTo(this, other);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList inherit(EList inhs) {
		return ClassifierOperations.inherit(this, inhs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList allParents() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this,
				UMLPackage.Literals.CLASSIFIER.getEOperations().get(20));
			if (result == null) {
				cache.put(this, UMLPackage.Literals.CLASSIFIER.getEOperations()
					.get(20), result = ClassifierOperations.allParents(this));
			}
			return result;
		}
		return ClassifierOperations.allParents(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.CLASSIFIER__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.CLASSIFIER__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.CLASSIFIER__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.CLASSIFIER__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.CLASSIFIER__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter(
					(TemplateParameter) otherEnd, msgs);
			case UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER :
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter)
						.eInverseRemove(this,
							UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.CLASSIFIER__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject) ownedTemplateSignature)
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
							- UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE,
							null, msgs);
				return basicSetOwnedTemplateSignature(
					(TemplateSignature) otherEnd, msgs);
			case UMLPackage.CLASSIFIER__GENERALIZATION :
				return ((InternalEList) getGeneralizations()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.CLASSIFIER__POWERTYPE_EXTENT :
				return ((InternalEList) getPowertypeExtents()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.CLASSIFIER__SUBSTITUTION :
				return ((InternalEList) getSubstitutions()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.CLASSIFIER__USE_CASE :
				return ((InternalEList) getUseCases()).basicAdd(otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.CLASSIFIER__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASSIFIER__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASSIFIER__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASSIFIER__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.CLASSIFIER__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASSIFIER__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASSIFIER__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.CLASSIFIER__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.CLASSIFIER__GENERALIZATION :
				return ((InternalEList) getGeneralizations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASSIFIER__POWERTYPE_EXTENT :
				return ((InternalEList) getPowertypeExtents()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASSIFIER__SUBSTITUTION :
				return ((InternalEList) getSubstitutions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASSIFIER__COLLABORATION_USE :
				return ((InternalEList) getCollaborationUses()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASSIFIER__OWNED_USE_CASE :
				return ((InternalEList) getOwnedUseCases()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.CLASSIFIER__USE_CASE :
				return ((InternalEList) getUseCases()).basicRemove(otherEnd,
					msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				return eInternalContainer().eInverseRemove(this,
					UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
					TemplateParameter.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.CLASSIFIER__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.CLASSIFIER__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.CLASSIFIER__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.CLASSIFIER__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.CLASSIFIER__NAME :
				return getName();
			case UMLPackage.CLASSIFIER__VISIBILITY :
				return getVisibility();
			case UMLPackage.CLASSIFIER__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.CLASSIFIER__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.CLASSIFIER__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.CLASSIFIER__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.CLASSIFIER__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.CLASSIFIER__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.CLASSIFIER__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.CLASSIFIER__MEMBER :
				return getMembers();
			case UMLPackage.CLASSIFIER__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.CLASSIFIER__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.CLASSIFIER__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.CLASSIFIER__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.CLASSIFIER__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.CLASSIFIER__PACKAGE :
				if (resolve)
					return getPackage();
				return basicGetPackage();
			case UMLPackage.CLASSIFIER__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				if (resolve)
					return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case UMLPackage.CLASSIFIER__IS_ABSTRACT :
				return isAbstract()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.CLASSIFIER__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.CLASSIFIER__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.CLASSIFIER__FEATURE :
				return getFeatures();
			case UMLPackage.CLASSIFIER__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.CLASSIFIER__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.CLASSIFIER__GENERAL :
				return getGenerals();
			case UMLPackage.CLASSIFIER__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.CLASSIFIER__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.CLASSIFIER__REPRESENTATION :
				if (resolve)
					return getRepresentation();
				return basicGetRepresentation();
			case UMLPackage.CLASSIFIER__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.CLASSIFIER__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.CLASSIFIER__USE_CASE :
				return getUseCases();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.CLASSIFIER__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASSIFIER__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASSIFIER__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.CLASSIFIER__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.CLASSIFIER__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASSIFIER__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.CLASSIFIER__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASSIFIER__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASSIFIER__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASSIFIER__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.CLASSIFIER__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.CLASSIFIER__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.CLASSIFIER__IS_ABSTRACT :
				setIsAbstract(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.CLASSIFIER__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASSIFIER__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASSIFIER__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASSIFIER__GENERAL :
				getGenerals().clear();
				getGenerals().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASSIFIER__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASSIFIER__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.CLASSIFIER__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASSIFIER__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.CLASSIFIER__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection) newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.CLASSIFIER__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.CLASSIFIER__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.CLASSIFIER__NAME :
				unsetName();
				return;
			case UMLPackage.CLASSIFIER__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.CLASSIFIER__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.CLASSIFIER__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.CLASSIFIER__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.CLASSIFIER__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.CLASSIFIER__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.CLASSIFIER__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.CLASSIFIER__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.CLASSIFIER__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.CLASSIFIER__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.CLASSIFIER__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.CLASSIFIER__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.CLASSIFIER__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.CLASSIFIER__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.CLASSIFIER__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.CLASSIFIER__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.CLASSIFIER__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.CLASSIFIER__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.CLASSIFIER__USE_CASE :
				getUseCases().clear();
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.CLASSIFIER__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.CLASSIFIER__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.CLASSIFIER__OWNER :
				return isSetOwner();
			case UMLPackage.CLASSIFIER__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.CLASSIFIER__NAME :
				return isSetName();
			case UMLPackage.CLASSIFIER__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.CLASSIFIER__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.CLASSIFIER__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.CLASSIFIER__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.CLASSIFIER__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.CLASSIFIER__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.CLASSIFIER__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.CLASSIFIER__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.CLASSIFIER__MEMBER :
				return isSetMembers();
			case UMLPackage.CLASSIFIER__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.CLASSIFIER__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.CLASSIFIER__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.CLASSIFIER__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.CLASSIFIER__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.CLASSIFIER__PACKAGE :
				return basicGetPackage() != null;
			case UMLPackage.CLASSIFIER__TEMPLATE_BINDING :
				return templateBindings != null && !templateBindings.isEmpty();
			case UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
				return isSetOwnedTemplateSignature();
			case UMLPackage.CLASSIFIER__IS_ABSTRACT :
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UMLPackage.CLASSIFIER__GENERALIZATION :
				return generalizations != null && !generalizations.isEmpty();
			case UMLPackage.CLASSIFIER__POWERTYPE_EXTENT :
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UMLPackage.CLASSIFIER__FEATURE :
				return isSetFeatures();
			case UMLPackage.CLASSIFIER__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.CLASSIFIER__REDEFINED_CLASSIFIER :
				return redefinedClassifiers != null
					&& !redefinedClassifiers.isEmpty();
			case UMLPackage.CLASSIFIER__GENERAL :
				return !getGenerals().isEmpty();
			case UMLPackage.CLASSIFIER__SUBSTITUTION :
				return substitutions != null && !substitutions.isEmpty();
			case UMLPackage.CLASSIFIER__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.CLASSIFIER__REPRESENTATION :
				return representation != null;
			case UMLPackage.CLASSIFIER__COLLABORATION_USE :
				return collaborationUses != null
					&& !collaborationUses.isEmpty();
			case UMLPackage.CLASSIFIER__OWNED_USE_CASE :
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UMLPackage.CLASSIFIER__USE_CASE :
				return useCases != null && !useCases.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == RedefinableElement.class) {
			switch (derivedFeatureID) {
				case UMLPackage.CLASSIFIER__IS_LEAF :
					return UMLPackage.REDEFINABLE_ELEMENT__IS_LEAF;
				case UMLPackage.CLASSIFIER__REDEFINED_ELEMENT :
					return UMLPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;
				case UMLPackage.CLASSIFIER__REDEFINITION_CONTEXT :
					return UMLPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;
				default :
					return -1;
			}
		}
		if (baseClass == ParameterableElement.class) {
			switch (derivedFeatureID) {
				case UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER :
					return UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
				case UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER :
					return UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
				default :
					return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (derivedFeatureID) {
				default :
					return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
				case UMLPackage.CLASSIFIER__PACKAGE :
					return UMLPackage.TYPE__PACKAGE;
				default :
					return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (derivedFeatureID) {
				case UMLPackage.CLASSIFIER__TEMPLATE_BINDING :
					return UMLPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING;
				case UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE :
					return UMLPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE;
				default :
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == RedefinableElement.class) {
			switch (baseFeatureID) {
				case UMLPackage.REDEFINABLE_ELEMENT__IS_LEAF :
					return UMLPackage.CLASSIFIER__IS_LEAF;
				case UMLPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT :
					return UMLPackage.CLASSIFIER__REDEFINED_ELEMENT;
				case UMLPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT :
					return UMLPackage.CLASSIFIER__REDEFINITION_CONTEXT;
				default :
					return -1;
			}
		}
		if (baseClass == ParameterableElement.class) {
			switch (baseFeatureID) {
				case UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER :
					return UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER;
				case UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER :
					return UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER;
				default :
					return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (baseFeatureID) {
				default :
					return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
				case UMLPackage.TYPE__PACKAGE :
					return UMLPackage.CLASSIFIER__PACKAGE;
				default :
					return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (baseFeatureID) {
				case UMLPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING :
					return UMLPackage.CLASSIFIER__TEMPLATE_BINDING;
				case UMLPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE :
					return UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isLeaf: "); //$NON-NLS-1$
		result.append((eFlags & IS_LEAF_EFLAG) != 0);
		result.append(", visibility: "); //$NON-NLS-1$
		result.append(visibility);
		result.append(", isAbstract: "); //$NON-NLS-1$
		result.append((eFlags & IS_ABSTRACT_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRedefinedElements() <em>Redefined Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] REDEFINED_ELEMENT_ESUBSETS = new int[]{UMLPackage.CLASSIFIER__REDEFINED_CLASSIFIER};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinedElements() {
		return eIsSet(UMLPackage.CLASSIFIER__REDEFINED_CLASSIFIER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinitionContextsGen() {
		return false;
	}

	public boolean isSetRedefinitionContexts() {
		return basicGetNamespace() instanceof Classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		TemplateParameter owningTemplateParameter = basicGetOwningTemplateParameter();
		if (owningTemplateParameter != null) {
			return owningTemplateParameter;
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNamespace() {
		org.eclipse.uml2.uml.Package package_ = basicGetPackage();
		if (package_ != null) {
			return package_;
		}
		return super.basicGetNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNamespace() {
		return super.isSetNamespace() || eIsSet(UMLPackage.CLASSIFIER__PACKAGE);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[]{
		UMLPackage.CLASSIFIER__OWNED_COMMENT,
		UMLPackage.CLASSIFIER__NAME_EXPRESSION,
		UMLPackage.CLASSIFIER__ELEMENT_IMPORT,
		UMLPackage.CLASSIFIER__PACKAGE_IMPORT,
		UMLPackage.CLASSIFIER__OWNED_MEMBER,
		UMLPackage.CLASSIFIER__TEMPLATE_BINDING,
		UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE,
		UMLPackage.CLASSIFIER__GENERALIZATION,
		UMLPackage.CLASSIFIER__SUBSTITUTION,
		UMLPackage.CLASSIFIER__COLLABORATION_USE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.CLASSIFIER__TEMPLATE_BINDING)
			|| isSetOwnedTemplateSignature()
			|| eIsSet(UMLPackage.CLASSIFIER__GENERALIZATION)
			|| eIsSet(UMLPackage.CLASSIFIER__SUBSTITUTION)
			|| eIsSet(UMLPackage.CLASSIFIER__COLLABORATION_USE);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getFeatures() <em>Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected static final int[] FEATURE_ESUBSETS = new int[]{UMLPackage.CLASSIFIER__ATTRIBUTE};

	/**
	 * The array of subset feature identifiers for the '{@link #getMembers() <em>Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] MEMBER_ESUBSETS = new int[]{
		UMLPackage.CLASSIFIER__IMPORTED_MEMBER,
		UMLPackage.CLASSIFIER__OWNED_MEMBER, UMLPackage.CLASSIFIER__FEATURE,
		UMLPackage.CLASSIFIER__INHERITED_MEMBER};

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMembers() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[]{
		UMLPackage.CLASSIFIER__OWNED_RULE,
		UMLPackage.CLASSIFIER__OWNED_USE_CASE};

	/**
	 * The array of subset feature identifiers for the '{@link #getClientDependencies() <em>Client Dependency</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientDependencies()
	 * @generated
	 * @ordered
	 */
	protected static final int[] CLIENT_DEPENDENCY_ESUBSETS = new int[]{UMLPackage.CLASSIFIER__SUBSTITUTION};

	/**
	 * The array of subset feature identifiers for the '{@link #getCollaborationUses() <em>Collaboration Use</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollaborationUses()
	 * @generated
	 * @ordered
	 */
	protected static final int[] COLLABORATION_USE_ESUBSETS = new int[]{UMLPackage.CLASSIFIER__REPRESENTATION};

	/**
	 * The array of superset feature identifiers for the '{@link #getSubstitutions() <em>Substitution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitutions()
	 * @generated
	 * @ordered
	 */
	protected static final int[] SUBSTITUTION_ESUPERSETS = new int[]{UMLPackage.CLASSIFIER__CLIENT_DEPENDENCY};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeatures() {
		return isSetAttributes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMembers() {
		return super.isSetMembers() || isSetFeatures()
			|| eIsSet(UMLPackage.CLASSIFIER__INHERITED_MEMBER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.CLASSIFIER__OWNED_USE_CASE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttributes() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean conformsToGen(Type other) {
		return conformsTo(other);
	}

	public boolean conformsTo(Type other) {
		return other instanceof Classifier && conformsTo((Classifier) other);
	}

} //ClassifierImpl
