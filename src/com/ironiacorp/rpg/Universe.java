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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Background for play.
 */
public abstract class Universe
{
	protected HashMap<Character, Position> characters;
	
	public Universe()
	{
		characters = new HashMap<Character, Position>();
	}

	public abstract ArrayList<Character[]> detectColisions();
	
	public Position getDefaultPosition(Character character)
	{
		Position p = new Position(0, 0, 0);
		return p;
	}
	
	public void addCharacter(Character character)
	{
		characters.put(character, getDefaultPosition(character));
	}
	
	public void addCharacter(Character character, Position position)
	{
		characters.put(character, position);
	}
	
	public void removeCharacter(Character character)
	{
		characters.remove(character);
	}
	
	public void removeCharactersAt(Position position)
	{
		Iterator<Position> positions = characters.values().iterator();
		while (positions.hasNext()) {
			Position p = positions.next();
			if (p.equals(position)) {
				positions.remove();
			}
		}
	}
}
