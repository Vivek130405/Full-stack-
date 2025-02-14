public class functionifelse {
    public static void swapping(int a,int b){
       int temp = a;
       a = b;
       b = temp;
       System.out.println("A value is :" + a);
       System.out.println("B value is :" + b);
    }

    public static void withoutswap(int a,int b){
        a = b^a;
        b = a^b;
        a = a^b;
        System.out.println("A value is :" + a);
        System.out.println("B value is :" + b);
    }
    public static boolean posneg(int a){
        if (a>0) {
            return true;
        }else{
            return false;
        }
    }
    public static void evenodd(int a){
        if (a %2 == 0) {
            System.out.println("even");
        }
        else{
            System.out.println("ODD");
        }
    }

    public static int sum(int a,int b){
        return a+b;
    }
    public static int greatest(int a,int b,int c){
        if (a>b && a>c) {
           
                return a;
           
        }
        else if(b>c){
            return b;
        }
        else{
            return c;
        }
    }

    public static boolean leap(int a) {
        if (a%400 == 0 || (a%100 != 0 && a%4==0)) {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        swapping(a, b);
        withoutswap(a, b);
        System.out.println(posneg(10));
        evenodd(11);
        System.out.println(  sum(a, b));
        greatest(a, b, c);
    System.out.println(leap(2004));
    }
}
