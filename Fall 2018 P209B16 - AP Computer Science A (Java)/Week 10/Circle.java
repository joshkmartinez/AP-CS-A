//import java.util.Random;

public class Circle extends Shape{
    public double radius;
    public static final double pi = 3.1415;
    //Random rand = new Random();
    
    //Overloading constructor
    public Circle(double r) {
        radius = r;
    }
    
    public Circle() {
        radius = 1;
    }
    
    /*
    //define a random radius if passed a string
    public Circle( String s ) {
        radius = rand.nextDouble();
    }
    */

    public void setRadius(double r) {
        radius = r; 
    }
   
    public double getArea() {
        return pi * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
    
    public double area() {
        return pi*radius*radius;
    }
    
    public String toString()
    {
        return "This circle has a radius of " + radius + " and an area of " + getArea();
    }
}
