// Shop.java
import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> productList;

    // Constructor to initialize the shop with a list of products
    public Shop() {
        this.productList = new ArrayList<>();
    }

    // Method to add a product to the shop
    public void addProduct(String name, String description, int stock) {
        Product product = new Product(name, description, stock);
        productList.add(product);
    }

    // Method to remove a product from the shop by name
    public void removeProduct(String name) {
        productList.removeIf(product -> product.getName().equals(name));
    }

    // Method to restock a product (increase the stock)
    public void restock(String name, int additionalStock) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                product.setStock(product.getStock() + additionalStock);
                return;
            }
        }
    }

    // Method to sell a product (decrease the stock)
    public void sell(String name, int quantity) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                int currentStock = product.getStock();
                if (currentStock >= quantity) {
                    product.setStock(currentStock - quantity);
                } else {
                    System.out.println("Not enough stock to sell " + quantity + " of " + name);
                }
                return;
            }
        }
    }

    // Method to print the list of all products
    public void printProductList() {
        if (productList.isEmpty()) {
            System.out.println("No products in stock.");
        } else {
            for (Product product : productList) {
                System.out.println(product);
            }
        }
    }
}
