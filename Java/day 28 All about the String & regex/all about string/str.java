//Note Symbols,spaces,character,digits,letter are part of string 

import java.util.Scanner;

public class str {
    // 1.count the char in string
    public static void count_char(String str) {
        System.out.println(str.length());
    }

    // 2. Using Length method check the string Empty or not

    public static void isStringEmpty_usingLengthMethod(String str) {
        if (str.length() == 0) {
            System.out.println("The String is Empty/Null");
        } else {
            System.out.println("String is Not Empty");
        }
    }

    // 3. check String is empty or not using .equals() method

    public static void isStringEmpty_usingEqualsMethod(String str) {
        if (str.equals("")) {
            System.out.println("Empty");
        } else {
            System.out.println("Not Empty");
        }
    }

    // 4. implement trim() method
    public static void implement_trim(String str) {
        System.out.println(str.trim());
    }

    // 5. Using trim and length method to check the string is empty or not

    public static void isempty(String str) {
        if (str.trim().length() == 0) {
            System.out.println("Empty");
        } else {
            System.out.println("Not Empty");
        }
    }

    // 6. isEmpty Method

    public static void str_isEmpty(String str) {
        System.out.println(str.isEmpty());
    }

    // 7. Using trim and Empty method to check the string is empty or not

    public static void is_empty(String str) {
        if (str.trim().isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println("Not Empty");
        }
    }

    // 8. calculate string length using comapare to method
    public static void is_compare_method(String str, String str1) {
        System.out.println(str.compareTo(str1));
    }

    // 9. compare method to find the length of string
    public static void find_length_String(String str) {
        System.out.println(str.compareTo(""));
    }

    // 10. compare methods program tricky (IMP)
    public static void com_pare() {
        String str1 = "ab";
        String str2 = "ab";
        System.out.println(str1.compareTo(str2));

        String str3 = "aB";
        String str4 = "aB";
        System.out.println(str3.compareTo(str4));

        String str5 = "Ab";
        String str6 = "Ab";
        System.out.println(str5.compareTo(str6));

        String str7 = "ABC";
        String str8 = "aBc";
        System.out.println(str7.compareTo(str8));

        String str9 = "Ab";
        String str10 = "aB";
        System.out.println(str9.compareTo(str10));
    }

    // 11. concat method

    public static void concat_String(String str, String str1) {
        System.out.println(str.concat(str1));
    }

    // 12. subsequence method
    public static void subsquence_method(String str, int beginindex, int endindex) {
        System.out.println(str.subSequence(beginindex, endindex));
    }

    // 13. substring method
    public static void substring_method(String str, int beginindex, int endindex) {
        System.out.println(str.substring(beginindex, endindex));
    }

    // 14. Join method

    public static void join_method(String str1, String str2) {
        System.out.println(String.join(",", str1, str2));
    }

    // 15. Reverse the String && pallindrome

