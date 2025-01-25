package assistedproblems.employeemanagementsystem;

class Developer extends Employee{
    public String lang;
    public Developer(String name,String id,double salary,String lang){
        super(name, id, salary);
        this.lang=lang;
    }


    public void displaydetails(){
        super.displaydetails();
        System.out.println(name+ "'s language is: "+lang);
    }
}
