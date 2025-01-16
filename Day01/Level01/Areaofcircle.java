import java.sql.SQLOutput;

public class Areaofcircle {
    double raidus;

    //constructor
    Areaofcircle(double raidus){
        this.raidus=raidus;
    }

    //method to calculate area
    public double area(){
        return Math.PI* raidus* raidus;
    }

    //method to calculate circumference
    public double circumference(){
        return 2* Math.PI*raidus;
    }

    public void display(){
        System.out.println("radius "+ raidus );
        System.out.println("area of circle "+ area() );
        System.out.println("circumference of circle "+ circumference() );
    }

    public static void main(String[] args){
        Areaofcircle circle = new Areaofcircle(6.6);
        circle.display();
    }
}
