package object;

public class ObjectCloneTest {
    public static void main(String[] args) {
        Circle circle = new Circle(10, 20, 30);
        Circle copyCircle = null;
        
        // clone() 호출부를 try-catch로 감싸 에러를 해결합니다.
        try {
            copyCircle = (Circle) circle.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        System.out.println(circle);
        System.out.println(copyCircle);
        System.out.println("원래 객체 주솟값 : " + System.identityHashCode(circle));
        System.out.println("복제 객체 주솟값 : " + System.identityHashCode(copyCircle));
    }
}