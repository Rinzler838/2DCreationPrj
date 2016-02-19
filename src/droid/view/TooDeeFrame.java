package droid.view;

import droid.controller.TooDeeController;
import droid.view.TooDeePanel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TooDeeFrame extends JFrame
{
	private TooDeeController baseController;
	private TooDeePanel basePanel;
	
	public TooDeeFrame(TooDeeController baseController)
	{
		this.baseController = baseController;
		basePanel = new TooDeePanel(baseController);
		setupFrame();
	}
	
	public String getResponse(String prompt)
	{
		String response = JOptionPane.showInputDialog(this, prompt);
		return response;
	}
	
	private void setupFrame()
	{
		this.setSize(450,300);
		this.setContentPane(basePanel);
		this.setTitle("| DROID |");
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public TooDeeController getBaseController()
	{
		return baseController;
	}
}
