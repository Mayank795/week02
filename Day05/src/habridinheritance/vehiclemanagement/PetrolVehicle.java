package habridinheritance.vehiclemanagement;

class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelTankCapacity; // in liters


    // Constructor
    public PetrolVehicle(String model, int maxSpeed, int fuelTankCapacity) {
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }


    // Implementation of refuel() method
    @Override
    public void refuel() {
        System.out.println(model + " is refueling. Tank capacity: " + fuelTankCapacity + " liters.");
    }


    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
    }
}
