package arrays;

public class ArrayDemo {

	public static void main(String[] args) {

		// array
		// data type
		// integers
		// size -> 5
		// index 0 -> 4
		// method 1
		int numbers[] = { 1, 2, 3, 4, 5 };
		/*
		 * System.out.println(numbers[0]); System.out.println(numbers[1]);
		 * System.out.println(numbers[2]); System.out.println(numbers[3]);
		 * System.out.println(numbers[4]); System.out.println(numbers);
		 */
		// System.out.println(numbers[5]);

		// method2 -> new keyword for constructing an array
		// initial value zero for integers
		
		// System.out.println(values[0]);
		// System.out.println(values[1]);


		int[] values = new int[5];
		int count = 0;
		
		// values : array of 5 elements
		// i = values[0]// 1
		// i = values[1]  // 2
		for (int i : values) {
			i=count+1;
			System.out.println(i);
			count++;
		}
		
	}
}
