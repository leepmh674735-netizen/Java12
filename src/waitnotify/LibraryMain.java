package waitnotify;

import java.util.ArrayList;

class Library {
	private ArrayList<String> shelf = new ArrayList<>();

	public Library() {
		shelf.add("태백산맥 1");
		shelf.add("태백산맥 2");
		shelf.add("태백산맥 3");
		shelf.add("태백산맥 4");
		shelf.add("태백산맥 5");
		shelf.add("태백산맥 6");
		shelf.add("태백산맥 7");
	}
	
	public synchronized String lendBook() throws InterruptedException {
		Thread t = Thread.currentThread();
		while (shelf.size() == 0) {
			System.out.println(t.getName() + " waiting start");
			wait();
			System.out.println(t.getName() + " waiting end");
		}
		String book = shelf.remove(0);
		System.out.println(t.getName() + ": " + book + " lend");
		return book;
	}
	
	public synchronized void returnBook(String book) {
		Thread t = Thread.currentThread();
		shelf.add(book);
		System.out.println(t.getName() + ": " + book + " return");
		notifyAll();
	}
}

class Student extends Thread {
	public void run() {
		try {
			 String title = LibraryMain.library.lendBook();
			 Thread.sleep(5000);
			 LibraryMain.library.returnBook(title);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class LibraryMain {
	public static Library library = new Library();
	
	public static void main(String[] args) {
		Student stud1 = new Student();
		Student stud2 = new Student();
		Student stud3 = new Student();
		Student stud4 = new Student();
		Student stud5 = new Student();
		Student stud6 = new Student();
		
		stud1.start();
		stud2.start();
		stud3.start();
		stud4.start();
		stud5.start();
		stud6.start();
	}
}