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

import com.ironiacorp.rpg.player.Player;

/**
 * Continuing serie of adventures. A campaign will usually have a cast
 * of player characters, and the same game master (or team of game
 * masters).
 */
public abstract class Campaign
{
	private ArrayList<GameMaster> masters;
	
	private ArrayList<Player> players;
	
	private ArrayList<Universe> universes;
	
	protected ArrayList<Adventure> adventures;
	
	public Campaign()
	{
		masters = new ArrayList<GameMaster>();
		players = new ArrayList<Player>();
	}

	public ArrayList<GameMaster> getMasters()
	{
		return masters;
	}

	public void setMasters(ArrayList<GameMaster> masters)
	{
		this.masters = masters;
	}
	
	public void addMaster(GameMaster master)
	{
		masters.add(master);
	}

	public void removeMaster(GameMaster master)
	{
		masters.remove(master);
	}


	public ArrayList<Player> getPlayers()
	{
		return players;
	}

	public void setPlayers(ArrayList<Player> players)
	{
		this.players = players;
	}
	
	public void addPlayer(Player player)
	{
		players.add(player);
	}
	
	public void removePlayer(Player player)
	{
		players.remove(player);
	}
	
	
	public ArrayList<Universe> getUniverses()
	{
		return universes;
	}

	public void setUniverses(ArrayList<Universe> universes)
	{
		this.universes = universes;
	}
	
	public void addUniverse(Universe universe)
	{
		universes.add(universe);
	}
	
	public void removeUniverse(Universe universe)
	{
		universes.remove(universe);
	}

	public abstract Adventure startAdventure();
	
	public abstract Adventure startAdventure(ArrayList<Player> players);

	public abstract int getMaxPlayers();

	public abstract int getMaxCharacters();
}
