package oop2;

public class Car {
	// attributes 
	String color;
	String model;
	String brand;
	int speed;
	int vin;
	
	
	// methods
	// access modifier return data type 
	// method name: naming convention camelCase
	public void startEngine() {
		System.out.println("The car engine has started for " + brand );
	}
	
	
	public void tilt(String direction) {
		if(direction=="left") {
			System.out.println("move to the left");
		}else if(direction=="right") {
			System.out.println("move to the right");
		}
		else {
			System.out.println("not valid direction");
		}
	}

	public void printInfo() {
		System.out.println(color);
		System.out.println(model);
		System.out.println(brand);
		System.out.println(speed);
		System.out.println(vin);
	}

}
