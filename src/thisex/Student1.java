package thisex;

public class Student1 {
    private int id;
    private String name;
    private int grade;
    private String major;
    private String phoneNumber;
    
    public Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public Student1(int id, String name, int grade) {
        this(id, name);
        this.grade = grade;     
    }
    
    public Student1(int id, String name, int grade, String major, String phoneNumber) {
        this(id, name, grade);
        this.major = major;
        this.phoneNumber = phoneNumber;
    }
}