/*
 * Program by Jaison Eccleston
 * 17NOV2022
 * class displays a frame with an image, text. and non default border
 */

package GUI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class p11PartA {
	public static void main(String[] args) {
		//JFRame a GUI window to add components to
		
		// Instantiate the JFrame, ImageIcon, JLabel, BorderFactory objects
		JFrame frame = new JFrame();  // Create a new frame
	    ImageIcon image = new ImageIcon("smallInitial.png");  // This is what picks the image
	    ImageIcon icon= new ImageIcon("smallInitial.png");
	    JLabel label = new JLabel();  // Label can hold string, image or both
	    Border border = BorderFactory.createLineBorder(Color.GREEN, 5);
	    
	    // set the frame size and background color
	    frame.setSize(500,500);   
	    frame.getContentPane().setBackground(Color.GRAY);	
	    
	    // Format the label object: colors, text
	    frame.setTitle("Jaison Eccleston");
	    frame.setIconImage(icon.getImage());
	    label.setText("Jaison");
	    label.setIcon(image); // This is what places the image
	    label.setFont(new Font(Font.DIALOG_INPUT, Font.ITALIC, 24)); // BlueJ does not do this
	    label.setForeground(Color.WHITE);  // Change color of text, font,
	    
	    // Set the text position relative to the image
	    label.setHorizontalTextPosition(JLabel.CENTER);//Set text LEFT,CENTER, or RIGHT of ImageIcon
	    label.setVerticalTextPosition(JLabel.TOP);// TOP, CENTER, or BOTTOM of ImageIcon        
	    
	    // Set position of label (text and image) relative to the frame
	    label.setVerticalAlignment(JLabel.BOTTOM);  // TOP, CENTER, or BOTTOM
	    label.setHorizontalAlignment(JLabel.CENTER); // LEFT, CENTER, or RIGHT
	            
	    // set layout and add components
	    frame.setLayout(new BorderLayout());  // must include this if setting posisitions1
	    frame.add(label);   // Display the label that was created above!
	    
	    // Set up the frame: size, change background color
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes window on exit
	    frame.setVisible(true);
	    
	    //set up the border color and style
	    label.setBorder(border);	   
		}
}
