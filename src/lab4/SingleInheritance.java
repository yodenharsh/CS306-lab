//Write a Java program to demonstrate single inheritance
package lab4;

public class SingleInheritance {
	public static void main(String args[]) {
	@SuppressWarnings("unused")
	father obj = new father();
	}
}

class human{
	human(){
		System.out.println("I am human");
	}
}

class father extends human{
	father(){
		System.out.println("and I am a father");		
	}
}
