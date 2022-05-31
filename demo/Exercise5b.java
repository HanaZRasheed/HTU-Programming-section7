package demo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class Exercise5b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame("JFrame Demo");

		String[] message = { "Apple", "Banana", "Orange" };
		Random ran = new Random();

		JLabel label = new JLabel(message[ran.nextInt(3)]);

		Icon icon = new ImageIcon("D:\\source\\HTU\\HTU- Fall 2021-2022\\programming\\lab\\apple.png");
		JButton button1 = new JButton(icon);

		Icon icon2 = new ImageIcon("D:\\source\\HTU\\HTU- Fall 2021-2022\\programming\\lab\\orange.png");
		JButton button2 = new JButton(icon2);

		Icon icon3 = new ImageIcon("D:\\source\\HTU\\HTU- Fall 2021-2022\\programming\\lab\\Banana1.png");
		JButton button3 = new JButton(icon3);

		JButton button4 = new JButton("Play again");

		button1.setBounds(80, 35, icon.getIconWidth(), icon.getIconHeight());
		button2.setBounds(200, 35, icon.getIconWidth(), icon.getIconHeight());
		button3.setBounds(330, 35, icon.getIconWidth(), icon.getIconHeight());
		button4.setBounds(450, 50, 100, 30);
		label.setBounds(30, 50, 100, 50);
		

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

		frame.add(label);

		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
	

		frame.setSize(600, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);

		frame.setVisible(true);

	}

}
