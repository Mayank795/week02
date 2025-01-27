package encapsulationpolymorphism.onlinefooddeliverysystem;

class VegItem extends FoodItem implements Discountable {
    private double discount;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        return total - (total * discount / 100);
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        if (discountPercentage > 0 && discountPercentage <= 100) {
            discount = discountPercentage;
        } else {
            System.out.println("Invalid discount percentage.");
        }
    }

    @Override
    public String getDiscountDetails() {
        return discount > 0 ? String.format("Discount: %.2f%%", discount) : "No discount applied.";
    }
}

