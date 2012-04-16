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

package com.ironiacorp.rpg.character.skill;

import java.util.HashMap;

import com.ironiacorp.rpg.character.attribute.Attribute;

public abstract class Skill
{
	private String name;
	
	private String description;
	
	private HashMap<Attribute, Integer> effects;

	private SkillDifficulty skillDifficulty;
	
	private int skillLevel;
	
	private int turnsRequired;
	
	
	public int getTurnsRequired()
	{
		return turnsRequired;
	}

	public void setTurnsRequired(int turnsRequired)
	{
		this.turnsRequired = turnsRequired;
	}

	public SkillDifficulty getSkillDifficulty()
	{
		return skillDifficulty;
	}

	public void setSkillDifficulty(SkillDifficulty skillDifficulty)
	{
		this.skillDifficulty = skillDifficulty;
	}

	public int getSkillLevel()
	{
		return skillLevel;
	}

	public void setSkillLevel(int skillLevel)
	{
		this.skillLevel = skillLevel;
	}

	public Skill()
	{
		setName(this.getClass().getSimpleName());
		effects = new HashMap<Attribute, Integer>();
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public HashMap<Attribute, Integer> getEffects()
	{
		return effects;
	}

	public void setEffects(HashMap<Attribute, Integer> effects)
	{
		this.effects = effects;
	}
	
	public void addEffect(Attribute attribute, Integer value)
	{
		effects.put(attribute, value);
	}
	
	public void removeEffect(Attribute attribute)
	{
		effects.remove(attribute);
	}
	
	public int getEffect(Attribute attribute)
	{
		return effects.get(attribute);
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}
}
