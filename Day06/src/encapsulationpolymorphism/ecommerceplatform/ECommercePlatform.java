package encapsulationpolymorphism.ecommerceplatform;

import java.util.ArrayList;
import java.util.List;

public class ECommercePlatform {

    public static void calculateAndPrintFinalPrice(List<Product> products) {
        for (Product product : products) {
            double discount = product.calculateDiscount();
            double tax = 0;
            if (product instanceof Taxable) {
                tax = ((Taxable) product).calculateTax();
                System.out.println(product.getName() + " Tax Details: " + ((Taxable) product).getTaxDetails());
            }
            double finalPrice = product.getPrice() + tax - discount;
            System.out.printf("Product: %s, Final Price: %.2f\n", product.getName(), finalPrice);
        }
    }

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Electronics("E001", "Laptop", 1000));
        productList.add(new Clothing("C001", "T-Shirt", 50));
        productList.add(new Groceries("G001", "Apples", 30));

        calculateAndPrintFinalPrice(productList);
    }
}

