package oop2;

public class Course {
	int id;
	String name;

	public void printInfo() {
		System.out.println(id);
		System.out.println(name);
	}

	// constructor
	public Course(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("course object is created with two arguments");
	}

	public Course() {
		System.out.println("course object is created with no arguments");
	}

	public Course(int i) {
		this.id = i;
		System.out.println("course object is created with one argument");
	}

}
