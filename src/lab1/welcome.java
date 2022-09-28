package lab1;

public class welcome {
	public static void main(String args[]) {
		System.out.println("welcome to the world of java");
		welcome obj = new welcome();
		System.out.println(obj.method1(54));
		System.out.println(obj.method1("bs"));
	}

	public int method1(int a) {
		return a + 2;
	}

	public String method1(String a) {
		return a;
	}
}
