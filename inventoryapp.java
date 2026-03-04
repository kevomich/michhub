import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private int id;
    private String name;
    private int quantity;
    private double price;

    public Product(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }

    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Qty: " + quantity + " | Price: " + price;
    }
}


public class inventoryapp {
    private static ArrayList<Product> inventory = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Inventory Management ---");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addProduct();
                case 2 -> viewProducts();
                case 3 -> updateProduct();
                case 4 -> deleteProduct();
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }

    private static void addProduct() {
        System.out.print("Enter product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int qty = scanner.nextInt();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        inventory.add(new Product(id, name, qty, price));
        System.out.println("Product added successfully!");
    }

    private static void viewProducts() {
        if (inventory.isEmpty()) {
            System.out.println("No products in inventory.");
        } else {
            for (Product p : inventory) {
                System.out.println(p);
            }
        }
    }

    private static void updateProduct() {
        System.out.print("Enter product ID to update: ");
        int id = scanner.nextInt();
        for (Product p : inventory) {
            if (p.getId() == id) {
                System.out.print("Enter new quantity: ");
                int qty = scanner.nextInt();
                System.out.print("Enter new price: ");
                double price = scanner.nextDouble();
                p.setQuantity(qty);
                p.setPrice(price);
                System.out.println("Product updated!");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    private static void deleteProduct() {
        System.out.print("Enter product ID to delete: ");
        int id = scanner.nextInt();
        inventory.removeIf(p -> p.getId() == id);
        System.out.println("Product deleted (if it existed).");
    
}
}
