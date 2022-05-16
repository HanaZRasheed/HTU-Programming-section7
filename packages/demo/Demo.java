package packages.demo;
//import java.lang.*; 
public class Demo {
public static void main(String[] args) {
	System.out.println("Hello everybody");
	
	String name1="AOn";
	String name2=new String("Aon");
	String name3=new String("AON");
	System.out.println(name1);
	System.out.println(name2);
	System.out.println(name1==name2); //   -> false
	System.out.println(name2==name3); //   -> false
	System.out.println(name1.equals(name2)); // -> true
	System.out.println(name2.equals(name3)); // -> false
	System.out.println(name2.equalsIgnoreCase(name3));// -> true
	
	String name=name1.toLowerCase(); 
	System.out.println("in small letters "+ name);
	if(name.contains("o")) {
		System.out.println("****");
		System.out.println("contians o");
	}
	
	System.out.println(name.length()); // function
	
	char [] characters=name.toCharArray();
	// length with array attribute
	for(int i=0; i<characters.length;i++) {
		System.out.println(characters[i]);
	}
	
	String message="Hello all nice to meet you";
	String [] words=message.split(" ");
	for(int i=0; i<words.length;i++ ){
	System.out.println(words[i]);	
	}
	
	System.out.println(message.replaceFirst("l", "e"));
}
}
