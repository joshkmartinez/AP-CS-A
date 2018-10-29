public class Rectangle
{
    private double length;
    private double width;
    
    public Rectangle(double l, double w)
    {
        length = l;
        width = w;
    }
    
    //constructor
    public void newLength(double newLength)
    {
        length = newLength;
    }
    
    public void newWidth(double newWidth)
    {
        width = newWidth;
    }
    
    //methods
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
        return length*width;
    }
    
    public double perimeter()
    {
        return (length*2)+(width*2);
    }
}