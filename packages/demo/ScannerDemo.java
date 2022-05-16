package packages.demo;

import java.util.Scanner;
import java.util.ArrayList;


public class ScannerDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter your age");
	int age=sc.nextInt();
	sc.nextLine();
	System.out.println("Please enter your name");
	String name=sc.nextLine();
	System.out.println("Welcome "+ name);
	System.out.println("Your age is "+ age);
}
}
