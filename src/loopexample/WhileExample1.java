package loopexample;

public class WhileExample1 {
	public static void main(String[] args) {
		int num = 1;
		int sum = 1;
		
		while (num <= 10) {
			sum += num;
			num++;
		}
		System.out.println("1부터 10까지 합은" + sum + "입니다.");
	}
}
