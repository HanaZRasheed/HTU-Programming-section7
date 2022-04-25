package oop2;

public class Student {
	int id;
	String name;
	int gpa;
	boolean scholar;
	int availableBalance;
	
	

	
	
	public Student() {
		System.out.println("A student object is created");
	}

	public void printInfo() {
		System.out.println("id \t name \t scholar ");
		System.out.println(id + "\t"+ name +" \t"+ scholar);
	}
	
	public void grantScholarship(int gpa) {
		if(gpa>=95) {
			scholar=true;
		}else {
			scholar=false;
		}
	}
	
	public void canRegister(int coursesNum) {
		int requiredBalance=300*coursesNum;
		System.out.println("the required amount is "+ requiredBalance);
		
		if(requiredBalance<=availableBalance) {
			System.out.println("you can register");
		}else {
			System.out.println("No suffiecient amount to register");
		}
	}
	
	
}
