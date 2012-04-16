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
import java.util.Random;

import com.ironiacorp.rpg.character.Stakeholder;
import com.ironiacorp.rpg.game.se.Company;
import com.ironiacorp.rpg.game.se.event.Requirement;
import com.ironiacorp.rpg.game.se.event.SourceCodeFile;
import com.ironiacorp.rpg.game.se.event.TestCase;
import com.ironiacorp.rpg.player.ComputerPlayer;
import com.ironiacorp.rpg.player.Player;
import com.ironiacorp.rpg.universe.Internet;

/**
 * A RPG (Role-Playing Game) is a game in which players take on the
 * personalities of imaginary individuals, or characters, in a
 * fictional or historical setting, and try to act as those characters
 * would.
 * 
 */
public class Game
{
	private Campaign campaign;
	
	private Random random = new Random();
	
	private ArrayList<Player> createPlayers()
	{
		int count = random.nextInt(campaign.getMaxPlayers());
		ArrayList<Player> players = new ArrayList<Player>(count);
		for (int i = 0; i < count; i++) {
			players.add(new ComputerPlayer());
		}
		return players;
	}
	
	private ArrayList<Universe> createUniverses()
	{
		ArrayList<Universe> universes = new ArrayList<Universe>();
		Universe u1 = new Internet();
		
		int count = 0;
		do {
			count = random.nextInt(campaign.getMaxCharacters());
		} while (count < campaign.getMaxPlayers());
		for (int i = 0; i < count; i++) {
			u1.addCharacter(new Stakeholder());	
		}
		universes.add(u1);

		return universes;
	}
	
	private ArrayList<Goal> createGoals()
	{
		ArrayList<Goal> goals = new ArrayList<Goal>();
		return goals;
	}
	
	public Game()
	{
		campaign = new Company();
		campaign.setUniverses(createUniverses());
		campaign.setPlayers(createPlayers());
	}
	
	public void start()
	{
		Adventure adventure = campaign.startAdventure();
		
		int requirementsCount = random.nextInt(10) + 1;
		int testCaseCount = requirementsCount * random.nextInt(10) + 1;
		int sourceCodeFileCount = testCaseCount * random.nextInt(10) + 1;
		adventure.addGoal(new Goal(new Requirement(), requirementsCount));	
		adventure.addGoal(new Goal(new TestCase(), testCaseCount));
		adventure.addGoal(new Goal(new SourceCodeFile(), sourceCodeFileCount));
		
		while (! adventure.hasFinished()) {
			Session session = adventure.createSession();
			while (session.hasNext()) {
				Turn turn = session.next();
			}
		}
	}
	
	public static void main(String[] args)
	{
		Game game = new Game();
		game.start();
	}
}
