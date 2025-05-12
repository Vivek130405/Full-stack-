// 26. Demonstrate method overriding and use of super with constructor values
class Account {
    private double balance;
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void showBalance() {
        System.out.println("Account Balance: ₹" + balance);
    }
}
class SavingsAccount extends Account {
    private double interestRate;
    public void setInterestRate(double rate) {
        this.interestRate = rate;
    }
    @Override
    public void showBalance() {
        System.out.println("Savings Account Balance with Interest");
        super.showBalance();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
public class Test26 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.setBalance(10000);
        sa.setInterestRate(4.5);
        sa.showBalance();
    }
}
