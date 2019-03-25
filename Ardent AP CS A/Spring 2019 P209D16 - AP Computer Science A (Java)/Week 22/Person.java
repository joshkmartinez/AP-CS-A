public class Person
{
    // variables
    private boolean infected;
    private double vulnerability;   // from 0.0 (immune) to 1.0 (insta-death)
    
    // constructor
    public Person( double v )
    {
        infected = false;
        if(!(v>1)){
            this.vulnerability = v;
        } else {
            this.vulnerability = 1;
        }
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
    
    public double getVulnerability()
    {
        return vulnerability;
    }
    
    public void setVulnerability( double value )
    {
        vulnerability = value;
    }
    
    public String toString()
    {
        String personString = "";
        if(infected){
            personString+="X";
        } else{
             personString+="0";
        }
        //personString += "This person is infected: " + infected() + "\n";
        //personString += "Their vulnerability rating is: " + getVulnerability();
        return personString;
    }
    
}