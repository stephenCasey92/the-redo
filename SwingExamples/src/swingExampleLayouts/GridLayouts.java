package swingExampleLayouts;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridLayouts extends JFrame { // <---------- DONT FORGET EXTENDS

	JButton button1, button2, button3, button4, button5;
	
	public GridLayouts(){
		initUI();
	}
	
	private void initUI()
	{
		setTitle("Grid Layouts example");
		setSize(600,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container container = this.getContentPane();
		
		JPanel panel1 = new JPanel(new GridLayout(3,2));
		
		createButtons();
		
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel1.add(button4);
		panel1.add(button5);
		
		container.add(panel1);
	}
	
	public void createButtons()
	{
		button1 = new JButton("Button1");
		button2 = new JButton("Button2");
		button3 = new JButton("Button3");
		button4 = new JButton("Button4");
		button5 = new JButton("Button5");
	}
	
	public static void main(String[] args) {

		// make app run
		EventQueue.invokeLater(new Runnable(){
			
			@Override
			public void run()
			{
				GridLayouts gl = new GridLayouts();
				gl.setVisible(true);
			}
			
		});
		
		

	}

}
