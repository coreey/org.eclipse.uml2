/*
 * Copyright (c) 2005, 2018 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 286329, 323181, 535301
 *   Kenn Hussey (CEA) - 327039, 351774, 418466, 451350, 485756
 *
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CommunicationPath;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.internal.operations.CommunicationPathOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CommunicationPathImpl
		extends AssociationImpl
		implements CommunicationPath {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationPathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.COMMUNICATION_PATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAssociationEnds(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CommunicationPathOperations.validateAssociationEnds(this,
			diagnostics, context);
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
			case UMLPackage.COMMUNICATION_PATH___GET_EANNOTATION__STRING :
				return getEAnnotation((String) arguments.get(0));
			case UMLPackage.COMMUNICATION_PATH___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP :
				return validateHasOwner((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMMUNICATION_PATH___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP :
				return validateNotOwnSelf((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMMUNICATION_PATH___ADD_KEYWORD__STRING :
				return addKeyword((String) arguments.get(0));
			case UMLPackage.COMMUNICATION_PATH___APPLY_STEREOTYPE__STEREOTYPE :
				return applyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.COMMUNICATION_PATH___CREATE_EANNOTATION__STRING :
				return createEAnnotation((String) arguments.get(0));
			case UMLPackage.COMMUNICATION_PATH___DESTROY :
				destroy();
				return null;
			case UMLPackage.COMMUNICATION_PATH___GET_KEYWORDS :
				return getKeywords();
			case UMLPackage.COMMUNICATION_PATH___GET_APPLICABLE_STEREOTYPE__STRING :
				return getApplicableStereotype((String) arguments.get(0));
			case UMLPackage.COMMUNICATION_PATH___GET_APPLICABLE_STEREOTYPES :
				return getApplicableStereotypes();
			case UMLPackage.COMMUNICATION_PATH___GET_APPLIED_STEREOTYPE__STRING :
				return getAppliedStereotype((String) arguments.get(0));
			case UMLPackage.COMMUNICATION_PATH___GET_APPLIED_STEREOTYPES :
				return getAppliedStereotypes();
			case UMLPackage.COMMUNICATION_PATH___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING :
				return getAppliedSubstereotype((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.COMMUNICATION_PATH___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE :
				return getAppliedSubstereotypes((Stereotype) arguments.get(0));
			case UMLPackage.COMMUNICATION_PATH___GET_MODEL :
				return getModel();
			case UMLPackage.COMMUNICATION_PATH___GET_NEAREST_PACKAGE :
				return getNearestPackage();
			case UMLPackage.COMMUNICATION_PATH___GET_RELATIONSHIPS :
				return getRelationships();
			case UMLPackage.COMMUNICATION_PATH___GET_RELATIONSHIPS__ECLASS :
				return getRelationships((EClass) arguments.get(0));
			case UMLPackage.COMMUNICATION_PATH___GET_REQUIRED_STEREOTYPE__STRING :
				return getRequiredStereotype((String) arguments.get(0));
			case UMLPackage.COMMUNICATION_PATH___GET_REQUIRED_STEREOTYPES :
				return getRequiredStereotypes();
			case UMLPackage.COMMUNICATION_PATH___GET_SOURCE_DIRECTED_RELATIONSHIPS :
				return getSourceDirectedRelationships();
			case UMLPackage.COMMUNICATION_PATH___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS :
				return getSourceDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.COMMUNICATION_PATH___GET_STEREOTYPE_APPLICATION__STEREOTYPE :
				return getStereotypeApplication((Stereotype) arguments.get(0));
			case UMLPackage.COMMUNICATION_PATH___GET_STEREOTYPE_APPLICATIONS :
				return getStereotypeApplications();
			case UMLPackage.COMMUNICATION_PATH___GET_TARGET_DIRECTED_RELATIONSHIPS :
				return getTargetDirectedRelationships();
			case UMLPackage.COMMUNICATION_PATH___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS :
				return getTargetDirectedRelationships(
					(EClass) arguments.get(0));
			case UMLPackage.COMMUNICATION_PATH___GET_VALUE__STEREOTYPE_STRING :
				return getValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.COMMUNICATION_PATH___HAS_KEYWORD__STRING :
				return hasKeyword((String) arguments.get(0));
			case UMLPackage.COMMUNICATION_PATH___HAS_VALUE__STEREOTYPE_STRING :
				return hasValue((Stereotype) arguments.get(0),
					(String) arguments.get(1));
			case UMLPackage.COMMUNICATION_PATH___IS_STEREOTYPE_APPLICABLE__STEREOTYPE :
				return isStereotypeApplicable((Stereotype) arguments.get(0));
			case UMLPackage.COMMUNICATION_PATH___IS_STEREOTYPE_APPLIED__STEREOTYPE :
				return isStereotypeApplied((Stereotype) arguments.get(0));
			case UMLPackage.COMMUNICATION_PATH___IS_STEREOTYPE_REQUIRED__STEREOTYPE :
				return isStereotypeRequired((Stereotype) arguments.get(0));
			case UMLPackage.COMMUNICATION_PATH___REMOVE_KEYWORD__STRING :
				return removeKeyword((String) arguments.get(0));
			case UMLPackage.COMMUNICATION_PATH___SET_VALUE__STEREOTYPE_STRING_OBJECT :
				setValue((Stereotype) arguments.get(0),
					(String) arguments.get(1), arguments.get(2));
				return null;
			case UMLPackage.COMMUNICATION_PATH___UNAPPLY_STEREOTYPE__STEREOTYPE :
				return unapplyStereotype((Stereotype) arguments.get(0));
			case UMLPackage.COMMUNICATION_PATH___ALL_OWNED_ELEMENTS :
				return allOwnedElements();
			case UMLPackage.COMMUNICATION_PATH___MUST_BE_OWNED :
				return mustBeOwned();
			case UMLPackage.COMMUNICATION_PATH___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP :
				return validateVisibilityNeedsOwnership(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMMUNICATION_PATH___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMMUNICATION_PATH___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP :
				return validateHasNoQualifiedName(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMMUNICATION_PATH___CREATE_DEPENDENCY__NAMEDELEMENT :
				return createDependency((NamedElement) arguments.get(0));
			case UMLPackage.COMMUNICATION_PATH___CREATE_USAGE__NAMEDELEMENT :
				return createUsage((NamedElement) arguments.get(0));
			case UMLPackage.COMMUNICATION_PATH___GET_LABEL :
				return getLabel();
			case UMLPackage.COMMUNICATION_PATH___GET_LABEL__BOOLEAN :
				return getLabel((Boolean) arguments.get(0));
			case UMLPackage.COMMUNICATION_PATH___GET_NAMESPACE :
				return getNamespace();
			case UMLPackage.COMMUNICATION_PATH___ALL_NAMESPACES :
				return allNamespaces();
			case UMLPackage.COMMUNICATION_PATH___ALL_OWNING_PACKAGES :
				return allOwningPackages();
			case UMLPackage.COMMUNICATION_PATH___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE :
				return isDistinguishableFrom((NamedElement) arguments.get(0),
					(Namespace) arguments.get(1));
			case UMLPackage.COMMUNICATION_PATH___GET_QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.COMMUNICATION_PATH___SEPARATOR :
				return separator();
			case UMLPackage.COMMUNICATION_PATH___GET_CLIENT_DEPENDENCIES :
				return getClientDependencies();
			case UMLPackage.COMMUNICATION_PATH___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP :
				return validateMembersDistinguishable(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMMUNICATION_PATH___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportSelf(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMMUNICATION_PATH___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP :
				return validateCannotImportOwnedMembers(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMMUNICATION_PATH___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND :
				return createElementImport(
					(PackageableElement) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.COMMUNICATION_PATH___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND :
				return createPackageImport(
					(org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
			case UMLPackage.COMMUNICATION_PATH___GET_IMPORTED_ELEMENTS :
				return getImportedElements();
			case UMLPackage.COMMUNICATION_PATH___GET_IMPORTED_PACKAGES :
				return getImportedPackages();
			case UMLPackage.COMMUNICATION_PATH___GET_OWNED_MEMBERS :
				return getOwnedMembers();
			case UMLPackage.COMMUNICATION_PATH___EXCLUDE_COLLISIONS__ELIST :
				return excludeCollisions(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.COMMUNICATION_PATH___GET_NAMES_OF_MEMBER__NAMEDELEMENT :
				return getNamesOfMember((NamedElement) arguments.get(0));
			case UMLPackage.COMMUNICATION_PATH___IMPORT_MEMBERS__ELIST :
				return importMembers(
					(EList<PackageableElement>) arguments.get(0));
			case UMLPackage.COMMUNICATION_PATH___GET_IMPORTED_MEMBERS :
				return getImportedMembers();
			case UMLPackage.COMMUNICATION_PATH___MEMBERS_ARE_DISTINGUISHABLE :
				return membersAreDistinguishable();
			case UMLPackage.COMMUNICATION_PATH___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionConsistent(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMMUNICATION_PATH___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP :
				return validateNonLeafRedefinition(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMMUNICATION_PATH___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP :
				return validateRedefinitionContextValid(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMMUNICATION_PATH___IS_CONSISTENT_WITH__REDEFINABLEELEMENT :
				return isConsistentWith((RedefinableElement) arguments.get(0));
			case UMLPackage.COMMUNICATION_PATH___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT :
				return isRedefinitionContextValid(
					(RedefinableElement) arguments.get(0));
			case UMLPackage.COMMUNICATION_PATH___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT :
				return isCompatibleWith(
					(ParameterableElement) arguments.get(0));
			case UMLPackage.COMMUNICATION_PATH___IS_TEMPLATE_PARAMETER :
				return isTemplateParameter();
			case UMLPackage.COMMUNICATION_PATH___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP :
				return validateNamespaceNeedsVisibility(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMMUNICATION_PATH___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT :
				return createAssociation((Boolean) arguments.get(0),
					(AggregationKind) arguments.get(1),
					(String) arguments.get(2), (Integer) arguments.get(3),
					(Integer) arguments.get(4), (Type) arguments.get(5),
					(Boolean) arguments.get(6),
					(AggregationKind) arguments.get(7),
					(String) arguments.get(8), (Integer) arguments.get(9),
					(Integer) arguments.get(10));
			case UMLPackage.COMMUNICATION_PATH___GET_ASSOCIATIONS :
				return getAssociations();
			case UMLPackage.COMMUNICATION_PATH___CONFORMS_TO__TYPE :
				return conformsTo((Type) arguments.get(0));
			case UMLPackage.COMMUNICATION_PATH___IS_TEMPLATE :
				return isTemplate();
			case UMLPackage.COMMUNICATION_PATH___PARAMETERABLE_ELEMENTS :
				return parameterableElements();
			case UMLPackage.COMMUNICATION_PATH___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP :
				return validateSpecializeType(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMMUNICATION_PATH___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP :
				return validateMapsToGeneralizationSet(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMMUNICATION_PATH___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP :
				return validateNonFinalParents(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMMUNICATION_PATH___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP :
				return validateNoCyclesInGeneralization(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMMUNICATION_PATH___GET_ALL_ATTRIBUTES :
				return getAllAttributes();
			case UMLPackage.COMMUNICATION_PATH___GET_ALL_OPERATIONS :
				return getAllOperations();
			case UMLPackage.COMMUNICATION_PATH___GET_ALL_USED_INTERFACES :
				return getAllUsedInterfaces();
			case UMLPackage.COMMUNICATION_PATH___GET_OPERATION__STRING_ELIST_ELIST :
				return getOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2));
			case UMLPackage.COMMUNICATION_PATH___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN :
				return getOperation((String) arguments.get(0),
					(EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2), (Boolean) arguments.get(3));
			case UMLPackage.COMMUNICATION_PATH___GET_OPERATIONS :
				return getOperations();
			case UMLPackage.COMMUNICATION_PATH___GET_USED_INTERFACES :
				return getUsedInterfaces();
			case UMLPackage.COMMUNICATION_PATH___ALL_FEATURES :
				return allFeatures();
			case UMLPackage.COMMUNICATION_PATH___ALL_PARENTS :
				return allParents();
			case UMLPackage.COMMUNICATION_PATH___GET_GENERALS :
				return getGenerals();
			case UMLPackage.COMMUNICATION_PATH___HAS_VISIBILITY_OF__NAMEDELEMENT :
				return hasVisibilityOf((NamedElement) arguments.get(0));
			case UMLPackage.COMMUNICATION_PATH___INHERIT__ELIST :
				return inherit((EList<NamedElement>) arguments.get(0));
			case UMLPackage.COMMUNICATION_PATH___INHERITABLE_MEMBERS__CLASSIFIER :
				return inheritableMembers((Classifier) arguments.get(0));
			case UMLPackage.COMMUNICATION_PATH___GET_INHERITED_MEMBERS :
				return getInheritedMembers();
			case UMLPackage.COMMUNICATION_PATH___MAY_SPECIALIZE_TYPE__CLASSIFIER :
				return maySpecializeType((Classifier) arguments.get(0));
			case UMLPackage.COMMUNICATION_PATH___PARENTS :
				return parents();
			case UMLPackage.COMMUNICATION_PATH___DIRECTLY_REALIZED_INTERFACES :
				return directlyRealizedInterfaces();
			case UMLPackage.COMMUNICATION_PATH___DIRECTLY_USED_INTERFACES :
				return directlyUsedInterfaces();
			case UMLPackage.COMMUNICATION_PATH___ALL_REALIZED_INTERFACES :
				return allRealizedInterfaces();
			case UMLPackage.COMMUNICATION_PATH___ALL_USED_INTERFACES :
				return allUsedInterfaces();
			case UMLPackage.COMMUNICATION_PATH___IS_SUBSTITUTABLE_FOR__CLASSIFIER :
				return isSubstitutableFor((Classifier) arguments.get(0));
			case UMLPackage.COMMUNICATION_PATH___ALL_ATTRIBUTES :
				return allAttributes();
			case UMLPackage.COMMUNICATION_PATH___ALL_SLOTTABLE_FEATURES :
				return allSlottableFeatures();
			case UMLPackage.COMMUNICATION_PATH___VALIDATE_SPECIALIZED_END_NUMBER__DIAGNOSTICCHAIN_MAP :
				return validateSpecializedEndNumber(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMMUNICATION_PATH___VALIDATE_SPECIALIZED_END_TYPES__DIAGNOSTICCHAIN_MAP :
				return validateSpecializedEndTypes(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMMUNICATION_PATH___VALIDATE_BINARY_ASSOCIATIONS__DIAGNOSTICCHAIN_MAP :
				return validateBinaryAssociations(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMMUNICATION_PATH___VALIDATE_ASSOCIATION_ENDS__DIAGNOSTICCHAIN_MAP :
				return validateAssociationEnds(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMMUNICATION_PATH___VALIDATE_ENDS_MUST_BE_TYPED__DIAGNOSTICCHAIN_MAP :
				return validateEndsMustBeTyped(
					(DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
			case UMLPackage.COMMUNICATION_PATH___IS_BINARY :
				return isBinary();
			case UMLPackage.COMMUNICATION_PATH___GET_END_TYPES :
				return getEndTypes();
		}
		return eDynamicInvoke(operationID, arguments);
	}

} //CommunicationPathImpl
