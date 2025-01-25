package multilevelinheritance.onlineretailordermanagement;

class Course {
    protected String courseName;
    protected int duration; // Duration in hours


    // Constructor
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }


    // Method to display course details
    public void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

