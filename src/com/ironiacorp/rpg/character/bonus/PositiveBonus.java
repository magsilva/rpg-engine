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

package com.ironiacorp.rpg.character.bonus;

public class PositiveBonus extends Bonus
{
	public PositiveBonus()
	{
		super();
	}
	
	@Override
	public int getValue()
	{
		if (super.getValue() < 0) {
			return super.getValue() * (-1);
		}
		return super.getValue();
	}

	@Override
	public void setValue(int value)
	{
		if (value < 0) {
			value *= -1;
		}
		super.setValue(value);
	}
}
