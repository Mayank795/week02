package assistedproblems.employeemanagementsystem;

public class EmployeeManagementSystem{
    public static void main(String[] args) {
        Employee manager= new Manager("mayank","77",27000,3);
        Employee developer= new Developer("parag","78",15000,"C++");
        Employee intern= new Intern("vivek","79",10000);


        manager.displaydetails();
        developer.displaydetails();
        intern.displaydetails();


    }
}

