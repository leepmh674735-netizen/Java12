package thread;

class MyThread extends Thread{
   public void run() {
	   int i;
	   for (i=0; i<=200; i++) {
		   System.out.println(Thread.currentThread().getName() + ":" + i + "\t");
	   }
   }
}
