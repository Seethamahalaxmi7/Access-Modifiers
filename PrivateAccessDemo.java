// Superclass with private fields and method
class Parent {
    private String secretMessage = "This is a private message.";
    private int secretNumber = 42;

    // Private method
    private void displaySecret() {
        System.out.println("Inside private method: " + secretMessage + " Number: " + secretNumber);
    }

    // Public method to access private method (Encapsulation)
    public void accessPrivateMethod() {
        displaySecret();
    }

    // Public getter method for secretNumber
    public int getSecretNumber() {
        return secretNumber;
    }
}

// Subclass attempting to access private members
class Child extends Parent {
    void tryAccessingPrivate() {
        // System.out.println(secretMessage); // ❌ Not allowed (private field)
        // displaySecret(); // ❌ Not allowed (private method)
        System.out.println("Cannot access private members of Parent class directly!");
    }
}

// Main class
public class PrivateAccessDemo {
    public static void main(String[] args) {
        // Creating object of Parent class
        Parent obj = new Parent();

        // Accessing private fields via public method
        System.out.println("Accessing private field via getter: " + obj.getSecretNumber());

        // Calling private method indirectly using a public method
        obj.accessPrivateMethod();

        // Creating object of Child class
        Child childObj = new Child();
        childObj.tryAccessingPrivate(); // Trying to access private members
    }
}
