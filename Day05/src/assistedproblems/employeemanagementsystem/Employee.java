package assistedproblems.employeemanagementsystem;

class Employee{
    String name;
    String id;
    double salary;
    //constructor
    Employee(String name,String id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void displaydetails(){
        System.out.println("name: "+name+ " id "+ id+ " salary "+ salary);
    }
}


