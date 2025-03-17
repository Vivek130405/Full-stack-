import java.util.Scanner;

public class numbers{
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

    public static int sum(int[] arr){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
           sum = sum+arr[i];
        }
        return sum;
    }
    public static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
           if (arr[i] > max) {
            max = arr[i];
           }
        }
        return max;
    }
    public static int min(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
           if (arr[i] < min) {
            min = arr[i];
           }
        }
        return min;
    }
    public static int secmax(int[] arr){
        int max1 = Integer.MIN_VALUE;
        int min2 = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if (max1< arr[i]) {
                min2 = max1;
                max1 = arr[i];
               
            }
          
           if (arr[i] < max1 && min2 < arr[i]) {
            min2 = arr[i];
           }
        }
        return min2;
    }

    public static int secmin(int[] arr){
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int i =0;i<arr.length;i++){
            if (arr[i] < min1) {
                min2=min1;
                min1 = arr[i];
            }


            if (arr[i] > min1 && min2 > arr[i]) {
                min2 = arr[i];
                
            }
        }

       return min2;
    }
   
    public static int[] reverse(int[] arr){
        int first = 0;
        int last = arr.length-1;
        while (first<=last) {
            int temp  = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        return arr;
    }
//12345

    public static int[] arm(int [] arr){
       for(int i =0 ;i<arr.length;i++){
        int squ =0;
        while (arr[i] !=0) {
            int rem = arr[i]%10;
            squ = rem * rem;
            

        }
       }
    }


    public static void main(String[] args) {
   
   
    int [] arr =  init();
   display(arr);
   System.out.println();
    System.out.println("SUM :" + sum(arr));
    System.out.println("Max :" + max(arr));
    System.out.println("Min :" + min(arr));
    System.out.println("Second Max :" + secmax(arr));
    System.out.println("Second Min :" + secmin(arr));
    display(reverse(arr));
    }
}