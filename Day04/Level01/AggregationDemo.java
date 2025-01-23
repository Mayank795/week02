import java.util.ArrayList;

 class book{
    String title;
    String author;

     book(String title, String author){
         this.title=title;
         this.author=author;
     }
}
 class Library{
    public String name;
    ArrayList<book> books;

   Library(String name){
       this.name=name;
       this.books=new ArrayList<>();
   }

   public void addbooks(book bookd){
    books.add(bookd);
   }

   public void showbook(){
       System.out.println("the library is "+ name+ ": ");
       for(book b : books){
           System.out.println("book's title is :"+b.title+" ,book's author is :"+b.author);
       }
   }
        }

public class AggregationDemo {
    public static void main(String[] args) {
        book b1= new book("GOT","mayank");
        book b2= new book("HOTD","parag");

        Library l1= new Library("tit");

        l1.addbooks(b1);
        l1.addbooks(b2);

        l1.showbook();
    }
}
