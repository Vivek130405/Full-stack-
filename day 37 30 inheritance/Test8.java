// 8. Assign teacher and school name using constructor and display both
class School {
    private String schoolname;
    School(String schoolname) {
        this.schoolname = schoolname;
    }
    public void display() {
        System.out.println("School: " + schoolname);
    }
}
class Teacher extends School {
    private String tname;
    Teacher(String tname, String schoolname) {
        super(schoolname);
        this.tname = tname;
    }
    public void display() {
        System.out.println("Teacher Name: " + tname);
        super.display();
    }
}
public class Test8 {
    public static void main(String[] args) {
        Teacher t = new Teacher("Meera", "DPS");
        t.display();
    }
}
