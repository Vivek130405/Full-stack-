class Innercountdigit {
private int number;

public void setNumber(int number) {
    this.number = number;
}

public int getNumber() {
    return number;
}

public  int countt() {
    int count = 0;
    int rem = 0;
    int temp = number;
    while (temp != 0) {
        rem = temp%10;
        temp = temp/10;
        count++;
    }
    return count;
}



public int sumdigit(){
    int sum = 0;
    int rem = 0;
    int temp = number;
    while (temp> 0) {
        rem = temp%10;
        sum = rem + sum;
        temp = temp/10;
       
       
    }
    return sum; 
}
    
public int even_sum(){
    int sum = 0;
    int rem = 0;
    int temp = number;
    while (temp> 0) {
        rem = temp%10;
        if (rem%2 == 0) {
            sum = rem + sum;
        }
        temp = temp/10;
    }
    return sum; 
}

public int arm(){}

}




public class countdigit{
    public static void main(String[] args) {
        Innercountdigit num = new Innercountdigit();
        num.setNumber(225);
        //count of Each Digit
        System.out.println("COUNT");
      int a=  num.countt();
      System.out.println(a);
      System.out.println("SUM");
      int b=  num.sumdigit();
      System.out.println(b);
      System.out.println("EVEN & ODD");
      int c = num.even_sum();
      System.out.println(c);
      
    }
}
