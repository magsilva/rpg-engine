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

import java.math.BigInteger;

/**
 * 3D position. It used within a campaign, to set the characters initial
 * position.
 */
public class Position
{
	private BigInteger x;
	
	private BigInteger y;
	
	private BigInteger z;

	public Position(long x, long y, long z)
	{
		this.x = BigInteger.valueOf(x);
		this.y = BigInteger.valueOf(y);
		this.z = BigInteger.valueOf(z);
	}
	
	public Position(BigInteger x, BigInteger y, BigInteger z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public BigInteger getX()
	{
		return x;
	}

	public void setX(BigInteger x)
	{
		this.x = x;
	}

	public BigInteger getY()
	{
		return y;
	}

	public void setY(BigInteger y)
	{
		this.y = y;
	}

	public BigInteger getZ()
	{
		return z;
	}

	public void setZ(BigInteger z)
	{
		this.z = z;
	}
	
	
}
