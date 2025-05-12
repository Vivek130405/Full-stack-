// 20. Use getter/setter to assign student info and course info (has-a)
class Course {
    private String courseName;
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseName() {
        return this.courseName;
    }
}
class Student {
    private String name;
    private int roll;
    private Course course;  // has-a
    public void setName(String name) {
        this.name = name;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public void setCourse(Course c) {
        this.course = c;
    }
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Course: " + course.getCourseName());
    }
}
public class Test20 {
    public static void main(String[] args) {
        Course c = new Course();
        c.setCourseName("Java Programming");
        Student s = new Student();
        s.setName("Kiran");
        s.setRoll(23);
        s.setCourse(c);
        s.display();
    }
}
