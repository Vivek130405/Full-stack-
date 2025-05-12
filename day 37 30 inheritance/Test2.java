// 2. Take employee data using constructor and print details including company name (use set/get for company only)
import java.util.Scanner;

class Company {
    private String companyname;
    public void setCompanyName(String companyname) {
        this.companyname = companyname;
    }
    public String getCompanyName() {
        return this.companyname;
    }
}
class Employee extends Company {
    private int id;
    private String name;
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
}
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e[] = new Employee[sc.nextInt()];
        for (int i = 0; i < e.length; i++) {
            String name = sc.next();
            int id = sc.nextInt();
            e[i] = new Employee(id, name);
            String cname = sc.next();
            e[i].setCompanyName(cname);
        }
        for (int i = 0; i < e.length; i++) {
            System.out.println("**********Output**********");
            System.out.println(e[i].getId());
            System.out.println(e[i].getName());
            System.out.println(e[i].getCompanyName());
        }
    }
}
