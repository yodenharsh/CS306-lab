package lab10;

public class ExceptionClass {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[5] = 3/0;
		}
		catch(Exception e) {System.out.println("Exception caught");}
		//catch(ArithmeticException e) {}
		//catch(IndexOutOfBoundException e){}
	}
}
