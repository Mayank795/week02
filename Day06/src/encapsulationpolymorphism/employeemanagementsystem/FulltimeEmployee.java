package encapsulationpolymorphism.employeemanagementsystem;

 class FulltimeEmployee extends Employee implements Department {

     private double fixedSalary;
     private String departmentName;

     public FulltimeEmployee(String employeeId, String name, double baseSalary,double fixedSalary){
         super(employeeId, name, baseSalary);
         this.fixedSalary=fixedSalary;
     }

     @Override
     public double calculateSalary() {
         return getBaseSalary()+fixedSalary;

     }

     @Override
     public void assignDepartment(String departmentName) {
        this.departmentName=departmentName;
     }

     @Override
     public String getDepartmentDetails() {
         return "Department: "+departmentName;
     }

     public void display() {
         super.display();
         System.out.println("Fixed Salary: "+fixedSalary);
         System.out.println("Salary: " + calculateSalary());
         System.out.println(getDepartmentDetails());
     }
 }
