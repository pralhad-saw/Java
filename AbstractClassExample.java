// AbstractClassExample.java

// Abstract Class Example

abstract class Animal {
    // Abstract method (does not have a body)
    abstract void makeSound();

    // Concrete method (has a body)
    void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

class Dog extends Animal {
    // Providing implementation of abstract method
    void makeSound() {
        System.out.println("Woof!");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();  // Woof!
        dog.sleep();      // This animal is sleeping.
    }
}
