package droid.view;

import javax.swing.*;

import droid.controller.TooDeeController;

public class TooDeePanel extends JPanel
{
	private TooDeeController baseController;
	private SpringLayout baseLayout;
	private JTextField rowField;
	private JTextField columnField;
	private JLabel currentDroid;
	private JTextField editField;
	private JButton changeButn;
	private JButton displayButton;
	private JTable droidTable;
	
	public TooDeePanel(TooDeeController baseController)
	{
		this.baseController = baseController;
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		//Garbage here
	}
	
	private void setupListeners()
	{
		
	}
}
