public class new1 {

    public static void m() throws ArithmeticException {

        m1();

        System.out.println("heloo");

    }

    public static void m1() throws ArithmeticException {
        System.out.println(10 / 0);
    }
   static  int a = 10;
    static{
        System.out.println(a);
        System.out.println("helo");
    }

    public static void main(String[] args) throws ArithmeticException {

        // m();
        // System.out.println("heloo");

        // try{
        //     System.out.println(10/0);
        //     System.out.println("hello");
        // }
        // finally{
        //     System.out.println("hello");
        // }
        // new1 n = new new1();
        // System.out.println(n.a);
        System.out.println("hello");
    }
}