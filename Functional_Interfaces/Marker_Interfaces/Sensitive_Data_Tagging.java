
// 🔹 Custom Marker Interface
interface SensitiveData { }  // Empty interface, acts as a tag

// 🔹 Classes
class UserProfile implements SensitiveData {  // Marked as sensitive
    String name;
    String ssn; // sensitive field

    UserProfile(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "UserProfile [Name=" + name + ", SSN=" + ssn + "]";
    }
}

class Product {
    String id;
    String description;

    Product(String id, String description) {
        this.id = id;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product [ID=" + id + ", Desc=" + description + "]";
    }
}

// 🔹 Encryption Utility
class EncryptionService {
    public static String encrypt(String data) {
        return "###ENCRYPTED(" + data + ")###"; // dummy encryption
    }

    // Process any object
    public static void process(Object obj) {
        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting sensitive object: " + obj.getClass().getSimpleName());
            System.out.println("Data stored as: " + encrypt(obj.toString()));
        } else {
            System.out.println("Storing non-sensitive object: " + obj);
        }
    }
}

// 🔹 Main class
public class Sensitive_Data_Tagging {
    public static void main(String[] args) {
        UserProfile user = new UserProfile("Alice", "123-45-6789");
        Product product = new Product("P1001", "Laptop");

        // Process both objects
        EncryptionService.process(user);     // Will be encrypted
        EncryptionService.process(product);  // Will be stored as-is
    }
}
