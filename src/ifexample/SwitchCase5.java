package ifexample;

public class SwitchCase5 {
    public static void main(String[] args) {
        int month = 10;
        
        int day = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> {
                System.out.println(month + "월은 존재하지 않는 달입니다.");
                yield 0;
            }
        };
        
        if (day > 0) {
            System.out.println(month + "월의 날짜는 " + day + "일까지 있습니다.");
        }
    }
}