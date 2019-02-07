//Hockey Puck
public class Puck extends Disc
{
    public static final double radius = 1.5;
    public static final double height = 1;
    private double weight;
    
    public Puck ( double w){
        super(radius,height);
        this.weight = w;
       
    }
    
    public double getWeight()
    {
        return weight;
    }
    
    public void setWeight(double w)
    {
        weight = w;
    }
    
    public String toString()
    {
        return "This hockey puck has a weight of " + weight;
    }
}