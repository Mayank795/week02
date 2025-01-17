import java.util.ArrayList;

class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Method to get the total cost of this item
    public double getTotalCost() {
        return price * quantity;
    }

    // Method to display item details
    public void displayItem() {
        System.out.println(itemName + " - $" + price + " x " + quantity + " = $" + getTotalCost());
    }
}

class ShoppingCart {
    private ArrayList<CartItem> cartItems;

    // Constructor
    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        cartItems.add(new CartItem(itemName, price, quantity));
        System.out.println("Added " + itemName + " to the cart.");
    }

    // Method to remove an item from the cart
    public void removeItem(String itemName) {
        boolean removed = false;
        for (int i = 0; i < cartItems.size(); i++) {
            if (cartItems.get(i).getItemName().equalsIgnoreCase(itemName)) {
                cartItems.remove(i);
                System.out.println("Removed " + itemName + " from the cart.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println(itemName + " not found in the cart.");
        }
    }

    // Method to display the total cost
    public void displayTotalCost() {
        double total = 0;
        for (CartItem item : cartItems) {
            total += item.getTotalCost();
        }
        System.out.println("Total Cost: $" + total);
    }

    // Method to display all items in the cart
    public void displayCart() {
        if (cartItems.isEmpty()) {
            System.out.println("The cart is empty.");
        } else {
            System.out.println("Cart Items:");
            for (CartItem item : cartItems) {
                item.displayItem();
            }
        }
    }

    // Main method to test the program
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding items to the cart
        cart.addItem("Apple", 0.99, 5);
        cart.addItem("Bread", 2.49, 2);
        cart.addItem("Milk", 3.19, 1);

        // Displaying the cart
        cart.displayCart();

        // Displaying the total cost
        cart.displayTotalCost();

        // Removing an item from the cart
        cart.removeItem("Bread");

        cart.displayCart();

        cart.displayTotalCost();
    }
}
