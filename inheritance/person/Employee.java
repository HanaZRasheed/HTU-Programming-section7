package inheritance.person;

// employee is a person ? -> Inheritance
public class Employee extends Person {
 int empId;
 String jobTitle;
 double salary;

 
 public void work() {
	 System.out.println("Employee works");
 }
  
 public Employee() {
	 System.out.println("Constructor in Employee class");
 }
 
 // override 
 // method in parent class
 // Overridden in child class "different implementation" 
 public void eat() {
	 super.eat();
	 System.out.println("Employee eats spicy food");
 }
}
