// 25. is-a + has-a + method overriding: Student is-a Person and has-a Course
class Course {
    private String courseName;
    public void setCourseName(String name) {
        this.courseName = name;
    }
    public String getCourseName() {
        return courseName;
    }
}
class Person {
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void info() {
        System.out.println("I am a person");
    }
}
class Student extends Person {  // is-a
    private int roll;
    private Course course;  // has-a
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public void setCourse(Course c) {
        this.course = c;
    }
    @Override
    public void info() {
        System.out.println("I am a student");
        super.info();
    }
    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("Roll No: " + roll);
        System.out.println("Course: " + course.getCourseName());
        info();
    }
}
public class Test25 {
    public static void main(String[] args) {
        Course c = new Course();
        c.setCourseName("Python");
        Student s = new Student();
        s.setName("Priya");
        s.setRoll(101);
        s.setCourse(c);
        s.display();
    }
}
