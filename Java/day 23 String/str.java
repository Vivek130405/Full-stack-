public class str{
    public static boolean isEmpty(String s1) {
       if(s1.length()>0)
       {
        return false;
       }
       else {
        return true;
       }
    }
    public static void main(String[] args){
        String str; //declaration
        String s5 = "Anand" + "Barge";
        String s6 = "Anand";
        String s7 = s6.concat("Barge");
        System.out.println(s5==s6);
         //String methods
         //isEmpty()
         String s2 = "";
         System.out.println(s2.isEmpty());
         System.out.println(isEmpty(s2));

        
    }
}