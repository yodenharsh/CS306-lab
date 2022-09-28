package lab2;

public class Student {
	public static void main(String args[]) {
		Student s1 = new Student("Harsh", "Navi Mumbai", (short) 18);
		Student s2 = new Student("Rahil", "Bhopal", (short) 19);
		s1.printData();
		s2.printData();
	}

	Student(String name, String city, short age) {
		this.name = name;
		this.city = city;
		this.age = age;
	}

	private String name, city;
	private short age;

	public void printData() {
		System.out.println("Name = " + name + "\nCity = " + city + "\nAge = " + age);
		System.out.println("---------------------");
	}
}
