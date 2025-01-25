package assistedproblems.animalhierarchy;

class Dog extends Animal{
    public Dog(String name,int age){
        super(name, age);
    }


    @Override
    public void makesound() {
        System.out.println(name+ " Barks");
    }
}
