package expection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandleline1 {
	public static void main(String[] args) {
		try {
			FileInputStream fis  = new FileInputStream("a.text");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("여기서도 수행됩니다.");
	}
}
