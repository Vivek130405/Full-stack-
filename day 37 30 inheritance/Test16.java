// 16. Demonstrate "is-a" relationship using inheritance between Person and Employee classes
class Person {
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}
class Employee extends Person {  // Employee is-a Person
    private int id;
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + getName());
    }
}
public class Test16 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId(101);
        e.setName("Ravi");
        e.display();
    }
}
