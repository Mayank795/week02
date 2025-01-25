package assistedproblems.vehicletransportsystem;

class Car extends Vehicle{
    int seatCapacity;
    public Car(String name,int maxspeed,String fueltype,int seatCapacity){
        super(name, maxspeed, fueltype);
        this.seatCapacity=seatCapacity;
    }
    public void display(){
        super.dispaly();
        System.out.println(name+ "seat capacity is: "+seatCapacity);
    }
}

