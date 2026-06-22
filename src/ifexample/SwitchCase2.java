package ifexample;

public class SwitchCase2 {
	public static void main(String[] args) {
		String medal = "Gold";

		switch (medal) {
		case "Gold":
			System.out.println("금메달입니다.");
			break;
		case "Bronze":
			System.out.println("동메달입니다.");
			break;
		default:
			System.out.println("매달은 없습니다.");
			break;
		}
	}

}
