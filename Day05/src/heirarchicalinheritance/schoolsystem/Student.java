package heirarchicalinheritance.schoolsystem;

class Student extends Person {
    private String grade;


    // Constructor
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }


    @Override
    public void displayRole() {
        System.out.println("Role: Student");
    }


    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Grade: " + grade);
    }
}

