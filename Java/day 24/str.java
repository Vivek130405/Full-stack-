import java.util.Scanner;

public class str {
    public static void replacechar(String str) {
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 't') {
                str1 = str.replace(str.charAt(i), 'u');
            }

        }
        System.out.println(str1);
    }

    public static void isreplace(String str,int first,char replace){
        String str1 = "";
        for(int i=0;i<str.length();i++){
            if (i == first) {
                str1 += replace;
            }
            else{
                str1 += str.charAt(i);
            }
        }
        System.out.println(str1);
    }
    public static void reverse(String str) {
        String str1 = "";
        for(int i = str.length()-1;i>=0;i--){
           str1 += str.charAt(i);
        }
        for(int i =0;i<str1.length();i++){
            System.out.print(str1.charAt(i));
        }
    }
      


    public static void substringg(String str,int start,int end) {
        for(int i = start;i<=end && i<str.length();i++){
            System.out.print(str.charAt(i));
        }
    }


    public static void main(String[] args) {
        String str1 = "vivek amar patil";
       isreplace(str1, 2, 'u');
       reverse(str1);
    }
}