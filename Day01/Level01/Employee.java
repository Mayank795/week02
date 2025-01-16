import java.sql.SQLOutput;

class Employee{
    //Attributes
    String name;
    String id;
    double salary;

    // constractor
    public Employee(String name,String id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void display(){
        System.out.println("Employee name "+ name);
        System.out.println("Employee id "+ id);
        System.out.println("Employee salary "+ salary);
    }

    public static void main(String[] args){
        Employee employee1 = new Employee("Mayank","77",29365);
        Employee employee2 = new Employee("parag","56",29365);

        employee1.display();
        System.out.println();
        employee2.display();
    }
}