package misc;

public class ThreadQuestion {
	public static void main(String[] args) {
		Thread []t = {new theThread(1,100), new theThread(100,1)};
		t[0].start();
		t[1].start();
	}
}

class theThread extends Thread{
	
	int start,end;
	
	theThread(int start, int end){
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		if(start<end) 
			for(int i = start;i<=end;i++)
				System.out.println(i);	
		else
			for(int i = start;i>=end;i--)
				System.out.println(i);
	}
}
