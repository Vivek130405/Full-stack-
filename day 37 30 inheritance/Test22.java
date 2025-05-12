// 22. Use super to call overridden method from child class
class Shape {
    public void draw() {
        System.out.println("Drawing Shape");
    }
}
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
        super.draw();  // calling parent method
    }
}
public class Test22 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
    }
}
