package encapsulationpolymorphism.onlinefooddeliverysystem;

import java.util.ArrayList;
import java.util.List;

public class OnlineFoodDelivery {

    public static void processOrder(List<FoodItem> order) {
        double grandTotal = 0;
        for (FoodItem item : order) {
            System.out.println(item.getItemDetails());
            System.out.printf("Total Price: %.2f\n", item.calculateTotalPrice());

            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                System.out.println(discountable.getDiscountDetails());
            }
            System.out.println();
            grandTotal += item.calculateTotalPrice();
        }
        System.out.printf("Grand Total: %.2f\n", grandTotal);
    }

    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();

        VegItem vegBurger = new VegItem("Veg Burger", 50.0, 2);
        vegBurger.applyDiscount(10);

        NonVegItem chickenWings = new NonVegItem("Chicken Wings", 100.0, 3);
        chickenWings.applyDiscount(15);

        order.add(vegBurger);
        order.add(chickenWings);

        processOrder(order);
    }
}

