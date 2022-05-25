package evebtdriven1;
import javax.swing.*;
public class Demo {
public static void main(String[] args) {
	JFrame frame=new JFrame();
	JLabel label=new JLabel("Welcome to swing");
	label.setBounds(200,40,200,50);
	frame.add(label);

	JTextField txtfld=new JTextField();
	txtfld.setBounds(150,100,200,40);
	frame.add(txtfld);
	
	JButton button=new JButton("Click here");
	button.setBounds(200, 200, 100,40);
	frame.add(button);
	
	JCheckBox checkbox=new JCheckBox("check here");
	checkbox.setBounds(200,250,100,50);
	frame.add(checkbox);
	
	frame.setSize(500,500);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(null); // new FlowLayout
	frame.setVisible(true); // to give you the control
	frame.setLocationRelativeTo(null); // to move the frame to the center
	
	
	
}
}
