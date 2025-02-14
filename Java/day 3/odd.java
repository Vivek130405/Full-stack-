import java.util.*;
public class odd{
    public static void oddd(int start, int end) {
        while (start<=end) {
           if (start%2 != 0) {
            System.out.println(start);
           }
           start++; 
        }
        
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        int en = sc.nextInt();
        oddd(st, en);
    }
}