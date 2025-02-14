public class rev {

    public static void main(String[] args) {
       int num = 335;
       int store = 0;
       int r = 0;
        while (num>0) {
           r = num%10;
           store = r + store * 10;
           num = num/10;
        }
        System.out.println(store);
    }

}