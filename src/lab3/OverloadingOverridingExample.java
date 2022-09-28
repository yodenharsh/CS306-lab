package lab3;

public class OverloadingOverridingExample {
	public static void main(String args[]) {
		anotherClass obj = new anotherClass();
		System.out.println(obj.add(3, 45));// int
		System.out.println(obj.add(31.1, 44.24));// double
		System.out.println(obj.add("for", "each"));// String
		@SuppressWarnings(value = { "unused" })
		anotherClass obj2 = new anotherClass(23, 23);
	}
}

class anotherClass {
	public int add(int a, int b) {
		return a + b;
	}

	public double add(double a, double b) {
		return a + b;
	}

	public String add(String a, String b) {
		return a + b;
	}
	@SuppressWarnings(value = { "unused" })
	private int a, b;

	anotherClass() {
		System.out.println("a and b are not set");
	}

	anotherClass(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("a and b are set to " + a + " " + b + ",respectively");
	}
}
