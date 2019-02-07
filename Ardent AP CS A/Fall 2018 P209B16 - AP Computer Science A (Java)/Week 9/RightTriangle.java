public class RightTriangle
{
    private double[] sidesLength = new double[2];
    private double[] angles = new double[] { 90, 60, 30 };
    
    public RightTriangle(double[] sl, double[] a)
    {
        sidesLength = sl;
        angles = a;
    }
    
    /*
    public double[] getAngles()
    {
        
        for (double d : angles)
        {
            
        }
        System.out.print(angles);
        return angles;
    }*/
}