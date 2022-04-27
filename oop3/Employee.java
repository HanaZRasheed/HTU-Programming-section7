package oop3;

public class Employee {
	// attributes
	int id;
	String name;
	String department;
	double salary;
	String jobTitle;
	int hourRate;

	// id=1222
	// name="Sadeel"
	Employee(int id, String name) {
		//emp2.id=1222
		//emp2.name="Sadeel"
		this.id=id;
		this.name=name;
	}

	// id=12233
	// name="khaled"
	// department="IT"
	Employee(int id, String name, String department) {
		//emp1.id=12233
		//emp1.name="khaled"
		//emp1.department="IT"
		this.id=id;
		this.name=name;
		this.department=department;
	}

	public Employee() {

	}

	public void calculateSalary(int hours) {
		salary = hours * hourRate;

	}
	
	public void printInfo() {
		System.out.println(this.id);
		System.out.println(this.name);
	}
}
