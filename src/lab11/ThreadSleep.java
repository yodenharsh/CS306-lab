package lab11;

public class ThreadSleep extends Thread{
	public static void main(String[] args) {
		Thread t = new ThreadSleep();
		System.out.println("Thread info :"+t);
		t.setName("something");
		System.out.println("Updated thread info :"+t);
		try {
			t.start();
			for(int i = 5;i>=1;i--) {
				System.out.println(t.getName() +": "+i);
				Thread.sleep(500);
				
			}
		}
		catch(InterruptedException e) {e.printStackTrace();}

	}
	@Override
	public void run() {
		System.out.println("Something");
	}
}
