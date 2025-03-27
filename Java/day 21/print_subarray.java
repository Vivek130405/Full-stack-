import java.util.Scanner;

public class print_subarray {
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

    public static void subarray(int[] arr) {
       for(int k = 0;k<arr.length;k++){
        for(int i = k;i<arr.length;i++){
            for(int j = k;j<=i;j++){
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
        System.out.println();
       }
    }

    public static void main(String[] args) {
        int [] a = init();
        display(a);
        System.out.println();
        subarray(a);
    }
}
