// 10. Take student details with marks and college name and print them
class College2 {
    private String cname;
    College2(String cname) {
        this.cname = cname;
    }
    public void display() {
        System.out.println("College: " + cname);
    }
}
class Student2 extends College2 {
    private String sname;
    private int marks;
    Student2(String sname, int marks, String cname) {
        super(cname);
        this.sname = sname;
        this.marks = marks;
    }
    public void display() {
        System.out.println("Name: " + sname);
        System.out.println("Marks: " + marks);
        super.display();
    }
}
public class Test10 {
    public static void main(String[] args) {
        Student2 s = new Student2("Aryan", 88, "IIT");
        s.display();
    }
}
