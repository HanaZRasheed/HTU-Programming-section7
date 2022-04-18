package overload;

public class OverLoad {
	
	// function declaration
	public static int calculateSum(int num1) {
		System.out.println("method 1");
		return num1+5;
	}
	
	public static float calculateSum(float num1) {
		System.out.println("method 1- float ");
		return num1+5;
	}
	
	public static int calculateSum(int num1, int num2) {
		System.out.println("method 2");
		int result=num1+num2;
		return result;
	}
	
	
	public static int calculateSum(int num1, int num2, int num3) {
		System.out.println("method 3");
		return num1+num2+num3;
	}

	public static void main(String[] args) {
		int result=calculateSum(10);
		System.out.println(result);
		
	System.out.println(calculateSum(20,30));
	System.out.println(calculateSum(40,50,10));
	System.out.println(calculateSum(3.0f));


	}

}
