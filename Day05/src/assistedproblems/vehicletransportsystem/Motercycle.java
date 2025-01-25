package assistedproblems.vehicletransportsystem;

class MoterCycle extends Vehicle{
    int mileage;
    public MoterCycle(String name,int maxspeed,String fueltype,int mileage){
        super(name, maxspeed, fueltype);
        this.mileage=mileage;
    }
    public void display(){
        super.dispaly();
        System.out.println(name+ "mileage is: "+mileage);
    }

}
