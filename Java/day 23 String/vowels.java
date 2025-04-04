public class vowels{

    public static void firstoccurance(String A,char key){
       
          for(int i =0;i<A.length();i++){
            if (key == A.charAt(i)) {
              System.err.println(i);
              break;
            }
          } 
    }
    public static boolean checkkey(String A,char key){
       
          for(int i =0;i<A.length();i++){
            if (key == A.charAt(i)) {
             return true;
            }
          } 
          return false;
    }

    //how manny digit lowercase character uppercase character and symbol

    public static void strcount(String str){
        int capital = 0;
        int lowercase = 0;
        int symbol = 0;
        int digit = 0;
        for(int i =0;i<str.length();i++){
            if (str.charAt(i) >= '0' && str.charAt(i) <='9') {
                digit++;
            }
            else if(str.charAt(i) >= 'A' && str.charAt(i) <='Z'){
                capital++;
            }
            else if(str.charAt(i) >= 'a' && str.charAt(i) <='z'){
               lowercase++;
            }
            else{
                symbol++;
            }
        }
        System.out.println("Digit " + digit);
        System.out.println("capital " + capital);
        System.out.println("lowercase "+lowercase);
        System.out.println("symbol " + symbol );
      
    }

    public static void lastoccurance(String A,char key){
       
          for(int i =A.length()-1;i>=0;i--){
            if (key == A.charAt(i)) {
              System.err.println(i);
              break;
            }
          } 
    }
    public static void count(String A,char key){
        int count = 0;
          for(int i =0;i<A.length();i++){
            if (key == A.charAt(i)) {
                count++;
            }
          }
          System.out.println(count);
    }
     
    public static void uppercase(String str) {
      String str1 = " ";
      for(int i =0;i<str.length();i++){
        if (str.charAt(i) == 97) {
          str.charAt(i) = 65;
        }
      }

    }

    public static void vowel(String A) {
        int count = 0;
        for(int i = 0; i<A.length();i++){
            if (A.charAt(i) == 'a' ||A.charAt(i) == 'A' ) {
              count++;
            }
            else if(A.charAt(i) == 'e' ||A.charAt(i) == 'E' ){
                count++;
            }
            else if(A.charAt(i) == 'i' ||A.charAt(i) == 'I' ){
                count++;
            }
            else if(A.charAt(i) == 'o' ||A.charAt(i) == 'O' ){
                count++;
            }
            else if(A.charAt(i) == 'u' ||A.charAt(i) == 'U' ){
                count++;
            }
           
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
      String str = "Ajinkya@123";
       strcount(str);
     
    }
}
