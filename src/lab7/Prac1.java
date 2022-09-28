package lab7;
//practice
//Write a method that overloads the talk method by taking a name and printing "Hello" with that name
public class Prac1 {
	public static void talk() {
		System.out.println("Hello there!");
	}
	
	public static void talk(String name) {
		System.out.println("Hello, "+name);
	}
	public static void main(String[] args) {
		talk("Placeholder name");
	}
}
