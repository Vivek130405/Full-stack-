public class count{
    //Anand Logic
    public static void countchar(String str){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>max) {
                max=str.charAt(i);
            }
        
    }
    int[] count_array = new int[max+1];
    for(int i=0;i<str.length();i++)
    {
        count_array[str.charAt(i)]=count_array[str.charAt(i)]+1;      

    }

    for (int i = 0; i < max+1;i++) {
      
        if(count_array[i]>0){
            System.out.println((char)(i)+"- "+count_array[i]);
        }
    
    }
}
//Sir Logic
public static void countcharacter(String str){
    String str1 ="";
    for(int i =0;i<str.length();i++){
        int count =0;
        char key = str.charAt(i);
        if (str1.indexOf(key)==-1) {
           for(int j =i;j<str.length();j++){
           if (key == str.charAt(i)) {
            count++;
           }
           } 
        System.out.println(key+ "-" + count);
        str1 += key;
        }
    }
}

    public static void main(String[] args) {
        String str = "anand";
        countcharacter(str);
       

    }
}