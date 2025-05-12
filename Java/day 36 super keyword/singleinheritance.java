//using constructor assign value to private variable and display it (DO not use get,set)

class parent{
     private int id;
    parent(int id){
        this.id = id;
    }
    public void display(){
        System.out.println("Parent :" + id);
    }
}
class child extends parent{
    private int child_id;
    child(int child_id,int id){
        super(id);
        this.child_id = child_id;
       
        // System.out.println(child_id);
       
    }
    public void display(){
        //super.id = 11;
        System.out.println(child_id);
        super.display();
    }
        
}

public class singleinheritance{
    public static void main(String[] args) {
        child c = new child(1, 10);
        c.display();
    }
}