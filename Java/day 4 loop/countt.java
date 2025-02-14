public class countt {
    public static void main(String[] args) {
        int num = 123456789;
        int rem = 0;
        int store =  0;
        while (num>0) {
            rem = num%10;
            num = num/10;
            store++;
        }
        System.out.println(store);
    }
}
