import java.util.regex.*;
public class str{
    public static void main(String[] args){
        Pattern p = Pattern.compile("ab");
        Matcher m = p.matcher("ababbaba");
        int count = 0;
        while (m.find()) {
            count++;
            System.out.println(m.start());
        }
        System.out.println("Occurance " + count);
    }
}