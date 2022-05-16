package packages.math;

public class MathDemo {

	public static void main(String[] args) {
		double pi=Math.PI;
		System.out.println(pi);
		
		System.out.println(Math.round(Math.PI));
		System.out.println(Math.abs(-2));
		System.out.println(Math.abs(-2.5));
		System.out.println(Math.sqrt(25));
		System.out.println(Math.cbrt(27));
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.ceil(3.7));
		System.out.println(Math.floor(3.7));
		System.out.println(Math.max(10, 20));
		System.out.println(Math.min(10, 20));
		
		System.out.println(Math.sin(90));
		System.out.println(Math.cos(90));
		
		System.out.println(Math.signum(20)); // 1 if positive -1 if negative 
		

	}

}
