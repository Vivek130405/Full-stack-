import java.util.Scanner;

class employee{
   
    private int id;
    private String name;
    private int salary;
    employee(int id,String name,int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getsalary(){
        return this.salary;
    }
    public void display(){
        System.out.println("ID :" + id + "Name :" + name + "Salary :" + salary);
    }
}

class company{
    int max1 = Integer.MIN_VALUE;
    int max2 = Integer.MIN_VALUE;
    int max3 = Integer.MIN_VALUE;
    static Scanner sc = new Scanner(System.in);
    private String name;
    private employee [] employees;
    company(int size,String name){
        this.name = name;
        employees = new employee[size];
    }

    public void setemployees(){
        System.out.println("Company Name :" + name);
       for (int i = 0; i < employees.length; i++) {
        System.out.println("Enter the ID ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Name");
        String name = sc.nextLine();
        
        System.out.println("Enter the Salary");
        int salary = sc.nextInt();
        employees[i] = new employee(id, name, salary);
       }
    }

    public void topthree(){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getsalary() > max1) {
                max3 = max2;
                max2 = max1;
                max1 = employees[i].getsalary();
            }
            else if(employees[i].getsalary() < max1 && employees[i].getsalary() > max2 && employees[i].getsalary() > max3 ){
                max3 = max2;
                max2 = employees[i].getsalary();
            }
            else if(employees[i].getsalary() < max1 && employees[i].getsalary() < max2 && employees[i].getsalary() > max3){
                max3 = employees[i].getsalary();
            }
        }
        System.out.println("Company Name :" + name);
        System.out.println("Salary 1st :" + max1);
        System.out.println("Salary 2nd :" + max2);
        System.out.println("Salary 3rd :" + max3);
    }
  
    public void display(){
       
        System.out.println("Company Name :" + name);
        for (int i = 0; i < employees.length; i++) {
            employees[i].display();
        }
    }
}

public class inher {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Enter the Total Companies");
        int compsize = sc.nextInt();
        company [] c = new company[compsize];
        for (int i = 0; i < c.length; i++) {
            System.out.println("Enter the company name ");
            String comp_name = sc.nextLine();
           
            System.out.println("Enter the Total Employee Range ");
            int erange = sc.nextInt();
            c[i] = new company(erange, comp_name);
        }

        for (company company : c) {
            company.setemployees();
        }
        for (company company : c) {
            company.topthree();
        }
    }
}