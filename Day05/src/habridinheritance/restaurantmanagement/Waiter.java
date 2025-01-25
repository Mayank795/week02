package habridinheritance.restaurantmanagement;

class Waiter extends Person implements Worker {
    private int tableCount;


    // Constructor
    public Waiter(String name, int id, int tableCount) {
        super(name, id);
        this.tableCount = tableCount;
    }


    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers at " + tableCount + " tables.");
    }


    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Waiter");
        System.out.println("Tables Assigned: " + tableCount);
    }
}

