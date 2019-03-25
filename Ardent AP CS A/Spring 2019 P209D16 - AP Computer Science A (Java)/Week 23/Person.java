public class Person
{
    // variables
    private boolean infected;
    private double immunity;  // 1.0 (immune) to 0.0 (insta-death)
    
    // constructor
    public Person( double immunity )
    {
        infected = false;
        this.immunity = immunity;
    }
    
    // methods
    public boolean infected()
    {
        return infected;
    }
    
    public void setInfected( boolean state )
    {
        infected = state;
    }
    
    public double getImmunity()
    {
        return immunity;
    }
    
    public void setImmunity( double value )
    {
        immunity = value;
    }
    
    public String toString()
    {
        String personString = "";
        personString += "This person is infected: " + infected() + "\n";
        personString += "Their immunity rating is: " + getImmunity();
        return personString;
    }
}