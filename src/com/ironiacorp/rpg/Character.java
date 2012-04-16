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

import com.ironiacorp.rpg.character.bonus.Bonus;
import com.ironiacorp.rpg.character.settings.CharacterSetting;
import com.ironiacorp.rpg.character.skill.Skill;

/**
 * Being that is played by one gamemaster or a player.
 */
public abstract class Character
{
	private ArrayList<CharacterSetting> settings;
	
	private ArrayList<Bonus> bonus;
	
	private ArrayList<Skill> skills;
	
	private Controller controller;

	public Character()
	{
		settings = new ArrayList<CharacterSetting>();
		bonus = new ArrayList<Bonus>();
		skills = new ArrayList<Skill>();
	}
	
	public ArrayList<CharacterSetting> getSettings()
	{
		return settings;
	}

	public void setSettings(ArrayList<CharacterSetting> settings)
	{
		this.settings = settings;
	}
	
	public void addSetting(CharacterSetting setting)
	{
		settings.add(setting);
	}
	

}
