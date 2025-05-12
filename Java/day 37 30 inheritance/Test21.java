// 21. Demonstrate method overriding with Employee and Intern
class Employee {
    public void work() {
        System.out.println("Employee works 9 hours");
    }
}
class Intern extends Employee { // is-a
    @Override
    public void work() {
        System.out.println("Intern works 5 hours");
    }
}
public class Test21 {
    public static void main(String[] args) {
        Intern i = new Intern();
        i.work();  // overridden method
    }
}
