import java.util.regex.*;


public class ChracterClasses {
      public static void main(String[] args){
        Pattern p = Pattern.compile("[abc]");
        Matcher m = p.matcher("a7b@z#9");
        int count = 0;
        while (m.find()) {
            count++;
            System.out.println(m.start());
        }
        System.out.println("Occurance " + count);
    }
}
/* some of Character Classes are 
[abc],[^abc],[0-9],[a-zA-Z0-9],[^a-zA-Z0-9],[a-z]
this classes are well explained in notes 
so refer notes */