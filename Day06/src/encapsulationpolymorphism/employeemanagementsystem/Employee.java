package encapsulationpolymorphism.employeemanagementsystem;

public abstract class Employee {
    private String employeeId;
    private String name;
    private double baseSalary;

    public Employee(String employeeId,String name,double baseSalary){
        this.baseSalary=baseSalary;
        this.employeeId=employeeId;
        this.name=name;

    }

    public String getEmployeeId() {
        return employeeId;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract double calculateSalary();

    public void display(){
        System.out.println("Employee Id: "+employeeId);
        System.out.println("Name: "+name);
        System.out.println("Base Salary: "+ baseSalary);
    }
}
