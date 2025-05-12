// 6. Assign employee and department details using constructor and display (no getter/setter)
class Department {
    private String dept;
    Department(String dept) {
        this.dept = dept;
    }
    public void display() {
        System.out.println("Department: " + dept);
    }
}
class Employee2 extends Department {
    private String name;
    private int id;
    Employee2(String name, int id, String dept) {
        super(dept);
        this.name = name;
        this.id = id;
    }
    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        super.display();
    }
}
public class Test6 {
    public static void main(String[] args) {
        Employee2 e = new Employee2("Ravi", 101, "IT");
        e.display();
    }
}
