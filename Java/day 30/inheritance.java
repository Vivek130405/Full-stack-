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
class student extends employee{
    private int roll;
    private String name;
    public void setstudentroll(int roll){
        this.roll = roll;
    }
    public int getStudentroll(){
        return this.roll;
    }
    public void setstudentroll(String name){
        this.name = name;
    }
    public String getStudentname(){
        return this.name;
    }
    student(int eid,String ename){
        super(eid,ename);
    }
}
class teacher{
    private String name;
    public void setteacherroll(String name){
        this.name = name;
    }
    public String getteachername(){
        return this.name;
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
        student s = new student(2,"Vivek");
        s.setcompanyname("Bright Path");
        System.out.println(s.getcompanyname());
        System.out.println(s.getid());
        System.out.println(s.getname());
        // Scanner sc = new Scanner(System.in);
        // employee e[] = new employee[sc.nextInt()];
        // for (int i = 0; i < e.length; i++) {
        //     String name = sc.next();
        //     int id = sc.nextInt();
          
        //    e[i] = new employee(id,name );
        //    String cName = sc.next();
        //    e[i].setcompanyname(cName);
          
          
        // }
        // for (int i = 0; i < e.length; i++) {
        //     System.out.println("**********Output**********");
        //     System.out.println(e[i].getid());
        //     System.out.println(e[i].getname());
        //     System.out.println(e[i].getcompanyname());
        // }
    //     e.setid(1);
    //     e.setname("Anand");
    //     System.out.println(e.getid());
    //     System.out.println(e.getname());
    //     e.setcompanyname("m");
    //    System.out.println( e.getcompanyname());
    }
}