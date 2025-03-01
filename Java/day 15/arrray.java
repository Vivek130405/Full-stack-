import java.util.Scanner;

class Innerarrray {
    static Scanner sc = new Scanner(System.in);
    private int evensum;
    private int oddsum;
    private int sum;
    private int[] arr;
    private int arraymax;
    private int arraymin;
    private int arraysecmax;
    private int arraysecmin;
    private int size;

    public void setsize(int size) {
        this.size = size;
    }

    public int getsize() {
        return this.size;
    }

    public void setarr(int[] arr) {
        this.arr = arr;
    }

    public int[] getarr() {
        return this.arr;
    }

    public void setevensum(int evensum) {
        this.evensum = evensum;
    }

    public int getevensum() {
        return this.evensum;
    }

    public void setoddsum(int oddsum) {
        this.oddsum = oddsum;
    }

    public int getoddsum() {
        return this.oddsum;
    }

    public void setsum(int sum) {
        this.sum = sum;
    }

    public int getsum() {
        return this.sum;
    }

    public void setarraymax(int arraymax) {
        this.arraymax = arraymax;
    }

    public int getarraymax() {
        return this.arraymax;
    }

    public void setarraymin(int arraymin) {
        this.arraymin = arraymin;
    }

    public int getarraymin() {
        return this.arraymin;
    }

    public void setsecarraymax(int arraysecmax) {
        this.arraysecmax = arraysecmax;
    }

    public int getarraysecmax() {
        return this.arraysecmax;
    }

    public void setarraysecmin(int arraysecmin) {
        this.arraysecmin = arraysecmin;
    }

    public int getarraysecmin() {
        return this.arraysecmin;
    }

    public void init() {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Element ");
            arr[i] = sc.nextInt();
        }
        setarr(arr);
    }

    public void display() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("|" + arr[i] + "|");

        }

    }

    public void even_sum(){
        int sum = 0;
        for(int i = 0; i<arr.length;i++){
            if (arr[i] % 2 == 0) {
                sum = sum+ arr[i];
            }
        }
        setevensum(sum);
    }

    public void odd_sum(){
        int sum = 0;
        for(int i = 0; i<arr.length;i++){
            if (arr[i] % 2 != 0) {
                sum = sum+ arr[i];
            }
        }
       setoddsum(sum);
    }

    public void arr_sum(){
        int sum = 0;
        for(int i = 0; i<arr.length;i++){
           
                sum = sum+ arr[i];
            
        }
      setsum(sum);
    }

    public void array_max(){
        int max = Integer.MIN_VALUE;

        for(int i =0;i<arr.length;i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        setarraymax(max);
    }

    public void array_min(){
        int min = Integer.MAX_VALUE;

        for(int i =0;i<arr.length;i++){
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        setarraymin(min);
    }

    public void array_sec_min(){
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

        setarraysecmin(min2);
    }

    

}

public class arrray {
    public static void main(String[] args) {
         Innerarrray s = new Innerarrray();
         s.setsize(4);
         s.init();
         s.display();
         s.array_max();
         s.array_min();
         s.array_sec_min();
         System.out.println();
         System.out.println("MAX :" + s.getarraymax());
         System.out.println("MIN :" +s.getarraymin());
         System.out.println("SEC MIN :" +s.getarraysecmin());
    }
}