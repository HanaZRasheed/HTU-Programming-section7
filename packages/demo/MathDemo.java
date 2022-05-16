package packages.demo;

public class MathDemo {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		int x=20;
		int y=30;
		System.out.println(Math.max(x, y));
		System.out.println(Math.min(x, y));
		int z=-10;
		System.out.println(Math.abs(z)); // -> 20 
		
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.sqrt(16));
		System.out.println(Math.cbrt(27));
		System.out.println(Math.ceil(3.5)); // 3.5 -> 4
		System.out.println(Math.floor(3.5)); // 3.5 -> 3
	
		// Wrapper classes -> Event Driven 
		//int -> Integer
		// float -> Float
		
		String number="20";
		int num=Integer.parseInt(number);
		System.out.println(num+5);
		
		
		
	}

}
