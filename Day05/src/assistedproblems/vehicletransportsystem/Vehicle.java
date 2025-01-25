package assistedproblems.vehicletransportsystem;

class Vehicle{
    String name;
    int maxspeed;
    String fueltype;


    public Vehicle(String name,int maxspeed,String fueltype){
        this.name=name;
        this.fueltype=fueltype;
        this.maxspeed=maxspeed;
    }
    public void dispaly(){
        System.out.println(name+" have max speed of: "+maxspeed+"and fuel type is: "+fueltype);
    }
}

