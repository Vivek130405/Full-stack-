public class prac {
    //even
    public static void evenn(int start,int end) {
        int sum = 0;
        for(int i = start;i<=end;i++){
            if (i%2 == 0) {
                System.out.println(i);
                sum = sum+i;
            }
            
        }
        System.out.println("SUM " + sum);
    }
    //odd
    public static void odd(int start,int end) {
        int sum = 0;
        for(int i = start;i<=end;i++){
            if (i%2 != 0) {
                System.out.println(i);
                sum = sum +i;
            }
        }
        System.out.println("SUM " + sum);
    }
//the is +ve or -ve
    public static boolean posneg(int n) {
        if (n<0) {
            return false;
        }else{
            return true;
        }
    }
    //the number is digit or number
    public static void diginum(int n) {
        if (n>=-9 && 9>=n) {
            System.out.println("digit");
        }
        else{
            System.out.println("NUM");
        }
    }
    //the character is Alphabet or Character
    public static void alpha(char n) {
        if (n>='a' && 'z'>=n || n>='A' && 'Z'>=n) {
            System.out.println("Alpha");
        }
        else{
            System.out.println("Char");
        }
    }
//check charcter is uppercase or lowercase
    public static void upper_lower( char n) {
        if (n>='a' && 'z'>=n) {
            System.out.println("LOWER");
        }
        else if(n>='A' && 'Z'>=n){
            System.out.println("UPPER");
        }else{
            System.out.println("invalid input");
        }
    }
    public static void main(String[] args) {
        // System.out.println("EVEN");
        // evenn(1, 10);
        // System.out.println("ODD");
        // odd(1, 10);
        // posneg(5);
        // diginum(-9);
        // alpha('$');
        // upper_lower('Z');
    }
}
