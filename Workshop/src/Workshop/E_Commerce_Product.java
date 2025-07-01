package Workshop;

import java.util.*;

class Product {
    String name;
    String category;
    double price;
    int stock;

    Product(String name, String category, double price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    void display() {
        System.out.println("Name: " + name + ", Category: " + category + ", Price: ₹" + price + ", Stock: " + stock);
    }
}

class ProductNotFoundException extends Exception {
    ProductNotFoundException(String message) {
        super(message);
    }
}

class InvalidStockException extends Exception {
    InvalidStockException(String message) {
        super(message);
    }
}

public class E_Commerce_Product {
    static final int MAX_STOCK = 1000;
    List<Product> products = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    void addProduct() {
        System.out.print("Enter product name: ");
        String name = sc.nextLine();
        System.out.print("Enter category: ");
        String category = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        System.out.print("Enter stock quantity: ");
        int stock = sc.nextInt(); sc.nextLine();
        products.add(new Product(name, category, price, stock));
        System.out.println("Product added successfully.");
    }

    void searchByNameOrCategory() {
        System.out.print("Search by (1) Name or (2) Category? ");
        int choice = sc.nextInt(); sc.nextLine();
        System.out.print("Enter keyword: ");
        String keyword = sc.nextLine();
        boolean found = false;

        for (Product p : products) {
            if ((choice == 1 && p.name.equalsIgnoreCase(keyword)) || 
                (choice == 2 && p.category.equalsIgnoreCase(keyword))) {
                p.display();
                found = true;
            }
        }

        if (!found) System.out.println("No matching products found.");
    }

    void updateStock() {
        System.out.print("Enter product name to update stock: ");
        String name = sc.nextLine();
        try {
            Product p = findProductByName(name);
            System.out.print("Enter new stock quantity: ");
            int stock = sc.nextInt(); sc.nextLine();
            if (stock < 0 || stock > MAX_STOCK) {
                throw new InvalidStockException("Stock must be between 0 and " + MAX_STOCK);
            }
            p.stock = stock;
            System.out.println("Stock updated successfully.");
        } catch (ProductNotFoundException | InvalidStockException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    Product findProductByName(String name) throws ProductNotFoundException {
        for (Product p : products) {
            if (p.name.equalsIgnoreCase(name)) return p;
        }
        throw new ProductNotFoundException("Product '" + name + "' not found.");
    }

    void generateReport() {
        System.out.print("Sort by price (1) Ascending or (2) Descending? ");
        int order = sc.nextInt(); sc.nextLine();
        products.sort((a, b) -> order == 1 ? Double.compare(a.price, b.price) : Double.compare(b.price, a.price));
        for (Product p : products) {
            p.display();
        }
    }

    void menu() {
        while (true) {
            System.out.println("\nE-Commerce Product Catalog");
            System.out.println("1. Add Product");
            System.out.println("2. Search Product");
            System.out.println("3. Update Stock");
            System.out.println("4. Generate Report");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1: addProduct(); break;
                case 2: searchByNameOrCategory(); break;
                case 3: updateStock(); break;
                case 4: generateReport(); break;
                case 5: return;
                default: System.out.println("Invalid option.");
            }
        }
    }

    public static void main(String[] args) {
        new ProductCatalog().menu();
    }
}
