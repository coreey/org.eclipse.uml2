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

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;

public abstract class SupersetCommand
		extends CompoundCommand {

	protected final EditingDomain domain;

	protected final EObject owner;

	protected final EStructuralFeature feature;

	protected final EStructuralFeature[] subsetFeatures;

	protected final Command supersetCommand;

	protected SupersetCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, EStructuralFeature[] subsetFeatures,
			Command supersetCommand) {
		super(0);

		this.domain = domain;
		this.owner = owner;
		this.feature = feature;
		this.subsetFeatures = subsetFeatures;
		this.supersetCommand = supersetCommand;
	}

	@Override
	public void execute() {
		appendAndExecute(supersetCommand);
	}

	@Override
	protected boolean prepare() {
		return supersetCommand.canExecute();
	}

}