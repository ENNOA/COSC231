package Project12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class P12b extends JFrame implements ActionListener {
	//declarations
	JButton button;
	JPanel topPanel;
	JPanel midPanel;
	JPanel lowPanel;
	JLabel label;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	JLabel label5;
	JTextField radiusField;
	JTextField lengthField;
	JTextField areaField;
	JTextField volumeField;
	Border dash = BorderFactory.createDashedBorder(new Color(0,0,0));
	
	public P12b (){
		//panels
		topPanel = new JPanel();
		midPanel = new JPanel();
		lowPanel = new JPanel();
		
		topPanel.setBounds(0, 0, 900, 30);
		topPanel.setBorder(dash);
		
		midPanel.setBounds(0, 30, 900, 50);
		midPanel.setBorder(dash);	
		
		lowPanel.setBounds(0, 80, 900, 50);
		lowPanel.setBorder(dash);
		
		//labels
		label = new JLabel("(JE) Area and Volume calculator ");
		label2 = new JLabel("Radius ");
		label3 = new JLabel("Length ");
		label4 = new JLabel("Results: Area ");
		label5 = new JLabel("Volume");
		
		//button 
		button = new JButton();
		button.setBounds(200, 200, 100, 150);
		button.addActionListener(this);
		button.setText("Submit"); 
		button.setForeground(Color.BLACK);
		button.setBackground(new Color(0x5d5d5d));
		button.setBorder(BorderFactory.createRaisedBevelBorder());
		
		//radius
		radiusField = new JTextField();  
		radiusField.setPreferredSize(new Dimension(100,40));
		radiusField.setFont(new Font("Comic Sans",Font.ITALIC,24)); 
		radiusField.setForeground(new Color(0xf0ffe1));  
		radiusField.setBackground(new Color(0x73964f));
		
		//length
		lengthField = new JTextField();  
		lengthField.setPreferredSize(new Dimension(100,40));
		lengthField.setFont(new Font("Comic Sans",Font.ITALIC,24)); 
		lengthField.setForeground(new Color(0xf0ffe1));  
		lengthField.setBackground(new Color(0x73964f));
		
		//area
		areaField = new JTextField();
		areaField.setPreferredSize(new Dimension(300,40));
		areaField.setFont(new Font("Comic Sans",Font.ITALIC,24)); 
		areaField.setForeground(new Color(0xf0ffe1));  
		areaField.setBackground(new Color(0x73964f));
		
		//volume
		volumeField = new JTextField();
		volumeField.setPreferredSize(new Dimension(300,40));
		volumeField.setFont(new Font("Comic Sans",Font.ITALIC,24)); 
		volumeField.setForeground(new Color(0xf0ffe1));  
		volumeField.setBackground(new Color(0x73964f));		
					
		//Components
		this.add(topPanel);
		this.getContentPane().setLayout(null);
		topPanel.add(label);
		this.add(midPanel);
		midPanel.add(label2);
		midPanel.add(radiusField);
		midPanel.add(label3);
		midPanel.add(lengthField);
		midPanel.add(button);
		this.add(lowPanel);
		lowPanel.add(label4);
		lowPanel.add(areaField);
		lowPanel.add(label5);
		lowPanel.add(volumeField);
		
		
		// Finish setting up the frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(900,167);
		this.setVisible(true);
		//this.pack();   // Size of frame fits the components    	 
 }
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==button){				 
		  System.out.println("Radius Entered: "+radiusField.getText());  
		  System.out.println("Length Entered: "+lengthField.getText());
	      String text = radiusField.getText();
	      String text2 = lengthField.getText();
	      
	      //Calculations
	      int radius = Integer.parseInt(text);
	      int length = Integer.parseInt(text2);
	      double area = (Math.PI)*(radius*radius);
	      double volume = area*length;
	      
	      //console and GUI output
	      System.out.println("Area is: "+area);
	      System.out.println("The volume is: "+volume);
	      areaField.setText(""+area);
	      volumeField.setText(""+volume);
		}
	}

public static void main (String [] args){
	P12b frame = new P12b();
}

}



