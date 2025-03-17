import java.util.Scanner;

public class partition {
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

    public static int[] parti(int[] arr) {
        int size0 = 0;
        int size1 = 0;
        for(int i =0;i<arr.length;i++){
            if (arr[i] == 0) {
                size0++;
            }
            else{
                size1++;
            }
        }
        for(int i = 0;i<size0;i++){
            arr[i] =0;
        }
        for(int i = size0;i<arr.length;i++){
            arr[i] = 1;
      
    }
    return arr;
}

public static int[] partanand(int[] arr){
    int start = 0;
    int end = arr.length-1;
    int temp =0;
    while (start!=end) {
        if (arr[start] == 0) {
            start++;
        }
        else if(arr[start] == 0&&arr[end] ==0){
            end--;
        }

        else{
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end--;
        }
    }
    return arr;
}
 public static void main(String[] args) {
    int [] arr = init();
    display(arr);
    System.out.println();
    display(partanand(arr));
 }
    
}