package encapsulationpolymorphism.vehiclerentalsystem;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {

    public static void calculateAndPrintCosts(List<Vehicle> vehicles, int days) {
        for (Vehicle vehicle : vehicles) {
            double rentalCost = vehicle.calculateRentalCost(days);
            System.out.printf("Vehicle: %s (%s), Rental Cost for %d days: %.2f\n",
                    vehicle.getVehicleNumber(), vehicle.getType(), days, rentalCost);

            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.printf("Insurance Cost: %.2f, Details: %s\n",
                        insurable.calculateInsurance(), insurable.getInsuranceDetails());
            }
        }
    }

    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();

        vehicleList.add(new Car("C123", 50, "CAR12345"));
        vehicleList.add(new Bike("B456", 20));
        vehicleList.add(new Truck("T789", 100, "TRUCK67890"));

        int rentalDays = 5;
        calculateAndPrintCosts(vehicleList, rentalDays);
    }
}
