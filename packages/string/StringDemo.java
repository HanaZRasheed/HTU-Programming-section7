package packages.string;

public class StringDemo {
public static void main(String[] args) {
	String name1="Hana";
	String name2=new String("Hana");
	String name3=new String("hana");
	String name4=new String("Hana");
	String name5="Hana";
	
	
	System.out.println(name2==name1);
	System.out.println(name2==name3);
	System.out.println(name2==name4);
	System.out.println(name1==name5);
	System.out.println(name2.equals(name3));
	System.out.println(name2.equals(name4));
	System.out.println(name2.equals(name5));
	System.out.println("*****************");
	System.out.println(name1.equalsIgnoreCase("hanA"));
	System.out.println("*****************");
	
	// to get letter by letter of a string
	System.out.println(name1.charAt(0));
	System.out.println(name1.charAt(1));
	System.out.println(name1.charAt(2));
	System.out.println(name1.charAt(3));
	
	char [] characters=name1.toCharArray();
	for(int i=0; i<characters.length;i++) {
		System.out.println(characters[i]);
	}
	
	
	// to know the length of a String.
	System.out.println(name1.length());
	// concatenation 
	String name21=name1.concat(" Rasheed");
	System.out.println(name21);
	
	// contains
	System.out.println(name1.contains("an"));
	System.out.println(name1.contentEquals("Hana "));
	System.out.println("********************************************");
	System.out.println(name1.startsWith("H"));
	System.out.println(name1.endsWith("a"));
	// split a sentence into words
	
	String sentence="Hello all nice to meet you";
	String [] words=sentence.split(" ");
	for(int i=0; i<words.length;i++) {
		System.out.println(words[i]);
	}
	
	String string="HANAAAAA";
	System.out.println(string.toLowerCase());
	
}
}
