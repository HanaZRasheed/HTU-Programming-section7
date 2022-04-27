package oop3;

public class EmployeeDemo2 {

	public static void main(String[] args) {
		Employee2 emp1=new Employee2();
		emp1.setId(-1223);
		emp1.setName("Zaid");
		System.out.println(emp1.getId());
		System.out.println(emp1.getName());
		
		Employee2 employee2=new Employee2(1111, "Anas", "SCI", 1000, "Developer", 20);
		

	}

}
