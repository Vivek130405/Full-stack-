import java.util.Scanner;

public class  countdigitinarray{

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

    public static boolean iscount(int key,int[] arr){
        for(int i = 0; i<arr.length;i++){
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void count(int [] arr) {
      int [] b ={};
        for(int i =0;i<arr.length;i++){
            if (!iscount(arr[i], b)) {
                int count = 0;
                for(int j = 0; j<arr.length;j++){
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                System.out.println("Element " + arr[i]  + " Count " + (count));
                b[i] = arr[i];
            }
        }
    }

    

    public static void main(String[] args) {
        int [] arr = init();
        display(arr);
        System.out.println();
        count(arr);
    }
}