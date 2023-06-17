package Project12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class P12a {
	public static void main (String []args) {
		//declarations
		JFrame frame= new JFrame();
		JPanel leftPanel= new JPanel();
		JPanel rightPanel= new JPanel();
		JLabel leftLabel= new JLabel();
		JLabel rightLabel= new JLabel();
		Border line = BorderFactory.createLineBorder(Color.BLACK, 5);
		Border dash = BorderFactory.createDashedBorder(Color.WHITE);
		ImageIcon image = new ImageIcon("smallInitial.png");

		
		//panel setup
		leftPanel.setBackground(Color.blue);
		leftPanel.setBounds(0, 0, 200, 400);
		leftPanel.setLayout(new BorderLayout());  
	    leftLabel.setVerticalAlignment(JLabel.CENTER); 
	    leftLabel.setHorizontalAlignment(JLabel.CENTER);
		leftLabel.setFont(new Font(Font.DIALOG_INPUT,Font.ITALIC,25));
		leftLabel.setForeground(Color.red);
		leftLabel.setText("Jaison");
		leftPanel.add(leftLabel);
		leftPanel.setBorder(line);

		rightPanel.setBackground(Color.red);
		rightPanel.setBounds(200, 0, 400, 400);
		rightPanel.setLayout(new BorderLayout());  
		rightLabel.setFont(new Font("Times",Font.ITALIC,25));
		rightLabel.setForeground(Color.BLUE);
		rightLabel.setText("My initials");
	    rightLabel.setVerticalAlignment(JLabel.CENTER); 
	    rightLabel.setHorizontalAlignment(JLabel.CENTER);
	    rightLabel.setVerticalTextPosition(JLabel.BOTTOM); 
	    rightLabel.setHorizontalTextPosition(JLabel.CENTER);
		rightPanel.add(rightLabel);
		rightLabel.setIcon(image);
		rightPanel.setBorder(dash);
		
		//frame setup
		frame.setTitle("P12a");
		frame.getContentPane().setBackground(Color.gray);
		frame.add(leftPanel);
		frame.add(rightPanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);  
		frame.setSize(700, 500); 
		frame.setVisible(true);  
	}

}
