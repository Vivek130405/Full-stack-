import java.util.Scanner;

class student {
    private int id;
    private String name;
    private String address;

    public void setid(int id) {
        this.id = id;
    }

    public int getid() {
        return this.id;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return this.name;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public String getaddress() {
        return this.address;
    }

    public void display() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
    }

}



public class encap {
    public static void main(String[] args) {
        // student s1 = new student();
        // System.out.println("Student 1");
        // s1.setid(10);
        // s1.setname("Vivek");
        // s1.setaddress("Jalgaon");
        // s1.display();

        // System.out.println();
        // student s2 = new student();
        // System.out.println("Student 2");
        // s2.setid(20);
        // s2.setname("Pranav");
        // s2.setaddress("Pachora ");
        // s2.display();

        // System.out.println();
        // student s3 = new student();
        // System.out.println("Student 3");
        // s3.setid(30);
        // s3.setname("Pruthvi");
        // s3.setaddress("Latur");
        // s3.display();

        // System.out.println();
        // student s4 = new student();
        // System.out.println("Student 4");
        // s4.setid(40);
        // s4.setname("Vedant");
        // s4.setaddress("Pimplegaon");
        // s4.display();

        // System.out.println();
        // student s5 = new student();
        // System.out.println("Student 5");
        // s5.setid(50);
        // s5.setname("Ajinkya");
        // s5.setaddress("Jamkhed");
        // s5.display();

        // USING ARRAY

        Scanner sc = new Scanner(System.in);
        System.out.println("How many student info you Want to Enter ");
        int size = sc.nextInt();

        student[] s = new student[size];

        for (int i = 0; i < size; i++) {
            s[i] = new student();

            System.out.println("Enter the id");
            int id = sc.nextInt();
            s[i].setid(id);
            sc.nextLine();
            System.out.println("Enter the Name");

            s[i].setname(sc.nextLine());

            System.out.println("Enter the Address");

            s[i].setaddress(sc.nextLine());

        }
         System.out.println();
        for (int j = 0; j < size; j++) {
            System.out.println("Student " + (j + 1));

            s[j].display();
        }
    }
}