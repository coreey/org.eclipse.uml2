/*
 * Copyright (c) 2005, 2018 IBM Corporation, Embarcadero Technologies, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 204200
 *   Kenn Hussey - 286329, 323181, 519572, 535301
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
 *   Eike Stepper - 540786
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectResolvingEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectWithInverseResolvingEList;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.AssociationClass;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Reception;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.AssociationClassOperations;
import org.eclipse.uml2.uml.internal.operations.AssociationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AssociationClassImpl#getRelatedElements <em>Related Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AssociationClassImpl#getMembers <em>Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AssociationClassImpl#getFeatures <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AssociationClassImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AssociationClassImpl#getMemberEnds <em>Member End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AssociationClassImpl#getOwnedEnds <em>Owned End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AssociationClassImpl#getEndTypes <em>End Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AssociationClassImpl#isDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AssociationClassImpl#getNavigableOwnedEnds <em>Navigable Owned End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationClassImpl
		extends ClassImpl
		implements AssociationClass {

	/**
	 * The cached value of the '{@link #getMemberEnds() <em>Member End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberEnds()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> memberEnds;

	/**
	 * The cached value of the '{@link #getOwnedEnds() <em>Owned End</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEnds()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedEnds;

	/**
	 * The default value of the '{@link #isDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_DERIVED_EFLAG = 1 << 16;

	/**
	 * The cached value of the '{@link #getNavigableOwnedEnds() <em>Navigable Owned End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigableOwnedEnds()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> navigableOwnedEnds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ASSOCIATION_CLASS;
	}

	@SuppressWarnings("unused")
	private EList<?> createSubsetSupersetList(
			EStructuralFeature eStructuralFeature) {
		if (eStructuralFeature == UMLPackage.Literals.ASSOCIATION__MEMBER_END) {
			return createMemberEndsList();
		}

		if (eStructuralFeature == UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END) {
			return createNavigableOwnedEndsList();
		}

		if (eStructuralFeature == UMLPackage.Literals.ASSOCIATION__OWNED_END) {
			return createOwnedEndsList();
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getRelatedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Element> relatedElements = (EList<Element>) cache.get(
				eResource, this,
				UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
			if (relatedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT,
					relatedElements = new DerivedUnionEObjectEList<Element>(
						Element.class, this,
						UMLPackage.ASSOCIATION_CLASS__RELATED_ELEMENT,
						RELATED_ELEMENT_ESUBSETS));
			}
			return relatedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.ASSOCIATION_CLASS__RELATED_ELEMENT,
			RELATED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedElement> getMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<NamedElement> members = (EList<NamedElement>) cache
				.get(eResource, this, UMLPackage.Literals.NAMESPACE__MEMBER);
			if (members == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.NAMESPACE__MEMBER,
					members = new DerivedUnionEObjectEList<NamedElement>(
						NamedElement.class, this,
						UMLPackage.ASSOCIATION_CLASS__MEMBER, MEMBER_ESUBSETS));
			}
			return members;
		}
		return new DerivedUnionEObjectEList<NamedElement>(NamedElement.class,
			this, UMLPackage.ASSOCIATION_CLASS__MEMBER, MEMBER_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getFeatures() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Feature> features = (EList<Feature>) cache.get(eResource,
				this, UMLPackage.Literals.CLASSIFIER__FEATURE);
			if (features == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.CLASSIFIER__FEATURE,
					features = new DerivedUnionEObjectEList<Feature>(
						Feature.class, this,
						UMLPackage.ASSOCIATION_CLASS__FEATURE,
						FEATURE_ESUBSETS));
			}
			return features;
		}
		return new DerivedUnionEObjectEList<Feature>(Feature.class, this,
			UMLPackage.ASSOCIATION_CLASS__FEATURE, FEATURE_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedElement> getOwnedMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<NamedElement> ownedMembers = (EList<NamedElement>) cache.get(
				eResource, this, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
			if (ownedMembers == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.NAMESPACE__OWNED_MEMBER,
					ownedMembers = new DerivedUnionEObjectEList<NamedElement>(
						NamedElement.class, this,
						UMLPackage.ASSOCIATION_CLASS__OWNED_MEMBER,
						OWNED_MEMBER_ESUBSETS));
			}
			return ownedMembers;
		}
		return new DerivedUnionEObjectEList<NamedElement>(NamedElement.class,
			this, UMLPackage.ASSOCIATION_CLASS__OWNED_MEMBER,
			OWNED_MEMBER_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT_CDO
	 */
	public EList<Property> getMemberEnds() {
		if (memberEnds == null) {
			memberEnds = createMemberEndsList();
		}
		return memberEnds;
	}

	private EList<Property> createMemberEndsList() {
		return new SubsetSupersetEObjectWithInverseResolvingEList<Property>(
			Property.class, this, UMLPackage.ASSOCIATION_CLASS__MEMBER_END,
			null, MEMBER_END_ESUBSETS, UMLPackage.PROPERTY__ASSOCIATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT_CDO
	 */
	public EList<Property> getOwnedEnds() {
		if (ownedEnds == null) {
			ownedEnds = createOwnedEndsList();
		}
		return ownedEnds;
	}

	private EList<Property> createOwnedEndsList() {
		return new SubsetSupersetEObjectContainmentWithInverseEList.Resolving<Property>(
			Property.class, this, UMLPackage.ASSOCIATION_CLASS__OWNED_END,
			OWNED_END_ESUPERSETS, OWNED_END_ESUBSETS,
			UMLPackage.PROPERTY__OWNING_ASSOCIATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDerived() {
		return (eFlags & IS_DERIVED_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(boolean newIsDerived) {
		boolean oldIsDerived = (eFlags & IS_DERIVED_EFLAG) != 0;
		if (newIsDerived)
			eFlags |= IS_DERIVED_EFLAG;
		else
			eFlags &= ~IS_DERIVED_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ASSOCIATION_CLASS__IS_DERIVED, oldIsDerived,
				newIsDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getEndTypes() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Type> result = (EList<Type>) cache.get(this,
				UMLPackage.Literals.ASSOCIATION__END_TYPE);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.ASSOCIATION__END_TYPE,
					result = AssociationOperations.getEndTypes(this));
			}
			return result;
		}
		return AssociationOperations.getEndTypes(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getEndType(String name) {
		return getEndType(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getEndType(String name, boolean ignoreCase, EClass eClass) {
		endTypeLoop : for (Type endType : getEndTypes()) {
			if (eClass != null && !eClass.isInstance(endType))
				continue endTypeLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(endType.getName())
				: name.equals(endType.getName())))
				continue endTypeLoop;
			return endType;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT_CDO
	 */
	public EList<Property> getNavigableOwnedEnds() {
		if (navigableOwnedEnds == null) {
			navigableOwnedEnds = createNavigableOwnedEndsList();
		}
		return navigableOwnedEnds;
	}

	private EList<Property> createNavigableOwnedEndsList() {
		return new SubsetSupersetEObjectResolvingEList<Property>(Property.class,
			this, UMLPackage.ASSOCIATION_CLASS__NAVIGABLE_OWNED_END,
			NAVIGABLE_OWNED_END_ESUPERSETS, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecializedEndNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssociationOperations.validateSpecializedEndNumber(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecializedEndTypes(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssociationOperations.validateSpecializedEndTypes(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryAssociations(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssociationOperations.validateBinaryAssociations(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationEnds(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssociationOperations.validateAssociationEnds(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndsMustBeTyped(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssociationOperations.validateEndsMustBeTyped(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBinary() {
		return AssociationOperations.isBinary(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCannotBeDefined(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssociationClassOperations.validateCannotBeDefined(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisjointAttributesEnds(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AssociationClassOperations.validateDisjointAttributesEnds(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.ASSOCIATION_CLASS__EANNOTATIONS :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getEAnnotations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__OWNED_RULE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedRules())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__ELEMENT_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getElementImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__PACKAGE_IMPORT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPackageImports())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter(
					(TemplateParameter) otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__TEMPLATE_PARAMETER :
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter).eInverseRemove(
						this,
						UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
						TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.ASSOCIATION_CLASS__TEMPLATE_BINDING :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getTemplateBindings())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__OWNED_TEMPLATE_SIGNATURE :
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject) ownedTemplateSignature)
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
							- UMLPackage.ASSOCIATION_CLASS__OWNED_TEMPLATE_SIGNATURE,
							null, msgs);
				return basicSetOwnedTemplateSignature(
					(TemplateSignature) otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__GENERALIZATION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getGeneralizations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__POWERTYPE_EXTENT :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getPowertypeExtents())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__USE_CASE :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getUseCases())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__SUBSTITUTION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubstitutions())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__INTERFACE_REALIZATION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getInterfaceRealizations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__OWNED_OPERATION :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedOperations())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__MEMBER_END :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getMemberEnds())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__OWNED_END :
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedEnds())
					.basicAdd(otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.ASSOCIATION_CLASS__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.ASSOCIATION_CLASS__OWNED_RULE :
				return ((InternalEList<?>) getOwnedRules())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__ELEMENT_IMPORT :
				return ((InternalEList<?>) getElementImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__PACKAGE_IMPORT :
				return ((InternalEList<?>) getPackageImports())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__OWNING_TEMPLATE_PARAMETER :
				return basicSetOwningTemplateParameter(null, msgs);
			case UMLPackage.ASSOCIATION_CLASS__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.ASSOCIATION_CLASS__TEMPLATE_BINDING :
				return ((InternalEList<?>) getTemplateBindings())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.ASSOCIATION_CLASS__COLLABORATION_USE :
				return ((InternalEList<?>) getCollaborationUses())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__GENERALIZATION :
				return ((InternalEList<?>) getGeneralizations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__POWERTYPE_EXTENT :
				return ((InternalEList<?>) getPowertypeExtents())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__OWNED_USE_CASE :
				return ((InternalEList<?>) getOwnedUseCases())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__USE_CASE :
				return ((InternalEList<?>) getUseCases()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ASSOCIATION_CLASS__SUBSTITUTION :
				return ((InternalEList<?>) getSubstitutions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__OWNED_ATTRIBUTE :
				return ((InternalEList<?>) getOwnedAttributes())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__OWNED_CONNECTOR :
				return ((InternalEList<?>) getOwnedConnectors())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__INTERFACE_REALIZATION :
				return ((InternalEList<?>) getInterfaceRealizations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__OWNED_BEHAVIOR :
				return ((InternalEList<?>) getOwnedBehaviors())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__OWNED_OPERATION :
				return ((InternalEList<?>) getOwnedOperations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__NESTED_CLASSIFIER :
				return ((InternalEList<?>) getNestedClassifiers())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__OWNED_RECEPTION :
				return ((InternalEList<?>) getOwnedReceptions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__MEMBER_END :
				return ((InternalEList<?>) getMemberEnds())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__OWNED_END :
				return ((InternalEList<?>) getOwnedEnds()).basicRemove(otherEnd,
					msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.ASSOCIATION_CLASS__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.ASSOCIATION_CLASS__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.ASSOCIATION_CLASS__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.ASSOCIATION_CLASS__NAME :
				return getName();
			case UMLPackage.ASSOCIATION_CLASS__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.ASSOCIATION_CLASS__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.ASSOCIATION_CLASS__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ASSOCIATION_CLASS__VISIBILITY :
				return getVisibility();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.ASSOCIATION_CLASS__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.ASSOCIATION_CLASS__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.ASSOCIATION_CLASS__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.ASSOCIATION_CLASS__MEMBER :
				return getMembers();
			case UMLPackage.ASSOCIATION_CLASS__IS_LEAF :
				return isLeaf();
			case UMLPackage.ASSOCIATION_CLASS__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.ASSOCIATION_CLASS__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.ASSOCIATION_CLASS__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.ASSOCIATION_CLASS__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.ASSOCIATION_CLASS__PACKAGE :
				if (resolve)
					return getPackage();
				return basicGetPackage();
			case UMLPackage.ASSOCIATION_CLASS__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_TEMPLATE_SIGNATURE :
				if (resolve)
					return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case UMLPackage.ASSOCIATION_CLASS__FEATURE :
				return getFeatures();
			case UMLPackage.ASSOCIATION_CLASS__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.ASSOCIATION_CLASS__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.ASSOCIATION_CLASS__GENERAL :
				return getGenerals();
			case UMLPackage.ASSOCIATION_CLASS__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.ASSOCIATION_CLASS__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.ASSOCIATION_CLASS__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.ASSOCIATION_CLASS__IS_ABSTRACT :
				return isAbstract();
			case UMLPackage.ASSOCIATION_CLASS__IS_FINAL_SPECIALIZATION :
				return isFinalSpecialization();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.ASSOCIATION_CLASS__USE_CASE :
				return getUseCases();
			case UMLPackage.ASSOCIATION_CLASS__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.ASSOCIATION_CLASS__REPRESENTATION :
				if (resolve)
					return getRepresentation();
				return basicGetRepresentation();
			case UMLPackage.ASSOCIATION_CLASS__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_ATTRIBUTE :
				return getOwnedAttributes();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_CONNECTOR :
				return getOwnedConnectors();
			case UMLPackage.ASSOCIATION_CLASS__PART :
				return getParts();
			case UMLPackage.ASSOCIATION_CLASS__ROLE :
				return getRoles();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_PORT :
				return getOwnedPorts();
			case UMLPackage.ASSOCIATION_CLASS__CLASSIFIER_BEHAVIOR :
				if (resolve)
					return getClassifierBehavior();
				return basicGetClassifierBehavior();
			case UMLPackage.ASSOCIATION_CLASS__INTERFACE_REALIZATION :
				return getInterfaceRealizations();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_BEHAVIOR :
				return getOwnedBehaviors();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_OPERATION :
				return getOwnedOperations();
			case UMLPackage.ASSOCIATION_CLASS__EXTENSION :
				return getExtensions();
			case UMLPackage.ASSOCIATION_CLASS__IS_ACTIVE :
				return isActive();
			case UMLPackage.ASSOCIATION_CLASS__NESTED_CLASSIFIER :
				return getNestedClassifiers();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_RECEPTION :
				return getOwnedReceptions();
			case UMLPackage.ASSOCIATION_CLASS__SUPER_CLASS :
				return getSuperClasses();
			case UMLPackage.ASSOCIATION_CLASS__RELATED_ELEMENT :
				return getRelatedElements();
			case UMLPackage.ASSOCIATION_CLASS__END_TYPE :
				return getEndTypes();
			case UMLPackage.ASSOCIATION_CLASS__IS_DERIVED :
				return isDerived();
			case UMLPackage.ASSOCIATION_CLASS__MEMBER_END :
				return getMemberEnds();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_END :
				return getOwnedEnds();
			case UMLPackage.ASSOCIATION_CLASS__NAVIGABLE_OWNED_END :
				return getNavigableOwnedEnds();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.ASSOCIATION_CLASS__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations()
					.addAll((Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments()
					.addAll((Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules()
					.addAll((Collection<? extends Constraint>) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports()
					.addAll((Collection<? extends ElementImport>) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports()
					.addAll((Collection<? extends PackageImport>) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__IS_LEAF :
				setIsLeaf((Boolean) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings()
					.addAll((Collection<? extends TemplateBinding>) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses()
					.addAll((Collection<? extends CollaborationUse>) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__GENERAL :
				getGenerals().clear();
				getGenerals()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations()
					.addAll((Collection<? extends Generalization>) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents()
					.addAll((Collection<? extends GeneralizationSet>) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__IS_ABSTRACT :
				setIsAbstract((Boolean) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__IS_FINAL_SPECIALIZATION :
				setIsFinalSpecialization((Boolean) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases()
					.addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection<? extends UseCase>) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions()
					.addAll((Collection<? extends Substitution>) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				getOwnedAttributes()
					.addAll((Collection<? extends Property>) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				getOwnedConnectors()
					.addAll((Collection<? extends Connector>) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				getInterfaceRealizations().addAll(
					(Collection<? extends InterfaceRealization>) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				getOwnedBehaviors()
					.addAll((Collection<? extends Behavior>) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_OPERATION :
				getOwnedOperations().clear();
				getOwnedOperations()
					.addAll((Collection<? extends Operation>) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__IS_ACTIVE :
				setIsActive((Boolean) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				getNestedClassifiers()
					.addAll((Collection<? extends Classifier>) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				getOwnedReceptions()
					.addAll((Collection<? extends Reception>) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__SUPER_CLASS :
				getSuperClasses().clear();
				getSuperClasses().addAll(
					(Collection<? extends org.eclipse.uml2.uml.Class>) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__IS_DERIVED :
				setIsDerived((Boolean) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__MEMBER_END :
				getMemberEnds().clear();
				getMemberEnds()
					.addAll((Collection<? extends Property>) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_END :
				getOwnedEnds().clear();
				getOwnedEnds()
					.addAll((Collection<? extends Property>) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__NAVIGABLE_OWNED_END :
				getNavigableOwnedEnds().clear();
				getNavigableOwnedEnds()
					.addAll((Collection<? extends Property>) newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.ASSOCIATION_CLASS__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__NAME :
				unsetName();
				return;
			case UMLPackage.ASSOCIATION_CLASS__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.ASSOCIATION_CLASS__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.ASSOCIATION_CLASS__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.ASSOCIATION_CLASS__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.ASSOCIATION_CLASS__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.ASSOCIATION_CLASS__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.ASSOCIATION_CLASS__IS_FINAL_SPECIALIZATION :
				setIsFinalSpecialization(IS_FINAL_SPECIALIZATION_EDEFAULT);
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.ASSOCIATION_CLASS__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) null);
				return;
			case UMLPackage.ASSOCIATION_CLASS__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_OPERATION :
				getOwnedOperations().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__IS_ACTIVE :
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case UMLPackage.ASSOCIATION_CLASS__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__SUPER_CLASS :
				getSuperClasses().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__IS_DERIVED :
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case UMLPackage.ASSOCIATION_CLASS__MEMBER_END :
				getMemberEnds().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_END :
				getOwnedEnds().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__NAVIGABLE_OWNED_END :
				getNavigableOwnedEnds().clear();
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.ASSOCIATION_CLASS__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ASSOCIATION_CLASS__OWNER :
				return isSetOwner();
			case UMLPackage.ASSOCIATION_CLASS__CLIENT_DEPENDENCY :
				return !getClientDependencies().isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__NAME :
				return isSetName();
			case UMLPackage.ASSOCIATION_CLASS__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.ASSOCIATION_CLASS__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.ASSOCIATION_CLASS__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.ASSOCIATION_CLASS__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_RULE :
				return ownedRules != null && !ownedRules.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__ELEMENT_IMPORT :
				return elementImports != null && !elementImports.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__PACKAGE_IMPORT :
				return packageImports != null && !packageImports.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.ASSOCIATION_CLASS__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__MEMBER :
				return isSetMembers();
			case UMLPackage.ASSOCIATION_CLASS__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.ASSOCIATION_CLASS__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.ASSOCIATION_CLASS__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.ASSOCIATION_CLASS__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.ASSOCIATION_CLASS__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.ASSOCIATION_CLASS__PACKAGE :
				return basicGetPackage() != null;
			case UMLPackage.ASSOCIATION_CLASS__TEMPLATE_BINDING :
				return templateBindings != null && !templateBindings.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_TEMPLATE_SIGNATURE :
				return isSetOwnedTemplateSignature();
			case UMLPackage.ASSOCIATION_CLASS__FEATURE :
				return isSetFeatures();
			case UMLPackage.ASSOCIATION_CLASS__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.ASSOCIATION_CLASS__COLLABORATION_USE :
				return collaborationUses != null
					&& !collaborationUses.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__GENERAL :
				return isSetGenerals();
			case UMLPackage.ASSOCIATION_CLASS__GENERALIZATION :
				return generalizations != null && !generalizations.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__POWERTYPE_EXTENT :
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__IS_ABSTRACT :
				return isSetIsAbstract();
			case UMLPackage.ASSOCIATION_CLASS__IS_FINAL_SPECIALIZATION :
				return ((eFlags
					& IS_FINAL_SPECIALIZATION_EFLAG) != 0) != IS_FINAL_SPECIALIZATION_EDEFAULT;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_USE_CASE :
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__USE_CASE :
				return useCases != null && !useCases.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__REDEFINED_CLASSIFIER :
				return redefinedClassifiers != null
					&& !redefinedClassifiers.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__REPRESENTATION :
				return representation != null;
			case UMLPackage.ASSOCIATION_CLASS__SUBSTITUTION :
				return substitutions != null && !substitutions.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_ATTRIBUTE :
				return isSetOwnedAttributes();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_CONNECTOR :
				return ownedConnectors != null && !ownedConnectors.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__PART :
				return !getParts().isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__ROLE :
				return isSetRoles();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_PORT :
				return !getOwnedPorts().isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__CLASSIFIER_BEHAVIOR :
				return classifierBehavior != null;
			case UMLPackage.ASSOCIATION_CLASS__INTERFACE_REALIZATION :
				return interfaceRealizations != null
					&& !interfaceRealizations.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_BEHAVIOR :
				return ownedBehaviors != null && !ownedBehaviors.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_OPERATION :
				return ownedOperations != null && !ownedOperations.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__EXTENSION :
				return !getExtensions().isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__IS_ACTIVE :
				return ((eFlags & IS_ACTIVE_EFLAG) != 0) != IS_ACTIVE_EDEFAULT;
			case UMLPackage.ASSOCIATION_CLASS__NESTED_CLASSIFIER :
				return nestedClassifiers != null
					&& !nestedClassifiers.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_RECEPTION :
				return ownedReceptions != null && !ownedReceptions.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__SUPER_CLASS :
				return isSetSuperClasses();
			case UMLPackage.ASSOCIATION_CLASS__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.ASSOCIATION_CLASS__END_TYPE :
				return !getEndTypes().isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__IS_DERIVED :
				return ((eFlags
					& IS_DERIVED_EFLAG) != 0) != IS_DERIVED_EDEFAULT;
			case UMLPackage.ASSOCIATION_CLASS__MEMBER_END :
				return memberEnds != null && !memberEnds.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_END :
				return ownedEnds != null && !ownedEnds.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__NAVIGABLE_OWNED_END :
				return navigableOwnedEnds != null
					&& !navigableOwnedEnds.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID,
			Class<?> baseClass) {
		if (baseClass == Relationship.class) {
			switch (derivedFeatureID) {
				case UMLPackage.ASSOCIATION_CLASS__RELATED_ELEMENT :
					return UMLPackage.RELATIONSHIP__RELATED_ELEMENT;
				default :
					return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (derivedFeatureID) {
				case UMLPackage.ASSOCIATION_CLASS__END_TYPE :
					return UMLPackage.ASSOCIATION__END_TYPE;
				case UMLPackage.ASSOCIATION_CLASS__IS_DERIVED :
					return UMLPackage.ASSOCIATION__IS_DERIVED;
				case UMLPackage.ASSOCIATION_CLASS__MEMBER_END :
					return UMLPackage.ASSOCIATION__MEMBER_END;
				case UMLPackage.ASSOCIATION_CLASS__OWNED_END :
					return UMLPackage.ASSOCIATION__OWNED_END;
				case UMLPackage.ASSOCIATION_CLASS__NAVIGABLE_OWNED_END :
					return UMLPackage.ASSOCIATION__NAVIGABLE_OWNED_END;
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
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID,
			Class<?> baseClass) {
		if (baseClass == Relationship.class) {
			switch (baseFeatureID) {
				case UMLPackage.RELATIONSHIP__RELATED_ELEMENT :
					return UMLPackage.ASSOCIATION_CLASS__RELATED_ELEMENT;
				default :
					return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (baseFeatureID) {
				case UMLPackage.ASSOCIATION__END_TYPE :
					return UMLPackage.ASSOCIATION_CLASS__END_TYPE;
				case UMLPackage.ASSOCIATION__IS_DERIVED :
					return UMLPackage.ASSOCIATION_CLASS__IS_DERIVED;
				case UMLPackage.ASSOCIATION__MEMBER_END :
					return UMLPackage.ASSOCIATION_CLASS__MEMBER_END;
				case UMLPackage.ASSOCIATION__OWNED_END :
					return UMLPackage.ASSOCIATION_CLASS__OWNED_END;
				case UMLPackage.ASSOCIATION__NAVIGABLE_OWNED_END :
					return UMLPackage.ASSOCIATION_CLASS__NAVIGABLE_OWNED_END;
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
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Relationship.class) {
			switch (baseOperationID) {
				default :
					return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (baseOperationID) {
				case UMLPackage.ASSOCIATION___VALIDATE_SPECIALIZED_END_NUMBER__DIAGNOSTICCHAIN_MAP :
					return UMLPackage.ASSOCIATION_CLASS___VALIDATE_SPECIALIZED_END_NUMBER__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.ASSOCIATION___VALIDATE_SPECIALIZED_END_TYPES__DIAGNOSTICCHAIN_MAP :
					return UMLPackage.ASSOCIATION_CLASS___VALIDATE_SPECIALIZED_END_TYPES__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.ASSOCIATION___VALIDATE_BINARY_ASSOCIATIONS__DIAGNOSTICCHAIN_MAP :
					return UMLPackage.ASSOCIATION_CLASS___VALIDATE_BINARY_ASSOCIATIONS__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.ASSOCIATION___VALIDATE_ASSOCIATION_ENDS__DIAGNOSTICCHAIN_MAP :
					return UMLPackage.ASSOCIATION_CLASS___VALIDATE_ASSOCIATION_ENDS__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.ASSOCIATION___VALIDATE_ENDS_MUST_BE_TYPED__DIAGNOSTICCHAIN_MAP :
					return UMLPackage.ASSOCIATION_CLASS___VALIDATE_ENDS_MUST_BE_TYPED__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.ASSOCIATION___IS_BINARY :
					return UMLPackage.ASSOCIATION_CLASS___IS_BINARY;
				case UMLPackage.ASSOCIATION___GET_END_TYPES :
					return UMLPackage.ASSOCIATION_CLASS___GET_END_TYPES;
				default :
					return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case UMLPackage.ASSOCIATION_CLASS___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.ASSOCIATION_CLASS___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ASSOCIATION_CLASS___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ASSOCIATION_CLASS___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.ASSOCIATION_CLASS___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.ASSOCIATION_CLASS___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.ASSOCIATION_CLASS___DESTROY :
				destroy();
				return null;
			case UMLPackage.ASSOCIATION_CLASS___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.ASSOCIATION_CLASS___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.ASSOCIATION_CLASS___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.ASSOCIATION_CLASS___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.ASSOCIATION_CLASS___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.ASSOCIATION_CLASS___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ASSOCIATION_CLASS___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.ASSOCIATION_CLASS___GET_MODEL :
				return getModel();
			case UMLPackage.ASSOCIATION_CLASS___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.ASSOCIATION_CLASS___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.ASSOCIATION_CLASS___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.ASSOCIATION_CLASS___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.ASSOCIATION_CLASS___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.ASSOCIATION_CLASS___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.ASSOCIATION_CLASS___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.ASSOCIATION_CLASS___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.ASSOCIATION_CLASS___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.ASSOCIATION_CLASS___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.ASSOCIATION_CLASS___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.ASSOCIATION_CLASS___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ASSOCIATION_CLASS___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.ASSOCIATION_CLASS___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.ASSOCIATION_CLASS___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.ASSOCIATION_CLASS___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.ASSOCIATION_CLASS___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.ASSOCIATION_CLASS___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.ASSOCIATION_CLASS___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.ASSOCIATION_CLASS___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.ASSOCIATION_CLASS___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.ASSOCIATION_CLASS___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.ASSOCIATION_CLASS___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ASSOCIATION_CLASS___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ASSOCIATION_CLASS___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ASSOCIATION_CLASS___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.ASSOCIATION_CLASS___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.ASSOCIATION_CLASS___GET_LABEL :
				return getLabel();
			case UMLPackage.ASSOCIATION_CLASS___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.ASSOCIATION_CLASS___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.ASSOCIATION_CLASS___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.ASSOCIATION_CLASS___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.ASSOCIATION_CLASS___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.ASSOCIATION_CLASS___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ASSOCIATION_CLASS___SEPARATOR :
				return separator();
			case UMLPackage.ASSOCIATION_CLASS___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.ASSOCIATION_CLASS___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP :
				return validateMembersDistinguishable(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ASSOCIATION_CLASS___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportSelf(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ASSOCIATION_CLASS___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportOwnedMembers(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ASSOCIATION_CLASS___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND :
				return createElementImport(
					(PackageableElement) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.ASSOCIATION_CLASS___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND :
				return createPackageImport(
					(org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.ASSOCIATION_CLASS___GET_IMPORTED_ELEMENTS :
				return getImportedElements();
			case UMLPackage.ASSOCIATION_CLASS___GET_IMPORTED_PACKAGES :
				return getImportedPackages();
			case UMLPackage.ASSOCIATION_CLASS___GET_OWNED_MEMBERS :
				return getOwnedMembers();
			case UMLPackage.ASSOCIATION_CLASS___EXCLUDE_COLLISIONS__ELIST :
				return excludeCollisions(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.ASSOCIATION_CLASS___GET_NAMES_OF_MEMBER__NAMEDELEMENT :
				return getNamesOfMember((NamedElement) arguments.get(0));
			case UMLPackage.ASSOCIATION_CLASS___IMPORT_MEMBERS__ELIST :
				return importMembers(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.ASSOCIATION_CLASS___GET_IMPORTED_MEMBERS :
				return getImportedMembers();
			case UMLPackage.ASSOCIATION_CLASS___MEMBERS_ARE_DISTINGUISHABLE :
				return membersAreDistinguishable();
			case UMLPackage.ASSOCIATION_CLASS___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ASSOCIATION_CLASS___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ASSOCIATION_CLASS___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ASSOCIATION_CLASS___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.ASSOCIATION_CLASS___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.ASSOCIATION_CLASS___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT :
				return isCompatibleWith(
					(ParameterableElement) arguments.get(0));
			case UMLPackage.ASSOCIATION_CLASS___IS_TEMPLATE_PARAMETER :
				return isTemplateParameter();
			case UMLPackage.ASSOCIATION_CLASS___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP :
				return validateNamespaceNeedsVisibility(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ASSOCIATION_CLASS___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT :
				return createAssociation((Boolean) arguments.get(0),
					(AggregationKind) arguments.get(1),
					(String) arguments.get(2), (Integer) arguments.get(3),
					(Integer) arguments.get(4), (Type) arguments.get(5),
					(Boolean) arguments.get(6),
					(AggregationKind) arguments.get(7),
					(String) arguments.get(8), (Integer) arguments.get(9),
					(Integer) arguments.get(10));
			case UMLPackage.ASSOCIATION_CLASS___GET_ASSOCIATIONS :
				return getAssociations();
			case UMLPackage.ASSOCIATION_CLASS___CONFORMS_TO__TYPE :
				return conformsTo((Type) arguments.get(0));
			case UMLPackage.ASSOCIATION_CLASS___IS_TEMPLATE :
				return isTemplate();
			case UMLPackage.ASSOCIATION_CLASS___PARAMETERABLE_ELEMENTS :
				return parameterableElements();
			case UMLPackage.ASSOCIATION_CLASS___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP :
				return validateSpecializeType(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ASSOCIATION_CLASS___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP :
				return validateMapsToGeneralizationSet(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ASSOCIATION_CLASS___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP :
				return validateNonFinalParents(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ASSOCIATION_CLASS___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP :
				return validateNoCyclesInGeneralization(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ASSOCIATION_CLASS___GET_ALL_ATTRIBUTES :
				return getAllAttributes();
			case UMLPackage.ASSOCIATION_CLASS___GET_ALL_OPERATIONS :
				return getAllOperations();
			case UMLPackage.ASSOCIATION_CLASS___GET_ALL_USED_INTERFACES :
				return getAllUsedInterfaces();
			case UMLPackage.ASSOCIATION_CLASS___GET_OPERATION__STRING_ELIST_ELIST :
				return getOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2));
			case UMLPackage.ASSOCIATION_CLASS___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN :
				return getOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2), (Boolean) arguments.get(3));
			case UMLPackage.ASSOCIATION_CLASS___GET_OPERATIONS :
				return getOperations();
			case UMLPackage.ASSOCIATION_CLASS___GET_USED_INTERFACES :
				return getUsedInterfaces();
			case UMLPackage.ASSOCIATION_CLASS___ALL_FEATURES :
				return allFeatures();
			case UMLPackage.ASSOCIATION_CLASS___ALL_PARENTS :
				return allParents();
			case UMLPackage.ASSOCIATION_CLASS___GET_GENERALS :
				return getGenerals();
			case UMLPackage.ASSOCIATION_CLASS___HAS_VISIBILITY_OF__NAMEDELEMENT :
				return hasVisibilityOf((NamedElement) arguments.get(0));
			case UMLPackage.ASSOCIATION_CLASS___INHERIT__ELIST :
				return inherit((EList<NamedElement>) arguments.get(0));
			case UMLPackage.ASSOCIATION_CLASS___INHERITABLE_MEMBERS__CLASSIFIER :
				return inheritableMembers((Classifier) arguments.get(0));
			case UMLPackage.ASSOCIATION_CLASS___GET_INHERITED_MEMBERS :
				return getInheritedMembers();
			case UMLPackage.ASSOCIATION_CLASS___MAY_SPECIALIZE_TYPE__CLASSIFIER :
				return maySpecializeType((Classifier) arguments.get(0));
			case UMLPackage.ASSOCIATION_CLASS___PARENTS :
				return parents();
			case UMLPackage.ASSOCIATION_CLASS___DIRECTLY_REALIZED_INTERFACES :
				return directlyRealizedInterfaces();
			case UMLPackage.ASSOCIATION_CLASS___DIRECTLY_USED_INTERFACES :
				return directlyUsedInterfaces();
			case UMLPackage.ASSOCIATION_CLASS___ALL_REALIZED_INTERFACES :
				return allRealizedInterfaces();
			case UMLPackage.ASSOCIATION_CLASS___ALL_USED_INTERFACES :
				return allUsedInterfaces();
			case UMLPackage.ASSOCIATION_CLASS___IS_SUBSTITUTABLE_FOR__CLASSIFIER :
				return isSubstitutableFor((Classifier) arguments.get(0));
			case UMLPackage.ASSOCIATION_CLASS___ALL_ATTRIBUTES :
				return allAttributes();
			case UMLPackage.ASSOCIATION_CLASS___ALL_SLOTTABLE_FEATURES :
				return allSlottableFeatures();
			case UMLPackage.ASSOCIATION_CLASS___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT :
				return createOwnedAttribute((String) arguments.get(0),
					(Type) arguments.get(1), (Integer) arguments.get(2),
					(Integer) arguments.get(3));
			case UMLPackage.ASSOCIATION_CLASS___GET_PARTS :
				return getParts();
			case UMLPackage.ASSOCIATION_CLASS___ALL_ROLES :
				return allRoles();
			case UMLPackage.ASSOCIATION_CLASS___GET_OWNED_PORTS :
				return getOwnedPorts();
			case UMLPackage.ASSOCIATION_CLASS___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP :
				return validateClassBehavior((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ASSOCIATION_CLASS___GET_ALL_IMPLEMENTED_INTERFACES :
				return getAllImplementedInterfaces();
			case UMLPackage.ASSOCIATION_CLASS___GET_IMPLEMENTED_INTERFACES :
				return getImplementedInterfaces();
			case UMLPackage.ASSOCIATION_CLASS___VALIDATE_PASSIVE_CLASS__DIAGNOSTICCHAIN_MAP :
				return validatePassiveClass((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ASSOCIATION_CLASS___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE :
				return createOwnedOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2), (Type) arguments.get(3));
			case UMLPackage.ASSOCIATION_CLASS___IS_METACLASS :
				return isMetaclass();
			case UMLPackage.ASSOCIATION_CLASS___GET_EXTENSIONS :
				return getExtensions();
			case UMLPackage.ASSOCIATION_CLASS___GET_SUPER_CLASSES :
				return getSuperClasses();
			case UMLPackage.ASSOCIATION_CLASS___VALIDATE_SPECIALIZED_END_NUMBER__DIAGNOSTICCHAIN_MAP :
				return validateSpecializedEndNumber(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ASSOCIATION_CLASS___VALIDATE_SPECIALIZED_END_TYPES__DIAGNOSTICCHAIN_MAP :
				return validateSpecializedEndTypes(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ASSOCIATION_CLASS___VALIDATE_BINARY_ASSOCIATIONS__DIAGNOSTICCHAIN_MAP :
				return validateBinaryAssociations(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ASSOCIATION_CLASS___VALIDATE_ASSOCIATION_ENDS__DIAGNOSTICCHAIN_MAP :
				return validateAssociationEnds(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ASSOCIATION_CLASS___VALIDATE_ENDS_MUST_BE_TYPED__DIAGNOSTICCHAIN_MAP :
				return validateEndsMustBeTyped(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ASSOCIATION_CLASS___IS_BINARY :
				return isBinary();
			case UMLPackage.ASSOCIATION_CLASS___GET_END_TYPES :
				return getEndTypes();
			case UMLPackage.ASSOCIATION_CLASS___VALIDATE_CANNOT_BE_DEFINED__DIAGNOSTICCHAIN_MAP :
				return validateCannotBeDefined(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.ASSOCIATION_CLASS___VALIDATE_DISJOINT_ATTRIBUTES_ENDS__DIAGNOSTICCHAIN_MAP :
				return validateDisjointAttributesEnds(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isDerived: "); //$NON-NLS-1$
		result.append((eFlags & IS_DERIVED_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRelatedElements() <em>Related Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] RELATED_ELEMENT_ESUBSETS = new int[]{
		UMLPackage.ASSOCIATION_CLASS__END_TYPE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelatedElements() {
		return eIsSet(UMLPackage.ASSOCIATION_CLASS__END_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMembers() {
		return super.isSetMembers()
			|| eIsSet(UMLPackage.ASSOCIATION_CLASS__MEMBER_END);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFeatures() {
		return super.isSetFeatures()
			|| eIsSet(UMLPackage.ASSOCIATION_CLASS__OWNED_END);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.ASSOCIATION_CLASS__OWNED_END);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getMembers() <em>Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] MEMBER_ESUBSETS = new int[]{
		UMLPackage.ASSOCIATION_CLASS__OWNED_MEMBER,
		UMLPackage.ASSOCIATION_CLASS__IMPORTED_MEMBER,
		UMLPackage.ASSOCIATION_CLASS__FEATURE,
		UMLPackage.ASSOCIATION_CLASS__INHERITED_MEMBER,
		UMLPackage.ASSOCIATION_CLASS__ROLE,
		UMLPackage.ASSOCIATION_CLASS__MEMBER_END};

	/**
	 * The array of subset feature identifiers for the '{@link #getFeatures() <em>Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected static final int[] FEATURE_ESUBSETS = new int[]{
		UMLPackage.ASSOCIATION_CLASS__ATTRIBUTE,
		UMLPackage.ASSOCIATION_CLASS__OWNED_CONNECTOR,
		UMLPackage.ASSOCIATION_CLASS__OWNED_OPERATION,
		UMLPackage.ASSOCIATION_CLASS__OWNED_RECEPTION,
		UMLPackage.ASSOCIATION_CLASS__OWNED_END};

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMembers() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[]{
		UMLPackage.ASSOCIATION_CLASS__OWNED_RULE,
		UMLPackage.ASSOCIATION_CLASS__OWNED_USE_CASE,
		UMLPackage.ASSOCIATION_CLASS__OWNED_ATTRIBUTE,
		UMLPackage.ASSOCIATION_CLASS__OWNED_CONNECTOR,
		UMLPackage.ASSOCIATION_CLASS__OWNED_BEHAVIOR,
		UMLPackage.ASSOCIATION_CLASS__OWNED_OPERATION,
		UMLPackage.ASSOCIATION_CLASS__NESTED_CLASSIFIER,
		UMLPackage.ASSOCIATION_CLASS__OWNED_RECEPTION,
		UMLPackage.ASSOCIATION_CLASS__OWNED_END};

	/**
	 * The array of subset feature identifiers for the '{@link #getMemberEnds() <em>Member End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberEnds()
	 * @generated
	 * @ordered
	 */
	protected static final int[] MEMBER_END_ESUBSETS = new int[]{
		UMLPackage.ASSOCIATION_CLASS__OWNED_END};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getMemberEnd(String name, Type type) {
		return getMemberEnd(name, type, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getMemberEnd(String name, Type type, boolean ignoreCase,
			EClass eClass) {
		memberEndLoop : for (Property memberEnd : getMemberEnds()) {
			if (eClass != null && !eClass.isInstance(memberEnd))
				continue memberEndLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(memberEnd.getName())
				: name.equals(memberEnd.getName())))
				continue memberEndLoop;
			if (type != null && !type.equals(memberEnd.getType()))
				continue memberEndLoop;
			return memberEnd;
		}
		return null;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedEnds() <em>Owned End</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEnds()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_END_ESUBSETS = new int[]{
		UMLPackage.ASSOCIATION_CLASS__NAVIGABLE_OWNED_END};

	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedEnds() <em>Owned End</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEnds()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_END_ESUPERSETS = new int[]{
		UMLPackage.ASSOCIATION_CLASS__MEMBER_END};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createOwnedEnd(String name, Type type, EClass eClass) {
		Property newOwnedEnd = (Property) create(eClass);
		getOwnedEnds().add(newOwnedEnd);
		if (name != null)
			newOwnedEnd.setName(name);
		if (type != null)
			newOwnedEnd.setType(type);
		return newOwnedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createOwnedEnd(String name, Type type) {
		return createOwnedEnd(name, type, UMLPackage.Literals.PROPERTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOwnedEnd(String name, Type type) {
		return getOwnedEnd(name, type, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOwnedEnd(String name, Type type, boolean ignoreCase,
			EClass eClass, boolean createOnDemand) {
		ownedEndLoop : for (Property ownedEnd : getOwnedEnds()) {
			if (eClass != null && !eClass.isInstance(ownedEnd))
				continue ownedEndLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(ownedEnd.getName())
				: name.equals(ownedEnd.getName())))
				continue ownedEndLoop;
			if (type != null && !type.equals(ownedEnd.getType()))
				continue ownedEndLoop;
			return ownedEnd;
		}
		return createOnDemand && eClass != null
			? createOwnedEnd(name, type, eClass)
			: null;
	}

	/**
	 * The array of superset feature identifiers for the '{@link #getNavigableOwnedEnds() <em>Navigable Owned End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigableOwnedEnds()
	 * @generated
	 * @ordered
	 */
	protected static final int[] NAVIGABLE_OWNED_END_ESUPERSETS = new int[]{
		UMLPackage.ASSOCIATION_CLASS__OWNED_END};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createNavigableOwnedEnd(String name, Type type,
			EClass eClass) {
		Property newNavigableOwnedEnd = (Property) create(eClass);
		getNavigableOwnedEnds().add(newNavigableOwnedEnd);
		if (name != null)
			newNavigableOwnedEnd.setName(name);
		if (type != null)
			newNavigableOwnedEnd.setType(type);
		return newNavigableOwnedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createNavigableOwnedEnd(String name, Type type) {
		return createNavigableOwnedEnd(name, type,
			UMLPackage.Literals.PROPERTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getNavigableOwnedEnd(String name, Type type) {
		return getNavigableOwnedEnd(name, type, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getNavigableOwnedEnd(String name, Type type,
			boolean ignoreCase, EClass eClass, boolean createOnDemand) {
		navigableOwnedEndLoop : for (Property navigableOwnedEnd : getNavigableOwnedEnds()) {
			if (eClass != null && !eClass.isInstance(navigableOwnedEnd))
				continue navigableOwnedEndLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(navigableOwnedEnd.getName())
				: name.equals(navigableOwnedEnd.getName())))
				continue navigableOwnedEndLoop;
			if (type != null && !type.equals(navigableOwnedEnd.getType()))
				continue navigableOwnedEndLoop;
			return navigableOwnedEnd;
		}
		return createOnDemand && eClass != null
			? createNavigableOwnedEnd(name, type, eClass)
			: null;
	}

} //AssociationClassImpl
