import java.util.Scanner;

public class print_max_subarray {
     static Scanner sc = new Scanner(System.in);
    public static int[] init(){
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i = 0; i<arr.length; i++){
             arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void display(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print("|" + arr[i] + "|");
        }
    }

    public static void maxsubarray(int[] arr) {
        int max = Integer.MIN_VALUE;
       for(int k = 0;k<arr.length;k++){
        for(int i = k;i<arr.length;i++){
            int sum = 0;
            for(int j = k;j<=i;j++){
               sum = sum+arr[j];
             
            }
            System.out.println(sum);
            if (sum> max) {
                max = sum;
            }
        }
        System.out.println();
       }
       System.out.println("MAX : " +max);
    }
    public static void main(String[] args) {
        int [] a = init();
        display(a);
        System.out.println();
        maxsubarray(a);
    }
}
