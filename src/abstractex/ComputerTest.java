package abstractex;

public class ComputerTest {
    public static void main(String[] args) {
        // Computer c1 = new Computer(); // 에러 발생 (추상 클래스는 인스턴스 생성 불가)
        // Computer c3 = new NoteBook(); // 에러 발생 (하위 추상 클래스도 인스턴스 생성 불가)
        
        Computer c2 = new DeskTop();
        Computer c4 = new MyNoteBook();
        
        c2.display();
        c4.typing();
    }
}