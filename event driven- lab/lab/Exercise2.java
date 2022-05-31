package lab;

import javax.swing.JOptionPane;

public class Exercise2 {

	public static void main(String[] args) {
		String name=JOptionPane.showInputDialog("What is your name");
		//System.out.println(name);
		
		
		
		String age=JOptionPane.showInputDialog("what is your age");
		int ageValue=Integer.parseInt(age);
		//System.out.println(ageValue);
		
		JOptionPane.showMessageDialog(null, "Your name is "+ name+ " Your age "+ age);

	}

}
