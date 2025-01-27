package encapsulationpolymorphism.ridehailingapplication;

import java.util.ArrayList;
import java.util.List;

public class RideHailingApplication {

    public static void calculateFares(List<Vehicle> vehicles, double distance) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDetails());
            System.out.printf("Fare for %.2f km: %.2f\n", distance, vehicle.calculateFare(distance));

            if (vehicle instanceof GPS) {
                GPS gps = (GPS) vehicle;
                System.out.println("Current Location: " + gps.getCurrentLocation());
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        Car car = new Car("C001", "Alice", 15.0);
        car.updateLocation("Downtown");

        Bike bike = new Bike("B001", "Bob", 7.0);
        bike.updateLocation("Uptown");

        Auto auto = new Auto("A001", "Charlie", 10.0);
        auto.updateLocation("City Center");

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        double distance = 12.5; // Example distance
        calculateFares(vehicles, distance);
    }
}

