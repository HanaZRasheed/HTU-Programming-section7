package demo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Exercise3 {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Login");
		frame.setSize(300,200);
		
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel usrlbl=new JLabel("username");
		JTextField usernameField=new JTextField(20);
				
		JLabel pwslbl=new JLabel("password");
		JPasswordField passwordFld=new JPasswordField(20);
		
		JButton loginBtn=new JButton("login");
		loginBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String username=usernameField.getText();
				String password=new String(passwordFld.getPassword());
				System.out.println(username);
				System.out.println(password);
				if(username.equalsIgnoreCase("admin") && password.equals("123")) {
					JOptionPane.showMessageDialog(null, " You are welcome");
				}
				else {
					JOptionPane.showMessageDialog(null, " Invalid");
				}			
			}
			
		});
		
		frame.add(usrlbl);
		frame.add(usernameField);
		frame.add(pwslbl);
		frame.add(passwordFld);
		frame.add(loginBtn);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		
	}
}

