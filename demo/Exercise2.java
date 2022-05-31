package demo;


import javax.swing.JOptionPane;

public class Exercise2 {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("What is your name? "); 
		System.out.println(name);

		String age = JOptionPane.showInputDialog("What is your age?");
		int ageValue = Integer.parseInt(age); 
		System.out.println(ageValue);

		JOptionPane.showMessageDialog(null, "My name is  " + name + " I am " + age + " years old");

	}

}




