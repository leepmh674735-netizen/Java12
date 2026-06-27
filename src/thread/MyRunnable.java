package thread;

public class MyRunnable implements Runnable {
	
	@Override
	public void run() {
		int i;
		for (i=0; i<=200; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i +"\t");
		}
	}
}
