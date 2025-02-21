 import java.util.*;
 class Innerencap_arr {
    private int size;
    public void setsize(int size){
        this.size = size;
    }
    public int getsize(){
        return this.size;
    }
    public void arr(int [] arr){
        Scanner sc = new Scanner(System.in);
       
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<arr.length;i++){
           System.out.print("|" + arr[i] + "|");
        }

    }
    
}



public class encap_arr {

    public static void main(String[] args) {
       Innerencap_arr s = new Innerencap_arr();
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       s.setsize(size);
       int [] a = new int[s.getsize()];
     
       s.arr(a);
    }
}