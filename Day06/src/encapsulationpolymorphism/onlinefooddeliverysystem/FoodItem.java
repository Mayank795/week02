package encapsulationpolymorphism.onlinefooddeliverysystem;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Quantity must be greater than zero.");
        }
    }

    public String getItemDetails() {
        return String.format("Item: %s, Price: %.2f, Quantity: %d", itemName, price, quantity);
    }

    public abstract double calculateTotalPrice();
}
