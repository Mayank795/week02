package assistedproblems.employeemanagementsystem;

class Manager extends Employee{
    public int size;
    public Manager(String name,String id,double salary,int size){
        super(name, id, salary);
        this.size=size;
    }


    public void displaydetails(){
        super.displaydetails();
        System.out.println(name+ "'s team size "+size);
    }
}

