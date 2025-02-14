public class arm {
    public static void main(String[] args) {
       int num = 153;
        int rem = 0;
        int store = 0;
        int i = num;
        while (num>0) {
            rem = num % 10;
            store = rem * rem * rem + store;
            System.out.println(store);
            num = num / 10;
           
        }
        if ( i == store) {
            System.out.println("ARM");
        }
        else{
            System.out.println("NOT");
        }
    }
}
