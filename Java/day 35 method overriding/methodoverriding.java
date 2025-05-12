class parent{
    public void marry(){
        System.out.println("Arti");
    }
    public void display(){
        System.out.println("Parent");
    }
}


class child extends parent{
    
    @Override
    public void marry(){
        //super.marry();
        System.out.println("Kanchan");
    }

    @Override
    public void display(){
        System.out.println("Child Overide method");
    }

    
    public void childDisplay(){
        System.out.println("Child");
    }
}

public class methodoverriding{
    public static void main(String[] args) {
        child p = new child();//Upcasting 
        p.marry();//child methods call because method overridding
        p.display();// parent call because method overridding

        p.childDisplay();// child  call no method override
        
        
    }
}