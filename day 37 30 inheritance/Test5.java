// 5. Create product and company class. Enter values using constructor, print without getter/setter
class Company2 {
    private String name;
    Company2(String name) {
        this.name = name;
    }
    public void display() {
        System.out.println("Company: " + name);
    }
}
class Product extends Company2 {
    private String pname;
    private int price;
    Product(String pname, int price, String name) {
        super(name);
        this.pname = pname;
        this.price = price;
    }
    public void display() {
        System.out.println("Product: " + pname);
        System.out.println("Price: " + price);
        super.display();
    }
}
public class Test5 {
    public static void main(String[] args) {
        Product p = new Product("Laptop", 45000, "Dell");
        p.display();
    }
}
