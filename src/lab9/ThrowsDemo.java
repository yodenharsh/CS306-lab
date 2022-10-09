package lab9;

public class ThrowsDemo {
	static void throwMethod1() throws NullPointerException{
		System.out.println("Inside throwMethod1");
		throw new NullPointerException("throws null pointer exception");
	}
	
	static void throwMethod2() throws ArithmeticException{
		System.out.println("Inside throwMethod2");
		throw new ArithmeticException("throws arithmetic exception");
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		System.out.println("throws "+ThrowsDemo.class.getDeclaredMethod("throwMethod1").getExceptionTypes()[0]);
		System.out.println("throws "+ThrowsDemo.class.getDeclaredMethod("throwMethod2").getExceptionTypes()[0]);
	}
}
