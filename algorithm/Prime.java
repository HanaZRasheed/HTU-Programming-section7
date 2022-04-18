package algorithm;

public class Prime {

	public static void main(String[] args) {
		int number = 10;

		boolean flag = false;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {

				flag = true;
				break;
			}
		}

		if (flag == false) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}

	}

}
