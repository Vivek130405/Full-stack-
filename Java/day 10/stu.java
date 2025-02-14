import java.util.Scanner;

class student{
    private int id;
    private String name;
    private String gender;
    

    student(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id");
        id = sc.nextInt();
        
    }

    student(String name,String gender){
        this.name=name;
        this.gender=gender;
    }
    public int getId() {
        return this.id;
    }
    public String getname() {
        return this.name;
    }
    public String getgender() {
        return this.gender;
    }
    
}


public class stu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        student[] s = new student[size];
        
       
        for(int i = 0; i<size;i++){
            // s[i] = new student();
           
            String name = sc.nextLine();
            String gender = sc.nextLine();
            s[i] = new student(name,gender);

        }
        for(int i = 0; i<size;i++){
            System.out.println("ID " + (i+1));
            System.out.println(s[i].getId());
            System.out.println(s[i].getname());
            System.out.println(s[i].getgender());
        }
      
    }
}