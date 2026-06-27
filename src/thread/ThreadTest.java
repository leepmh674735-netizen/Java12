package thread;

public class ThreadTest {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());

		MyThread thread1 = new MyThread();
		thread1.start();

		MyThread thread2 = new MyThread();
		thread2.start();

		System.out.println("end");
	}
}
