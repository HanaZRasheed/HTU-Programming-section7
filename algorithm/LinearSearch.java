package algorithm;

public class LinearSearch {

	public static void main(String[] args) {
		int [] arr= {1,2,3,5,5,5,7,8};
		int el=2;
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==el) {
				found=true;
				break;
			}
		}
		if(found) {
		System.out.println("item is found");
		}else {
			System.out.println("item is not found");
		}
	}

}
