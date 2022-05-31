package lab;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class Exercise1 {

	public static void main(String[] args) {
	
		JFrame frame=new JFrame();
        frame.setTitle("JButton Demo");
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        
        JButton btn1=new JButton("Button 1");
        JButton btn2=new JButton("Button 2");
        JButton btn3=new JButton("Button 3");
        
        Font font=new Font("Arial",Font.BOLD,16);
        
        btn1.setFont(font);
        btn2.setFont(font);
        btn3.setFont(font);
        
        btn1.setForeground(Color.MAGENTA);
        btn1.setBackground(Color.DARK_GRAY);
        
        btn2.setForeground(Color.BLUE);
        btn2.setBackground(Color.DARK_GRAY);
        
        btn3.setForeground(Color.GREEN);
        btn3.setBackground(Color.DARK_GRAY);
     
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.setLayout(new FlowLayout());
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
	}

}
