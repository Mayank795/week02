package singelinheritance.smarthomedevices;
class Device{
    String deviceId;
    String status;


    public Device(String deviceId,String status){
        this.deviceId=deviceId;
        this.status=status;
    }


    public void display(){
        System.out.println("device id is: "+deviceId+" Status of device is: "+status);
    }
}
