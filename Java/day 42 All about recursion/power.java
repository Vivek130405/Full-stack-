import java.util.Scanner;

public class power{

    // a = 2,b=4 ans == 16
    public static int recursion_power(int a,int b,int ans){
        
        if (b==0) {
          
            return ans;
        }
        ans = ans * a;
       
        return recursion_power(a, b-1,ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base Value");
        int base = sc.nextInt();
        System.out.println("Enter the Power Value");
        int power = sc.nextInt();
        int answer = recursion_power(base, power,1);
       
        System.out.println(answer);

    }
}