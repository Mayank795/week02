package multilevelinheritance.educationalcoursehierarchy;

class DeliveredOrder extends ShippedOrder{
    String deliveryDate;


    public DeliveredOrder(String orderId,String orderDate,String TrackingNumber,String deliveryDate){
        super(orderId, orderDate,TrackingNumber);
        this.deliveryDate=deliveryDate;
    }


    @Override
    public void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("delivery Date: "+deliveryDate);
    }
}

