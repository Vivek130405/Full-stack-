abstract class parent{
    abstract public void display();
}

class child extends parent{
    public void display(){
        System.out.println("Hello");
    }
}

public class abstract_class{
    public static void main(String[] args) {
        child c = new child();
        c.display();
    }
}