package assistedproblems.vehicletransportsystem;

class Truck extends Vehicle{
    int loadCapacity;
    public Truck(String name,int maxspeed,String fueltype,int loadCapacity){
        super(name, maxspeed, fueltype);
        this.loadCapacity=loadCapacity;
    }
    public void display(){
        super.dispaly();
        System.out.println(name+ "load capacity is: "+loadCapacity);
    }
}

