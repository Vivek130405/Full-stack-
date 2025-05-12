// 12. Create a base class Animal and Dog, assign using constructor and print both
class Animal {
    private String species;
    Animal(String species) {
        this.species = species;
    }
    public void display() {
        System.out.println("Species: " + species);
    }
}
class Dog extends Animal {
    private String breed;
    Dog(String breed, String species) {
        super(species);
        this.breed = breed;
    }
    public void display() {
        System.out.println("Breed: " + breed);
        super.display();
    }
}
public class Test12 {
    public static void main(String[] args) {
        Dog d = new Dog("Labrador", "Mammal");
        d.display();
    }
}
