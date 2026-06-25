package stream;

import java.util.ArrayList;
import java.util.List;

public class DistinctTest {
	public static void main(String[] args) {
		Student studentLee = new Student(100, "이윤선");
		Student studentMoon = new Student(200, "문찬욱");
		Student studentLee2 = new Student(300, "이윤선");
		
		List<Student> studentList = new ArrayList< >();
		studentList.add(studentLee);
		studentList.add(studentMoon);
		studentList.add(studentLee2);
		
		studentList.stream()
		           .distinct()
		           .forEach(s-> System.out.println(s.getName()));	
	}
}
