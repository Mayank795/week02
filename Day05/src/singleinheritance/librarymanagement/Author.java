package singelinheritance.librarymanagement;

class Author extends Book{
    String name;
    String bio;


    public Author(String title,int publicationYear,String name,String bio){
        super(title, publicationYear);
        this.bio=bio;
        this.name=name;
    }


    @Override
    public void display() {
        super.display();
        System.out.println("the author's name is: "+name+" the bio is: "+bio);
    }
}

