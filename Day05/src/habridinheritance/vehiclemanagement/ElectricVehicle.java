package habridinheritance.vehiclemanagement;

class ElectricVehicle extends Vehicle {
    private int batteryCapacity; // in kWh


    // Constructor
    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }


    // Method to charge the electric vehicle
    public void charge() {
        System.out.println(model + " is charging. Battery capacity: " + batteryCapacity + " kWh.");
    }


    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

