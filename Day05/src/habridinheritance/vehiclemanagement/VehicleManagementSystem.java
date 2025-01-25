package habridinheritance.vehiclemanagement;

public class VehicleManagementSystem {
    public static void main(String[] args) {
        // Create an ElectricVehicle instance
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200, 75);
        ev.displayDetails();
        ev.charge();


        System.out.println();


        // Create a PetrolVehicle instance
        PetrolVehicle pv = new PetrolVehicle("Ford Mustang", 250, 60);
        pv.displayDetails();
        pv.refuel();
    }
}

