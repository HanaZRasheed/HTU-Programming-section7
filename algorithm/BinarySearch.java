package algorithm;

public class BinarySearch {

	public static void main(String[] args) {
					//0  1  2  3  4  5  6  7  8   9
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int el = 7;
		// middle ?
		// left
		// right
		int left = 0;
		int right = arr.length - 1;
		// 5 <=9 ? yes
		while (left <= right) {
			int middle = (left + right) / 2; // 4   // 9+5/2 -> 7
			// System.out.println("index "+ middle +" has "+ arr[middle] );

			if (el == arr[middle]) { // 7 == 7 ? yes
				System.out.println("item is found");
				break;
			} else if (el > arr[middle]) { //7 > 8?  no
				left = middle + 1; //left = 4+ 1= 5 [5-9]
				System.out.println("item might be found in the right side ");
			} else if (el < arr[middle]) { // 7<8 ? yes
				right = middle - 1; // 3 [0-3]  right=6
				System.out.println("item might be found in the left side ");
			}

		}
	}

}
