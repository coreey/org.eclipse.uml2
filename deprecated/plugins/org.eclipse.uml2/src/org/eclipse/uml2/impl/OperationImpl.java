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
 * $Id: OperationImpl.java,v 1.14.2.4 2005/02/09 16:25:15 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.CallConcurrencyKind;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.Constraint;
import org.eclipse.uml2.DataType;
import org.eclipse.uml2.Element;
import org.eclipse.uml2.MultiplicityElement;
import org.eclipse.uml2.Namespace;
import org.eclipse.uml2.Operation;
import org.eclipse.uml2.Parameter;
import org.eclipse.uml2.ParameterableElement;
import org.eclipse.uml2.RedefinableElement;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.TypedElement;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.ValueSpecification;
import org.eclipse.uml2.VisibilityKind;
import org.eclipse.uml2.internal.util.SubsetEObjectEList;
import org.eclipse.uml2.internal.util.SupersetEObjectContainmentWithInverseEList;

import org.eclipse.uml2.internal.operation.MultiplicityElementOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#isOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#isUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getOwningParameter <em>Owning Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getOwnedParameters <em>Owned Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getClass_ <em>Class </em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#isQuery <em>Is Query</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getPreconditions <em>Precondition</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getPostconditions <em>Postcondition</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getRedefinedOperations <em>Redefined Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.OperationImpl#getBodyCondition <em>Body Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends BehavioralFeatureImpl implements Operation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #isOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ORDERED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = true;

	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_EDEFAULT = 1;

	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getUpperValue() <em>Upper Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification upperValue = null;

	/**
	 * The cached value of the '{@link #getLowerValue() <em>Lower Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification lowerValue = null;

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
	 * The cached value of the '{@link #getOwnedParameters() <em>Owned Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameters()
	 * @generated
	 * @ordered
	 */
	protected EList ownedParameter = null;

	/**
	 * The default value of the '{@link #isQuery() <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isQuery()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_QUERY_EDEFAULT = false;

	/**
	 * The flag for the '{@link #isQuery() <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isQuery()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_QUERY_EFLAG = Integer.MIN_VALUE >>> 5;

	/**
	 * The cached value of the '{@link #getPreconditions() <em>Precondition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreconditions()
	 * @generated
	 * @ordered
	 */
	protected EList precondition = null;

	/**
	 * The cached value of the '{@link #getPostconditions() <em>Postcondition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostconditions()
	 * @generated
	 * @ordered
	 */
	protected EList postcondition = null;

	/**
	 * The cached value of the '{@link #getRedefinedOperations() <em>Redefined Operation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedOperations()
	 * @generated
	 * @ordered
	 */
	protected EList redefinedOperation = null;

	/**
	 * The cached value of the '{@link #getBodyCondition() <em>Body Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyCondition()
	 * @generated
	 * @ordered
	 */
	protected Constraint bodyCondition = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
		eFlags &= ~IS_QUERY_EFLAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getOperation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getUpperValue() {
		return upperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperValue(ValueSpecification newUpperValue, NotificationChain msgs) {
		ValueSpecification oldUpperValue = upperValue;
		upperValue = newUpperValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.OPERATION__UPPER_VALUE, oldUpperValue, newUpperValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperValue(ValueSpecification newUpperValue) {
		if (newUpperValue != upperValue) {
			NotificationChain msgs = null;
			if (upperValue != null)
				msgs = ((InternalEObject)upperValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.OPERATION__UPPER_VALUE, null, msgs);
			if (newUpperValue != null)
				msgs = ((InternalEObject)newUpperValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.OPERATION__UPPER_VALUE, null, msgs);
			msgs = basicSetUpperValue(newUpperValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.OPERATION__UPPER_VALUE, newUpperValue, newUpperValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createUpperValue(EClass eClass) {
		ValueSpecification newUpperValue = (ValueSpecification) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.OPERATION__UPPER_VALUE, null, newUpperValue));
		}
        setUpperValue(newUpperValue);
		return newUpperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getLowerValue() {
		return lowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerValue(ValueSpecification newLowerValue, NotificationChain msgs) {
		ValueSpecification oldLowerValue = lowerValue;
		lowerValue = newLowerValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.OPERATION__LOWER_VALUE, oldLowerValue, newLowerValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerValue(ValueSpecification newLowerValue) {
		if (newLowerValue != lowerValue) {
			NotificationChain msgs = null;
			if (lowerValue != null)
				msgs = ((InternalEObject)lowerValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.OPERATION__LOWER_VALUE, null, msgs);
			if (newLowerValue != null)
				msgs = ((InternalEObject)newLowerValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.OPERATION__LOWER_VALUE, null, msgs);
			msgs = basicSetLowerValue(newLowerValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.OPERATION__LOWER_VALUE, newLowerValue, newLowerValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createLowerValue(EClass eClass) {
		ValueSpecification newLowerValue = (ValueSpecification) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.OPERATION__LOWER_VALUE, null, newLowerValue));
		}
        setLowerValue(newLowerValue);
		return newLowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getTemplateParameter() {
		if (templateParameter != null && templateParameter.eIsProxy()) {
			TemplateParameter oldTemplateParameter = templateParameter;
			templateParameter = (TemplateParameter)eResolveProxy((InternalEObject)templateParameter);
			if (templateParameter != oldTemplateParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2Package.OPERATION__TEMPLATE_PARAMETER, oldTemplateParameter, templateParameter));
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
	public NotificationChain basicSetTemplateParameter(TemplateParameter newTemplateParameter, NotificationChain msgs) {
		TemplateParameter oldTemplateParameter = templateParameter;
		templateParameter = newTemplateParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.OPERATION__TEMPLATE_PARAMETER, oldTemplateParameter, newTemplateParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		if (null != getOwningParameter() && newTemplateParameter != getOwningParameter()) {
			setOwningParameter(null);
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
			if (null != templateParameter) {
				msgs = ((InternalEObject) templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			}
			if (null != newTemplateParameter) {
				msgs = ((InternalEObject) newTemplateParameter).eInverseAdd(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			}
			msgs = basicSetTemplateParameter(newTemplateParameter, msgs);
			if (null != msgs) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.OPERATION__TEMPLATE_PARAMETER, newTemplateParameter, newTemplateParameter));
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getOwningParameter() {
		if (eContainerFeatureID != UML2Package.OPERATION__OWNING_PARAMETER) {
			return null;
		}
		return (TemplateParameter) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningParameter(TemplateParameter newOwningParameter) {
		EObject oldOwningParameter = eContainer;
		if (eContainer != newOwningParameter || (eContainerFeatureID != UML2Package.OPERATION__OWNING_PARAMETER && null != newOwningParameter)) {
			if (EcoreUtil.isAncestor(this, newOwningParameter)) {
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			}
			NotificationChain msgs = null;
			if (null != eContainer) {
				msgs = eBasicRemoveFromContainer(msgs);
			}
			if (null != newOwningParameter) {
				msgs = ((InternalEObject) newOwningParameter).eInverseAdd(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			}
			msgs = eBasicSetContainer((InternalEObject) newOwningParameter, UML2Package.OPERATION__OWNING_PARAMETER, msgs);
			if (null != msgs) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.OPERATION__OWNING_PARAMETER, newOwningParameter, newOwningParameter));
		}
		if (null != newOwningParameter || oldOwningParameter == templateParameter) {
			setTemplateParameter(newOwningParameter);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isQuery() {
		return 0 != (eFlags & IS_QUERY_EFLAG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsQuery(boolean newIsQuery) {
		boolean oldIsQuery = 0 != (eFlags & IS_QUERY_EFLAG);
		if (newIsQuery) {
			eFlags |= IS_QUERY_EFLAG;
		} else {
			eFlags &= ~IS_QUERY_EFLAG;
		}
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.OPERATION__IS_QUERY, oldIsQuery, newIsQuery));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedParameters() {
		if (ownedParameter == null) {
			ownedParameter = new EObjectContainmentWithInverseEList(Parameter.class, this, UML2Package.OPERATION__OWNED_PARAMETER, UML2Package.PARAMETER__OPERATION);
		}
		return ownedParameter;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Parameter getOwnedParameter(String unqualifiedName) {
    	for (Iterator i = getOwnedParameters().iterator(); i.hasNext(); ) {
    		Parameter namedOwnedParameter = (Parameter) i.next();
    		
    		if (unqualifiedName.equals(namedOwnedParameter.getName())) {
    			return namedOwnedParameter;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createOwnedParameter(EClass eClass) {
		Parameter newOwnedParameter = (Parameter) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.OPERATION__OWNED_PARAMETER, null, newOwnedParameter));
		}
		getOwnedParameters().add(newOwnedParameter);
		return newOwnedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.Class getClass_() {
		if (eContainerFeatureID != UML2Package.OPERATION__CLASS_) return null;
		return (org.eclipse.uml2.Class)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass_(org.eclipse.uml2.Class newClass_) {
		if (newClass_ != eContainer || (eContainerFeatureID != UML2Package.OPERATION__CLASS_ && newClass_ != null)) {
			if (EcoreUtil.isAncestor(this, newClass_))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newClass_ != null)
				msgs = ((InternalEObject)newClass_).eInverseAdd(this, UML2Package.CLASS__OWNED_OPERATION, org.eclipse.uml2.Class.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newClass_, UML2Package.OPERATION__CLASS_, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.OPERATION__CLASS_, newClass_, newClass_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDatatype() {
		if (eContainerFeatureID != UML2Package.OPERATION__DATATYPE) return null;
		return (DataType)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatype(DataType newDatatype) {
		if (newDatatype != eContainer || (eContainerFeatureID != UML2Package.OPERATION__DATATYPE && newDatatype != null)) {
			if (EcoreUtil.isAncestor(this, newDatatype))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDatatype != null)
				msgs = ((InternalEObject)newDatatype).eInverseAdd(this, UML2Package.DATA_TYPE__OWNED_OPERATION, DataType.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newDatatype, UML2Package.OPERATION__DATATYPE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.OPERATION__DATATYPE, newDatatype, newDatatype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPreconditions() {
		if (precondition == null) {
			precondition = new SubsetEObjectEList(Constraint.class, this, UML2Package.OPERATION__PRECONDITION, new int[] {UML2Package.OPERATION__OWNED_RULE});
		}
		return precondition;

	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Constraint getPrecondition(String unqualifiedName) {
    	for (Iterator i = getPreconditions().iterator(); i.hasNext(); ) {
    		Constraint namedPrecondition = (Constraint) i.next();
    		
    		if (unqualifiedName.equals(namedPrecondition.getName())) {
    			return namedPrecondition;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPostconditions() {
		if (postcondition == null) {
			postcondition = new SubsetEObjectEList(Constraint.class, this, UML2Package.OPERATION__POSTCONDITION, new int[] {UML2Package.OPERATION__OWNED_RULE});
		}
		return postcondition;

	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Constraint getPostcondition(String unqualifiedName) {
    	for (Iterator i = getPostconditions().iterator(); i.hasNext(); ) {
    		Constraint namedPostcondition = (Constraint) i.next();
    		
    		if (unqualifiedName.equals(namedPostcondition.getName())) {
    			return namedPostcondition;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedOperations() {
		if (redefinedOperation == null) {
			redefinedOperation = new EObjectResolvingEList(Operation.class, this, UML2Package.OPERATION__REDEFINED_OPERATION);
		}
		return redefinedOperation;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Operation getRedefinedOperation(String unqualifiedName) {
    	for (Iterator i = getRedefinedOperations().iterator(); i.hasNext(); ) {
    		Operation namedRedefinedOperation = (Operation) i.next();
    		
    		if (unqualifiedName.equals(namedRedefinedOperation.getName())) {
    			return namedRedefinedOperation;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getBodyCondition() {
		return bodyCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodyCondition(Constraint newBodyCondition) {
		if (null != newBodyCondition && !getOwnedRules().contains(newBodyCondition)) {
			getOwnedRules().add(newBodyCondition);
		}
		Constraint oldBodyCondition = bodyCondition;
		bodyCondition = newBodyCondition;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.OPERATION__BODY_CONDITION, oldBodyCondition, bodyCondition));
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int lowerBound() {
		return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.lowerBound(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int upperBound() {
		return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.upperBound(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultivalued() {
		return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.isMultivalued(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean includesCardinality(int C) {
		return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.includesCardinality(this, C);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean includesMultiplicity(MultiplicityElement M) {
		return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.includesMultiplicity(this, M);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperGt0(DiagnosticChain diagnostics, Map context) {
		return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.validateUpperGt0(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowerGe0(DiagnosticChain diagnostics, Map context) {
		return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.validateLowerGe0(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperGeLower(DiagnosticChain diagnostics, Map context) {
		return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.validateUpperGeLower(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowerEqLowerbound(DiagnosticChain diagnostics, Map context) {
		return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.validateLowerEqLowerbound(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperEqUpperbound(DiagnosticChain diagnostics, Map context) {
		return org.eclipse.uml2.internal.operation.MultiplicityElementOperations.validateUpperEqUpperbound(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		EList ownedElement = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getElement_OwnedElement());

		if (null == ownedElement) {
			Set union = new LinkedHashSet();
			union.addAll(super.getOwnedElements());
			if (null != getUpperValue()) {
				union.add(getUpperValue());
			}
			if (null != getLowerValue()) {
				union.add(getLowerValue());
			}

			ownedElement = new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getElement_OwnedElement(), union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getElement_OwnedElement(), ownedElement);
		}

		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		if (null != getOwningParameter()) {
			return (Element) getOwningParameter();
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeOfResult(DiagnosticChain diagnostics, Map context) {
		return org.eclipse.uml2.internal.operation.OperationOperations.validateTypeOfResult(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOrdered() {
		return org.eclipse.uml2.internal.operation.OperationOperations.isOrdered(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnique() {
		return org.eclipse.uml2.internal.operation.OperationOperations.isUnique(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int lower() {
		return org.eclipse.uml2.internal.operation.OperationOperations.lower(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int upper() {
		return org.eclipse.uml2.internal.operation.OperationOperations.upper(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier type() {
		return org.eclipse.uml2.internal.operation.OperationOperations.type(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnlyBodyForQuery(DiagnosticChain diagnostics, Map context) {
		return org.eclipse.uml2.internal.operation.OperationOperations.validateOnlyBodyForQuery(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConsistentWith(RedefinableElement redefinee) {
		return org.eclipse.uml2.internal.operation.OperationOperations.isConsistentWith(this, redefinee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrderedGen(boolean newIsOrdered) {

	}

	public void setIsOrdered(boolean newIsOrdered) {

		if (1 == getReturnResults().size()) {
			((Parameter) getReturnResults().get(0)).setIsOrdered(newIsOrdered);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUniqueGen(boolean newIsUnique) {

	}

	public void setIsUnique(boolean newIsUnique) {

		if (1 == getReturnResults().size()) {
			((Parameter) getReturnResults().get(0)).setIsUnique(newIsUnique);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getLower() {
		return lower();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getUpper() {
		return upper();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getRaisedExceptions() {

		if (null == raisedException) {
			raisedException = new EObjectResolvingEList(Type.class, this, UML2Package.OPERATION__RAISED_EXCEPTION);
		}

		return raisedException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getFormalParameters() {
		return getOwnedParameters();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Type basicGetType() {
		return type();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Type getType() {
		return type();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeGen(Type newType) {

	}

	public void setType(Type newType) {
		
		if (1 == getReturnResults().size()) {
			((Parameter) getReturnResults().get(0)).setType(newType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinitionContexts() {
		EList redefinitionContext = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getRedefinableElement_RedefinitionContext());

		if (null == redefinitionContext) {
			Set union = new LinkedHashSet();
			union.addAll(super.getRedefinitionContexts());
			if (null != getClass_()) {
				union.add(getClass_());
			}
			if (null != getDatatype()) {
				union.add(getDatatype());
			}

			redefinitionContext = new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getRedefinableElement_RedefinitionContext(), union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getRedefinableElement_RedefinitionContext(), redefinitionContext);
		}

		return redefinitionContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getNamespace() {
		if (null != getClass_()) {
			return (Namespace) getClass_();
		}
		if (null != getDatatype()) {
			return (Namespace) getDatatype();
		}
		return super.getNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFeaturingClassifiers() {
		EList featuringClassifier = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getFeature_FeaturingClassifier());

		if (null == featuringClassifier) {
			Set union = new LinkedHashSet();
			union.addAll(super.getFeaturingClassifiers());
			if (null != getClass_()) {
				union.add(getClass_());
			}
			if (null != getDatatype()) {
				union.add(getDatatype());
			}

			featuringClassifier = new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getFeature_FeaturingClassifier(), union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getFeature_FeaturingClassifier(), featuringClassifier);
		}

		return featuringClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedMembers() {
		EList result = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getOperation().getEAllOperations().get(81));

		if (null == result) {
			Set union = new LinkedHashSet();
			union.addAll(super.getOwnedMembers());
			union.addAll(getPreconditions());
			union.addAll(getPostconditions());
			if (null != getBodyCondition()) {
				union.add(getBodyCondition());
			}

			result = new BasicEList.UnmodifiableEList(union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getOperation().getEAllOperations().get(81), result);
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedRules() {
		if (ownedRule == null) {
			ownedRule = new SupersetEObjectContainmentWithInverseEList(Constraint.class, this, UML2Package.OPERATION__OWNED_RULE, new int[] {UML2Package.OPERATION__PRECONDITION, UML2Package.OPERATION__POSTCONDITION, UML2Package.OPERATION__BODY_CONDITION}, UML2Package.CONSTRAINT__NAMESPACE);
		}
		return ownedRule;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRedefinedElements() {
		EList result = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getOperation().getEAllOperations().get(83));

		if (null == result) {
			Set union = new LinkedHashSet();
			union.addAll(super.getRedefinedElements());
			union.addAll(getRedefinedOperations());

			result = new BasicEList.UnmodifiableEList(union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getOperation().getEAllOperations().get(83), result);
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.OPERATION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.OPERATION__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.OPERATION__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.OPERATION__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.OPERATION__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.OPERATION__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
				case UML2Package.OPERATION__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
				case UML2Package.OPERATION__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
				case UML2Package.OPERATION__METHOD:
					return ((InternalEList)getMethods()).basicAdd(otherEnd, msgs);
				case UML2Package.OPERATION__TEMPLATE_PARAMETER:
					if (templateParameter != null)
						msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
					return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
				case UML2Package.OPERATION__OWNING_PARAMETER:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.OPERATION__OWNING_PARAMETER, msgs);
				case UML2Package.OPERATION__OWNED_PARAMETER:
					return ((InternalEList)getOwnedParameters()).basicAdd(otherEnd, msgs);
				case UML2Package.OPERATION__CLASS_:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.OPERATION__CLASS_, msgs);
				case UML2Package.OPERATION__DATATYPE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.OPERATION__DATATYPE, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.OPERATION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.OPERATION__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.OPERATION__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.OPERATION__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.OPERATION__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.OPERATION__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.OPERATION__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
				case UML2Package.OPERATION__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
				case UML2Package.OPERATION__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
				case UML2Package.OPERATION__FORMAL_PARAMETER:
					return ((InternalEList)getFormalParameters()).basicRemove(otherEnd, msgs);
				case UML2Package.OPERATION__RETURN_RESULT:
					return ((InternalEList)getReturnResults()).basicRemove(otherEnd, msgs);
				case UML2Package.OPERATION__METHOD:
					return ((InternalEList)getMethods()).basicRemove(otherEnd, msgs);
				case UML2Package.OPERATION__UPPER_VALUE:
					return basicSetUpperValue(null, msgs);
				case UML2Package.OPERATION__LOWER_VALUE:
					return basicSetLowerValue(null, msgs);
				case UML2Package.OPERATION__TEMPLATE_PARAMETER:
					return basicSetTemplateParameter(null, msgs);
				case UML2Package.OPERATION__OWNING_PARAMETER:
					return eBasicSetContainer(null, UML2Package.OPERATION__OWNING_PARAMETER, msgs);
				case UML2Package.OPERATION__OWNED_PARAMETER:
					return ((InternalEList)getOwnedParameters()).basicRemove(otherEnd, msgs);
				case UML2Package.OPERATION__CLASS_:
					return eBasicSetContainer(null, UML2Package.OPERATION__CLASS_, msgs);
				case UML2Package.OPERATION__DATATYPE:
					return eBasicSetContainer(null, UML2Package.OPERATION__DATATYPE, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case UML2Package.OPERATION__OWNING_PARAMETER:
					return eContainer.eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				case UML2Package.OPERATION__CLASS_:
					return eContainer.eInverseRemove(this, UML2Package.CLASS__OWNED_OPERATION, org.eclipse.uml2.Class.class, msgs);
				case UML2Package.OPERATION__DATATYPE:
					return eContainer.eInverseRemove(this, UML2Package.DATA_TYPE__OWNED_OPERATION, DataType.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.OPERATION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.OPERATION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.OPERATION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.OPERATION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.OPERATION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.OPERATION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.OPERATION__NAME:
				return getName();
			case UML2Package.OPERATION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.OPERATION__VISIBILITY:
				return getVisibility();
			case UML2Package.OPERATION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.OPERATION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.OPERATION__MEMBER:
				return getMembers();
			case UML2Package.OPERATION__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.OPERATION__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.OPERATION__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.OPERATION__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.OPERATION__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.OPERATION__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.OPERATION__FEATURING_CLASSIFIER:
				return getFeaturingClassifiers();
			case UML2Package.OPERATION__IS_STATIC:
				return isStatic() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.OPERATION__PARAMETER:
				return getParameters();
			case UML2Package.OPERATION__FORMAL_PARAMETER:
				return getFormalParameters();
			case UML2Package.OPERATION__RETURN_RESULT:
				return getReturnResults();
			case UML2Package.OPERATION__RAISED_EXCEPTION:
				return getRaisedExceptions();
			case UML2Package.OPERATION__IS_ABSTRACT:
				return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.OPERATION__METHOD:
				return getMethods();
			case UML2Package.OPERATION__CONCURRENCY:
				return getConcurrency();
			case UML2Package.OPERATION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case UML2Package.OPERATION__IS_ORDERED:
				return isOrdered() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.OPERATION__IS_UNIQUE:
				return isUnique() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.OPERATION__LOWER:
				return new Integer(getLower());
			case UML2Package.OPERATION__UPPER:
				return new Integer(getUpper());
			case UML2Package.OPERATION__UPPER_VALUE:
				return getUpperValue();
			case UML2Package.OPERATION__LOWER_VALUE:
				return getLowerValue();
			case UML2Package.OPERATION__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.OPERATION__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.OPERATION__OWNED_PARAMETER:
				return getOwnedParameters();
			case UML2Package.OPERATION__CLASS_:
				return getClass_();
			case UML2Package.OPERATION__IS_QUERY:
				return isQuery() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.OPERATION__DATATYPE:
				return getDatatype();
			case UML2Package.OPERATION__PRECONDITION:
				return getPreconditions();
			case UML2Package.OPERATION__POSTCONDITION:
				return getPostconditions();
			case UML2Package.OPERATION__REDEFINED_OPERATION:
				return getRedefinedOperations();
			case UML2Package.OPERATION__BODY_CONDITION:
				return getBodyCondition();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.OPERATION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.OPERATION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.OPERATION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.OPERATION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.OPERATION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.OPERATION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.OPERATION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.OPERATION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.OPERATION__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.OPERATION__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.OPERATION__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.OPERATION__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.OPERATION__IS_STATIC:
				setIsStatic(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.OPERATION__FORMAL_PARAMETER:
				getFormalParameters().clear();
				getFormalParameters().addAll((Collection)newValue);
				return;
			case UML2Package.OPERATION__RETURN_RESULT:
				getReturnResults().clear();
				getReturnResults().addAll((Collection)newValue);
				return;
			case UML2Package.OPERATION__RAISED_EXCEPTION:
				getRaisedExceptions().clear();
				getRaisedExceptions().addAll((Collection)newValue);
				return;
			case UML2Package.OPERATION__IS_ABSTRACT:
				setIsAbstract(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.OPERATION__METHOD:
				getMethods().clear();
				getMethods().addAll((Collection)newValue);
				return;
			case UML2Package.OPERATION__CONCURRENCY:
				setConcurrency((CallConcurrencyKind)newValue);
				return;
			case UML2Package.OPERATION__TYPE:
				setType((Type)newValue);
				return;
			case UML2Package.OPERATION__IS_ORDERED:
				setIsOrdered(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.OPERATION__IS_UNIQUE:
				setIsUnique(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.OPERATION__UPPER_VALUE:
				setUpperValue((ValueSpecification)newValue);
				return;
			case UML2Package.OPERATION__LOWER_VALUE:
				setLowerValue((ValueSpecification)newValue);
				return;
			case UML2Package.OPERATION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.OPERATION__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.OPERATION__OWNED_PARAMETER:
				getOwnedParameters().clear();
				getOwnedParameters().addAll((Collection)newValue);
				return;
			case UML2Package.OPERATION__CLASS_:
				setClass_((org.eclipse.uml2.Class)newValue);
				return;
			case UML2Package.OPERATION__IS_QUERY:
				setIsQuery(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.OPERATION__DATATYPE:
				setDatatype((DataType)newValue);
				return;
			case UML2Package.OPERATION__PRECONDITION:
				getPreconditions().clear();
				getPreconditions().addAll((Collection)newValue);
				return;
			case UML2Package.OPERATION__POSTCONDITION:
				getPostconditions().clear();
				getPostconditions().addAll((Collection)newValue);
				return;
			case UML2Package.OPERATION__REDEFINED_OPERATION:
				getRedefinedOperations().clear();
				getRedefinedOperations().addAll((Collection)newValue);
				return;
			case UML2Package.OPERATION__BODY_CONDITION:
				setBodyCondition((Constraint)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.OPERATION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.OPERATION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.OPERATION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.OPERATION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.OPERATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.OPERATION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.OPERATION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.OPERATION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.OPERATION__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.OPERATION__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.OPERATION__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.OPERATION__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.OPERATION__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case UML2Package.OPERATION__FORMAL_PARAMETER:
				getFormalParameters().clear();
				return;
			case UML2Package.OPERATION__RETURN_RESULT:
				getReturnResults().clear();
				return;
			case UML2Package.OPERATION__RAISED_EXCEPTION:
				getRaisedExceptions().clear();
				return;
			case UML2Package.OPERATION__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UML2Package.OPERATION__METHOD:
				getMethods().clear();
				return;
			case UML2Package.OPERATION__CONCURRENCY:
				setConcurrency(CONCURRENCY_EDEFAULT);
				return;
			case UML2Package.OPERATION__TYPE:
				setType((Type)null);
				return;
			case UML2Package.OPERATION__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case UML2Package.OPERATION__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case UML2Package.OPERATION__UPPER_VALUE:
				setUpperValue((ValueSpecification)null);
				return;
			case UML2Package.OPERATION__LOWER_VALUE:
				setLowerValue((ValueSpecification)null);
				return;
			case UML2Package.OPERATION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.OPERATION__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.OPERATION__OWNED_PARAMETER:
				getOwnedParameters().clear();
				return;
			case UML2Package.OPERATION__CLASS_:
				setClass_((org.eclipse.uml2.Class)null);
				return;
			case UML2Package.OPERATION__IS_QUERY:
				setIsQuery(IS_QUERY_EDEFAULT);
				return;
			case UML2Package.OPERATION__DATATYPE:
				setDatatype((DataType)null);
				return;
			case UML2Package.OPERATION__PRECONDITION:
				getPreconditions().clear();
				return;
			case UML2Package.OPERATION__POSTCONDITION:
				getPostconditions().clear();
				return;
			case UML2Package.OPERATION__REDEFINED_OPERATION:
				getRedefinedOperations().clear();
				return;
			case UML2Package.OPERATION__BODY_CONDITION:
				setBodyCondition((Constraint)null);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSetGen(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.OPERATION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.OPERATION__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.OPERATION__OWNER:
				return basicGetOwner() != null;
			case UML2Package.OPERATION__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.OPERATION__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.OPERATION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.OPERATION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.OPERATION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.OPERATION__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.OPERATION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.OPERATION__MEMBER:
				return !getMembers().isEmpty();
			case UML2Package.OPERATION__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.OPERATION__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.OPERATION__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.OPERATION__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case UML2Package.OPERATION__REDEFINITION_CONTEXT:
				return !getRedefinitionContexts().isEmpty();
			case UML2Package.OPERATION__IS_LEAF:
				return isLeaf() != IS_LEAF_EDEFAULT;
			case UML2Package.OPERATION__FEATURING_CLASSIFIER:
				return !getFeaturingClassifiers().isEmpty();
			case UML2Package.OPERATION__IS_STATIC:
				return isStatic() != IS_STATIC_EDEFAULT;
			case UML2Package.OPERATION__PARAMETER:
				return !getParameters().isEmpty();
			case UML2Package.OPERATION__FORMAL_PARAMETER:
				return !getFormalParameters().isEmpty();
			case UML2Package.OPERATION__RETURN_RESULT:
				return returnResult != null && !returnResult.isEmpty();
			case UML2Package.OPERATION__RAISED_EXCEPTION:
				return !getRaisedExceptions().isEmpty();
			case UML2Package.OPERATION__IS_ABSTRACT:
				return isAbstract() != IS_ABSTRACT_EDEFAULT;
			case UML2Package.OPERATION__METHOD:
				return method != null && !method.isEmpty();
			case UML2Package.OPERATION__CONCURRENCY:
				return concurrency != CONCURRENCY_EDEFAULT;
			case UML2Package.OPERATION__TYPE:
				return basicGetType() != null;
			case UML2Package.OPERATION__IS_ORDERED:
				return isOrdered() != IS_ORDERED_EDEFAULT;
			case UML2Package.OPERATION__IS_UNIQUE:
				return isUnique() != IS_UNIQUE_EDEFAULT;
			case UML2Package.OPERATION__LOWER:
				return getLower() != LOWER_EDEFAULT;
			case UML2Package.OPERATION__UPPER:
				return getUpper() != UPPER_EDEFAULT;
			case UML2Package.OPERATION__UPPER_VALUE:
				return upperValue != null;
			case UML2Package.OPERATION__LOWER_VALUE:
				return lowerValue != null;
			case UML2Package.OPERATION__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.OPERATION__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.OPERATION__OWNED_PARAMETER:
				return ownedParameter != null && !ownedParameter.isEmpty();
			case UML2Package.OPERATION__CLASS_:
				return getClass_() != null;
			case UML2Package.OPERATION__IS_QUERY:
				return isQuery() != IS_QUERY_EDEFAULT;
			case UML2Package.OPERATION__DATATYPE:
				return getDatatype() != null;
			case UML2Package.OPERATION__PRECONDITION:
				return precondition != null && !precondition.isEmpty();
			case UML2Package.OPERATION__POSTCONDITION:
				return postcondition != null && !postcondition.isEmpty();
			case UML2Package.OPERATION__REDEFINED_OPERATION:
				return redefinedOperation != null && !redefinedOperation.isEmpty();
			case UML2Package.OPERATION__BODY_CONDITION:
				return bodyCondition != null;
		}
		return eDynamicIsSet(eFeature);
	}

	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.OPERATION__FORMAL_PARAMETER:
				return false;
			case UML2Package.OPERATION__TYPE:
				return null != returnResult
					&& 1 == returnResult.size()
					&& ((Parameter) returnResult.get(0))
							.eIsSet(UML2Package.eINSTANCE
									.getTypedElement_Type());
		}
		return eIsSetGen(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case UML2Package.OPERATION__TYPE: return UML2Package.TYPED_ELEMENT__TYPE;
				default: return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (derivedFeatureID) {
				case UML2Package.OPERATION__IS_ORDERED: return UML2Package.MULTIPLICITY_ELEMENT__IS_ORDERED;
				case UML2Package.OPERATION__IS_UNIQUE: return UML2Package.MULTIPLICITY_ELEMENT__IS_UNIQUE;
				case UML2Package.OPERATION__LOWER: return UML2Package.MULTIPLICITY_ELEMENT__LOWER;
				case UML2Package.OPERATION__UPPER: return UML2Package.MULTIPLICITY_ELEMENT__UPPER;
				case UML2Package.OPERATION__UPPER_VALUE: return UML2Package.MULTIPLICITY_ELEMENT__UPPER_VALUE;
				case UML2Package.OPERATION__LOWER_VALUE: return UML2Package.MULTIPLICITY_ELEMENT__LOWER_VALUE;
				default: return -1;
			}
		}
		if (baseClass == ParameterableElement.class) {
			switch (derivedFeatureID) {
				case UML2Package.OPERATION__TEMPLATE_PARAMETER: return UML2Package.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
				case UML2Package.OPERATION__OWNING_PARAMETER: return UML2Package.PARAMETERABLE_ELEMENT__OWNING_PARAMETER;
				default: return -1;
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
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case UML2Package.TYPED_ELEMENT__TYPE: return UML2Package.OPERATION__TYPE;
				default: return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (baseFeatureID) {
				case UML2Package.MULTIPLICITY_ELEMENT__IS_ORDERED: return UML2Package.OPERATION__IS_ORDERED;
				case UML2Package.MULTIPLICITY_ELEMENT__IS_UNIQUE: return UML2Package.OPERATION__IS_UNIQUE;
				case UML2Package.MULTIPLICITY_ELEMENT__LOWER: return UML2Package.OPERATION__LOWER;
				case UML2Package.MULTIPLICITY_ELEMENT__UPPER: return UML2Package.OPERATION__UPPER;
				case UML2Package.MULTIPLICITY_ELEMENT__UPPER_VALUE: return UML2Package.OPERATION__UPPER_VALUE;
				case UML2Package.MULTIPLICITY_ELEMENT__LOWER_VALUE: return UML2Package.OPERATION__LOWER_VALUE;
				default: return -1;
			}
		}
		if (baseClass == ParameterableElement.class) {
			switch (baseFeatureID) {
				case UML2Package.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER: return UML2Package.OPERATION__TEMPLATE_PARAMETER;
				case UML2Package.PARAMETERABLE_ELEMENT__OWNING_PARAMETER: return UML2Package.OPERATION__OWNING_PARAMETER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	// <!-- begin-custom-operations -->

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.MultiplicityElement#setLowerBound(int)
	 */
	public void setLowerBound(int value) {
		MultiplicityElementOperations.setLowerBound(this, value);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.MultiplicityElement#setUpperBound(int)
	 */
	public void setUpperBound(int value) {
		MultiplicityElementOperations.setUpperBound(this, value);
	}

	// <!-- end-custom-operations -->

} //OperationImpl
