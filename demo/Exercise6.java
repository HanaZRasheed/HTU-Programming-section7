package demo;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Exercise6 {

	public static void main(String[] args) {
		JFrame frame=new JFrame("word and characters counter");	
		JLabel label1=new JLabel("Words : ");
		label1.setBounds(60,25,100,30);
		JLabel label2=new JLabel("Charcters : ");
		label2.setBounds(200,25,100,30);
		
		JTextArea area= new JTextArea();
		area.setBounds(20,75,350,200);
		
		JButton btn1=new JButton("Count words and characters");
		btn1.setBounds(100, 300, 200, 30);
		
		btn1.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				String content=area.getText();
				String [] words=content.split(" ");
				/*
				 * for(int i=0; i<words.length;i++) { System.out.println(words[i]); }
				 */	
				label1.setText("words : "+ words.length);
				String contentWitoutSpace=content.replace(" ","");
				label2.setText("Charcters : "+ contentWitoutSpace.length());
			
			}
		});
		frame.add(label1);
		frame.add(label2);
		frame.add(area);
		frame.add(btn1);

		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
