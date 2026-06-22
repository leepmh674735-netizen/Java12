package arraylist;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		Student studentKim = new Student(1002, "Kim");
		studentKim.addSubject("국어", 70);
		studentLee.addSubject("수학", 85);
		studentLee.addSubject("영어", 100);
		
		studentLee.showStudentInfo( );
		System.out.println("========================");
		studentKim.showStudentInfo( );
	}
}
