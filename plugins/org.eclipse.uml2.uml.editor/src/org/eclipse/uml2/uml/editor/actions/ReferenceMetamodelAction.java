/*
 * Copyright (c) 2005, 2018 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 286329, 535301
 *
 */
package org.eclipse.uml2.uml.editor.actions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.jface.action.IAction;
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.editor.UMLEditorPlugin;
import org.eclipse.uml2.uml.resource.UMLResource;

public class ReferenceMetamodelAction
		extends UMLCommandAction {

	public ReferenceMetamodelAction() {
		super();
	}

	@Override
	protected Command createActionCommand(EditingDomain editingDomain,
			Collection<?> collection) {

		if (collection.size() == 1
			&& collection.iterator().next() instanceof Profile) {

			return IdentityCommand.INSTANCE;
		}

		return UnexecutableCommand.INSTANCE;
	}

	@Override
	public void run(IAction action) {

		if (command != UnexecutableCommand.INSTANCE) {
			final Profile profile = (Profile) collection.iterator().next();
			EList<Model> referencedMetamodels = profile
				.getReferencedMetamodels();

			List<Model> choiceOfValues = new ArrayList<Model>();

			try {
				ResourceSet resourceSet = profile.eResource().getResourceSet();

				try {
					resourceSet.getResource(URI
						.createURI(UMLResource.UML_METAMODEL_URI), true);
				} catch (Exception e) {
					// ignore
				}

				for (Resource resource : resourceSet.getResources()) {

					for (TreeIterator<EObject> contents = resource
						.getAllContents(); contents.hasNext();) {

						EObject eObject = contents.next();

						if (eObject instanceof Model) {
							Model model = (Model) eObject;

							if (model.isMetamodel()
								&& !referencedMetamodels.contains(model)) {

								choiceOfValues.add(model);
							}
						}
					}
				}
			} catch (Exception e) {
				// ignore
			}

			Collections.<Model> sort(choiceOfValues,
				new TextComparator<Model>());

			String label = UMLEditorPlugin.INSTANCE
				.getString("_UI_ReferenceMetamodelActionCommand_label"); //$NON-NLS-1$

			final FeatureEditorDialog dialog = new FeatureEditorDialog(
				workbenchPart.getSite().getShell(), getLabelProvider(),
				profile, UMLPackage.Literals.CLASS, Collections.EMPTY_LIST,
				label, choiceOfValues, false, false, true);
			dialog.open();

			if (dialog.getReturnCode() == FeatureEditorDialog.OK) {
				editingDomain.getCommandStack().execute(
					new ChangeCommand(editingDomain, new Runnable() {

						public void run() {

							for (Object result : dialog.getResult()) {
								profile
									.createMetamodelReference((Model) result);
							}
						}
					}, label));
			}
		}
	}

}
