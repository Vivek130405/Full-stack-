import java.util.Scanner;

public class even {
   public static void evenn(int start,int end){
    while (start<=end) {
        if (start%2 ==0) {
           System.out.println(start);
        }
        start++;
    }
   }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        int en = sc.nextInt();
        evenn(st, en);
    }
}
