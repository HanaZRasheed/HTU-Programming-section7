package demo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class Exercise5a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame("JFrame Demo");

		String[] message = { "Apple", "Banana", "Orange" };
		Random ran = new Random();

		JPanel panel = new JPanel();
		JLabel label = new JLabel(message[ran.nextInt(3)]);

		Icon icon = new ImageIcon("C:\\Users\\hz-95\\eclipse-workspace-2\\event-driven-lab\\src\\demo\\apple.png");
		JButton button1 = new JButton(icon);

		Icon icon2 = new ImageIcon("C:\\Users\\hz-95\\eclipse-workspace-2\\event-driven-lab\\src\\demo\\Orange.png");
		JButton button2 = new JButton(icon2);

		Icon icon3 = new ImageIcon("C:\\Users\\hz-95\\eclipse-workspace-2\\event-driven-lab\\src\\demo\\Banana.png");
		JButton button3 = new JButton(icon3);

		JButton button4 = new JButton("Play again");

		/*
		 * button1.setBounds(50, 50, icon.getIconWidth(), icon.getIconHeight());
		 * button2.setBounds(50, 50, icon.getIconWidth(), icon.getIconHeight());
		 * button3.setBounds(50, 50, icon.getIconWidth(), icon.getIconHeight());
		 */

		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (label.getText().equalsIgnoreCase("Apple")) {
					JOptionPane.showMessageDialog(null, "Bravooo!!!");
				} else {
					JOptionPane.showMessageDialog(null, "Try again");
				}

			}

		});

		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (label.getText().equalsIgnoreCase("Orange")) {
					JOptionPane.showMessageDialog(null, "Bravooo!!!");
				} else {
					JOptionPane.showMessageDialog(null, "Try again");
				}
			}

		});

		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (label.getText().equalsIgnoreCase("Banana")) {
					JOptionPane.showMessageDialog(null, "Bravooo!!!");
				} else {
					JOptionPane.showMessageDialog(null, "Try again");
				}
			}

		});

		button4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				label.setText(message[ran.nextInt(3)]);
			}

		});

		panel.add(label);

		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		frame.add(panel);

		frame.setSize(600, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setLocationRelativeTo(null);

		frame.setVisible(true);

	}

}
