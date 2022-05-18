package inheritance.person;

public class Person {
	 String name; // common
	 int age; // common
	 String gender;
	
	 // Polymorphism
	 // overload : in the same class
	 // override :
	 public void eat() {
			System.out.println("person eats food");
		}
	 
	 public void eat(String food) {
			System.out.println("person eats "+ food);
		}

	public Person() {
		System.out.println("Constructor in person class");
	}
	
	 
	 
}
