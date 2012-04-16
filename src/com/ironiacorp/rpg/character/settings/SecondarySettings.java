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

package com.ironiacorp.rpg.character.settings;

import com.ironiacorp.rpg.character.attribute.Fatigue;
import com.ironiacorp.rpg.character.attribute.InjuryResistance;
import com.ironiacorp.rpg.character.attribute.Perception;
import com.ironiacorp.rpg.character.attribute.Reflexes;
import com.ironiacorp.rpg.character.attribute.Speed;
import com.ironiacorp.rpg.character.attribute.Will;

public class SecondarySettings extends CharacterSetting
{
	public SecondarySettings()
	{
		super();
		attributes.add(new Fatigue());
		attributes.add(new Speed());
		attributes.add(new InjuryResistance());
		attributes.add(new Perception());
		attributes.add(new Reflexes());
		attributes.add(new Will());
	}
}
