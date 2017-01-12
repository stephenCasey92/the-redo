package swingExampleLayouts;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class SwingComponents extends JFrame{

	Container container;
	JPanel panel1, panel2, panel3;
	JLabel label1,label2,label3;
	JTextField textField1, textField2;
	JList<String> list;
	JTabbedPane tabbedPane;
	JSplitPane splitPane;
	JRadioButton b1,b2,b3,b4;
	ButtonGroup group,group2;
	
	public SwingComponents(){
		initUI();
	}
	
	public void initUI()
	{
		setTitle("Swing Components");
		setSize(600,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		container = this.getContentPane();
		container.setLayout(new GridLayout(1,1));
		
		createComponents();
		
		/*container.add(panel1);
		container.add(panel2);
		*/
		
		container.add(tabbedPane); // add tabbed pane. remove panels. uncomment and comment this for diff
	}
	
	public void createComponents(){
		// panels
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(2,1));
		panel1.setBorder(BorderFactory.createLineBorder(Color.black));
		panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createLineBorder(Color.red));
		
		panel3 = new JPanel();
		panel3.setLayout(new GridLayout(2,1));
		panel3.setBorder(BorderFactory.createLineBorder(Color.black));
		
		// labels/textfield pairs
		label1 = new JLabel("Name:");
		panel1.add(label1);
		textField1 = new JTextField();
		textField1.setColumns(20);
		panel1.add(textField1);
		
		label2 = new JLabel("Favourite Colour:");
		panel1.add(label2);
		textField2 = new JTextField();
		textField2.setColumns(20);
		panel1.add(textField2);
		
		// lists
		String[] animals = {"Cat","Dog", "Rabbit", "Fish"};
		list = new JList<String>(animals);
		panel2.add(list);
		
		//radio button and grouping items
		b1 = new JRadioButton("Option 1");
		b2 = new JRadioButton("Option 2");
		b3 = new JRadioButton("Option 3");
		b4 = new JRadioButton("Option 4");
		
		group = new ButtonGroup();
		group.add(b1);
		group.add(b2);
		
		group2 = new ButtonGroup();
		group2.add(b3);
		group2.add(b4);		
		
		panel2.add(b1);
		panel2.add(b2);
		panel2.add(b3);
		panel2.add(b4);
		
		// tabbed pane
		tabbedPane = new JTabbedPane();
		tabbedPane.setFont(new Font("Arial",0, 16));
		tabbedPane.add("text fields", panel1);
		tabbedPane.addTab("list", panel2);	
		
		tabbedPane.addTab("woof", panel3);
		
		// split pane
		
		splitPane = new JSplitPane();
		
		splitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
		
		//splitPane.setDividerLocation(200);
		
		splitPane.setTopComponent(panel1);
		splitPane.setBottomComponent(panel2);
		
		//splitPane.setLeftComponent(panel1);
		//splitPane.setRightComponent(panel2);
		tabbedPane.add("Split", splitPane); // could also just add split pane to a JPanel instead if want to
		
		
	}
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable(){
			
			@Override
			public void run()
			{
				SwingComponents sc = new SwingComponents();
				sc.setVisible(true);
			}
			
			
		});

		
	}

}
