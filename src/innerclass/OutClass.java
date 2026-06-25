package innerclass;

class OutClass {
    private int num = 10;
    private static int sNum = 20;

    // 정적 내부 클래스
    static class InStaticClass {
        int inNum = 100;          // 내부 클래스의 인스턴스 변수
        static int sInNum = 200;  // 내부 클래스의 정적 변수

        // 내부 클래스의 일반 메서드
        void inTest() {
            // [에러] 정적 클래스는 외부 클래스의 인스턴스 변수(num)에 접근할 수 없습니다.
            // num += 10; 
            
            System.out.println("InStaticClass inNum = " + inNum + " (내부 클래스의 인스턴스 변수)");
            System.out.println("InStaticClass sInNum = " + sInNum + " (내부 클래스의 정적 변수 사용)");
            System.out.println("OutClass sNum = " + sNum + " (외부 클래스의 정적 변수 사용)"); // 오타 수정
        }

        // 내부 클래스의 정적 메서드
        static void sTest() {
            // [에러] 외부 클래스의 인스턴스 변수 접근 불가
            // num += 10; 
            
            // [에러] 정적 메서드는 자신이 속한 클래스의 인스턴스 변수(inNum)도 접근할 수 없습니다.
            // inNum += 10; 
            
            System.out.println("OutClass sNum = " + sNum + " (외부 클래스의 정적 변수 사용)");
            System.out.println("InStaticClass sInNum = " + sInNum + " (내부 클래스의 정적 변수 사용)");
        }
    }
}