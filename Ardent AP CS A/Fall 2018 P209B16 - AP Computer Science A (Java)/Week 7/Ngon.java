public class Ngon
{
    private int sides; 
    private double sidesLength;
    
    public Ngon(int sides, double sidesLength)
    {
        sides = sides; //has to be greater than 2
        sidesLength = sidesLength;
    }
    
    public void setSides(int s)
    {
        sides = s;
    }
    
    public void setSidesLength(int l)
    {
        sidesLength = l;
    }
    
    public int getSides()
    {
        return sides;
    }
    
    public double getSidesLength()
    {
        return sidesLength;
    }
    
    public double sumOfInteriorAngles()
    {
        return (sides - 2) * 180;
    }
}