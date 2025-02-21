import java.util.*;

class mainstudent {
    static Scanner sc = new Scanner(System.in);
    private int rollno;
    private String name;
    private String gender;
    private double percentage;
    private int subject;
    private int[] arr;

    public void setroll(int roll) {
        this.rollno = roll;
    }

    public int getroll() {
        return this.rollno;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return this.name;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }

    public String getgender() {
        return this.gender;
    }

    public void setsub(int subject) {
        this.subject = subject;
    }

    public int getsub() {
        return this.subject;
    }

    public void setpercentage(double percentage) {
        this.percentage = percentage;
    }

    public double getpercentage() {
        return this.percentage;
    }

    public void setarr(int[] arr) {
        this.arr = arr;
      }
    
      public int[] getarr() {
        return this.arr;
      }

    public void arr(int subject){
        int [] arr = new int[subject];
        for(int i = 0; i<arr.length;i++){
            System.out.println("Enter the marks of subject " + (i+1));
            arr[i] = sc.nextInt();
        }
        setarr(arr);
    }

    public void per(int [] a){
        int sum = 0;
        for(int i = 0; i<subject;i++){
            sum = a[i] + sum;
        }
        percentage = sum/subject;
    }

}

public class stuu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size");
        int size = sc.nextInt();
        mainstudent[] s = new mainstudent[size];

        for(int i = 0; i<size;i++){
            s[i] = new mainstudent();

            System.out.println("Enter roll number");
            s[i].setroll(sc.nextInt());
            sc.nextLine();
            System.out.println("Enter the name");
            s[i].setname(sc.nextLine());

            System.out.println("Enter the gender");
            s[i].setgender(sc.nextLine());

            System.out.println("Enter total number of subjects");
            s[i].setsub(sc.nextInt());

            s[i].arr(s[i].getsub());

            s[i].per(s[i].getarr());
        }


        for(int i = 0; i<size; i++){
            System.out.println();
            System.out.println("Student " + (i+1) + " Data" );
            System.out.println();
            System.out.println("Roll NO: " + s[i].getroll());
            System.out.println("Name: " + s[i].getname());
            System.out.println("Gender: " + s[i].getgender());
            System.out.println("percentage: " + s[i].getpercentage());
            System.err.println();
        }
    }
}
