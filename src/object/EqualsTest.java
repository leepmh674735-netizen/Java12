package object;

public class EqualsTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "이순신");
        Student studentSang = new Student(100, "이순신"); // 학번과 이름이 같은 새로운 객체
        
        // 두 객체의 논리적 동등성 확인 (학번이 같으면 같다고 처리)
        if (studentLee.equals(studentSang)) {
            System.out.println("studentLee와 studentSang은 논리적으로 같습니다.");
        } else {
            System.out.println("studentLee와 studentSang은 다릅니다.");
        }
        
        System.out.println("studentLee의 hashCode : " + studentLee.hashCode());
        System.out.println("studentSang의 hashCode : " + studentSang.hashCode());
        System.out.println("studentLee의 실제 주솟값 : " + System.identityHashCode(studentLee));
        System.out.println("studentSang의 실제 주솟값 : " + System.identityHashCode(studentSang));
    }
}