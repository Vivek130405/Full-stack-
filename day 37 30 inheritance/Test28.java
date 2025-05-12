// 28. has-a and method overriding example with Library has-a Book
class Book {
    private String title;
    public void setTitle(String t) {
        title = t;
    }
    public String getTitle() {
        return title;
    }
}
class Library {
    private String libName;
    private Book book;  // has-a

    public void setLibName(String libName) {
        this.libName = libName;
    }
    public void setBook(Book book) {
        this.book = book;
    }

    public void showDetails() {
        System.out.println("Library: " + libName);
        System.out.println("Book Title: " + book.getTitle());
    }
}
public class Test28 {
    public static void main(String[] args) {
        Book b = new Book();
        b.setTitle("Java Basics");
        Library l = new Library();
        l.setLibName("Central Library");
        l.setBook(b);
        l.showDetails();
    }
}
