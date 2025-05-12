// 24. Demonstrate overriding in multi-level inheritance
class Animal {
    public void sound() {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
class Puppy extends Dog {
    @Override
    public void sound() {
        System.out.println("Puppy yelps");
        super.sound(); // calls Dog's sound
    }
}
public class Test24 {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.sound();  // overridden in multilevel
    }
}
