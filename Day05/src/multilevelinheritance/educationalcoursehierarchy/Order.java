package multilevelinheritance.educationalcoursehierarchy;

class Order{
    String orderId;
    String orderDate;


    public Order(String orderId,String orderDate){
        this.orderDate=orderDate;
        this.orderId=orderId;
    }
    public void getOrderStatus(){
        System.out.println("order Id "+orderId+" Order date "+orderDate);
    }
}

