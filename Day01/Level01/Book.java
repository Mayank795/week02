import java.sql.SQLOutput;
 class Book  {
     //attributes
    String title;
    String author;
    double price;


    //constructor
   Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    //method to display
    public void display(){
        System.out.println("Book's title "+ title );
        System.out.println("Book's author "+ author );
        System.out.println("Book's price "+ price );
    }

    public static void main(String[] args){
       //objects
        Book book1 = new Book("GOT","mayank",5000);
        Book book2 = new Book("LOTR","parag",4000);

        book1.display();
        System.out.println();
        book2.display();
    }
}

