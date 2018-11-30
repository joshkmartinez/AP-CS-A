public class Disc
{
    private double radius;
    private double height;
    private double pi = 3.14159;
    public Disc(double r, double h){
        radius = r;
        height = h;
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    public double getHeight()
    {
        return height;
    }
    
    public double getVolume()
    {
        return pi*radius*radius*height;
    }
}