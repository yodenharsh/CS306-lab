package lab12;

public class RunVsStart {
	public static void main(String[] args) throws InterruptedException {
		Thread t = new MyThread();
		System.out.println("The thread: "+t.getName()+"\nStarting run method directly");
		t.run();
		System.out.println("Starting user thread and then running main");
		t.start();
		for(int i = 0;i<=5;i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
			Thread.sleep(300);
		}
		System.out.println("Exiting main thread");
	}
}

class MyThread extends Thread {
	
	private Thread t;
	
	public void run() {
	t = Thread.currentThread();
	try {
		for(int i: new int[]{1,2,3,4,5}) {
			System.out.println(t.getName() + ": "+i);
			Thread.sleep(300);
		}
		System.out.println("Exiting child thread");
	}
	catch (InterruptedException e) {
		e.getStackTrace();
	}
	}
}	
