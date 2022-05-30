package eventdriven;

import javax.swing.JOptionPane;

// JOptionPane class
public class Demo3 {

	public static void main(String[] args) {
	
	
	// to take an input from the user
	String name=JOptionPane.showInputDialog("please enter your name");
	JOptionPane.showMessageDialog(null, "Nice to meet you "+ name);
	
	int grade=Integer.parseInt(JOptionPane.showInputDialog("please enter your age"));
	int result=grade*2;
	System.out.println(result);
	
	int number=12;
	String num=String.valueOf(number); 
	System.out.println(num);
	String num2=number+"";
	
	}

}
