package algorithm;

public class LinearSearch2 {

	public static void main(String[] args) {
		int [] arr= {1,2,3,5,5,5,7,8};
		int el=9;
		//boolean found=false;
		int counter=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==el) {
				//found=true;
				counter++;
				System.out.println("found at position "+ i);
				// break;
			}
		}
		if(counter>0) {
		System.out.println("item is found "+ counter +" times ");
		}else {
			System.out.println("item is not found");
		}
	}

}
