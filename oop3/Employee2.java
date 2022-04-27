package oop3;

public class Employee2 {
	// Encapsulation
	private int id;
	private String name;
	private String department;
	private double salary;
	private String jobTitle;
	private int hourRate;
	
	

	public Employee2(int id, String name, String department, double salary, String jobTitle, int hourRate) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.jobTitle = jobTitle;
		this.hourRate = hourRate;
	}

	public Employee2(int id) {
		this.id = id;
	}

	public Employee2(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Employee2() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		// parameter that has the same name of the attribute
		// this refers to the id as attribute
		// shadowing
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getHourRate() {
		return hourRate;
	}

	public void setHourRate(int hourRate) {
		this.hourRate = hourRate;
	}

	public void calculateSalary(int hours) {
		salary = hours * hourRate;

	}

	public void printInfo() {
		System.out.println(this.id);
		System.out.println(this.name);
	}
}
