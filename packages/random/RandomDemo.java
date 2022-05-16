package packages.random;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
	Random random= new Random();
	int randomValue=1+random.nextInt(5); // 0 Inclusive the specified number Exclusive
	System.out.println(randomValue);
	}

}
