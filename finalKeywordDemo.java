import java.util.ArrayList;
import java.util.List;

public class FinalKeywordDemo {

    // 1) Final Variable (constant)
    public static final int MAX_LIMIT = 100;

    // 2) Final Method
    public final void displayMessage() {
        System.out.println("This is a final method!");
    }

    // 3) Final Class (cannot be extended)
    public static final class FinalClass {
        public void showMessage() {
            System.out.println("Message from FinalClass.");
        }
    }

    // 4) Final Parameter in Method
    public void printMessage(final String message) {
        // message = "New Message";  // This will cause a compilation error
        System.out.println(message);
    }

    // 5) Blank Final Variable (initialized in constructor)
    private final int number;
    public FinalKeywordDemo(int num) {
        this.number = num;
    }

    // 6) Static Blank Final Variable
    private static final int staticFinalValue;
    static {
        staticFinalValue = 200;
    }

    // 7) Final Reference and Object Modification
    public void modifyList() {
        final List<String> myList = new ArrayList<>();
        myList.add("Java");
        myList.add("JavaScript");
        System.out.println(myList);
        
        // myList = new ArrayList<>();  // This will cause a compilation error
    }

    public static void main(String[] args) {
        // 1) Final Variable
        System.out.println("Final Variable (Constant): MAX_LIMIT = " + MAX_LIMIT);

        // 2) Final Method
        FinalKeywordDemo demo = new FinalKeywordDemo(42);
        demo.displayMessage();

        // 3) Final Class
        FinalClass finalClassInstance = new FinalClass();
        finalClassInstance.showMessage();

        // 4) Final Parameter in Method
        demo.printMessage("Hello, Final Parameter!");

        // 5) Blank Final Variable
        System.out.println("Blank Final Variable initialized in constructor: " + demo.number);

        // 6) Static Blank Final Variable
        System.out.println("Static Blank Final Variable: " + staticFinalValue);

        // 7) Final Reference and Object Modification
        demo.modifyList();
    }
}
