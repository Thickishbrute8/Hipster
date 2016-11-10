package hipster.view;

import hipster.controller.HipsterController;

import java.awt.Color;

import javax.swing.*;

public class HipsterPanel extends JPanel 
{
	
	private SpringLayout baseLayout;
	private JComboBox dropDown;
	private JLabel infoLabel;
	private JButton myButton;
	private HipsterController baseController;
	
	public HipsterPanel(HipsterController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.myButton = new JButton("click the button");
		this.infoLabel = new JLabel("wow words");
		this.dropDown = new JComboBox(baseController.getWords());
		
		setupPanel();
		setupLayout();
		setupListeners();
	
	}
		
	
	
	private void setupPanel()
	{
		this.setBackground(Color.CYAN);
		this.setLayout(baseLayout);
		this.add(dropDown);
		this.add(infoLabel);
		this.add(myButton);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
