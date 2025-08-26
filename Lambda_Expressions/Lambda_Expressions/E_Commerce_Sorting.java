// E_Commerce_Sorting.java

import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return name + " | Price: " + price + " | Rating: " + rating + " | Discount: " + discount + "%";
    }
}

public class E_Commerce_Sorting {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 60000, 4.5, 10));
        products.add(new Product("Phone", 30000, 4.7, 15));
        products.add(new Product("Headphones", 2000, 4.2, 25));
        products.add(new Product("Smartwatch", 8000, 4.0, 5));

        System.out.println("=== Original List ===");
        products.forEach(System.out::println);

        // ✅ Sort by Price (Low → High) using Lambda Expression
        products.sort(Comparator.comparing(p -> p.price));
        System.out.println("\n=== Sorted by Price (Low → High) ===");
        products.forEach(System.out::println);

        // ✅ Sort by Rating (High → Low) using Lambda Expression
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        System.out.println("\n=== Sorted by Rating (High → Low) ===");
        products.forEach(System.out::println);

        // ✅ Sort by Discount (High → Low) using Lambda Expression
        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        System.out.println("\n=== Sorted by Discount (High → Low) ===");
        products.forEach(System.out::println);
    }
}
