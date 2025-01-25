package assistedproblems.animalhierarchy;

public class AnimalHierarchy{
    public static void main(String[] args) {
        Animal dog = new Dog("janjer",9);
        Animal cat = new Cat("billi",6);
        Animal bird = new Bird("Koyal",3);
        dog.display();
        dog.makesound();


        cat.display();
        cat.makesound();


        bird.display();
        bird.makesound();
    }


}

