package demo;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.awt.FlowLayout;

public class Exercise7 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("SpongeBob");
		JLabel label = new JLabel();
		ImageIcon happy = new ImageIcon("C:\\Users\\hz-95\\eclipse-workspace-2\\event-driven-lab\\src\\demo\\happy.png");
		ImageIcon sad = new ImageIcon("C:\\Users\\hz-95\\eclipse-workspace-2\\event-driven-lab\\src\\demo\\sad.png");
		ImageIcon mad = new ImageIcon("C:\\Users\\hz-95\\eclipse-workspace-2\\event-driven-lab\\src\\demo\\mad.png");

		label.setIcon(happy);
		frame.add(label);

		label.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {

				label.setIcon(mad);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				label.setIcon(mad);
			}

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				label.setIcon(happy);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				label.setIcon(sad);

			}

		});
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 450);
		frame.setLayout(new FlowLayout());
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}


