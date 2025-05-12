import java.util.*;

class student {
    private int id;
    private String name;
    private double per;

    student(int id, String name, double per) {
        this.id = id;
        this.name = name;
        this.per = per;
    }

    public void display() {
      
            System.out.println("Id :" + id + " Name :" + name + " percentage :" + per);
        
    }
    public double getPer(){
        return this.per;
    }
}

class department {
    private String name;
    private student[] students;

    department(String name, int size) {
        this.name = name;
        this.students = new student[size];
    }

    public void setStudentdetails() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter the Deatails of " + name + " department");
            System.out.println("Enter Id");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Name");
            String name = sc.nextLine();
            System.out.println("Enter percentage");
            double per = sc.nextDouble();
            students[i] = new student(id, name, per);
        }

    }

    public void display() {

        System.out.println(name);
        for (int i = 0; i < students.length; i++) {
            if (name.equals("it") && students[i].getPer() >=80) {

                students[i].display();
            }
        }
    }
}

public class inher {
    static Scanner sc = new Scanner(System.in);

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
            d[i] = new department(name, size);
        }
        for (department dep : d) {
            dep.setStudentdetails();
        }
        for (department dep : d) {
            dep.display();
        }
    }
}