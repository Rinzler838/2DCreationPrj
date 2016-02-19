package droid.view;

import java.awt.Color;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import droid.controller.TooDeeController;

public class TooDeePanel extends JPanel
{
	private TooDeeController baseController;
	private SpringLayout baseLayout;
	private JTextField rowField;
	private JTextField columnField;
	private JLabel currentDroidLabel;
	private JTextField editField;
	private JButton changeButton;
	private JButton displayButton;
	
	private JTable droidTable;
	
	public TooDeePanel(TooDeeController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		rowField = new JTextField(5);
		columnField = new JTextField(5);
		editField = new JTextField(20);
		currentDroidLabel = new JLabel("The Current Droid");
		changeButton = new JButton("Change the indicated Droid");
		displayButton = new JButton("Display the indicated Droid");
		
		setupTable();
		setupPanel();
		setupLayout();
	}
	
	/*
	 * Helper method to load information from the model into the GUI as a 2D array.
	 */
	private void setupTable()
	{
		String [] columnHeaders = {"Column 0", "Column 1", "Column 2"};
		DefaultTableModel tableModel = new DefaultTableModel(baseController.getMyDroid(), columnHeaders);
		droidTable = new JTable(tableModel);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(droidTable);
		this.add(rowField);
		this.add(columnField);
		this.add(currentDroidLabel);
		this.add(editField);
		this.add(changeButton);
		this.add(displayButton);
		//this.setBackgroundColor(Color.WHITE);
	}
	
	private void setupLayout()
	{
		//Garbage here
		baseLayout.putConstraint(SpringLayout.NORTH, rowField, 81, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, columnField, 81, SpringLayout.NORTH, this);baseLayout.putConstraint(SpringLayout.NORTH, editField, 6, SpringLayout.SOUTH, rowField);
		baseLayout.putConstraint(SpringLayout.WEST, editField, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, currentDroidLabel, 6, SpringLayout.NORTH, rowField);
		baseLayout.putConstraint(SpringLayout.EAST, currentDroidLabel, -55, SpringLayout.WEST, rowField);
		baseLayout.putConstraint(SpringLayout.WEST, rowField, 0, SpringLayout.WEST, changeButton);
		baseLayout.putConstraint(SpringLayout.EAST, columnField, 0, SpringLayout.EAST, changeButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, displayButton, -225, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, changeButton, 0, SpringLayout.WEST, displayButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, changeButton, -6, SpringLayout.NORTH, displayButton);
		baseLayout.putConstraint(SpringLayout.EAST, displayButton, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, droidTable, 135, SpringLayout.SOUTH, editField);
		baseLayout.putConstraint(SpringLayout.WEST, droidTable, 0, SpringLayout.WEST, editField);
		baseLayout.putConstraint(SpringLayout.SOUTH, droidTable, 24, SpringLayout.SOUTH, editField);
		baseLayout.putConstraint(SpringLayout.EAST, droidTable, 430, SpringLayout.WEST, editField);
	}
	
	private void setupListeners()
	{
		
	}
}
