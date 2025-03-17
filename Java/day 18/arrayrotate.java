import java.util.Scanner;

public class arrayrotate{
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

    public static int[] reverse(int[] arr,int first,int last){
       
        while (first<last) {
            int temp  = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        return arr;
    }

    public static void rotate(int[] arr) {
        System.out.println("Right rotate");
        int d = sc.nextInt();
        int n = arr.length;
        d=d%n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        display(arr);
    }
    public static void main(String[] args) {
    int [] arr = init();
    display(arr);
    System.out.println();
    rotate(arr);
    }
}
//Anti-clockwise
//12345
//23451  //1
//34512  //2
//45123  //3
//51234  //4
//12345  //5