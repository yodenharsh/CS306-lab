package lab12;

public class UsingJoin {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new TheThread(), "T1");
		Thread t2 = new Thread(new TheThread(), "T2");
		Thread t3 = new Thread(new TheThread(), "T3");
		
		t1.start();
		t1.join(2000);
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		System.out.println("Exiting main thread");
	}
}

 class TheThread implements Runnable{

	@Override
	public void run()  {
		System.out.println(Thread.currentThread().getName() +" starting");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " stopped");
	}
	 
 }