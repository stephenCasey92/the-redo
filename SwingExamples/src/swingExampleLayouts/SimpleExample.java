package swingExampleLayouts;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleExample extends JFrame {

	
	public SimpleExample(){
		initUI();
	}
	private void initUI(){
		//default vals
		setTitle("Simple Example");
		setSize(300,200);
		setLocationRelativeTo(null); // sets up in middle of the page (null aserts this)
		setDefaultCloseOperation(EXIT_ON_CLOSE); // what happens when X is pressed
		
		//setting container and layout
		Container container = this.getContentPane();
		container.setLayout(new FlowLayout());
		
		// add a panel - want to add components to a panel rather than a frame for reuse
		JPanel panel1 = new JPanel();
		container.add(panel1);
		
		// add a button to the panel
		JButton button1 = new JButton("Click me!");
		panel1.add(button1);
		
		
	}
	
	
	
	public static void main(String[] args) {
		// Make the app run
		EventQueue.invokeLater(new Runnable(){
			@Override
			public void run()
			{
				SimpleExample ex = new SimpleExample();
				ex.setVisible(true);
			}
		});
		
		//SimpleExample 

	}

}
