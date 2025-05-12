// 19. Use super to access parent class variable
class Parent {
    String message = "Hello from Parent";
}
class Child extends Parent {
    String message = "Hello from Child";
    public void printMessages() {
        System.out.println("Child Message: " + message);
        System.out.println("Parent Message: " + super.message);
    }
}
public class Test19 {
    public static void main(String[] args) {
        Child c = new Child();
        c.printMessages();
    }
}
