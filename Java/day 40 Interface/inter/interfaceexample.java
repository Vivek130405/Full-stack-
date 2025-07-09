
     interface ATM {
    public void add(int index,int value);
        
    }
     
class A implements ATM{
    int [] arr = new int[5];
    public void add(int index,int value){
        arr[index] = value;
       
    }
     public void display(){
         try {
            System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);
        } catch (Exception e) {
           System.out.println(e);
        }
     }
}

// abstract class ATM{
// static int minimumbalace;
// }

public class interfaceexample {

    public static void main(String[] args) {
        // System.out.println( ATM.minimumbalace );
        // ATM.minimumbalace = 10;
        // System.out.println( ATM.minimumbalace );
        A a = new A();
        a.add(0,10);
        a.add(1,10);
        a.add(2,10);
        a.add(3,10);
        a.add(4,10);
       
           try {
             a.add(5,10);
           } catch (Exception e) {
          System.out.println(e);
           }
     
          
      a.display();
    }
}