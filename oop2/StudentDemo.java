package oop2;

public class StudentDemo {

	public static void main(String[] args) {
		Student student=new Student();
		student.id=2020892;
		student.name="Karam";
		student.gpa=96;
		student.availableBalance=900;
		
		student.printInfo();
		student.grantScholarship(student.gpa);
		student.printInfo();
		
		student.canRegister(3);

	}

}
