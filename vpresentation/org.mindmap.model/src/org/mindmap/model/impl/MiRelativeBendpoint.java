package org.mindmap.model.impl;


/**
 * <copyright> Copyright (c) 2009-2012 Chair of Applied Software Engineering, Technische Universität München (TUM).
 * All rights reserved. This program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */


import java.io.Serializable;

import org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint;

/**
 * Serializable extension of GMF's {@link RelativeBendpoint}.
 * 
 * @author mharut
 */
public class MiRelativeBendpoint extends RelativeBendpoint implements Serializable {



	/**
	 * 
	 */
	private static final long serialVersionUID = 5741982484027394588L;

	/**
	 * Default constructor required for serialization.
	 */
	public MiRelativeBendpoint() {
		super();
	}

	/**
	 * Initializes a bendpoint by setting the required coordinates.
	 * 
	 * @param sourceX the source's x-coordinate
	 * @param sourceY the source's y-coordinate
	 * @param targetX the target's x-coordinate
	 * @param targetY the target's y-coordinate
	 */
	public MiRelativeBendpoint(int sourceX, int sourceY, int targetX, int targetY) {
		super(sourceX, sourceY, targetX, targetY);
	}

}
