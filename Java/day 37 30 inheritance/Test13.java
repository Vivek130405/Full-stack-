// 13. Store course and student data using constructor and display
class Course {
    private String cname;
    Course(String cname) {
        this.cname = cname;
    }
    public void display() {
        System.out.println("Course: " + cname);
    }
}
class Student3 extends Course {
    private String sname;
    Student3(String sname, String cname) {
        super(cname);
        this.sname = sname;
    }
    public void display() {
        System.out.println("Student Name: " + sname);
        super.display();
    }
}
public class Test13 {
    public static void main(String[] args) {
        Student3 s = new Student3("Karan", "DSA");
        s.display();
    }
}
