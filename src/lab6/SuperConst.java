package lab6;

//Q2. Write a Java program to demonstrate the use of super keyword with constructors 

public class SuperConst {
	public static void main(String[] args) {
		var square = new Square(3);
		System.out.println(square.area());
	}
}

class fourSidedShape {
	private int length;
	private int breadth;
	fourSidedShape(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	public int area() {
		return length * breadth;
	}
}

class Square extends fourSidedShape {
	Square(int len){
		super(len,len);
	}
}
