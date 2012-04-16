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

public class Honesty extends NegativeBonus
{
	public Honesty()
	{
		super();
		setDescription("You must obey the law, and you do your best to get others to do so " +
				"as well. In an area with little or no law, you do not 'go wild': you act as " +
				"though the laws of you own home were in force. You also assume that others " +
				"honest unless you know otherwise.");
	}
}
