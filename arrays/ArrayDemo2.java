package arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		String [] courses=new String [4];  // 0 1 2 3
		
		courses[0]="Java";
		courses[1]="C programming";
		courses [2]="Maths for computing";
		/*
		for(String course:courses) {
			System.out.println(course);
		}
		*/
		System.out.println(courses.length); // number of elements in the array 
		for(int i=0; i<courses.length; i++) { // 0 
			System.out.println(courses[i]);
		}
	}

}
