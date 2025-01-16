class Item  {
    //attributes
    String itemcode;
    String itemname;
    double price;
    int Quntity;


    //constructor
    Item(String itemcode,String itemname,double price,int Quntity){
        this.itemcode= itemcode;
        this.itemname= itemname;
        this.price=price;
        this.Quntity= Quntity;
    }
    // method to display
    public void display(){
        System.out.println("Itemcode "+ itemcode );
        System.out.println("Itemname "+ itemname );
        System.out.println("Total Price "+ price*Quntity );
    }

    public static void main(String[] args){
        //creating object
        Item item1 = new Item("fdh","pen",5,6);
        // Displaying details
        item1.display();



    }
}


