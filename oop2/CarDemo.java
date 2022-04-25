package oop2;

public class CarDemo {

	public static void main(String[] args) {
		// 1- Constructing object of the class
		Car car1=new Car();
		
		car1.color="black";
		car1.model="2021";
		car1.brand="BMW";
		car1.speed=200;
		car1.vin=12333490;
		
		
		
		// call the method
		car1.startEngine();
		
		
		car1.tilt("forward");
		
		car1.printInfo();
		
		
		Car car2=new Car();
		car2.color="white";
		car2.brand="Toyota";
		car2.model="2022";
		car2.speed=180;
		car2.vin=56666;
		
		car2.startEngine();
		
		car2.tilt("left");
		
		car2.printInfo();

	}

}
