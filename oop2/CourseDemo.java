package oop2;

public class CourseDemo {
	public static void main(String[] args) {

		// constructor 
		// a deeper look into constructors
		
		Course course1=new Course(1, "programming");
		
		Course course2=new Course();
		
		Course course3=new Course(2);
		
		course1.printInfo();
		course2.printInfo();
		course3.printInfo();
	}
}
