package packages.demo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// old array
		String[] names=new String[3]; // size must specidfied 
		names[0]="Farah";
		names[1]="Abdelrahman";
		names[2]="Aon";
		
		
		ArrayList <String> arr=new ArrayList<String>();
		arr.add("Farah");
		arr.add("Abdelrahman");
		arr.add("Aon");
		arr.add("Mariam");
		arr.add("Farah");
		arr.add("Abdelrahman");
		arr.add("Aon");
		arr.add("Mariam");
		//arr.remove(0);
		
		for(String item:arr) {
			System.out.println(item);
		}
		
		
	}

}
