package eventdriven;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

// 2- adding listeners and handeling events
public class Demo2 {

	static String name;

	public static void main(String[] args) {
		// container
		JFrame frame = new JFrame("Frame 2");

		frame.setLayout(null);

		// components
		// label
		JLabel label = new JLabel("Enter Your name");
		label.setBounds(100, 100, 100, 50);
		frame.add(label);

		JTextField txtField = new JTextField();
		txtField.setBounds(100, 150, 100, 30);
		txtField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		frame.add(txtField);

		JButton btn = new JButton("click here");
		btn.setBounds(100, 200, 100, 30);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// System.out.println("Hello "+txtField.getText());
				// label.setText("Hello "+ txtField.getText());
				name = txtField.getText();
				// System.out.println("****name retreived from text field "+ name);
				JOptionPane.showMessageDialog(null, "Nice to meet you " + name);

			}

		});

		btn.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseMoved(MouseEvent e) {
				System.out.println("Mouse moved");
			}

			@Override
			public void mouseDragged(MouseEvent e) {
				// System.out.println("Mouse draged");
				btn.setBounds(e.getXOnScreen(), e.getYOnScreen(), 100, 30);
				System.out.println("x " + e.getXOnScreen());
				System.out.println("y " + e.getYOnScreen());

			}
		});

		btn.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("Mouse released");

			}

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("Mouse pressed");
				btn.setBackground(Color.blue);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("Mouse Exited");
				btn.setBackground(Color.red);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("Mouse entered");
				btn.setBackground(Color.green);

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Mouse Clicked");
			}
		});

		frame.add(btn);

		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

	}

}
