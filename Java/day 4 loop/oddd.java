public class oddd {
    public static void main(String[] args) {
        int num = 125;
        int sum = 0;
        while (num > 0) {
            int i = num%10;
            if (i%2 != 0) {
                sum = sum + i;
            }
            num = num/10;
        }
        System.out.println(sum);
    }
}
