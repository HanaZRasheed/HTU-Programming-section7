package lab2;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Exercise1 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("JFrame demo");

		String[] message = { "Apple", "Banana", "Orange" };
		Random ran = new Random();

		String randomLabel = message[ran.nextInt(3)];
		JLabel label = new JLabel(randomLabel);

		Icon icon = new ImageIcon("D:\\source\\HTU\\HTU- Fall 2021-2022\\programming\\lab\\apple.png");
		JButton button1 = new JButton(icon);
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(label.getText().equalsIgnoreCase("Apple")) {
					JOptionPane.showMessageDialog(null, "Bravoooo!!!");
				}
				else {
					JOptionPane.showMessageDialog(null, "try again");
				}
			}
			
		});
		
		Icon icon2 = new ImageIcon("D:\\source\\HTU\\HTU- Fall 2021-2022\\programming\\lab\\orange.png");
		JButton button2 = new JButton(icon2);
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(label.getText().equalsIgnoreCase("Orange")) {
					JOptionPane.showMessageDialog(null, "Bravoooo!!!");
				}
				else {
					JOptionPane.showMessageDialog(null, "try again");
				}
			}
			
		});

		Icon icon3 = new ImageIcon("D:\\source\\HTU\\HTU- Fall 2021-2022\\programming\\lab\\Banana1.png");
		JButton button3 = new JButton(icon3);
		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(label.getText().equalsIgnoreCase("Banana")) {
					JOptionPane.showMessageDialog(null, "Bravoooo!!!");
				}
				else {
					JOptionPane.showMessageDialog(null, "try again");
				}
			}
			
		});
		JButton button4 = new JButton("Play Again");
		button4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
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
		frame.setLayout(new FlowLayout());
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

}
