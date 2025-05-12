// 15. Store account and bank details using constructor, print without getter/setter
class Bank2 {
    private String bname;
    Bank2(String bname) {
        this.bname = bname;
    }
    public void display() {
        System.out.println("Bank: " + bname);
    }
}
class Account extends Bank2 {
    private long accno;
    Account(long accno, String bname) {
        super(bname);
        this.accno = accno;
    }
    public void display() {
        System.out.println("Account No: " + accno);
        super.display();
    }
}
public class Test15 {
    public static void main(String[] args) {
        Account a = new Account(9876543210L, "HDFC");
        a.display();
    }
}
