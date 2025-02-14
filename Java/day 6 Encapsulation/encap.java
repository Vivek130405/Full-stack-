class number {
    int num;
    private int numb;

    public void setnumber(int n) {
        // this keyword indicate that num variable is this class
        this.numb = n;
    }

    public int getnumber() {
        return numb;
    }

}


// student class

class student {
    // id
    int id;

    // cgpa
    private float cgpa;

    public void setcgpa(float n) {
        this.cgpa = n;
    }

    public float getcgpa() {
        return cgpa;
    }

    // name string

    private String name;

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    // roll num
    private int roll;

    public void setroll(int roll) {
        this.roll = roll;
    }

    public int getroll() {
        return roll;
    }

}

public class encap {
    public static void main(String[] args) {
        // if we want to assign value to num variable which is part on another class
        // then we doing this stuff
        number n = new number();
        n.num = 10;
        System.out.println(n.num);

        // suppose numb variable is private
        n.setnumber(100);
        // now we only set the value now we want to print for this we use get function
        System.out.println(n.getnumber());

        // student class
        student st = new student();
        st.id = 10;
        System.out.println(st.id);

        // cgpa is private now we want to set value to cgpa
        st.setcgpa(10.10f);
        System.out.println(st.getcgpa());

        // name is private now we want to set value to name
        st.setname("Vivek");
        System.out.println(st.getname());

        // roll num is private now we want to set value to roll num
        st.setroll(40);
        System.out.println(st.getroll());
    }
}