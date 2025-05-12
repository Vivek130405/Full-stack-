// 11. Create a base class for device and subclass for mobile, use constructor to assign and display details
class Device {
    private String type;
    Device(String type) {
        this.type = type;
    }
    public void display() {
        System.out.println("Device Type: " + type);
    }
}
class Mobile extends Device {
    private String model;
    Mobile(String model, String type) {
        super(type);
        this.model = model;
    }
    public void display() {
        System.out.println("Model: " + model);
        super.display();
    }
}
public class Test11 {
    public static void main(String[] args) {
        Mobile m = new Mobile("iPhone 14", "Smartphone");
        m.display();
    }
}
