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
 * $Id: ClassImpl.java,v 1.21.2.1 2004/08/24 01:03:45 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.Classifier;
import org.eclipse.uml2.CollaborationOccurrence;
import org.eclipse.uml2.ConnectableElement;
import org.eclipse.uml2.Connector;
import org.eclipse.uml2.EncapsulatedClassifier;
import org.eclipse.uml2.Extension;
import org.eclipse.uml2.Operation;
import org.eclipse.uml2.Port;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.Reception;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.StructuredClassifier;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;
import org.eclipse.uml2.internal.operation.ClassOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getOwnedAttributes <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getParts <em>Part</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getRoles <em>Role</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getOwnedConnectors <em>Owned Connector</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getOwnedPorts <em>Owned Port</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getOwnedOperations <em>Owned Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getSuperClasses <em>Super Class</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getExtensions <em>Extension</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getNestedClassifiers <em>Nested Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#isActive <em>Is Active</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ClassImpl#getOwnedReceptions <em>Owned Reception</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends BehavioredClassifierImpl implements org.eclipse.uml2.Class {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getOwnedConnectors() <em>Owned Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList ownedConnector = null;

	/**
	 * The cached value of the '{@link #getOwnedPorts() <em>Owned Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPorts()
	 * @generated
	 * @ordered
	 */
	protected EList ownedPort = null;

	/**
	 * The cached value of the '{@link #getOwnedOperations() <em>Owned Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperations()
	 * @generated
	 * @ordered
	 */
	protected EList ownedOperation = null;

	/**
	 * The cached value of the '{@link #getNestedClassifiers() <em>Nested Classifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList nestedClassifier = null;

	/**
	 * The default value of the '{@link #isActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ACTIVE_EDEFAULT = false;

	/**
	 * The flag for the '{@link #isActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_ACTIVE_EFLAG = ELAST_EOBJECT_FLAG << 3;

	/**
	 * The cached value of the '{@link #getOwnedReceptions() <em>Owned Reception</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedReceptions()
	 * @generated
	 * @ordered
	 */
	protected EList ownedReception = null;

	/**
	 * The cached value of the '{@link #getOwnedAttributes() <em>Owned Attribute</em>}' containment reference list.
	 * @see #getOwnedAttributes()
	 */
	protected EList _ownedAttribute = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
		eFlags &= ~IS_ACTIVE_EFLAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getClass_();
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Property getOwnedAttribute(String unqualifiedName) {
    	for (Iterator i = getOwnedAttributes().iterator(); i.hasNext(); ) {
    		Property namedOwnedAttribute = (Property) i.next();
    		
    		if (unqualifiedName.equals(namedOwnedAttribute.getName())) {
    			return namedOwnedAttribute;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createOwnedAttribute(EClass eClass) {
		Property newOwnedAttribute = (Property) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.CLASS__OWNED_ATTRIBUTE, null, newOwnedAttribute));
		}
		getOwnedAttributes().add(newOwnedAttribute);
		return newOwnedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getParts() {
		EList parts = (EList) getCacheAdapter().get(eResource(), this,
			UML2Package.eINSTANCE.getStructuredClassifier_Part());

		if (null == parts) {
			List part = new ArrayList();

			for (Iterator ownedAttributes = getOwnedAttributes().iterator(); ownedAttributes
				.hasNext();) {

				Property ownedAttribute = (Property) ownedAttributes.next();

				if (ownedAttribute.isComposite()) {
					part.add(ownedAttribute);
				}
			}

			parts = new EcoreEList.UnmodifiableEList(this,
				UML2Package.eINSTANCE.getStructuredClassifier_Part(), part
					.size(), part.toArray());
			getCacheAdapter().put(eResource(), this,
				UML2Package.eINSTANCE.getStructuredClassifier_Part(), parts);
		}

		return parts;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Property getPart(String unqualifiedName) {
    	for (Iterator i = getParts().iterator(); i.hasNext(); ) {
    		Property namedPart = (Property) i.next();
    		
    		if (unqualifiedName.equals(namedPart.getName())) {
    			return namedPart;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRoles() {
		EList role = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getStructuredClassifier_Role());

		if (null == role) {
			Set union = new LinkedHashSet();
			union.addAll(getOwnedAttributes());

			role = new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getStructuredClassifier_Role(), union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getStructuredClassifier_Role(), role);
		}

		return role;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public ConnectableElement getRole(String unqualifiedName) {
    	for (Iterator i = getRoles().iterator(); i.hasNext(); ) {
    		ConnectableElement namedRole = (ConnectableElement) i.next();
    		
    		if (unqualifiedName.equals(namedRole.getName())) {
    			return namedRole;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedConnectors() {
		if (ownedConnector == null) {
			ownedConnector = new EObjectContainmentEList(Connector.class, this, UML2Package.CLASS__OWNED_CONNECTOR);
		}
		return ownedConnector;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Connector getOwnedConnector(String unqualifiedName) {
    	for (Iterator i = getOwnedConnectors().iterator(); i.hasNext(); ) {
    		Connector namedOwnedConnector = (Connector) i.next();
    		
    		if (unqualifiedName.equals(namedOwnedConnector.getName())) {
    			return namedOwnedConnector;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createOwnedConnector(EClass eClass) {
		Connector newOwnedConnector = (Connector) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.CLASS__OWNED_CONNECTOR, null, newOwnedConnector));
		}
		getOwnedConnectors().add(newOwnedConnector);
		return newOwnedConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedPorts() {
		if (ownedPort == null) {
			ownedPort = new EObjectContainmentEList(Port.class, this, UML2Package.CLASS__OWNED_PORT);
		}
		return ownedPort;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Port getOwnedPort(String unqualifiedName) {
    	for (Iterator i = getOwnedPorts().iterator(); i.hasNext(); ) {
    		Port namedOwnedPort = (Port) i.next();
    		
    		if (unqualifiedName.equals(namedOwnedPort.getName())) {
    			return namedOwnedPort;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createOwnedPort(EClass eClass) {
		Port newOwnedPort = (Port) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.CLASS__OWNED_PORT, null, newOwnedPort));
		}
		getOwnedPorts().add(newOwnedPort);
		return newOwnedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActive() {
		return 0 != (eFlags & IS_ACTIVE_EFLAG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsActive(boolean newIsActive) {
		boolean oldIsActive = 0 != (eFlags & IS_ACTIVE_EFLAG);
		if (newIsActive) {
			eFlags |= IS_ACTIVE_EFLAG;
		} else {
			eFlags &= ~IS_ACTIVE_EFLAG;
		}
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.CLASS__IS_ACTIVE, oldIsActive, newIsActive));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedOperations() {
		if (ownedOperation == null) {
			ownedOperation = new EObjectContainmentWithInverseEList(Operation.class, this, UML2Package.CLASS__OWNED_OPERATION, UML2Package.OPERATION__CLASS_);
		}
		return ownedOperation;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Operation getOwnedOperation(String unqualifiedName) {
    	for (Iterator i = getOwnedOperations().iterator(); i.hasNext(); ) {
    		Operation namedOwnedOperation = (Operation) i.next();
    		
    		if (unqualifiedName.equals(namedOwnedOperation.getName())) {
    			return namedOwnedOperation;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOwnedOperation(EClass eClass) {
		Operation newOwnedOperation = (Operation) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.CLASS__OWNED_OPERATION, null, newOwnedOperation));
		}
		getOwnedOperations().add(newOwnedOperation);
		return newOwnedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getSuperClasses() {
		EList superClasses = (EList) getCacheAdapter().get(eResource(), this,
			UML2Package.eINSTANCE.getClass_SuperClass());

		if (null == superClasses) {
			Set superClass = new HashSet();

			for (Iterator generals = general().iterator(); generals.hasNext();) {
				Classifier general = (Classifier) generals.next();

				if (org.eclipse.uml2.Class.class.isInstance(general)) {
					superClass.add(general);
				}
			}

			superClasses = new EcoreEList.UnmodifiableEList(this,
				UML2Package.eINSTANCE.getClass_SuperClass(), superClass.size(),
				superClass.toArray());
			getCacheAdapter().put(eResource(), this,
				UML2Package.eINSTANCE.getClass_SuperClass(), superClasses);
		}

		return superClasses;
	}
	
    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public org.eclipse.uml2.Class getSuperClass(String unqualifiedName) {
    	for (Iterator i = getSuperClasses().iterator(); i.hasNext(); ) {
    		org.eclipse.uml2.Class namedSuperClass = (org.eclipse.uml2.Class) i.next();
    		
    		if (unqualifiedName.equals(namedSuperClass.getName())) {
    			return namedSuperClass;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getExtensions() {
		EList result = (EList) getCacheAdapter().get(this,
			UML2Package.eINSTANCE.getClass_Extension());

		if (null == result) {
			Set extensions = ClassOperations.getExtensions(this);

			result = new EcoreEList.UnmodifiableEList(this,
				UML2Package.eINSTANCE.getClass_Extension(), extensions.size(),
				extensions.toArray());
			getCacheAdapter().put(this,
				UML2Package.eINSTANCE.getClass_Extension(), result);
		}

		return result;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Extension getExtension(String unqualifiedName) {
    	for (Iterator i = getExtensions().iterator(); i.hasNext(); ) {
    		Extension namedExtension = (Extension) i.next();
    		
    		if (unqualifiedName.equals(namedExtension.getName())) {
    			return namedExtension;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNestedClassifiers() {
		if (nestedClassifier == null) {
			nestedClassifier = new EObjectContainmentEList(Classifier.class, this, UML2Package.CLASS__NESTED_CLASSIFIER);
		}
		return nestedClassifier;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Classifier getNestedClassifier(String unqualifiedName) {
    	for (Iterator i = getNestedClassifiers().iterator(); i.hasNext(); ) {
    		Classifier namedNestedClassifier = (Classifier) i.next();
    		
    		if (unqualifiedName.equals(namedNestedClassifier.getName())) {
    			return namedNestedClassifier;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier createNestedClassifier(EClass eClass) {
		Classifier newNestedClassifier = (Classifier) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.CLASS__NESTED_CLASSIFIER, null, newNestedClassifier));
		}
		getNestedClassifiers().add(newNestedClassifier);
		return newNestedClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedReceptions() {
		if (ownedReception == null) {
			ownedReception = new EObjectContainmentEList(Reception.class, this, UML2Package.CLASS__OWNED_RECEPTION);
		}
		return ownedReception;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
     */
    public Reception getOwnedReception(String unqualifiedName) {
    	for (Iterator i = getOwnedReceptions().iterator(); i.hasNext(); ) {
    		Reception namedOwnedReception = (Reception) i.next();
    		
    		if (unqualifiedName.equals(namedOwnedReception.getName())) {
    			return namedOwnedReception;
    		}
    	}
    	
    	return null;
    }
      
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reception createOwnedReception(EClass eClass) {
		Reception newOwnedReception = (Reception) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.CLASS__OWNED_RECEPTION, null, newOwnedReception));
		}
		getOwnedReceptions().add(newOwnedReception);
		return newOwnedReception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMembers() {
		EList member = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getNamespace_Member());

		if (null == member) {
			Set union = new LinkedHashSet();
			union.addAll(super.getMembers());
			union.addAll(getRoles());

			member = new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getNamespace_Member(), union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getNamespace_Member(), member);
		}

		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set inherit(Set inhs) {
		return org.eclipse.uml2.internal.operation.ClassOperations.inherit(this, inhs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isAbstract() {
		return super.isAbstract();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		super.setIsAbstract(newIsAbstract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getOwnedAttributes() {

		if (null == _ownedAttribute) {
			_ownedAttribute = new EObjectContainmentEList(Property.class, this, UML2Package.CLASS__OWNED_ATTRIBUTE);
		}
		return _ownedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getGenerals() {
		return getSuperClasses();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAttributes() {
		EList attribute = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getClassifier_Attribute());

		if (null == attribute) {
			Set union = new LinkedHashSet();
			union.addAll(super.getAttributes());
			union.addAll(getOwnedAttributes());

			attribute = new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getClassifier_Attribute(), union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getClassifier_Attribute(), attribute);
		}

		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedMembers() {
		EList result = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getClass_().getEAllOperations().get(84));

		if (null == result) {
			Set union = new LinkedHashSet();
			union.addAll(super.getOwnedMembers());
			union.addAll(getOwnedAttributes());
			union.addAll(getOwnedOperations());
			union.addAll(getNestedClassifiers());
			union.addAll(getOwnedReceptions());
			union.addAll(getOwnedConnectors());
			union.addAll(getOwnedPorts());

			result = new BasicEList.UnmodifiableEList(union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getClass_().getEAllOperations().get(84), result);
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFeatures() {
		EList feature = (EList) getCacheAdapter().get(this, UML2Package.eINSTANCE.getClassifier_Feature());

		if (null == feature) {
			Set union = new LinkedHashSet();
			union.addAll(super.getFeatures());
			union.addAll(getOwnedOperations());
			union.addAll(getOwnedReceptions());
			union.addAll(getOwnedConnectors());
			union.addAll(getOwnedPorts());

			feature = new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE.getClassifier_Feature(), union.size(), union.toArray());
			getCacheAdapter().put(this, UML2Package.eINSTANCE.getClassifier_Feature(), feature);
		}

		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.CLASS__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.CLASS__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.CLASS__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.CLASS__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.CLASS__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.CLASS__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
				case UML2Package.CLASS__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
				case UML2Package.CLASS__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
				case UML2Package.CLASS__TEMPLATE_PARAMETER:
					if (templateParameter != null)
						msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
					return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
				case UML2Package.CLASS__OWNING_PARAMETER:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.CLASS__OWNING_PARAMETER, msgs);
				case UML2Package.CLASS__GENERALIZATION:
					return ((InternalEList)getGeneralizations()).basicAdd(otherEnd, msgs);
				case UML2Package.CLASS__SUBSTITUTION:
					return ((InternalEList)getSubstitutions()).basicAdd(otherEnd, msgs);
				case UML2Package.CLASS__POWERTYPE_EXTENT:
					return ((InternalEList)getPowertypeExtents()).basicAdd(otherEnd, msgs);
				case UML2Package.CLASS__USE_CASE:
					return ((InternalEList)getUseCases()).basicAdd(otherEnd, msgs);
				case UML2Package.CLASS__OWNED_BEHAVIOR:
					return ((InternalEList)getOwnedBehaviors()).basicAdd(otherEnd, msgs);
				case UML2Package.CLASS__IMPLEMENTATION:
					return ((InternalEList)getImplementations()).basicAdd(otherEnd, msgs);
				case UML2Package.CLASS__OWNED_STATE_MACHINE:
					return ((InternalEList)getOwnedStateMachines()).basicAdd(otherEnd, msgs);
				case UML2Package.CLASS__OWNED_OPERATION:
					return ((InternalEList)getOwnedOperations()).basicAdd(otherEnd, msgs);
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
				case UML2Package.CLASS__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.CLASS__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.CLASS__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__TEMPLATE_PARAMETER:
					return basicSetTemplateParameter(null, msgs);
				case UML2Package.CLASS__OWNING_PARAMETER:
					return eBasicSetContainer(null, UML2Package.CLASS__OWNING_PARAMETER, msgs);
				case UML2Package.CLASS__GENERALIZATION:
					return ((InternalEList)getGeneralizations()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__SUBSTITUTION:
					return ((InternalEList)getSubstitutions()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__POWERTYPE_EXTENT:
					return ((InternalEList)getPowertypeExtents()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__OWNED_USE_CASE:
					return ((InternalEList)getOwnedUseCases()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__USE_CASE:
					return ((InternalEList)getUseCases()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__OCCURRENCE:
					return ((InternalEList)getOccurrences()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__OWNED_BEHAVIOR:
					return ((InternalEList)getOwnedBehaviors()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__IMPLEMENTATION:
					return ((InternalEList)getImplementations()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__OWNED_TRIGGER:
					return ((InternalEList)getOwnedTriggers()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__OWNED_STATE_MACHINE:
					return ((InternalEList)getOwnedStateMachines()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__OWNED_ATTRIBUTE:
					return ((InternalEList)getOwnedAttributes()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__OWNED_CONNECTOR:
					return ((InternalEList)getOwnedConnectors()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__OWNED_PORT:
					return ((InternalEList)getOwnedPorts()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__OWNED_OPERATION:
					return ((InternalEList)getOwnedOperations()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__NESTED_CLASSIFIER:
					return ((InternalEList)getNestedClassifiers()).basicRemove(otherEnd, msgs);
				case UML2Package.CLASS__OWNED_RECEPTION:
					return ((InternalEList)getOwnedReceptions()).basicRemove(otherEnd, msgs);
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
				case UML2Package.CLASS__OWNING_PARAMETER:
					return eContainer.eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
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
			case UML2Package.CLASS__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.CLASS__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.CLASS__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.CLASS__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.CLASS__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.CLASS__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.CLASS__NAME:
				return getName();
			case UML2Package.CLASS__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.CLASS__VISIBILITY:
				return getVisibility();
			case UML2Package.CLASS__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.CLASS__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.CLASS__MEMBER:
				return getMembers();
			case UML2Package.CLASS__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.CLASS__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.CLASS__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.CLASS__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.CLASS__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.CLASS__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.CLASS__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.CLASS__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case UML2Package.CLASS__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.CLASS__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.CLASS__FEATURE:
				return getFeatures();
			case UML2Package.CLASS__IS_ABSTRACT:
				return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.CLASS__INHERITED_MEMBER:
				return getInheritedMembers();
			case UML2Package.CLASS__GENERAL:
				return getGenerals();
			case UML2Package.CLASS__GENERALIZATION:
				return getGeneralizations();
			case UML2Package.CLASS__ATTRIBUTE:
				return getAttributes();
			case UML2Package.CLASS__REDEFINED_CLASSIFIER:
				return getRedefinedClassifiers();
			case UML2Package.CLASS__SUBSTITUTION:
				return getSubstitutions();
			case UML2Package.CLASS__POWERTYPE_EXTENT:
				return getPowertypeExtents();
			case UML2Package.CLASS__OWNED_USE_CASE:
				return getOwnedUseCases();
			case UML2Package.CLASS__USE_CASE:
				return getUseCases();
			case UML2Package.CLASS__REPRESENTATION:
				return getRepresentation();
			case UML2Package.CLASS__OCCURRENCE:
				return getOccurrences();
			case UML2Package.CLASS__OWNED_BEHAVIOR:
				return getOwnedBehaviors();
			case UML2Package.CLASS__CLASSIFIER_BEHAVIOR:
				return getClassifierBehavior();
			case UML2Package.CLASS__IMPLEMENTATION:
				return getImplementations();
			case UML2Package.CLASS__OWNED_TRIGGER:
				return getOwnedTriggers();
			case UML2Package.CLASS__OWNED_STATE_MACHINE:
				return getOwnedStateMachines();
			case UML2Package.CLASS__OWNED_ATTRIBUTE:
				return getOwnedAttributes();
			case UML2Package.CLASS__PART:
				return getParts();
			case UML2Package.CLASS__ROLE:
				return getRoles();
			case UML2Package.CLASS__OWNED_CONNECTOR:
				return getOwnedConnectors();
			case UML2Package.CLASS__OWNED_PORT:
				return getOwnedPorts();
			case UML2Package.CLASS__OWNED_OPERATION:
				return getOwnedOperations();
			case UML2Package.CLASS__SUPER_CLASS:
				return getSuperClasses();
			case UML2Package.CLASS__EXTENSION:
				return getExtensions();
			case UML2Package.CLASS__NESTED_CLASSIFIER:
				return getNestedClassifiers();
			case UML2Package.CLASS__IS_ACTIVE:
				return isActive() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.CLASS__OWNED_RECEPTION:
				return getOwnedReceptions();
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
			case UML2Package.CLASS__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.CLASS__NAME:
				setName((String)newValue);
				return;
			case UML2Package.CLASS__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.CLASS__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.CLASS__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.CLASS__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.CLASS__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.CLASS__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.CLASS__IS_ABSTRACT:
				setIsAbstract(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.CLASS__GENERALIZATION:
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__SUBSTITUTION:
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__USE_CASE:
				getUseCases().clear();
				getUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)newValue);
				return;
			case UML2Package.CLASS__OCCURRENCE:
				getOccurrences().clear();
				getOccurrences().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				getOwnedBehaviors().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)newValue);
				return;
			case UML2Package.CLASS__IMPLEMENTATION:
				getImplementations().clear();
				getImplementations().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__OWNED_TRIGGER:
				getOwnedTriggers().clear();
				getOwnedTriggers().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
				getOwnedStateMachines().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				getOwnedConnectors().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__OWNED_PORT:
				getOwnedPorts().clear();
				getOwnedPorts().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__OWNED_OPERATION:
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__NESTED_CLASSIFIER:
				getNestedClassifiers().clear();
				getNestedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.CLASS__IS_ACTIVE:
				setIsActive(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.CLASS__OWNED_RECEPTION:
				getOwnedReceptions().clear();
				getOwnedReceptions().addAll((Collection)newValue);
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
			case UML2Package.CLASS__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.CLASS__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.CLASS__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.CLASS__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.CLASS__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.CLASS__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.CLASS__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.CLASS__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.CLASS__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.CLASS__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.CLASS__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.CLASS__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.CLASS__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.CLASS__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.CLASS__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UML2Package.CLASS__GENERALIZATION:
				getGeneralizations().clear();
				return;
			case UML2Package.CLASS__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				return;
			case UML2Package.CLASS__SUBSTITUTION:
				getSubstitutions().clear();
				return;
			case UML2Package.CLASS__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				return;
			case UML2Package.CLASS__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				return;
			case UML2Package.CLASS__USE_CASE:
				getUseCases().clear();
				return;
			case UML2Package.CLASS__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)null);
				return;
			case UML2Package.CLASS__OCCURRENCE:
				getOccurrences().clear();
				return;
			case UML2Package.CLASS__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				return;
			case UML2Package.CLASS__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)null);
				return;
			case UML2Package.CLASS__IMPLEMENTATION:
				getImplementations().clear();
				return;
			case UML2Package.CLASS__OWNED_TRIGGER:
				getOwnedTriggers().clear();
				return;
			case UML2Package.CLASS__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
				return;
			case UML2Package.CLASS__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				return;
			case UML2Package.CLASS__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				return;
			case UML2Package.CLASS__OWNED_PORT:
				getOwnedPorts().clear();
				return;
			case UML2Package.CLASS__OWNED_OPERATION:
				getOwnedOperations().clear();
				return;
			case UML2Package.CLASS__NESTED_CLASSIFIER:
				getNestedClassifiers().clear();
				return;
			case UML2Package.CLASS__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case UML2Package.CLASS__OWNED_RECEPTION:
				getOwnedReceptions().clear();
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.CLASS__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.CLASS__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case UML2Package.CLASS__OWNER:
				return basicGetOwner() != null;
			case UML2Package.CLASS__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.CLASS__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.CLASS__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.CLASS__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.CLASS__VISIBILITY:
				return false;
			case UML2Package.CLASS__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.CLASS__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.CLASS__MEMBER:
				return !getMembers().isEmpty();
			case UML2Package.CLASS__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.CLASS__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.CLASS__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.CLASS__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case UML2Package.CLASS__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.CLASS__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.CLASS__PACKAGEABLE_ELEMENT_VISIBILITY:
				return packageableElement_visibility != PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;
			case UML2Package.CLASS__PACKAGE:
				return basicGetPackage() != null;
			case UML2Package.CLASS__REDEFINITION_CONTEXT:
				return !getRedefinitionContexts().isEmpty();
			case UML2Package.CLASS__IS_LEAF:
				return isLeaf() != IS_LEAF_EDEFAULT;
			case UML2Package.CLASS__FEATURE:
				return !getFeatures().isEmpty();
			case UML2Package.CLASS__IS_ABSTRACT:
				return isAbstract() != IS_ABSTRACT_EDEFAULT;
			case UML2Package.CLASS__INHERITED_MEMBER:
				return !getInheritedMembers().isEmpty();
			case UML2Package.CLASS__GENERAL:
				return !getGenerals().isEmpty();
			case UML2Package.CLASS__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
			case UML2Package.CLASS__ATTRIBUTE:
				return !getAttributes().isEmpty();
			case UML2Package.CLASS__REDEFINED_CLASSIFIER:
				return redefinedClassifier != null && !redefinedClassifier.isEmpty();
			case UML2Package.CLASS__SUBSTITUTION:
				return substitution != null && !substitution.isEmpty();
			case UML2Package.CLASS__POWERTYPE_EXTENT:
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UML2Package.CLASS__OWNED_USE_CASE:
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UML2Package.CLASS__USE_CASE:
				return useCase != null && !useCase.isEmpty();
			case UML2Package.CLASS__REPRESENTATION:
				return representation != null;
			case UML2Package.CLASS__OCCURRENCE:
				return occurrence != null && !occurrence.isEmpty();
			case UML2Package.CLASS__OWNED_BEHAVIOR:
				return ownedBehavior != null && !ownedBehavior.isEmpty();
			case UML2Package.CLASS__CLASSIFIER_BEHAVIOR:
				return classifierBehavior != null;
			case UML2Package.CLASS__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
			case UML2Package.CLASS__OWNED_TRIGGER:
				return ownedTrigger != null && !ownedTrigger.isEmpty();
			case UML2Package.CLASS__OWNED_STATE_MACHINE:
				return ownedStateMachine != null && !ownedStateMachine.isEmpty();
			case UML2Package.CLASS__OWNED_ATTRIBUTE:
				return !getOwnedAttributes().isEmpty();
			case UML2Package.CLASS__PART:
				return !getParts().isEmpty();
			case UML2Package.CLASS__ROLE:
				return !getRoles().isEmpty();
			case UML2Package.CLASS__OWNED_CONNECTOR:
				return ownedConnector != null && !ownedConnector.isEmpty();
			case UML2Package.CLASS__OWNED_PORT:
				return ownedPort != null && !ownedPort.isEmpty();
			case UML2Package.CLASS__OWNED_OPERATION:
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UML2Package.CLASS__SUPER_CLASS:
				return !getSuperClasses().isEmpty();
			case UML2Package.CLASS__EXTENSION:
				return !getExtensions().isEmpty();
			case UML2Package.CLASS__NESTED_CLASSIFIER:
				return nestedClassifier != null && !nestedClassifier.isEmpty();
			case UML2Package.CLASS__IS_ACTIVE:
				return isActive() != IS_ACTIVE_EDEFAULT;
			case UML2Package.CLASS__OWNED_RECEPTION:
				return ownedReception != null && !ownedReception.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == StructuredClassifier.class) {
			switch (derivedFeatureID) {
				case UML2Package.CLASS__OWNED_ATTRIBUTE: return UML2Package.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE;
				case UML2Package.CLASS__PART: return UML2Package.STRUCTURED_CLASSIFIER__PART;
				case UML2Package.CLASS__ROLE: return UML2Package.STRUCTURED_CLASSIFIER__ROLE;
				case UML2Package.CLASS__OWNED_CONNECTOR: return UML2Package.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR;
				default: return -1;
			}
		}
		if (baseClass == EncapsulatedClassifier.class) {
			switch (derivedFeatureID) {
				case UML2Package.CLASS__OWNED_PORT: return UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_PORT;
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
		if (baseClass == StructuredClassifier.class) {
			switch (baseFeatureID) {
				case UML2Package.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE: return UML2Package.CLASS__OWNED_ATTRIBUTE;
				case UML2Package.STRUCTURED_CLASSIFIER__PART: return UML2Package.CLASS__PART;
				case UML2Package.STRUCTURED_CLASSIFIER__ROLE: return UML2Package.CLASS__ROLE;
				case UML2Package.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR: return UML2Package.CLASS__OWNED_CONNECTOR;
				default: return -1;
			}
		}
		if (baseClass == EncapsulatedClassifier.class) {
			switch (baseFeatureID) {
				case UML2Package.ENCAPSULATED_CLASSIFIER__OWNED_PORT: return UML2Package.CLASS__OWNED_PORT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	// <!-- begin-custom-operations -->

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Class#isMetaclass()
	 */
	public boolean isMetaclass() {
		return ClassOperations.isMetaclass(this);
	}

	// <!-- end-custom-operations -->

} //ClassImpl
