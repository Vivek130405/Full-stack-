public class print3{

    public static void print(int num){
        if (num == 3) {
            return;
        }
        print(num + 1);
        System.out.println(num);
    }

    public static void incresing(int n){
        System.out.println(n);
        if (n == 10) {
            return;
        }
        incresing(n + 1);
    }

    public static void decresing(int n){
        System.out.println(n);
        if (n==1) {
            return;
        }

        decresing(n-1);
    }

    public static void evennum(int num,int i){
        System.out.println(num);
        if (num == num * i) {
            return;
        }
        evennum( num * i, i-1);
    }

    //function + iterative
    public static void print1_10(int num){
         for(int i =1;i<=num;i++){
            System.out.println(i);
        }
    }

    //forword
    public static void forword_1_10(int num){
        System.out.println(num);
        if (num == 10) {
            return;
        }
        forword_1_10(num+1);
    }
    //Backword or backtracking
    public static void Backword_1_10(int num){
        if (num == 1) {
            System.out.println(num);
            return;
        }
        Backword_1_10(num-1);
        System.out.println(num);
    }

    //forword  5 4 3 2 1
    public static int factorial(int num){
        if (num == 1) {
            return 1;
        }
      return num * factorial( num-1);
    }
    public static void main(String [] args){
        // incresing(1);
        // System.out.println("decresing ");
        // decresing(10);
        // System.out.println("Table");
        // evennum(2, 10);

        //iterative method
        for(int i =1;i<=10;i++){
            System.out.println(i);
        }

        //funtion 1 to 10
        print1_10(10);

        System.out.println("Forword");
        forword_1_10(1);

        System.out.println("Backword");
        Backword_1_10(10);

        System.out.println("Factorial");
        int facta = factorial(5);
        System.out.println(facta);

    }
}