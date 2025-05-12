class overloding {
    public void display(double a){
        System.out.println("Hello");
    }

    public void display(Integer a){
        System.out.println("Hi");
    }

}



public class methodoverloading{
    public static void main(String[] args) {
        overloding o = new overloding();
        o.display(10);
    }
}