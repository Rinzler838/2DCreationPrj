package droid.model;

import java.awt.Color;

public class Droid
{
	private int numberOfAccessories;
	private Color droidColor;
	
	public Droid()
	{
		this.numberOfAccessories = 4;
		this.droidColor = Color.BLUE;
	}
	
	public Droid(int numberOfAccessories, Color droidColor)
	{
		this.numberOfAccessories = numberOfAccessories;
		this.droidColor = droidColor;
	}

	public int getNumberOfAccessories()
	{
		return numberOfAccessories;
	}

	public void setNumberOfAccessories(int numberOfAccessories)
	{
		this.numberOfAccessories = numberOfAccessories;
	}

	public Color getDroidColor()
	{
		return droidColor;
	}

	public void setDroidColor(Color droidColor)
	{
		this.droidColor = droidColor;
	}
	
	public String toString()
	{
		String droidDescription = "This Droid has " + numberOfAccessories + " accessories, and it's color is " + droidColor;
		
		return droidDescription;
	}
}
