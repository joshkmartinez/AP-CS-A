public class Box extends Rectangle
{
    private double height;
    
    public Box(double l, double w, double h)
    {
        super (l, w);
        height = h;
    }
    
    public double volume ()
    {
        return super.area()*height;
    }
    
    public String toString()
    {
        return "This Box has a volume of " + volume();
    }
}