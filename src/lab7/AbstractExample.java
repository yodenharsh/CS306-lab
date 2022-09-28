package lab7;
//Sep 13
//Q1. Write a Java program in which you declare an abstract class Vehicle.
//Classes Car and Truck extend the class Vehicle. Classes Car and Truck 
//Use the method engine to display "Car has good engine" and "Truck has 
//bad engine".

public class AbstractExample {
	public static void main(String[] args) {
		Vehicle []vehicles = {new Truck(),new Car()};
		for(Vehicle vehicle: vehicles) {
			vehicle.engine();
		}
	}
}

abstract class Vehicle {
	public abstract void engine();
}

class Truck extends Vehicle {

	@Override
	public void engine() {
		System.out.println("Truck has a bad engine");
	}
}

class Car extends Vehicle {

	@Override
	public void engine() {
		System.out.println("Car has a good engine");
	}
	
}