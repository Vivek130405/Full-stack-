public class sum_degit {
    public static void main(String[] args) {
        int num = 123456;
        int rem = 0;
        int store =  0;
        while (num>0) {
            rem = num%10;
            num = num/10;
            store = rem + store;
        }
        System.out.println(store);
    }
}
