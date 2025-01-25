package singelinheritance.librarymanagement;

class Book{
    String title;
    int publicationYear;


    public Book(String title,int publicationYear){
        this.publicationYear=publicationYear;
        this.title=title;
    }


    public void display(){
        System.out.println("title of this book: "+title+" and the publication date is: "+publicationYear);
    }
}

