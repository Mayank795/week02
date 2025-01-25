package habridinheritance.restaurantmanagement;

class Chef extends Person implements Worker {
    private String specialty;


    // Constructor
    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }


    @Override
    public void performDuties() {
        System.out.println(name + " is preparing dishes in the kitchen. Specialty: " + specialty);
    }


    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Chef");
        System.out.println("Specialty: " + specialty);
    }
}

