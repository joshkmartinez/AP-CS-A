public class Circle
{
    //global const var
    public static final double PI = 3.14159;
    
    //instance var
    private double radius;
    
    //constructor method
    public Circle()
    {  
        radius = 1.0;
    }
    
    //constructor that accpets a radius
    public Circle (double newRadius )
    {
        radius = newRadius;
    }
    
    //methods - behavior that the children will have
    public double getRadius()
    {
        return radius;
    }
    
    public void setRadius(double newRadius)
    {
        radius = newRadius;
    }
    
    public double area()
    {
        return PI*radius*radius;
    }
    
    public double circumference()
    {
        return 2*PI*radius;
    }
}