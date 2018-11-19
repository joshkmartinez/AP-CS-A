public class Disc extends Circle
{
    private double height;
    public Disc (double h, double r)
    {
        super(r);
        height = h;
    }
    
    public void setHeight(double h)
    {
        this.height = h;
    }
    
    public double getVolume()
    {
        return super.area()*height;
    }
    
    public String toString()
    {
        return "This disc has a radius of " + super.getRadius() + " and a volume of " +getVolume(); 
    }
}