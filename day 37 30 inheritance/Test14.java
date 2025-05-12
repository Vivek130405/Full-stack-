// 14. Create city and hotel class, set values via constructor, display all
class City {
    private String cname;
    City(String cname) {
        this.cname = cname;
    }
    public void display() {
        System.out.println("City: " + cname);
    }
}
class Hotel extends City {
    private String hname;
    Hotel(String hname, String cname) {
        super(cname);
        this.hname = hname;
    }
    public void display() {
        System.out.println("Hotel: " + hname);
        super.display();
    }
}
public class Test14 {
    public static void main(String[] args) {
        Hotel h = new Hotel("Taj", "Mumbai");
        h.display();
    }
}
