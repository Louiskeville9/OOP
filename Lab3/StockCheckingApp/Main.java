// Main.java
public class Main {
    public static void main(String[] args) {
        // Create a new Shop object
        Shop shop = new Shop();

        // Load initial data into the shop
        shop.addProduct("milk", "Fresh from the farm", 10);
        shop.addProduct("bread", "Fresh from the baker", 4);
        shop.addProduct("tea", "Box of 100 teabags", 1);
        shop.addProduct("eggs", "A dozen per box", 33);
        shop.addProduct("ice cream", "1l box, vanilla", 2);

        // Print the list of products
        System.out.println("Initial Product List:");
        shop.printProductList();
        System.out.println();

        // Add more products
        shop.addProduct("butter", "Creamy butter", 5);

        // Remove a product
        shop.removeProduct("tea");

        // Restock products
        shop.restock("milk", 5); // Adding 5 more milk
        shop.restock("bread", 10); // Adding 10 more bread

        // Sell some products
        shop.sell("milk", 3); // Selling 3 milks
        shop.sell("eggs", 40); // Trying to sell 40 eggs (error)

        // Print the updated list of products
        System.out.println("Updated Product List:");
        shop.printProductList();
    }
}
