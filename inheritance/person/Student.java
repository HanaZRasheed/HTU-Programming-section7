package inheritance.person;

// student is a person ? -> Inheritance
public class Student extends Person {


int studentId;
String major;
double gpa;


public void doExam() {
	System.out.println("student does exams");
}


public Student() {
	System.out.println("constructor in student class");
}


}
