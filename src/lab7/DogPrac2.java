package lab7;
//Practice
//Edit this code so the class beagle is a subclass of the DogPrac2
//class, when you run the code it should print "Woof!" and
//then "Arf arf"
public class DogPrac2 {
	public void speak() {
		System.out.println("woof!");
	}
	
	public static void main(String[] args) {
		DogPrac2 d = new DogPrac2();
		d.speak();
		DogPrac2 b = new Beagle();
		b.speak();
	}
}

class Beagle extends DogPrac2{
	public void speak() {
		System.out.println("arf arf");
	}
}
