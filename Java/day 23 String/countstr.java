public class countstr {
    public static void countst(String str) {
        int upperCase =0;
        int lowercase = 0;
        int symbol = 0;
        int digit =0;
        for(int i =0;i<str.length();i++){
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
              lowercase++;
            }
            else if(str.charAt(i) >= 65 && str.charAt(i) <= 90){
                upperCase++;
            }
            else if(str.charAt(i) >= 48 && str.charAt(i) <= 57){
                digit++;
            }
            else{
                symbol++;
            }
        }
        System.out.println("Capital Count " + upperCase);
        System.out.println("lower Count " + lowercase);
        System.out.println("Symbol Count " + symbol);
        System.out.println("digit Count " + digit);
    }
    public static void lowerCase(String str){
        String str1 = "";
     
        for(int i =0;i<str.length();i++){
           
           if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
             str1 += (char)(str.charAt(i) - 32) ;
           }
           else{
            str1 += str.charAt(i);
           }
          
            
        }
        System.out.println(str1);
    }
    public static void upperCase(String str){
       String str1 = "";
     
        for(int i =0;i<str.length();i++){
           
           if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
             str1 += (char)(str.charAt(i) + 32) ;
           }
           else{
            str1 += str.charAt(i);
           }
          
            
        }
        System.out.println(str1);
    }
    
    public static void main(String[] args) {
        String s2 = "anand@123";
       lowerCase(s2);
    }
}
