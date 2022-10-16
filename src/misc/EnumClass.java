package misc;

enum Apple{
	Jonathan(10), GoldenDel(20);
	private int price;
	Apple(int p){price = p;}
	int getPrice() {return price;}
}

public class EnumClass {
	public static void main(String[] args) {
		Apple ap;
		System.out.println(Apple.valueOf("Jonathan"));
	}
}
