//Write a Java program to create a class bird
//Which also declares different parameterized constructors
//To display the name of birds
package lab4;

@SuppressWarnings("unused")
public class Bird {
	private String birdName;
	private int age;

	Bird() {
		this("Parrot");
	}

	Bird(String x) {
		System.out.println("Name of bird: " + x);
	}

	Bird(String x, int age) {
		System.out.println("Name of bird: " + x + ",\tAge: " + age);
	}

	public static void main(String args[]) {
		Bird b1 = new Bird();
		Bird b2 = new Bird("Duck");
		Bird b3 = new Bird("Kiwi", 26);
	}
}
