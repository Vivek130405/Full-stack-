import java.util.Scanner;

class Innernumbers {
  private int size;
  private int[] arr;
  private int[] reverse;
  private int perfect;
  private int pallindrome;
  private int spy;
  private int harshad;
  private int neon;
  private int automorphic;

  
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

  public void setreverse(int[]  reverse){
    this.reverse = reverse;
  }
  public int[] getreverse(){
   return this.reverse;
  }
  public void setperfect(int  arr){
    this.perfect = perfect;
  }
  public int getperfect(){
   return this.perfect;
  }
  public void setpallindrome(int  pallindrome){
    this.pallindrome = pallindrome;
  }
  public int getpallindrome(){
   return this.pallindrome;
  }
  public void setspy(int  spy){
    this.spy = spy;
  }
  public int getspy(){
   return this.spy;
  }
  public void setharshad(int  harshad){
    this.harshad = harshad;
  }
  public int getharshad(){
   return this.harshad;
  }
  public void setneon(int  neon){
    this.neon = neon;
  }
  public int getneon(){
   return this.neon;
  }
  public void setautomorphic(int  automorphic){
    this.automorphic = automorphic;
  }
  public int getautomorphic(){
   return this.automorphic;
  }

//   public void init(){
//     int[] arr = new int[size];
//     for(int i = 0; i<size;i++){
//         System.out.println("Enter element");
//         arr[i] = sc.nextInt();
//     }
//     setarr(arr);
//   }

  public int[] reverse(){
    int[] arr = new int[size];
    int first = 0;
    int last = arr.length-1;
    while (first<=last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
        first++;
        last--;
    }
    return arr;
  }

  public void display(int [] arr){
    for(int i =0;i<arr.length;i++){
        System.out.print("|" + arr[i] + "|");
    }
  }

    
}




public class numbers {
    static Scanner sc = new Scanner(System.in);

    public static int[] init(){
        int[] arr = new int[5];
        for(int i = 0; i<arr.length;i++){
            System.out.println("Enter element");
            arr[i] = sc.nextInt();
        }
        return arr;
      }

    public static int[] reverse( int[] arr){
       
        int first = 0;
        int last = arr.length-1;
        while (first<=last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        return arr;
      }
    
      public static void display(int [] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print("|" + arr[i] + "|");
        }
      }

    public static void main(String[] args) {
       int [] arr1 = init();
       display(reverse(arr1));
    }
}

