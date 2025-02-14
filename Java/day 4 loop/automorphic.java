public class automorphic {
    public static void main(String[] args) {
        int base = 25;
        int power = 2;
        int sum = 1;

        while (power>0) {
            sum = sum * base;
            power--;
        }

        if ((sum % 100) == base) {
            System.out.println("Auto");
        }
        else{
            System.out.println("NOT");
        }
    }
}
