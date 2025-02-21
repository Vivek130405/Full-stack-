import java.util.Scanner;

class numbers{
    private int number; 

    public void setnum(int number){
        this.number = number;
    }

    public int getnum(){
        return this.number;
    }

    public void setn(int number){
        this.number = number;
    }

    public int getn(){
        return this.number;
    }


        //1124 = 1+1+2+4 = 8 = 1*1*2*4
    public  void spy(){
        int sum = 0;
        int mult = 1;
       
        while (this.number>0) {
           
            int rem = this.number%10;
            sum = sum + rem;
            mult = rem * mult;
            this.number = this.number/10;

        }
        if (sum == mult) {
            System.out.println("SPY");
            System.out.println(this.number);
        }
        else{
            System.out.println("NOT");
        }
    }


     //factor
     public  int facta(int n){
        //    5*4*3*2*1;
        int fact = 1;
        while (n>0) {
            fact = fact * n;
            n--;
        }
        return fact;
        }
    
    
        public  void special(int n){
            int sum = 0;
            
            while (n>0) {
                int rem = n%10;
                sum = facta(rem) + sum;
                n = n/10;
            }
           if (sum == this.number) {
            System.out.println("SPECIAL"+this.number);
           }
           else{
            System.out.println("NO");
            System.out.println(this.number);
           }
        }
}






public class specialnum{

    public static void main(String[] args){
    //     for(int i=1;i<=10000;i++)
    //   spy(i);
    Scanner sc = new Scanner(System.in);
    numbers n = new numbers();
 int num = sc.nextInt();
 n.setnum(num);
    n.spy();
n.setn(num);
n.special(n.getn());
    // n.special(n.getnum());
    }
}