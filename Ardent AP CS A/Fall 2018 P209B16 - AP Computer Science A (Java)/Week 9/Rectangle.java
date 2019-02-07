public class Rectangle
{
    private double length;
    private double width;
    
    public Rectangle(double l, double w)
    {
        length = l;
        width = w;
    }
    
    public double Area()
    {
        return length*width;
    }
    
    public double length()
    {
        return length;
    }
    
    public double width()
    {
        return width;
    }
}