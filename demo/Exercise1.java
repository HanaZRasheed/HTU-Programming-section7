package demo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Exercise1 {

	public static void main(String[] args) {
		// Window
		JFrame frame = new JFrame("JButton Demo");
		
		// Components
		JButton btn1 = new JButton("Button 1");
		JButton btn2 = new JButton("Button 2");
		JButton btn3 = new JButton("Button 3");

		Font font = new Font("Arial", Font.BOLD, 16);

		btn1.setFont(font);
		btn2.setFont(font);
		btn3.setFont(font);

		btn1.setForeground(Color.MAGENTA);
		btn1.setBackground(Color.DARK_GRAY);

		btn2.setForeground(Color.BLUE);
		btn2.setBackground(Color.DARK_GRAY);

		btn3.setForeground(Color.GREEN);
		btn3.setBackground(Color.DARK_GRAY);

		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);

		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}
}

