// 7. Assign car and company details using constructor and print without getter/setter
class Company3 {
    private String cname;
    Company3(String cname) {
        this.cname = cname;
    }
    public void display() {
        System.out.println("Company: " + cname);
    }
}
class Car extends Company3 {
    private String model;
    private int price;
    Car(String model, int price, String cname) {
        super(cname);
        this.model = model;
        this.price = price;
    }
    public void display() {
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        super.display();
    }
}
public class Test7 {
    public static void main(String[] args) {
        Car c = new Car("i20", 800000, "Hyundai");
        c.display();
    }
}
