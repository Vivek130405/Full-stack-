// 30. is-a + overriding + super + getter-setter: Developer is-a Employee
class Employee {
    private String empName;
    public void setEmpName(String name) {
        empName = name;
    }
    public String getEmpName() {
        return empName;
    }
    public void role() {
        System.out.println("Role: General Employee");
    }
}
class Developer extends Employee {
    private String tech;
    public void setTech(String tech) {
        this.tech = tech;
    }
    public String getTech() {
        return tech;
    }
    @Override
    public void role() {
        System.out.println("Role: Developer");
        super.role();  // call parent role
    }
    public void display() {
        System.out.println("Name: " + getEmpName());
        System.out.println("Technology: " + tech);
        role();
    }
}
public class Test30 {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.setEmpName("Raj");
        d.setTech("Java");
        d.display();
    }
}
