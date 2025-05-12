import java.util.*;
class employee{
    private int id;
    private String name;
    private int salary;
    employee(int id,String name,int salary){
        this.id =id;
        this.name = name;
        this.salary = salary;
    }
    public void display(){
        System.out.println("Id :" + id + " name :" + name + " Salary :" + salary);
    }
    public int getsalary(){
        return this.salary;
    }
}

class company{
    private employee [] employees;
    private String name;
    company(int size , String name){
        this.name = name;
        employees = new employee[size];
    }
    public void employeedeatails(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Enter the deatails of " + name + " employess");
            System.out.println("Enter the Employee id ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the Employee Name ");
            String name = sc.nextLine();
            System.out.println("Enter the Employee salary ");
            int salary = sc.nextInt();
            employees[i] = new employee(id, name, salary);
        }
    }
    public void display(){
        System.out.println(name);
        for (int i = 0; i < employees.length; i++) {
            if(name == "thomascook" && employees[i].getsalary() > 20000 ){
            employees[i].display();
            }
        }
    }
}

public class inher2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the total company");
        int comsize = sc.nextInt();
        company [] c = new company[comsize];
        for (int i = 0; i < c.length; i++) {
            System.out.println("Enter Strength of employes");
            int size = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Your Company Name");
            String name = sc.nextLine();
            c[i] = new company(size, name);
        }
        for (company company : c) {
            company.employeedeatails();
        }
        for (company company : c) {
            company.display();
        }
    }
}
