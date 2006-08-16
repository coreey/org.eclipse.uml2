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
 * $Id: ExternalizeLabelsAction.java,v 1.3.2.1 2006/08/16 17:40:08 khussey Exp $
 */
package org.eclipse.uml2.examples.uml.ui.actions;

import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.util.UMLSwitch;

public class ExternalizeLabelsAction
		extends PropertiesAction {

	protected Command createActionCommand(EditingDomain editingDomain,
			Collection collection) {

		if (collection.size() == 1
			&& collection.iterator().next() instanceof org.eclipse.uml2.uml.Package) {

			return IdentityCommand.INSTANCE;
		}

		return UnexecutableCommand.INSTANCE;
	}

	public void run(IAction action) {

		if (command != UnexecutableCommand.INSTANCE) {
			final org.eclipse.uml2.uml.Package package_ = (org.eclipse.uml2.uml.Package) collection
				.iterator().next();

			final PrintWriter propertiesWriter = getPropertiesWriter(package_);

			new UMLSwitch() {

				public Object caseAssociation(Association association) {
					return association;
				}

				public Object caseConstraint(Constraint constraint) {
					return constraint;
				}

				public Object caseNamedElement(NamedElement namedElement) {
					String qualifiedName = namedElement.getQualifiedName();

					if (!UML2Util.isEmpty(qualifiedName)) {
						externalize(propertiesWriter, namedElement,
							qualifiedName);
					}

					return super.caseNamedElement(namedElement);
				}

				public Object defaultCase(EObject eObject) {

					for (Iterator eContents = eObject.eContents().iterator(); eContents
						.hasNext();) {

						doSwitch((EObject) eContents.next());
					}

					return eObject;
				}

			}.doSwitch(package_);

			propertiesWriter.close();
		}
	}

	protected void externalize(PrintWriter propertiesWriter,
			NamedElement namedElement, String qualifiedName) {
		propertiesWriter.println(getPropertiesKey("_label_", //$NON-NLS-1$
			qualifiedName) + PROPERTIES_SEPARATOR
			+ format(capName(namedElement.getLabel()), " ", //$NON-NLS-1$
				null, false));
	}

}
