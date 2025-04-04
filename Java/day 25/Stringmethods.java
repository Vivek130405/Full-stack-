import java.util.Arrays;

public class Stringmethods {
    public static void main(String[] args) {
        String str = "Patil";
        System.out.println(str.substring(1,2));
        System.out.println(str.length()); 
        String str1 = "Patil"; 
        System.out.println(str1.replace('a', 'o'));
        String str2 = "Patil"; 
        System.out.println(str2.repeat(3));
        String str4 = "Patil Vivek";
       
        System.out.println(Arrays.toString(str4.split(" ")));
        String str3 = " Patil   ";
        System.out.println(str3.trim());
        StringBuffer s1 = new StringBuffer("Vivek Amar Patil");
        System.out.println(s1.reverse());
    }
}
