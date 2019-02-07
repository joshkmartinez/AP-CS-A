public class Rectangle extends Shape
{
    public double length;
    public double width;
    
    public Rectangle (double l, double w)
    {
        length = l;
        width = w;
    }
    
    public double getLength()
    {
        return length;
    }
    public double getWidth()
    {
        return width;
    }
    
    public double area()
    {
        return width*length;
    }
    
    public String toString()
    {
        return "This rectange has a length of " + getLength() + " and a width of " + getWidth();
    }
}