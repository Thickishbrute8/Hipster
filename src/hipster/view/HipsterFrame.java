package hipster.view;

import hipster.controller.HipsterController;
import javax.swing.*;
import java.awt.Dimension;

public class HipsterFrame extends JFrame
{
	private HipsterPanel appPanel;
	private HipsterController baseController;
	
	public HipsterFrame(HipsterController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new HipsterPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(new Dimension(600,400));
		this.setTitle("hipster day");
		this.setResizable(false);
		this.setVisible(true);
		
			
	}
}
