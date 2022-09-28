package lab6;

/*Q3.. Write a Java program to generate an abstract class A and also class B which inherits
class A. Create an object for class B and display the text "Call me from B".*/ 

public class AbstractExample {
	public static void main(String[] args) {
		A b = new B();
		b.call();
	}
}

abstract class A {
	abstract void call();
}

class B extends A {

	@Override
	public void call() {
		System.out.println("Call me from B");
	}
}
