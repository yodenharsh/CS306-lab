package lab11;

public class ThreadDemo {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		NewThread childThread = new NewThread("Some name");
		try {
			for(int i = 3;i>=1;i--) {
				System.out.println("Main thread: "+i);
				Thread.sleep(200);
			}
		} catch(InterruptedException e) { e.printStackTrace();}
		System.out.println("Exiting main thread");
	}
}

class NewThread implements Runnable{
	private Thread t;
	
	NewThread(String name){
		t = new Thread(this,name);
		System.out.println("Child thread: "+t);
		t.start();
	}
	
	@Override
	public void run() {
		try {
			for(int i = 3;i>=1;i--) {
				System.out.println("Child thread: "+i);
				Thread.sleep(500);
			}
		} catch(InterruptedException e) { e.printStackTrace();}
		System.out.println("Exiting child thread");
	}
	
}
