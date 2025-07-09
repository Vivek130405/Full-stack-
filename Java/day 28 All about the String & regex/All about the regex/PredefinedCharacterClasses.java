import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PredefinedCharacterClasses {
    public static void main(String[] args){
        Pattern p = Pattern.compile("."); //Its Finding Space
        Matcher m = p.matcher("a7b k@9");
        int count = 0;
        while (m.find()) {
            count++;
            System.out.println(m.start() + "....." + m.group());
        }
        System.out.println("Occurance " + count);
    }
}
/* some of predefined Character Classes are 
\\s,\\S,\\d,\\D,\\w,\\W,.,
this classes are well explained in notes 
so refer notes */
