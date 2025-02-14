public class square {
    public static void main(String[] args) {
        int base = 2;
        int power = 3;
        int sum = 1;

        while (power>0) {
            sum = sum * base;
            power--;
        }
        System.out.println(sum);
    }
}
