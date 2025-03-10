// No package declaration needed if you're running this in the default package

// Class with default (package-private) fields and methods
class DefaultAccessExample {
    // Default fields
    String name = "John Doe";
    int age = 25;

    // Default method
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Public class with the main method
public class DefaultAccessDemo {
    public static void main(String[] args) {
        // Creating an object of DefaultAccessExample
        DefaultAccessExample obj = new DefaultAccessExample();
        
        // Accessing default fields
        System.out.println("Accessing Default Fields: " + obj.name + ", " + obj.age);
        
        // Calling default method
        obj.displayInfo();
    }
}
