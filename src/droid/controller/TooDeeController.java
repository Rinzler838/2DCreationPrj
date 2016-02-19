package droid.controller;

import java.awt.Color;

import droid.model.Droid;
import droid.view.TooDeeFrame;

public class TooDeeController
{
	private Droid [][] myDroid;
	private TooDeeFrame baseFrame;
	
	public TooDeeController()
	{
		myDroid = new Droid[3][3];
		baseFrame = new TooDeeFrame();
	}
	
	public void start()
	{
		setupArray();
	}
	
	private void setupArray()
	{
		for (int row = 0; row < myDroid.length; row++)
		{
			for (int col = 0; col < myDroid[0].length; col++)
			{
				myDroid[row][col] = new Droid();
				if (col % 2 == 0)
				{
					myDroid[row][col].setNumberOfAccessories(col + 5);
				}
				else
				{
					myDroid[row][col].setDroidColor(Color.BLUE);
				}
			}
		}
	}
	
	public Droid [][] getMyDroid()
	{
		return myDroid;
	}
	
	public TooDeeFrame getBaseFrame()
	{
		return baseFrame;
	}
}
