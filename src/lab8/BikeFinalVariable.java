package lab8;

//Q1 Sept 20 Write a Java program to demonstrate the use final keyword with variables

public class BikeFinalVariable {
	final static int speedLimit = 90;
	static void run() {
		System.out.println("Speed limit = "+speedLimit);
	}
	
	public static void main(String[] args) {
		BikeFinalVariable.run();
	} 
}
