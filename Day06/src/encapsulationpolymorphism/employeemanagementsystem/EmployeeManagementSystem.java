package encapsulationpolymorphism.employeemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        FulltimeEmployee ftemployee = new FulltimeEmployee("102","Mayank",15000,30000);
        ftemployee.assignDepartment("Software Development");

        PartTimeEmployee ptemployee = new PartTimeEmployee("203","vivek",10000,7,50);
        ptemployee.assignDepartment("data analyst");

        employees.add(ftemployee);
        employees.add(ptemployee);

        for(Employee emp : employees){
            System.out.println("----------------------------");
            emp.display();

        }
    }
}
