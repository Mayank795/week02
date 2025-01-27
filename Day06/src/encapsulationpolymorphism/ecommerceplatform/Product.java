package encapsulationpolymorphism.ecommerceplatform;

abstract class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double calculateDiscount();
}

// Interface Taxable
interface Taxable {
    double calculateTax();

    String getTaxDetails();
}
