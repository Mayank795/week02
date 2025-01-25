package singelinheritance.smarthomedevices;

class Thermostat extends Device{
    int temperatureSetting;


    public Thermostat(String deviceId,String status,int temperatureSetting){
        super(deviceId,status);
        this.temperatureSetting=temperatureSetting;
    }


    @Override
    public void display() {
        super.display();
        System.out.println("the temperature setting is: "+temperatureSetting);
    }
}
