import java.util.Scanner;

class Employee {
    private int id;
    private long num;
    private String address;
    private String gender;

    public void setid(int id) {
        this.id = id;
    }

    public int getid() {
        return this.id;
    }

    public void setnum(long num) {
        this.num = num;
    }

    public long getnum() {
        return this.num;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public String getaddress() {
        return this.address;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }

    public String getgender() {
        return this.gender;
    }

    public void display() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + num);
        System.out.println("Address : " + address);
        System.out.println("Gender : " + gender);
    }

}

public class encap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE");

        int size = sc.nextInt();
        Employee[] E = new Employee[size];

        for(int i = 0 ; i < size; i++){
            E[i] = new Employee();
            System.out.println("ENTER ID");
            E[i].setid(sc.nextInt());
           
            System.out.println("ENTER NUM");

            E[i].setnum(sc.nextInt());
            sc.nextLine();
            System.out.println("ENTER Address");

            E[i].setaddress(sc.nextLine());
            System.out.println("ENTER Gender");

            E[i].setgender(sc.nextLine());

          
            
        }
       
       System.out.println();
        for(int j = 0;j<size;j++){
            System.out.println( "INFORMATION ABOUT EMP " + (j+1));

            E[j].display();

            System.out.println();

        }
    }
}
