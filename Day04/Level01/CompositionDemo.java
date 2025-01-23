import java.util.ArrayList;

class Company {
    String name;
    ArrayList<Department> departments; // Composition with Departments

    Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    void addDepartment(String deptName) {
        departments.add(new Department(deptName)); // Departments created inside the Company
    }

    void displayDetails() {
        System.out.println("Company " + name);
        for (Department dept : departments) {
            dept.displayEmployees();
        }
    }
}

class Department {
    String deptName;
    ArrayList<Employe> employees; // Composition with Employees

    Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    void addEmployee(String empName) {
        employees.add(new Employe(empName)); // Employees created inside the Department
    }

    void displayEmployees() {
        System.out.println("Department: " + deptName);
        for (Employe emp : employees) {
            emp.display();
        }
    }
}

class Employe {
    String empName;

    Employe(String empName) {
        this.empName = empName;
    }

    void display() {
        System.out.println("Employee: " + empName);
    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        // Create a company
        Company company = new Company("DK");

        // Add departments
        company.addDepartment("IT");
        company.addDepartment("HR");

        //Taking IT Department reference here
        Department it = company.departments.get(0);
        //Taking HR Department reference here
        Department hr = company.departments.get(1);

        // Add employees to departments
        it.addEmployee("Alice"); // IT Department
        it.addEmployee("Bob");   // IT Department
        hr.addEmployee("Charlie"); // HR Department

        //company details
        company.displayDetails();


    }
}
