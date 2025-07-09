public class even {

    public static void even(int range){
        if (range==0) {
            return;
        }
        if(range%2==0)
         System.out.println(range);
        even(range-1);

    }
    public static void main(String[] args) {
        even(10);
    }
}


