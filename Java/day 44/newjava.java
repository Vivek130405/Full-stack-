public class newjava {

    public static void m(){
        try {
                    m1();

        } catch (Exception e) {
           System.out.println(e);
        }
            System.out.println("heloo");

    }
    public static void m1(){
       System.out.println(10/0);
    }

    public static void main(String[] args){
    //    try {
    //     //  System.out.println(100/0);
    //     throw new NullPointerException("divide by zero");
    //    } catch (NullPointerException e) {
    //    System.out.println(e);
    //    }
    //    System.out.println("Hello world");

    // try {
    //     String str = null;
    //     System.out.println(str.length());
    // } catch (NullPointerException e) {
    //    try {
    //     System.out.println(10/0);
    //    } catch (ArithmeticException e1) {
    //     System.out.println("handled");
    //    }
    //    System.out.println("Hello");
    // }
    m();
    System.out.println("heloo");
    }
}