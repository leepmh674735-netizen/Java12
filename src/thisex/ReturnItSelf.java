package thisex;

public class ReturnItSelf {
    public static void main(String[] args) {
    	
        Student studentLee = new Student();
        
        studentLee.setId(12345).setName("김원상").setGrade(3).showStudentInfo();
        
    }
}