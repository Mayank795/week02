package assistedproblems.vehicletransportsystem;

public class VehicleTransportSystem {
    public static void main(String[] args) {
        Vehicle car=new Car("car",200,"diesel",5);
        Vehicle truck=new Truck("truck",100,"diesel",5000);
        Vehicle motercycle=new MoterCycle("motercycle",125,"petrol",60);


        car.dispaly();
        truck.dispaly();
        motercycle.dispaly();
    }
}

