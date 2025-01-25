package assistedproblems.animalhierarchy;

class Bird extends Animal{
    public Bird(String name,int age){
        super(name, age);
    }
    public void makesound(){
        System.out.println(name+ "chip chip");
    }


}
