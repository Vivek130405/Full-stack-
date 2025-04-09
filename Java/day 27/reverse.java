public class reverse{

    public static String rev(String str,int start,int end) {
        String str1 = "";
        for(int i = end;i>=start;i--){
           str1+=str.charAt(i);
        }
        return str1;
    }
   
    public static void rev2(String s)
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
                if(start+1!=end){                                               
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
    
    public static void rev3(String str){
        str=str.trim();
String str1="";
        int start = str.length()-1;
        int end = str.length()-1;
        StringBuffer sb = new StringBuffer("");
        for(int i =str.length()-1;i>=0;i--){
           if (str.charAt(i) != ' ' && i!=0) {
            start--;
           }
           else if(str.charAt(i) == ' '){
            if (start+1 !=end) {
                str1 += (rev(str, start+1, end));
            }
            start--;
            end=i;
           }
           else if(i==0){
            str1 += (rev(str, start, end));
           }
        }
        System.out.println(str1);
    }
   
        public static void main(String[] args) {
        String str = "vivek patil";
         //keviv litap
     rev3(str);
    }
}