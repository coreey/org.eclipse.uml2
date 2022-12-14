/*
 * Copyright (c) 2003, 2018 IBM Corporation and others.
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
package org.eclipse.uml2.common.edit.command;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;

/**
 * 
 */
public class SubsetAddCommand
		extends SubsetCommand {

	protected final Collection<?> collection;

	protected final int index;

	public SubsetAddCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, EStructuralFeature[] supersetFeatures,
			Collection<?> collection, int index) {

		super(domain, owner, feature, supersetFeatures, new AddCommand(domain,
			owner, feature, collection, index));

		this.collection = collection;
		this.index = index;
	}

	@Override
	public void execute() {

		if (supersetFeatures != null) {

			for (Object element : collection) {

				for (int i = 0; i < supersetFeatures.length; i++) {

					if (supersetFeatures[i].isMany()) {
						@SuppressWarnings("unchecked")
						EList<EObject> values = (EList<EObject>) owner
							.eGet(supersetFeatures[i]);

						if (!values.contains(element)) {
							appendAndExecute(AddCommand.create(domain, owner,
								supersetFeatures[i], Collections
									.singleton(element),
								CommandParameter.NO_INDEX));
						}
					}
				}
			}
		}

		super.execute();
	}

}