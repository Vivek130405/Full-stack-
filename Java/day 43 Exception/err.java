public class err {
 
    // public static void recursiveMethod() {
    //     recursiveMethod(); 
    // }

    public static void m(){
        System.out.println(10/0);
        m1();
    }
    public static void m1(){
        System.out.println("Hello world");
        
    }

    public static void main(String[] args) {
        m();

        // recursiveMethod();

        // int a = 10,b=0;
    //     String str = null;
    //     try{
    //     System.out.println(a/b);
    //     throw new ArithmeticException("Ajinkya");
    //     // System.out.println(str.length());
    //     }
    //    catch(NullPointerException e){
    //     System.out.println(e);
    //    }
    //     catch(ArithmeticException e){
    //          System.out.println(e);
    //     }
    //     catch(Exception e){
    //         System.out.println(e);
    //     }
    //     System.out.println("hello");
 // if (b==0) {
    //     throw new ArithmeticException("Ajinkya");
    //     System.out.println("hello");
    // }

   
//  try{
//         System.out.println(a/b);
//         System.out.println("hello");
//     }
//     finally{
//         System.out.println("Bright Path");
//     }
   
    }

}