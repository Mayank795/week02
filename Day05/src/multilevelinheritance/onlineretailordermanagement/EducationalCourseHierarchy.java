package multilevelinheritance.onlineretailordermanagement;



public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        // Create an instance of Course
        Course basicCourse = new Course("Introduction to Programming", 20);
        basicCourse.displayDetails();


        System.out.println();


        // Create an instance of OnlineCourse
        OnlineCourse onlineCourse = new OnlineCourse("Java Basics", 15, "Udemy", true);
        onlineCourse.displayDetails();


        System.out.println();


        // Create an instance of PaidOnlineCourse
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Advanced Java", 30, "Coursera", true, 200.0, 20.0);
        paidOnlineCourse.displayDetails();
    }
}
