public class odd {
    public static void odd(int range){
        if (range == 0) {
            return;
        }
        if (range % 2 != 0) {
            System.out.println(range);
        }
        odd(range-1);
    }
    public static void main(String[] args) {
        odd(10);
    }
}
