package eventdriven;

import java.awt.*;
import javax.swing.*;

public class Demo1 {

	public static void main(String[] args) {
		// window  // container 
		JFrame frame=new JFrame("My Frame");
		// items in the frame 
		JLabel label=new JLabel("Hello all");
		label.setBounds(150,50,100,40);
		frame.add(label);
		
		JTextField textField= new JTextField(20);
		textField.setBounds(150,80,100,20);
		frame.add(textField);
		
		JButton btn=new JButton("Click here");
		btn.setBounds(150, 120, 100,20);
		frame.add(btn);
		
		JCheckBox checkbox=new JCheckBox("check here",false);
		//checkbox.setText("Check here");
		checkbox.setBounds(200, 150, 100,20);
		frame.add(checkbox);
		// set size width- height
		frame.setSize(400, 400);
		// set visible by default-> false -> to make it visible -> true
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// to put the frame on the center of the window
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setVisible(true);

	}

}
