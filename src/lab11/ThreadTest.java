//Write a Java program in which a thread sleeps for 

package lab11;

public class ThreadTest extends Thread {
	static {
		Thread t = Thread.currentThread();
		System.out.println("Default name of thread: "+t.getName());
		t.setName("a thread");
		System.out.println("Sleeping for 3s");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("Current name of thread: "+t.getName());
	}
}
