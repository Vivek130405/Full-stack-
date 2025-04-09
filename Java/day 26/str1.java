public class str1{
    public static void display(String str){
        for(int i =0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
    public static void upperdisplay(String str){
        for(int i =0;i<str.length();i++){
           if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
            System.out.print(str.charAt(i));
           }
        }
        System.out.println();
    }
    public static void digitdisplay(String str){
        for(int i =0;i<str.length();i++){
           if (str.charAt(i) >= 47 && str.charAt(i) <= 57) {
            System.out.print(str.charAt(i));
           }
        }
        System.out.println();
    }
    public static void symboldisplay(String str){
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
           if (!(ch >='A' && ch<='Z') && !(ch>='a' && ch<='z') && !(ch>= 47 && ch<=57) && ch!=' ') {
            System.out.print(str.charAt(i));
           }
        }
        
    }
    public static String reverseString(String Str,int start,int end){
        String str2 = "";
        for(int i =end; i>=start;i-- ){
            str2 += Str.charAt(i);
        }
       return str2;
    }
    public static void countduplicate(String str){
      
        for(int i =0;i<str.length();i++){
            int count = 0;
           for(int j =0;j<i;j++){
            if (str.charAt(i)==str.charAt(j)) {
               count++;
            }
           }
           System.out.println(str.charAt(i) + " " + count);
        }
        
    }
    public static void removeduplicate(String str,char key) {
        String str1= "";
        for(int i =0;i<str.length();i++){
            if (!(str.charAt(i) == key)) {
              
                str1 += str.charAt(i);
            }
        }
        System.out.println(str1);
    }

    //Vivek patil
    //keviV litap
    public static void wordreverseString(String str){
        int start =0;
        int end = 0;
        String str1 = "";
       
        for(int i =0;i<str.length();i++){
           if (str.charAt(i) == ' ' || i == str.length()-1) {
            end = i;
           
            str1 += reverseString(str,start,end) + ' ' ;
            start = i+1;
           }
        }
        System.out.println(str1.trim());
    }
    
    //vivek patil
    //patil vivek
    public static void word_content_reverse(String str){
        String str1 = "";
        String str2 = "";
        for(int i = str.length()-1;i>=0;i--){
            str1 += str.charAt(i);
        } 
        System.out.println(str1);
        int start =0;
        int end = 0;
       
        for(int i =0;i<str1.length();i++){
           if (str1.charAt(i) == ' ' || i == str1.length()-1) {
            end = i;
            str2 += reverseString(str1,start,end) + ' ';
            start = i+1;
           }
        }
        System.out.println(str2);
    }
    public static void Vivek(String s)
    {                                                                                                               
        s=s.trim();
        StringBuffer sb=new StringBuffer();
        int start=s.length()-1;
        int end=s.length();
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ' && i!=0)
            {
                start--;
            }
            else if(s.charAt(i)==' ')
            {
                if(start+1!=end){                                                 //condition depends on question
                    sb.append(s,start+1,end).append(" ");
                }
                start--;
                end=i;
            }
            else if(i==0)
            {
                sb.append(s,start,end);
            }
        }
        System.out.println(sb);
    }
    public static void Rahul(String str){
        str=str.trim();
        StringBuffer sb=new StringBuffer();
        int start=str.length()-1;
        int end=str.length();
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' ' && i!=0){
                start--;
            }
            else if(str.charAt(i)==' '){
                if(start+1!=end){
                    sb.append(str,start+1,end).append(" ");
                }
                start--;
                end=i;
            }
            else if(i==0){
                sb.append(str,start,end).append(" ");
            }
        }
        String s1=sb.toString();
        System.out.println(s1);
    }
    public static void anagram()
    {
        String s1="listen@67";
        String s2="silent#67";
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        int max=Integer.MIN_VALUE;
        
        if(s1.length()!=s2.length())
        {
            System.out.println("not angram");
            return;
        }
        for(int i=0;i<s1.length();i++)
        {
            if(max<s1.charAt(i))
            {
                max=s1.charAt(i);
            }
            if(max<s2.charAt(i))
            {                                                                   //c=[0,0,0,0,0];
                max=s2.charAt(i);
            }
        }
        int [] count_array=new int[max+1];
        for(int i=0;i<s1.length();i++)
        {
            count_array[s1.charAt(i)]=count_array[s1.charAt(i)]+1;        //listen  l=120

        }
        for(int i=0;i<s2.length();i++)
        {
            count_array[s2.charAt(i)]=count_array[s1.charAt(i)]-1;        //listen  l=120

        }
        int anagram=0;
       
        for(int i=0;i<max+1;i++)
        {
            if(count_array[i]!=0)
            {
                System.out.println("not anagram");
                anagram++;
                break;
            }
        }
        if(anagram==0)
        {
            System.out.println("strings are anagram");
        }
    }
    public static void degit(int number)
    {
        String degit[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        StringBuffer sb=new StringBuffer();
        int reminder;
        while(number>0)
        {
            reminder=number%10;
            sb.append(degit[reminder]).append(" ");
            number=number/10;
        }
        
        String s=sb.toString();
        Vivek(s);
    }
    public static void main(String[] args) {
       String str = "vivek vivek patil";
       String str1 = "vivek vivek patil";
    //    display(str);
    //    upperdisplay(str);
    //     digitdisplay(str);
    //     symboldisplay(str);
    //     System.out.println();
       
    // wordreverseString(str);
    //Rahul("                                          anand pradip                barge");
   // anagram();'
degit(1234);
}
}
