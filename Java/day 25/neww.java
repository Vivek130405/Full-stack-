public class neww{
    public static void main(String[] args) {
      String s = "Mukesh";
      String s1 = new String("Mukesh");
      s1 = s.concat("Mukesh");
      String s2 = "Mukesh";
      s2 = s1.concat(s2);
      System.out.println(s==s2);
    }
}