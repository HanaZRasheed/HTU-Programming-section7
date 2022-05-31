package demo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Exercise4 {
	public static void main(String[] args) {
		// frame
		JFrame frame = new JFrame();
		frame.setSize(300, 400);
		frame.setLocationRelativeTo(null);
		// components
		JLabel lbl1 = new JLabel();
		lbl1.setText("number 1");
		lbl1.setBounds(50, 30, 150, 20);
		JTextField textfield1 = new JTextField();
		textfield1.setBounds(50, 50, 150, 20);
		JLabel lbl2 = new JLabel();
		lbl2.setText("number 2");
		lbl2.setBounds(50, 80, 150, 20);
		JTextField textfield2 = new JTextField();
		textfield2.setBounds(50, 100, 150, 20);
		JLabel lbl3 = new JLabel();
		lbl3.setText("result");		
		lbl3.setBounds(50, 130, 150, 20);
		JTextField textfield3 = new JTextField();
		textfield3.setBounds(50, 150, 150, 20);
		textfield3.setEditable(false);
		JButton addBtn = new JButton("+");
		addBtn.setBounds(50, 200, 50, 50);
		addBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = textfield1.getText();
				String s2 = textfield2.getText();
				int number1 = 0;
				int number2 = 0;
				int result = 0;
				if (!s1.equals("") && !s2.equals("")) {
					number1 = Integer.parseInt(s1);
					number2 = Integer.parseInt(s2);
				}
				result = number1 + number2;
				textfield3.setText(result + " ");
				
			}

		});
		
		JButton subBtn = new JButton("-");
		subBtn.setBounds(120, 200, 50, 50);

		subBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = textfield1.getText();
				String s2 = textfield2.getText();
				int number1 = 0;
				int number2 = 0;
				int result = 0;

				if (!s1.equals("") && !s2.equals("")) {
					number1 = new Integer(s1);
					number2 = Integer.parseInt(s2);
				}
				result = number1 - number2;
				textfield3.setText(result + " ");
			}
		});
		frame.add(lbl1);
		frame.add(textfield1);
		frame.add(textfield2);
		frame.add(lbl2);
		frame.add(lbl3);
		frame.add(textfield3);
		frame.add(addBtn);
		frame.add(subBtn);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
