// Product.java
public class Product {
    private String name;
    private String description;
    private int stock;

    // Constructor to initialize the product
    public Product(String name, String description, int stock) {
        this.name = name;
        this.description = description;
        this.stock = stock;
    }

    // Getter and setter methods for the product's name, description, and stock
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // Method to represent the product details as a string
    @Override
    public String toString() {
        return "Product: " + name + ", Description: " + description + ", Stock: " + stock;
    }
}
