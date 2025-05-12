// 3. Create student and college class. Use constructor to set private data and display full info.
class College {
    private String cname;
    College(String cname) {
        this.cname = cname;
    }
    public void display() {
        System.out.println("College: " + cname);
    }
}
class Student extends College {
    private String name;
    private int roll;
    Student(String name, int roll, String cname) {
        super(cname);
        this.name = name;
        this.roll = roll;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        super.display();
    }
}
public class Test3 {
    public static void main(String[] args) {
        Student s = new Student("Ankit", 10, "IIT");
        s.display();
    }
}
