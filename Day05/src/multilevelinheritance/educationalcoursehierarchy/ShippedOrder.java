package multilevelinheritance.educationalcoursehierarchy;

class ShippedOrder extends Order{
    String TrackingNumber;


    public ShippedOrder(String orderId,String orderDate,String TrackingNumber){
        super(orderId, orderDate);
        this.TrackingNumber=TrackingNumber;
    }


    @Override
    public void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Tracking number is: "+TrackingNumber);
    }
}

