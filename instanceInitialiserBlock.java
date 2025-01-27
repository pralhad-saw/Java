class instanceInitialiserBlock {
    private String name;
    private double price;

    // Instance initializer block to set default values
    {
        name = "Unknown Product";
        price = 0.0;
    }

    // Constructor 1
    public Product(String name) {
        this.name = name;
    }

    // Constructor 2
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println("Product: " + name + ", Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop");
        Product p2 = new Product("Phone", 799.99);

        p1.display();
        p2.display();
    }
}
