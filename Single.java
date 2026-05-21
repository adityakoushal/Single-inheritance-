// Single Inheritance in Java

// Parent class
class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class inheriting Animal class
class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

// Main class
public class SingleInheritance {

    public static void main(String[] args) {

        // Creating object of Dog class
        Dog obj = new Dog();

        // Calling parent class method
        obj.eat();

        // Calling child class method
        obj.bark();
    }
}