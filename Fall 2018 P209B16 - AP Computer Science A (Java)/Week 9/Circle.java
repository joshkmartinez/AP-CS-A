public class Circle
{
    private double radius;
    private double pi = 3.1415;
    
    public Circle (double r)
    {
        radius = r;
    }
    
    public double getArea()
    {
        return pi * radius * radius;
    }
    
    public double getRadius()
    {
        return radius;
    }
}