    public static void reverse_String(String str) {
        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str1 = str1 + str.charAt(i);
            System.out.print(str.charAt(i));
        }
        System.out.println();
        if (str.equals(str1)) {
            System.out.println("Pallindrome");
        } else {
            System.out.println("Not Pallindrome");
        }
    }

    // OR
    public static String rreverse_String(String str) {
        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str1 = str1 + str.charAt(i);

        }
        return str1;
    }

    // 16. less occur and more occur character in string

    public static void less_more_occur(String str) {
        int[] arrayy = new int[127];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < str.length(); i++) {
            arrayy[str.charAt(i)] = arrayy[str.charAt(i)] + 1;
        }
        for (int i = 0; i < arrayy.length; i++) {
            System.out.println("index " + i + "value " + arrayy[i]);
        }
        for (int i = 0; i < arrayy.length; i++) {
            if (arrayy[i] > max) {
                max = arrayy[i];
            }
            if (arrayy[i] < min) {
                min = arrayy[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

        for (int i = 0; i < arrayy.length; i++) {
            if (arrayy[i] == max) {
                System.out.println("More occur " + (char) (i));
            }

            if (arrayy[i] == min + 1) {
                System.out.println("less occur " + (char) (i));
            }

        }
    }

    // 17. Count the word in the String

    public static void count_word(String str) {
        int count = 0;

        str = str.trim();

        if (str.isEmpty()) {
            System.out.println("Number of Words: 0");
            return;
        }

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                count++;
            }
        }

        System.out.println("Number of Words: " + (count + 1));
    }

    // 18. Find Duplicate character in string

    public static void duplicate_char(String str) {
        int[] arrayy = new int[127];
        for (int i = 0; i < str.length(); i++) {
            arrayy[str.charAt(i)] = arrayy[str.charAt(i)] + 1;
        }
        for (int i = 0; i < arrayy.length; i++) {
            if (arrayy[i] >= 2) {
                System.out.println("duplicate character are " + (char) (i) + " Apperance " + arrayy[i]);
            }
        }
    }

    // 19. remove given character in String

    public static void remove_character(String str, char c) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != c) {
                result += str.charAt(i);
            }
        }

        System.out.println(result);
    }

    // 20. remove all duplicate character from string

    public static void remove_all_duplicates(String str) {
        int[] arrayy = new int[127];
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            arrayy[str.charAt(i)] = arrayy[str.charAt(i)] + 1;
        }

        for (int i = 0; i < str.length(); i++) {
            if (arrayy[str.charAt(i)] == 1) {
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }

    // 21. remove character from first string which are present in second string
    // Vivek
    // kimal

    public static void remove_char_String_first(String str, String str1) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean found = false;

            for (int j = 0; j < str1.length(); j++) {
                if (ch == str1.charAt(j)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                result += ch;
            }
        }

        System.out.println("Result: " + result);
    }

    // 22. Find First not repetting character

    public static void first_non_repeating(String str) {
        int[] arrayy = new int[127];
        char ch = '\0';
        for (int i = 0; i < str.length(); i++) {
            arrayy[str.charAt(i)] = arrayy[str.charAt(i)] + 1;
        }
        for (int i = 0; i < str.length(); i++) {
            if (arrayy[str.charAt(i)] == 1) {

                ch = str.charAt(i);
                break;
            }
        }
        System.out.println(ch);
    }

    // 23. Anagram string

    public static void Anagram(String str, String str1) {
        if (str.length() != str1.length()) {
            System.out.println("Not Anagram");
            return;
        }
        int[] arrayy = new int[127];
        int[] arrayy1 = new int[127];
        for (int i = 0; i < str.length(); i++) {
            arrayy[str.charAt(i)] = arrayy[str.charAt(i)] + 1;
        }
        for (int i = 0; i < str1.length(); i++) {
            arrayy1[str.charAt(i)] = arrayy1[str.charAt(i)] + 1;
        }

        for (int i = 0; i < arrayy.length; i++) {
            if (arrayy[i] != arrayy1[i]) {
                System.out.println("Not Anagram");
                return;
            }
        }

        System.out.println("Anagram");

    }

    // 24. Write a program for separate string base on the ",";
    // Input => "Apple,Banana,Cat"
    // Output => ["Apple","Banana","Cat"]

    public static void separate_string() {
        String input = "Apple,Banana,Cat";
        String[] result = new String[10];
        int index = 0;
        String temp = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch != ',') {
                temp += ch;
            } else {
                result[index++] = temp;
                temp = "";
            }
        }
        result[index++] = temp;

        System.out.print("Output => [");
        for (int i = 0; i < index; i++) {
            System.out.print("\"" + result[i] + "\"");
            if (i != index - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    // //25. All permutation of String
    // input => "abb"
    // output => "abb","abb","bab","bba","bab","bba"
    // input => "ABC"
    // output => "ABC","ACB",CAB,BAC,"BCA",CBA,

    public static void String_permutation(String str) {
        String[] arrayy = new String[10];
        int index = 0;
        StringBuffer sb = new StringBuffer(str);
        if (str.length() == 2) {
            arrayy[index] = str;
            index++;
            arrayy[index] = rreverse_String(str);
            return;
        } else {
            int end = str.length() - 1;
            for (int i = 0; i < str.length(); i++) {
                char temp = str.charAt(end);
                arrayy[++index] = str.replace(str.charAt(end - 1), temp);
                end--;
            }
        }

        for (int i = 0; i <= index; i++) {
            System.out.print("|" + arrayy[i] + "|");
        }

    }

    // 26. Tolowercase

    public static void Tolowercase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {

                result = result + (char) (str.charAt(i) + 32);
            } else {
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }

    // 27. Tolowercase

    public static void ToUpperCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {

                result = result + (char) (str.charAt(i) - 32);
            } else {
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }

    // 28. Single digit to word

    public static void digit_to_word(int num) {
        String[] str = { "zero", "one", "two", "three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
        if (num >= 0 && num <= 9) {
            System.out.println(str[num]);
        } else {
            System.out.println("Invalid input");
        }
    }

    // 29. Multi Digit to word
    // => 123
    // => one two three
    public static void multidigit_to_word(int num) {
        String[] str = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        String numStr = Integer.toString(num);
        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0';
            System.out.print(str[digit] + " ");
        }
    }

    //30. Number to word
    // => 123
    // => one hunderd twenty three

    //31. String Game
    public static void String_game(){
        System.out.println("Enter the guessing String ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
       StringBuffer result = new StringBuffer("");
        for(int i = 0;i<str.length();i++){
            result = result.append('_');
        }
        int index = 0;
       while (true) {
         if (index == str.length() && result.charAt(index-1) != '_') {
            System.out.println(result);
            System.out.println("******************* YOU-WON *********************");
            return;
        }
        System.out.println(result);
        System.out.println("Enter the Character ");
        char temp = sc.nextLine().charAt(0);
        if (temp == str.charAt(str.indexOf(temp))) {
          result.setCharAt(str.indexOf(temp), temp);
            index++;
        }
        else{
            System.out.println("Does not Match");
        }
       
       }
    }
    public static void main(String[] args) {
        // count_char("Vivek");
        // isStringEmpty_usingLengthMethod("Vivek");
        // isStringEmpty_usingLengthMethod(" "); // There is fault in length method it
        // can count the spaces so in this case it will give output "String is Not
        // Empty"
        // isStringEmpty_usingEqualsMethod("Vivek");
        // implement_trim(" Vivek ");
        // isempty("Vivek");
        // isempty(" ");
        // str_isEmpty("Vivek");
        // str_isEmpty(" ");
        // is_empty("Vivek");
        // is_empty(" ");
        // is_compare_method("Vivek","VIvek");
        // find_length_String("Vivek");
        // join_method("Vivek", "Patil");

        // reverse_String("MadaM");
        // less_more_occur("BBCAAA");
        // count_word("Vivek Amar ");
        // duplicate_char("vivekkkkkkkiilll");
        // remove_character("ivvek", 'v');
        // remove_all_duplicates("AiAekk Amar");
        // remove_char_String_first("Vivek", "kiran");
        // first_non_repeating("geeksfgeeksa");
        // Anagram("vivek", "ivevk");
        // separate_string();
        // String_permutation("ABC");
        // Tolowercase("VIVEK@AMAR");
        // ToUpperCase("vivek@amar");
        // digit_to_word(8);
        // multidigit_to_word(123);
        String_game();
        
    }
}