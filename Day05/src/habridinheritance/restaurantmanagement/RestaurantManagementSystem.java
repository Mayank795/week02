package habridinheritance.restaurantmanagement;

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        // Create a Chef instance
        Chef chef = new Chef("Gordon Ramsay", 101, "Italian Cuisine");
        chef.displayDetails();
        chef.performDuties();


        System.out.println();


        // Create a Waiter instance
        Waiter waiter = new Waiter("John Doe", 201, 5);
        waiter.displayDetails();
        waiter.performDuties();
    }
}

