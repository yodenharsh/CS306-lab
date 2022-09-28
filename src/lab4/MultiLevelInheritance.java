//Demonstrate multi-level inheritance
package lab4;
public class MultiLevelInheritance {
	public static void main(String[] args) {
		CreamnOnion obj = new CreamnOnion();
		System.out.println("Brand value is: " + obj.brandValue() + " Crores (In INR)");
		if(obj.isTasty())
			System.out.println("Cream and onion flavour is kinda tasty");
	}
}

class Brand{
	Brand(){
		System.out.println("This is a brand");
	}
}

class Lays extends Brand{
	Lays(){
		System.out.println("The brand is Lays");
	}
	public int brandValue() {
		return 6;
	}
}

class CreamnOnion extends Lays{
	CreamnOnion(){
		System.out.println("And the flavour is cream and onion");
	}
	public boolean isTasty() {
		return  true;
	}
}
