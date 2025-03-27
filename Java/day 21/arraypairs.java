import java.util.Scanner;

public class arraypairs {
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

    public static void pairs(int [] arr){
        for(int i = 0; i<arr.length;i++){
            int counter = i;
            for(int j =counter+1;j<arr.length;j++){
                System.out.print("(" + arr[i] + ","+ (arr[j]) + ")" );
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    int [] a = init();
    display(a);
    System.out.println();
    pairs(a);
    }
}