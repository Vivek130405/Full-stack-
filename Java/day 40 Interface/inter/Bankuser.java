import java.util.Scanner;

class exe extends Exception {
    public exe(String s) {
        super(s);
    }
}

interface bank {
    int minimumbalance = 10000;

    public void deposit(double num);

    public void withdraw(double num);

    public void checkbalance();

    public boolean authentication(int num);

}

class Account extends customer implements bank {
    private String Accounttype;
    private String AccountNumber;
    private double Balance;
    private int pin;

    public void setAccounttype(String s) {
        this.Accounttype = s;
    }

    public String getAccounttype() {
        return this.Accounttype;
    }

    public void setAccountNumber(String s) {
        this.AccountNumber = s;
    }

    public String getAccountNumber() {
        return this.AccountNumber;
    }

    public void setBalance(double s) {
        this.Balance = s;
    }

    public double getBalance() {
        return this.Balance;
    }

    public void setpin(int s) {
        this.pin = s;
    }

    public int getpin() {
        return this.pin;
    }

    public void deposit(double num) {

        if (num < 500) {
            System.out.println("Insufficient Amount Atleast deposite 500 ");
        } else {
            this.Balance = num + this.Balance;
        }
    }

    public void withdraw(double num) {
        if (this.Balance == 10000) {
            System.out.println("Minimum balance 10000");
        } else {
            this.Balance = this.Balance - num;
        }
    }

    public void checkbalance() {
        System.out.println(this.Balance);
    }

    public boolean authentication(int pin) {
        if (pin == this.pin) {
            System.out.println("Login successful");
            return true;
        } 
        return false;
    }
}

class customer {
    private String AccountHolder;
    private String Mobileno;

    public void setAccountHolder(String s) {
        this.AccountHolder = s;
    }

    public String getAccountHolder() {
        return this.AccountHolder;
    }

    public void setMobileno(String s) {
        this.Mobileno = s;
    }

    public String getMobileno() {
        return this.Mobileno;
    }
}

public class Bankuser {

    public static void main(String[] args) {

        System.out.println("How Many Customer Do you Want ");
        Scanner sc = new Scanner(System.in);
        int customer = sc.nextInt();

        Account[] arr = new Account[customer];

        for (int i = 0; i < arr.length; i++) {
             System.out.println("For Customer " + (i+1));
            arr[i] = new Account();
            System.out.println("Enter the Account Type ");
            String Accounttype = sc.nextLine();
            arr[i].setAccounttype(Accounttype);
            sc.next();

            System.out.println("Enter the Account Holder Name Type ");
            String AccountHolder = sc.nextLine();
            arr[i].setAccountHolder(AccountHolder);
            sc.next();
            System.out.println("Enter the Account Number Type ");
            String AccountNumber = sc.nextLine();
            arr[i].setAccountNumber(AccountNumber);
            sc.next();
            System.out.println("Enter the Account Pin Type ");
            int pin = sc.nextInt();
            arr[i].setpin(pin);

            System.out.println("Enter the Account Balance Type ");
            double balance = sc.nextDouble();
            arr[i].setBalance(balance);
            
        }

    //   if(arr[ge]){

    //   }else{

    //   }

   for (int i = 0; i < arr.length; i++) {
    System.out.println("For Customer " + (i+1));
    System.out.println("Enter the Correct Pin ");
    int number = sc.nextInt();
    if (arr[i].authentication(number)) {
        System.out.println("Welcome To the system");
    }
    else{
        System.out.println("Invalid credetails");
        continue;
    }
     while (true) {
        System.out.println("Enter the servies ");
        System.out.println("1. deposit ");
        System.out.println("2. Withdraw ");
        System.out.println("3. checkbalance ");
      
        System.out.println("Enter only index ");
        int index = sc.nextInt();

        switch (index) {
            case 1:
                System.out.println("Enter Deposit value");
                int deposit = sc.nextInt();
                arr[i].deposit(deposit);
                break;

            case 2:
                System.out.println("Enter the Withdraw value");
                double withdraw = sc.nextDouble();
                arr[i].withdraw(withdraw);
                break;

            case 3:
                System.out.println("Check balance");
                arr[i].checkbalance();
                break;
            default:
            System.out.println("Select correct option");
                break;
        }

        System.out.println("Are you Want to continue (y/n)");
        char c = sc.next().charAt(0);
        if (c == 'y') {
            System.out.println("Okay Continue ");
        }
        else{
            System.out.println("Thanks");
            break;
        }
    }
   }
    }
}