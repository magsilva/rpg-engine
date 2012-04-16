/*
This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

Copyright (C) 2007 Marco Aurélio Graciotto Silva <magsilva@gmail.com>
*/

package com.ironiacorp.rpg;

import java.util.HashMap;

public class Goal
{
	private Artifact artifact;
	
	private int count;

	public Goal(Artifact artifact, int count)
	{
		this.artifact = artifact;
		this.count = count;
	}
	
	public Artifact getArtifact()
	{
		return artifact;
	}

	public int getCount()
	{
		return count;
	}

	public boolean isSatisfiedBy(HashMap<Artifact, Integer> artifacts)
	{
		if (! artifacts.containsKey(artifact)) {
			return false;
		}
		
		if (artifacts.get(artifact) >= count) {
			return true;
		} else {
			return false;
		}
	}
}
