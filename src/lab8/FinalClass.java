package lab8;

final class OtherClass {
	void run() {
		System.out.println("run");
	}
}

public class FinalClass  //extends FinalClass  (doesn't work)
{
	public static void main(String[] args) {
		(new OtherClass()).run();
	}
}
