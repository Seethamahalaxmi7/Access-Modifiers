// Parent class with public fields and methods
class ParentClass {
    public String message = "Hello from ParentClass!";
    
    public void showMessage() {
        System.out.println("Public Method: " + message);
    }
}

// Another class in the same file (simulating another package behavior)
class SamePackageClass {
    public void accessPublicMembers() {
        ParentClass obj = new ParentClass();
        
        // Accessing public field
        System.out.println("Accessing public field in the same package: " + obj.message);
        
        // Accessing public method
        obj.showMessage();
    }
}

// Subclass that extends ParentClass
class ChildClass extends ParentClass {
    public void display() {
        // Accessing public members from the parent class
        System.out.println("Accessing public field from child class: " + message);
        showMessage();
    }
}

// Non-subclass in the same file (simulating another package)
class NonSubclass {
    public void accessPublic() {
        ParentClass obj = new ParentClass();
        
        // Accessing public members
        System.out.println("Accessing public field from a non-subclass: " + obj.message);
        obj.showMessage();
    }
}

// Main class
public class PublicAccessDemo {
    public static void main(String[] args) {
        System.out.println("=== Demonstrating Public Access Modifier ===");

        // Access from SamePackageClass
        SamePackageClass samePackage = new SamePackageClass();
        samePackage.accessPublicMembers();

        // Access from ChildClass
        ChildClass child = new ChildClass();
        child.display();

        // Access from NonSubclass
        NonSubclass nonSub = new NonSubclass();
        nonSub.accessPublic();
    }
}
