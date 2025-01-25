package assistedproblems.animalhierarchy;

class Animal{
    String name;
    int age;
    //constructor
    Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void makesound(){
        System.out.println("Animal make sound");
    }
    public void display(){
        System.out.println("Name "+name+" ,Age "+age);
    }
}

