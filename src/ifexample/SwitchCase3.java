package ifexample;

public class SwitchCase3 {
	public static void main(String[] args) {
		String medal = "Gold";

		switch (medal) {
		case "Gold" -> System.out.println("금메달입니다.");
		 case "Sliver" -> System.out.println("은메달입니다.");
		 case "Brover" -> System.out.println("동메달입니다.");
		 default -> System.out.println("메달은 없습니다.");
		}
	}
}
