public class Circle {
    private double radius;
    public static final double pi = 3.1415;

    
    //Overloading constructor
    public Circle(double r) {
        radius = r;
    }
    
    public Circle() {
        radius = 1;
    }

    public double getArea() {
        return pi * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}