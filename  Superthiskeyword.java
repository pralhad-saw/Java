class Parent {
    int x = 10;

    Parent() {
        System.out.println("Parent class constructor");
    }

    void display() {
        System.out.println("Parent class display method");
    }
}

class Child extends Parent {
    int x = 20;

    Child() {
        super();  // Invokes Parent class constructor
        System.out.println("Child class constructor");
    }

    void display() {
        super.display();  // Invokes Parent class display method
        System.out.println("Child class display method");
    }

    void show() {
        System.out.println("Current class variable x: " + this.x);  // Refers to current class variable
        System.out.println("Parent class variable x: " + super.x);  // Refers to parent class variable
    }

    void invoke() {
        this.display();  // Invokes current class method
        super.display(); // Invokes parent class method
    }

    void returnInstance() {
        System.out.println(this);  // Prints the current class instance
    }
}

public class Superthiskeyword {
    public static void main(String[] args) {
        Child child = new Child();
        child.show();
        child.invoke();
        child.returnInstance();
    }
}
