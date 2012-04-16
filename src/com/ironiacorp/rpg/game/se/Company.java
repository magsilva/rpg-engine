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


package com.ironiacorp.rpg.game.se;

import java.util.ArrayList;

import com.ironiacorp.rpg.Adventure;
import com.ironiacorp.rpg.Campaign;
import com.ironiacorp.rpg.player.Player;

public class Company extends Campaign
{
	public Adventure startAdventure()
	{
		Adventure adventure = new Project(this);
		return adventure;
	}
	
	public Adventure startAdventure(ArrayList<Player> players)
	{
		Adventure adventure = new Project(this, players);
		return adventure;
	}
	
	public int getMaxPlayers()
	{
		return 10;
	}
	
	public int getMaxCharacters()
	{
		return getMaxPlayers() + 1000;
	}

}
