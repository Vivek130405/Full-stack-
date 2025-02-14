import java.util.Scanner;

class student {
    private int id=1;
    private String name="vivek";
    private String Address="jalgaon";
    private String gender="Male";

    public int getid() {
        return this.id;
        
       
       
    }

    public String getname(){
        return this.name;
    }
    public String getAddress(){
        return this.Address;
    }
    public String getgender(){
        return this.gender;
    }

    student() {
        System.out.println("Default Constructor");
    }

    student(int id, String name, String Address, String gender) {
        this.id = id;
        this.name = name;
        this.Address = Address;
        this.gender = gender;
    }

}

public class cons {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
            
        student[] s = new student[2];

        for (int i = 0; i < 2; i++) {
            // default constructor
            
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String Address = sc.nextLine();
            String gender = sc.nextLine();
            s[i] = new student(id, name, Address, gender);

            // parameterized constructor
            s[i] = new student(); 


        }

        for (int j = 0; j < 2; j++) {
            System.out.println(s[j].getid());
            System.out.println(s[j].getname());
            System.out.println(s[j].getAddress());
            System.out.println(s[j].getgender());
        }
    }
}