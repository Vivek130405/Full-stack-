public class count {
    public static int countt(int num) {
        int digit = 0;
        int count = 0;
        while (num != 0) {
            digit = num % 10;
            num = num / 10;
            count++;
        }
        return count;
    }

    public static int sumdigit(int num) {
        int digit = 0;
        int sum = 0;
        while (num != 0) {
            digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        return sum;
    }

    public static int evensum(int num) {
        int digit = 0;
        int sum = 0;
        while (num != 0) {
            digit = num % 10;
            if (digit % 2 == 0) {
                sum = sum + digit;
            }
            num = num / 10;
        }
        return sum;
    }

    public static int oddsum(int num) {
        int digit = 0;
        int sum = 0;
        while (num != 0) {
            digit = num % 10;
            if (digit % 2 != 0) {
                sum = sum + digit;
            }
            num = num / 10;
        }
        return sum;
    }

    public static int arm(int num) {
        int digit = 0;
        int sum = 0;
        while (num != 0) {
            digit = num % 10;
            sum = digit * digit * digit + sum;
            num = num / 10;
        }
        return sum;
    }

    public static int reverse(int num) {
        int digit = 0;
        int reverse = 0;
        while (num != 0) {
            digit = num % 10;
            reverse = digit + reverse * 10;
            num = num / 10;
        }
        return reverse;
    }

public static void automorphic(int num){
    int sum = num * num;
   if (sum % 100 == num  ) {
    System.out.println("Automorphic");
   }else{
    System.out.println("Not");
   }
}

    public static void main(String[] args) {
        int a = countt(123456);
        System.out.println(a);
        int b = sumdigit(12345);
        System.out.println("SUM " + b);
        int c = evensum(234);
        System.out.println("EVEN SUM " + c);
        int d = oddsum(12345);
        System.out.println("EVEN SUM " + d);
        int e = arm(370);
        System.out.println(e);
        int f = reverse(120);
        System.out.println(f);
        automorphic(2);
    }
}