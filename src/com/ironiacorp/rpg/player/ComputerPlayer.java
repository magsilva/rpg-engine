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

package com.ironiacorp.rpg.player;

import java.util.concurrent.atomic.AtomicInteger;

import com.ironiacorp.rpg.player.ai.AIStrategy;
import com.ironiacorp.rpg.player.ai.RandomStrategy;


/**
 * A computer player. This player is completely controlled by the computer
 * A.I.
 */
public class ComputerPlayer extends Player
{
	private static AtomicInteger counter = new AtomicInteger();
	
	private final static String DEFAULT_PREFIX = "computer";
	
	private AIStrategy strategy;
	
	public ComputerPlayer()
	{
		this(new RandomStrategy());
	}

	public ComputerPlayer(AIStrategy strategy)
	{
		this.name = DEFAULT_PREFIX + counter.getAndIncrement();
		setStrategy(strategy);
	}

	public AIStrategy getStrategy()
	{
		return strategy;
	}

	public void setStrategy(AIStrategy strategy)
	{
		this.strategy = strategy;
	}
}
