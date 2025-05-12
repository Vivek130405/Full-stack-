import java.util.Scanner;

public class inher {
    static  Scanner sc = new Scanner(System.in);
 public static void main(String[] args) {
    System.out.println("Enter Total department");
    int deptsize = sc.nextInt();
    department[] d = new department[deptsize];
    for (int i = 0; i < d.length; i++) {
        System.out.println("Enter department Name");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Enter department size");
        int size = sc.nextInt();
        d[i] = new department( size,name);
    }
    for (department dep : d) {
        dep.setStudentdetails();
    }
    for (department dep : d) {
        dep.topper();
    }
 }
    
}

class student{
    private int id;
    private String name;
    private double per;

    student(int id, String name, double per) {
        this.id = id;
        this.name = name;
        this.per = per;
    }

    public double getper(){
        return this.per;
    }
    public void display() {
      
            System.out.println("Id :" + id + " Name :" + name + " percentage :" + per);
        
    }

}
class department{
    private String name;
   private student [] student;
   double max = Integer.MIN_VALUE;
    department(int size,String name){
        this.name = name;
        student = new student[size];
    }

    public void setStudentdetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Department :" + name);
        for (int i = 0; i < student.length; i++) {
            System.out.println("Enter Your ID ");
            int id = sc.nextInt();
            System.out.println("Enter the Name ");
            sc.nextLine();
            String name = sc.nextLine();
           
            System.out.println("Enter the Percentage");
            double per = sc.nextDouble();
            student[i] = new student(id, name, per);
        }
    }

    public void topper(){
        for (int i = 0; i < student.length; i++) {
            if (student[i].getper() > max) {
               max = student[i].getper();
            }
        }
        System.out.println("Department :" + name);
        System.out.println(max);
    }

    public void display(){
        System.out.println();
        System.out.println("*********OUTPUT**********");
        System.out.println("Department :" + name);
        for (int i = 0; i < student.length; i++) {
            student[i].display();
        }
    }
}