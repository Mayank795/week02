package heirarchicalinheritance.schoolsystem;

class Person {
    protected String name;
    protected int age;


    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }


    // Placeholder method for role, to be overridden by subclasses
    public void displayRole() {
        System.out.println("Role: General Person");
    }
}
