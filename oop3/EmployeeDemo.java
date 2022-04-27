package oop3;

public class EmployeeDemo {

	public static void main(String[] args) {
	Employee emp1=new Employee(12233, "khaled","IT");
	/*
	 * emp1.id=123; emp1.name="Khaled"; emp1.hourRate=20;
	 */
	
	emp1.printInfo();
	emp1.calculateSalary(10);
	System.out.println(emp1.salary);
	
	Employee emp2=new Employee(1222, "Sadeel");
	emp2.printInfo();
	
	}

}
