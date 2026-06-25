package lambda;

public class TestLambda {
	public static void main(String[] args) {
		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("hello lamda_1");
		showMyString(lambdaStr);
	}
	
	public static void showMyString(PrintString p) {
		p.showString("hello lamba_2");
	}
	
	public static PrintString returnString() {
		return s -> System.out.print(s + "World");
	}
}
