// Parent class with protected fields and methods
class ParentClass {
    protected String message = "Hello from ParentClass!";
    
    protected void showMessage() {
        System.out.println("Protected Method: " + message);
    }
}

// Subclass in the same file (simulating a different package behavior)
class ChildClass extends ParentClass {
    public void display() {
        // Accessing protected members from the parent class
        System.out.println("Accessing protected field from child class: " + message);
        showMessage();
    }
}

// Non-subclass trying to access protected members
class NonSubclass {
    public void tryAccess() {
        ParentClass obj = new ParentClass();
        
        // ❌ ERROR: Cannot access protected members outside the class (unless inherited)
        // System.out.println(obj.message); // Compilation error
        // obj.showMessage(); // Compilation error

        System.out.println("Non-subclass cannot access protected members directly!");
    }
}

// Main class
public class ProtectedAccessDemo {
    public static void main(String[] args) {
        System.out.println("=== Accessing protected members within the same file ===");

        // Accessing from same class
        ParentClass parent = new ParentClass();
        System.out.println("Accessing from same class: " + parent.message);
        parent.showMessage();

        // Accessing from child class
        ChildClass child = new ChildClass();
        child.display();

        // Trying to access from non-subclass
        NonSubclass nonSub = new NonSubclass();
        nonSub.tryAccess();
    }
}
