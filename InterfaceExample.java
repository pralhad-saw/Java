// InterfaceExample.java

// Interface Example

interface Animal {
    // Abstract method (does not have a body)
    void makeSound();
}

interface Mammal {
    // Abstract method (does not have a body)
    void hasFur();
}

class Dog implements Animal, Mammal {
    // Providing implementation of abstract methods
    public void makeSound() {
        System.out.println("Woof!");
    }
    
    public void hasFur() {
        System.out.println("This animal has fur.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();  // Woof!
        dog.hasFur();     // This animal has fur.
    }
}
