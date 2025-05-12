// 4. Create bank and customer class. Assign data using constructor and display details.
class Bank {
    private String bankname;
    Bank(String bankname) {
        this.bankname = bankname;
    }
    public void display() {
        System.out.println("Bank: " + bankname);
    }
}
class Customer extends Bank {
    private String name;
    private long acc;
    Customer(String name, long acc, String bankname) {
        super(bankname);
        this.name = name;
        this.acc = acc;
    }
    public void display() {
        System.out.println("Customer: " + name);
        System.out.println("Account: " + acc);
        super.display();
    }
}
public class Test4 {
    public static void main(String[] args) {
        Customer c = new Customer("Ravi", 1234567890L, "SBI");
        c.display();
    }
}
