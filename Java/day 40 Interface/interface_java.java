//Multiple Inheritance

interface ParentA {
    public int sum();
   
}

interface ParentB {
    public int Mult();

}

class c implements ParentA, ParentB {
    int a = 10, b = 20;

    public int sum() {
        return a + b;
    }

    public int Mult() {
        return a * b;
    }

}

public class interface_java {
    public static void main(String[] args) {
      ParentA A = new c();
      ParentB B = new c();
      System.out.println(A.sum());
      System.out.println(B.Mult());
    }
}