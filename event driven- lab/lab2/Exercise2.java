package lab2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Exercise2 {
public static void main(String[] args) {
	JFrame frame=new JFrame("words and characters counter");
	
	JLabel label1=new JLabel("words:  ");
	label1.setBounds(60, 25, 100,30);
	
	JLabel label2=new JLabel("characters:  ");
	label2.setBounds(200, 25, 100,30);
	
	JTextArea area=new JTextArea();
	area.setBounds(20, 75, 350, 200);
	
	JButton btn=new JButton("count words and characters");
	btn.setBounds(100,300,200,30);
	btn.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			String content=area.getText();
			String [] words=content.split(" ");
			
			label1.setText("words:  "+ words.length);
			
			String contentWitoutSpace=content.replace(" ", "");
			System.out.println(contentWitoutSpace);
			label2.setText("charcters:  "+contentWitoutSpace.length());
		
		}
		
	});
	frame.add(label1);
	frame.add(label2);
	frame.add(area);
	frame.add(btn);
	frame.setLayout(null);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(400,400);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
	
}
}
