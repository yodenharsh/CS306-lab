package lab8;

//Prac 2

public class Candy {
	public String taste() {
		return "Tastes sweet";
	}
	public static void main(String []args) {
		Candy c1 = new Candy();
		System.out.println(c1.taste());
		Candy c2 = new Chocolate();
		System.out.println(c2.taste());
	}
}

class Chocolate extends Candy{

	@Override
	public String taste() {
		return "Tastes chocolaty";
	}
	
}
