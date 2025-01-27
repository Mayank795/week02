package encapsulationpolymorphism.employeemanagementsystem;

class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private double hourlyRate;
    private String departmentName;

    public PartTimeEmployee(String employeeId,String name,double baseSalary,int hoursWorked,int hourlyRate){
        super(employeeId, name, baseSalary);
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary()+hoursWorked*hourlyRate*30;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.departmentName=departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: "+ departmentName;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Hours Worked: "+ hoursWorked);
        System.out.println("Hourly Rate: "+hourlyRate);
        System.out.println("Salary: "+ calculateSalary());
        System.out.println(getDepartmentDetails());
    }
}
