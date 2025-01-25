package heirarchicalinheritance.schoolsystem;

public class SchoolSystem {
    public static void main(String[] args) {
        // Create a Teacher instance
        Teacher teacher = new Teacher("Mr. Smith", 40, "Mathematics");
        teacher.displayRole();
        teacher.displayDetails();

        System.out.println();

        // Create a Student instance
        Student student = new Student("Alice", 14, "8th Grade");
        student.displayRole();
        student.displayDetails();

        System.out.println();

        // Create a Staff instance
        Staff staff = new Staff("Mrs. Johnson", 35, "Clerk");
        staff.displayRole();
        staff.displayDetails();
    }
}
