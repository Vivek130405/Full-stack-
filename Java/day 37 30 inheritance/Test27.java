// 27. Overriding and accessing parent and child methods separately
class A {
    public void print() {
        System.out.println("Print from Class A");
    }
}
class B extends A {
    @Override
    public void print() {
        System.out.println("Print from Class B");
    }
    public void displayBoth() {
        print();         // child method
        super.print();   // parent method
    }
}
public class Test27 {
    public static void main(String[] args) {
        B obj = new B();
        obj.displayBoth();
    }
}
