//28th January Oops concepts practice codes

/*          Dynamic Binding Code


class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class TestDynamicBinding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Animal reference and object
        Animal myDog = new Dog();       // Animal reference but Dog object
        Animal myCat = new Cat();       // Animal reference but Cat object

        myAnimal.sound();  // Calls Animal's sound()
        myDog.sound();     // Calls Dog's sound() due to dynamic binding
        myCat.sound();     // Calls Cat's sound() due to dynamic binding
    }
}

*/


/*
instanceof operator code 

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class TestInstanceof {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        System.out.println(a1 instanceof Dog);  // true
        System.out.println(a2 instanceof Dog);  // false
        System.out.println(a1 instanceof Animal);  // true
        System.out.println(a2 instanceof Animal);  // true
    }
}

*/

/*
Safe Downcasting Code


class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog barks");
    }

    public void fetch() {
        System.out.println("Dog is fetching!");
    }
}

public class TestDowncasting {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Upcasting
        myAnimal.makeSound(); // Calls Dog's makeSound()

        // Downcasting - with instanceof check
        if (myAnimal instanceof Dog) {
            Dog myDog = (Dog) myAnimal;  // Safe downcasting
            myDog.fetch();  // Now we can call Dog-specific methods
        }
    }
}

*/