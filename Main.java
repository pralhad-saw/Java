// Superclass
class Vehicle {
    public Vehicle createInstance() {
        System.out.println("Creating a generic Vehicle");
        return new Vehicle();
    }
}

// Subclass
class Car extends Vehicle {
    @Override
    public Car createInstance() {
        System.out.println("Creating a specific Car");
        return new Car();
    }
}

// Another Subclass
class Truck extends Vehicle {
    @Override
    public Truck createInstance() {
        System.out.println("Creating a specific Truck");
        return new Truck();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of Vehicle
        Vehicle vehicle = new Vehicle();
        vehicle.createInstance();  // Output: Creating a generic Vehicle
        
        // Create an instance of Car
        Vehicle car = new Car();
        car.createInstance();  // Output: Creating a specific Car
        
        // Create an instance of Truck
        Vehicle truck = new Truck();
        truck.createInstance();  // Output: Creating a specific Truck
    }
}
