package packages.util;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter your first name");
	/* String fname=sc.nextLine(); */
	String fname=sc.next();
	System.out.println(fname);
	/*
	 * System.out.println("Please enter your last name"); String
	 * lname=sc.nextLine(); System.out.println("please enter your age"); int
	 * age=sc.nextInt(); System.out.println(lname); System.out.println(fname);
	 * System.out.println(age);
	 * 
	 * System.out.println("please enter a number"); int number=sc.nextInt();
	 * System.out.println(number);
	 */

	}

}
