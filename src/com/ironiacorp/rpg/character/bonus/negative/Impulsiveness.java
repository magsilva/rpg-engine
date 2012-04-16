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

package com.ironiacorp.rpg.character.bonus.negative;

import com.ironiacorp.rpg.character.bonus.NegativeBonus;

public class Impulsiveness extends NegativeBonus
{
	public Impulsiveness()
	{
		super();
		setDescription("You hate talk and debate. You prefer action! When you are alone, you " +
				"act first and think later. In a group, when your friends want to stop and " +
				"discuss something, you should put in your two cents' worth quickly - if at all - " +
				"and then do something.");
	}

}
