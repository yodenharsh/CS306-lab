package misc;

//Q1. Start t1. Make t1 to join with 2000ms. Start t2. Make sure t2 is completed and t3 starts. Make sure t1,t2 and t3 are all done before exiting main thread

public class ThreadSyncDemo {
	public static void main(String args[]) throws InterruptedException{
		Thread t1 = new Thread(new aRunnable(), "t1");
		Thread t2 = new Thread(new aRunnable(), "t2");
		Thread t3 = new Thread(new aRunnable(), "t3");
		
		t1.start();
		t1.join(2000);
		t2.start();
		t2.join();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		System.out.println("Main thread exits here");
	}
}

class aRunnable implements Runnable{
	public void run(){
	System.out.println("Starting: " + Thread.currentThread().getName());
	try{
		Thread.sleep(4000);
	}
	catch (InterruptedException e){ e.printStackTrace();}
	System.out.println("Exiting: " + Thread.currentThread().getName());
}
}