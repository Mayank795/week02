import java.util.ArrayList;

class School{
    public String schoolName;
    public ArrayList<Student> students;

    School(String schoolName){
        this.schoolName=schoolName;
        this.students= new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

}

class Student{
    public String studentName;
    public ArrayList<Course> studentCourses;

    Student(String studentName){
        this.studentName = studentName;
        this.studentCourses = new ArrayList<>();
    }

    public void addCourse(Course course){
        studentCourses.add(course);
        course.addStudent(this);
    }

    public void showCourses(){
        for(Course a:studentCourses){
            System.out.println("Student "+this.studentName+" is enrolled in "+a.courseName);
        }
    }

}

class Course{
    public String courseName;
    public ArrayList<Student> courseStudents;

    Course(String courseName){
        this.courseName=courseName;
        this.courseStudents = new ArrayList<>();
    }

    public void addStudent(Student student){
        this.courseStudents.add(student);
    }

    public void showStudents(){
        for(Student a:courseStudents){
            System.out.println("Student "+a.studentName+" is enrolled for "+this.courseName);
        }
    }
}



public class SchoolSystem {
    public static void main(String[] args) {
        School school1 = new School("TIT");
        School school2 = new School("LNCT");

        Student student1 = new Student("Deepansh");
        Student student2 = new Student("Anubhav");

        Course course1 = new Course("Maths");
        Course course2 = new Course("Physics");

        school1.addStudent(student1);
        school1.addStudent(student2);

        student1.addCourse(course1);
        student2.addCourse(course2);

        student1.showCourses();
        student2.showCourses();

        course1.showStudents();
        course2.showStudents();
    }
}
