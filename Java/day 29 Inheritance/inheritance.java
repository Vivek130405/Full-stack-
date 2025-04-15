import java.util.Scanner;

class company {
    private String companyname;

    public void setcompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getcompanyname() {
        return this.companyname;
    }

}

class employee extends company {
    private int id;
    private String name;

   employee(int id,String name){
    this.id = id;
    this.name = name;
   }
        
   employee(){

   }
    public int getid(){
        return this.id;
    }
    public String getname(){
        return this.name;
    }
}

public class inheritance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        employee e[] = new employee[sc.nextInt()];
        for (int i = 0; i < e.length; i++) {
            String name = sc.next();
            int id = sc.nextInt();
          
           e[i] = new employee(id,name );
           String cName = sc.next();
           e[i].setcompanyname(cName);
          
          
        }
        for (int i = 0; i < e.length; i++) {
            System.out.println("**********Output**********");
            System.out.println(e[i].getid());
            System.out.println(e[i].getname());
            System.out.println(e[i].getcompanyname());
        }
    //     e.setid(1);
    //     e.setname("Anand");
    //     System.out.println(e.getid());
    //     System.out.println(e.getname());
    //     e.setcompanyname("m");
    //    System.out.println( e.getcompanyname());
    }
}