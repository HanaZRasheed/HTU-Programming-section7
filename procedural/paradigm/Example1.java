package procedural.paradigm;

public class Example1 {

	public static void main(String[] args) {
		// execution goes here
		// function call
		sayHello();
		int variable1 = 3;
		int variable2 = 4;
		int variable3=6;
	//	int summation = ; // 13
		print(calculateSum(variable1, variable2,variable3));
	

		printSum(variable1, variable2);
		System.out.println(getMessage());
		String msg = getMessage() + "to Zaid"; // Hello message + Zaid
		System.out.println(msg);
		
		checkGrade(49); // fail
		checkGrade(100); // pass
		checkGrade(80); // pass

	}

	// function declaration
	// return data type
	// naming convention for the function : camelCase
	// function name relates to it role
	// parameters
	// local variables
	// num1 = 3
	// num2 = 4
	// takes input and returns output

	public static int calculateSum(int variable1, int varaible2, int variable3) {
		int result = variable1 + varaible2+ variable3; // 3 + 4 -> 7
		return result; // 7
	}

	// return data type: void
	// function declaration
	// num1 =3
	// num2 =4
	public static void printSum(int num1, int num2) {

		System.out.println(num1 + num2);
	}
	
	

	// void return data type, no input
	public static void sayHello() {
		System.out.println("Hello, nice to meet you");
	}

	// function declaration
	// returns String
	// no input
	public static String getMessage() {
		String message = "Hello message";
		return message;
	}

	// using function
	// grade
	// >=50 pass
	// < 50 fail
	// print
	// return data type -> void
	static void checkGrade(int grade) {
		if (grade >= 50) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}
	
	static void print(int value) {
		System.out.println("the result is " + value);
	}
}
