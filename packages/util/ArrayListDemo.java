package packages.util;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> array=new ArrayList<String>();
		array.add("Ahmad");
		array.add("Khaled");
		array.add("Farah");
		
		ArrayList<String> arr2=new ArrayList<String>();
		arr2.add("saif");
		arr2.add("jana");
		arr2.add("Mohammad");
		
		boolean result=array.contains("Ahmad1");
		
		array.addAll(2, arr2);
		System.out.println(result);
		
		for(String name:array) {
			System.out.println(name);
		}
		
	

	}

}
