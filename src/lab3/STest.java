package lab3;

public class STest {
	public static void main(String[] args) {
		Student2 s1 = new Student2(4, 5);
		Student2 s2 = new Student2();

		s1.setData("Harsh", "Bombay", 18);
		s2.setData("Vedant", "Nagpur", 19);

		s1.printData();
		s2.printData();
	}
}

class Student2 {
	private String name, city;
	private int age;

	Student2() {

	}

	Student2(int a, int b) {
		System.out.println("a and b SET");
	}

	public void setData(String name, String city, int age) {
		this.name = name;
		this.city = city;
		this.age = age;
	}

	public void printData() {
		System.out.println("Name = " + name);
		System.out.println("City = " + city);
		System.out.println("Age = " + age);
	}
}
