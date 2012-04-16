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

package com.ironiacorp.rpg.character.attribute;

public class InstantMessagingAwareness extends Attribute
{
	public InstantMessagingAwareness()
	{
		super();
		setName("Instant Messaging Awareness");
		setDescription("How much of his time does the player spend online and available " +
				"through an instant messenger (ICQ, MSN, Yahoo, Jabber, etc). The " +
				"higher the value, greater is the time he spends online.");
	}
}
