package lab8;

//Write a Java program to demonstrate the use of final keyword with classes

public class FinalMethod extends FinalClassExtended {
	public static void main(String[] args) {
		var FinalClass = new FinalMethod();
		FinalClass.run();
		FinalClass.stop();
	}
	
	final void stop() {
		System.out.println("stop");
	}
}

class FinalClassExtended {
	final void run() {
		System.out.println("run");
	}
}
