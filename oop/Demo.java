package oop;

public class Demo {

	public static void main(String[] args) {
		/*int id=211190;
		String name="Khaled";
		String major="Computer Science";
		double gpa=3.9;
		
		
		int id2=2111987;
		String name2="Rezeq";
		String major2="Computer Science";
		double gpa2=3.8;
		
		*/
		// construction of an Object
		Student student1=new Student();
		student1.id=211190;
		student1.name="khaled";
		student1.major="cs";
		student1.gpa=3.9;
		student1.email="khaled@gmail.com";
		
		System.out.println("student 1 id is "+ student1.id);
		System.out.println("student 1 name is "+ student1.name);
		System.out.println("student 1 major is "+ student1.major);
		System.out.println("student 1 gpa is "+ student1.gpa);
		System.out.println("student 1 email is "+ student1.email);
		System.out.println("********************************");
		
		
		Student student2=new Student();
		student2.id=2111989;
		student2.name="Rezeq";
		student2.major="Data science";
		student2.gpa=3.8;
		student2.email="Rezeq@gmail.com";
	
		System.out.println("student 2 id is "+ student2.id);
		System.out.println("student 2 name is "+ student2.name);
		System.out.println("student 2 major is "+ student2.major);
		System.out.println("student 2 gpa is "+ student2.gpa);
		System.out.println("student 2 email is "+ student2.email);
		
		
		Student student3=new Student();
		System.out.println(student3.id);
		System.out.println(student3.name);
		System.out.println(student3.major);
		System.out.println(student3.gpa);
		student3.id=1222;
		System.out.println(student3.id);
		System.out.println(student3.grad); 
		student3.grad=true;
		System.out.println(student3.grad); 
		
		// 1- Construction of an object
		Student student4=new Student();
		// student4 
		// id
		// name
		// major
		// gpa
		//email
		// grad
		
		// 2- assign values to student4 attributes
		student4.id=122344;
		student4.name="Abdelrahman";
		student4.major="cyber security";
		student4.gpa=3.79;
		student4.email="abd@gmail.com";
		student4.grad=false;
		
		System.out.println("Id "+ student4.id +" name "+ student4.name +" major "+
		student4.major+ " gpa "+ student4.gpa);
		
		
		
	
		
		

	}

}
