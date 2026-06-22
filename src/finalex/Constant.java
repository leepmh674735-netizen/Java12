package finalex;

public class Constant {
    int num = 10;
    final int NUM = 100;
    
    public static void main(String[] args) {
        Constant cons = new Constant();
        cons.num = 50;
        
        // cons.NUM = 200; // 에러가 나는 원인 줄을 제거하거나 주석 처리해야 합니다.
        
        System.out.println(cons.num);
        System.out.println(cons.NUM);
    }
}