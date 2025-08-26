
// 🔹 Model class implementing Cloneable
class Product implements Cloneable {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Override clone() method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }

    @Override
    public String toString() {
        return "Product [Name=" + name + ", Price=" + price + "]";
    }
}

// 🔹 Main class
public class Prototype_Cloning {
    public static void main(String[] args) {
        try {
            // Original object
            Product original = new Product("Laptop", 60000);
            System.out.println("Original: " + original);

            // Clone using prototype pattern
            Product cloned = (Product) original.clone();
            System.out.println("Cloned:   " + cloned);

            // Modify cloned object (to see difference)
            cloned.price = 55000;
            System.out.println("\nAfter modification:");
            System.out.println("Original: " + original);
            System.out.println("Cloned:   " + cloned);

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported: " + e);
        }
    }
}
