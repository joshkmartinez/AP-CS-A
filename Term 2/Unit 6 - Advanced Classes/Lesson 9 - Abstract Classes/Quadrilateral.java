public class Quadrilateral

{
    private int side1;
    private int side2;
    private int side3;
    private int side4;
    
    public Quadrilateral(int a, int b, int c, int d)
    {
        side1=a;
        side2=b;
        side3=c;
        side4=d;
    }
    
    public int getPerimeter()
    {
        return side1 + side2 + side3 + side4;
    }
    
    public int getSide1()
    {
        return side1;
    }
    
    public int getSide2()
    {
        return side2;
    }
    
    public int getSide3()
    {
        return side3;
    }
    
    public int getSide4()
    {
        return side4;
    }
}