import java.util.Scanner;

class Innerevenodd {
    static Scanner sc = new Scanner(System.in);
 
 private int size;
 private int [] arr;

 public void setsize(int size){
    this.size = size;
 }

 public int getsize(){
    return this.size;
 }

 public void setarr(int [] arr){
    this.arr = arr;
 }

 public int[] getarr(){
    return this.arr;
 }

 public void init(){
    int [] arr = new int[size];
    for(int i =0;i<size;i++){
        arr[i] = sc.nextInt();
    }
    setarr(arr);
 }

 //Display
 public void display(int [] arr){
    for(int i = 0; i<size;i++){
       
            System.out.print("|" + arr[i] + "|");
            // System.out.println("EVEN: " + arr[i]);
        
    }
 }
//Even
 public void displayeven(int [] arr){
    int evensum = 0;
    for(int i = 0; i<size;i++){
          
            if (arr[i]%2==0) {
                 System.out.print("EVEN: " + arr[i]);
                 System.out.println();
                 evensum = arr[i] + evensum;
            }
           
    }
    System.out.println("Even Sum: "+evensum);
 }
 //odd
 public void displayodd(int [] arr){
    int oddsum =0;
    for(int i = 0; i<size;i++){
       
            if (arr[i]%2!=0) {
                 System.out.print("ODD: " + arr[i]);
                 System.out.println();
                 oddsum = arr[i] + oddsum;
            }
    }
    System.out.println("Odd Sum: "+oddsum);

 }

 public void displaysum(int [] arr){
    int sum =0;
    for(int i = 0; i<size;i++){
       
           sum = arr[i] + sum;
        
    }
    System.out.println("Total Sum: " + sum);
 }
    
}




public class evenodd{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter size");
       int size = sc.nextInt();
       Innerevenodd s = new Innerevenodd();
       s.setsize(size);
       s.init();
       s.display(s.getarr());
       System.out.println();
       s.displayeven(s.getarr());
       System.out.println();
       s.displayodd(s.getarr());      
       System.out.println();
       s.displaysum(s.getarr());      
    }
}