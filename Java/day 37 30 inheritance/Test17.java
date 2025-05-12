// 17. Demonstrate "has-a" relationship using Department has-a Manager
class Manager {
    private String managerName;
    public void setManagerName(String name) {
        this.managerName = name;
    }
    public String getManagerName() {
        return managerName;
    }
}
class Department {
    private String deptName;
    private Manager manager; // has-a
    public void setDeptName(String name) {
        this.deptName = name;
    }
    public void setManager(Manager m) {
        this.manager = m;
    }
    public void display() {
        System.out.println("Department: " + deptName);
        System.out.println("Manager: " + manager.getManagerName());
    }
}
public class Test17 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setManagerName("Anjali");
        Department d = new Department();
        d.setDeptName("IT");
        d.setManager(m);
        d.display();
    }
}
