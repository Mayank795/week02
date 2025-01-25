package heirarchicalinheritance.schoolsystem;

class Teacher extends Person {
    private String subject;


    // Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }


    @Override
    public void displayRole() {
        System.out.println("Role: Teacher");
    }


    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}

