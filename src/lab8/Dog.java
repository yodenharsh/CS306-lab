package lab8;

//Prac 1

public class Dog {
	private String name;
	public Dog(String name) {
		this.name = name;
	}
	
	public boolean equals(Dog dog) {
		return dog.name.equals(name)? true:false;
	}
	public static void main(String[] args) {
		Dog d1 = new Dog("Rufus");
		Dog d2 = new Dog("Sally");
		Dog d3 = new Dog("Rufus");
		Dog d4 = d3;
		
		System.out.println(d1.equals(d2));
		System.out.println(d3.equals(d2));
		System.out.println(d1.equals(d3));
		System.out.println(d3.equals(d4));
	}
}