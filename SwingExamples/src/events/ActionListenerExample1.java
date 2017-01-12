package events;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionListenerExample1 extends JFrame {

	
	public ActionListenerExample1()
	{
		initUI();
		
	}
	public void initUI(){
		setTitle("action");
		setSize(600,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container container = this.getContentPane();
		
		//add a button with an action listener event handler attached
		JButton button1 = new JButton("New");
		button1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				System.out.println("You cclicked butoons");
				
			}			
		});
		container.add(button1);
	}
	
	
	
	
	public static void main(String[] args) {
			

		EventQueue.invokeLater(new Runnable(){
			
			@Override
			public void run(){
				ActionListenerExample1 ale1 = new ActionListenerExample1();
				ale1.setVisible(true);
			}
			
		});
		
		
	}

}
