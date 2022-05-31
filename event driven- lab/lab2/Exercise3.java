package lab2;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Exercise3 {

	public static void main(String[] args) {
	JFrame frame=new JFrame("spongebob");
	
	
	ImageIcon happy = new ImageIcon("C:\\Users\\hz-95\\eclipse-workspace-2\\event-driven-lab\\src\\happy.png");
	ImageIcon sad = new ImageIcon("C:\\Users\\hz-95\\eclipse-workspace-2\\event-driven-lab\\src\\sad.png");
	ImageIcon mad = new ImageIcon("C:\\Users\\hz-95\\eclipse-workspace-2\\event-driven-lab\\src\\mad.png");
	
	JLabel label=new JLabel();
	label.setIcon(happy);
	frame.add(label);
	
	label.addMouseListener(new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent e) {
			label.setIcon(mad);
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
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

	
	
	frame.setLayout(new FlowLayout());
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(500,450);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);

	}

}
