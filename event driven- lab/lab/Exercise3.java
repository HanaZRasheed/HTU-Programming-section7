package lab;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise3 {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Login");
		frame.setSize(300,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		
		// add components
		JLabel userNameLabel=new JLabel("username");
		JTextField userNameField=new JTextField(20);
		
		JLabel passwordLabel=new JLabel("password");
		JPasswordField passField=new JPasswordField(20);
		
		JButton loginButton=new JButton("Login");
		loginButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String username=userNameField.getText();
				
				String password=new String(passField.getPassword());
				System.out.println(username);
				System.out.println(password);
				
				if(username.equalsIgnoreCase("admin") && password.equals("123"))
				{
					JOptionPane.showMessageDialog(null, "Logged in successfully");
				}
				else {
					JOptionPane.showMessageDialog(null, "username or password is invalid ");
				}
			}
			
		});
		
		frame.add(userNameLabel);
		frame.add(userNameField);
		frame.add(passwordLabel);
		frame.add(passField);
		frame.add(loginButton);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);

	}

}
