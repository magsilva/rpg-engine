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


package com.ironiacorp.rpg.character;

import com.ironiacorp.rpg.Character;
import com.ironiacorp.rpg.character.settings.BasicSettings;
import com.ironiacorp.rpg.character.settings.ConnectivitySettings;
import com.ironiacorp.rpg.character.settings.EnglishLanguageSettings;
import com.ironiacorp.rpg.character.settings.InfluenceSettings;
import com.ironiacorp.rpg.character.settings.SecondarySettings;
import com.ironiacorp.rpg.character.settings.SocialTraitsSetting;

public class SoftwareEngineer extends Character
{
	public SoftwareEngineer()
	{
		super();
		addSetting(new BasicSettings());
		addSetting(new ConnectivitySettings());
		addSetting(new EnglishLanguageSettings());
		addSetting(new InfluenceSettings());
		addSetting(new SecondarySettings());
		addSetting(new SocialTraitsSetting());
	}
}
