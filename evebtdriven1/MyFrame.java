package evebtdriven1;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame {

	MyFrame() {
		JFrame frame = new JFrame();
		JLabel label = new JLabel("Welcome to swing");
		label.setBounds(20, 40, 200, 50);
		frame.add(label);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true); // to give you the control
	}
}
