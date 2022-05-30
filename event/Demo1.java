package event;

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

public class Demo1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello");
		JTextField txtField = new JTextField(100);
		txtField.setBounds(200, 50, 100, 50);
		frame.add(txtField);
		txtField.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() == e.VK_ENTER) {
					System.out.println("enter");
				}

			}

			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println(txtField.getText());

			}

			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println(e.getKeyChar());
				System.out.println(e.getKeyCode());

			}
		});

		JButton btn = new JButton("click here!");
		btn.setBounds(200, 150, 100, 50);
		frame.add(btn);

		JLabel label = new JLabel();
		label.setBounds(200, 200, 100, 100);
		frame.setLayout(null);
		frame.add(label);

		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btn.setBackground(Color.orange);
				label.setText("btn is clicked");
				JOptionPane.showMessageDialog(null,"Hello Nice to meet you");

			}
		});

		btn.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseMoved(MouseEvent e) {
				// System.out.println("Mouse moved");

			}

			@Override
			public void mouseDragged(MouseEvent e) {
				btn.setBounds(e.getXOnScreen(), e.getYOnScreen(), 100, 50);

			}
		});

		frame.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("mouse released");
			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		frame.setSize(500, 500);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setLayout(null);
		String name = JOptionPane.showInputDialog("please enter your name");
		System.out.println(name);
		
		
	
	}
}
