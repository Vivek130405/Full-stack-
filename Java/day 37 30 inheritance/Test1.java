// 1. Using constructor assign value to private variable and display it
class Parent1 {
    private int id;
    Parent1(int id) {
        this.id = id;
    }
    public void display() {
        System.out.println("Parent ID: " + id);
    }
}
class Child1 extends Parent1 {
    private int child_id;
    Child1(int child_id, int id) {
        super(id);
        this.child_id = child_id;
    }
    public void display() {
        System.out.println("Child ID: " + child_id);
        super.display();
    }
}
public class inher1 {
    public static void main(String[] args) {
        Child1 obj = new Child1(101, 500);
        obj.display();
    }
}
