abstract class ATM{
    abstract public void deposite();
    abstract public void Withdraw();
    abstract public void CheckBalance();
}
class HDFC extends ATM{
    public void deposite(){
        System.out.println("deposite");
    }
    public void Withdraw(){
        System.out.println("Withdraw");
    }
    public void CheckBalance(){
        System.out.println("CheckBalance");
    }
}
class BOI extends ATM{
    public void deposite(){
        System.out.println("BOI deposite");
    }
    public void Withdraw(){
        System.out.println("BOI Withdraw");
    }
    public void CheckBalance(){
        System.out.println("BOI CheckBalance");
    }
}

public class abstract_2 {
    public static void main(String[] args) {
        HDFC hdfc = new HDFC();
        hdfc.CheckBalance();
        hdfc.Withdraw();
        hdfc.deposite();
    }
}
