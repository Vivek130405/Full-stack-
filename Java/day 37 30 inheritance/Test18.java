// 18. Use super keyword to call parent method from child class
class Vehicle {
    public void run() {
        System.out.println("Vehicle is running...");
    }
}
class Bike extends Vehicle {
    public void run() {
        System.out.println("Bike is starting...");
        super.run(); // calling parent method
    }
}
public class Test18 {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.run();
    }
}
