public class numberprog {

    public static boolean prime(int num) {
        for (int i = 2; i <( num/2); i++) {
            if (num % i == 0) {
                return false;
            }

        }
        return true;
    }

    //range prime number
    public static void isprime_range(int start,int end){
        for(int i = start;i<end;i++){
             if (prime(i)) {
              System.out.println("Prime : " + i);
              
            }
        }
    }

    public static int facta(int num){
        int num1 = 1;
        if (num == 0) {
            return 1;
        }
        else{
        
      for(int i = 1;i<= num;i++){
        num1 = num1 * i;
      }
    }
      return num1;
    }
    public static void strong(int num){
        int rem = 0;
        int result = 0;
        int temp = num;
        while (num != 0) {
            rem = num % 10;
            result = result + facta(rem);
            num = num/10;
        }
        if (temp == result) {
            System.out.println("strong " + result);
        }
    }

    public static void arm(int num){
        int rem = 0;
        int result = 0;
        int temp = num;
        while (num != 0) {
            rem = num % 10;
            result = result + rem*rem*rem;
            num = num/10;
        }
        if (temp == result) {
            System.out.println("Armstrong " + result);
        }
    }


    // 25 => 625 
    public static boolean Automorphic(int num){
       int square = num * num;
       int result = 0;
       int result1 = 0;
       boolean flag =true;
       while (num != 0) {
        result = num % 10;
        result1 = square % 10;
        if (result != result1) {
          
            flag=false;
            break;
        }

        num = num/10;
        square = square/10;
       
       }

       return flag;
    }

    public static void pallidrome(int num){
        int result = 0;
        int rem = 0;
        int temp = num;
        while (num != 0) {
            rem = num % 10;
            // System.out.println(rem);
            result = rem + (result*10);
            // System.out.println(result);
            num = num/10;
            // System.out.println(num);
        }
        // System.out.println(result);
        if (result == temp) {
            System.out.println("Pallidrome " + result);
        }
        else{
            System.out.println("Not pallidrome");
        }
    }

    public static int reverse(int num){
        int result = 0;
        int rem = 0;
        int temp = num;
        while (num != 0) {
            rem = num % 10;
            // System.out.println(rem);
            result = rem + (result*10);
            // System.out.println(result);
            num = num/10;
            // System.out.println(num);
        }
       return result;
    }

    //digit to string

    public static void digit_to_string(int num){
        String [] arr = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        int rem = 0;
        int num1 = reverse(num);
        while (num1 != 0) {
            
            rem = num1 % 10;
            System.out.print(arr[rem] + " ");
            num1 = num1/10;
        }
    }

    public static void main(String[] args) {
        // System.out.println(prime(9));
        // isprime_range(2, 1000);
        // System.out.println(facta(5));
        // strong(145);
        // arm(153);

        // System.out.println(Automorphic(25));
        // pallidrome(121);
        digit_to_string(123);
    }
}