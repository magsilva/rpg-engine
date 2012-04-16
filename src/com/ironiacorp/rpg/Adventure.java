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

import com.ironiacorp.rpg.game.se.event.Requirement;
import com.ironiacorp.rpg.player.Player;

/**
 * Single mission or plot within a game (it's the basic unit of play in
 * a RPG).
 */
public abstract class Adventure
{
	private Campaign campaign;
	
	private ArrayList<Player> players;
	
	private ArrayList<Session> sessions;
	
	private ArrayList<Goal> goals;
	
	private HashMap<Artifact, Integer> artifacts;

	public Adventure(Campaign campaign)
	{
		this(campaign, campaign.getPlayers());
	}
	
	public Adventure(Campaign campaign, ArrayList<Player> players)
	{
		this.campaign = campaign;
		this.players = players;
		artifacts = new HashMap<Artifact, Integer>();
	}
	
	
	
	
	public ArrayList<Session> getSessions()
	{
		return sessions;
	}

	public Session createSession()
	{
		Session session = new Session();
		return session;
	}
	
	public void addSession(Session session)
	{
		sessions.add(session);
	}

	public boolean hasFinished()
	{
		boolean result = true;
		
		for (Goal goal : goals) {
			if (! goal.isSatisfiedBy(artifacts)) {
				result = false;
				break;
			}
		}
		
		return result;
	}

	public void addGoal(Goal goal)
	{
		goals.add(goal);
	}
}
