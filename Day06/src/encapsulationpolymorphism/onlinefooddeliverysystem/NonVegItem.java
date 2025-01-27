package encapsulationpolymorphism.onlinefooddeliverysystem;

class NonVegItem extends FoodItem implements Discountable {
    private double discount;
    private static final double NON_VEG_CHARGE = 20.0; // Fixed additional charge per item

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double baseTotal = getPrice() * getQuantity() + (NON_VEG_CHARGE * getQuantity());
        return baseTotal - (baseTotal * discount / 100);
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

