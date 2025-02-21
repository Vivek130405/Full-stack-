
public class harhad{

    public static void harshad(int num){
        int sum=0;
        int temp = num;
        while (num !=0) {
            int rem = num % 10;
            sum = sum + rem;
            num = num/10;
        }
        System.out.println(sum);
        
       if (temp % sum == 0) { //19%10 ==9
        System.out.println("Harshad");
       }
       else{
        System.out.println("Not");
       }
    }

      // 9 = 81 | 8 +1 = 9
    public static void neon(int n){
        int squ = n * n;
        int sum = 0;
        System.out.println(squ);
        while (squ != 0) {
            int rem = squ % 10;
            sum = sum + rem;
            squ = squ/10;
        }
       if (sum == n) {
        System.out.println("Neon");
       }
       else{
        System.out.println("NOT");
       }
    }


    public static void auto(int n){
     int sq = n* n;
     
     while (n != 0) {
        int sqrem = sq % 10;
        int numrem = n%10;
        if (sqrem != numrem) {
            break;
        }
        sq = sq/10;
        n = n/10;
     }
     if (n == 0) {
        System.out.println("AUTO");
     }
     else{
        System.out.println("NOT");
     }

    }
    public static void main(String[] args) {
      auto(25);
    }
}