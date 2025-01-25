package heirarchicalinheritance.schoolsystem;

class Staff extends Person {
    private String position;


    // Constructor
    public Staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }


    @Override
    public void displayRole() {
        System.out.println("Role: Staff");
    }


    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Position: " + position);
    }
}

