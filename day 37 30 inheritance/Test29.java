// 29. Method overriding with same method name and return type in parent/child
class OS {
    public String getOS() {
        return "Generic OS";
    }
}
class Windows extends OS {
    @Override
    public String getOS() {
        return "Windows 11";
    }
}
public class Test29 {
    public static void main(String[] args) {
        Windows w = new Windows();
        System.out.println("Operating System: " + w.getOS());
    }
}
