import java.util.Scanner;

class Parent{
    private int id;
    public void setid(int id){
        this.id = id;

    }
    public int getid(){
        return this.id;
    }
}

// class child{
//     private Parent parent=new Parent();
//     public void setparent(Parent p){
//         this.parent = p;
//     }
//     public Parent getParent(){
//         return this.parent;
//     }
// }

class student{
    private int rollno;
    private String name;
    public void setrollno(int rollno){
        this.rollno = rollno;
    }
    public int getrollno(){
        return this.rollno;
    }
    public void setname(String name){
        this.name = name;
    }
    public String getname(){
        return this.name;
    }

}
class department{
    private student s= new student();
    private Parent parent=new Parent();
    public void setstudent(student s){
        this.s = s;
    }
    public student getstudent(){
        return this.s;
    }
    public void setparent(Parent p){
        this.parent = p;
    }
    public Parent getParent(){
        return this.parent;
    }
}

public class inheri{
    public static void main(String[] args) {
        // child c = new child();

        // Parent parent=new Parent();
        // parent.setid(1);
        // c.setparent(parent);

        // //c.getParent().setid(12);
        // System.out.println(c.getParent().getid());
        Scanner sc = new Scanner(System.in);

        department [] dp = new department[2];
         for (int i = 0; i < dp.length; i++) {
            dp[i] = new department();
            dp[i].getstudent().setrollno(sc.nextInt());
            sc.nextLine();
            dp[i].getstudent().setname(sc.nextLine());

         }
         for (int i = 0; i < dp.length; i++) {
            System.out.println("Output");
            System.out.println( dp[i].getstudent().getrollno());
            System.out.println(dp[i].getstudent().getname());
         }
        
        // dp.getstudent().setrollno(12);
        // System.out.println(dp.getstudent().getrollno());
        // dp.getstudent().setname("Vivek");
        // System.out.println(dp.getstudent().getname());


    }
}