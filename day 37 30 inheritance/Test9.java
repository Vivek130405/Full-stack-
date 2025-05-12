// 9. Store book name and author using constructor and display
class Author {
    private String aname;
    Author(String aname) {
        this.aname = aname;
    }
    public void display() {
        System.out.println("Author: " + aname);
    }
}
class Book extends Author {
    private String bname;
    Book(String bname, String aname) {
        super(aname);
        this.bname = bname;
    }
    public void display() {
        System.out.println("Book: " + bname);
        super.display();
    }
}
public class Test9 {
    public static void main(String[] args) {
        Book b = new Book("Java", "James Gosling");
        b.display();
    }
}
