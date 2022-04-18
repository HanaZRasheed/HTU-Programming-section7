package algorithm;

public class BinarySearch2 {

	public static void main(String[] args) {
					//0  1  2  3  4  5  6  7 8   9
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int el = 2;
		// middle ?
		// left
		// right
		int left = 0;
		int right = arr.length - 1;
		// left=0 <= right= 3
		// 0<=3 
		// middle = 0+3/2 = 3/2 =1
		// middle =1
		while (left <= right) {
			int middle = (left + right) / 2; // 4
			// System.out.println("index "+ middle +" has "+ arr[middle] );

			if (el == arr[middle]) { // 2==5 ? no // 2==2 ? yes 
				System.out.println("item is found");
				break;
			} else if (el > arr[middle]) { //2> 5? no 
				left = middle + 1;
				System.out.println("item might be found in the right side ");
			} else if (el < arr[middle]) { // 2<5 ?? yes
				right = middle - 1; // 3 [0-3]
				System.out.println("item might be found in the left side ");
			}

		}
	}

}
