class iffelse{
    private int number;
    public static boolean leap(int a) {
        if (a%400 == 0 || (a%100 != 0 && a%4==0)) {
            return true;
        }
        else{
            return false;
        }
    }
    public static int greatest(int a,int b,int c){
        if (a>b && a>c) {
           
                return a;
           
        }
        else if(b>c){
            return b;
        }
        else{
            return c;
        }
    }

   
    public void setnumber(int num){
        this.number = num;
    }
    public  int getnumber(){
      return this.number;
    }

}


public class classifelse {
    public static void main(String[] args) {
        iffelse Iffelse = new iffelse();

        //  boolean leapyear=iffelse.leap(1900);
        //  System.out.println(leapyear);

        //  int a = iffelse.greatest(1, 10, 2);
        //  System.out.println(a);
         Iffelse.setnumber(20);
         System.out.println(Iffelse.getnumber());



    }
}
