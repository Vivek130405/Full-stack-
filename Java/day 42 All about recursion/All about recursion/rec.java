public class rec{
    
    //print n to 1
    public static int nto1(int n){
        if (n == 1) {
            System.out.println(n);
            return 1;
        }
        System.out.println(n);
        return nto1(n-1);
    }

    //print 1 to n
    public static int _1ton(int n){
        if (n == 1) {
            System.out.println(n);
            return 1;
        }
       _1ton(n-1);
        System.out.println(n);
     return 0;
    }

    //print 43211234
    public static void _4to4(int n){
        if (n==0) {
            return;
        }
        System.out.println(n);
        _4to4(n-1);
        System.out.println(n);
        return;
    }

    // 1 to 5 sum = 15
    public static int sum(int n,int sum){
        if (n == 0) {
            return sum;
        }
        sum = n + sum;
        return sum(n-1,sum);
    }

    // power 2 raise to 3 = 8
    public static int powerr(int num,int power,int store){
        if (power == 0) {
            return store;
        }
        store = store * num;
        return powerr(num,power-1,store);
        // int store = 1;
        // for(int i = 1;i<=power;i++){
        //     store = num * store;
        // }
        // System.out.println(store);
    }

    //Fibonacci series 1 1 2 3 5 8 13 21 34 55 89
    public static int Fibonacci_series(int num){
        if (num==1 || num == 2) {
            return 1;
        }
        return Fibonacci_series(num-1) + Fibonacci_series(num-2);
    }

    //Stair Path
    public static int stairpath(int num){
        if (num==1) {
            return 1;
        }
        if (num==2) {
            return 2;
        }
        return stairpath(num-1) + stairpath(num-2);
    }

    //Power Function using Logarathmic a^b = a^b/2 * a^b/2
    public static int power_logarithmic(int a,int b){
        if (b == 0) {
            return 1;
        }
        if (b % 2 == 0) {
            return power_logarithmic(a,b/2) * power_logarithmic(a,b/2);
        }
        else{
            return power_logarithmic(a,b/2) * power_logarithmic(a,b/2) * a;
        }
        
    }
    public static void main(String[] args) {
    // nto1(10);
    // _1ton(10);
    // _4to4(4);
    // System.out.println(sum(10, 0));
    // System.out.println(    powerr(2, 3,1));
    // System.out.println(Fibonacci_series(11));
    // System.out.println(stairpath(3));
    System.out.println(power_logarithmic(2, 5));
}
}